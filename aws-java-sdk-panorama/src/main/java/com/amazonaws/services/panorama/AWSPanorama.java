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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.panorama.model.*;

/**
 * Interface for accessing Panorama.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.panorama.AbstractAWSPanorama} instead.
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
public interface AWSPanorama {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "panorama";

    /**
     * <p>
     * Creates an application instance and deploys it to a device.
     * </p>
     * 
     * @param createApplicationInstanceRequest
     * @return Result of the CreateApplicationInstance operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ServiceQuotaExceededException
     *         The request would cause a limit to be exceeded.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreateApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationInstanceResult createApplicationInstance(CreateApplicationInstanceRequest createApplicationInstanceRequest);

    /**
     * <p>
     * Creates a job to run on one or more devices. A job can update a device's software or reboot it.
     * </p>
     * 
     * @param createJobForDevicesRequest
     * @return Result of the CreateJobForDevices operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreateJobForDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateJobForDevices" target="_top">AWS
     *      API Documentation</a>
     */
    CreateJobForDevicesResult createJobForDevices(CreateJobForDevicesRequest createJobForDevicesRequest);

    /**
     * <p>
     * Creates a camera stream node.
     * </p>
     * 
     * @param createNodeFromTemplateJobRequest
     * @return Result of the CreateNodeFromTemplateJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreateNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreateNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateNodeFromTemplateJobResult createNodeFromTemplateJob(CreateNodeFromTemplateJobRequest createNodeFromTemplateJobRequest);

    /**
     * <p>
     * Creates a package and storage location in an Amazon S3 access point.
     * </p>
     * 
     * @param createPackageRequest
     * @return Result of the CreatePackage operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreatePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackage" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePackageResult createPackage(CreatePackageRequest createPackageRequest);

    /**
     * <p>
     * Imports a node package.
     * </p>
     * 
     * @param createPackageImportJobRequest
     * @return Result of the CreatePackageImportJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.CreatePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/CreatePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePackageImportJobResult createPackageImportJob(CreatePackageImportJobRequest createPackageImportJobRequest);

    /**
     * <p>
     * Deletes a device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeleteDevice" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDeviceResult deleteDevice(DeleteDeviceRequest deleteDeviceRequest);

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
     * @return Result of the DeletePackage operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DeletePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeletePackage" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePackageResult deletePackage(DeletePackageRequest deletePackageRequest);

    /**
     * <p>
     * Deregisters a package version.
     * </p>
     * 
     * @param deregisterPackageVersionRequest
     * @return Result of the DeregisterPackageVersion operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DeregisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DeregisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterPackageVersionResult deregisterPackageVersion(DeregisterPackageVersionRequest deregisterPackageVersionRequest);

    /**
     * <p>
     * Returns information about an application instance on a device.
     * </p>
     * 
     * @param describeApplicationInstanceRequest
     * @return Result of the DescribeApplicationInstance operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationInstanceResult describeApplicationInstance(DescribeApplicationInstanceRequest describeApplicationInstanceRequest);

    /**
     * <p>
     * Returns information about an application instance's configuration manifest.
     * </p>
     * 
     * @param describeApplicationInstanceDetailsRequest
     * @return Result of the DescribeApplicationInstanceDetails operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeApplicationInstanceDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeApplicationInstanceDetails"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationInstanceDetailsResult describeApplicationInstanceDetails(
            DescribeApplicationInstanceDetailsRequest describeApplicationInstanceDetailsRequest);

    /**
     * <p>
     * Returns information about a device.
     * </p>
     * 
     * @param describeDeviceRequest
     * @return Result of the DescribeDevice operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDevice" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDeviceResult describeDevice(DescribeDeviceRequest describeDeviceRequest);

    /**
     * <p>
     * Returns information about a device job.
     * </p>
     * 
     * @param describeDeviceJobRequest
     * @return Result of the DescribeDeviceJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeDeviceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeDeviceJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDeviceJobResult describeDeviceJob(DescribeDeviceJobRequest describeDeviceJobRequest);

    /**
     * <p>
     * Returns information about a node.
     * </p>
     * 
     * @param describeNodeRequest
     * @return Result of the DescribeNode operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeNode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNode" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeNodeResult describeNode(DescribeNodeRequest describeNodeRequest);

    /**
     * <p>
     * Returns information about a job to create a camera stream node.
     * </p>
     * 
     * @param describeNodeFromTemplateJobRequest
     * @return Result of the DescribeNodeFromTemplateJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribeNodeFromTemplateJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNodeFromTemplateJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeNodeFromTemplateJobResult describeNodeFromTemplateJob(DescribeNodeFromTemplateJobRequest describeNodeFromTemplateJobRequest);

    /**
     * <p>
     * Returns information about a package.
     * </p>
     * 
     * @param describePackageRequest
     * @return Result of the DescribePackage operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribePackage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackage" target="_top">AWS API
     *      Documentation</a>
     */
    DescribePackageResult describePackage(DescribePackageRequest describePackageRequest);

    /**
     * <p>
     * Returns information about a package import job.
     * </p>
     * 
     * @param describePackageImportJobRequest
     * @return Result of the DescribePackageImportJob operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribePackageImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePackageImportJobResult describePackageImportJob(DescribePackageImportJobRequest describePackageImportJobRequest);

    /**
     * <p>
     * Returns information about a package version.
     * </p>
     * 
     * @param describePackageVersionRequest
     * @return Result of the DescribePackageVersion operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.DescribePackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePackageVersionResult describePackageVersion(DescribePackageVersionRequest describePackageVersionRequest);

    /**
     * <p>
     * Returns a list of application instance dependencies.
     * </p>
     * 
     * @param listApplicationInstanceDependenciesRequest
     * @return Result of the ListApplicationInstanceDependencies operation returned by the service.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListApplicationInstanceDependencies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceDependencies"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationInstanceDependenciesResult listApplicationInstanceDependencies(
            ListApplicationInstanceDependenciesRequest listApplicationInstanceDependenciesRequest);

    /**
     * <p>
     * Returns a list of application node instances.
     * </p>
     * 
     * @param listApplicationInstanceNodeInstancesRequest
     * @return Result of the ListApplicationInstanceNodeInstances operation returned by the service.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationInstanceNodeInstancesResult listApplicationInstanceNodeInstances(
            ListApplicationInstanceNodeInstancesRequest listApplicationInstanceNodeInstancesRequest);

    /**
     * <p>
     * Returns a list of application instances.
     * </p>
     * 
     * @param listApplicationInstancesRequest
     * @return Result of the ListApplicationInstances operation returned by the service.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListApplicationInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListApplicationInstances"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationInstancesResult listApplicationInstances(ListApplicationInstancesRequest listApplicationInstancesRequest);

    /**
     * <p>
     * Returns a list of devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevices" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns a list of jobs.
     * </p>
     * 
     * @param listDevicesJobsRequest
     * @return Result of the ListDevicesJobs operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListDevicesJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListDevicesJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListDevicesJobsResult listDevicesJobs(ListDevicesJobsRequest listDevicesJobsRequest);

    /**
     * <p>
     * Returns a list of camera stream node jobs.
     * </p>
     * 
     * @param listNodeFromTemplateJobsRequest
     * @return Result of the ListNodeFromTemplateJobs operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListNodeFromTemplateJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodeFromTemplateJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListNodeFromTemplateJobsResult listNodeFromTemplateJobs(ListNodeFromTemplateJobsRequest listNodeFromTemplateJobsRequest);

    /**
     * <p>
     * Returns a list of nodes.
     * </p>
     * 
     * @param listNodesRequest
     * @return Result of the ListNodes operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListNodes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListNodes" target="_top">AWS API
     *      Documentation</a>
     */
    ListNodesResult listNodes(ListNodesRequest listNodesRequest);

    /**
     * <p>
     * Returns a list of package import jobs.
     * </p>
     * 
     * @param listPackageImportJobsRequest
     * @return Result of the ListPackageImportJobs operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListPackageImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackageImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListPackageImportJobsResult listPackageImportJobs(ListPackageImportJobsRequest listPackageImportJobsRequest);

    /**
     * <p>
     * Returns a list of packages.
     * </p>
     * 
     * @param listPackagesRequest
     * @return Result of the ListPackages operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListPackages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListPackages" target="_top">AWS API
     *      Documentation</a>
     */
    ListPackagesResult listPackages(ListPackagesRequest listPackagesRequest);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a device and returns a configuration archive. The configuration archive is a ZIP file that contains a
     * provisioning certificate that is valid for 5 minutes. Name the configuration archive
     * <code>certificates-omni_<i>device-name</i>.zip</code> and transfer it to the device within 5 minutes. Use the
     * included USB storage device and connect it to the USB 3.0 port next to the HDMI output.
     * </p>
     * 
     * @param provisionDeviceRequest
     * @return Result of the ProvisionDevice operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ServiceQuotaExceededException
     *         The request would cause a limit to be exceeded.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.ProvisionDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/ProvisionDevice" target="_top">AWS API
     *      Documentation</a>
     */
    ProvisionDeviceResult provisionDevice(ProvisionDeviceRequest provisionDeviceRequest);

    /**
     * <p>
     * Registers a package version.
     * </p>
     * 
     * @param registerPackageVersionRequest
     * @return Result of the RegisterPackageVersion operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.RegisterPackageVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RegisterPackageVersion"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterPackageVersionResult registerPackageVersion(RegisterPackageVersionRequest registerPackageVersionRequest);

    /**
     * <p>
     * Removes an application instance.
     * </p>
     * 
     * @param removeApplicationInstanceRequest
     * @return Result of the RemoveApplicationInstance operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.RemoveApplicationInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RemoveApplicationInstance"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveApplicationInstanceResult removeApplicationInstance(RemoveApplicationInstanceRequest removeApplicationInstanceRequest);

    /**
     * <p>
     * Signal camera nodes to stop or resume.
     * </p>
     * 
     * @param signalApplicationInstanceNodeInstancesRequest
     * @return Result of the SignalApplicationInstanceNodeInstances operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ServiceQuotaExceededException
     *         The request would cause a limit to be exceeded.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.SignalApplicationInstanceNodeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/SignalApplicationInstanceNodeInstances"
     *      target="_top">AWS API Documentation</a>
     */
    SignalApplicationInstanceNodeInstancesResult signalApplicationInstanceNodeInstances(
            SignalApplicationInstanceNodeInstancesRequest signalApplicationInstanceNodeInstancesRequest);

    /**
     * <p>
     * Tags a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a device's metadata.
     * </p>
     * 
     * @param updateDeviceMetadataRequest
     * @return Result of the UpdateDeviceMetadata operation returned by the service.
     * @throws ConflictException
     *         The target resource is in use.
     * @throws ValidationException
     *         The request contains an invalid parameter value.
     * @throws AccessDeniedException
     *         The requestor does not have permission to access the target action or resource.
     * @throws ResourceNotFoundException
     *         The target resource was not found.
     * @throws InternalServerException
     *         An internal error occurred.
     * @sample AWSPanorama.UpdateDeviceMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/UpdateDeviceMetadata" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateDeviceMetadataResult updateDeviceMetadata(UpdateDeviceMetadataRequest updateDeviceMetadataRequest);

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
