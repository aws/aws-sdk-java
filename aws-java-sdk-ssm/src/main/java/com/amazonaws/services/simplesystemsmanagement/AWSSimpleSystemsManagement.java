/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.simplesystemsmanagement.waiters.AWSSimpleSystemsManagementWaiters;

/**
 * Interface for accessing Amazon SSM.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simplesystemsmanagement.AbstractAWSSimpleSystemsManagement} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services Systems Manager is a collection of capabilities that helps you automate management tasks such as
 * collecting system inventory, applying operating system (OS) patches, automating the creation of Amazon Machine Images
 * (AMIs), and configuring operating systems (OSs) and applications at scale. Systems Manager lets you remotely and
 * securely manage the configuration of your managed instances. A <i>managed instance</i> is any Amazon Elastic Compute
 * Cloud instance (EC2 instance), or any on-premises server or virtual machine (VM) in your hybrid environment that has
 * been configured for Systems Manager.
 * </p>
 * <p>
 * This reference is intended to be used with the <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/">Amazon Web Services Systems Manager User
 * Guide</a>.
 * </p>
 * <p>
 * To get started, verify prerequisites and configure managed instances. For more information, see <a
 * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-setting-up.html">Setting up Amazon
 * Web Services Systems Manager</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
 * </p>
 * <p class="title">
 * <b>Related resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * For information about how to use a Query API, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/making-api-requests.html">Making API requests</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about other API operations you can perform on EC2 instances, see the <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/">Amazon EC2 API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about AppConfig, a capability of Systems Manager, see the <a
 * href="https://docs.aws.amazon.com/appconfig/latest/userguide/">AppConfig User Guide</a> and the <a
 * href="https://docs.aws.amazon.com/appconfig/2019-10-09/APIReference/">AppConfig API Reference</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about Incident Manager, a capability of Systems Manager, see the <a
 * href="https://docs.aws.amazon.com/incident-manager/latest/userguide/">Incident Manager User Guide</a> and the <a
 * href="https://docs.aws.amazon.com/incident-manager/latest/APIReference/">Incident Manager API Reference</a>.
 * </p>
 * </li>
 * </ul>
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
     * documents, managed instances, maintenance windows, Parameter Store parameters, and patch baselines. Tags enable
     * you to categorize your resources in different ways, for example, by purpose, owner, or environment. Each tag
     * consists of a key and an optional value, both of which you define. For example, you could define a set of tags
     * for your account's managed instances that helps you track each instance's owner and stack level. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=Owner,Value=DbAdmin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Owner,Value=SysAdmin</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Owner,Value=Dev</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Stack,Value=Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Stack,Value=Pre-Production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=Stack,Value=Test</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each resource can have a maximum of 50 tags.
     * </p>
     * <p>
     * We recommend that you devise a set of tag keys that meets your needs for each resource type. Using a consistent
     * set of tag keys makes it easier for you to manage your resources. You can search and filter the resources based
     * on the tags you add. Tags don't have any semantic meaning to and are interpreted strictly as a string of
     * characters.
     * </p>
     * <p>
     * For more information about using tags with Amazon Elastic Compute Cloud (Amazon EC2) instances, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html">Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type isn't valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyTagsErrorException
     *         The <code>Targets</code> parameter includes too many tags. Remove one or more tags and try the command
     *         again.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.AddTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AddTagsToResource" target="_top">AWS API
     *      Documentation</a>
     */
    AddTagsToResourceResult addTagsToResource(AddTagsToResourceRequest addTagsToResourceRequest);

    /**
     * <p>
     * Associates a related resource to a Systems Manager OpsCenter OpsItem. For example, you can associate an Incident
     * Manager incident or analysis with an OpsItem. Incident Manager is a capability of Amazon Web Services Systems
     * Manager.
     * </p>
     * 
     * @param associateOpsItemRelatedItemRequest
     * @return Result of the AssociateOpsItemRelatedItem operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemNotFoundException
     *         The specified OpsItem ID doesn't exist. Verify the ID and try again.
     * @throws OpsItemLimitExceededException
     *         The request caused OpsItems to exceed one or more quotas. For information about OpsItem quotas, see <a
     *         href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-learn-more.html#OpsCenter-learn-more-limits"
     *         >What are the resource limits for OpsCenter?</a>.
     * @throws OpsItemInvalidParameterException
     *         A specified parameter argument isn't valid. Verify the available arguments and try again.
     * @throws OpsItemRelatedItemAlreadyExistsException
     *         The Amazon Resource Name (ARN) is already associated with the OpsItem.
     * @sample AWSSimpleSystemsManagement.AssociateOpsItemRelatedItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociateOpsItemRelatedItem"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateOpsItemRelatedItemResult associateOpsItemRelatedItem(AssociateOpsItemRelatedItemRequest associateOpsItemRelatedItemRequest);

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
     *         The specified command ID isn't valid. Verify the ID and try again.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws DuplicateInstanceIdException
     *         You can't specify an instance ID in more than one association.
     * @sample AWSSimpleSystemsManagement.CancelCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelCommand" target="_top">AWS API
     *      Documentation</a>
     */
    CancelCommandResult cancelCommand(CancelCommandRequest cancelCommandRequest);

    /**
     * <p>
     * Stops a maintenance window execution that is already in progress and cancels any tasks in the window that haven't
     * already starting running. Tasks already in progress will continue to completion.
     * </p>
     * 
     * @param cancelMaintenanceWindowExecutionRequest
     * @return Result of the CancelMaintenanceWindowExecution operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @sample AWSSimpleSystemsManagement.CancelMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CancelMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    CancelMaintenanceWindowExecutionResult cancelMaintenanceWindowExecution(CancelMaintenanceWindowExecutionRequest cancelMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Generates an activation code and activation ID you can use to register your on-premises server or virtual machine
     * (VM) with Amazon Web Services Systems Manager. Registering these machines with Systems Manager makes it possible
     * to manage them using Systems Manager capabilities. You use the activation code and ID when installing SSM Agent
     * on machines in your hybrid environment. For more information about requirements for managing on-premises
     * instances and VMs using Systems Manager, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances.html">Setting
     * up Amazon Web Services Systems Manager for hybrid environments</a> in the <i>Amazon Web Services Systems Manager
     * User Guide</i>.
     * </p>
     * <note>
     * <p>
     * On-premises servers or VMs that are registered with Systems Manager and Amazon Elastic Compute Cloud (Amazon EC2)
     * instances that you manage with Systems Manager are all called <i>managed instances</i>.
     * </p>
     * </note>
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
     * A State Manager association defines the state that you want to maintain on your instances. For example, an
     * association can specify that anti-virus software must be installed and running on your instances, or that certain
     * ports must be closed. For static targets, the association specifies a schedule for when the configuration is
     * reapplied. For dynamic targets, such as an Amazon Web Services resource group or an Amazon Web Services
     * autoscaling group, State Manager, a capability of Amazon Web Services Systems Manager applies the configuration
     * when new instances are added to the group. The association also specifies actions to take when applying the
     * configuration. For example, an association for anti-virus software might run once a day. If the software isn't
     * installed, then State Manager installs it. If the software is installed, but the service isn't running, then the
     * association might instruct State Manager to start the service.
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
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws UnsupportedPlatformTypeException
     *         The document doesn't support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidOutputLocationException
     *         The output location isn't valid or doesn't exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Amazon Web Services Systems Manager document
     *         (SSM document). You can only supply values to parameters defined in the SSM document.
     * @throws InvalidTargetException
     *         The target isn't valid or doesn't exist. It might not be configured for Systems Manager or you might not
     *         have permission to perform the operation.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @sample AWSSimpleSystemsManagement.CreateAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssociationResult createAssociation(CreateAssociationRequest createAssociationRequest);

    /**
     * <p>
     * Associates the specified Amazon Web Services Systems Manager document (SSM document) with the specified instances
     * or targets.
     * </p>
     * <p>
     * When you associate a document with one or more instances using instance IDs or tags, Amazon Web Services Systems
     * Manager Agent (SSM Agent) running on the instance processes the document and configures the instance as
     * specified.
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
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Amazon Web Services Systems Manager document
     *         (SSM document). You can only supply values to parameters defined in the SSM document.
     * @throws DuplicateInstanceIdException
     *         You can't specify an instance ID in more than one association.
     * @throws AssociationLimitExceededException
     *         You can have at most 2,000 active associations.
     * @throws UnsupportedPlatformTypeException
     *         The document doesn't support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws InvalidOutputLocationException
     *         The output location isn't valid or doesn't exist.
     * @throws InvalidTargetException
     *         The target isn't valid or doesn't exist. It might not be configured for Systems Manager or you might not
     *         have permission to perform the operation.
     * @throws InvalidScheduleException
     *         The schedule is invalid. Verify your cron or rate expression and try again.
     * @sample AWSSimpleSystemsManagement.CreateAssociationBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateAssociationBatch" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAssociationBatchResult createAssociationBatch(CreateAssociationBatchRequest createAssociationBatchRequest);

    /**
     * <p>
     * Creates a Amazon Web Services Systems Manager (SSM document). An SSM document defines the actions that Systems
     * Manager performs on your managed instances. For more information about SSM documents, including information about
     * supported schemas, features, and syntax, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html">Amazon Web Services
     * Systems Manager Documents</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
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
     *         The content for the document isn't valid.
     * @throws DocumentLimitExceededException
     *         You can have at most 500 active SSM documents.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema isn't supported.
     * @sample AWSSimpleSystemsManagement.CreateDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateDocument" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDocumentResult createDocument(CreateDocumentRequest createDocumentRequest);

    /**
     * <p>
     * Creates a new maintenance window.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based
     * on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the
     * number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the
     * duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window
     * tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param createMaintenanceWindowRequest
     * @return Result of the CreateMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource quotas. For example, too many
     *         maintenance windows or patch baselines have been created.</p>
     *         <p>
     *         For information about resource quotas in Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    CreateMaintenanceWindowResult createMaintenanceWindow(CreateMaintenanceWindowRequest createMaintenanceWindowRequest);

    /**
     * <p>
     * Creates a new OpsItem. You must have permission in Identity and Access Management (IAM) to create a new OpsItem.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use Amazon Web Services Systems Manager OpsCenter to view, investigate,
     * and remediate operational issues impacting the performance and health of their Amazon Web Services resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">Amazon Web Services Systems
     * Manager OpsCenter</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param createOpsItemRequest
     * @return Result of the CreateOpsItem operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemAlreadyExistsException
     *         The OpsItem already exists.
     * @throws OpsItemLimitExceededException
     *         The request caused OpsItems to exceed one or more quotas. For information about OpsItem quotas, see <a
     *         href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-learn-more.html#OpsCenter-learn-more-limits"
     *         >What are the resource limits for OpsCenter?</a>.
     * @throws OpsItemInvalidParameterException
     *         A specified parameter argument isn't valid. Verify the available arguments and try again.
     * @sample AWSSimpleSystemsManagement.CreateOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    CreateOpsItemResult createOpsItem(CreateOpsItemRequest createOpsItemRequest);

    /**
     * <p>
     * If you create a new application in Application Manager, Amazon Web Services Systems Manager calls this API
     * operation to specify information about the new application, including the application type.
     * </p>
     * 
     * @param createOpsMetadataRequest
     * @return Result of the CreateOpsMetadata operation returned by the service.
     * @throws OpsMetadataAlreadyExistsException
     *         An OpsMetadata object already exists for the selected resource.
     * @throws OpsMetadataTooManyUpdatesException
     *         The system is processing too many concurrent updates. Wait a few moments and try again.
     * @throws OpsMetadataInvalidArgumentException
     *         One of the arguments passed is invalid.
     * @throws OpsMetadataLimitExceededException
     *         Your account reached the maximum number of OpsMetadata objects allowed by Application Manager. The
     *         maximum is 200 OpsMetadata objects. Delete one or more OpsMetadata object and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreateOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreateOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    CreateOpsMetadataResult createOpsMetadata(CreateOpsMetadataRequest createOpsMetadataRequest);

    /**
     * <p>
     * Creates a patch baseline.
     * </p>
     * <note>
     * <p>
     * For information about valid key-value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a>PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param createPatchBaselineRequest
     * @return Result of the CreatePatchBaseline operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource quotas. For example, too many
     *         maintenance windows or patch baselines have been created.</p>
     *         <p>
     *         For information about resource quotas in Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.CreatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/CreatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePatchBaselineResult createPatchBaseline(CreatePatchBaselineRequest createPatchBaselineRequest);

    /**
     * <p>
     * A resource data sync helps you view data from multiple sources in a single location. Amazon Web Services Systems
     * Manager offers two types of resource data sync: <code>SyncToDestination</code> and <code>SyncFromSource</code>.
     * </p>
     * <p>
     * You can configure Systems Manager Inventory to use the <code>SyncToDestination</code> type to synchronize
     * Inventory data from multiple Regions to a single Amazon Simple Storage Service (Amazon S3) bucket. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-inventory-datasync.html">Configuring
     * resource data sync for Inventory</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * <p>
     * You can configure Systems Manager Explorer to use the <code>SyncFromSource</code> type to synchronize operational
     * work items (OpsItems) and operational data (OpsData) from multiple Regions to a single Amazon S3 bucket. This
     * type can synchronize OpsItems and OpsData from multiple accounts and Regions or <code>EntireOrganization</code>
     * by using Organizations. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/Explorer-resource-data-sync.html">Setting up
     * Systems Manager Explorer to display data from multiple accounts and Regions</a> in the <i>Amazon Web Services
     * Systems Manager User Guide</i>.
     * </p>
     * <p>
     * A resource data sync is an asynchronous operation that returns immediately. After a successful initial sync is
     * completed, the system continuously syncs data. To check the status of a sync, use the
     * <a>ListResourceDataSync</a>.
     * </p>
     * <note>
     * <p>
     * By default, data isn't encrypted in Amazon S3. We strongly recommend that you enable encryption in Amazon S3 to
     * ensure secure data storage. We also recommend that you secure access to the Amazon S3 bucket by creating a
     * restrictive bucket policy.
     * </p>
     * </note>
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
     * Deletes an activation. You aren't required to delete an activation. If you delete an activation, you can no
     * longer use it to register additional managed instances. Deleting an activation doesn't de-register managed
     * instances. You must manually de-register managed instances.
     * </p>
     * 
     * @param deleteActivationRequest
     * @return Result of the DeleteActivation operation returned by the service.
     * @throws InvalidActivationIdException
     *         The activation ID isn't valid. Verify the you entered the correct ActivationId or ActivationCode and try
     *         again.
     * @throws InvalidActivationException
     *         The activation isn't valid. The activation might have been deleted, or the ActivationId and the
     *         ActivationCode don't match.
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
     * Disassociates the specified Amazon Web Services Systems Manager document (SSM document) from the specified
     * instance.
     * </p>
     * <p>
     * When you disassociate a document from an instance, it doesn't change the configuration of the instance. To change
     * the configuration state of an instance after you disassociate a document, you must create a new document with the
     * desired configuration and associate it with the instance.
     * </p>
     * 
     * @param deleteAssociationRequest
     * @return Result of the DeleteAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @sample AWSSimpleSystemsManagement.DeleteAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAssociationResult deleteAssociation(DeleteAssociationRequest deleteAssociationRequest);

    /**
     * <p>
     * Deletes the Amazon Web Services Systems Manager document (SSM document) and all instance associations to the
     * document.
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
     *         The specified SSM document doesn't exist.
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
     * Delete a custom inventory type or the data associated with a custom Inventory type. Deleting a custom inventory
     * type is also referred to as deleting a custom inventory schema.
     * </p>
     * 
     * @param deleteInventoryRequest
     * @return Result of the DeleteInventory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidTypeNameException
     *         The parameter type name isn't valid.
     * @throws InvalidOptionException
     *         The delete inventory option specified isn't valid. Verify the option and try again.
     * @throws InvalidDeleteInventoryParametersException
     *         One or more of the parameters specified for the delete operation isn't valid. Verify all parameters and
     *         try again.
     * @throws InvalidInventoryRequestException
     *         The request isn't valid.
     * @sample AWSSimpleSystemsManagement.DeleteInventory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteInventory" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInventoryResult deleteInventory(DeleteInventoryRequest deleteInventoryRequest);

    /**
     * <p>
     * Deletes a maintenance window.
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
     * Delete OpsMetadata related to an application.
     * </p>
     * 
     * @param deleteOpsMetadataRequest
     * @return Result of the DeleteOpsMetadata operation returned by the service.
     * @throws OpsMetadataNotFoundException
     *         The OpsMetadata object doesn't exist.
     * @throws OpsMetadataInvalidArgumentException
     *         One of the arguments passed is invalid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DeleteOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteOpsMetadataResult deleteOpsMetadata(DeleteOpsMetadataRequest deleteOpsMetadataRequest);

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
     *         The parameter couldn't be found. Verify the name and try again.
     * @sample AWSSimpleSystemsManagement.DeleteParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DeleteParameter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteParameterResult deleteParameter(DeleteParameterRequest deleteParameterRequest);

    /**
     * <p>
     * Delete a list of parameters.
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
     * Deletes a resource data sync configuration. After the configuration is deleted, changes to data on managed
     * instances are no longer synced to or from the target. Deleting a sync configuration doesn't delete data.
     * </p>
     * 
     * @param deleteResourceDataSyncRequest
     * @return Result of the DeleteResourceDataSync operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceDataSyncNotFoundException
     *         The specified sync name wasn't found.
     * @throws ResourceDataSyncInvalidConfigurationException
     *         The specified sync configuration is invalid.
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
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
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
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
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
     * Removes a target from a maintenance window.
     * </p>
     * 
     * @param deregisterTargetFromMaintenanceWindowRequest
     * @return Result of the DeregisterTargetFromMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * Removes a task from a maintenance window.
     * </p>
     * 
     * @param deregisterTaskFromMaintenanceWindowRequest
     * @return Result of the DeregisterTaskFromMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * Describes details about the activation, such as the date and time the activation was created, its expiration
     * date, the Identity and Access Management (IAM) role assigned to the instances in the activation, and the number
     * of instances registered by using this activation.
     * </p>
     * 
     * @param describeActivationsRequest
     * @return Result of the DescribeActivations operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     * created the association by specifying an instance ID and an Amazon Web Services Systems Manager document (SSM
     * document), then you retrieve the association by specifying the document name and the instance ID.
     * </p>
     * 
     * @param describeAssociationRequest
     * @return Result of the DescribeAssociation operation returned by the service.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @throws InvalidAssociationVersionException
     *         The version you specified isn't valid. Use ListAssociationVersions to view all versions of an association
     *         according to the association ID. Or, use the <code>$LATEST</code> parameter to view the latest version of
     *         the association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @sample AWSSimpleSystemsManagement.DescribeAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociation" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAssociationResult describeAssociation(DescribeAssociationRequest describeAssociationRequest);

    /**
     * <p>
     * Views information about a specific execution of a specific association.
     * </p>
     * 
     * @param describeAssociationExecutionTargetsRequest
     * @return Result of the DescribeAssociationExecutionTargets operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws AssociationExecutionDoesNotExistException
     *         The specified execution ID doesn't exist. Verify the ID number and try again.
     * @sample AWSSimpleSystemsManagement.DescribeAssociationExecutionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAssociationExecutionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAssociationExecutionTargetsResult describeAssociationExecutionTargets(
            DescribeAssociationExecutionTargetsRequest describeAssociationExecutionTargetsRequest);

    /**
     * <p>
     * Views all executions for a specific association ID.
     * </p>
     * 
     * @param describeAssociationExecutionsRequest
     * @return Result of the DescribeAssociationExecutions operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     *         The specified key isn't valid.
     * @throws InvalidFilterValueException
     *         The filter value isn't valid. Verify the value and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     *         The specified token isn't valid.
     * @throws InvalidFilterKeyException
     *         The specified key isn't valid.
     * @throws InvalidFilterValueException
     *         The filter value isn't valid. Verify the value and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeAutomationStepExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeAutomationStepExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAutomationStepExecutionsResult describeAutomationStepExecutions(DescribeAutomationStepExecutionsRequest describeAutomationStepExecutionsRequest);

    /**
     * <p>
     * Lists all patches eligible to be included in a patch baseline.
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
     * Describes the specified Amazon Web Services Systems Manager document (SSM document).
     * </p>
     * 
     * @param describeDocumentRequest
     * @return Result of the DescribeDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @sample AWSSimpleSystemsManagement.DescribeDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeDocument" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDocumentResult describeDocument(DescribeDocumentRequest describeDocumentRequest);

    /**
     * <p>
     * Describes the permissions for a Amazon Web Services Systems Manager document (SSM document). If you created the
     * document, you are the owner. If a document is shared, it can either be shared privately (by specifying a user's
     * account ID) or publicly (<i>All</i>).
     * </p>
     * 
     * @param describeDocumentPermissionRequest
     * @return Result of the DescribeDocumentPermission operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InvalidPermissionTypeException
     *         The permission type isn't supported. <i>Share</i> is the only supported permission type.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You must stop sharing the document before
     *         you can delete it.
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
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.DescribeEffectiveInstanceAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeEffectiveInstanceAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEffectiveInstanceAssociationsResult describeEffectiveInstanceAssociations(
            DescribeEffectiveInstanceAssociationsRequest describeEffectiveInstanceAssociationsRequest);

    /**
     * <p>
     * Retrieves the current effective patches (the patch and the approval state) for the specified patch baseline.
     * Applies to patch baselines for Windows only.
     * </p>
     * 
     * @param describeEffectivePatchesForPatchBaselineRequest
     * @return Result of the DescribeEffectivePatchesForPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws UnsupportedOperatingSystemException
     *         The operating systems you specified isn't supported, or the operation isn't supported for the operating
     *         system.
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
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.DescribeInstanceAssociationsStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceAssociationsStatus"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeInstanceAssociationsStatusResult describeInstanceAssociationsStatus(
            DescribeInstanceAssociationsStatusRequest describeInstanceAssociationsStatusRequest);

    /**
     * <p>
     * Describes one or more of your instances, including information about the operating system platform, the version
     * of SSM Agent installed on the instance, instance status, and so on.
     * </p>
     * <p>
     * If you specify one or more instance IDs, it returns information for those instances. If you don't specify
     * instance IDs, it returns information for all your instances. If you specify an instance ID that isn't valid or an
     * instance that you don't own, you receive an error.
     * </p>
     * <note>
     * <p>
     * The <code>IamRole</code> field for this API operation is the Identity and Access Management (IAM) role assigned
     * to on-premises instances. This call doesn't return the IAM role for EC2 instances.
     * </p>
     * </note>
     * 
     * @param describeInstanceInformationRequest
     * @return Result of the DescribeInstanceInformation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InvalidInstanceInformationFilterValueException
     *         The specified filter value isn't valid.
     * @throws InvalidFilterKeyException
     *         The specified key isn't valid.
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
     *         The specified token isn't valid.
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
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidFilterException
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     *         The ID specified for the delete operation doesn't exist or isn't valid. Verify the ID and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.DescribeInventoryDeletions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInventoryDeletions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeInventoryDeletionsResult describeInventoryDeletions(DescribeInventoryDeletionsRequest describeInventoryDeletionsRequest);

    /**
     * <p>
     * Retrieves the individual task executions (one per target) for a particular task run as part of a maintenance
     * window execution.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTaskInvocationsRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTaskInvocations operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * For a given maintenance window execution, lists the tasks that were run.
     * </p>
     * 
     * @param describeMaintenanceWindowExecutionTasksRequest
     * @return Result of the DescribeMaintenanceWindowExecutionTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * Lists the executions of a maintenance window. This includes information about when the maintenance window was
     * scheduled to be active, and information about tasks registered and run with the maintenance window.
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
     * Retrieves information about upcoming executions of a maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowScheduleRequest
     * @return Result of the DescribeMaintenanceWindowSchedule operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowSchedule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowSchedule"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowScheduleResult describeMaintenanceWindowSchedule(DescribeMaintenanceWindowScheduleRequest describeMaintenanceWindowScheduleRequest);

    /**
     * <p>
     * Lists the targets registered with the maintenance window.
     * </p>
     * 
     * @param describeMaintenanceWindowTargetsRequest
     * @return Result of the DescribeMaintenanceWindowTargets operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowTargetsResult describeMaintenanceWindowTargets(DescribeMaintenanceWindowTargetsRequest describeMaintenanceWindowTargetsRequest);

    /**
     * <p>
     * Lists the tasks in a maintenance window.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a specified target, you can't supply values for <code>--max-errors</code>
     * and <code>--max-concurrency</code>. Instead, the system inserts a placeholder value of <code>1</code>, which may
     * be reported in the response to this command. These values don't affect the running of your task and can be
     * ignored.
     * </p>
     * </note>
     * 
     * @param describeMaintenanceWindowTasksRequest
     * @return Result of the DescribeMaintenanceWindowTasks operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeMaintenanceWindowTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeMaintenanceWindowTasks"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMaintenanceWindowTasksResult describeMaintenanceWindowTasks(DescribeMaintenanceWindowTasksRequest describeMaintenanceWindowTasksRequest);

    /**
     * <p>
     * Retrieves the maintenance windows in an account.
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
     * Retrieves information about the maintenance window targets or tasks that an instance is associated with.
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
     * Query a set of OpsItems. You must have permission in Identity and Access Management (IAM) to query a list of
     * OpsItems. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use Amazon Web Services Systems Manager OpsCenter to view, investigate,
     * and remediate operational issues impacting the performance and health of their Amazon Web Services resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">OpsCenter</a> in the <i>Amazon
     * Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param describeOpsItemsRequest
     * @return Result of the DescribeOpsItems operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribeOpsItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeOpsItems" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeOpsItemsResult describeOpsItems(DescribeOpsItemsRequest describeOpsItemsRequest);

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
     *         The specified key isn't valid.
     * @throws InvalidFilterOptionException
     *         The specified filter option isn't valid. Valid options are Equals and BeginsWith. For Path filter, valid
     *         options are Recursive and OneLevel.
     * @throws InvalidFilterValueException
     *         The filter value isn't valid. Verify the value and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.DescribeParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeParameters" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeParametersResult describeParameters(DescribeParametersRequest describeParametersRequest);

    /**
     * <p>
     * Lists the patch baselines in your account.
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
     * Returns high-level aggregated patch compliance state information for a patch group.
     * </p>
     * 
     * @param describePatchGroupStateRequest
     * @return Result of the DescribePatchGroupState operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     * Lists the properties of available patches organized by product, product family, classification, severity, and
     * other properties of available patches. You can use the reported properties in the filters you specify in requests
     * for operations such as <a>CreatePatchBaseline</a>, <a>UpdatePatchBaseline</a>, <a>DescribeAvailablePatches</a>,
     * and <a>DescribePatchBaselines</a>.
     * </p>
     * <p>
     * The following section lists the properties that can be used in filters for each major operating system type:
     * </p>
     * <dl>
     * <dt>AMAZON_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code> | <code>SEVERITY</code>
     * </p>
     * </dd>
     * <dt>AMAZON_LINUX_2</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code> | <code>SEVERITY</code>
     * </p>
     * </dd>
     * <dt>CENTOS</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code> | <code>SEVERITY</code>
     * </p>
     * </dd>
     * <dt>DEBIAN</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>PRIORITY</code>
     * </p>
     * </dd>
     * <dt>MACOS</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code>
     * </p>
     * </dd>
     * <dt>ORACLE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code> | <code>SEVERITY</code>
     * </p>
     * </dd>
     * <dt>REDHAT_ENTERPRISE_LINUX</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code> | <code>SEVERITY</code>
     * </p>
     * </dd>
     * <dt>SUSE</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>CLASSIFICATION</code> | <code>SEVERITY</code>
     * </p>
     * </dd>
     * <dt>UBUNTU</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>PRIORITY</code>
     * </p>
     * </dd>
     * <dt>WINDOWS</dt>
     * <dd>
     * <p>
     * Valid properties: <code>PRODUCT</code> | <code>PRODUCT_FAMILY</code> | <code>CLASSIFICATION</code> |
     * <code>MSRC_SEVERITY</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param describePatchPropertiesRequest
     * @return Result of the DescribePatchProperties operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.DescribePatchProperties
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribePatchProperties" target="_top">AWS
     *      API Documentation</a>
     */
    DescribePatchPropertiesResult describePatchProperties(DescribePatchPropertiesRequest describePatchPropertiesRequest);

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
     *         The specified key isn't valid.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.DescribeSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeSessions" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSessionsResult describeSessions(DescribeSessionsRequest describeSessionsRequest);

    /**
     * <p>
     * Deletes the association between an OpsItem and a related resource. For example, this API operation can delete an
     * Incident Manager incident from an OpsItem. Incident Manager is a capability of Amazon Web Services Systems
     * Manager.
     * </p>
     * 
     * @param disassociateOpsItemRelatedItemRequest
     * @return Result of the DisassociateOpsItemRelatedItem operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemRelatedItemAssociationNotFoundException
     *         The association wasn't found using the parameters you specified in the call. Verify the information and
     *         try again.
     * @throws OpsItemNotFoundException
     *         The specified OpsItem ID doesn't exist. Verify the ID and try again.
     * @throws OpsItemInvalidParameterException
     *         A specified parameter argument isn't valid. Verify the available arguments and try again.
     * @sample AWSSimpleSystemsManagement.DisassociateOpsItemRelatedItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DisassociateOpsItemRelatedItem"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateOpsItemRelatedItemResult disassociateOpsItemRelatedItem(DisassociateOpsItemRelatedItemRequest disassociateOpsItemRelatedItemRequest);

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
     * Gets the state of a Amazon Web Services Systems Manager change calendar at the current time or a specified time.
     * If you specify a time, <code>GetCalendarState</code> returns the state of the calendar at that specific time, and
     * returns the next time that the change calendar state will transition. If you don't specify a time,
     * <code>GetCalendarState</code> uses the current time. Change Calendar entries have two possible states:
     * <code>OPEN</code> or <code>CLOSED</code>.
     * </p>
     * <p>
     * If you specify more than one calendar in a request, the command returns the status of <code>OPEN</code> only if
     * all calendars in the request are open. If one or more calendars in the request are closed, the status returned is
     * <code>CLOSED</code>.
     * </p>
     * <p>
     * For more information about Change Calendar, a capability of Amazon Web Services Systems Manager, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar.html">Amazon
     * Web Services Systems Manager Change Calendar</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param getCalendarStateRequest
     * @return Result of the GetCalendarState operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentTypeException
     *         The SSM document type isn't valid. Valid document types are described in the <code>DocumentType</code>
     *         property.
     * @throws UnsupportedCalendarException
     *         The calendar entry contained in the specified SSM document isn't supported.
     * @sample AWSSimpleSystemsManagement.GetCalendarState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCalendarState" target="_top">AWS API
     *      Documentation</a>
     */
    GetCalendarStateResult getCalendarState(GetCalendarStateRequest getCalendarStateRequest);

    /**
     * <p>
     * Returns detailed information about command execution for an invocation or plugin.
     * </p>
     * <p>
     * <code>GetCommandInvocation</code> only gives the execution status of a plugin in a document. To get the command
     * execution status on a specific instance, use <a>ListCommandInvocations</a>. To get the command execution status
     * across instances, use <a>ListCommands</a>.
     * </p>
     * 
     * @param getCommandInvocationRequest
     * @return Result of the GetCommandInvocation operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     *         The specified command ID isn't valid. Verify the ID and try again.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidPluginNameException
     *         The plugin name isn't valid.
     * @throws InvocationDoesNotExistException
     *         The command ID and instance ID you specified didn't match any invocations. Verify the command ID and the
     *         instance ID and try again.
     * @sample AWSSimpleSystemsManagement.GetCommandInvocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetCommandInvocation" target="_top">AWS API
     *      Documentation</a>
     */
    GetCommandInvocationResult getCommandInvocation(GetCommandInvocationRequest getCommandInvocationRequest);

    /**
     * <p>
     * Retrieves the Session Manager connection status for an instance to determine whether it is running and ready to
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
     * Retrieves the default patch baseline. Amazon Web Services Systems Manager supports creating multiple default
     * patch baselines. For example, you can create a default patch baseline for each operating system.
     * </p>
     * <p>
     * If you don't specify an operating system value, the default patch baseline for Windows is returned.
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
     * <code>AWS-RunPatchBaseline</code> Systems Manager document (SSM document).
     * </p>
     * <note>
     * <p>
     * If you run the command locally, such as with the Command Line Interface (CLI), the system attempts to use your
     * local AWS credentials and the operation fails. To avoid this, you can run the command in the Amazon Web Services
     * Systems Manager console. Use Run Command, a capability of Amazon Web Services Systems Manager, with an SSM
     * document that enables you to target an instance with a script or command. For example, run the command using the
     * <code>AWS-RunShellScript</code> document or the <code>AWS-RunPowerShellScript</code> document.
     * </p>
     * </note>
     * 
     * @param getDeployablePatchSnapshotForInstanceRequest
     * @return Result of the GetDeployablePatchSnapshotForInstance operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws UnsupportedOperatingSystemException
     *         The operating systems you specified isn't supported, or the operation isn't supported for the operating
     *         system.
     * @throws UnsupportedFeatureRequiredException
     *         Patching for applications released by Microsoft is only available on EC2 instances and advanced
     *         instances. To patch applications released by Microsoft on on-premises servers and VMs, you must enable
     *         advanced instances. For more information, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-managedinstances-advanced.html"
     *         >Enabling the advanced-instances tier</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @sample AWSSimpleSystemsManagement.GetDeployablePatchSnapshotForInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetDeployablePatchSnapshotForInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeployablePatchSnapshotForInstanceResult getDeployablePatchSnapshotForInstance(
            GetDeployablePatchSnapshotForInstanceRequest getDeployablePatchSnapshotForInstanceRequest);

    /**
     * <p>
     * Gets the contents of the specified Amazon Web Services Systems Manager document (SSM document).
     * </p>
     * 
     * @param getDocumentRequest
     * @return Result of the GetDocument operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
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
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidInventoryGroupException
     *         The specified inventory group isn't valid.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InvalidTypeNameException
     *         The parameter type name isn't valid.
     * @throws InvalidAggregatorException
     *         The specified aggregator isn't valid for inventory groups. Verify that the aggregator uses a valid
     *         inventory type such as <code>AWS:Application</code> or <code>AWS:InstanceInformation</code>.
     * @throws InvalidResultAttributeException
     *         The specified inventory item result attribute isn't valid.
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
     *         The parameter type name isn't valid.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.GetInventorySchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetInventorySchema" target="_top">AWS API
     *      Documentation</a>
     */
    GetInventorySchemaResult getInventorySchema(GetInventorySchemaRequest getInventorySchemaRequest);

    /**
     * <p>
     * Retrieves a maintenance window.
     * </p>
     * 
     * @param getMaintenanceWindowRequest
     * @return Result of the GetMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindow" target="_top">AWS API
     *      Documentation</a>
     */
    GetMaintenanceWindowResult getMaintenanceWindow(GetMaintenanceWindowRequest getMaintenanceWindowRequest);

    /**
     * <p>
     * Retrieves details about a specific a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionRequest
     * @return Result of the GetMaintenanceWindowExecution operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionResult getMaintenanceWindowExecution(GetMaintenanceWindowExecutionRequest getMaintenanceWindowExecutionRequest);

    /**
     * <p>
     * Retrieves the details about a specific task run as part of a maintenance window execution.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskRequest
     * @return Result of the GetMaintenanceWindowExecutionTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowExecutionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecutionTask"
     *      target="_top">AWS API Documentation</a>
     */
    GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTask(GetMaintenanceWindowExecutionTaskRequest getMaintenanceWindowExecutionTaskRequest);

    /**
     * <p>
     * Retrieves information about a specific task running on a specific target.
     * </p>
     * 
     * @param getMaintenanceWindowExecutionTaskInvocationRequest
     * @return Result of the GetMaintenanceWindowExecutionTaskInvocation operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * Lists the tasks in a maintenance window.
     * </p>
     * <note>
     * <p>
     * For maintenance window tasks without a specified target, you can't supply values for <code>--max-errors</code>
     * and <code>--max-concurrency</code>. Instead, the system inserts a placeholder value of <code>1</code>, which may
     * be reported in the response to this command. These values don't affect the running of your task and can be
     * ignored.
     * </p>
     * </note>
     * 
     * @param getMaintenanceWindowTaskRequest
     * @return Result of the GetMaintenanceWindowTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowTask" target="_top">AWS
     *      API Documentation</a>
     */
    GetMaintenanceWindowTaskResult getMaintenanceWindowTask(GetMaintenanceWindowTaskRequest getMaintenanceWindowTaskRequest);

    /**
     * <p>
     * Get information about an OpsItem by using the ID. You must have permission in Identity and Access Management
     * (IAM) to view information about an OpsItem. For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use Amazon Web Services Systems Manager OpsCenter to view, investigate,
     * and remediate operational issues impacting the performance and health of their Amazon Web Services resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">OpsCenter</a> in the <i>Amazon
     * Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param getOpsItemRequest
     * @return Result of the GetOpsItem operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemNotFoundException
     *         The specified OpsItem ID doesn't exist. Verify the ID and try again.
     * @sample AWSSimpleSystemsManagement.GetOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    GetOpsItemResult getOpsItem(GetOpsItemRequest getOpsItemRequest);

    /**
     * <p>
     * View operational metadata related to an application in Application Manager.
     * </p>
     * 
     * @param getOpsMetadataRequest
     * @return Result of the GetOpsMetadata operation returned by the service.
     * @throws OpsMetadataNotFoundException
     *         The OpsMetadata object doesn't exist.
     * @throws OpsMetadataInvalidArgumentException
     *         One of the arguments passed is invalid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    GetOpsMetadataResult getOpsMetadata(GetOpsMetadataRequest getOpsMetadataRequest);

    /**
     * <p>
     * View a summary of operations metadata (OpsData) based on specified filters and aggregators. OpsData can include
     * information about Amazon Web Services Systems Manager OpsCenter operational workitems (OpsItems) as well as
     * information about any Amazon Web Services resource or service configured to report OpsData to Amazon Web Services
     * Systems Manager Explorer.
     * </p>
     * 
     * @param getOpsSummaryRequest
     * @return Result of the GetOpsSummary operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ResourceDataSyncNotFoundException
     *         The specified sync name wasn't found.
     * @throws InvalidFilterException
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InvalidTypeNameException
     *         The parameter type name isn't valid.
     * @throws InvalidAggregatorException
     *         The specified aggregator isn't valid for inventory groups. Verify that the aggregator uses a valid
     *         inventory type such as <code>AWS:Application</code> or <code>AWS:InstanceInformation</code>.
     * @sample AWSSimpleSystemsManagement.GetOpsSummary
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetOpsSummary" target="_top">AWS API
     *      Documentation</a>
     */
    GetOpsSummaryResult getOpsSummary(GetOpsSummaryRequest getOpsSummaryRequest);

    /**
     * <p>
     * Get information about a parameter by using the parameter name. Don't confuse this API operation with the
     * <a>GetParameters</a> API operation.
     * </p>
     * 
     * @param getParameterRequest
     * @return Result of the GetParameter operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidKeyIdException
     *         The query key ID isn't valid.
     * @throws ParameterNotFoundException
     *         The parameter couldn't be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version wasn't found. Verify the parameter name and version, and try again.
     * @sample AWSSimpleSystemsManagement.GetParameter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameter" target="_top">AWS API
     *      Documentation</a>
     */
    GetParameterResult getParameter(GetParameterRequest getParameterRequest);

    /**
     * <p>
     * Retrieves the history of all changes to a parameter.
     * </p>
     * 
     * @param getParameterHistoryRequest
     * @return Result of the GetParameterHistory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ParameterNotFoundException
     *         The parameter couldn't be found. Verify the name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InvalidKeyIdException
     *         The query key ID isn't valid.
     * @sample AWSSimpleSystemsManagement.GetParameterHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameterHistory" target="_top">AWS API
     *      Documentation</a>
     */
    GetParameterHistoryResult getParameterHistory(GetParameterHistoryRequest getParameterHistoryRequest);

    /**
     * <p>
     * Get details of a parameter. Don't confuse this API operation with the <a>GetParameter</a> API operation.
     * </p>
     * 
     * @param getParametersRequest
     * @return Result of the GetParameters operation returned by the service.
     * @throws InvalidKeyIdException
     *         The query key ID isn't valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.GetParameters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetParameters" target="_top">AWS API
     *      Documentation</a>
     */
    GetParametersResult getParameters(GetParametersRequest getParametersRequest);

    /**
     * <p>
     * Retrieve information about one or more parameters in a specific hierarchy.
     * </p>
     * <p>
     * Request results are returned on a best-effort basis. If you specify <code>MaxResults</code> in the request, the
     * response includes information up to the limit specified. The number of items returned, however, can be between
     * zero and the value of <code>MaxResults</code>. If the service reaches an internal limit while processing the
     * results, it stops the operation and returns the matching values up to that point and a <code>NextToken</code>.
     * You can specify the <code>NextToken</code> in a subsequent call to get the next set of results.
     * </p>
     * 
     * @param getParametersByPathRequest
     * @return Result of the GetParametersByPath operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterKeyException
     *         The specified key isn't valid.
     * @throws InvalidFilterOptionException
     *         The specified filter option isn't valid. Valid options are Equals and BeginsWith. For Path filter, valid
     *         options are Recursive and OneLevel.
     * @throws InvalidFilterValueException
     *         The filter value isn't valid. Verify the value and try again.
     * @throws InvalidKeyIdException
     *         The query key ID isn't valid.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
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
     * <code>ServiceSetting</code> is an account-level setting for an Amazon Web Services service. This setting defines
     * how a user interacts with or uses a service or a feature of a service. For example, if an Amazon Web Services
     * service charges money to the account based on feature or service usage, then the Amazon Web Services service team
     * might create a default setting of <code>false</code>. This means the user can't use this feature unless they
     * change the setting to <code>true</code> and intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. Amazon Web Services services teams define the
     * default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite
     * the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>UpdateServiceSetting</a> API operation to change the default setting. Or use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the Amazon Web Services service team.
     * </p>
     * <p>
     * Query the current service setting for the account.
     * </p>
     * 
     * @param getServiceSettingRequest
     *        The request body of the GetServiceSetting API operation.
     * @return Result of the GetServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting wasn't found. Either the service name or the setting hasn't been
     *         provisioned by the Amazon Web Services service team.
     * @sample AWSSimpleSystemsManagement.GetServiceSetting
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
     *      Documentation</a>
     */
    GetServiceSettingResult getServiceSetting(GetServiceSettingRequest getServiceSettingRequest);

    /**
     * <p>
     * A parameter label is a user-defined alias to help you manage different versions of a parameter. When you modify a
     * parameter, Amazon Web Services Systems Manager automatically saves a new version and increments the version
     * number by one. A label can help you remember the purpose of a parameter when there are multiple versions.
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
     * If you no longer want to use a parameter label, then you can either delete it or move it to a different version
     * of a parameter.
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
     * Labels can't begin with a number, "<code>aws</code>" or "<code>ssm</code>" (not case sensitive). If a label fails
     * to meet these requirements, then the label isn't associated with a parameter and the system displays it in the
     * list of InvalidLabels.
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
     *         The parameter couldn't be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version wasn't found. Verify the parameter name and version, and try again.
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
     *         The specified token isn't valid.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @sample AWSSimpleSystemsManagement.ListAssociationVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociationVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListAssociationVersionsResult listAssociationVersions(ListAssociationVersionsRequest listAssociationVersionsRequest);

    /**
     * <p>
     * Returns all State Manager associations in the current account and Region. You can limit the results to a specific
     * State Manager association document or instance by specifying a filter. State Manager is a capability of Amazon
     * Web Services Systems Manager.
     * </p>
     * 
     * @param listAssociationsRequest
     * @return Result of the ListAssociations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.ListAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListAssociations" target="_top">AWS API
     *      Documentation</a>
     */
    ListAssociationsResult listAssociations(ListAssociationsRequest listAssociationsRequest);

    /**
     * <p>
     * An invocation is copy of a command sent to a specific instance. A command can apply to one or more instances. A
     * command invocation applies to one instance. For example, if a user runs <code>SendCommand</code> against three
     * instances, then a command invocation is created for each requested instance ID.
     * <code>ListCommandInvocations</code> provide status about command execution.
     * </p>
     * 
     * @param listCommandInvocationsRequest
     * @return Result of the ListCommandInvocations operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     *         The specified command ID isn't valid. Verify the ID and try again.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidFilterKeyException
     *         The specified key isn't valid.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.ListCommandInvocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommandInvocations" target="_top">AWS API
     *      Documentation</a>
     */
    ListCommandInvocationsResult listCommandInvocations(ListCommandInvocationsRequest listCommandInvocationsRequest);

    /**
     * <p>
     * Lists the commands requested by users of the account.
     * </p>
     * 
     * @param listCommandsRequest
     * @return Result of the ListCommands operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidCommandIdException
     *         The specified command ID isn't valid. Verify the ID and try again.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidFilterKeyException
     *         The specified key isn't valid.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.ListCommands
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListCommands" target="_top">AWS API
     *      Documentation</a>
     */
    ListCommandsResult listCommands(ListCommandsRequest listCommandsRequest);

    /**
     * <p>
     * For a specified resource ID, this API operation returns a list of compliance statuses for different resource
     * types. Currently, you can only specify one resource ID per call. List results depend on the criteria specified in
     * the filter.
     * </p>
     * 
     * @param listComplianceItemsRequest
     * @return Result of the ListComplianceItems operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type isn't valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidFilterException
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListComplianceSummaries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceSummaries" target="_top">AWS
     *      API Documentation</a>
     */
    ListComplianceSummariesResult listComplianceSummaries(ListComplianceSummariesRequest listComplianceSummariesRequest);

    /**
     * <p>
     * Information about approval reviews for a version of an SSM document.
     * </p>
     * 
     * @param listDocumentMetadataHistoryRequest
     * @return Result of the ListDocumentMetadataHistory operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.ListDocumentMetadataHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentMetadataHistory"
     *      target="_top">AWS API Documentation</a>
     */
    ListDocumentMetadataHistoryResult listDocumentMetadataHistory(ListDocumentMetadataHistoryRequest listDocumentMetadataHistoryRequest);

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
     *         The specified token isn't valid.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @sample AWSSimpleSystemsManagement.ListDocumentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListDocumentVersions" target="_top">AWS API
     *      Documentation</a>
     */
    ListDocumentVersionsResult listDocumentVersions(ListDocumentVersionsRequest listDocumentVersionsRequest);

    /**
     * <p>
     * Returns all Systems Manager (SSM) documents in the current account and Region. You can limit the results of this
     * request by using a filter.
     * </p>
     * 
     * @param listDocumentsRequest
     * @return Result of the ListDocuments operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @throws InvalidFilterKeyException
     *         The specified key isn't valid.
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
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidTypeNameException
     *         The parameter type name isn't valid.
     * @throws InvalidFilterException
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.ListInventoryEntries
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListInventoryEntries" target="_top">AWS API
     *      Documentation</a>
     */
    ListInventoryEntriesResult listInventoryEntries(ListInventoryEntriesRequest listInventoryEntriesRequest);

    /**
     * <p>
     * Returns a list of all OpsItem events in the current Region and account. You can limit the results to events
     * associated with specific OpsItems by specifying a filter.
     * </p>
     * 
     * @param listOpsItemEventsRequest
     * @return Result of the ListOpsItemEvents operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemNotFoundException
     *         The specified OpsItem ID doesn't exist. Verify the ID and try again.
     * @throws OpsItemLimitExceededException
     *         The request caused OpsItems to exceed one or more quotas. For information about OpsItem quotas, see <a
     *         href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-learn-more.html#OpsCenter-learn-more-limits"
     *         >What are the resource limits for OpsCenter?</a>.
     * @throws OpsItemInvalidParameterException
     *         A specified parameter argument isn't valid. Verify the available arguments and try again.
     * @sample AWSSimpleSystemsManagement.ListOpsItemEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsItemEvents" target="_top">AWS API
     *      Documentation</a>
     */
    ListOpsItemEventsResult listOpsItemEvents(ListOpsItemEventsRequest listOpsItemEventsRequest);

    /**
     * <p>
     * Lists all related-item resources associated with an OpsItem.
     * </p>
     * 
     * @param listOpsItemRelatedItemsRequest
     * @return Result of the ListOpsItemRelatedItems operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemInvalidParameterException
     *         A specified parameter argument isn't valid. Verify the available arguments and try again.
     * @sample AWSSimpleSystemsManagement.ListOpsItemRelatedItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsItemRelatedItems" target="_top">AWS
     *      API Documentation</a>
     */
    ListOpsItemRelatedItemsResult listOpsItemRelatedItems(ListOpsItemRelatedItemsRequest listOpsItemRelatedItemsRequest);

    /**
     * <p>
     * Amazon Web Services Systems Manager calls this API operation when displaying all Application Manager OpsMetadata
     * objects or blobs.
     * </p>
     * 
     * @param listOpsMetadataRequest
     * @return Result of the ListOpsMetadata operation returned by the service.
     * @throws OpsMetadataInvalidArgumentException
     *         One of the arguments passed is invalid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    ListOpsMetadataResult listOpsMetadata(ListOpsMetadataRequest listOpsMetadataRequest);

    /**
     * <p>
     * Returns a resource-level summary count. The summary includes information about compliant and non-compliant
     * statuses and detailed compliance-item severity counts, according to the filter criteria you specify.
     * </p>
     * 
     * @param listResourceComplianceSummariesRequest
     * @return Result of the ListResourceComplianceSummaries operation returned by the service.
     * @throws InvalidFilterException
     *         The filter name isn't valid. Verify the you entered the correct name and try again.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
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
     * @throws ResourceDataSyncInvalidConfigurationException
     *         The specified sync configuration is invalid.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidNextTokenException
     *         The specified token isn't valid.
     * @sample AWSSimpleSystemsManagement.ListResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourceDataSyncResult listResourceDataSync(ListResourceDataSyncRequest listResourceDataSyncRequest);

    /**
     * <p>
     * Returns a list of the tags assigned to the specified resource.
     * </p>
     * <p>
     * For information about the ID format for each supported resource type, see <a>AddTagsToResource</a>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type isn't valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Shares a Amazon Web Services Systems Manager document (SSM document)publicly or privately. If you share a
     * document privately, you must specify the Amazon Web Services user account IDs for those people who can use the
     * document. If you share a document publicly, you must specify <i>All</i> as the account ID.
     * </p>
     * 
     * @param modifyDocumentPermissionRequest
     * @return Result of the ModifyDocumentPermission operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidPermissionTypeException
     *         The permission type isn't supported. <i>Share</i> is the only supported permission type.
     * @throws DocumentPermissionLimitException
     *         The document can't be shared with more Amazon Web Services user accounts. You can share a document with a
     *         maximum of 20 accounts. You can publicly share up to five documents. If you need to increase this limit,
     *         contact Amazon Web Services Support.
     * @throws DocumentLimitExceededException
     *         You can have at most 500 active SSM documents.
     * @sample AWSSimpleSystemsManagement.ModifyDocumentPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ModifyDocumentPermission" target="_top">AWS
     *      API Documentation</a>
     */
    ModifyDocumentPermissionResult modifyDocumentPermission(ModifyDocumentPermissionRequest modifyDocumentPermissionRequest);

    /**
     * <p>
     * Registers a compliance type and other compliance details on a designated resource. This operation lets you
     * register custom compliance details with a resource. This call overwrites existing compliance information on the
     * resource, so you must provide a full list of compliance items each time that you send the request.
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
     * DocumentName: An SSM document name. For example, <code>AWS-RunPatchBaseline</code>.
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
     *         One or more content items isn't valid.
     * @throws TotalSizeLimitExceededException
     *         The size of inventory data has exceeded the total size limit for the resource.
     * @throws ItemSizeLimitExceededException
     *         The inventory item size has exceeded the size limit.
     * @throws ComplianceTypeCountLimitExceededException
     *         You specified too many custom compliance types. You can specify a maximum of 10 different types.
     * @throws InvalidResourceTypeException
     *         The resource type isn't valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
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
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidTypeNameException
     *         The parameter type name isn't valid.
     * @throws InvalidItemContentException
     *         One or more content items isn't valid.
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
     *         The <code>Context</code> attribute that you specified for the <code>InventoryItem</code> isn't allowed
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
     *         The query key ID isn't valid.
     * @throws ParameterLimitExceededException
     *         You have exceeded the number of parameters for this account. Delete one or more parameters and try again.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws ParameterAlreadyExistsException
     *         The parameter already exists. You can't create duplicate parameters.
     * @throws HierarchyLevelLimitExceededException
     *         A hierarchy can have a maximum of 15 levels. For more information, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html"
     *         >Requirements and constraints for parameter names</a> in the <i>Amazon Web Services Systems Manager User
     *         Guide</i>.
     * @throws HierarchyTypeMismatchException
     *         Parameter Store doesn't support changing a parameter type in a hierarchy. For example, you can't change a
     *         parameter from a <code>String</code> type to a <code>SecureString</code> type. You must create a new,
     *         unique parameter.
     * @throws InvalidAllowedPatternException
     *         The request doesn't meet the regular expression requirement.
     * @throws ParameterMaxVersionLimitExceededException
     *         Parameter Store retains the 100 most recently created versions of a parameter. After this number of
     *         versions has been created, Parameter Store deletes the oldest version when a new one is created. However,
     *         if the oldest version has a <i>label</i> attached to it, Parameter Store won't delete the version and
     *         instead presents this error message:</p>
     *         <p>
     *         <code>An error occurred (ParameterMaxVersionLimitExceeded) when calling the PutParameter operation: You attempted to create a new version of <i>parameter-name</i> by calling the PutParameter API with the overwrite flag. Version <i>version-number</i>, the oldest version, can't be deleted because it has a label associated with it. Move the label to another version of the parameter, and try again.</code>
     *         </p>
     *         <p>
     *         This safeguard is to prevent parameter versions with mission critical labels assigned to them from being
     *         deleted. To continue creating new parameters, first move the label from the oldest version of the
     *         parameter to a newer one for use in your operations. For information about moving parameter labels, see
     *         <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html#sysman-paramstore-labels-console-move"
     *         >Move a parameter label (console)</a> or <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-paramstore-labels.html#sysman-paramstore-labels-cli-move"
     *         >Move a parameter label (CLI)</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * @throws ParameterPatternMismatchException
     *         The parameter name isn't valid.
     * @throws UnsupportedParameterTypeException
     *         The parameter type isn't supported.
     * @throws PoliciesLimitExceededException
     *         You specified more than the maximum number of allowed policies for the parameter. The maximum is 10.
     * @throws InvalidPolicyTypeException
     *         The policy type isn't supported. Parameter Store supports the following policy types: Expiration,
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
     * Defines the default patch baseline for the relevant operating system.
     * </p>
     * <p>
     * To reset the Amazon Web Services-predefined patch baseline as the default, specify the full patch baseline Amazon
     * Resource Name (ARN) as the baseline ID value. For example, for CentOS, specify
     * <code>arn:aws:ssm:us-east-2:733109147000:patchbaseline/pb-0574b43a65ea646ed</code> instead of
     * <code>pb-0574b43a65ea646ed</code>.
     * </p>
     * 
     * @param registerDefaultPatchBaselineRequest
     * @return Result of the RegisterDefaultPatchBaseline operation returned by the service.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource quotas. For example, too many
     *         maintenance windows or patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource quotas in Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * Registers a target with a maintenance window.
     * </p>
     * 
     * @param registerTargetWithMaintenanceWindowRequest
     * @return Result of the RegisterTargetWithMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource quotas. For example, too many
     *         maintenance windows or patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource quotas in Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     * Adds a new task to a maintenance window.
     * </p>
     * 
     * @param registerTaskWithMaintenanceWindowRequest
     * @return Result of the RegisterTaskWithMaintenanceWindow operation returned by the service.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws ResourceLimitExceededException
     *         Error returned when the caller has exceeded the default resource quotas. For example, too many
     *         maintenance windows or patch baselines have been created.
     *         </p>
     *         <p>
     *         For information about resource quotas in Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws FeatureNotAvailableException
     *         You attempted to register a <code>LAMBDA</code> or <code>STEP_FUNCTIONS</code> task in a region where the
     *         corresponding service isn't available.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.RegisterTaskWithMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/RegisterTaskWithMaintenanceWindow"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterTaskWithMaintenanceWindowResult registerTaskWithMaintenanceWindow(RegisterTaskWithMaintenanceWindowRequest registerTaskWithMaintenanceWindowRequest);

    /**
     * <p>
     * Removes tag keys from the specified resource.
     * </p>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the service.
     * @throws InvalidResourceTypeException
     *         The resource type isn't valid. For example, if you are attempting to tag an instance, the instance must
     *         be a registered, managed instance.
     * @throws InvalidResourceIdException
     *         The resource ID isn't valid. Verify that you entered the correct ID and try again.
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
     * <code>ServiceSetting</code> is an account-level setting for an Amazon Web Services service. This setting defines
     * how a user interacts with or uses a service or a feature of a service. For example, if an Amazon Web Services
     * service charges money to the account based on feature or service usage, then the Amazon Web Services service team
     * might create a default setting of "false". This means the user can't use this feature unless they change the
     * setting to "true" and intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. Amazon Web Services services teams define the
     * default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite
     * the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API operation to view the current value. Use the <a>UpdateServiceSetting</a> API
     * operation to change the default setting.
     * </p>
     * <p>
     * Reset the service setting for the account to the default value as provisioned by the Amazon Web Services service
     * team.
     * </p>
     * 
     * @param resetServiceSettingRequest
     *        The request body of the ResetServiceSetting API operation.
     * @return Result of the ResetServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting wasn't found. Either the service name or the setting hasn't been
     *         provisioned by the Amazon Web Services service team.
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
     * issues. It isn't intended for any other use.
     * </p>
     * </note>
     * 
     * @param resumeSessionRequest
     * @return Result of the ResumeSession operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
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
     *         The signal isn't valid for the current Automation execution.
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
     *         You can't specify an instance ID in more than one association.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws InvalidOutputFolderException
     *         The S3 bucket doesn't exist.
     * @throws InvalidParametersException
     *         You must specify values for all required parameters in the Amazon Web Services Systems Manager document
     *         (SSM document). You can only supply values to parameters defined in the SSM document.
     * @throws UnsupportedPlatformTypeException
     *         The document doesn't support the platform type of the given instance ID(s). For example, you sent an
     *         document for a Windows instance to a Linux instance.
     * @throws MaxDocumentSizeExceededException
     *         The size limit of a document is 64 KB.
     * @throws InvalidRoleException
     *         The role name can't contain invalid characters. Also verify that you specified an IAM role for
     *         notifications that includes the required trust policy. For information about configuring the IAM role for
     *         Run Command notifications, see <a
     *         href="https://docs.aws.amazon.com/systems-manager/latest/userguide/rc-sns-notifications.html">Configuring
     *         Amazon SNS Notifications for Run Command</a> in the <i>Amazon Web Services Systems Manager User
     *         Guide</i>.
     * @throws InvalidNotificationConfigException
     *         One or more configuration items isn't valid. Verify that a valid Amazon Resource Name (ARN) was provided
     *         for an Amazon Simple Notification Service topic.
     * @sample AWSSimpleSystemsManagement.SendCommand
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SendCommand" target="_top">AWS API
     *      Documentation</a>
     */
    SendCommandResult sendCommand(SendCommandRequest sendCommandRequest);

    /**
     * <p>
     * Runs an association immediately and only one time. This operation can be helpful when troubleshooting
     * associations.
     * </p>
     * 
     * @param startAssociationsOnceRequest
     * @return Result of the StartAssociationsOnce operation returned by the service.
     * @throws InvalidAssociationException
     *         The association isn't valid or doesn't exist.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @sample AWSSimpleSystemsManagement.StartAssociationsOnce
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAssociationsOnce" target="_top">AWS API
     *      Documentation</a>
     */
    StartAssociationsOnceResult startAssociationsOnce(StartAssociationsOnceRequest startAssociationsOnceRequest);

    /**
     * <p>
     * Initiates execution of an Automation runbook.
     * </p>
     * 
     * @param startAutomationExecutionRequest
     * @return Result of the StartAutomationExecution operation returned by the service.
     * @throws AutomationDefinitionNotFoundException
     *         An Automation runbook with the specified name couldn't be found.
     * @throws InvalidAutomationExecutionParametersException
     *         The supplied parameters for invoking the specified Automation runbook are incorrect. For example, they
     *         may not match the set of parameters permitted for the specified Automation document.
     * @throws AutomationExecutionLimitExceededException
     *         The number of simultaneously running Automation executions exceeded the allowable limit.
     * @throws AutomationDefinitionVersionNotFoundException
     *         An Automation runbook with the specified name and version couldn't be found.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws InvalidTargetException
     *         The target isn't valid or doesn't exist. It might not be configured for Systems Manager or you might not
     *         have permission to perform the operation.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.StartAutomationExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartAutomationExecution" target="_top">AWS
     *      API Documentation</a>
     */
    StartAutomationExecutionResult startAutomationExecution(StartAutomationExecutionRequest startAutomationExecutionRequest);

    /**
     * <p>
     * Creates a change request for Change Manager. The Automation runbooks specified in the change request run only
     * after all required approvals for the change request have been received.
     * </p>
     * 
     * @param startChangeRequestExecutionRequest
     * @return Result of the StartChangeRequestExecution operation returned by the service.
     * @throws AutomationDefinitionNotFoundException
     *         An Automation runbook with the specified name couldn't be found.
     * @throws InvalidAutomationExecutionParametersException
     *         The supplied parameters for invoking the specified Automation runbook are incorrect. For example, they
     *         may not match the set of parameters permitted for the specified Automation document.
     * @throws AutomationExecutionLimitExceededException
     *         The number of simultaneously running Automation executions exceeded the allowable limit.
     * @throws AutomationDefinitionVersionNotFoundException
     *         An Automation runbook with the specified name and version couldn't be found.
     * @throws IdempotentParameterMismatchException
     *         Error returned when an idempotent operation is retried and the parameters don't match the original call
     *         to the API with the same idempotency token.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws AutomationDefinitionNotApprovedException
     *         Indicates that the Change Manager change template used in the change request was rejected or is still in
     *         a pending state.
     * @sample AWSSimpleSystemsManagement.StartChangeRequestExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/StartChangeRequestExecution"
     *      target="_top">AWS API Documentation</a>
     */
    StartChangeRequestExecutionResult startChangeRequestExecution(StartChangeRequestExecutionRequest startChangeRequestExecutionRequest);

    /**
     * <p>
     * Initiates a connection to a target (for example, an instance) for a Session Manager session. Returns a URL and
     * token that can be used to open a WebSocket connection for sending input and receiving outputs.
     * </p>
     * <note>
     * <p>
     * Amazon Web Services CLI usage: <code>start-session</code> is an interactive command that requires the Session
     * Manager plugin to be installed on the client machine making the call. For information, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-install-plugin.html"
     * >Install the Session Manager plugin for the Amazon Web Services CLI</a> in the <i>Amazon Web Services Systems
     * Manager User Guide</i>.
     * </p>
     * <p>
     * Amazon Web Services Tools for PowerShell usage: Start-SSMSession isn't currently supported by Amazon Web Services
     * Tools for PowerShell on Windows local machines.
     * </p>
     * </note>
     * 
     * @param startSessionRequest
     * @return Result of the StartSession operation returned by the service.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws TargetNotConnectedException
     *         The specified target instance for the session isn't fully configured for use with Session Manager. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-getting-started.html"
     *         >Getting started with Session Manager</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     *         This error is also returned if you attempt to start a session on an instance that is located in a
     *         different account or Region
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
     *         The specified update status operation isn't valid.
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
     * instance. A terminated session isn't be resumed.
     * </p>
     * 
     * @param terminateSessionRequest
     * @return Result of the TerminateSession operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.TerminateSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/TerminateSession" target="_top">AWS API
     *      Documentation</a>
     */
    TerminateSessionResult terminateSession(TerminateSessionRequest terminateSessionRequest);

    /**
     * <p>
     * Remove a label or labels from a parameter.
     * </p>
     * 
     * @param unlabelParameterVersionRequest
     * @return Result of the UnlabelParameterVersion operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws ParameterNotFoundException
     *         The parameter couldn't be found. Verify the name and try again.
     * @throws ParameterVersionNotFoundException
     *         The specified parameter version wasn't found. Verify the parameter name and version, and try again.
     * @sample AWSSimpleSystemsManagement.UnlabelParameterVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UnlabelParameterVersion" target="_top">AWS
     *      API Documentation</a>
     */
    UnlabelParameterVersionResult unlabelParameterVersion(UnlabelParameterVersionRequest unlabelParameterVersionRequest);

    /**
     * <p>
     * Updates an association. You can update the association name and version, the document version, schedule,
     * parameters, and Amazon Simple Storage Service (Amazon S3) output.
     * </p>
     * <p>
     * In order to call this API operation, your Identity and Access Management (IAM) user account, group, or role must
     * be configured with permission to call the <a>DescribeAssociation</a> API operation. If you don't have permission
     * to call <code>DescribeAssociation</code>, then you receive the following error:
     * <code>An error occurred (AccessDeniedException) when calling the UpdateAssociation operation: User: &lt;user_arn&gt; isn't authorized to perform: ssm:DescribeAssociation on resource: &lt;resource_arn&gt;</code>
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
     *         You must specify values for all required parameters in the Amazon Web Services Systems Manager document
     *         (SSM document). You can only supply values to parameters defined in the SSM document.
     * @throws InvalidOutputLocationException
     *         The output location isn't valid or doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
     * @throws InvalidUpdateException
     *         The update isn't valid.
     * @throws TooManyUpdatesException
     *         There are concurrent updates for a resource that supports one update at a time.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidTargetException
     *         The target isn't valid or doesn't exist. It might not be configured for Systems Manager or you might not
     *         have permission to perform the operation.
     * @throws InvalidAssociationVersionException
     *         The version you specified isn't valid. Use ListAssociationVersions to view all versions of an association
     *         according to the association ID. Or, use the <code>$LATEST</code> parameter to view the latest version of
     *         the association.
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
     * Updates the status of the Amazon Web Services Systems Manager document (SSM document) associated with the
     * specified instance.
     * </p>
     * 
     * @param updateAssociationStatusRequest
     * @return Result of the UpdateAssociationStatus operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws AssociationDoesNotExistException
     *         The specified association doesn't exist.
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
     * Updates one or more values for an SSM document.
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
     *         The content for the document isn't valid.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema isn't supported.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
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
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @throws InvalidDocumentSchemaVersionException
     *         The version of the document schema isn't supported.
     * @sample AWSSimpleSystemsManagement.UpdateDocumentDefaultVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentDefaultVersion"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDocumentDefaultVersionResult updateDocumentDefaultVersion(UpdateDocumentDefaultVersionRequest updateDocumentDefaultVersionRequest);

    /**
     * <p>
     * Updates information related to approval reviews for a specific version of a document.
     * </p>
     * 
     * @param updateDocumentMetadataRequest
     * @return Result of the UpdateDocumentMetadata operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws InvalidDocumentException
     *         The specified SSM document doesn't exist.
     * @throws InvalidDocumentOperationException
     *         You attempted to delete a document while it is still shared. You must stop sharing the document before
     *         you can delete it.
     * @throws InvalidDocumentVersionException
     *         The document version isn't valid or doesn't exist.
     * @sample AWSSimpleSystemsManagement.UpdateDocumentMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateDocumentMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDocumentMetadataResult updateDocumentMetadata(UpdateDocumentMetadataRequest updateDocumentMetadataRequest);

    /**
     * <p>
     * Updates an existing maintenance window. Only specified parameters are modified.
     * </p>
     * <note>
     * <p>
     * The value you specify for <code>Duration</code> determines the specific end time for the maintenance window based
     * on the time it begins. No maintenance window tasks are permitted to start after the resulting endtime minus the
     * number of hours you specify for <code>Cutoff</code>. For example, if the maintenance window starts at 3 PM, the
     * duration is three hours, and the value you specify for <code>Cutoff</code> is one hour, no maintenance window
     * tasks can start after 5 PM.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowRequest
     * @return Result of the UpdateMaintenanceWindow operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindow
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindow" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateMaintenanceWindowResult updateMaintenanceWindow(UpdateMaintenanceWindowRequest updateMaintenanceWindowRequest);

    /**
     * <p>
     * Modifies the target of an existing maintenance window. You can change the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Name
     * </p>
     * </li>
     * <li>
     * <p>
     * Description
     * </p>
     * </li>
     * <li>
     * <p>
     * Owner
     * </p>
     * </li>
     * <li>
     * <p>
     * IDs for an ID target
     * </p>
     * </li>
     * <li>
     * <p>
     * Tags for a Tag target
     * </p>
     * </li>
     * <li>
     * <p>
     * From any supported tag type to another. The three supported tag types are ID target, Tag target, and resource
     * group. For more information, see <a>Target</a>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * If a parameter is null, then the corresponding field isn't modified.
     * </p>
     * </note>
     * 
     * @param updateMaintenanceWindowTargetRequest
     * @return Result of the UpdateMaintenanceWindowTarget operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindowTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTarget"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMaintenanceWindowTargetResult updateMaintenanceWindowTarget(UpdateMaintenanceWindowTargetRequest updateMaintenanceWindowTargetRequest);

    /**
     * <p>
     * Modifies a task assigned to a maintenance window. You can't change the task type, but you can change the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TaskARN</code>. For example, you can change a <code>RUN_COMMAND</code> task from
     * <code>AWS-RunPowerShellScript</code> to <code>AWS-RunShellScript</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ServiceRoleArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TaskInvocationParameters</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Priority</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxConcurrency</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MaxErrors</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * One or more targets must be specified for maintenance window Run Command-type tasks. Depending on the task,
     * targets are optional for other maintenance window task types (Automation, Lambda, and Step Functions). For more
     * information about running tasks that don't specify targets, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/maintenance-windows-targetless-tasks.html"
     * >Registering maintenance window tasks without targets</a> in the <i>Amazon Web Services Systems Manager User
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * If the value for a parameter in <code>UpdateMaintenanceWindowTask</code> is null, then the corresponding field
     * isn't modified. If you set <code>Replace</code> to true, then all fields required by the
     * <a>RegisterTaskWithMaintenanceWindow</a> operation are required for this request. Optional fields that aren't
     * specified are set to null.
     * </p>
     * <important>
     * <p>
     * When you update a maintenance window task that has options specified in <code>TaskInvocationParameters</code>,
     * you must provide again all the <code>TaskInvocationParameters</code> values that you want to retain. The values
     * you don't specify again are removed. For example, suppose that when you registered a Run Command task, you
     * specified <code>TaskInvocationParameters</code> values for <code>Comment</code>, <code>NotificationConfig</code>,
     * and <code>OutputS3BucketName</code>. If you update the maintenance window task and specify only a different
     * <code>OutputS3BucketName</code> value, the values for <code>Comment</code> and <code>NotificationConfig</code>
     * are removed.
     * </p>
     * </important>
     * 
     * @param updateMaintenanceWindowTaskRequest
     * @return Result of the UpdateMaintenanceWindowTask operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateMaintenanceWindowTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateMaintenanceWindowTask"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMaintenanceWindowTaskResult updateMaintenanceWindowTask(UpdateMaintenanceWindowTaskRequest updateMaintenanceWindowTaskRequest);

    /**
     * <p>
     * Changes the Identity and Access Management (IAM) role that is assigned to the on-premises instance or virtual
     * machines (VM). IAM roles are first assigned to these hybrid instances during the activation process. For more
     * information, see <a>CreateActivation</a>.
     * </p>
     * 
     * @param updateManagedInstanceRoleRequest
     * @return Result of the UpdateManagedInstanceRole operation returned by the service.
     * @throws InvalidInstanceIdException
     *         The following problems can cause this exception:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You don't have permission to access the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Web Services Systems Manager Agent(SSM Agent) isn't running. Verify that SSM Agent is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSM Agent isn't registered with the SSM endpoint. Try reinstalling SSM Agent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance isn't in valid state. Valid states are: <code>Running</code>, <code>Pending</code>,
     *         <code>Stopped</code>, and <code>Stopping</code>. Invalid states are: <code>Shutting-down</code> and
     *         <code>Terminated</code>.
     *         </p>
     *         </li>
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateManagedInstanceRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateManagedInstanceRole" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateManagedInstanceRoleResult updateManagedInstanceRole(UpdateManagedInstanceRoleRequest updateManagedInstanceRoleRequest);

    /**
     * <p>
     * Edit or change an OpsItem. You must have permission in Identity and Access Management (IAM) to update an OpsItem.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-getting-started.html">Getting
     * started with OpsCenter</a> in the <i>Amazon Web Services Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Operations engineers and IT professionals use Amazon Web Services Systems Manager OpsCenter to view, investigate,
     * and remediate operational issues impacting the performance and health of their Amazon Web Services resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter.html">OpsCenter</a> in the <i>Amazon
     * Web Services Systems Manager User Guide</i>.
     * </p>
     * 
     * @param updateOpsItemRequest
     * @return Result of the UpdateOpsItem operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws OpsItemNotFoundException
     *         The specified OpsItem ID doesn't exist. Verify the ID and try again.
     * @throws OpsItemAlreadyExistsException
     *         The OpsItem already exists.
     * @throws OpsItemLimitExceededException
     *         The request caused OpsItems to exceed one or more quotas. For information about OpsItem quotas, see <a
     *         href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/OpsCenter-learn-more.html#OpsCenter-learn-more-limits"
     *         >What are the resource limits for OpsCenter?</a>.
     * @throws OpsItemInvalidParameterException
     *         A specified parameter argument isn't valid. Verify the available arguments and try again.
     * @sample AWSSimpleSystemsManagement.UpdateOpsItem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsItem" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateOpsItemResult updateOpsItem(UpdateOpsItemRequest updateOpsItemRequest);

    /**
     * <p>
     * Amazon Web Services Systems Manager calls this API operation when you edit OpsMetadata in Application Manager.
     * </p>
     * 
     * @param updateOpsMetadataRequest
     * @return Result of the UpdateOpsMetadata operation returned by the service.
     * @throws OpsMetadataNotFoundException
     *         The OpsMetadata object doesn't exist.
     * @throws OpsMetadataInvalidArgumentException
     *         One of the arguments passed is invalid.
     * @throws OpsMetadataKeyLimitExceededException
     *         The OpsMetadata object exceeds the maximum number of OpsMetadata keys that you can assign to an
     *         application in Application Manager.
     * @throws OpsMetadataTooManyUpdatesException
     *         The system is processing too many concurrent updates. Wait a few moments and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateOpsMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsMetadata" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateOpsMetadataResult updateOpsMetadata(UpdateOpsMetadataRequest updateOpsMetadataRequest);

    /**
     * <p>
     * Modifies an existing patch baseline. Fields not specified in the request are left unchanged.
     * </p>
     * <note>
     * <p>
     * For information about valid key-value pairs in <code>PatchFilters</code> for each supported operating system
     * type, see <a>PatchFilter</a>.
     * </p>
     * </note>
     * 
     * @param updatePatchBaselineRequest
     * @return Result of the UpdatePatchBaseline operation returned by the service.
     * @throws DoesNotExistException
     *         Error returned when the ID specified for a resource, such as a maintenance window or patch baseline,
     *         doesn't exist.</p>
     *         <p>
     *         For information about resource quotas in Amazon Web Services Systems Manager, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/ssm.html#limits_ssm">Systems Manager service
     *         quotas</a> in the <i>Amazon Web Services General Reference</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdatePatchBaseline
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdatePatchBaseline" target="_top">AWS API
     *      Documentation</a>
     */
    UpdatePatchBaselineResult updatePatchBaseline(UpdatePatchBaselineRequest updatePatchBaselineRequest);

    /**
     * <p>
     * Update a resource data sync. After you create a resource data sync for a Region, you can't change the account
     * options for that sync. For example, if you create a sync in the us-east-2 (Ohio) Region and you choose the
     * <code>Include only the current account</code> option, you can't edit that sync later and choose the
     * <code>Include all accounts from my Organizations configuration</code> option. Instead, you must delete the first
     * resource data sync, and create a new one.
     * </p>
     * <note>
     * <p>
     * This API operation only supports a resource data sync that was created with a SyncFromSource
     * <code>SyncType</code>.
     * </p>
     * </note>
     * 
     * @param updateResourceDataSyncRequest
     * @return Result of the UpdateResourceDataSync operation returned by the service.
     * @throws ResourceDataSyncNotFoundException
     *         The specified sync name wasn't found.
     * @throws ResourceDataSyncInvalidConfigurationException
     *         The specified sync configuration is invalid.
     * @throws ResourceDataSyncConflictException
     *         Another <code>UpdateResourceDataSync</code> request is being processed. Wait a few minutes and try again.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AWSSimpleSystemsManagement.UpdateResourceDataSync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateResourceDataSync" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateResourceDataSyncResult updateResourceDataSync(UpdateResourceDataSyncRequest updateResourceDataSyncRequest);

    /**
     * <p>
     * <code>ServiceSetting</code> is an account-level setting for an Amazon Web Services service. This setting defines
     * how a user interacts with or uses a service or a feature of a service. For example, if an Amazon Web Services
     * service charges money to the account based on feature or service usage, then the Amazon Web Services service team
     * might create a default setting of "false". This means the user can't use this feature unless they change the
     * setting to "true" and intentionally opt in for a paid feature.
     * </p>
     * <p>
     * Services map a <code>SettingId</code> object to a setting value. Amazon Web Services services teams define the
     * default value for a <code>SettingId</code>. You can't create a new <code>SettingId</code>, but you can overwrite
     * the default value if you have the <code>ssm:UpdateServiceSetting</code> permission for the setting. Use the
     * <a>GetServiceSetting</a> API operation to view the current value. Or, use the <a>ResetServiceSetting</a> to
     * change the value back to the original value defined by the Amazon Web Services service team.
     * </p>
     * <p>
     * Update the service setting for the account.
     * </p>
     * 
     * @param updateServiceSettingRequest
     *        The request body of the UpdateServiceSetting API operation.
     * @return Result of the UpdateServiceSetting operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ServiceSettingNotFoundException
     *         The specified service setting wasn't found. Either the service name or the setting hasn't been
     *         provisioned by the Amazon Web Services service team.
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

    AWSSimpleSystemsManagementWaiters waiters();

}
