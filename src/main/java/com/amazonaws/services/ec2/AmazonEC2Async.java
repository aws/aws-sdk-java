/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.ec2.model.*;

/**
 * Interface for accessing AmazonEC2 asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * Amazon Elastic Compute Cloud <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides resizable computing
 * capacity in the Amazon Web Services (AWS) cloud. Using Amazon EC2
 * eliminates your need to invest in hardware up front, so you can
 * develop and deploy applications faster.
 * </p>
 */
public interface AmazonEC2Async extends AmazonEC2 {
    /**
     * <p>
     * Requests a reboot of one or more instances. This operation is
     * asynchronous; it only queues a request to reboot the specified
     * instances. The operation succeeds if the instances are valid and
     * belong to you. Requests to reboot terminated instances are ignored.
     * </p>
     * <p>
     * If a Linux/Unix instance does not cleanly shut down within four
     * minutes, Amazon EC2 performs a hard reboot.
     * </p>
     *
     * @param rebootInstancesRequest Container for the necessary parameters
     *           to execute the RebootInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstancesAsync(RebootInstancesRequest rebootInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a reboot of one or more instances. This operation is
     * asynchronous; it only queues a request to reboot the specified
     * instances. The operation succeeds if the instances are valid and
     * belong to you. Requests to reboot terminated instances are ignored.
     * </p>
     * <p>
     * If a Linux/Unix instance does not cleanly shut down within four
     * minutes, Amazon EC2 performs a hard reboot.
     * </p>
     *
     * @param rebootInstancesRequest Container for the necessary parameters
     *           to execute the RebootInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RebootInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> rebootInstancesAsync(RebootInstancesRequest rebootInstancesRequest,
            AsyncHandler<RebootInstancesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedInstances operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest describeReservedInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Reserved Instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedInstances operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesResult> describeReservedInstancesAsync(DescribeReservedInstancesRequest describeReservedInstancesRequest,
            AsyncHandler<DescribeReservedInstancesRequest, DescribeReservedInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Availability Zones that are available to
     * you. The results include zones only for the region you're currently
     * using. If there is an event impacting an Availability Zone, you can
     * use this request to view the state and any provided message for that
     * Availability Zone.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"> Regions and Availability Zones </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAvailabilityZonesRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityZones operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityZones service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Availability Zones that are available to
     * you. The results include zones only for the region you're currently
     * using. If there is an event impacting an Availability Zone, you can
     * use this request to view the state and any provided message for that
     * Availability Zone.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html"> Regions and Availability Zones </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAvailabilityZonesRequest Container for the necessary
     *           parameters to execute the DescribeAvailabilityZones operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAvailabilityZones service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAvailabilityZonesResult> describeAvailabilityZonesAsync(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest,
            AsyncHandler<DescribeAvailabilityZonesRequest, DescribeAvailabilityZonesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches an Amazon EBS volume from an instance. Make sure to unmount
     * any file systems on the device within your operating system before
     * detaching the volume. Failure to do so results in the volume being
     * stuck in a busy state while detaching.
     * </p>
     * <p>
     * If an Amazon EBS volume is the root device of an instance, it can't be
     * detached while the instance is running. To detach the root volume,
     * stop the instance first.
     * </p>
     * <p>
     * If the root volume is detached from an instance with an AWS
     * Marketplace product code, then the AWS Marketplace product codes from
     * that volume are no longer associated with the instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html"> Detaching an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param detachVolumeRequest Container for the necessary parameters to
     *           execute the DetachVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DetachVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches an Amazon EBS volume from an instance. Make sure to unmount
     * any file systems on the device within your operating system before
     * detaching the volume. Failure to do so results in the volume being
     * stuck in a busy state while detaching.
     * </p>
     * <p>
     * If an Amazon EBS volume is the root device of an instance, it can't be
     * detached while the instance is running. To detach the root volume,
     * stop the instance first.
     * </p>
     * <p>
     * If the root volume is detached from an instance with an AWS
     * Marketplace product code, then the AWS Marketplace product codes from
     * that volume are no longer associated with the instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html"> Detaching an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param detachVolumeRequest Container for the necessary parameters to
     *           execute the DetachVolume operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DetachVolumeResult> detachVolumeAsync(DetachVolumeRequest detachVolumeRequest,
            AsyncHandler<DetachVolumeRequest, DetachVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon
     * EC2.
     * </p>
     *
     * @param deleteKeyPairRequest Container for the necessary parameters to
     *           execute the DeleteKeyPair operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteKeyPair service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from Amazon
     * EC2.
     * </p>
     *
     * @param deleteKeyPairRequest Container for the necessary parameters to
     *           execute the DeleteKeyPair operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteKeyPair service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest,
            AsyncHandler<DeleteKeyPairRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables monitoring for a running instance. For more information about
     * monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param unmonitorInstancesRequest Container for the necessary
     *           parameters to execute the UnmonitorInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         UnmonitorInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest unmonitorInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables monitoring for a running instance. For more information about
     * monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param unmonitorInstancesRequest Container for the necessary
     *           parameters to execute the UnmonitorInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnmonitorInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UnmonitorInstancesResult> unmonitorInstancesAsync(UnmonitorInstancesRequest unmonitorInstancesRequest,
            AsyncHandler<UnmonitorInstancesRequest, UnmonitorInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param attachVpnGatewayRequest Container for the necessary parameters
     *           to execute the AttachVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AttachVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest attachVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param attachVpnGatewayRequest Container for the necessary parameters
     *           to execute the AttachVpnGateway operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachVpnGatewayResult> attachVpnGatewayAsync(AttachVpnGatewayRequest attachVpnGatewayRequest,
            AsyncHandler<AttachVpnGatewayRequest, AttachVpnGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance
     * that is either running or stopped.
     * </p>
     * <p>
     * If you customized your instance with instance store volumes or EBS
     * volumes in addition to the root device volume, the new AMI contains
     * block device mapping information for those volumes. When you launch an
     * instance from this new AMI, the instance automatically launches with
     * those additional volumes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"> Creating Amazon EBS-Backed Linux AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createImageRequest Container for the necessary parameters to
     *           execute the CreateImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon EBS-backed AMI from an Amazon EBS-backed instance
     * that is either running or stopped.
     * </p>
     * <p>
     * If you customized your instance with instance store volumes or EBS
     * volumes in addition to the root device volume, the new AMI contains
     * block device mapping information for those volumes. When you launch an
     * instance from this new AMI, the instance automatically launches with
     * those additional volumes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami-ebs.html"> Creating Amazon EBS-Backed Linux AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createImageRequest Container for the necessary parameters to
     *           execute the CreateImage operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateImageResult> createImageAsync(CreateImageRequest createImageRequest,
            AsyncHandler<CreateImageRequest, CreateImageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a security group.
     * </p>
     * <p>
     * If you attempt to delete a security group that is associated with an
     * instance, or is referenced by another security group, the operation
     * fails with <code>InvalidGroup.InUse</code> in EC2-Classic or
     * <code>DependencyViolation</code> in EC2-VPC.
     * </p>
     *
     * @param deleteSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteSecurityGroup operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSecurityGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSecurityGroupAsync(DeleteSecurityGroupRequest deleteSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a security group.
     * </p>
     * <p>
     * If you attempt to delete a security group that is associated with an
     * instance, or is referenced by another security group, the operation
     * fails with <code>InvalidGroup.InUse</code> in EC2-Classic or
     * <code>DependencyViolation</code> in EC2-VPC.
     * </p>
     *
     * @param deleteSecurityGroupRequest Container for the necessary
     *           parameters to execute the DeleteSecurityGroup operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSecurityGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSecurityGroupAsync(DeleteSecurityGroupRequest deleteSecurityGroupRequest,
            AsyncHandler<DeleteSecurityGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Exports a running or stopped instance to an Amazon S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats,
     * and known limitations for the types of instances you can export, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ExportingEC2Instances.html"> Exporting EC2 Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createInstanceExportTaskRequest Container for the necessary
     *           parameters to execute the CreateInstanceExportTask operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstanceExportTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest createInstanceExportTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Exports a running or stopped instance to an Amazon S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats,
     * and known limitations for the types of instances you can export, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ExportingEC2Instances.html"> Exporting EC2 Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createInstanceExportTaskRequest Container for the necessary
     *           parameters to execute the CreateInstanceExportTask operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInstanceExportTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInstanceExportTaskResult> createInstanceExportTaskAsync(CreateInstanceExportTaskRequest createInstanceExportTaskRequest,
            AsyncHandler<CreateInstanceExportTaskRequest, CreateInstanceExportTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the encrypted administrator password for an instance running
     * Windows.
     * </p>
     * <p>
     * The Windows password is only generated the first time an AMI is
     * launched. It is not generated for rebundled AMIs or after the password
     * is changed on an instance.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when
     * you launched the instance. You must provide the corresponding key pair
     * file.
     * </p>
     * <p>
     * Password generation and encryption takes a few moments. We recommend
     * that you wait up to 15 minutes after launching an instance before
     * trying to retrieve the generated password.
     * </p>
     *
     * @param getPasswordDataRequest Container for the necessary parameters
     *           to execute the GetPasswordData operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         GetPasswordData service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest getPasswordDataRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the encrypted administrator password for an instance running
     * Windows.
     * </p>
     * <p>
     * The Windows password is only generated the first time an AMI is
     * launched. It is not generated for rebundled AMIs or after the password
     * is changed on an instance.
     * </p>
     * <p>
     * The password is encrypted using the key pair that you specified when
     * you launched the instance. You must provide the corresponding key pair
     * file.
     * </p>
     * <p>
     * Password generation and encryption takes a few moments. We recommend
     * that you wait up to 15 minutes after launching an instance before
     * trying to retrieve the generated password.
     * </p>
     *
     * @param getPasswordDataRequest Container for the necessary parameters
     *           to execute the GetPasswordData operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetPasswordData service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetPasswordDataResult> getPasswordDataAsync(GetPasswordDataRequest getPasswordDataRequest,
            AsyncHandler<GetPasswordDataRequest, GetPasswordDataResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created) with
     * the specified VPC, or associates no DHCP options with the VPC.
     * </p>
     * <p>
     * After you associate the options with the VPC, any existing instances
     * and all new instances that you launch in that VPC use the options. You
     * don't need to restart or relaunch the instances. They automatically
     * pick up the changes within a few hours, depending on how frequently
     * the instance renews its DHCP lease. You can explicitly renew the lease
     * using the operating system on the instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param associateDhcpOptionsRequest Container for the necessary
     *           parameters to execute the AssociateDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest associateDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created) with
     * the specified VPC, or associates no DHCP options with the VPC.
     * </p>
     * <p>
     * After you associate the options with the VPC, any existing instances
     * and all new instances that you launch in that VPC use the options. You
     * don't need to restart or relaunch the instances. They automatically
     * pick up the changes within a few hours, depending on how frequently
     * the instance renews its DHCP lease. You can explicitly renew the lease
     * using the operating system on the instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param associateDhcpOptionsRequest Container for the necessary
     *           parameters to execute the AssociateDhcpOptions operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> associateDhcpOptionsAsync(AssociateDhcpOptionsRequest associateDhcpOptionsRequest,
            AsyncHandler<AssociateDhcpOptionsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more egress rules to a security group for use with a VPC.
     * Specifically, this action permits instances to send traffic to one or
     * more CIDR IP address ranges, or to one or more security groups for the
     * same VPC.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can have up to 50 rules per security group
     * (covering both ingress and egress rules).
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. This action doesn't apply to security
     * groups for use in EC2-Classic. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * Each rule consists of the protocol (for example, TCP), plus either a
     * CIDR range or a source group. For the TCP and UDP protocols, you must
     * also specify the destination port or port range. For the ICMP
     * protocol, you must also specify the ICMP type and code. You can use -1
     * for the type or code to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as
     * possible. However, a small delay might occur.
     * </p>
     *
     * @param authorizeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the AuthorizeSecurityGroupEgress operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSecurityGroupEgress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> authorizeSecurityGroupEgressAsync(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more egress rules to a security group for use with a VPC.
     * Specifically, this action permits instances to send traffic to one or
     * more CIDR IP address ranges, or to one or more security groups for the
     * same VPC.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can have up to 50 rules per security group
     * (covering both ingress and egress rules).
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. This action doesn't apply to security
     * groups for use in EC2-Classic. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * Each rule consists of the protocol (for example, TCP), plus either a
     * CIDR range or a source group. For the TCP and UDP protocols, you must
     * also specify the destination port or port range. For the ICMP
     * protocol, you must also specify the ICMP type and code. You can use -1
     * for the type or code to mean all types or all codes.
     * </p>
     * <p>
     * Rule changes are propagated to affected instances as quickly as
     * possible. However, a small delay might occur.
     * </p>
     *
     * @param authorizeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the AuthorizeSecurityGroupEgress operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSecurityGroupEgress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> authorizeSecurityGroupEgressAsync(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest,
            AsyncHandler<AuthorizeSecurityGroupEgressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an Amazon EBS-backed instance. Each time you transition an
     * instance from stopped to started, Amazon EC2 charges a full instance
     * hour, even if transitions happen multiple times within a single hour.
     * </p>
     * <p>
     * You can't start or stop Spot Instances.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it
     * can be restarted. Stopping an instance does not preserve data stored
     * in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, the root device and
     * any other devices attached during the instance launch are
     * automatically deleted. For more information about the differences
     * between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param stopInstancesRequest Container for the necessary parameters to
     *           execute the StopInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest stopInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an Amazon EBS-backed instance. Each time you transition an
     * instance from stopped to started, Amazon EC2 charges a full instance
     * hour, even if transitions happen multiple times within a single hour.
     * </p>
     * <p>
     * You can't start or stop Spot Instances.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it
     * can be restarted. Stopping an instance does not preserve data stored
     * in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, the root device and
     * any other devices attached during the instance launch are
     * automatically deleted. For more information about the differences
     * between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param stopInstancesRequest Container for the necessary parameters to
     *           execute the StopInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StopInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StopInstancesResult> stopInstancesAsync(StopInstancesRequest stopInstancesRequest,
            AsyncHandler<StopInstancesRequest, StopInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Imports the public key from an RSA key pair that you created with a
     * third-party tool. Compare this with CreateKeyPair, in which AWS
     * creates the key pair and gives the keys to you (AWS keeps a copy of
     * the public key). With ImportKeyPair, you create the key pair and give
     * AWS just the public key. The private key is never transferred between
     * you and AWS.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importKeyPairRequest Container for the necessary parameters to
     *           execute the ImportKeyPair operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ImportKeyPair service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Imports the public key from an RSA key pair that you created with a
     * third-party tool. Compare this with CreateKeyPair, in which AWS
     * creates the key pair and gives the keys to you (AWS keeps a copy of
     * the public key). With ImportKeyPair, you create the key pair and give
     * AWS just the public key. The private key is never transferred between
     * you and AWS.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importKeyPairRequest Container for the necessary parameters to
     *           execute the ImportKeyPair operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ImportKeyPair service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest,
            AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network
     * interface before you can delete it.
     * </p>
     *
     * @param deleteNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteNetworkInterface operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network
     * interface before you can delete it.
     * </p>
     *
     * @param deleteNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteNetworkInterface operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNetworkInterfaceAsync(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest,
            AsyncHandler<DeleteNetworkInterfaceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     *
     * @param modifyVpcAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVpcAttribute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyVpcAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyVpcAttributeAsync(ModifyVpcAttributeRequest modifyVpcAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     *
     * @param modifyVpcAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVpcAttribute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyVpcAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyVpcAttributeAsync(ModifyVpcAttributeRequest modifyVpcAttributeRequest,
            AsyncHandler<ModifyVpcAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a security group.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 500 security groups.
     * EC2-VPC: You can create up to 100 security groups per VPC.
     * </p>
     * <p>
     * When you create a security group, you specify a friendly name of your
     * choice. You can have a security group for use in EC2-Classic with the
     * same name as a security group for use in a VPC. However, you can't
     * have two security groups for use in EC2-Classic with the same name or
     * two security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a default
     * security group for use in your VPC. If you don't specify a security
     * group when you launch an instance, the instance is launched into the
     * appropriate default security group. A default security group includes
     * a default rule that grants instances unrestricted network access to
     * each other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using
     * AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress,
     * RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
     * </p>
     *
     * @param createSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateSecurityGroup operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSecurityGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest createSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a security group.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 500 security groups.
     * EC2-VPC: You can create up to 100 security groups per VPC.
     * </p>
     * <p>
     * When you create a security group, you specify a friendly name of your
     * choice. You can have a security group for use in EC2-Classic with the
     * same name as a security group for use in a VPC. However, you can't
     * have two security groups for use in EC2-Classic with the same name or
     * two security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a default
     * security group for use in your VPC. If you don't specify a security
     * group when you launch an instance, the instance is launched into the
     * appropriate default security group. A default security group includes
     * a default rule that grants instances unrestricted network access to
     * each other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using
     * AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress,
     * RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
     * </p>
     *
     * @param createSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateSecurityGroup operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSecurityGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSecurityGroupResult> createSecurityGroupAsync(CreateSecurityGroupRequest createSecurityGroupRequest,
            AsyncHandler<CreateSecurityGroupRequest, CreateSecurityGroupResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the Spot Price history. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * When you specify an Availability Zone, this operation describes the
     * price history for the specified Availability Zone with the most recent
     * set of prices listed first. If you don't specify an Availability Zone,
     * you get the prices across all Availability Zones, starting with the
     * most recent set. However, if you're using an API version earlier than
     * 2011-05-15, you get the lowest price across the region for the
     * specified time period. The prices returned are listed in chronological
     * order, from the oldest to the most recent.
     * </p>
     *
     * @param describeSpotPriceHistoryRequest Container for the necessary
     *           parameters to execute the DescribeSpotPriceHistory operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSpotPriceHistory service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the Spot Price history. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * When you specify an Availability Zone, this operation describes the
     * price history for the specified Availability Zone with the most recent
     * set of prices listed first. If you don't specify an Availability Zone,
     * you get the prices across all Availability Zones, starting with the
     * most recent set. However, if you're using an API version earlier than
     * 2011-05-15, you get the lowest price across the region for the
     * specified time period. The prices returned are listed in chronological
     * order, from the oldest to the most recent.
     * </p>
     *
     * @param describeSpotPriceHistoryRequest Container for the necessary
     *           parameters to execute the DescribeSpotPriceHistory operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSpotPriceHistory service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSpotPriceHistoryResult> describeSpotPriceHistoryAsync(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest,
            AsyncHandler<DescribeSpotPriceHistoryRequest, DescribeSpotPriceHistoryResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     *
     * @param describeNetworkInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeNetworkInterfaces operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNetworkInterfaces service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     *
     * @param describeNetworkInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeNetworkInterfaces operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNetworkInterfaces service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNetworkInterfacesResult> describeNetworkInterfacesAsync(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest,
            AsyncHandler<DescribeNetworkInterfacesRequest, DescribeNetworkInterfacesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more regions that are currently available to you.
     * </p>
     * <p>
     * For a list of the regions supported by Amazon EC2, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region"> Regions and Endpoints </a>
     * .
     * </p>
     *
     * @param describeRegionsRequest Container for the necessary parameters
     *           to execute the DescribeRegions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRegions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest describeRegionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more regions that are currently available to you.
     * </p>
     * <p>
     * For a list of the regions supported by Amazon EC2, see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#ec2_region"> Regions and Endpoints </a>
     * .
     * </p>
     *
     * @param describeRegionsRequest Container for the necessary parameters
     *           to execute the DescribeRegions operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRegions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRegionsResult> describeRegionsAsync(DescribeRegionsRequest describeRegionsRequest,
            AsyncHandler<DescribeRegionsRequest, DescribeRegionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a listing for Amazon EC2 Reserved Instances to be sold in the
     * Reserved Instance Marketplace. You can submit one Reserved Instance
     * listing at a time.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CreateReservedInstancesListing
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReservedInstancesListing service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(CreateReservedInstancesListingRequest createReservedInstancesListingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a listing for Amazon EC2 Reserved Instances to be sold in the
     * Reserved Instance Marketplace. You can submit one Reserved Instance
     * listing at a time.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CreateReservedInstancesListing
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateReservedInstancesListing service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateReservedInstancesListingResult> createReservedInstancesListingAsync(CreateReservedInstancesListingRequest createReservedInstancesListingRequest,
            AsyncHandler<CreateReservedInstancesListingRequest, CreateReservedInstancesListingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a set of DHCP options for your VPC. After creating the set,
     * you must associate it with the VPC, causing all existing and new
     * instances that you launch in the VPC to use this set of DHCP options.
     * The following are the individual DHCP options you can specify. For
     * more information about the options, see
     * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
     * .
     * </p>
     * <p>
     * For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createDhcpOptionsRequest Container for the necessary parameters
     *           to execute the CreateDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest createDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a set of DHCP options for your VPC. After creating the set,
     * you must associate it with the VPC, causing all existing and new
     * instances that you launch in the VPC to use this set of DHCP options.
     * The following are the individual DHCP options you can specify. For
     * more information about the options, see
     * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
     * .
     * </p>
     * <p>
     * For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createDhcpOptionsRequest Container for the necessary parameters
     *           to execute the CreateDhcpOptions operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDhcpOptionsResult> createDhcpOptionsAsync(CreateDhcpOptionsRequest createDhcpOptionsRequest,
            AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param resetSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ResetSnapshotAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetSnapshotAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param resetSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ResetSnapshotAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetSnapshotAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetSnapshotAttributeAsync(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest,
            AsyncHandler<ResetSnapshotAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     *
     * @param deleteRouteRequest Container for the necessary parameters to
     *           execute the DeleteRoute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     *
     * @param deleteRouteRequest Container for the necessary parameters to
     *           execute the DeleteRoute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteRouteAsync(DeleteRouteRequest deleteRouteRequest,
            AsyncHandler<DeleteRouteRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     *
     * @param describeInternetGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeInternetGateways operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInternetGateways service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest describeInternetGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     *
     * @param describeInternetGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeInternetGateways operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInternetGateways service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInternetGatewaysResult> describeInternetGatewaysAsync(DescribeInternetGatewaysRequest describeInternetGatewaysRequest,
            AsyncHandler<DescribeInternetGatewaysRequest, DescribeInternetGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk
     * image. After importing the image, you then upload it using the
     * ec2-upload-disk-image command in the Amazon EC2 command-line interface
     * (CLI) tools. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importVolumeRequest Container for the necessary parameters to
     *           execute the ImportVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ImportVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest importVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk
     * image. After importing the image, you then upload it using the
     * ec2-upload-disk-image command in the Amazon EC2 command-line interface
     * (CLI) tools. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importVolumeRequest Container for the necessary parameters to
     *           execute the ImportVolume operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ImportVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ImportVolumeResult> importVolumeAsync(ImportVolumeRequest importVolumeRequest,
            AsyncHandler<ImportVolumeRequest, ImportVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeSecurityGroups operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSecurityGroups service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your security groups.
     * </p>
     * <p>
     * A security group is for use with instances either in the EC2-Classic
     * platform or in a specific VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Amazon EC2 Security Groups </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> and <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeSecurityGroupsRequest Container for the necessary
     *           parameters to execute the DescribeSecurityGroups operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSecurityGroups service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSecurityGroupsResult> describeSecurityGroupsAsync(DescribeSecurityGroupsRequest describeSecurityGroupsRequest,
            AsyncHandler<DescribeSecurityGroupsRequest, DescribeSecurityGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a virtual private gateway from a VPC. You do this if you're
     * planning to turn off the VPC and not use it anymore. You can confirm a
     * virtual private gateway has been completely detached from a VPC by
     * describing the virtual private gateway (any attachments to the virtual
     * private gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to
     * <code>detached</code> before you can delete the VPC or attach a
     * different VPC to the virtual private gateway.
     * </p>
     *
     * @param detachVpnGatewayRequest Container for the necessary parameters
     *           to execute the DetachVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DetachVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachVpnGatewayAsync(DetachVpnGatewayRequest detachVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a virtual private gateway from a VPC. You do this if you're
     * planning to turn off the VPC and not use it anymore. You can confirm a
     * virtual private gateway has been completely detached from a VPC by
     * describing the virtual private gateway (any attachments to the virtual
     * private gateway are also described).
     * </p>
     * <p>
     * You must wait for the attachment's state to switch to
     * <code>detached</code> before you can delete the VPC or attach a
     * different VPC to the virtual private gateway.
     * </p>
     *
     * @param detachVpnGatewayRequest Container for the necessary parameters
     *           to execute the DetachVpnGateway operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachVpnGatewayAsync(DetachVpnGatewayRequest detachVpnGatewayRequest,
            AsyncHandler<DetachVpnGatewayRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't
     * be used to launch new instances.
     * </p>
     * <p>
     * This command does not delete the AMI.
     * </p>
     *
     * @param deregisterImageRequest Container for the necessary parameters
     *           to execute the DeregisterImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterImageAsync(DeregisterImageRequest deregisterImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deregisters the specified AMI. After you deregister an AMI, it can't
     * be used to launch new instances.
     * </p>
     * <p>
     * This command does not delete the AMI.
     * </p>
     *
     * @param deregisterImageRequest Container for the necessary parameters
     *           to execute the DeregisterImage operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeregisterImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deregisterImageAsync(DeregisterImageRequest deregisterImageRequest,
            AsyncHandler<DeregisterImageRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DescribeSpotDatafeedSubscription
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSpotDatafeedSubscription service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DescribeSpotDatafeedSubscription
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSpotDatafeedSubscription service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSpotDatafeedSubscriptionResult> describeSpotDatafeedSubscriptionAsync(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest,
            AsyncHandler<DescribeSpotDatafeedSubscriptionRequest, DescribeSpotDatafeedSubscriptionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources.
     * This call is designed to follow a <code>DescribeTags</code> request.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTags service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of resources.
     * This call is designed to follow a <code>DescribeTags</code> request.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteTags service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            AsyncHandler<DeleteTagsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances
     * in the subnet before you can delete the subnet.
     * </p>
     *
     * @param deleteSubnetRequest Container for the necessary parameters to
     *           execute the DeleteSubnet operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSubnet service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSubnetAsync(DeleteSubnetRequest deleteSubnetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running instances
     * in the subnet before you can delete the subnet.
     * </p>
     *
     * @param deleteSubnetRequest Container for the necessary parameters to
     *           execute the DeleteSubnet operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSubnet service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSubnetAsync(DeleteSubnetRequest deleteSubnetRequest,
            AsyncHandler<DeleteSubnetRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of your AWS account.
     * </p>
     *
     * @param describeAccountAttributesRequest Container for the necessary
     *           parameters to execute the DescribeAccountAttributes operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAccountAttributes service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest describeAccountAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of your AWS account.
     * </p>
     *
     * @param describeAccountAttributesRequest Container for the necessary
     *           parameters to execute the DescribeAccountAttributes operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAccountAttributes service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(DescribeAccountAttributesRequest describeAccountAttributesRequest,
            AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the
     * endpoint on the VPC side of your VPN connection. You can create a
     * virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnGatewayRequest Container for the necessary parameters
     *           to execute the CreateVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest createVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a virtual private gateway. A virtual private gateway is the
     * endpoint on the VPC side of your VPN connection. You can create a
     * virtual private gateway before creating the VPC itself.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnGatewayRequest Container for the necessary parameters
     *           to execute the CreateVpnGateway operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpnGatewayResult> createVpnGatewayAsync(CreateVpnGatewayRequest createVpnGatewayRequest,
            AsyncHandler<CreateVpnGatewayRequest, CreateVpnGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled
     * because the data on the volume was potentially inconsistent.
     * </p>
     *
     * @param enableVolumeIORequest Container for the necessary parameters to
     *           execute the EnableVolumeIO operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         EnableVolumeIO service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableVolumeIOAsync(EnableVolumeIORequest enableVolumeIORequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled
     * because the data on the volume was potentially inconsistent.
     * </p>
     *
     * @param enableVolumeIORequest Container for the necessary parameters to
     *           execute the EnableVolumeIO operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableVolumeIO service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableVolumeIOAsync(EnableVolumeIORequest enableVolumeIORequest,
            AsyncHandler<EnableVolumeIORequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified virtual private gateway. We recommend that
     * before you delete a virtual private gateway, you detach it from the
     * VPC and delete the VPN connection. Note that you don't need to delete
     * the virtual private gateway if you plan to delete and recreate the VPN
     * connection between your VPC and your network.
     * </p>
     *
     * @param deleteVpnGatewayRequest Container for the necessary parameters
     *           to execute the DeleteVpnGateway operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnGatewayAsync(DeleteVpnGatewayRequest deleteVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified virtual private gateway. We recommend that
     * before you delete a virtual private gateway, you detach it from the
     * VPC and delete the VPN connection. Note that you don't need to delete
     * the virtual private gateway if you plan to delete and recreate the VPN
     * connection between your VPC and your network.
     * </p>
     *
     * @param deleteVpnGatewayRequest Container for the necessary parameters
     *           to execute the DeleteVpnGateway operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnGatewayAsync(DeleteVpnGatewayRequest deleteVpnGatewayRequest,
            AsyncHandler<DeleteVpnGatewayRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Amazon EBS volume to a running or stopped instance and
     * exposes it to the instance with the specified device name.
     * </p>
     * <p>
     * For a list of supported device names, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching an Amazon EBS Volume to an Instance </a> . Any device names that aren't reserved for instance store volumes can be used for Amazon EBS volumes. For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html"> Amazon EC2 Instance Store </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * 
     * <ul>
     * <li>The volume can only be attached as the root device of a stopped
     * instance.</li>
     * <li>You must be subscribed to the AWS Marketplace code that is on the
     * volume.</li>
     * <li>The configuration (instance type, operating system) of the
     * instance must support that specific AWS Marketplace code. For example,
     * you cannot take a volume from a Windows instance and attach it to a
     * Linux instance.</li>
     * <li>AWS Marketplace product codes are copied from the volume to the
     * instance.</li>
     * 
     * </ul>
     * <p>
     * For an overview of the AWS Marketplace, see
     * <a href="https://aws.amazon.com/marketplace/help/200900000"> https://aws.amazon.com/marketplace/help/200900000 </a> . For more information about how to use the AWS Marketplace, see <a href="https://aws.amazon.com/marketplace"> AWS Marketplace </a>
     * .
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param attachVolumeRequest Container for the necessary parameters to
     *           execute the AttachVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AttachVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Amazon EBS volume to a running or stopped instance and
     * exposes it to the instance with the specified device name.
     * </p>
     * <p>
     * For a list of supported device names, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching an Amazon EBS Volume to an Instance </a> . Any device names that aren't reserved for instance store volumes can be used for Amazon EBS volumes. For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html"> Amazon EC2 Instance Store </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * 
     * <ul>
     * <li>The volume can only be attached as the root device of a stopped
     * instance.</li>
     * <li>You must be subscribed to the AWS Marketplace code that is on the
     * volume.</li>
     * <li>The configuration (instance type, operating system) of the
     * instance must support that specific AWS Marketplace code. For example,
     * you cannot take a volume from a Windows instance and attach it to a
     * Linux instance.</li>
     * <li>AWS Marketplace product codes are copied from the volume to the
     * instance.</li>
     * 
     * </ul>
     * <p>
     * For an overview of the AWS Marketplace, see
     * <a href="https://aws.amazon.com/marketplace/help/200900000"> https://aws.amazon.com/marketplace/help/200900000 </a> . For more information about how to use the AWS Marketplace, see <a href="https://aws.amazon.com/marketplace"> AWS Marketplace </a>
     * .
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param attachVolumeRequest Container for the necessary parameters to
     *           execute the AttachVolume operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachVolumeResult> attachVolumeAsync(AttachVolumeRequest attachVolumeRequest,
            AsyncHandler<AttachVolumeRequest, AttachVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides
     * the result of the checks performed on your volumes to determine events
     * that can impair the performance of your volumes. The performance of a
     * volume can be affected if an issue occurs on the volume's underlying
     * host. If the volume's underlying host experiences a power outage or
     * system issue, after the system is restored, there could be data
     * inconsistencies on the volume. Volume events notify you if this
     * occurs. Volume actions notify you if any action needs to be taken in
     * response to the event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the following
     * information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i> : Reflects the current status of the volume. The
     * possible values are <code>ok</code> ,
     * <code>impaired</code> ,
     * <code>warning</code> , or
     * <code>insufficient-data</code> . If all checks pass, the overall
     * status of the volume is <code>ok</code> . If the check fails, the
     * overall status is <code>impaired</code> . If the status is
     * <code>insufficient-data</code> , then the checks may still be taking
     * place on your volume at the time. We recommend that you retry the
     * request. For more information on volume status, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"> Monitoring the Status of Your Volumes </a>
     * .
     * </p>
     * <p>
     * <i>Events</i> : Reflect the cause of a volume status and may require
     * you to take action. For example, if your volume returns an
     * <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code> . This means that your
     * volume has been affected by an issue with the underlying host, has all
     * I/O operations disabled, and may have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i> : Reflect the actions you may have to take in response
     * to an event. For example, if the status of the volume is
     * <code>impaired</code> and the volume event shows
     * <code>potential-data-inconsistency</code> , then the action shows
     * <code>enable-volume-io</code> . This means that you may want to enable
     * the I/O operations for the volume by calling the EnableVolumeIO action
     * and then check the volume for data consistency.
     * </p>
     * <p>
     * <b>NOTE:</b> Volume status is based on the volume status checks, and
     * does not reflect the volume state. Therefore, volume status does not
     * indicate volumes in the error state (for example, when a volume is
     * incapable of accepting I/O.)
     * </p>
     *
     * @param describeVolumeStatusRequest Container for the necessary
     *           parameters to execute the DescribeVolumeStatus operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumeStatus service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest describeVolumeStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the status of the specified volumes. Volume status provides
     * the result of the checks performed on your volumes to determine events
     * that can impair the performance of your volumes. The performance of a
     * volume can be affected if an issue occurs on the volume's underlying
     * host. If the volume's underlying host experiences a power outage or
     * system issue, after the system is restored, there could be data
     * inconsistencies on the volume. Volume events notify you if this
     * occurs. Volume actions notify you if any action needs to be taken in
     * response to the event.
     * </p>
     * <p>
     * The <code>DescribeVolumeStatus</code> operation provides the following
     * information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i> : Reflects the current status of the volume. The
     * possible values are <code>ok</code> ,
     * <code>impaired</code> ,
     * <code>warning</code> , or
     * <code>insufficient-data</code> . If all checks pass, the overall
     * status of the volume is <code>ok</code> . If the check fails, the
     * overall status is <code>impaired</code> . If the status is
     * <code>insufficient-data</code> , then the checks may still be taking
     * place on your volume at the time. We recommend that you retry the
     * request. For more information on volume status, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-volume-status.html"> Monitoring the Status of Your Volumes </a>
     * .
     * </p>
     * <p>
     * <i>Events</i> : Reflect the cause of a volume status and may require
     * you to take action. For example, if your volume returns an
     * <code>impaired</code> status, then the volume event might be
     * <code>potential-data-inconsistency</code> . This means that your
     * volume has been affected by an issue with the underlying host, has all
     * I/O operations disabled, and may have inconsistent data.
     * </p>
     * <p>
     * <i>Actions</i> : Reflect the actions you may have to take in response
     * to an event. For example, if the status of the volume is
     * <code>impaired</code> and the volume event shows
     * <code>potential-data-inconsistency</code> , then the action shows
     * <code>enable-volume-io</code> . This means that you may want to enable
     * the I/O operations for the volume by calling the EnableVolumeIO action
     * and then check the volume for data consistency.
     * </p>
     * <p>
     * <b>NOTE:</b> Volume status is based on the volume status checks, and
     * does not reflect the volume state. Therefore, volume status does not
     * indicate volumes in the error state (for example, when a volume is
     * incapable of accepting I/O.)
     * </p>
     *
     * @param describeVolumeStatusRequest Container for the necessary
     *           parameters to execute the DescribeVolumeStatus operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumeStatus service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumeStatusResult> describeVolumeStatusAsync(DescribeVolumeStatusRequest describeVolumeStatusRequest,
            AsyncHandler<DescribeVolumeStatusRequest, DescribeVolumeStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     *
     * @param resetImageAttributeRequest Container for the necessary
     *           parameters to execute the ResetImageAttribute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetImageAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetImageAttributeAsync(ResetImageAttributeRequest resetImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     *
     * @param resetImageAttributeRequest Container for the necessary
     *           parameters to execute the ResetImageAttribute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetImageAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetImageAttributeAsync(ResetImageAttributeRequest resetImageAttributeRequest,
            AsyncHandler<ResetImageAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeVpnConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeVpnConnections operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpnConnections service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest describeVpnConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPN connections.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeVpnConnectionsRequest Container for the necessary
     *           parameters to execute the DescribeVpnConnections operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpnConnections service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpnConnectionsResult> describeVpnConnectionsAsync(DescribeVpnConnectionsRequest describeVpnConnectionsRequest,
            AsyncHandler<DescribeVpnConnectionsRequest, DescribeVpnConnectionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the
     * routing tables of a VPC.
     * </p>
     *
     * @param enableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the EnableVgwRoutePropagation operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         EnableVgwRoutePropagation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableVgwRoutePropagationAsync(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the
     * routing tables of a VPC.
     * </p>
     *
     * @param enableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the EnableVgwRoutePropagation operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         EnableVgwRoutePropagation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> enableVgwRoutePropagationAsync(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest,
            AsyncHandler<EnableVgwRoutePropagationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot of an Amazon EBS volume and stores it in Amazon S3.
     * You can use snapshots for backups, to make copies of Amazon EBS
     * volumes, and to save data before shutting down an instance.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that are
     * associated with the source volume are propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use. However,
     * snapshots only capture data that has been written to your Amazon EBS
     * volume at the time the snapshot command is issued; this may exclude
     * any data that has been cached by any applications or the operating
     * system. If you can pause any file writes to the volume long enough to
     * take a snapshot, your snapshot should be complete. However, if you
     * cannot pause all file writes to the volume, you should unmount the
     * volume from within the instance, issue the snapshot command, and then
     * remount the volume to ensure a consistent and complete snapshot. You
     * may remount and use your volume while the snapshot status is
     * <code>pending</code> .
     * </p>
     * <p>
     * To create a snapshot for Amazon EBS volumes that serve as root
     * devices, you should stop the instance before taking the snapshot.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-snapshot.html"> Creating an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot of an Amazon EBS volume and stores it in Amazon S3.
     * You can use snapshots for backups, to make copies of Amazon EBS
     * volumes, and to save data before shutting down an instance.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that are
     * associated with the source volume are propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use. However,
     * snapshots only capture data that has been written to your Amazon EBS
     * volume at the time the snapshot command is issued; this may exclude
     * any data that has been cached by any applications or the operating
     * system. If you can pause any file writes to the volume long enough to
     * take a snapshot, your snapshot should be complete. However, if you
     * cannot pause all file writes to the volume, you should unmount the
     * volume from within the instance, issue the snapshot command, and then
     * remount the volume to ensure a consistent and complete snapshot. You
     * may remount and use your volume while the snapshot status is
     * <code>pending</code> .
     * </p>
     * <p>
     * To create a snapshot for Amazon EBS volumes that serve as root
     * devices, you should stop the instance before taking the snapshot.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-snapshot.html"> Creating an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Amazon EBS volume. The volume must be in the
     * <code>available</code> state (not attached to an instance).
     * </p>
     * <p>
     * <b>NOTE:</b> The volume remains in the deleting state for several
     * minutes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html"> Deleting an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Amazon EBS volume. The volume must be in the
     * <code>available</code> state (not attached to an instance).
     * </p>
     * <p>
     * <b>NOTE:</b> The volume remains in the deleting state for several
     * minutes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html"> Deleting an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest,
            AsyncHandler<DeleteVolumeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a network interface in the specified subnet.
     * </p>
     * <p>
     * For more information about network interfaces, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"> Elastic Network Interfaces </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the CreateNetworkInterface operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a network interface in the specified subnet.
     * </p>
     * <p>
     * For more information about network interfaces, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-eni.html"> Elastic Network Interfaces </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the CreateNetworkInterface operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateNetworkInterfaceResult> createNetworkInterfaceAsync(CreateNetworkInterfaceRequest createNetworkInterfaceRequest,
            AsyncHandler<CreateNetworkInterfaceRequest, CreateNetworkInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or
     * network platform (EC2-Classic or EC2-VPC) of your Reserved Instances.
     * The Reserved Instances to be modified must be identical, except for
     * Availability Zone, network platform, and instance type.
     * </p>
     *
     * @param modifyReservedInstancesRequest Container for the necessary
     *           parameters to execute the ModifyReservedInstances operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyReservedInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest modifyReservedInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or
     * network platform (EC2-Classic or EC2-VPC) of your Reserved Instances.
     * The Reserved Instances to be modified must be identical, except for
     * Availability Zone, network platform, and instance type.
     * </p>
     *
     * @param modifyReservedInstancesRequest Container for the necessary
     *           parameters to execute the ModifyReservedInstances operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyReservedInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ModifyReservedInstancesResult> modifyReservedInstancesAsync(ModifyReservedInstancesRequest modifyReservedInstancesRequest,
            AsyncHandler<ModifyReservedInstancesRequest, ModifyReservedInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     *
     * @param describeVpcsRequest Container for the necessary parameters to
     *           execute the DescribeVpcs operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpcs service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest describeVpcsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     *
     * @param describeVpcsRequest Container for the necessary parameters to
     *           execute the DescribeVpcs operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpcs service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpcsResult> describeVpcsAsync(DescribeVpcsRequest describeVpcsRequest,
            AsyncHandler<DescribeVpcsRequest, DescribeVpcsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network
     * interface.
     * </p>
     *
     * @param unassignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the UnassignPrivateIpAddresses operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignPrivateIpAddresses service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignPrivateIpAddressesAsync(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network
     * interface.
     * </p>
     *
     * @param unassignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the UnassignPrivateIpAddresses operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UnassignPrivateIpAddresses service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> unassignPrivateIpAddressesAsync(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest,
            AsyncHandler<UnassignPrivateIpAddressesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an active conversion task. The task can be the import of an
     * instance or volume. The action removes all artifacts of the
     * conversion, including a partially uploaded volume or instance. If the
     * conversion is complete or is in the process of transferring the final
     * disk image, the command fails and returns an exception.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param cancelConversionTaskRequest Container for the necessary
     *           parameters to execute the CancelConversionTask operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CancelConversionTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelConversionTaskAsync(CancelConversionTaskRequest cancelConversionTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an active conversion task. The task can be the import of an
     * instance or volume. The action removes all artifacts of the
     * conversion, including a partially uploaded volume or instance. If the
     * conversion is complete or is in the process of transferring the final
     * disk image, the command fails and returns an exception.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param cancelConversionTaskRequest Container for the necessary
     *           parameters to execute the CancelConversionTask operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelConversionTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelConversionTaskAsync(CancelConversionTaskRequest cancelConversionTaskRequest,
            AsyncHandler<CancelConversionTaskRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates an Elastic IP address with an instance or a network
     * interface.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or
     * in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * [EC2-Classic, default VPC] If the Elastic IP address is already
     * associated with a different instance, it is disassociated from that
     * instance and associated with the specified instance.
     * </p>
     * <p>
     * [EC2-VPC] If you don't specify a private IP address, the Elastic IP
     * address is associated with the primary IP address. If the Elastic IP
     * address is already associated with a different instance or a network
     * interface, you get an error unless you allow reassociation.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param associateAddressRequest Container for the necessary parameters
     *           to execute the AssociateAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest associateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates an Elastic IP address with an instance or a network
     * interface.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or
     * in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * [EC2-Classic, default VPC] If the Elastic IP address is already
     * associated with a different instance, it is disassociated from that
     * instance and associated with the specified instance.
     * </p>
     * <p>
     * [EC2-VPC] If you don't specify a private IP address, the Elastic IP
     * address is associated with the primary IP address. If the Elastic IP
     * address is already associated with a different instance or a network
     * interface, you get an error unless you allow reassociation.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param associateAddressRequest Container for the necessary parameters
     *           to execute the AssociateAddress operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateAddressResult> associateAddressAsync(AssociateAddressRequest associateAddressRequest,
            AsyncHandler<AssociateAddressRequest, AssociateAddressResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN
     * connection before you can delete the customer gateway.
     * </p>
     *
     * @param deleteCustomerGatewayRequest Container for the necessary
     *           parameters to execute the DeleteCustomerGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCustomerGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN
     * connection before you can delete the customer gateway.
     * </p>
     *
     * @param deleteCustomerGatewayRequest Container for the necessary
     *           parameters to execute the DeleteCustomerGateway operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteCustomerGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCustomerGatewayAsync(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest,
            AsyncHandler<DeleteCustomerGatewayRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an entry (a rule) in a network ACL with the specified rule
     * number. Each network ACL has a set of numbered ingress rules and a
     * separate set of numbered egress rules. When determining whether a
     * packet should be allowed in or out of a subnet associated with the
     * ACL, we process the entries in the ACL according to the rule numbers,
     * in ascending order. Each network ACL has a set of ingress rules and a
     * separate set of egress rules.
     * </p>
     * <p>
     * We recommend that you leave room between the rule numbers (for
     * example, 100, 110, 120, ...), and not number them one right after the
     * other (for example, 101, 102, 103, ...). This makes it easier to add a
     * rule between existing ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace
     * it, or create an entry and delete the old one.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the CreateNetworkAclEntry operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateNetworkAclEntry service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest createNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an entry (a rule) in a network ACL with the specified rule
     * number. Each network ACL has a set of numbered ingress rules and a
     * separate set of numbered egress rules. When determining whether a
     * packet should be allowed in or out of a subnet associated with the
     * ACL, we process the entries in the ACL according to the rule numbers,
     * in ascending order. Each network ACL has a set of ingress rules and a
     * separate set of egress rules.
     * </p>
     * <p>
     * We recommend that you leave room between the rule numbers (for
     * example, 100, 110, 120, ...), and not number them one right after the
     * other (for example, 101, 102, 103, ...). This makes it easier to add a
     * rule between existing ones without having to renumber the rules.
     * </p>
     * <p>
     * After you add an entry, you can't modify it; you must either replace
     * it, or create an entry and delete the old one.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the CreateNetworkAclEntry operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateNetworkAclEntry service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createNetworkAclEntryAsync(CreateNetworkAclEntryRequest createNetworkAclEntryRequest,
            AsyncHandler<CreateNetworkAclEntryRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     *
     * @param describeExportTasksRequest Container for the necessary
     *           parameters to execute the DescribeExportTasks operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeExportTasks service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     *
     * @param describeExportTasksRequest Container for the necessary
     *           parameters to execute the DescribeExportTasks operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeExportTasks service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeExportTasksResult> describeExportTasksAsync(DescribeExportTasksRequest describeExportTasksRequest,
            AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity
     * between the Internet and the VPC. The VPC must not contain any running
     * instances with Elastic IP addresses.
     * </p>
     *
     * @param detachInternetGatewayRequest Container for the necessary
     *           parameters to execute the DetachInternetGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DetachInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachInternetGatewayAsync(DetachInternetGatewayRequest detachInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity
     * between the Internet and the VPC. The VPC must not contain any running
     * instances with Elastic IP addresses.
     * </p>
     *
     * @param detachInternetGatewayRequest Container for the necessary
     *           parameters to execute the DetachInternetGateway operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachInternetGatewayAsync(DetachInternetGatewayRequest detachInternetGatewayRequest,
            AsyncHandler<DetachInternetGatewayRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a route table for the specified VPC. After you create a route
     * table, you can add routes and associate the table with a subnet.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createRouteTableRequest Container for the necessary parameters
     *           to execute the CreateRouteTable operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest createRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a route table for the specified VPC. After you create a route
     * table, you can add routes and associate the table with a subnet.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createRouteTableRequest Container for the necessary parameters
     *           to execute the CreateRouteTable operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateRouteTableResult> createRouteTableAsync(CreateRouteTableRequest createRouteTableRequest,
            AsyncHandler<CreateRouteTableRequest, CreateRouteTableResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified Amazon EBS volumes.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified Amazon EBS volumes.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumes service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumesResult> describeVolumesAsync(DescribeVolumesRequest describeVolumesRequest,
            AsyncHandler<DescribeVolumesRequest, DescribeVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesListingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesListings
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesListings service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes your account's Reserved Instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesListingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesListings
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesListings service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesListingsResult> describeReservedInstancesListingsAsync(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest,
            AsyncHandler<DescribeReservedInstancesListingsRequest, DescribeReservedInstancesListingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must be
     * in the <code>running</code> state. If your experience with the
     * instance differs from the instance status returned by
     * DescribeInstanceStatus, use ReportInstanceStatus to report your
     * experience with the instance. Amazon EC2 collects this information to
     * improve the accuracy of status checks.
     * </p>
     *
     * @param reportInstanceStatusRequest Container for the necessary
     *           parameters to execute the ReportInstanceStatus operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReportInstanceStatus service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> reportInstanceStatusAsync(ReportInstanceStatusRequest reportInstanceStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must be
     * in the <code>running</code> state. If your experience with the
     * instance differs from the instance status returned by
     * DescribeInstanceStatus, use ReportInstanceStatus to report your
     * experience with the instance. Amazon EC2 collects this information to
     * improve the accuracy of status checks.
     * </p>
     *
     * @param reportInstanceStatusRequest Container for the necessary
     *           parameters to execute the ReportInstanceStatus operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReportInstanceStatus service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> reportInstanceStatusAsync(ReportInstanceStatusRequest reportInstanceStatusRequest,
            AsyncHandler<ReportInstanceStatusRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeRouteTablesRequest Container for the necessary
     *           parameters to execute the DescribeRouteTables operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRouteTables service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest describeRouteTablesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeRouteTablesRequest Container for the necessary
     *           parameters to execute the DescribeRouteTables operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeRouteTables service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeRouteTablesResult> describeRouteTablesAsync(DescribeRouteTablesRequest describeRouteTablesRequest,
            AsyncHandler<DescribeRouteTablesRequest, DescribeRouteTablesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information about DHCP options sets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeDhcpOptionsRequest Container for the necessary
     *           parameters to execute the DescribeDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest describeDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your DHCP options sets.
     * </p>
     * <p>
     * For more information about DHCP options sets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeDhcpOptionsRequest Container for the necessary
     *           parameters to execute the DescribeDhcpOptions operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDhcpOptionsResult> describeDhcpOptionsAsync(DescribeDhcpOptionsRequest describeDhcpOptionsRequest,
            AsyncHandler<DescribeDhcpOptionsRequest, DescribeDhcpOptionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables monitoring for a running instance. For more information about
     * monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param monitorInstancesRequest Container for the necessary parameters
     *           to execute the MonitorInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         MonitorInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest monitorInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables monitoring for a running instance. For more information about
     * monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param monitorInstancesRequest Container for the necessary parameters
     *           to execute the MonitorInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         MonitorInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<MonitorInstancesResult> monitorInstancesAsync(MonitorInstancesRequest monitorInstancesRequest,
            AsyncHandler<MonitorInstancesRequest, MonitorInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeNetworkAclsRequest Container for the necessary
     *           parameters to execute the DescribeNetworkAcls operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNetworkAcls service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest describeNetworkAclsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your network ACLs.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeNetworkAclsRequest Container for the necessary
     *           parameters to execute the DescribeNetworkAcls operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNetworkAcls service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNetworkAclsResult> describeNetworkAclsAsync(DescribeNetworkAclsRequest describeNetworkAclsRequest,
            AsyncHandler<DescribeNetworkAclsRequest, DescribeNetworkAclsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your bundling tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> Completed bundle tasks are listed for only a limited
     * time. If your bundle task is no longer in the list, you can still
     * register an AMI from it. Just use RegisterImage with the Amazon S3
     * bucket name and image manifest name you provided to the bundle task.
     * </p>
     *
     * @param describeBundleTasksRequest Container for the necessary
     *           parameters to execute the DescribeBundleTasks operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBundleTasks service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest describeBundleTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your bundling tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> Completed bundle tasks are listed for only a limited
     * time. If your bundle task is no longer in the list, you can still
     * register an AMI from it. Just use RegisterImage with the Amazon S3
     * bucket name and image manifest name you provided to the bundle task.
     * </p>
     *
     * @param describeBundleTasksRequest Container for the necessary
     *           parameters to execute the DescribeBundleTasks operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBundleTasks service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBundleTasksResult> describeBundleTasksAsync(DescribeBundleTasksRequest describeBundleTasksRequest,
            AsyncHandler<DescribeBundleTasksRequest, DescribeBundleTasksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an import instance task using metadata from the specified disk
     * image. After importing the image, you then upload it using the
     * ec2-upload-disk-image command in the EC2 command line tools. For more
     * information, see Using the Command Line Tools to Import Your Virtual
     * Machine to Amazon EC2 in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param importInstanceRequest Container for the necessary parameters to
     *           execute the ImportInstance operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ImportInstance service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest importInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an import instance task using metadata from the specified disk
     * image. After importing the image, you then upload it using the
     * ec2-upload-disk-image command in the EC2 command line tools. For more
     * information, see Using the Command Line Tools to Import Your Virtual
     * Machine to Amazon EC2 in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param importInstanceRequest Container for the necessary parameters to
     *           execute the ImportInstance operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ImportInstance service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ImportInstanceResult> importInstanceAsync(ImportInstanceRequest importInstanceRequest,
            AsyncHandler<ImportInstanceRequest, ImportInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more ingress rules from a security group. The values
     * that you specify in the revoke request (for example, ports) must match
     * the existing rule's values for the rule to be removed.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupIngress operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSecurityGroupIngress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more ingress rules from a security group. The values
     * that you specify in the revoke request (for example, ports) must match
     * the existing rule's values for the rule to be removed.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupIngressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupIngress operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSecurityGroupIngress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeSecurityGroupIngressAsync(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest,
            AsyncHandler<RevokeSecurityGroupIngressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the console output for the specified instance.
     * </p>
     * <p>
     * Instances do not have a physical monitor through which you can view
     * their console output. They also lack physical controls that allow you
     * to power up, reboot, or shut them down. To allow these actions, we
     * provide them through the Amazon EC2 API and command line interface.
     * </p>
     * <p>
     * Instance console output is buffered and posted shortly after instance
     * boot, reboot, and termination. Amazon EC2 preserves the most recent 64
     * KB output which is available for at least one hour after the most
     * recent post.
     * </p>
     * <p>
     * For Linux/Unix instances, the instance console output displays the
     * exact console output that would normally be displayed on a physical
     * monitor attached to a machine. This output is buffered because the
     * instance produces it and then posts it to a store where the instance's
     * owner can retrieve it.
     * </p>
     * <p>
     * For Windows instances, the instance console output displays the last
     * three system event log errors.
     * </p>
     *
     * @param getConsoleOutputRequest Container for the necessary parameters
     *           to execute the GetConsoleOutput operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         GetConsoleOutput service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest getConsoleOutputRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the console output for the specified instance.
     * </p>
     * <p>
     * Instances do not have a physical monitor through which you can view
     * their console output. They also lack physical controls that allow you
     * to power up, reboot, or shut them down. To allow these actions, we
     * provide them through the Amazon EC2 API and command line interface.
     * </p>
     * <p>
     * Instance console output is buffered and posted shortly after instance
     * boot, reboot, and termination. Amazon EC2 preserves the most recent 64
     * KB output which is available for at least one hour after the most
     * recent post.
     * </p>
     * <p>
     * For Linux/Unix instances, the instance console output displays the
     * exact console output that would normally be displayed on a physical
     * monitor attached to a machine. This output is buffered because the
     * instance produces it and then posts it to a store where the instance's
     * owner can retrieve it.
     * </p>
     * <p>
     * For Windows instances, the instance console output displays the last
     * three system event log errors.
     * </p>
     *
     * @param getConsoleOutputRequest Container for the necessary parameters
     *           to execute the GetConsoleOutput operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetConsoleOutput service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetConsoleOutputResult> getConsoleOutputAsync(GetConsoleOutputRequest getConsoleOutputRequest,
            AsyncHandler<GetConsoleOutputRequest, GetConsoleOutputResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Internet gateway for use with a VPC. After creating the
     * Internet gateway, you attach it to a VPC using AttachInternetGateway.
     * </p>
     * <p>
     * For more information about your VPC and Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     *
     * @param createInternetGatewayRequest Container for the necessary
     *           parameters to execute the CreateInternetGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest createInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Internet gateway for use with a VPC. After creating the
     * Internet gateway, you attach it to a VPC using AttachInternetGateway.
     * </p>
     * <p>
     * For more information about your VPC and Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     *
     * @param createInternetGatewayRequest Container for the necessary
     *           parameters to execute the CreateInternetGateway operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInternetGatewayResult> createInternetGatewayAsync(CreateInternetGatewayRequest createInternetGatewayRequest,
            AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection
     * between an existing virtual private gateway and a VPN customer
     * gateway. The static route allows traffic to be routed from the virtual
     * private gateway to the VPN customer gateway.
     * </p>
     *
     * @param deleteVpnConnectionRouteRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnectionRoute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnConnectionRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified static route associated with a VPN connection
     * between an existing virtual private gateway and a VPN customer
     * gateway. The static route allows traffic to be routed from the virtual
     * private gateway to the VPN customer gateway.
     * </p>
     *
     * @param deleteVpnConnectionRouteRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnectionRoute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnConnectionRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnConnectionRouteAsync(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest,
            AsyncHandler<DeleteVpnConnectionRouteRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     *
     * @param detachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DetachNetworkInterface operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DetachNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     *
     * @param detachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DetachNetworkInterface operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DetachNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> detachNetworkInterfaceAsync(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest,
            AsyncHandler<DetachNetworkInterfaceRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify
     * only one attribute at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> AWS Marketplace product codes cannot be modified. Images
     * with an AWS Marketplace product code cannot be made public.
     * </p>
     *
     * @param modifyImageAttributeRequest Container for the necessary
     *           parameters to execute the ModifyImageAttribute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyImageAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyImageAttributeAsync(ModifyImageAttributeRequest modifyImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can specify
     * only one attribute at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> AWS Marketplace product codes cannot be modified. Images
     * with an AWS Marketplace product code cannot be made public.
     * </p>
     *
     * @param modifyImageAttributeRequest Container for the necessary
     *           parameters to execute the ModifyImageAttribute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyImageAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyImageAttributeAsync(ModifyImageAttributeRequest modifyImageAttributeRequest,
            AsyncHandler<ModifyImageAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device.
     * The customer gateway is the appliance at your end of the VPN
     * connection. (The device on the AWS side of the VPN connection is the
     * virtual private gateway.) You must provide the Internet-routable IP
     * address of the customer gateway's external interface. The IP address
     * must be static and can't be behind a device performing network address
     * translation (NAT).
     * </p>
     * <p>
     * For devices that use Border Gateway Protocol (BGP), you can also
     * provide the device's BGP Autonomous System Number (ASN). You can use
     * an existing ASN assigned to your network. If you don't have an ASN
     * already, you can use a private ASN (in the 64512 - 65534 range).
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon EC2 supports all 2-byte ASN numbers in the range
     * of 1 - 65534, with the exception of 7224, which is reserved in the
     * us-east-1 region, and 9059, which is reserved in the eu-west-1 region.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createCustomerGatewayRequest Container for the necessary
     *           parameters to execute the CreateCustomerGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCustomerGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest createCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device.
     * The customer gateway is the appliance at your end of the VPN
     * connection. (The device on the AWS side of the VPN connection is the
     * virtual private gateway.) You must provide the Internet-routable IP
     * address of the customer gateway's external interface. The IP address
     * must be static and can't be behind a device performing network address
     * translation (NAT).
     * </p>
     * <p>
     * For devices that use Border Gateway Protocol (BGP), you can also
     * provide the device's BGP Autonomous System Number (ASN). You can use
     * an existing ASN assigned to your network. If you don't have an ASN
     * already, you can use a private ASN (in the 64512 - 65534 range).
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon EC2 supports all 2-byte ASN numbers in the range
     * of 1 - 65534, with the exception of 7224, which is reserved in the
     * us-east-1 region, and 9059, which is reserved in the eu-west-1 region.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createCustomerGatewayRequest Container for the necessary
     *           parameters to execute the CreateCustomerGateway operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCustomerGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCustomerGatewayResult> createCustomerGatewayAsync(CreateCustomerGatewayRequest createCustomerGatewayRequest,
            AsyncHandler<CreateCustomerGatewayRequest, CreateCustomerGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a datafeed for Spot Instances, enabling you to view Spot
     * Instance usage logs. You can create one data feed per AWS account. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the CreateSpotDatafeedSubscription
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSpotDatafeedSubscription service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a datafeed for Spot Instances, enabling you to view Spot
     * Instance usage logs. You can create one data feed per AWS account. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the CreateSpotDatafeedSubscription
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSpotDatafeedSubscription service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSpotDatafeedSubscriptionResult> createSpotDatafeedSubscriptionAsync(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest,
            AsyncHandler<CreateSpotDatafeedSubscriptionRequest, CreateSpotDatafeedSubscriptionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between
     * the Internet and the VPC. For more information about your VPC and
     * Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     *
     * @param attachInternetGatewayRequest Container for the necessary
     *           parameters to execute the AttachInternetGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AttachInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachInternetGatewayAsync(AttachInternetGatewayRequest attachInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an Internet gateway to a VPC, enabling connectivity between
     * the Internet and the VPC. For more information about your VPC and
     * Internet gateway, see the
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/"> Amazon Virtual Private Cloud User Guide </a>
     * .
     * </p>
     *
     * @param attachInternetGatewayRequest Container for the necessary
     *           parameters to execute the AttachInternetGateway operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> attachInternetGatewayAsync(AttachInternetGatewayRequest attachInternetGatewayRequest,
            AsyncHandler<AttachInternetGatewayRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we recommend
     * that you detach the virtual private gateway from the VPC and delete
     * the VPC before deleting the VPN connection.
     * </p>
     *
     * @param deleteVpnConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnection operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnConnection service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnConnectionAsync(DeleteVpnConnectionRequest deleteVpnConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we recommend
     * that you detach the virtual private gateway from the VPC and delete
     * the VPC before deleting the VPN connection.
     * </p>
     *
     * @param deleteVpnConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnection operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpnConnection service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpnConnectionAsync(DeleteVpnConnectionRequest deleteVpnConnectionRequest,
            AsyncHandler<DeleteVpnConnectionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your conversion tasks. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeConversionTasksRequest Container for the necessary
     *           parameters to execute the DescribeConversionTasks operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConversionTasks service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest describeConversionTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your conversion tasks. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeConversionTasksRequest Container for the necessary
     *           parameters to execute the DescribeConversionTasks operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeConversionTasks service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeConversionTasksResult> describeConversionTasksAsync(DescribeConversionTasksRequest describeConversionTasksRequest,
            AsyncHandler<DescribeConversionTasksRequest, DescribeConversionTasksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The only supported connection type is
     * <code>ipsec.1</code> .
     * </p>
     * <p>
     * The response includes information that you need to give to your
     * network administrator to configure your customer gateway.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend that you use HTTPS when
     * calling this operation because the response contains sensitive
     * cryptographic information for configuring your customer gateway.
     * </p>
     * <p>
     * If you decide to shut down your VPN connection for any reason and
     * later create a new VPN connection, you must reconfigure your customer
     * gateway with the new information returned from this call.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnConnectionRequest Container for the necessary
     *           parameters to execute the CreateVpnConnection operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnConnection service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest createVpnConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a VPN connection between an existing virtual private gateway
     * and a VPN customer gateway. The only supported connection type is
     * <code>ipsec.1</code> .
     * </p>
     * <p>
     * The response includes information that you need to give to your
     * network administrator to configure your customer gateway.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> We strongly recommend that you use HTTPS when
     * calling this operation because the response contains sensitive
     * cryptographic information for configuring your customer gateway.
     * </p>
     * <p>
     * If you decide to shut down your VPN connection for any reason and
     * later create a new VPN connection, you must reconfigure your customer
     * gateway with the new information returned from this call.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnConnectionRequest Container for the necessary
     *           parameters to execute the CreateVpnConnection operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnConnection service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpnConnectionResult> createVpnConnectionAsync(CreateVpnConnectionRequest createVpnConnectionRequest,
            AsyncHandler<CreateVpnConnectionRequest, CreateVpnConnectionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an attribute of the specified instance. You can specify only
     * one attribute at a time.
     * </p>
     *
     * @param describeInstanceAttributeRequest Container for the necessary
     *           parameters to execute the DescribeInstanceAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest describeInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an attribute of the specified instance. You can specify only
     * one attribute at a time.
     * </p>
     *
     * @param describeInstanceAttributeRequest Container for the necessary
     *           parameters to execute the DescribeInstanceAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceAttributeResult> describeInstanceAttributeAsync(DescribeInstanceAttributeRequest describeInstanceAttributeRequest,
            AsyncHandler<DescribeInstanceAttributeRequest, DescribeInstanceAttributeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeSubnetsRequest Container for the necessary parameters
     *           to execute the DescribeSubnets operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSubnets service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest describeSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your subnets.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeSubnetsRequest Container for the necessary parameters
     *           to execute the DescribeSubnets operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSubnets service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSubnetsResult> describeSubnetsAsync(DescribeSubnetsRequest describeSubnetsRequest,
            AsyncHandler<DescribeSubnetsRequest, DescribeSubnetsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you
     * have permissions.
     * </p>
     * <p>
     * When you launch an instance, it enters the <code>pending</code> state.
     * After the instance is ready for you, it enters the
     * <code>running</code> state. To check the state of your instance, call
     * DescribeInstances.
     * </p>
     * <p>
     * If you don't specify a security group when launching an instance,
     * Amazon EC2 uses the default security group. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Security Groups </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at boot.
     * You can use this key to provide secure access to the instance. Amazon
     * EC2 public images use this feature to provide secure access without
     * passwords. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can provide optional user data when launching an instance. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html"> Instance Metadata </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If any of the AMIs have a product code attached for which the user has
     * not subscribed, <code>RunInstances</code> fails.
     * </p>
     *
     * @param runInstancesRequest Container for the necessary parameters to
     *           execute the RunInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RunInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest runInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you
     * have permissions.
     * </p>
     * <p>
     * When you launch an instance, it enters the <code>pending</code> state.
     * After the instance is ready for you, it enters the
     * <code>running</code> state. To check the state of your instance, call
     * DescribeInstances.
     * </p>
     * <p>
     * If you don't specify a security group when launching an instance,
     * Amazon EC2 uses the default security group. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"> Security Groups </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at boot.
     * You can use this key to provide secure access to the instance. Amazon
     * EC2 public images use this feature to provide secure access without
     * passwords. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can provide optional user data when launching an instance. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html"> Instance Metadata </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If any of the AMIs have a product code attached for which the user has
     * not subscribed, <code>RunInstances</code> fails.
     * </p>
     *
     * @param runInstancesRequest Container for the necessary parameters to
     *           execute the RunInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RunInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RunInstancesResult> runInstancesAsync(RunInstancesRequest runInstancesRequest,
            AsyncHandler<RunInstancesRequest, RunInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your placement groups. For more information
     * about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describePlacementGroupsRequest Container for the necessary
     *           parameters to execute the DescribePlacementGroups operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePlacementGroups service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest describePlacementGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your placement groups. For more information
     * about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describePlacementGroupsRequest Container for the necessary
     *           parameters to execute the DescribePlacementGroups operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribePlacementGroups service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribePlacementGroupsResult> describePlacementGroupsAsync(DescribePlacementGroupsRequest describePlacementGroupsRequest,
            AsyncHandler<DescribePlacementGroupsRequest, DescribePlacementGroupsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a subnet with a route table. The subnet and route table
     * must be in the same VPC. This association causes traffic originating
     * from the subnet to be routed according to the routes in the route
     * table. The action returns an association ID, which you need in order
     * to disassociate the route table from the subnet later. A route table
     * can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param associateRouteTableRequest Container for the necessary
     *           parameters to execute the AssociateRouteTable operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest associateRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a subnet with a route table. The subnet and route table
     * must be in the same VPC. This association causes traffic originating
     * from the subnet to be routed according to the routes in the route
     * table. The action returns an association ID, which you need in order
     * to disassociate the route table from the subnet later. A route table
     * can be associated with multiple subnets.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param associateRouteTableRequest Container for the necessary
     *           parameters to execute the AssociateRouteTable operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssociateRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AssociateRouteTableResult> associateRouteTableAsync(AssociateRouteTableRequest associateRouteTableRequest,
            AsyncHandler<AssociateRouteTableRequest, AssociateRouteTableResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your instances.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns
     * information for those instances. If you do not specify instance IDs,
     * Amazon EC2 returns information for all relevant instances. If you
     * specify an instance ID that is not valid, an error is returned. If you
     * specify an instance that you do not own, it is not included in the
     * returned results.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results.
     * This interval is usually less than one hour.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your instances.
     * </p>
     * <p>
     * If you specify one or more instance IDs, Amazon EC2 returns
     * information for those instances. If you do not specify instance IDs,
     * Amazon EC2 returns information for all relevant instances. If you
     * specify an instance ID that is not valid, an error is returned. If you
     * specify an instance that you do not own, it is not included in the
     * returned results.
     * </p>
     * <p>
     * Recently terminated instances might appear in the returned results.
     * This interval is usually less than one hour.
     * </p>
     *
     * @param describeInstancesRequest Container for the necessary parameters
     *           to execute the DescribeInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest,
            AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's
     * associated with any subnets. You can't delete the default network ACL.
     * </p>
     *
     * @param deleteNetworkAclRequest Container for the necessary parameters
     *           to execute the DeleteNetworkAcl operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNetworkAcl service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNetworkAclAsync(DeleteNetworkAclRequest deleteNetworkAclRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's
     * associated with any subnets. You can't delete the default network ACL.
     * </p>
     *
     * @param deleteNetworkAclRequest Container for the necessary parameters
     *           to execute the DeleteNetworkAcl operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNetworkAcl service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNetworkAclAsync(DeleteNetworkAclRequest deleteNetworkAclRequest,
            AsyncHandler<DeleteNetworkAclRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a volume attribute.
     * </p>
     * <p>
     * By default, all I/O operations for the volume are suspended when the
     * data on the volume is determined to be potentially inconsistent, to
     * prevent undetectable, latent data corruption. The I/O access to the
     * volume can be resumed by first enabling I/O access and then checking
     * the data consistency on your volume.
     * </p>
     * <p>
     * You can change the default behavior to resume I/O operations. We
     * recommend that you change this only for boot volumes or for volumes
     * that are stateless or disposable.
     * </p>
     *
     * @param modifyVolumeAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVolumeAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyVolumeAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a volume attribute.
     * </p>
     * <p>
     * By default, all I/O operations for the volume are suspended when the
     * data on the volume is determined to be potentially inconsistent, to
     * prevent undetectable, latent data corruption. The I/O access to the
     * volume can be resumed by first enabling I/O access and then checking
     * the data consistency on your volume.
     * </p>
     * <p>
     * You can change the default behavior to resume I/O operations. We
     * recommend that you change this only for boot volumes or for volumes
     * that are stateless or disposable.
     * </p>
     *
     * @param modifyVolumeAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVolumeAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyVolumeAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyVolumeAttributeAsync(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest,
            AsyncHandler<ModifyVolumeAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the images (AMIs, AKIs, and ARIs) available
     * to you. Images available to you include public images, private images
     * that you own, and private images owned by other AWS accounts but for
     * which you have explicit launch permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> Deregistered images are included in the returned results
     * for an unspecified interval after deregistration.
     * </p>
     *
     * @param describeImagesRequest Container for the necessary parameters to
     *           execute the DescribeImages operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeImages service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the images (AMIs, AKIs, and ARIs) available
     * to you. Images available to you include public images, private images
     * that you own, and private images owned by other AWS accounts but for
     * which you have explicit launch permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> Deregistered images are included in the returned results
     * for an unspecified interval after deregistration.
     * </p>
     *
     * @param describeImagesRequest Container for the necessary parameters to
     *           execute the DescribeImages operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeImages service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeImagesResult> describeImagesAsync(DescribeImagesRequest describeImagesRequest,
            AsyncHandler<DescribeImagesRequest, DescribeImagesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an Amazon EBS-backed AMI that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time. Each time you
     * transition an instance from stopped to started, Amazon EC2 charges a
     * full instance hour, even if transitions happen multiple times within a
     * single hour.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it
     * can be restarted. Stopping an instance does not preserve data stored
     * in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html"> Stopping Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param startInstancesRequest Container for the necessary parameters to
     *           execute the StartInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest startInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Starts an Amazon EBS-backed AMI that you've previously stopped.
     * </p>
     * <p>
     * Instances that use Amazon EBS volumes as their root devices can be
     * quickly stopped and started. When an instance is stopped, the compute
     * resources are released and you are not billed for hourly instance
     * usage. However, your root partition Amazon EBS volume remains,
     * continues to persist your data, and you are charged for Amazon EBS
     * volume usage. You can restart your instance at any time. Each time you
     * transition an instance from stopped to started, Amazon EC2 charges a
     * full instance hour, even if transitions happen multiple times within a
     * single hour.
     * </p>
     * <p>
     * Before stopping an instance, make sure it is in a state from which it
     * can be restarted. Stopping an instance does not preserve data stored
     * in RAM.
     * </p>
     * <p>
     * Performing this operation on an instance that uses an instance store
     * as its root device returns an error.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Stop_Start.html"> Stopping Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param startInstancesRequest Container for the necessary parameters to
     *           execute the StartInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartInstancesResult> startInstancesAsync(StartInstancesRequest startInstancesRequest,
            AsyncHandler<StartInstancesRequest, StartInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels the specified Reserved Instance listing in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param cancelReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CancelReservedInstancesListing
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CancelReservedInstancesListing service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels the specified Reserved Instance listing in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param cancelReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CancelReservedInstancesListing
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelReservedInstancesListing service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelReservedInstancesListingResult> cancelReservedInstancesListingAsync(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest,
            AsyncHandler<CancelReservedInstancesListingRequest, CancelReservedInstancesListingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified instance. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * To modify some attributes, the instance must be stopped. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"> Modifying Attributes of a Stopped Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param modifyInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ModifyInstanceAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified instance. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * To modify some attributes, the instance must be stopped. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"> Modifying Attributes of a Stopped Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param modifyInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ModifyInstanceAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyInstanceAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyInstanceAttributeAsync(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest,
            AsyncHandler<ModifyInstanceAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the
     * set of DHCP options before you can delete it. You can disassociate the
     * set of DHCP options by associating either a new set of options or the
     * default set of options with the VPC.
     * </p>
     *
     * @param deleteDhcpOptionsRequest Container for the necessary parameters
     *           to execute the DeleteDhcpOptions operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified set of DHCP options. You must disassociate the
     * set of DHCP options before you can delete it. You can disassociate the
     * set of DHCP options by associating either a new set of options or the
     * default set of options with the VPC.
     * </p>
     *
     * @param deleteDhcpOptionsRequest Container for the necessary parameters
     *           to execute the DeleteDhcpOptions operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDhcpOptions service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDhcpOptionsAsync(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest,
            AsyncHandler<DeleteDhcpOptionsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more ingress rules to a security group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 100 rules per group.
     * EC2-VPC: You can have up to 50 rules per group (covering both ingress
     * and egress rules).
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * <p>
     * [EC2-Classic] This action gives one or more CIDR IP address ranges
     * permission to access a security group in your account, or gives one or
     * more security groups (called the <i>source groups</i> ) permission to
     * access a security group for your account. A source group can be for
     * your own AWS account, or another.
     * </p>
     * <p>
     * [EC2-VPC] This action gives one or more CIDR IP address ranges
     * permission to access a security group in your VPC, or gives one or
     * more other security groups (called the <i>source groups</i> )
     * permission to access a security group for your VPC. The security
     * groups must all be for the same VPC.
     * </p>
     *
     * @param authorizeSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeSecurityGroupIngress
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSecurityGroupIngress service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more ingress rules to a security group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 100 rules per group.
     * EC2-VPC: You can have up to 50 rules per group (covering both ingress
     * and egress rules).
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     * <p>
     * [EC2-Classic] This action gives one or more CIDR IP address ranges
     * permission to access a security group in your account, or gives one or
     * more security groups (called the <i>source groups</i> ) permission to
     * access a security group for your account. A source group can be for
     * your own AWS account, or another.
     * </p>
     * <p>
     * [EC2-VPC] This action gives one or more CIDR IP address ranges
     * permission to access a security group in your VPC, or gives one or
     * more other security groups (called the <i>source groups</i> )
     * permission to access a security group for your VPC. The security
     * groups must all be for the same VPC.
     * </p>
     *
     * @param authorizeSecurityGroupIngressRequest Container for the
     *           necessary parameters to execute the AuthorizeSecurityGroupIngress
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AuthorizeSecurityGroupIngress service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> authorizeSecurityGroupIngressAsync(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest,
            AsyncHandler<AuthorizeSecurityGroupIngressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the Spot Instance requests that belong to your account. Spot
     * Instances are instances that Amazon EC2 starts on your behalf when the
     * maximum price that you specify exceeds the current Spot Price. Amazon
     * EC2 periodically sets the Spot Price based on available Spot Instance
     * capacity and current Spot Instance requests. For more information
     * about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a
     * running Spot Instance by examining the response. If the status of the
     * Spot Instance is <code>fulfilled</code> , the instance ID appears in
     * the response and contains the identifier of the instance.
     * Alternatively, you can use DescribeInstances with a filter to look for
     * instances where the instance lifecycle is <code>spot</code> .
     * </p>
     *
     * @param describeSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the DescribeSpotInstanceRequests operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSpotInstanceRequests service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the Spot Instance requests that belong to your account. Spot
     * Instances are instances that Amazon EC2 starts on your behalf when the
     * maximum price that you specify exceeds the current Spot Price. Amazon
     * EC2 periodically sets the Spot Price based on available Spot Instance
     * capacity and current Spot Instance requests. For more information
     * about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a
     * running Spot Instance by examining the response. If the status of the
     * Spot Instance is <code>fulfilled</code> , the instance ID appears in
     * the response and contains the identifier of the instance.
     * Alternatively, you can use DescribeInstances with a filter to look for
     * instances where the instance lifecycle is <code>spot</code> .
     * </p>
     *
     * @param describeSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the DescribeSpotInstanceRequests operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSpotInstanceRequests service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSpotInstanceRequestsResult> describeSpotInstanceRequestsAsync(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest,
            AsyncHandler<DescribeSpotInstanceRequestsRequest, DescribeSpotInstanceRequestsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a VPC with the specified CIDR block.
     * </p>
     * <p>
     * The smallest VPC you can create uses a /28 netmask (16 IP addresses),
     * and the largest uses a /16 netmask (65,536 IP addresses). To help you
     * decide how big to make your VPC, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP
     * options, which includes only a default DNS server that we provide
     * (AmazonProvidedDNS). For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpcRequest Container for the necessary parameters to
     *           execute the CreateVpc operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpc service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpcResult> createVpcAsync(CreateVpcRequest createVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a VPC with the specified CIDR block.
     * </p>
     * <p>
     * The smallest VPC you can create uses a /28 netmask (16 IP addresses),
     * and the largest uses a /16 netmask (65,536 IP addresses). To help you
     * decide how big to make your VPC, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * By default, each instance you launch in the VPC has the default DHCP
     * options, which includes only a default DNS server that we provide
     * (AmazonProvidedDNS). For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpcRequest Container for the necessary parameters to
     *           execute the CreateVpc operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpc service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVpcResult> createVpcAsync(CreateVpcRequest createVpcRequest,
            AsyncHandler<CreateVpcRequest, CreateVpcResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeCustomerGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeCustomerGateways operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCustomerGateways service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPN customer gateways.
     * </p>
     * <p>
     * For more information about VPN customer gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeCustomerGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeCustomerGateways operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCustomerGateways service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCustomerGatewaysResult> describeCustomerGatewaysAsync(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest,
            AsyncHandler<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of
     * the export, including any partially-created Amazon S3 objects. If the
     * export task is complete or is in the process of transferring the final
     * disk image, the command fails and returns an error.
     * </p>
     *
     * @param cancelExportTaskRequest Container for the necessary parameters
     *           to execute the CancelExportTask operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CancelExportTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an active export task. The request removes all artifacts of
     * the export, including any partially-created Amazon S3 objects. If the
     * export task is complete or is in the process of transferring the final
     * disk image, the command fails and returns an error.
     * </p>
     *
     * @param cancelExportTaskRequest Container for the necessary parameters
     *           to execute the CancelExportTask operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelExportTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> cancelExportTaskAsync(CancelExportTaskRequest cancelExportTaskRequest,
            AsyncHandler<CancelExportTaskRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: Internet gateway, NAT
     * instance, or network interface.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most
     * specific match. For example, let's say the traffic is destined for
     * <code>192.0.2.3</code> , and the route table includes the following
     * two routes:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <code>192.0.2.0/24</code> (goes to some target A)
     * </p>
     * </li>
     * <li> <p>
     * <code>192.0.2.0/28</code> (goes to some target B)
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code> .
     * However, the second route in the list covers a smaller number of IP
     * addresses and is therefore more specific, so we use that route to
     * determine where to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createRouteRequest Container for the necessary parameters to
     *           execute the CreateRoute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createRouteAsync(CreateRouteRequest createRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: Internet gateway, NAT
     * instance, or network interface.
     * </p>
     * <p>
     * When determining how to route traffic, we use the route with the most
     * specific match. For example, let's say the traffic is destined for
     * <code>192.0.2.3</code> , and the route table includes the following
     * two routes:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <code>192.0.2.0/24</code> (goes to some target A)
     * </p>
     * </li>
     * <li> <p>
     * <code>192.0.2.0/28</code> (goes to some target B)
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Both routes apply to the traffic destined for <code>192.0.2.3</code> .
     * However, the second route in the list covers a smaller number of IP
     * addresses and is therefore more specific, so we use that route to
     * determine where to target the traffic.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createRouteRequest Container for the necessary parameters to
     *           execute the CreateRoute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createRouteAsync(CreateRouteRequest createRouteRequest,
            AsyncHandler<CreateRouteRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the
     * region in which the request was made.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"> Copying AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copyImageRequest Container for the necessary parameters to
     *           execute the CopyImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CopyImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CopyImageResult> copyImageAsync(CopyImageRequest copyImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the
     * region in which the request was made.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"> Copying AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copyImageRequest Container for the necessary parameters to
     *           execute the CopyImage operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CopyImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CopyImageResult> copyImageAsync(CopyImageRequest copyImageRequest,
            AsyncHandler<CopyImageRequest, CopyImageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify
     * only one attribute at a time.
     * </p>
     *
     * @param modifyNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ModifyNetworkInterfaceAttribute
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyNetworkInterfaceAttribute service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyNetworkInterfaceAttributeAsync(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify
     * only one attribute at a time.
     * </p>
     *
     * @param modifyNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ModifyNetworkInterfaceAttribute
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifyNetworkInterfaceAttribute service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifyNetworkInterfaceAttributeAsync(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest,
            AsyncHandler<ModifyNetworkInterfaceAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route
     * table from any subnets before you can delete it. You can't delete the
     * main route table.
     * </p>
     *
     * @param deleteRouteTableRequest Container for the necessary parameters
     *           to execute the DeleteRouteTable operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteRouteTableAsync(DeleteRouteTableRequest deleteRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route
     * table from any subnets before you can delete it. You can't delete the
     * main route table.
     * </p>
     *
     * @param deleteRouteTableRequest Container for the necessary parameters
     *           to execute the DeleteRouteTable operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteRouteTableAsync(DeleteRouteTableRequest deleteRouteTableRequest,
            AsyncHandler<DeleteRouteTableRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param describeNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the DescribeNetworkInterfaceAttribute
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNetworkInterfaceAttribute service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param describeNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the DescribeNetworkInterfaceAttribute
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeNetworkInterfaceAttribute service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeNetworkInterfaceAttributeResult> describeNetworkInterfaceAttributeAsync(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest,
            AsyncHandler<DescribeNetworkInterfaceAttributeRequest, DescribeNetworkInterfaceAttributeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Spot Instance request. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param requestSpotInstancesRequest Container for the necessary
     *           parameters to execute the RequestSpotInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RequestSpotInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest requestSpotInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Spot Instance request. Spot Instances are instances that
     * Amazon EC2 starts on your behalf when the maximum price that you
     * specify exceeds the current Spot Price. Amazon EC2 periodically sets
     * the Spot Price based on available Spot Instance capacity and current
     * Spot Instance requests. For more information about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param requestSpotInstancesRequest Container for the necessary
     *           parameters to execute the RequestSpotInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RequestSpotInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RequestSpotInstancesResult> requestSpotInstancesAsync(RequestSpotInstancesRequest requestSpotInstancesRequest,
            AsyncHandler<RequestSpotInstancesRequest, RequestSpotInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified EC2 resource or
     * resources. Each resource can have a maximum of 10 tags. Each tag
     * consists of a key and optional value. Tag keys must be unique per
     * resource.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTags service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createTagsAsync(CreateTagsRequest createTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified EC2 resource or
     * resources. Each resource can have a maximum of 10 tags. Each tag
     * consists of a key and optional value. Tag keys must be unique per
     * resource.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateTags service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createTagsAsync(CreateTagsRequest createTagsRequest,
            AsyncHandler<CreateTagsRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumeAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVolumeAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumeAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest describeVolumeAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about Amazon EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumeAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVolumeAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVolumeAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVolumeAttributeResult> describeVolumeAttributeAsync(DescribeVolumeAttributeRequest describeVolumeAttributeRequest,
            AsyncHandler<DescribeVolumeAttributeRequest, DescribeVolumeAttributeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     *
     * @param attachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the AttachNetworkInterface operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AttachNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     *
     * @param attachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the AttachNetworkInterface operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AttachNetworkInterface service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AttachNetworkInterfaceResult> attachNetworkInterfaceAsync(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest,
            AsyncHandler<AttachNetworkInterfaceRequest, AttachNetworkInterfaceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must
     * provide only one of the following: Internet gateway, NAT instance, or
     * network interface.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceRouteRequest Container for the necessary parameters to
     *           execute the ReplaceRoute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> replaceRouteAsync(ReplaceRouteRequest replaceRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must
     * provide only one of the following: Internet gateway, NAT instance, or
     * network interface.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceRouteRequest Container for the necessary parameters to
     *           execute the ReplaceRoute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> replaceRouteAsync(ReplaceRouteRequest replaceRouteRequest,
            AsyncHandler<ReplaceRouteRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the tags for your EC2 resources.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeTagsRequest Container for the necessary parameters to
     *           execute the DescribeTags operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeTags service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows
     * instance.
     * </p>
     *
     * @param cancelBundleTaskRequest Container for the necessary parameters
     *           to execute the CancelBundleTask operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CancelBundleTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest cancelBundleTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows
     * instance.
     * </p>
     *
     * @param cancelBundleTaskRequest Container for the necessary parameters
     *           to execute the CancelBundleTask operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelBundleTask service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelBundleTaskResult> cancelBundleTaskAsync(CancelBundleTaskRequest cancelBundleTaskRequest,
            AsyncHandler<CancelBundleTaskRequest, CancelBundleTaskResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to
     * the routing tables of a VPC.
     * </p>
     *
     * @param disableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the DisableVgwRoutePropagation operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DisableVgwRoutePropagation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableVgwRoutePropagationAsync(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to
     * the routing tables of a VPC.
     * </p>
     *
     * @param disableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the DisableVgwRoutePropagation operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisableVgwRoutePropagation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disableVgwRoutePropagationAsync(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest,
            AsyncHandler<DisableVgwRoutePropagationRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels one or more Spot Instance requests. Spot Instances are
     * instances that Amazon EC2 starts on your behalf when the maximum price
     * that you specify exceeds the current Spot Price. Amazon EC2
     * periodically sets the Spot Price based on available Spot Instance
     * capacity and current Spot Instance requests. For more information
     * about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Canceling a Spot Instance request does not terminate
     * running Spot Instances associated with the request.
     * </p>
     *
     * @param cancelSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the CancelSpotInstanceRequests operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CancelSpotInstanceRequests service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels one or more Spot Instance requests. Spot Instances are
     * instances that Amazon EC2 starts on your behalf when the maximum price
     * that you specify exceeds the current Spot Price. Amazon EC2
     * periodically sets the Spot Price based on available Spot Instance
     * capacity and current Spot Instance requests. For more information
     * about Spot Instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Canceling a Spot Instance request does not terminate
     * running Spot Instances associated with the request.
     * </p>
     *
     * @param cancelSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the CancelSpotInstanceRequests operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CancelSpotInstanceRequests service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CancelSpotInstanceRequestsResult> cancelSpotInstanceRequestsAsync(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest,
            AsyncHandler<CancelSpotInstanceRequestsRequest, CancelSpotInstanceRequestsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Purchases a Reserved Instance for use with your account. With Amazon
     * EC2 Reserved Instances, you obtain a capacity reservation for a
     * certain instance configuration over a specified period of time. You
     * pay a lower usage rate than with On-Demand instances for the time that
     * you actually use the capacity reservation.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param purchaseReservedInstancesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedInstancesOffering
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedInstancesOffering service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Purchases a Reserved Instance for use with your account. With Amazon
     * EC2 Reserved Instances, you obtain a capacity reservation for a
     * certain instance configuration over a specified period of time. You
     * pay a lower usage rate than with On-Demand instances for the time that
     * you actually use the capacity reservation.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param purchaseReservedInstancesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedInstancesOffering
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         PurchaseReservedInstancesOffering service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PurchaseReservedInstancesOfferingResult> purchaseReservedInstancesOfferingAsync(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest,
            AsyncHandler<PurchaseReservedInstancesOfferingRequest, PurchaseReservedInstancesOfferingResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Snapshots with AWS Marketplace product codes cannot be
     * made public.
     * </p>
     *
     * @param modifySnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ModifySnapshotAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ModifySnapshotAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot.
     * </p>
     * <p>
     * For more information on modifying snapshot permissions, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-modifying-snapshot-permissions.html"> Sharing Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> Snapshots with AWS Marketplace product codes cannot be
     * made public.
     * </p>
     *
     * @param modifySnapshotAttributeRequest Container for the necessary
     *           parameters to execute the ModifySnapshotAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ModifySnapshotAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> modifySnapshotAttributeAsync(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest,
            AsyncHandler<ModifySnapshotAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no
     * parameter is specified, information about all your Reserved Instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     *
     * @param describeReservedInstancesModificationsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedInstancesModifications operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesModifications service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the modifications made to your Reserved Instances. If no
     * parameter is specified, information about all your Reserved Instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     *
     * @param describeReservedInstancesModificationsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedInstancesModifications operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesModifications service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesModificationsResult> describeReservedInstancesModificationsAsync(DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest,
            AsyncHandler<DescribeReservedInstancesModificationsRequest, DescribeReservedInstancesModificationsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Shuts down one or more instances. This operation is idempotent; if you
     * terminate an instance more than once, each call succeeds.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for
     * approximately one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all Amazon EBS volumes that were
     * attached when the instance launched. Volumes attached after instance
     * launch continue running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, the root device and
     * any other devices attached during the instance launch are
     * automatically deleted. For more information about the differences
     * between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param terminateInstancesRequest Container for the necessary
     *           parameters to execute the TerminateInstances operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest terminateInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Shuts down one or more instances. This operation is idempotent; if you
     * terminate an instance more than once, each call succeeds.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for
     * approximately one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all Amazon EBS volumes that were
     * attached when the instance launched. Volumes attached after instance
     * launch continue running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, the root device and
     * any other devices attached during the instance launch are
     * automatically deleted. For more information about the differences
     * between stopping and terminating instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param terminateInstancesRequest Container for the necessary
     *           parameters to execute the TerminateInstances operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         TerminateInstances service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<TerminateInstancesResult> terminateInstancesAsync(TerminateInstancesRequest terminateInstancesRequest,
            AsyncHandler<TerminateInstancesRequest, TerminateInstancesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DeleteSpotDatafeedSubscription
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSpotDatafeedSubscription service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the datafeed for Spot Instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DeleteSpotDatafeedSubscription
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSpotDatafeedSubscription service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSpotDatafeedSubscriptionAsync(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest,
            AsyncHandler<DeleteSpotDatafeedSubscriptionRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet
     * gateway from the VPC before you can delete it.
     * </p>
     *
     * @param deleteInternetGatewayRequest Container for the necessary
     *           parameters to execute the DeleteInternetGateway operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInternetGatewayAsync(DeleteInternetGatewayRequest deleteInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet
     * gateway from the VPC before you can delete it.
     * </p>
     *
     * @param deleteInternetGatewayRequest Container for the necessary
     *           parameters to execute the DeleteInternetGateway operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteInternetGateway service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteInternetGatewayAsync(DeleteInternetGatewayRequest deleteInternetGatewayRequest,
            AsyncHandler<DeleteInternetGatewayRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an attribute of the specified snapshot. You can specify only
     * one attribute at a time.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an attribute of the specified snapshot. You can specify only
     * one attribute at a time.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotAttributeResult> describeSnapshotAttributeAsync(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest,
            AsyncHandler<DescribeSnapshotAttributeRequest, DescribeSnapshotAttributeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the route table associated with a given subnet in a VPC. After
     * the operation completes, the subnet uses the routes in the new route
     * table it's associated with. For more information about route tables,
     * see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * You can also use ReplaceRouteTableAssociation to change which table is
     * the main route table in the VPC. You just specify the main route
     * table's association ID and the route table to be the new main route
     * table.
     * </p>
     *
     * @param replaceRouteTableAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceRouteTableAssociation operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceRouteTableAssociation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the route table associated with a given subnet in a VPC. After
     * the operation completes, the subnet uses the routes in the new route
     * table it's associated with. For more information about route tables,
     * see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * You can also use ReplaceRouteTableAssociation to change which table is
     * the main route table in the VPC. You just specify the main route
     * table's association ID and the route table to be the new main route
     * table.
     * </p>
     *
     * @param replaceRouteTableAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceRouteTableAssociation operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceRouteTableAssociation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReplaceRouteTableAssociationResult> replaceRouteTableAssociationAsync(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest,
            AsyncHandler<ReplaceRouteTableAssociationRequest, ReplaceRouteTableAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or
     * in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAddressesRequest Container for the necessary parameters
     *           to execute the DescribeAddresses operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAddresses service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform or
     * in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAddressesRequest Container for the necessary parameters
     *           to execute the DescribeAddresses operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeAddresses service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeAddressesResult> describeAddressesAsync(DescribeAddressesRequest describeAddressesRequest,
            AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an attributes of an AMI. You can specify only one attribute
     * at a time.
     * </p>
     *
     * @param describeImageAttributeRequest Container for the necessary
     *           parameters to execute the DescribeImageAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeImageAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest describeImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes an attributes of an AMI. You can specify only one attribute
     * at a time.
     * </p>
     *
     * @param describeImageAttributeRequest Container for the necessary
     *           parameters to execute the DescribeImageAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeImageAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeImageAttributeResult> describeImageAttributeAsync(DescribeImageAttributeRequest describeImageAttributeRequest,
            AsyncHandler<DescribeImageAttributeRequest, DescribeImageAttributeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeKeyPairsRequest Container for the necessary parameters
     *           to execute the DescribeKeyPairs operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKeyPairs service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest describeKeyPairsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your key pairs.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeKeyPairsRequest Container for the necessary parameters
     *           to execute the DescribeKeyPairs operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeKeyPairs service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeKeyPairsResult> describeKeyPairsAsync(DescribeKeyPairsRequest describeKeyPairsRequest,
            AsyncHandler<DescribeKeyPairsRequest, DescribeKeyPairsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This
     * action can only be used by the owner of the product code. It is useful
     * when a product code owner needs to verify whether another user's
     * instance is eligible for support.
     * </p>
     *
     * @param confirmProductInstanceRequest Container for the necessary
     *           parameters to execute the ConfirmProductInstance operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmProductInstance service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest confirmProductInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Determines whether a product code is associated with an instance. This
     * action can only be used by the owner of the product code. It is useful
     * when a product code owner needs to verify whether another user's
     * instance is eligible for support.
     * </p>
     *
     * @param confirmProductInstanceRequest Container for the necessary
     *           parameters to execute the ConfirmProductInstance operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ConfirmProductInstance service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ConfirmProductInstanceResult> confirmProductInstanceAsync(ConfirmProductInstanceRequest confirmProductInstanceRequest,
            AsyncHandler<ConfirmProductInstanceRequest, ConfirmProductInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates a subnet from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes in
     * the route table. Instead, it uses the routes in the VPC's main route
     * table. For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param disassociateRouteTableRequest Container for the necessary
     *           parameters to execute the DisassociateRouteTable operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateRouteTableAsync(DisassociateRouteTableRequest disassociateRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates a subnet from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes in
     * the route table. Instead, it uses the routes in the VPC's main route
     * table. For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param disassociateRouteTableRequest Container for the necessary
     *           parameters to execute the DisassociateRouteTable operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateRouteTable service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateRouteTableAsync(DisassociateRouteTableRequest disassociateRouteTableRequest,
            AsyncHandler<DisassociateRouteTableRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeVpcAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVpcAttribute operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpcAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest describeVpcAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeVpcAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVpcAttribute operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpcAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpcAttributeResult> describeVpcAttributeAsync(DescribeVpcAttributeRequest describeVpcAttributeRequest,
            AsyncHandler<DescribeVpcAttributeRequest, DescribeVpcAttributeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more egress rules from a security group for EC2-VPC.
     * The values that you specify in the revoke request (for example, ports)
     * must match the existing rule's values for the rule to be revoked.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupEgress operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSecurityGroupEgress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeSecurityGroupEgressAsync(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Removes one or more egress rules from a security group for EC2-VPC.
     * The values that you specify in the revoke request (for example, ports)
     * must match the existing rule's values for the rule to be revoked.
     * </p>
     * <p>
     * Each rule consists of the protocol and the CIDR range or source
     * security group. For the TCP and UDP protocols, you must also specify
     * the destination port or range of ports. For the ICMP protocol, you
     * must also specify the ICMP type and code.
     * </p>
     * <p>
     * Rule changes are propagated to instances within the security group as
     * quickly as possible. However, a small delay might occur.
     * </p>
     *
     * @param revokeSecurityGroupEgressRequest Container for the necessary
     *           parameters to execute the RevokeSecurityGroupEgress operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RevokeSecurityGroupEgress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> revokeSecurityGroupEgressAsync(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest,
            AsyncHandler<RevokeSecurityGroupEgressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the
     * specified network ACL.
     * </p>
     *
     * @param deleteNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the DeleteNetworkAclEntry operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNetworkAclEntry service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the
     * specified network ACL.
     * </p>
     *
     * @param deleteNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the DeleteNetworkAclEntry operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteNetworkAclEntry service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteNetworkAclEntryAsync(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest,
            AsyncHandler<DeleteNetworkAclEntryRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon EBS volume that can be attached to any instance in
     * the same Availability Zone.
     * </p>
     * <p>
     * Any AWS Marketplace product codes from the snapshot are propagated to
     * the volume.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"> Creating or Restoring an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createVolumeRequest Container for the necessary parameters to
     *           execute the CreateVolume operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an Amazon EBS volume that can be attached to any instance in
     * the same Availability Zone.
     * </p>
     * <p>
     * Any AWS Marketplace product codes from the snapshot are propagated to
     * the volume.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"> Creating or Restoring an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createVolumeRequest Container for the necessary parameters to
     *           execute the CreateVolume operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVolume service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateVolumeResult> createVolumeAsync(CreateVolumeRequest createVolumeRequest,
            AsyncHandler<CreateVolumeRequest, CreateVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the status of one or more instances, including any scheduled
     * events.
     * </p>
     * <p>
     * Instance status has two main components:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * System Status reports impaired functionality that stems from issues
     * related to the systems that support an instance, such as such as
     * hardware failures and network connectivity problems. This call reports
     * such problems as impaired reachability.
     * </p>
     * </li>
     * <li> <p>
     * Instance Status reports impaired functionality that arises from
     * problems internal to the instance. This call reports such problems as
     * impaired reachability.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Instance status provides information about four types of scheduled
     * events for an instance that may require your attention:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Scheduled Reboot: When Amazon EC2 determines that an instance must be
     * rebooted, the instances status returns one of two event codes:
     * <code>system-reboot</code> or <code>instance-reboot</code> . System
     * reboot commonly occurs if certain maintenance or upgrade operations
     * require a reboot of the underlying host that supports an instance.
     * Instance reboot commonly occurs if the instance must be rebooted,
     * rather than the underlying host. Rebooting events include a scheduled
     * start and end time.
     * </p>
     * </li>
     * <li> <p>
     * System Maintenance: When Amazon EC2 determines that an instance
     * requires maintenance that requires power or network impact, the
     * instance status is the event code <code>system-maintenance</code> .
     * System maintenance is either power maintenance or network maintenance.
     * For power maintenance, your instance will be unavailable for a brief
     * period of time and then rebooted. For network maintenance, your
     * instance will experience a brief loss of network connectivity. System
     * maintenance events include a scheduled start and end time. You will
     * also be notified by email if one of your instances is set for system
     * maintenance. The email message indicates when your instance is
     * scheduled for maintenance.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Retirement: When Amazon EC2 determines that an instance must
     * be shut down, the instance status is the event code
     * <code>instance-retirement</code> . Retirement commonly occurs when the
     * underlying host is degraded and must be replaced. Retirement events
     * include a scheduled start and end time. You will also be notified by
     * email if one of your instances is set to retiring. The email message
     * indicates when your instance will be permanently retired.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Stop: When Amazon EC2 determines that an instance must be
     * shut down, the instances status returns an event code called
     * <code>instance-stop</code> .
     * Stop events include a scheduled start and end time. You will
     * also be notified by email if one of your instances is set to stop. The
     * email message indicates when your instance will be stopped.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * When your instance is retired, it will either be terminated (if its
     * root device type is the instance-store) or stopped (if its root device
     * type is an EBS volume). Instances stopped due to retirement will not
     * be restarted, but you can do so manually. You can also avoid
     * retirement of EBS-backed instances by manually restarting your
     * instance when its event code is <code>instance-retirement</code> .
     * This ensures that your instance is started on a different underlying
     * host.
     * </p>
     *
     * @param describeInstanceStatusRequest Container for the necessary
     *           parameters to execute the DescribeInstanceStatus operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceStatus service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest describeInstanceStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the status of one or more instances, including any scheduled
     * events.
     * </p>
     * <p>
     * Instance status has two main components:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * System Status reports impaired functionality that stems from issues
     * related to the systems that support an instance, such as such as
     * hardware failures and network connectivity problems. This call reports
     * such problems as impaired reachability.
     * </p>
     * </li>
     * <li> <p>
     * Instance Status reports impaired functionality that arises from
     * problems internal to the instance. This call reports such problems as
     * impaired reachability.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * Instance status provides information about four types of scheduled
     * events for an instance that may require your attention:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * Scheduled Reboot: When Amazon EC2 determines that an instance must be
     * rebooted, the instances status returns one of two event codes:
     * <code>system-reboot</code> or <code>instance-reboot</code> . System
     * reboot commonly occurs if certain maintenance or upgrade operations
     * require a reboot of the underlying host that supports an instance.
     * Instance reboot commonly occurs if the instance must be rebooted,
     * rather than the underlying host. Rebooting events include a scheduled
     * start and end time.
     * </p>
     * </li>
     * <li> <p>
     * System Maintenance: When Amazon EC2 determines that an instance
     * requires maintenance that requires power or network impact, the
     * instance status is the event code <code>system-maintenance</code> .
     * System maintenance is either power maintenance or network maintenance.
     * For power maintenance, your instance will be unavailable for a brief
     * period of time and then rebooted. For network maintenance, your
     * instance will experience a brief loss of network connectivity. System
     * maintenance events include a scheduled start and end time. You will
     * also be notified by email if one of your instances is set for system
     * maintenance. The email message indicates when your instance is
     * scheduled for maintenance.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Retirement: When Amazon EC2 determines that an instance must
     * be shut down, the instance status is the event code
     * <code>instance-retirement</code> . Retirement commonly occurs when the
     * underlying host is degraded and must be replaced. Retirement events
     * include a scheduled start and end time. You will also be notified by
     * email if one of your instances is set to retiring. The email message
     * indicates when your instance will be permanently retired.
     * </p>
     * </li>
     * <li> <p>
     * Scheduled Stop: When Amazon EC2 determines that an instance must be
     * shut down, the instances status returns an event code called
     * <code>instance-stop</code> .
     * Stop events include a scheduled start and end time. You will
     * also be notified by email if one of your instances is set to stop. The
     * email message indicates when your instance will be stopped.
     * </p>
     * </li>
     * 
     * </ul>
     * <p>
     * When your instance is retired, it will either be terminated (if its
     * root device type is the instance-store) or stopped (if its root device
     * type is an EBS volume). Instances stopped due to retirement will not
     * be restarted, but you can do so manually. You can also avoid
     * retirement of EBS-backed instances by manually restarting your
     * instance when its event code is <code>instance-retirement</code> .
     * This ensures that your instance is started on a different underlying
     * host.
     * </p>
     *
     * @param describeInstanceStatusRequest Container for the necessary
     *           parameters to execute the DescribeInstanceStatus operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeInstanceStatus service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeInstanceStatusResult> describeInstanceStatusAsync(DescribeInstanceStatusRequest describeInstanceStatusRequest,
            AsyncHandler<DescribeInstanceStatusRequest, DescribeInstanceStatusResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding an IPsec Hardware VPN to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeVpnGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVpnGateways operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpnGateways service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your virtual private gateways.
     * </p>
     * <p>
     * For more information about virtual private gateways, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding an IPsec Hardware VPN to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeVpnGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeVpnGateways operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeVpnGateways service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeVpnGatewaysResult> describeVpnGatewaysAsync(DescribeVpnGatewaysRequest describeVpnGatewaysRequest,
            AsyncHandler<DescribeVpnGatewaysRequest, DescribeVpnGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the CIDR block
     * you want for the subnet. After you create a subnet, you can't change
     * its CIDR block. The subnet's CIDR block can be the same as the VPC's
     * CIDR block (assuming you want only a single subnet in the VPC), or a
     * subset of the VPC's CIDR block. If you create more than one subnet in
     * a VPC, the subnets' CIDR blocks must not overlap. The smallest subnet
     * (and VPC) you can create uses a /28 netmask (16 IP addresses), and the
     * largest uses a /16 netmask (65,536 IP addresses).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> AWS reserves both the first four and the last IP
     * address in each subnet's CIDR block. They're not available for use.
     * </p>
     * <p>
     * If you add more than one subnet to a VPC, they're set up in a star
     * topology with a logical router in the middle.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createSubnetRequest Container for the necessary parameters to
     *           execute the CreateSubnet operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSubnet service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest createSubnetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the CIDR block
     * you want for the subnet. After you create a subnet, you can't change
     * its CIDR block. The subnet's CIDR block can be the same as the VPC's
     * CIDR block (assuming you want only a single subnet in the VPC), or a
     * subset of the VPC's CIDR block. If you create more than one subnet in
     * a VPC, the subnets' CIDR blocks must not overlap. The smallest subnet
     * (and VPC) you can create uses a /28 netmask (16 IP addresses), and the
     * largest uses a /16 netmask (65,536 IP addresses).
     * </p>
     * <p>
     * <b>IMPORTANT:</b> AWS reserves both the first four and the last IP
     * address in each subnet's CIDR block. They're not available for use.
     * </p>
     * <p>
     * If you add more than one subnet to a VPC, they're set up in a star
     * topology with a logical router in the middle.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createSubnetRequest Container for the necessary parameters to
     *           execute the CreateSubnet operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSubnet service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSubnetResult> createSubnetAsync(CreateSubnetRequest createSubnetRequest,
            AsyncHandler<CreateSubnetRequest, CreateSubnetResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Reserved Instance offerings that are available for purchase.
     * With Reserved Instances, you purchase the right to launch instances
     * for a period of time. During that time period, you do not receive
     * insufficient capacity errors, and you pay a lower usage rate than the
     * rate charged for On-Demand instances for the actual time used.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesOfferings
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesOfferings service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Reserved Instance offerings that are available for purchase.
     * With Reserved Instances, you purchase the right to launch instances
     * for a period of time. During that time period, you do not receive
     * insufficient capacity errors, and you pay a lower usage rate than the
     * rate charged for On-Demand instances for the actual time used.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesOfferings
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeReservedInstancesOfferings service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeReservedInstancesOfferingsResult> describeReservedInstancesOfferingsAsync(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest,
            AsyncHandler<DescribeReservedInstancesOfferingsRequest, DescribeReservedInstancesOfferingsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns one or more secondary private IP addresses to the specified
     * network interface. You can specify one or more specific secondary IP
     * addresses, or you can specify the number of secondary IP addresses to
     * be automatically assigned within the subnet's CIDR block range. The
     * number of secondary IP addresses that you can assign to an instance
     * varies by instance type. For information about instance types, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"> Instance Types </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about Elastic IP addresses, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * AssignPrivateIpAddresses is available only in EC2-VPC.
     * </p>
     *
     * @param assignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the AssignPrivateIpAddresses operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AssignPrivateIpAddresses service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Assigns one or more secondary private IP addresses to the specified
     * network interface. You can specify one or more specific secondary IP
     * addresses, or you can specify the number of secondary IP addresses to
     * be automatically assigned within the subnet's CIDR block range. The
     * number of secondary IP addresses that you can assign to an instance
     * varies by instance type. For information about instance types, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html"> Instance Types </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about Elastic IP addresses, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * AssignPrivateIpAddresses is available only in EC2-VPC.
     * </p>
     *
     * @param assignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the AssignPrivateIpAddresses operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AssignPrivateIpAddresses service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> assignPrivateIpAddressesAsync(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest,
            AsyncHandler<AssignPrivateIpAddressesRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a volume, the snapshots are
     * incremental, and only the blocks on the device that have changed since
     * your last snapshot are saved in the new snapshot. When you delete a
     * snapshot, only the data not needed for any other snapshot is removed.
     * So regardless of which prior snapshots have been deleted, all active
     * snapshots will have access to all the information needed to restore
     * the volume.
     * </p>
     * <p>
     * You cannot delete a snapshot of the root device of an Amazon EBS
     * volume used by a registered AMI. You must first de-register the AMI
     * before you can delete the snapshot.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html"> Deleting an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified snapshot.
     * </p>
     * <p>
     * When you make periodic snapshots of a volume, the snapshots are
     * incremental, and only the blocks on the device that have changed since
     * your last snapshot are saved in the new snapshot. When you delete a
     * snapshot, only the data not needed for any other snapshot is removed.
     * So regardless of which prior snapshots have been deleted, all active
     * snapshots will have access to all the information needed to restore
     * the volume.
     * </p>
     * <p>
     * You cannot delete a snapshot of the root device of an Amazon EBS
     * volume used by a registered AMI. You must first de-register the AMI
     * before you can delete the snapshot.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html"> Deleting an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshot service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteSnapshotAsync(DeleteSnapshotRequest deleteSnapshotRequest,
            AsyncHandler<DeleteSnapshotRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when
     * you create a subnet, it's automatically associated with the default
     * network ACL. For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclAssociation operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceNetworkAclAssociation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default when
     * you create a subnet, it's automatically associated with the default
     * network ACL. For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclAssociation operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceNetworkAclAssociation service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ReplaceNetworkAclAssociationResult> replaceNetworkAclAssociationAsync(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest,
            AsyncHandler<ReplaceNetworkAclAssociationRequest, ReplaceNetworkAclAssociationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network
     * interface it's associated with.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param disassociateAddressRequest Container for the necessary
     *           parameters to execute the DisassociateAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateAddressAsync(DisassociateAddressRequest disassociateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network
     * interface it's associated with.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param disassociateAddressRequest Container for the necessary
     *           parameters to execute the DisassociateAddress operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DisassociateAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> disassociateAddressAsync(DisassociateAddressRequest disassociateAddressRequest,
            AsyncHandler<DisassociateAddressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a placement group that you launch cluster instances into. You
     * must give the group a name that's unique within the scope of your
     * account.
     * </p>
     * <p>
     * For more information about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createPlacementGroupRequest Container for the necessary
     *           parameters to execute the CreatePlacementGroup operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePlacementGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createPlacementGroupAsync(CreatePlacementGroupRequest createPlacementGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a placement group that you launch cluster instances into. You
     * must give the group a name that's unique within the scope of your
     * account.
     * </p>
     * <p>
     * For more information about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createPlacementGroupRequest Container for the necessary
     *           parameters to execute the CreatePlacementGroup operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreatePlacementGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createPlacementGroupAsync(CreatePlacementGroupRequest createPlacementGroupRequest,
            AsyncHandler<CreatePlacementGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data on
     * other instance store volumes is not preserved.
     * </p>
     * <p>
     * <b>NOTE:</b> This procedure is not applicable for Linux/Unix instances
     * or Windows instances that are backed by Amazon EBS.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/Creating_InstanceStoreBacked_WinAMI.html"> Creating an Instance Store-Backed Windows AMI </a>
     * .
     * </p>
     *
     * @param bundleInstanceRequest Container for the necessary parameters to
     *           execute the BundleInstance operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         BundleInstance service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest bundleInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data on
     * other instance store volumes is not preserved.
     * </p>
     * <p>
     * <b>NOTE:</b> This procedure is not applicable for Linux/Unix instances
     * or Windows instances that are backed by Amazon EBS.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/Creating_InstanceStoreBacked_WinAMI.html"> Creating an Instance Store-Backed Windows AMI </a>
     * .
     * </p>
     *
     * @param bundleInstanceRequest Container for the necessary parameters to
     *           execute the BundleInstance operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         BundleInstance service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<BundleInstanceResult> bundleInstanceAsync(BundleInstanceRequest bundleInstanceRequest,
            AsyncHandler<BundleInstanceRequest, BundleInstanceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all
     * instances in the placement group before you can delete the placement
     * group. For more information about placement groups and cluster
     * instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deletePlacementGroupRequest Container for the necessary
     *           parameters to execute the DeletePlacementGroup operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePlacementGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePlacementGroupAsync(DeletePlacementGroupRequest deletePlacementGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified placement group. You must terminate all
     * instances in the placement group before you can delete the placement
     * group. For more information about placement groups and cluster
     * instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deletePlacementGroupRequest Container for the necessary
     *           parameters to execute the DeletePlacementGroup operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeletePlacementGroup service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deletePlacementGroupAsync(DeletePlacementGroupRequest deletePlacementGroupRequest,
            AsyncHandler<DeletePlacementGroupRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified VPC. You must detach or delete all gateways and
     * resources that are associated with the VPC before you can delete it.
     * For example, you must terminate all instances running in the VPC,
     * delete all security groups associated with the VPC (except the default
     * one), delete all route tables associated with the VPC (except the
     * default one), and so on.
     * </p>
     *
     * @param deleteVpcRequest Container for the necessary parameters to
     *           execute the DeleteVpc operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpc service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpcAsync(DeleteVpcRequest deleteVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified VPC. You must detach or delete all gateways and
     * resources that are associated with the VPC before you can delete it.
     * For example, you must terminate all instances running in the VPC,
     * delete all security groups associated with the VPC (except the default
     * one), delete all route tables associated with the VPC (except the
     * default one), and so on.
     * </p>
     *
     * @param deleteVpcRequest Container for the necessary parameters to
     *           execute the DeleteVpc operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVpc service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteVpcAsync(DeleteVpcRequest deleteVpcRequest,
            AsyncHandler<DeleteVpcRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies a point-in-time snapshot of an Amazon EBS volume and stores it
     * in Amazon S3. You can copy the snapshot within the same region or from
     * one region to another. You can use the snapshot to create Amazon EBS
     * volumes or Amazon Machine Images (AMIs).
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"> Copying an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CopySnapshot service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies a point-in-time snapshot of an Amazon EBS volume and stores it
     * in Amazon S3. You can copy the snapshot within the same region or from
     * one region to another. You can use the snapshot to create Amazon EBS
     * volumes or Amazon Machine Images (AMIs).
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"> Copying an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CopySnapshot service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CopySnapshotResult> copySnapshotAsync(CopySnapshotRequest copySnapshotRequest,
            AsyncHandler<CopySnapshotRequest, CopySnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or
     * in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param allocateAddressRequest Container for the necessary parameters
     *           to execute the AllocateAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         AllocateAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest allocateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform or
     * in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param allocateAddressRequest Container for the necessary parameters
     *           to execute the AllocateAddress operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AllocateAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AllocateAddressResult> allocateAddressAsync(AllocateAddressRequest allocateAddressRequest,
            AsyncHandler<AllocateAddressRequest, AllocateAddressResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP
     * address pool and might be unavailable to you. Be sure to update your
     * DNS records and any servers or devices that communicate with the
     * address. If you attempt to release an Elastic IP address that you
     * already released, you'll get an <code>AuthFailure</code> error if the
     * address is already allocated to another AWS account.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address
     * automatically disassociates it from any instance that it's associated
     * with. To disassociate an Elastic IP address without releasing it, use
     * DisassociateAddress.
     * </p>
     * <p>
     * [Nondefault VPC] You must use the DisassociateAddress to disassociate
     * the Elastic IP address before you try to release it. Otherwise, Amazon
     * EC2 returns an error ( <code>InvalidIPAddress.InUse</code> ).
     * </p>
     *
     * @param releaseAddressRequest Container for the necessary parameters to
     *           execute the ReleaseAddress operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReleaseAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> releaseAddressAsync(ReleaseAddressRequest releaseAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Releases the specified Elastic IP address.
     * </p>
     * <p>
     * After releasing an Elastic IP address, it is released to the IP
     * address pool and might be unavailable to you. Be sure to update your
     * DNS records and any servers or devices that communicate with the
     * address. If you attempt to release an Elastic IP address that you
     * already released, you'll get an <code>AuthFailure</code> error if the
     * address is already allocated to another AWS account.
     * </p>
     * <p>
     * [EC2-Classic, default VPC] Releasing an Elastic IP address
     * automatically disassociates it from any instance that it's associated
     * with. To disassociate an Elastic IP address without releasing it, use
     * DisassociateAddress.
     * </p>
     * <p>
     * [Nondefault VPC] You must use the DisassociateAddress to disassociate
     * the Elastic IP address before you try to release it. Otherwise, Amazon
     * EC2 returns an error ( <code>InvalidIPAddress.InUse</code> ).
     * </p>
     *
     * @param releaseAddressRequest Container for the necessary parameters to
     *           execute the ReleaseAddress operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReleaseAddress service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> releaseAddressAsync(ReleaseAddressRequest releaseAddressRequest,
            AsyncHandler<ReleaseAddressRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the
     * kernel or RAM disk, the instance must be in a stopped state. To reset
     * the <code>SourceDestCheck</code> , the instance can be either running
     * or stopped.
     * </p>
     * <p>
     * The <code>SourceDestCheck</code> attribute controls whether
     * source/destination checking is enabled. The default value is
     * <code>true</code> , which means checking is enabled. This value must
     * be <code>false</code> for a NAT instance to perform NAT. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"> NAT Instances </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param resetInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ResetInstanceAttribute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetInstanceAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetInstanceAttributeAsync(ResetInstanceAttributeRequest resetInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the
     * kernel or RAM disk, the instance must be in a stopped state. To reset
     * the <code>SourceDestCheck</code> , the instance can be either running
     * or stopped.
     * </p>
     * <p>
     * The <code>SourceDestCheck</code> attribute controls whether
     * source/destination checking is enabled. The default value is
     * <code>true</code> , which means checking is enabled. This value must
     * be <code>false</code> for a NAT instance to perform NAT. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"> NAT Instances </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param resetInstanceAttributeRequest Container for the necessary
     *           parameters to execute the ResetInstanceAttribute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetInstanceAttribute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetInstanceAttributeAsync(ResetInstanceAttributeRequest resetInstanceAttributeRequest,
            AsyncHandler<ResetInstanceAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2
     * stores the public key and displays the private key for you to save to
     * a file. The private key is returned as an unencrypted PEM encoded
     * PKCS#8 private key. If a key with the specified name already exists,
     * Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per region.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createKeyPairRequest Container for the necessary parameters to
     *           execute the CreateKeyPair operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKeyPair service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a 2048-bit RSA key pair with the specified name. Amazon EC2
     * stores the public key and displays the private key for you to save to
     * a file. The private key is returned as an unencrypted PEM encoded
     * PKCS#8 private key. If a key with the specified name already exists,
     * Amazon EC2 returns an error.
     * </p>
     * <p>
     * You can have up to five thousand key pairs per region.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createKeyPairRequest Container for the necessary parameters to
     *           execute the CreateKeyPair operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateKeyPair service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest,
            AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information about
     * network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclEntry operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceNetworkAclEntry service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces an entry (rule) in a network ACL. For more information about
     * network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclEntry operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ReplaceNetworkAclEntry service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> replaceNetworkAclEntryAsync(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest,
            AsyncHandler<ReplaceNetworkAclEntryRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Amazon EBS snapshots available to you.
     * Available snapshots include public snapshots available for any AWS
     * account to launch, private snapshots that you own, and private
     * snapshots owned by another AWS account but for which you've been given
     * explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * 
     * <ul>
     * <li> <i>public</i> : The owner of the snapshot granted create volume
     * permissions for the snapshot to the <code>all</code> group. All AWS
     * accounts have create volume permissions for these snapshots.</li>
     * <li> <i>explicit</i> : The owner of the snapshot granted create
     * volume permissions to a specific AWS account.</li>
     * <li> <i>implicit</i> : An AWS account has implicit create volume
     * permissions for all snapshots it owns.</li>
     * 
     * </ul>
     * <p>
     * The list of snapshots returned can be modified by specifying snapshot
     * IDs, snapshot owners, or AWS accounts with create volume permissions.
     * If no options are specified, Amazon EC2 returns all snapshots for
     * which you have create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the
     * specified IDs are returned. If you specify an invalid snapshot ID, an
     * error is returned. If you specify a snapshot ID for which you do not
     * have access, it is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners, only snapshots from the
     * specified owners and for which you have access are returned. The
     * results can include the AWS account IDs of the specified owners,
     * <code>amazon</code> for snapshots owned by Amazon, or
     * <code>self</code> for snapshots that you own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create
     * snapshot permissions for those users are returned. You can specify AWS
     * account IDs (if you own the snapshots), <code>self</code> for
     * snapshots for which you own or have explicit permissions, or
     * <code>all</code> for public snapshots.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Amazon EBS snapshots available to you.
     * Available snapshots include public snapshots available for any AWS
     * account to launch, private snapshots that you own, and private
     * snapshots owned by another AWS account but for which you've been given
     * explicit create volume permissions.
     * </p>
     * <p>
     * The create volume permissions fall into the following categories:
     * </p>
     * 
     * <ul>
     * <li> <i>public</i> : The owner of the snapshot granted create volume
     * permissions for the snapshot to the <code>all</code> group. All AWS
     * accounts have create volume permissions for these snapshots.</li>
     * <li> <i>explicit</i> : The owner of the snapshot granted create
     * volume permissions to a specific AWS account.</li>
     * <li> <i>implicit</i> : An AWS account has implicit create volume
     * permissions for all snapshots it owns.</li>
     * 
     * </ul>
     * <p>
     * The list of snapshots returned can be modified by specifying snapshot
     * IDs, snapshot owners, or AWS accounts with create volume permissions.
     * If no options are specified, Amazon EC2 returns all snapshots for
     * which you have create volume permissions.
     * </p>
     * <p>
     * If you specify one or more snapshot IDs, only snapshots that have the
     * specified IDs are returned. If you specify an invalid snapshot ID, an
     * error is returned. If you specify a snapshot ID for which you do not
     * have access, it is not included in the returned results.
     * </p>
     * <p>
     * If you specify one or more snapshot owners, only snapshots from the
     * specified owners and for which you have access are returned. The
     * results can include the AWS account IDs of the specified owners,
     * <code>amazon</code> for snapshots owned by Amazon, or
     * <code>self</code> for snapshots that you own.
     * </p>
     * <p>
     * If you specify a list of restorable users, only snapshots with create
     * snapshot permissions for those users are returned. You can specify AWS
     * account IDs (if you own the snapshots), <code>self</code> for
     * snapshots for which you own or have explicit permissions, or
     * <code>all</code> for public snapshots.
     * </p>
     * <p>
     * For more information about Amazon EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshots service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotsResult> describeSnapshotsAsync(DescribeSnapshotsRequest describeSnapshotsRequest,
            AsyncHandler<DescribeSnapshotsRequest, DescribeSnapshotsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional layer
     * of security (in addition to security groups) for the instances in your
     * VPC.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclRequest Container for the necessary parameters
     *           to execute the CreateNetworkAcl operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateNetworkAcl service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest createNetworkAclRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional layer
     * of security (in addition to security groups) for the instances in your
     * VPC.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclRequest Container for the necessary parameters
     *           to execute the CreateNetworkAcl operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateNetworkAcl service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateNetworkAclResult> createNetworkAclAsync(CreateNetworkAclRequest createNetworkAclRequest,
            AsyncHandler<CreateNetworkAclRequest, CreateNetworkAclResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an AMI. When you're creating an AMI, this is the final step
     * you must complete before you can launch an instance from the AMI. For
     * more information about creating AMIs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html"> Creating Your Own AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> For Amazon EBS-backed instances, CreateImage creates and
     * registers the AMI in a single request, so you don't have to register
     * the AMI yourself.
     * </p>
     * <p>
     * You can also use <code>RegisterImage</code> to create an Amazon
     * EBS-backed AMI from a snapshot of a root device volume. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_LaunchingInstanceFromSnapshot.html"> Launching an Instance from a Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If needed, you can deregister an AMI at any time. Any modifications
     * you make to an AMI backed by an instance store volume invalidates its
     * registration. If you make changes to an image, deregister the previous
     * image and register the new image.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't register an image where a secondary (non-root)
     * snapshot has AWS Marketplace product codes.
     * </p>
     *
     * @param registerImageRequest Container for the necessary parameters to
     *           execute the RegisterImage operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterImageResult> registerImageAsync(RegisterImageRequest registerImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Registers an AMI. When you're creating an AMI, this is the final step
     * you must complete before you can launch an instance from the AMI. For
     * more information about creating AMIs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/creating-an-ami.html"> Creating Your Own AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>NOTE:</b> For Amazon EBS-backed instances, CreateImage creates and
     * registers the AMI in a single request, so you don't have to register
     * the AMI yourself.
     * </p>
     * <p>
     * You can also use <code>RegisterImage</code> to create an Amazon
     * EBS-backed AMI from a snapshot of a root device volume. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_LaunchingInstanceFromSnapshot.html"> Launching an Instance from a Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If needed, you can deregister an AMI at any time. Any modifications
     * you make to an AMI backed by an instance store volume invalidates its
     * registration. If you make changes to an image, deregister the previous
     * image and register the new image.
     * </p>
     * <p>
     * <b>NOTE:</b> You can't register an image where a secondary (non-root)
     * snapshot has AWS Marketplace product codes.
     * </p>
     *
     * @param registerImageRequest Container for the necessary parameters to
     *           execute the RegisterImage operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         RegisterImage service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<RegisterImageResult> registerImageAsync(RegisterImageRequest registerImageRequest,
            AsyncHandler<RegisterImageRequest, RegisterImageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param resetNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ResetNetworkInterfaceAttribute
     *           operation on AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         ResetNetworkInterfaceAttribute service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetNetworkInterfaceAttributeAsync(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param resetNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ResetNetworkInterfaceAttribute
     *           operation on AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ResetNetworkInterfaceAttribute service method, as returned by
     *         AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> resetNetworkInterfaceAttributeAsync(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest,
            AsyncHandler<ResetNetworkInterfaceAttributeRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an
     * existing virtual private gateway and a VPN customer gateway. The
     * static route allows traffic to be routed from the virtual private
     * gateway to the VPN customer gateway.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnConnectionRouteRequest Container for the necessary
     *           parameters to execute the CreateVpnConnectionRoute operation on
     *           AmazonEC2.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnConnectionRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a static route associated with a VPN connection between an
     * existing virtual private gateway and a VPN customer gateway. The
     * static route allows traffic to be routed from the virtual private
     * gateway to the VPN customer gateway.
     * </p>
     * <p>
     * For more information about VPN connections, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createVpnConnectionRouteRequest Container for the necessary
     *           parameters to execute the CreateVpnConnectionRoute operation on
     *           AmazonEC2.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateVpnConnectionRoute service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> createVpnConnectionRouteAsync(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest,
            AsyncHandler<CreateVpnConnectionRouteRequest, Void> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        