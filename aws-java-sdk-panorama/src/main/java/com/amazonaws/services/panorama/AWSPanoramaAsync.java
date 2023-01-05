/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.panorama;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;

/**
 * Interface for accessing Panorama asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.panorama.AbstractAWSPanoramaAsync} instead.
 * </p>
 * <p>
 * <p>
 * <fullname>AWS Panorama</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Panorama API Reference</i>. For an introduction to the service, see <a
 * href="https://docs.aws.amazon.com/panorama/latest/dev/panorama-welcome.html">What is AWS Panorama?</a> in the <i>AWS
 * Panorama Developer Guide</i>.
 * </p>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSPanoramaAsync extends AWSPanorama {

    /**
     * <p>
     * Creates an application instance and deploys it to a device.
     * </p>
     * 
     * @param createApplicationInstanceRequest
     * @return A Java Future containing the result of the CreateApplicationInstance operation returned by the service.
     * @sample AWSPanoramaAsync.CreateApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationInstanceResult> createApplicationInstanceAsync(
            CreateApplicationInstanceRequest createApplicationInstanceRequest);

    /**
     * <p>
     * Creates an application instance and deploys it to a device.
     * </p>
     * 
     * @param createApplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplicationInstance operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.CreateApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationInstanceResult> createApplicationInstanceAsync(
            CreateApplicationInstanceRequest createApplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationInstanceRequest, CreateApplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a job to run on one or more devices. A job can update a device's software or reboot it.
     * </p>
     * 
     * @param createJobForDevicesRequest
     * @return A Java Future containing the result of the CreateJobForDevices operation returned by the service.
     * @sample AWSPanoramaAsync.CreateJobForDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateJobForDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateJobForDevicesResult> createJobForDevicesAsync(CreateJobForDevicesRequest createJobForDevicesRequest);

    /**
     * <p>
     * Creates a job to run on one or more devices. A job can update a device's software or reboot it.
     * </p>
     * 
     * @param createJobForDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateJobForDevices operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.CreateJobForDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateJobForDevices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateJobForDevicesResult> createJobForDevicesAsync(CreateJobForDevicesRequest createJobForDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateJobForDevicesRequest, CreateJobForDevicesResult> asyncHandler);

    /**
     * <p>
     * Creates a camera stream node.
     * </p>
     * 
     * @param createNodeFromTemplateJobRequest
     * @return A Java Future containing the result of the CreateNodeFromTemplateJob operation returned by the service.
     * @sample AWSPanoramaAsync.CreateNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNodeFromTemplateJobResult> createNodeFromTemplateJobAsync(
            CreateNodeFromTemplateJobRequest createNodeFromTemplateJobRequest);

    /**
     * <p>
     * Creates a camera stream node.
     * </p>
     * 
     * @param createNodeFromTemplateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateNodeFromTemplateJob operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.CreateNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateNodeFromTemplateJobResult> createNodeFromTemplateJobAsync(
            CreateNodeFromTemplateJobRequest createNodeFromTemplateJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateNodeFromTemplateJobRequest, CreateNodeFromTemplateJobResult> asyncHandler);

    /**
     * <p>
     * Creates a package and storage location in an Amazon S3 access point.
     * </p>
     * 
     * @param createPackageRequest
     * @return A Java Future containing the result of the CreatePackage operation returned by the service.
     * @sample AWSPanoramaAsync.CreatePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest createPackageRequest);

    /**
     * <p>
     * Creates a package and storage location in an Amazon S3 access point.
     * </p>
     * 
     * @param createPackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePackage operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.CreatePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePackageResult> createPackageAsync(CreatePackageRequest createPackageRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePackageRequest, CreatePackageResult> asyncHandler);

    /**
     * <p>
     * Imports a node package.
     * </p>
     * 
     * @param createPackageImportJobRequest
     * @return A Java Future containing the result of the CreatePackageImportJob operation returned by the service.
     * @sample AWSPanoramaAsync.CreatePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePackageImportJobResult> createPackageImportJobAsync(CreatePackageImportJobRequest createPackageImportJobRequest);

    /**
     * <p>
     * Imports a node package.
     * </p>
     * 
     * @param createPackageImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePackageImportJob operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.CreatePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePackageImportJobResult> createPackageImportJobAsync(CreatePackageImportJobRequest createPackageImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePackageImportJobRequest, CreatePackageImportJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AWSPanoramaAsync.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeleteDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Deletes a device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeleteDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler);

    /**
     * <p>
     * Deletes a package.
     * </p>
     * <note>
     * <p>
     * To delete a package, you need permission to call <code>s3:DeleteObject</code> in addition to permissions for the
     * AWS Panorama API.
     * </p>
     * </note>
     * 
     * @param deletePackageRequest
     * @return A Java Future containing the result of the DeletePackage operation returned by the service.
     * @sample AWSPanoramaAsync.DeletePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeletePackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest deletePackageRequest);

    /**
     * <p>
     * Deletes a package.
     * </p>
     * <note>
     * <p>
     * To delete a package, you need permission to call <code>s3:DeleteObject</code> in addition to permissions for the
     * AWS Panorama API.
     * </p>
     * </note>
     * 
     * @param deletePackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePackage operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DeletePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeletePackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePackageResult> deletePackageAsync(DeletePackageRequest deletePackageRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePackageRequest, DeletePackageResult> asyncHandler);

    /**
     * <p>
     * Deregisters a package version.
     * </p>
     * 
     * @param deregisterPackageVersionRequest
     * @return A Java Future containing the result of the DeregisterPackageVersion operation returned by the service.
     * @sample AWSPanoramaAsync.DeregisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeregisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterPackageVersionResult> deregisterPackageVersionAsync(DeregisterPackageVersionRequest deregisterPackageVersionRequest);

    /**
     * <p>
     * Deregisters a package version.
     * </p>
     * 
     * @param deregisterPackageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterPackageVersion operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DeregisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeregisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterPackageVersionResult> deregisterPackageVersionAsync(DeregisterPackageVersionRequest deregisterPackageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterPackageVersionRequest, DeregisterPackageVersionResult> asyncHandler);

    /**
     * <p>
     * Returns information about an application instance on a device.
     * </p>
     * 
     * @param describeApplicationInstanceRequest
     * @return A Java Future containing the result of the DescribeApplicationInstance operation returned by the service.
     * @sample AWSPanoramaAsync.DescribeApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationInstanceResult> describeApplicationInstanceAsync(
            DescribeApplicationInstanceRequest describeApplicationInstanceRequest);

    /**
     * <p>
     * Returns information about an application instance on a device.
     * </p>
     * 
     * @param describeApplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationInstance operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribeApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationInstanceResult> describeApplicationInstanceAsync(
            DescribeApplicationInstanceRequest describeApplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationInstanceRequest, DescribeApplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns information about an application instance's configuration manifest.
     * </p>
     * 
     * @param describeApplicationInstanceDetailsRequest
     * @return A Java Future containing the result of the DescribeApplicationInstanceDetails operation returned by the
     *         service.
     * @sample AWSPanoramaAsync.DescribeApplicationInstanceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstanceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationInstanceDetailsResult> describeApplicationInstanceDetailsAsync(
            DescribeApplicationInstanceDetailsRequest describeApplicationInstanceDetailsRequest);

    /**
     * <p>
     * Returns information about an application instance's configuration manifest.
     * </p>
     * 
     * @param describeApplicationInstanceDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationInstanceDetails operation returned by the
     *         service.
     * @sample AWSPanoramaAsyncHandler.DescribeApplicationInstanceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstanceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationInstanceDetailsResult> describeApplicationInstanceDetailsAsync(
            DescribeApplicationInstanceDetailsRequest describeApplicationInstanceDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationInstanceDetailsRequest, DescribeApplicationInstanceDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AWSPanoramaAsync.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Returns information about a device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDevice operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceResult> describeDeviceAsync(DescribeDeviceRequest describeDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceRequest, DescribeDeviceResult> asyncHandler);

    /**
     * <p>
     * Returns information about a device job.
     * </p>
     * 
     * @param describeDeviceJobRequest
     * @return A Java Future containing the result of the DescribeDeviceJob operation returned by the service.
     * @sample AWSPanoramaAsync.DescribeDeviceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDeviceJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceJobResult> describeDeviceJobAsync(DescribeDeviceJobRequest describeDeviceJobRequest);

    /**
     * <p>
     * Returns information about a device job.
     * </p>
     * 
     * @param describeDeviceJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeviceJob operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribeDeviceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDeviceJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeviceJobResult> describeDeviceJobAsync(DescribeDeviceJobRequest describeDeviceJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeviceJobRequest, DescribeDeviceJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a node.
     * </p>
     * 
     * @param describeNodeRequest
     * @return A Java Future containing the result of the DescribeNode operation returned by the service.
     * @sample AWSPanoramaAsync.DescribeNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodeResult> describeNodeAsync(DescribeNodeRequest describeNodeRequest);

    /**
     * <p>
     * Returns information about a node.
     * </p>
     * 
     * @param describeNodeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNode operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribeNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNode" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodeResult> describeNodeAsync(DescribeNodeRequest describeNodeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNodeRequest, DescribeNodeResult> asyncHandler);

    /**
     * <p>
     * Returns information about a job to create a camera stream node.
     * </p>
     * 
     * @param describeNodeFromTemplateJobRequest
     * @return A Java Future containing the result of the DescribeNodeFromTemplateJob operation returned by the service.
     * @sample AWSPanoramaAsync.DescribeNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodeFromTemplateJobResult> describeNodeFromTemplateJobAsync(
            DescribeNodeFromTemplateJobRequest describeNodeFromTemplateJobRequest);

    /**
     * <p>
     * Returns information about a job to create a camera stream node.
     * </p>
     * 
     * @param describeNodeFromTemplateJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNodeFromTemplateJob operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribeNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeNodeFromTemplateJobResult> describeNodeFromTemplateJobAsync(
            DescribeNodeFromTemplateJobRequest describeNodeFromTemplateJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNodeFromTemplateJobRequest, DescribeNodeFromTemplateJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a package.
     * </p>
     * 
     * @param describePackageRequest
     * @return A Java Future containing the result of the DescribePackage operation returned by the service.
     * @sample AWSPanoramaAsync.DescribePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageResult> describePackageAsync(DescribePackageRequest describePackageRequest);

    /**
     * <p>
     * Returns information about a package.
     * </p>
     * 
     * @param describePackageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackage operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageResult> describePackageAsync(DescribePackageRequest describePackageRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackageRequest, DescribePackageResult> asyncHandler);

    /**
     * <p>
     * Returns information about a package import job.
     * </p>
     * 
     * @param describePackageImportJobRequest
     * @return A Java Future containing the result of the DescribePackageImportJob operation returned by the service.
     * @sample AWSPanoramaAsync.DescribePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageImportJobResult> describePackageImportJobAsync(DescribePackageImportJobRequest describePackageImportJobRequest);

    /**
     * <p>
     * Returns information about a package import job.
     * </p>
     * 
     * @param describePackageImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackageImportJob operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageImportJobResult> describePackageImportJobAsync(DescribePackageImportJobRequest describePackageImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackageImportJobRequest, DescribePackageImportJobResult> asyncHandler);

    /**
     * <p>
     * Returns information about a package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @return A Java Future containing the result of the DescribePackageVersion operation returned by the service.
     * @sample AWSPanoramaAsync.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest describePackageVersionRequest);

    /**
     * <p>
     * Returns information about a package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePackageVersion operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePackageVersionResult> describePackageVersionAsync(DescribePackageVersionRequest describePackageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePackageVersionRequest, DescribePackageVersionResult> asyncHandler);

    /**
     * <p>
     * Returns a list of application instance dependencies.
     * </p>
     * 
     * @param listApplicationInstanceDependenciesRequest
     * @return A Java Future containing the result of the ListApplicationInstanceDependencies operation returned by the
     *         service.
     * @sample AWSPanoramaAsync.ListApplicationInstanceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationInstanceDependenciesResult> listApplicationInstanceDependenciesAsync(
            ListApplicationInstanceDependenciesRequest listApplicationInstanceDependenciesRequest);

    /**
     * <p>
     * Returns a list of application instance dependencies.
     * </p>
     * 
     * @param listApplicationInstanceDependenciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationInstanceDependencies operation returned by the
     *         service.
     * @sample AWSPanoramaAsyncHandler.ListApplicationInstanceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationInstanceDependenciesResult> listApplicationInstanceDependenciesAsync(
            ListApplicationInstanceDependenciesRequest listApplicationInstanceDependenciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationInstanceDependenciesRequest, ListApplicationInstanceDependenciesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of application node instances.
     * </p>
     * 
     * @param listApplicationInstanceNodeInstancesRequest
     * @return A Java Future containing the result of the ListApplicationInstanceNodeInstances operation returned by the
     *         service.
     * @sample AWSPanoramaAsync.ListApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationInstanceNodeInstancesResult> listApplicationInstanceNodeInstancesAsync(
            ListApplicationInstanceNodeInstancesRequest listApplicationInstanceNodeInstancesRequest);

    /**
     * <p>
     * Returns a list of application node instances.
     * </p>
     * 
     * @param listApplicationInstanceNodeInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationInstanceNodeInstances operation returned by the
     *         service.
     * @sample AWSPanoramaAsyncHandler.ListApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationInstanceNodeInstancesResult> listApplicationInstanceNodeInstancesAsync(
            ListApplicationInstanceNodeInstancesRequest listApplicationInstanceNodeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationInstanceNodeInstancesRequest, ListApplicationInstanceNodeInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of application instances.
     * </p>
     * 
     * @param listApplicationInstancesRequest
     * @return A Java Future containing the result of the ListApplicationInstances operation returned by the service.
     * @sample AWSPanoramaAsync.ListApplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationInstancesResult> listApplicationInstancesAsync(ListApplicationInstancesRequest listApplicationInstancesRequest);

    /**
     * <p>
     * Returns a list of application instances.
     * </p>
     * 
     * @param listApplicationInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationInstances operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListApplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationInstancesResult> listApplicationInstancesAsync(ListApplicationInstancesRequest listApplicationInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationInstancesRequest, ListApplicationInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSPanoramaAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns a list of devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of jobs.
     * </p>
     * 
     * @param listDevicesJobsRequest
     * @return A Java Future containing the result of the ListDevicesJobs operation returned by the service.
     * @sample AWSPanoramaAsync.ListDevicesJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevicesJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesJobsResult> listDevicesJobsAsync(ListDevicesJobsRequest listDevicesJobsRequest);

    /**
     * <p>
     * Returns a list of jobs.
     * </p>
     * 
     * @param listDevicesJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevicesJobs operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListDevicesJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevicesJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesJobsResult> listDevicesJobsAsync(ListDevicesJobsRequest listDevicesJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesJobsRequest, ListDevicesJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of camera stream node jobs.
     * </p>
     * 
     * @param listNodeFromTemplateJobsRequest
     * @return A Java Future containing the result of the ListNodeFromTemplateJobs operation returned by the service.
     * @sample AWSPanoramaAsync.ListNodeFromTemplateJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodeFromTemplateJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNodeFromTemplateJobsResult> listNodeFromTemplateJobsAsync(ListNodeFromTemplateJobsRequest listNodeFromTemplateJobsRequest);

    /**
     * <p>
     * Returns a list of camera stream node jobs.
     * </p>
     * 
     * @param listNodeFromTemplateJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNodeFromTemplateJobs operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListNodeFromTemplateJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodeFromTemplateJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNodeFromTemplateJobsResult> listNodeFromTemplateJobsAsync(ListNodeFromTemplateJobsRequest listNodeFromTemplateJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListNodeFromTemplateJobsRequest, ListNodeFromTemplateJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of nodes.
     * </p>
     * 
     * @param listNodesRequest
     * @return A Java Future containing the result of the ListNodes operation returned by the service.
     * @sample AWSPanoramaAsync.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns a list of nodes.
     * </p>
     * 
     * @param listNodesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNodes operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListNodesResult> listNodesAsync(ListNodesRequest listNodesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNodesRequest, ListNodesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of package import jobs.
     * </p>
     * 
     * @param listPackageImportJobsRequest
     * @return A Java Future containing the result of the ListPackageImportJobs operation returned by the service.
     * @sample AWSPanoramaAsync.ListPackageImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackageImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageImportJobsResult> listPackageImportJobsAsync(ListPackageImportJobsRequest listPackageImportJobsRequest);

    /**
     * <p>
     * Returns a list of package import jobs.
     * </p>
     * 
     * @param listPackageImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackageImportJobs operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListPackageImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackageImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPackageImportJobsResult> listPackageImportJobsAsync(ListPackageImportJobsRequest listPackageImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackageImportJobsRequest, ListPackageImportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of packages.
     * </p>
     * 
     * @param listPackagesRequest
     * @return A Java Future containing the result of the ListPackages operation returned by the service.
     * @sample AWSPanoramaAsync.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest listPackagesRequest);

    /**
     * <p>
     * Returns a list of packages.
     * </p>
     * 
     * @param listPackagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPackages operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPackagesResult> listPackagesAsync(ListPackagesRequest listPackagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPackagesRequest, ListPackagesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPanoramaAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a device and returns a configuration archive. The configuration archive is a ZIP file that contains a
     * provisioning certificate that is valid for 5 minutes. Name the configuration archive
     * <code>certificates-omni_<i>device-name</i>.zip</code> and transfer it to the device within 5 minutes. Use the
     * included USB storage device and connect it to the USB 3.0 port next to the HDMI output.
     * </p>
     * 
     * @param provisionDeviceRequest
     * @return A Java Future containing the result of the ProvisionDevice operation returned by the service.
     * @sample AWSPanoramaAsync.ProvisionDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ProvisionDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ProvisionDeviceResult> provisionDeviceAsync(ProvisionDeviceRequest provisionDeviceRequest);

    /**
     * <p>
     * Creates a device and returns a configuration archive. The configuration archive is a ZIP file that contains a
     * provisioning certificate that is valid for 5 minutes. Name the configuration archive
     * <code>certificates-omni_<i>device-name</i>.zip</code> and transfer it to the device within 5 minutes. Use the
     * included USB storage device and connect it to the USB 3.0 port next to the HDMI output.
     * </p>
     * 
     * @param provisionDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ProvisionDevice operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.ProvisionDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ProvisionDevice" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ProvisionDeviceResult> provisionDeviceAsync(ProvisionDeviceRequest provisionDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ProvisionDeviceRequest, ProvisionDeviceResult> asyncHandler);

    /**
     * <p>
     * Registers a package version.
     * </p>
     * 
     * @param registerPackageVersionRequest
     * @return A Java Future containing the result of the RegisterPackageVersion operation returned by the service.
     * @sample AWSPanoramaAsync.RegisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RegisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterPackageVersionResult> registerPackageVersionAsync(RegisterPackageVersionRequest registerPackageVersionRequest);

    /**
     * <p>
     * Registers a package version.
     * </p>
     * 
     * @param registerPackageVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterPackageVersion operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.RegisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RegisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterPackageVersionResult> registerPackageVersionAsync(RegisterPackageVersionRequest registerPackageVersionRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterPackageVersionRequest, RegisterPackageVersionResult> asyncHandler);

    /**
     * <p>
     * Removes an application instance.
     * </p>
     * 
     * @param removeApplicationInstanceRequest
     * @return A Java Future containing the result of the RemoveApplicationInstance operation returned by the service.
     * @sample AWSPanoramaAsync.RemoveApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RemoveApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveApplicationInstanceResult> removeApplicationInstanceAsync(
            RemoveApplicationInstanceRequest removeApplicationInstanceRequest);

    /**
     * <p>
     * Removes an application instance.
     * </p>
     * 
     * @param removeApplicationInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveApplicationInstance operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.RemoveApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RemoveApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveApplicationInstanceResult> removeApplicationInstanceAsync(
            RemoveApplicationInstanceRequest removeApplicationInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveApplicationInstanceRequest, RemoveApplicationInstanceResult> asyncHandler);

    /**
     * <p>
     * Signal camera nodes to stop or resume.
     * </p>
     * 
     * @param signalApplicationInstanceNodeInstancesRequest
     * @return A Java Future containing the result of the SignalApplicationInstanceNodeInstances operation returned by
     *         the service.
     * @sample AWSPanoramaAsync.SignalApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/SignalApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SignalApplicationInstanceNodeInstancesResult> signalApplicationInstanceNodeInstancesAsync(
            SignalApplicationInstanceNodeInstancesRequest signalApplicationInstanceNodeInstancesRequest);

    /**
     * <p>
     * Signal camera nodes to stop or resume.
     * </p>
     * 
     * @param signalApplicationInstanceNodeInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SignalApplicationInstanceNodeInstances operation returned by
     *         the service.
     * @sample AWSPanoramaAsyncHandler.SignalApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/SignalApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SignalApplicationInstanceNodeInstancesResult> signalApplicationInstanceNodeInstancesAsync(
            SignalApplicationInstanceNodeInstancesRequest signalApplicationInstanceNodeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<SignalApplicationInstanceNodeInstancesRequest, SignalApplicationInstanceNodeInstancesResult> asyncHandler);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPanoramaAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPanoramaAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a device's metadata.
     * </p>
     * 
     * @param updateDeviceMetadataRequest
     * @return A Java Future containing the result of the UpdateDeviceMetadata operation returned by the service.
     * @sample AWSPanoramaAsync.UpdateDeviceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UpdateDeviceMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceMetadataResult> updateDeviceMetadataAsync(UpdateDeviceMetadataRequest updateDeviceMetadataRequest);

    /**
     * <p>
     * Updates a device's metadata.
     * </p>
     * 
     * @param updateDeviceMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeviceMetadata operation returned by the service.
     * @sample AWSPanoramaAsyncHandler.UpdateDeviceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UpdateDeviceMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceMetadataResult> updateDeviceMetadataAsync(UpdateDeviceMetadataRequest updateDeviceMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceMetadataRequest, UpdateDeviceMetadataResult> asyncHandler);

}
