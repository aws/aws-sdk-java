/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iotthingsgraph.model.*;

/**
 * Interface for accessing AWS IoT Things Graph.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotthingsgraph.AbstractAWSIoTThingsGraph} instead.
 * </p>
 * <p>
 * <fullname>AWS IoT Things Graph</fullname>
 * <p>
 * AWS IoT Things Graph provides an integrated set of tools that enable developers to connect devices and services that
 * use different standards, such as units of measure and communication protocols. AWS IoT Things Graph makes it possible
 * to build IoT applications with little to no code by connecting devices and services and defining how they interact at
 * an abstract level.
 * </p>
 * <p>
 * For more information about how AWS IoT Things Graph works, see the <a
 * href="https://docs.aws.amazon.com/thingsgraph/latest/ug/iot-tg-whatis.html">User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoTThingsGraph {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "iotthingsgraph";

    /**
     * <p>
     * Associates a device with a concrete thing that is in the user's registry.
     * </p>
     * <p>
     * A thing can be associated with only one device at a time. If you associate a thing with a new device id, its
     * previous association will be removed.
     * </p>
     * 
     * @param associateEntityToThingRequest
     * @return Result of the AssociateEntityToThing operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.AssociateEntityToThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/AssociateEntityToThing"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateEntityToThingResult associateEntityToThing(AssociateEntityToThingRequest associateEntityToThingRequest);

    /**
     * <p>
     * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace
     * contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is
     * validated against the entities in the latest version of the user's namespace unless another namespace version is
     * specified in the request.
     * </p>
     * 
     * @param createFlowTemplateRequest
     * @return Result of the CreateFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws LimitExceededException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.CreateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFlowTemplateResult createFlowTemplate(CreateFlowTemplateRequest createFlowTemplateRequest);

    /**
     * <p>
     * Creates a system instance.
     * </p>
     * <p>
     * This action validates the system instance, prepares the deployment-related resources. For Greengrass deployments,
     * it updates the Greengrass group that is specified by the <code>greengrassGroupName</code> parameter. It also adds
     * a file to the S3 bucket specified by the <code>s3BucketName</code> parameter. You need to call
     * <code>DeploySystemInstance</code> after running this action.
     * </p>
     * <p>
     * For Greengrass deployments, since this action modifies and adds resources to a Greengrass group and an S3 bucket
     * on the caller's behalf, the calling identity must have write permissions to both the specified Greengrass group
     * and S3 bucket. Otherwise, the call will fail with an authorization error.
     * </p>
     * <p>
     * For cloud deployments, this action requires a <code>flowActionsRoleArn</code> value. This is an IAM role that has
     * permissions to access AWS services, such as AWS Lambda and AWS IoT, that the flow uses when it executes.
     * </p>
     * <p>
     * If the definition document doesn't specify a version of the user's namespace, the latest version will be used by
     * default.
     * </p>
     * 
     * @param createSystemInstanceRequest
     * @return Result of the CreateSystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws LimitExceededException
     * @sample AWSIoTThingsGraph.CreateSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSystemInstanceResult createSystemInstance(CreateSystemInstanceRequest createSystemInstanceRequest);

    /**
     * <p>
     * Creates a system. The system is validated against the entities in the latest version of the user's namespace
     * unless another namespace version is specified in the request.
     * </p>
     * 
     * @param createSystemTemplateRequest
     * @return Result of the CreateSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.CreateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSystemTemplateResult createSystemTemplate(CreateSystemTemplateRequest createSystemTemplateRequest);

    /**
     * <p>
     * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy.
     * Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow
     * taken at the time of deployment).
     * </p>
     * 
     * @param deleteFlowTemplateRequest
     * @return Result of the DeleteFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeleteFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFlowTemplateResult deleteFlowTemplate(DeleteFlowTemplateRequest deleteFlowTemplateRequest);

    /**
     * <p>
     * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and
     * flows that use entities in the namespace before performing this action.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes a system instance. Only system instances that have never been deployed, or that have been undeployed can
     * be deleted.
     * </p>
     * <p>
     * Users can create a new system instance that has the same ID as a deleted system instance.
     * </p>
     * 
     * @param deleteSystemInstanceRequest
     * @return Result of the DeleteSystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeleteSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSystemInstanceResult deleteSystemInstance(DeleteSystemInstanceRequest deleteSystemInstanceRequest);

    /**
     * <p>
     * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain
     * the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
     * </p>
     * 
     * @param deleteSystemTemplateRequest
     * @return Result of the DeleteSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeleteSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSystemTemplateResult deleteSystemTemplate(DeleteSystemTemplateRequest deleteSystemTemplateRequest);

    /**
     * <p>
     * <b>Greengrass and Cloud Deployments</b>
     * </p>
     * <p>
     * Deploys the system instance to the target specified in <code>CreateSystemInstance</code>.
     * </p>
     * <p>
     * <b>Greengrass Deployments</b>
     * </p>
     * <p>
     * If the system or any workflows and entities have been updated before this action is called, then the deployment
     * will create a new Amazon Simple Storage Service resource file and then deploy it.
     * </p>
     * <p>
     * Since this action creates a Greengrass deployment on the caller's behalf, the calling identity must have write
     * permissions to the specified Greengrass group. Otherwise, the call will fail with an authorization error.
     * </p>
     * <p>
     * For information about the artifacts that get added to your Greengrass core device when you use this API, see <a
     * href="https://docs.aws.amazon.com/thingsgraph/latest/ug/iot-tg-greengrass.html">AWS IoT Things Graph and AWS IoT
     * Greengrass</a>.
     * </p>
     * 
     * @param deploySystemInstanceRequest
     * @return Result of the DeploySystemInstance operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.DeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeploySystemInstanceResult deploySystemInstance(DeploySystemInstanceRequest deploySystemInstanceRequest);

    /**
     * <p>
     * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be
     * deployed, but existing deployments will continue to run.
     * </p>
     * 
     * @param deprecateFlowTemplateRequest
     * @return Result of the DeprecateFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.DeprecateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeprecateFlowTemplateResult deprecateFlowTemplate(DeprecateFlowTemplateRequest deprecateFlowTemplateRequest);

    /**
     * <p>
     * Deprecates the specified system.
     * </p>
     * 
     * @param deprecateSystemTemplateRequest
     * @return Result of the DeprecateSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.DeprecateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    DeprecateSystemTemplateResult deprecateSystemTemplate(DeprecateSystemTemplateRequest deprecateSystemTemplateRequest);

    /**
     * <p>
     * Gets the latest version of the user's namespace and the public version that it is tracking.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @return Result of the DescribeNamespace operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DescribeNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNamespaceResult describeNamespace(DescribeNamespaceRequest describeNamespaceRequest);

    /**
     * <p>
     * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to
     * dissociate because only one entity of a particular type can be associated with a thing.
     * </p>
     * 
     * @param dissociateEntityFromThingRequest
     * @return Result of the DissociateEntityFromThing operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.DissociateEntityFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DissociateEntityFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    DissociateEntityFromThingResult dissociateEntityFromThing(DissociateEntityFromThingRequest dissociateEntityFromThingRequest);

    /**
     * <p>
     * Gets definitions of the specified entities. Uses the latest version of the user's namespace by default. This API
     * returns the following TDM entities.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Properties
     * </p>
     * </li>
     * <li>
     * <p>
     * States
     * </p>
     * </li>
     * <li>
     * <p>
     * Events
     * </p>
     * </li>
     * <li>
     * <p>
     * Actions
     * </p>
     * </li>
     * <li>
     * <p>
     * Capabilities
     * </p>
     * </li>
     * <li>
     * <p>
     * Mappings
     * </p>
     * </li>
     * <li>
     * <p>
     * Devices
     * </p>
     * </li>
     * <li>
     * <p>
     * Device Models
     * </p>
     * </li>
     * <li>
     * <p>
     * Services
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action doesn't return definitions for systems, flows, and deployments.
     * </p>
     * 
     * @param getEntitiesRequest
     * @return Result of the GetEntities operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.GetEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetEntities" target="_top">AWS API
     *      Documentation</a>
     */
    GetEntitiesResult getEntities(GetEntitiesRequest getEntitiesRequest);

    /**
     * <p>
     * Gets the latest version of the <code>DefinitionDocument</code> and <code>FlowTemplateSummary</code> for the
     * specified workflow.
     * </p>
     * 
     * @param getFlowTemplateRequest
     * @return Result of the GetFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    GetFlowTemplateResult getFlowTemplate(GetFlowTemplateRequest getFlowTemplateRequest);

    /**
     * <p>
     * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been
     * deprecated, this action will return revisions that occurred before the deprecation. This action won't work for
     * workflows that have been deleted.
     * </p>
     * 
     * @param getFlowTemplateRevisionsRequest
     * @return Result of the GetFlowTemplateRevisions operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetFlowTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    GetFlowTemplateRevisionsResult getFlowTemplateRevisions(GetFlowTemplateRevisionsRequest getFlowTemplateRevisionsRequest);

    /**
     * <p>
     * Gets the status of a namespace deletion task.
     * </p>
     * 
     * @param getNamespaceDeletionStatusRequest
     * @return Result of the GetNamespaceDeletionStatus operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.GetNamespaceDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetNamespaceDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetNamespaceDeletionStatusResult getNamespaceDeletionStatus(GetNamespaceDeletionStatusRequest getNamespaceDeletionStatusRequest);

    /**
     * <p>
     * Gets a system instance.
     * </p>
     * 
     * @param getSystemInstanceRequest
     * @return Result of the GetSystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    GetSystemInstanceResult getSystemInstance(GetSystemInstanceRequest getSystemInstanceRequest);

    /**
     * <p>
     * Gets a system.
     * </p>
     * 
     * @param getSystemTemplateRequest
     * @return Result of the GetSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetSystemTemplateResult getSystemTemplate(GetSystemTemplateRequest getSystemTemplateRequest);

    /**
     * <p>
     * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system
     * has been deprecated, this action will return the revisions that occurred before its deprecation. This action
     * won't work with systems that have been deleted.
     * </p>
     * 
     * @param getSystemTemplateRevisionsRequest
     * @return Result of the GetSystemTemplateRevisions operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.GetSystemTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    GetSystemTemplateRevisionsResult getSystemTemplateRevisions(GetSystemTemplateRevisionsRequest getSystemTemplateRevisionsRequest);

    /**
     * <p>
     * Gets the status of the specified upload.
     * </p>
     * 
     * @param getUploadStatusRequest
     * @return Result of the GetUploadStatus operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.GetUploadStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetUploadStatus" target="_top">AWS
     *      API Documentation</a>
     */
    GetUploadStatusResult getUploadStatus(GetUploadStatusRequest getUploadStatusRequest);

    /**
     * <p>
     * Returns a list of objects that contain information about events in a flow execution.
     * </p>
     * 
     * @param listFlowExecutionMessagesRequest
     * @return Result of the ListFlowExecutionMessages operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.ListFlowExecutionMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListFlowExecutionMessages"
     *      target="_top">AWS API Documentation</a>
     */
    ListFlowExecutionMessagesResult listFlowExecutionMessages(ListFlowExecutionMessagesRequest listFlowExecutionMessagesRequest);

    /**
     * <p>
     * Lists all tags on an AWS IoT Things Graph resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Searches for entities of the specified type. You can search for entities in your namespace and the public
     * namespace that you're tracking.
     * </p>
     * 
     * @param searchEntitiesRequest
     * @return Result of the SearchEntities operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.SearchEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchEntities" target="_top">AWS
     *      API Documentation</a>
     */
    SearchEntitiesResult searchEntities(SearchEntitiesRequest searchEntitiesRequest);

    /**
     * <p>
     * Searches for AWS IoT Things Graph workflow execution instances.
     * </p>
     * 
     * @param searchFlowExecutionsRequest
     * @return Result of the SearchFlowExecutions operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @sample AWSIoTThingsGraph.SearchFlowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    SearchFlowExecutionsResult searchFlowExecutions(SearchFlowExecutionsRequest searchFlowExecutionsRequest);

    /**
     * <p>
     * Searches for summary information about workflows.
     * </p>
     * 
     * @param searchFlowTemplatesRequest
     * @return Result of the SearchFlowTemplates operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.SearchFlowTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    SearchFlowTemplatesResult searchFlowTemplates(SearchFlowTemplatesRequest searchFlowTemplatesRequest);

    /**
     * <p>
     * Searches for system instances in the user's account.
     * </p>
     * 
     * @param searchSystemInstancesRequest
     * @return Result of the SearchSystemInstances operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.SearchSystemInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemInstances"
     *      target="_top">AWS API Documentation</a>
     */
    SearchSystemInstancesResult searchSystemInstances(SearchSystemInstancesRequest searchSystemInstancesRequest);

    /**
     * <p>
     * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to
     * return only systems that use the specified workflow.
     * </p>
     * 
     * @param searchSystemTemplatesRequest
     * @return Result of the SearchSystemTemplates operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.SearchSystemTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    SearchSystemTemplatesResult searchSystemTemplates(SearchSystemTemplatesRequest searchSystemTemplatesRequest);

    /**
     * <p>
     * Searches for things associated with the specified entity. You can search by both device and device model.
     * </p>
     * <p>
     * For example, if two different devices, camera1 and camera2, implement the camera device model, the user can
     * associate thing1 to camera1 and thing2 to camera2. <code>SearchThings(camera2)</code> will return only thing2,
     * but <code>SearchThings(camera)</code> will return both thing1 and thing2.
     * </p>
     * <p>
     * This action searches for exact matches and doesn't perform partial text matching.
     * </p>
     * 
     * @param searchThingsRequest
     * @return Result of the SearchThings operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.SearchThings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchThings" target="_top">AWS
     *      API Documentation</a>
     */
    SearchThingsResult searchThings(SearchThingsRequest searchThingsRequest);

    /**
     * <p>
     * Creates a tag for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a system instance from its target (Cloud or Greengrass).
     * </p>
     * 
     * @param undeploySystemInstanceRequest
     * @return Result of the UndeploySystemInstance operation returned by the service.
     * @throws InvalidRequestException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @sample AWSIoTThingsGraph.UndeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UndeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    UndeploySystemInstanceResult undeploySystemInstance(UndeploySystemInstanceRequest undeploySystemInstanceRequest);

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceAlreadyExistsException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the
     * changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new
     * workflow with a different ID), and update the copy. The workflow can contain only entities in the specified
     * namespace.
     * </p>
     * 
     * @param updateFlowTemplateRequest
     * @return Result of the UpdateFlowTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.UpdateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFlowTemplateResult updateFlowTemplate(UpdateFlowTemplateRequest updateFlowTemplateRequest);

    /**
     * <p>
     * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that
     * uses the system will see the changes in the system when it is redeployed.
     * </p>
     * 
     * @param updateSystemTemplateRequest
     * @return Result of the UpdateSystemTemplate operation returned by the service.
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalFailureException
     * @sample AWSIoTThingsGraph.UpdateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSystemTemplateResult updateSystemTemplate(UpdateSystemTemplateRequest updateSystemTemplateRequest);

    /**
     * <p>
     * Asynchronously uploads one or more entity definitions to the user's namespace. The <code>document</code>
     * parameter is required if <code>syncWithPublicNamespace</code> and <code>deleteExistingEntites</code> are false.
     * If the <code>syncWithPublicNamespace</code> parameter is set to <code>true</code>, the user's namespace will
     * synchronize with the latest version of the public namespace. If <code>deprecateExistingEntities</code> is set to
     * true, all entities in the latest version will be deleted before the new <code>DefinitionDocument</code> is
     * uploaded.
     * </p>
     * <p>
     * When a user uploads entity definitions for the first time, the service creates a new namespace for the user. The
     * new namespace tracks the public namespace. Currently users can have only one namespace. The namespace version
     * increments whenever a user uploads entity definitions that are backwards-incompatible and whenever a user sets
     * the <code>syncWithPublicNamespace</code> parameter or the <code>deprecateExistingEntities</code> parameter to
     * <code>true</code>.
     * </p>
     * <p>
     * The IDs for all of the entities should be in URN format. Each entity must be in the user's namespace. Users can't
     * create entities in the public namespace, but entity definitions can refer to entities in the public namespace.
     * </p>
     * <p>
     * Valid entities are <code>Device</code>, <code>DeviceModel</code>, <code>Service</code>, <code>Capability</code>,
     * <code>State</code>, <code>Action</code>, <code>Event</code>, <code>Property</code>, <code>Mapping</code>,
     * <code>Enum</code>.
     * </p>
     * 
     * @param uploadEntityDefinitionsRequest
     * @return Result of the UploadEntityDefinitions operation returned by the service.
     * @throws InvalidRequestException
     * @throws InternalFailureException
     * @throws ThrottlingException
     * @sample AWSIoTThingsGraph.UploadEntityDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UploadEntityDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    UploadEntityDefinitionsResult uploadEntityDefinitions(UploadEntityDefinitionsRequest uploadEntityDefinitionsRequest);

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
