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

import com.amazonaws.services.iotthingsgraph.model.*;

/**
 * Interface for accessing AWS IoT Things Graph asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iotthingsgraph.AbstractAWSIoTThingsGraphAsync} instead.
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
public interface AWSIoTThingsGraphAsync extends AWSIoTThingsGraph {

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
     * @return A Java Future containing the result of the AssociateEntityToThing operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.AssociateEntityToThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/AssociateEntityToThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateEntityToThingResult> associateEntityToThingAsync(AssociateEntityToThingRequest associateEntityToThingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateEntityToThing operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.AssociateEntityToThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/AssociateEntityToThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateEntityToThingResult> associateEntityToThingAsync(AssociateEntityToThingRequest associateEntityToThingRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateEntityToThingRequest, AssociateEntityToThingResult> asyncHandler);

    /**
     * <p>
     * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace
     * contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is
     * validated against the entities in the latest version of the user's namespace unless another namespace version is
     * specified in the request.
     * </p>
     * 
     * @param createFlowTemplateRequest
     * @return A Java Future containing the result of the CreateFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.CreateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowTemplateResult> createFlowTemplateAsync(CreateFlowTemplateRequest createFlowTemplateRequest);

    /**
     * <p>
     * Creates a workflow template. Workflows can be created only in the user's namespace. (The public namespace
     * contains only entities.) The workflow can contain only entities in the specified namespace. The workflow is
     * validated against the entities in the latest version of the user's namespace unless another namespace version is
     * specified in the request.
     * </p>
     * 
     * @param createFlowTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.CreateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFlowTemplateResult> createFlowTemplateAsync(CreateFlowTemplateRequest createFlowTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFlowTemplateRequest, CreateFlowTemplateResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.CreateSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSystemInstanceResult> createSystemInstanceAsync(CreateSystemInstanceRequest createSystemInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.CreateSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSystemInstanceResult> createSystemInstanceAsync(CreateSystemInstanceRequest createSystemInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSystemInstanceRequest, CreateSystemInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a system. The system is validated against the entities in the latest version of the user's namespace
     * unless another namespace version is specified in the request.
     * </p>
     * 
     * @param createSystemTemplateRequest
     * @return A Java Future containing the result of the CreateSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.CreateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSystemTemplateResult> createSystemTemplateAsync(CreateSystemTemplateRequest createSystemTemplateRequest);

    /**
     * <p>
     * Creates a system. The system is validated against the entities in the latest version of the user's namespace
     * unless another namespace version is specified in the request.
     * </p>
     * 
     * @param createSystemTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.CreateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/CreateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSystemTemplateResult> createSystemTemplateAsync(CreateSystemTemplateRequest createSystemTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSystemTemplateRequest, CreateSystemTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy.
     * Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow
     * taken at the time of deployment).
     * </p>
     * 
     * @param deleteFlowTemplateRequest
     * @return A Java Future containing the result of the DeleteFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeleteFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowTemplateResult> deleteFlowTemplateAsync(DeleteFlowTemplateRequest deleteFlowTemplateRequest);

    /**
     * <p>
     * Deletes a workflow. Any new system or deployment that contains this workflow will fail to update or deploy.
     * Existing deployments that contain the workflow will continue to run (since they use a snapshot of the workflow
     * taken at the time of deployment).
     * </p>
     * 
     * @param deleteFlowTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeleteFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFlowTemplateResult> deleteFlowTemplateAsync(DeleteFlowTemplateRequest deleteFlowTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFlowTemplateRequest, DeleteFlowTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and
     * flows that use entities in the namespace before performing this action.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes the specified namespace. This action deletes all of the entities in the namespace. Delete the systems and
     * flows that use entities in the namespace before performing this action.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeleteSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSystemInstanceResult> deleteSystemInstanceAsync(DeleteSystemInstanceRequest deleteSystemInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeleteSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSystemInstanceResult> deleteSystemInstanceAsync(DeleteSystemInstanceRequest deleteSystemInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSystemInstanceRequest, DeleteSystemInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain
     * the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
     * </p>
     * 
     * @param deleteSystemTemplateRequest
     * @return A Java Future containing the result of the DeleteSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeleteSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSystemTemplateResult> deleteSystemTemplateAsync(DeleteSystemTemplateRequest deleteSystemTemplateRequest);

    /**
     * <p>
     * Deletes a system. New deployments can't contain the system after its deletion. Existing deployments that contain
     * the system will continue to work because they use a snapshot of the system that is taken when it is deployed.
     * </p>
     * 
     * @param deleteSystemTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeleteSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeleteSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSystemTemplateResult> deleteSystemTemplateAsync(DeleteSystemTemplateRequest deleteSystemTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSystemTemplateRequest, DeleteSystemTemplateResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeploySystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeploySystemInstanceResult> deploySystemInstanceAsync(DeploySystemInstanceRequest deploySystemInstanceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeploySystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeploySystemInstanceResult> deploySystemInstanceAsync(DeploySystemInstanceRequest deploySystemInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeploySystemInstanceRequest, DeploySystemInstanceResult> asyncHandler);

    /**
     * <p>
     * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be
     * deployed, but existing deployments will continue to run.
     * </p>
     * 
     * @param deprecateFlowTemplateRequest
     * @return A Java Future containing the result of the DeprecateFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeprecateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeprecateFlowTemplateResult> deprecateFlowTemplateAsync(DeprecateFlowTemplateRequest deprecateFlowTemplateRequest);

    /**
     * <p>
     * Deprecates the specified workflow. This action marks the workflow for deletion. Deprecated flows can't be
     * deployed, but existing deployments will continue to run.
     * </p>
     * 
     * @param deprecateFlowTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeprecateFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeprecateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeprecateFlowTemplateResult> deprecateFlowTemplateAsync(DeprecateFlowTemplateRequest deprecateFlowTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeprecateFlowTemplateRequest, DeprecateFlowTemplateResult> asyncHandler);

    /**
     * <p>
     * Deprecates the specified system.
     * </p>
     * 
     * @param deprecateSystemTemplateRequest
     * @return A Java Future containing the result of the DeprecateSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DeprecateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeprecateSystemTemplateResult> deprecateSystemTemplateAsync(DeprecateSystemTemplateRequest deprecateSystemTemplateRequest);

    /**
     * <p>
     * Deprecates the specified system.
     * </p>
     * 
     * @param deprecateSystemTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeprecateSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DeprecateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeprecateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeprecateSystemTemplateResult> deprecateSystemTemplateAsync(DeprecateSystemTemplateRequest deprecateSystemTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeprecateSystemTemplateRequest, DeprecateSystemTemplateResult> asyncHandler);

    /**
     * <p>
     * Gets the latest version of the user's namespace and the public version that it is tracking.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @return A Java Future containing the result of the DescribeNamespace operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DescribeNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(DescribeNamespaceRequest describeNamespaceRequest);

    /**
     * <p>
     * Gets the latest version of the user's namespace and the public version that it is tracking.
     * </p>
     * 
     * @param describeNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNamespace operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DescribeNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DescribeNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNamespaceResult> describeNamespaceAsync(DescribeNamespaceRequest describeNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNamespaceRequest, DescribeNamespaceResult> asyncHandler);

    /**
     * <p>
     * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to
     * dissociate because only one entity of a particular type can be associated with a thing.
     * </p>
     * 
     * @param dissociateEntityFromThingRequest
     * @return A Java Future containing the result of the DissociateEntityFromThing operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.DissociateEntityFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DissociateEntityFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DissociateEntityFromThingResult> dissociateEntityFromThingAsync(
            DissociateEntityFromThingRequest dissociateEntityFromThingRequest);

    /**
     * <p>
     * Dissociates a device entity from a concrete thing. The action takes only the type of the entity that you need to
     * dissociate because only one entity of a particular type can be associated with a thing.
     * </p>
     * 
     * @param dissociateEntityFromThingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DissociateEntityFromThing operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.DissociateEntityFromThing
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DissociateEntityFromThing"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DissociateEntityFromThingResult> dissociateEntityFromThingAsync(
            DissociateEntityFromThingRequest dissociateEntityFromThingRequest,
            com.amazonaws.handlers.AsyncHandler<DissociateEntityFromThingRequest, DissociateEntityFromThingResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetEntities operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEntitiesResult> getEntitiesAsync(GetEntitiesRequest getEntitiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEntities operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetEntities" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEntitiesResult> getEntitiesAsync(GetEntitiesRequest getEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<GetEntitiesRequest, GetEntitiesResult> asyncHandler);

    /**
     * <p>
     * Gets the latest version of the <code>DefinitionDocument</code> and <code>FlowTemplateSummary</code> for the
     * specified workflow.
     * </p>
     * 
     * @param getFlowTemplateRequest
     * @return A Java Future containing the result of the GetFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFlowTemplateResult> getFlowTemplateAsync(GetFlowTemplateRequest getFlowTemplateRequest);

    /**
     * <p>
     * Gets the latest version of the <code>DefinitionDocument</code> and <code>FlowTemplateSummary</code> for the
     * specified workflow.
     * </p>
     * 
     * @param getFlowTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplate" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFlowTemplateResult> getFlowTemplateAsync(GetFlowTemplateRequest getFlowTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetFlowTemplateRequest, GetFlowTemplateResult> asyncHandler);

    /**
     * <p>
     * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been
     * deprecated, this action will return revisions that occurred before the deprecation. This action won't work for
     * workflows that have been deleted.
     * </p>
     * 
     * @param getFlowTemplateRevisionsRequest
     * @return A Java Future containing the result of the GetFlowTemplateRevisions operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetFlowTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFlowTemplateRevisionsResult> getFlowTemplateRevisionsAsync(GetFlowTemplateRevisionsRequest getFlowTemplateRevisionsRequest);

    /**
     * <p>
     * Gets revisions of the specified workflow. Only the last 100 revisions are stored. If the workflow has been
     * deprecated, this action will return revisions that occurred before the deprecation. This action won't work for
     * workflows that have been deleted.
     * </p>
     * 
     * @param getFlowTemplateRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFlowTemplateRevisions operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetFlowTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetFlowTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFlowTemplateRevisionsResult> getFlowTemplateRevisionsAsync(GetFlowTemplateRevisionsRequest getFlowTemplateRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFlowTemplateRevisionsRequest, GetFlowTemplateRevisionsResult> asyncHandler);

    /**
     * <p>
     * Gets the status of a namespace deletion task.
     * </p>
     * 
     * @param getNamespaceDeletionStatusRequest
     * @return A Java Future containing the result of the GetNamespaceDeletionStatus operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetNamespaceDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetNamespaceDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNamespaceDeletionStatusResult> getNamespaceDeletionStatusAsync(
            GetNamespaceDeletionStatusRequest getNamespaceDeletionStatusRequest);

    /**
     * <p>
     * Gets the status of a namespace deletion task.
     * </p>
     * 
     * @param getNamespaceDeletionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNamespaceDeletionStatus operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetNamespaceDeletionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetNamespaceDeletionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetNamespaceDeletionStatusResult> getNamespaceDeletionStatusAsync(
            GetNamespaceDeletionStatusRequest getNamespaceDeletionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetNamespaceDeletionStatusRequest, GetNamespaceDeletionStatusResult> asyncHandler);

    /**
     * <p>
     * Gets a system instance.
     * </p>
     * 
     * @param getSystemInstanceRequest
     * @return A Java Future containing the result of the GetSystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSystemInstanceResult> getSystemInstanceAsync(GetSystemInstanceRequest getSystemInstanceRequest);

    /**
     * <p>
     * Gets a system instance.
     * </p>
     * 
     * @param getSystemInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetSystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSystemInstanceResult> getSystemInstanceAsync(GetSystemInstanceRequest getSystemInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetSystemInstanceRequest, GetSystemInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets a system.
     * </p>
     * 
     * @param getSystemTemplateRequest
     * @return A Java Future containing the result of the GetSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSystemTemplateResult> getSystemTemplateAsync(GetSystemTemplateRequest getSystemTemplateRequest);

    /**
     * <p>
     * Gets a system.
     * </p>
     * 
     * @param getSystemTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSystemTemplateResult> getSystemTemplateAsync(GetSystemTemplateRequest getSystemTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetSystemTemplateRequest, GetSystemTemplateResult> asyncHandler);

    /**
     * <p>
     * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system
     * has been deprecated, this action will return the revisions that occurred before its deprecation. This action
     * won't work with systems that have been deleted.
     * </p>
     * 
     * @param getSystemTemplateRevisionsRequest
     * @return A Java Future containing the result of the GetSystemTemplateRevisions operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetSystemTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSystemTemplateRevisionsResult> getSystemTemplateRevisionsAsync(
            GetSystemTemplateRevisionsRequest getSystemTemplateRevisionsRequest);

    /**
     * <p>
     * Gets revisions made to the specified system template. Only the previous 100 revisions are stored. If the system
     * has been deprecated, this action will return the revisions that occurred before its deprecation. This action
     * won't work with systems that have been deleted.
     * </p>
     * 
     * @param getSystemTemplateRevisionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSystemTemplateRevisions operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetSystemTemplateRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetSystemTemplateRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSystemTemplateRevisionsResult> getSystemTemplateRevisionsAsync(
            GetSystemTemplateRevisionsRequest getSystemTemplateRevisionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSystemTemplateRevisionsRequest, GetSystemTemplateRevisionsResult> asyncHandler);

    /**
     * <p>
     * Gets the status of the specified upload.
     * </p>
     * 
     * @param getUploadStatusRequest
     * @return A Java Future containing the result of the GetUploadStatus operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.GetUploadStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetUploadStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUploadStatusResult> getUploadStatusAsync(GetUploadStatusRequest getUploadStatusRequest);

    /**
     * <p>
     * Gets the status of the specified upload.
     * </p>
     * 
     * @param getUploadStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUploadStatus operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.GetUploadStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetUploadStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUploadStatusResult> getUploadStatusAsync(GetUploadStatusRequest getUploadStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetUploadStatusRequest, GetUploadStatusResult> asyncHandler);

    /**
     * <p>
     * Returns a list of objects that contain information about events in a flow execution.
     * </p>
     * 
     * @param listFlowExecutionMessagesRequest
     * @return A Java Future containing the result of the ListFlowExecutionMessages operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.ListFlowExecutionMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListFlowExecutionMessages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowExecutionMessagesResult> listFlowExecutionMessagesAsync(
            ListFlowExecutionMessagesRequest listFlowExecutionMessagesRequest);

    /**
     * <p>
     * Returns a list of objects that contain information about events in a flow execution.
     * </p>
     * 
     * @param listFlowExecutionMessagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFlowExecutionMessages operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.ListFlowExecutionMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListFlowExecutionMessages"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFlowExecutionMessagesResult> listFlowExecutionMessagesAsync(
            ListFlowExecutionMessagesRequest listFlowExecutionMessagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListFlowExecutionMessagesRequest, ListFlowExecutionMessagesResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on an AWS IoT Things Graph resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on an AWS IoT Things Graph resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Searches for entities of the specified type. You can search for entities in your namespace and the public
     * namespace that you're tracking.
     * </p>
     * 
     * @param searchEntitiesRequest
     * @return A Java Future containing the result of the SearchEntities operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.SearchEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchEntitiesResult> searchEntitiesAsync(SearchEntitiesRequest searchEntitiesRequest);

    /**
     * <p>
     * Searches for entities of the specified type. You can search for entities in your namespace and the public
     * namespace that you're tracking.
     * </p>
     * 
     * @param searchEntitiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchEntities operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.SearchEntities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchEntities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchEntitiesResult> searchEntitiesAsync(SearchEntitiesRequest searchEntitiesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchEntitiesRequest, SearchEntitiesResult> asyncHandler);

    /**
     * <p>
     * Searches for AWS IoT Things Graph workflow execution instances.
     * </p>
     * 
     * @param searchFlowExecutionsRequest
     * @return A Java Future containing the result of the SearchFlowExecutions operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.SearchFlowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchFlowExecutionsResult> searchFlowExecutionsAsync(SearchFlowExecutionsRequest searchFlowExecutionsRequest);

    /**
     * <p>
     * Searches for AWS IoT Things Graph workflow execution instances.
     * </p>
     * 
     * @param searchFlowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFlowExecutions operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.SearchFlowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchFlowExecutionsResult> searchFlowExecutionsAsync(SearchFlowExecutionsRequest searchFlowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFlowExecutionsRequest, SearchFlowExecutionsResult> asyncHandler);

    /**
     * <p>
     * Searches for summary information about workflows.
     * </p>
     * 
     * @param searchFlowTemplatesRequest
     * @return A Java Future containing the result of the SearchFlowTemplates operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.SearchFlowTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchFlowTemplatesResult> searchFlowTemplatesAsync(SearchFlowTemplatesRequest searchFlowTemplatesRequest);

    /**
     * <p>
     * Searches for summary information about workflows.
     * </p>
     * 
     * @param searchFlowTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchFlowTemplates operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.SearchFlowTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchFlowTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchFlowTemplatesResult> searchFlowTemplatesAsync(SearchFlowTemplatesRequest searchFlowTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchFlowTemplatesRequest, SearchFlowTemplatesResult> asyncHandler);

    /**
     * <p>
     * Searches for system instances in the user's account.
     * </p>
     * 
     * @param searchSystemInstancesRequest
     * @return A Java Future containing the result of the SearchSystemInstances operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.SearchSystemInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchSystemInstancesResult> searchSystemInstancesAsync(SearchSystemInstancesRequest searchSystemInstancesRequest);

    /**
     * <p>
     * Searches for system instances in the user's account.
     * </p>
     * 
     * @param searchSystemInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSystemInstances operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.SearchSystemInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchSystemInstancesResult> searchSystemInstancesAsync(SearchSystemInstancesRequest searchSystemInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSystemInstancesRequest, SearchSystemInstancesResult> asyncHandler);

    /**
     * <p>
     * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to
     * return only systems that use the specified workflow.
     * </p>
     * 
     * @param searchSystemTemplatesRequest
     * @return A Java Future containing the result of the SearchSystemTemplates operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.SearchSystemTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchSystemTemplatesResult> searchSystemTemplatesAsync(SearchSystemTemplatesRequest searchSystemTemplatesRequest);

    /**
     * <p>
     * Searches for summary information about systems in the user's account. You can filter by the ID of a workflow to
     * return only systems that use the specified workflow.
     * </p>
     * 
     * @param searchSystemTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchSystemTemplates operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.SearchSystemTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchSystemTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchSystemTemplatesResult> searchSystemTemplatesAsync(SearchSystemTemplatesRequest searchSystemTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchSystemTemplatesRequest, SearchSystemTemplatesResult> asyncHandler);

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
     * @return A Java Future containing the result of the SearchThings operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.SearchThings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchThings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchThingsResult> searchThingsAsync(SearchThingsRequest searchThingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchThings operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.SearchThings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/SearchThings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchThingsResult> searchThingsAsync(SearchThingsRequest searchThingsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchThingsRequest, SearchThingsResult> asyncHandler);

    /**
     * <p>
     * Creates a tag for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates a tag for the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a system instance from its target (Cloud or Greengrass).
     * </p>
     * 
     * @param undeploySystemInstanceRequest
     * @return A Java Future containing the result of the UndeploySystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.UndeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UndeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UndeploySystemInstanceResult> undeploySystemInstanceAsync(UndeploySystemInstanceRequest undeploySystemInstanceRequest);

    /**
     * <p>
     * Removes a system instance from its target (Cloud or Greengrass).
     * </p>
     * 
     * @param undeploySystemInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UndeploySystemInstance operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.UndeploySystemInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UndeploySystemInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UndeploySystemInstanceResult> undeploySystemInstanceAsync(UndeploySystemInstanceRequest undeploySystemInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UndeploySystemInstanceRequest, UndeploySystemInstanceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from the specified resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the
     * changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new
     * workflow with a different ID), and update the copy. The workflow can contain only entities in the specified
     * namespace.
     * </p>
     * 
     * @param updateFlowTemplateRequest
     * @return A Java Future containing the result of the UpdateFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.UpdateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowTemplateResult> updateFlowTemplateAsync(UpdateFlowTemplateRequest updateFlowTemplateRequest);

    /**
     * <p>
     * Updates the specified workflow. All deployed systems and system instances that use the workflow will see the
     * changes in the flow when it is redeployed. If you don't want this behavior, copy the workflow (creating a new
     * workflow with a different ID), and update the copy. The workflow can contain only entities in the specified
     * namespace.
     * </p>
     * 
     * @param updateFlowTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFlowTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.UpdateFlowTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateFlowTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFlowTemplateResult> updateFlowTemplateAsync(UpdateFlowTemplateRequest updateFlowTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFlowTemplateRequest, UpdateFlowTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that
     * uses the system will see the changes in the system when it is redeployed.
     * </p>
     * 
     * @param updateSystemTemplateRequest
     * @return A Java Future containing the result of the UpdateSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.UpdateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSystemTemplateResult> updateSystemTemplateAsync(UpdateSystemTemplateRequest updateSystemTemplateRequest);

    /**
     * <p>
     * Updates the specified system. You don't need to run this action after updating a workflow. Any deployment that
     * uses the system will see the changes in the system when it is redeployed.
     * </p>
     * 
     * @param updateSystemTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSystemTemplate operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.UpdateSystemTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UpdateSystemTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSystemTemplateResult> updateSystemTemplateAsync(UpdateSystemTemplateRequest updateSystemTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSystemTemplateRequest, UpdateSystemTemplateResult> asyncHandler);

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
     * @return A Java Future containing the result of the UploadEntityDefinitions operation returned by the service.
     * @sample AWSIoTThingsGraphAsync.UploadEntityDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UploadEntityDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UploadEntityDefinitionsResult> uploadEntityDefinitionsAsync(UploadEntityDefinitionsRequest uploadEntityDefinitionsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadEntityDefinitions operation returned by the service.
     * @sample AWSIoTThingsGraphAsyncHandler.UploadEntityDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/UploadEntityDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UploadEntityDefinitionsResult> uploadEntityDefinitionsAsync(UploadEntityDefinitionsRequest uploadEntityDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<UploadEntityDefinitionsRequest, UploadEntityDefinitionsResult> asyncHandler);

}
