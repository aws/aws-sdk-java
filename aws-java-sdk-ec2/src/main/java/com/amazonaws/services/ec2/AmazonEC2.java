/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.ec2.model.*;

/**
 * Interface for accessing AmazonEC2.
 * Amazon Elastic Compute Cloud <p>
 * Amazon Elastic Compute Cloud (Amazon EC2) provides resizable computing
 * capacity in the Amazon Web Services (AWS) cloud. Using Amazon EC2
 * eliminates your need to invest in hardware up front, so you can
 * develop and deploy applications faster.
 * </p>
 */
public interface AmazonEC2 {

    /**
     * Overrides the default endpoint for this client ("https://ec2.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonEC2#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link com.amazonaws.regions.Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link com.amazonaws.regions.Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(com.amazonaws.regions.Region region) throws java.lang.IllegalArgumentException;
    
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
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html"> Getting Console Output and Rebooting Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param rebootInstancesRequest Container for the necessary parameters
     *           to execute the RebootInstances service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void rebootInstances(RebootInstancesRequest rebootInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Reserved instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesRequest Container for the necessary
     *           parameters to execute the DescribeReservedInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesResult describeReservedInstances(DescribeReservedInstancesRequest describeReservedInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches an EBS volume from an instance. Make sure to unmount any
     * file systems on the device within your operating system before
     * detaching the volume. Failure to do so results in the volume being
     * stuck in a busy state while detaching.
     * </p>
     * <p>
     * If an Amazon EBS volume is the root device of an instance, it can't
     * be detached while the instance is running. To detach the root volume,
     * stop the instance first.
     * </p>
     * <p>
     * When a volume with an AWS Marketplace product code is detached from
     * an instance, the product code is no longer associated with the
     * instance.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html"> Detaching an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param detachVolumeRequest Container for the necessary parameters to
     *           execute the DetachVolume service method on AmazonEC2.
     * 
     * @return The response from the DetachVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachVolumeResult detachVolume(DetachVolumeRequest detachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified key pair, by removing the public key from
     * Amazon EC2.
     * </p>
     *
     * @param deleteKeyPairRequest Container for the necessary parameters to
     *           execute the DeleteKeyPair service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a virtual private gateway to a VPC. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param attachVpnGatewayRequest Container for the necessary parameters
     *           to execute the AttachVpnGateway service method on AmazonEC2.
     * 
     * @return The response from the AttachVpnGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachVpnGatewayResult attachVpnGateway(AttachVpnGatewayRequest attachVpnGatewayRequest) 
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
     *           execute the CreateImage service method on AmazonEC2.
     * 
     * @return The response from the CreateImage service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateImageResult createImage(CreateImageRequest createImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Set the instance affinity value for a specific stopped instance and
     * modify the instance tenancy setting.
     * </p>
     * <p>
     * Instance affinity is disabled by default. When instance affinity is
     * <code>host</code> and it is not associated with a specific Dedicated
     * host, the next time it is launched it will automatically be associated
     * with the host it lands on. This relationship will persist if the
     * instance is stopped/started, or rebooted.
     * </p>
     * <p>
     * You can modify the host ID associated with a stopped instance. If a
     * stopped instance has a new host ID association, the instance will
     * target that host when restarted.
     * </p>
     * <p>
     * You can modify the tenancy of a stopped instance with a tenancy of
     * <code>host</code> or <code>dedicated</code> .
     * </p>
     * <p>
     * Affinity, hostID, and tenancy are not required parameters, but at
     * least one of them must be specified in the request. Affinity and
     * tenancy can be modified in the same request, but tenancy can only be
     * modified on instances that are stopped.
     * </p>
     *
     * @param modifyInstancePlacementRequest Container for the necessary
     *           parameters to execute the ModifyInstancePlacement service method on
     *           AmazonEC2.
     * 
     * @return The response from the ModifyInstancePlacement service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyInstancePlacementResult modifyInstancePlacement(ModifyInstancePlacementRequest modifyInstancePlacementRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Dedicated hosts.
     * </p>
     * <p>
     * The results describe only the Dedicated hosts in the region you're
     * currently using. All listed instances consume capacity on your
     * Dedicated host. Dedicated hosts that have recently been released will
     * be listed with the state <code>released</code> .
     * </p>
     *
     * @param describeHostsRequest Container for the necessary parameters to
     *           execute the DescribeHosts service method on AmazonEC2.
     * 
     * @return The response from the DescribeHosts service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHostsResult describeHosts(DescribeHostsRequest describeHostsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * [EC2-VPC only] Adds one or more egress rules to a security group for
     * use with a VPC. Specifically, this action permits instances to send
     * traffic to one or more destination CIDR IP address ranges, or to one
     * or more destination security groups for the same VPC. This action
     * doesn't apply to security groups for use in EC2-Classic. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_SecurityGroups.html"> Security Groups for Your VPC </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can have up to 50 rules per security group
     * (covering both ingress and egress rules).
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
     *           parameters to execute the AuthorizeSecurityGroupEgress service method
     *           on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest authorizeSecurityGroupEgressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Stops an Amazon EBS-backed instance. Each time you transition an
     * instance from stopped to started, Amazon EC2 charges a full instance
     * hour, even if transitions happen multiple times within a single hour.
     * </p>
     * <p>
     * You can't start or stop Spot instances.
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
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesStopping.html"> Troubleshooting Stopping Your Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param stopInstancesRequest Container for the necessary parameters to
     *           execute the StopInstances service method on AmazonEC2.
     * 
     * @return The response from the StopInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StopInstancesResult stopInstances(StopInstancesRequest stopInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the running instances for the specified Spot fleet.
     * </p>
     *
     * @param describeSpotFleetInstancesRequest Container for the necessary
     *           parameters to execute the DescribeSpotFleetInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSpotFleetInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotFleetInstancesResult describeSpotFleetInstances(DescribeSpotFleetInstancesRequest describeSpotFleetInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the Spot price history. The prices returned are listed in
     * chronological order, from the oldest to the most recent, for up to the
     * past 90 days. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html"> Spot Instance Pricing History </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * When you specify a start and end time, this operation returns the
     * prices of the instance types within the time range that you specified
     * and the time when the price changed. The price is valid within the
     * time period that you specified; the response merely indicates the last
     * time that the price changed.
     * </p>
     *
     * @param describeSpotPriceHistoryRequest Container for the necessary
     *           parameters to execute the DescribeSpotPriceHistory service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSpotPriceHistory service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory(DescribeSpotPriceHistoryRequest describeSpotPriceHistoryRequest) 
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
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 500 security
     * groups. EC2-VPC: You can create up to 500 security groups per VPC.
     * </p>
     * <p>
     * When you create a security group, you specify a friendly name of your
     * choice. You can have a security group for use in EC2-Classic with the
     * same name as a security group for use in a VPC. However, you can't
     * have two security groups for use in EC2-Classic with the same name or
     * two security groups for use in a VPC with the same name.
     * </p>
     * <p>
     * You have a default security group for use in EC2-Classic and a
     * default security group for use in your VPC. If you don't specify a
     * security group when you launch an instance, the instance is launched
     * into the appropriate default security group. A default security group
     * includes a default rule that grants instances unrestricted network
     * access to each other.
     * </p>
     * <p>
     * You can add or remove rules from your security groups using
     * AuthorizeSecurityGroupIngress, AuthorizeSecurityGroupEgress,
     * RevokeSecurityGroupIngress, and RevokeSecurityGroupEgress.
     * </p>
     *
     * @param createSecurityGroupRequest Container for the necessary
     *           parameters to execute the CreateSecurityGroup service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateSecurityGroup service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSecurityGroupResult createSecurityGroup(CreateSecurityGroupRequest createSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a listing for Amazon EC2 Reserved instances to be sold in the
     * Reserved Instance Marketplace. You can submit one Reserved instance
     * listing at a time. To get a list of your Reserved instances, you can
     * use the DescribeReservedInstances operation.
     * </p>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell
     * Reserved instance capacity that they no longer need with buyers who
     * want to purchase additional capacity. Reserved instances bought and
     * sold through the Reserved Instance Marketplace work like any other
     * Reserved instances.
     * </p>
     * <p>
     * To sell your Reserved instances, you must first register as a seller
     * in the Reserved Instance Marketplace. After completing the
     * registration process, you can create a Reserved Instance Marketplace
     * listing of some or all of your Reserved instances, and specify the
     * upfront price to receive for them. Your Reserved instance listings
     * then become available for purchase. To view the details of your
     * Reserved instance listing, you can use the
     * DescribeReservedInstancesListings operation.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createReservedInstancesListingRequest Container for the
     *           necessary parameters to execute the CreateReservedInstancesListing
     *           service method on AmazonEC2.
     * 
     * @return The response from the CreateReservedInstancesListing service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReservedInstancesListingResult createReservedInstancesListing(CreateReservedInstancesListingRequest createReservedInstancesListingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an import volume task using metadata from the specified disk
     * image. After importing the image, you then upload it using the
     * <code>ec2-import-volume</code> command in the Amazon EC2 command-line
     * interface (CLI) tools. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importVolumeRequest Container for the necessary parameters to
     *           execute the ImportVolume service method on AmazonEC2.
     * 
     * @return The response from the ImportVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportVolumeResult importVolume(ImportVolumeRequest importVolumeRequest) 
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
     *           parameters to execute the DescribeSecurityGroups service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSecurityGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSecurityGroupsResult describeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes attributes of your AWS account. The following are the
     * supported account attributes:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <code>supported-platforms</code> : Indicates whether your account can
     * launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.
     * </p>
     * </li>
     * <li> <p>
     * <code>default-vpc</code> : The ID of the default VPC for your
     * account, or <code>none</code> .
     * </p>
     * </li>
     * <li> <p>
     * <code>max-instances</code> : The maximum number of On-Demand
     * instances that you can run.
     * </p>
     * </li>
     * <li> <p>
     * <code>vpc-max-security-groups-per-interface</code> : The maximum
     * number of security groups that you can assign to a network interface.
     * </p>
     * </li>
     * <li> <p>
     * <code>max-elastic-ips</code> : The maximum number of Elastic IP
     * addresses that you can allocate for use with EC2-Classic.
     * </p>
     * </li>
     * <li> <p>
     * <code>vpc-max-elastic-ips</code> : The maximum number of Elastic IP
     * addresses that you can allocate for use with EC2-VPC.
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param describeAccountAttributesRequest Container for the necessary
     *           parameters to execute the DescribeAccountAttributes service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeAccountAttributes service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes(DescribeAccountAttributesRequest describeAccountAttributesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified subnet. You must terminate all running
     * instances in the subnet before you can delete the subnet.
     * </p>
     *
     * @param deleteSubnetRequest Container for the necessary parameters to
     *           execute the DeleteSubnet service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSubnet(DeleteSubnetRequest deleteSubnetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Links an EC2-Classic instance to a ClassicLink-enabled VPC through
     * one or more of the VPC's security groups. You cannot link an
     * EC2-Classic instance to more than one VPC at a time. You can only link
     * an instance that's in the <code>running</code> state. An instance is
     * automatically unlinked from a VPC when it's stopped - you can link it
     * to the VPC again when you restart it.
     * </p>
     * <p>
     * After you've linked an instance, you cannot change the VPC security
     * groups that are associated with it. To change the security groups, you
     * must first unlink the instance, and then link it again.
     * </p>
     * <p>
     * Linking your instance to a VPC is sometimes referred to as
     * <i>attaching</i> your instance.
     * </p>
     *
     * @param attachClassicLinkVpcRequest Container for the necessary
     *           parameters to execute the AttachClassicLinkVpc service method on
     *           AmazonEC2.
     * 
     * @return The response from the AttachClassicLinkVpc service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachClassicLinkVpcResult attachClassicLinkVpc(AttachClassicLinkVpcRequest attachClassicLinkVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Moves an Elastic IP address from the EC2-Classic platform to the
     * EC2-VPC platform. The Elastic IP address must be allocated to your
     * account for more than 24 hours, and it must not be associated with an
     * instance. After the Elastic IP address is moved, it is no longer
     * available for use in the EC2-Classic platform, unless you move it back
     * using the RestoreAddressToClassic request. You cannot move an Elastic
     * IP address that's allocated for use in the EC2-VPC platform to the
     * EC2-Classic platform. You cannot migrate an Elastic IP address that's
     * associated with a reverse DNS record. Contact AWS account and billing
     * support to remove the reverse DNS record.
     * </p>
     *
     * @param moveAddressToVpcRequest Container for the necessary parameters
     *           to execute the MoveAddressToVpc service method on AmazonEC2.
     * 
     * @return The response from the MoveAddressToVpc service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public MoveAddressToVpcResult moveAddressToVpc(MoveAddressToVpcRequest moveAddressToVpcRequest) 
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
     *           to execute the DeleteVpnGateway service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpnGateway(DeleteVpnGatewayRequest deleteVpnGatewayRequest) 
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
     * The <code>DescribeVolumeStatus</code> operation provides the
     * following information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i> : Reflects the current status of the volume. The
     * possible values are <code>ok</code> , <code>impaired</code> ,
     * <code>warning</code> , or <code>insufficient-data</code> . If all
     * checks pass, the overall status of the volume is <code>ok</code> . If
     * the check fails, the overall status is <code>impaired</code> . If the
     * status is <code>insufficient-data</code> , then the checks may still
     * be taking place on your volume at the time. We recommend that you
     * retry the request. For more information on volume status, see
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
     *           parameters to execute the DescribeVolumeStatus service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVolumeStatus service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumeStatusResult describeVolumeStatus(DescribeVolumeStatusRequest describeVolumeStatusRequest) 
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
     *           parameters to execute the DescribeVpnConnections service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpnConnections service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnConnectionsResult describeVpnConnections(DescribeVpnConnectionsRequest describeVpnConnectionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables a virtual private gateway (VGW) to propagate routes to the
     * specified route table of a VPC.
     * </p>
     *
     * @param enableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the EnableVgwRoutePropagation service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableVgwRoutePropagation(EnableVgwRoutePropagationRequest enableVgwRoutePropagationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a snapshot of an EBS volume and stores it in Amazon S3. You
     * can use snapshots for backups, to make copies of EBS volumes, and to
     * save data before shutting down an instance.
     * </p>
     * <p>
     * When a snapshot is created, any AWS Marketplace product codes that
     * are associated with the source volume are propagated to the snapshot.
     * </p>
     * <p>
     * You can take a snapshot of an attached volume that is in use.
     * However, snapshots only capture data that has been written to your EBS
     * volume at the time the snapshot command is issued; this may exclude
     * any data that has been cached by any applications or the operating
     * system. If you can pause any file systems on the volume long enough to
     * take a snapshot, your snapshot should be complete. However, if you
     * cannot pause all file writes to the volume, you should unmount the
     * volume from within the instance, issue the snapshot command, and then
     * remount the volume to ensure a consistent and complete snapshot. You
     * may remount and use your volume while the snapshot status is
     * <code>pending</code> .
     * </p>
     * <p>
     * To create a snapshot for EBS volumes that serve as root devices, you
     * should stop the instance before taking the snapshot.
     * </p>
     * <p>
     * Snapshots that are taken from encrypted volumes are automatically
     * encrypted. Volumes that are created from encrypted snapshots are also
     * automatically encrypted. Your encrypted volumes and any associated
     * snapshots always remain protected.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html"> Amazon Elastic Block Store </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot service method on AmazonEC2.
     * 
     * @return The response from the CreateSnapshot service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the Availability Zone, instance count, instance type, or
     * network platform (EC2-Classic or EC2-VPC) of your Reserved instances.
     * The Reserved instances to be modified must be identical, except for
     * Availability Zone, network platform, and instance type.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"> Modifying Reserved Instances </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param modifyReservedInstancesRequest Container for the necessary
     *           parameters to execute the ModifyReservedInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the ModifyReservedInstances service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyReservedInstancesResult modifyReservedInstances(ModifyReservedInstancesRequest modifyReservedInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If
     * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
     * its private IP address when addressed from an instance in the VPC to
     * which it's linked. Similarly, the DNS hostname of an instance in a VPC
     * resolves to its private IP address when addressed from a linked
     * EC2-Classic instance. For more information about ClassicLink, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param describeVpcClassicLinkDnsSupportRequest Container for the
     *           necessary parameters to execute the DescribeVpcClassicLinkDnsSupport
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeVpcClassicLinkDnsSupport service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcClassicLinkDnsSupportResult describeVpcClassicLinkDnsSupport(DescribeVpcClassicLinkDnsSupportRequest describeVpcClassicLinkDnsSupportRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels the specified Spot fleet requests.
     * </p>
     * <p>
     * After you cancel a Spot fleet request, the Spot fleet launches no new
     * Spot instances. You must specify whether the Spot fleet should also
     * terminate its Spot instances. If you terminate the instances, the Spot
     * fleet request enters the <code>cancelled_terminating</code> state.
     * Otherwise, the Spot fleet request enters the
     * <code>cancelled_running</code> state and the instances continue to run
     * until they are interrupted or you terminate them manually.
     * </p>
     *
     * @param cancelSpotFleetRequestsRequest Container for the necessary
     *           parameters to execute the CancelSpotFleetRequests service method on
     *           AmazonEC2.
     * 
     * @return The response from the CancelSpotFleetRequests service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelSpotFleetRequestsResult cancelSpotFleetRequests(CancelSpotFleetRequestsRequest cancelSpotFleetRequestsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates an Elastic IP address with an instance or a network
     * interface.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * [EC2-Classic, VPC in an EC2-VPC-only account] If the Elastic IP
     * address is already associated with a different instance, it is
     * disassociated from that instance and associated with the specified
     * instance.
     * </p>
     * <p>
     * [VPC in an EC2-Classic account] If you don't specify a private IP
     * address, the Elastic IP address is associated with the primary IP
     * address. If the Elastic IP address is already associated with a
     * different instance or a network interface, you get an error unless you
     * allow reassociation.
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param associateAddressRequest Container for the necessary parameters
     *           to execute the AssociateAddress service method on AmazonEC2.
     * 
     * @return The response from the AssociateAddress service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssociateAddressResult associateAddress(AssociateAddressRequest associateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified customer gateway. You must delete the VPN
     * connection before you can delete the customer gateway.
     * </p>
     *
     * @param deleteCustomerGatewayRequest Container for the necessary
     *           parameters to execute the DeleteCustomerGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCustomerGateway(DeleteCustomerGatewayRequest deleteCustomerGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     *
     * @param describeExportTasksRequest Container for the necessary
     *           parameters to execute the DescribeExportTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeExportTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeExportTasksResult describeExportTasks(DescribeExportTasksRequest describeExportTasksRequest) 
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
     *           to execute the CreateRouteTable service method on AmazonEC2.
     * 
     * @return The response from the CreateRouteTable service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateRouteTableResult createRouteTable(CreateRouteTableRequest createRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC
     * that you own and a peer VPC with which to create the connection. The
     * peer VPC can belong to another AWS account. The requester VPC and peer
     * VPC cannot have overlapping CIDR blocks.
     * </p>
     * <p>
     * The owner of the peer VPC must accept the peering request to activate
     * the peering connection. The VPC peering connection request expires
     * after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * A <code>CreateVpcPeeringConnection</code> request between VPCs with
     * overlapping CIDR blocks results in the VPC peering connection having a
     * status of <code>failed</code> .
     * </p>
     *
     * @param createVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the CreateVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified EBS volumes.
     * </p>
     * <p>
     * If you are describing a long list of volumes, you can paginate the
     * output to make the list more manageable. The <code>MaxResults</code>
     * parameter sets the maximum number of results returned in a single
     * page. If the list of results exceeds your <code>MaxResults</code>
     * value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent
     * <code>DescribeVolumes</code> request to retrieve the remaining
     * results.
     * </p>
     * <p>
     * For more information about EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumesRequest Container for the necessary parameters
     *           to execute the DescribeVolumes service method on AmazonEC2.
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest describeVolumesRequest) 
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
     *           to execute the MonitorInstances service method on AmazonEC2.
     * 
     * @return The response from the MonitorInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public MonitorInstancesResult monitorInstances(MonitorInstancesRequest monitorInstancesRequest) 
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
     *           parameters to execute the DescribeDhcpOptions service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeDhcpOptions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDhcpOptionsResult describeDhcpOptions(DescribeDhcpOptionsRequest describeDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes available AWS services in a prefix list format, which
     * includes the prefix list name and prefix list ID of the service and
     * the IP address range for the service. A prefix list ID is required for
     * creating an outbound security group rule that allows traffic from a
     * VPC to access an AWS service through a VPC endpoint.
     * </p>
     *
     * @param describePrefixListsRequest Container for the necessary
     *           parameters to execute the DescribePrefixLists service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribePrefixLists service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePrefixListsResult describePrefixLists(DescribePrefixListsRequest describePrefixListsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Spot fleet request.
     * </p>
     * <p>
     * You can submit a single request that includes multiple launch
     * specifications that vary by instance type, AMI, Availability Zone, or
     * subnet.
     * </p>
     * <p>
     * By default, the Spot fleet requests Spot instances in the Spot pool
     * where the price per unit is the lowest. Each launch specification can
     * include its own instance weighting that reflects the value of the
     * instance type to your application workload.
     * </p>
     * <p>
     * Alternatively, you can specify that the Spot fleet distribute the
     * target capacity across the Spot pools included in its launch
     * specifications. By ensuring that the Spot instances in your Spot fleet
     * are in different Spot pools, you can improve the availability of your
     * fleet.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html"> Spot Fleet Requests </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param requestSpotFleetRequest Container for the necessary parameters
     *           to execute the RequestSpotFleet service method on AmazonEC2.
     * 
     * @return The response from the RequestSpotFleet service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RequestSpotFleetResult requestSpotFleet(RequestSpotFleetRequest requestSpotFleetRequest) 
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
     *           parameters to execute the DescribeNetworkAcls service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeNetworkAcls service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkAclsResult describeNetworkAcls(DescribeNetworkAclsRequest describeNetworkAclsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an import instance task using metadata from the specified
     * disk image. <code>ImportInstance</code> only supports single-volume
     * VMs. To import multi-volume VMs, use ImportImage. After importing the
     * image, you then upload it using the <code>ec2-import-volume</code>
     * command in the EC2 command line tools. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param importInstanceRequest Container for the necessary parameters to
     *           execute the ImportInstance service method on AmazonEC2.
     * 
     * @return The response from the ImportInstance service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportInstanceResult importInstance(ImportInstanceRequest importInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a VPC peering connection. Either the owner of the requester
     * VPC or the owner of the peer VPC can delete the VPC peering connection
     * if it's in the <code>active</code> state. The owner of the requester
     * VPC can delete a VPC peering connection in the
     * <code>pending-acceptance</code> state.
     * </p>
     *
     * @param deleteVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the DeleteVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest) 
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
     * For Linux instances, the instance console output displays the exact
     * console output that would normally be displayed on a physical monitor
     * attached to a computer. This output is buffered because the instance
     * produces it and then posts it to a store where the instance's owner
     * can retrieve it.
     * </p>
     * <p>
     * For Windows instances, the instance console output includes output
     * from the EC2Config service.
     * </p>
     *
     * @param getConsoleOutputRequest Container for the necessary parameters
     *           to execute the GetConsoleOutput service method on AmazonEC2.
     * 
     * @return The response from the GetConsoleOutput service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetConsoleOutputResult getConsoleOutput(GetConsoleOutputRequest getConsoleOutputRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches a network interface from an instance.
     * </p>
     *
     * @param detachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DetachNetworkInterface service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachNetworkInterface(DetachNetworkInterfaceRequest detachNetworkInterfaceRequest) 
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
     *           parameters to execute the DeleteVpnConnectionRoute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpnConnectionRoute(DeleteVpnConnectionRouteRequest deleteVpnConnectionRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Allocates a Dedicated host to your account. At minimum you need to
     * specify the instance size type, Availability Zone, and quantity of
     * hosts you want to allocate.
     * </p>
     *
     * @param allocateHostsRequest Container for the necessary parameters to
     *           execute the AllocateHosts service method on AmazonEC2.
     * 
     * @return The response from the AllocateHosts service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocateHostsResult allocateHosts(AllocateHostsRequest allocateHostsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a data feed for Spot instances, enabling you to view Spot
     * instance usage logs. You can create one data feed per AWS account. For
     * more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html"> Spot Instance Data Feed </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the CreateSpotDatafeedSubscription
     *           service method on AmazonEC2.
     * 
     * @return The response from the CreateSpotDatafeedSubscription service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSpotDatafeedSubscriptionResult createSpotDatafeedSubscription(CreateSpotDatafeedSubscriptionRequest createSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the
     * EC2-VPC platform, or that are being restored to the EC2-Classic
     * platform. This request does not return information about any other
     * Elastic IP addresses in your account.
     * </p>
     *
     * @param describeMovingAddressesRequest Container for the necessary
     *           parameters to execute the DescribeMovingAddresses service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeMovingAddresses service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMovingAddressesResult describeMovingAddresses(DescribeMovingAddressesRequest describeMovingAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow
     * logs (the log streams for the network interfaces), you must use the
     * CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     *
     * @param describeFlowLogsRequest Container for the necessary parameters
     *           to execute the DescribeFlowLogs service method on AmazonEC2.
     * 
     * @return The response from the DescribeFlowLogs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeFlowLogsResult describeFlowLogs(DescribeFlowLogsRequest describeFlowLogsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified instance. You can
     * specify only one attribute at a time. Valid attribute values are:
     * <code>instanceType</code> | <code>kernel</code> | <code>ramdisk</code>
     * | <code>userData</code> | <code>disableApiTermination</code> |
     * <code>instanceInitiatedShutdownBehavior</code> |
     * <code>rootDeviceName</code> | <code>blockDeviceMapping</code> |
     * <code>productCodes</code> | <code>sourceDestCheck</code> |
     * <code>groupSet</code> | <code>ebsOptimized</code> |
     * <code>sriovNetSupport</code>
     * </p>
     *
     * @param describeInstanceAttributeRequest Container for the necessary
     *           parameters to execute the DescribeInstanceAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeInstanceAttribute service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceAttributeResult describeInstanceAttribute(DescribeInstanceAttributeRequest describeInstanceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     *
     * @param describeVpcPeeringConnectionsRequest Container for the
     *           necessary parameters to execute the DescribeVpcPeeringConnections
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeVpcPeeringConnections service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest) 
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
     *           to execute the DescribeSubnets service method on AmazonEC2.
     * 
     * @return The response from the DescribeSubnets service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSubnetsResult describeSubnets(DescribeSubnetsRequest describeSubnetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Launches the specified number of instances using an AMI for which you
     * have permissions.
     * </p>
     * <p>
     * When you launch an instance, it enters the <code>pending</code>
     * state. After the instance is ready for you, it enters the
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
     * [EC2-VPC only accounts] If you don't specify a subnet in the request,
     * we choose a default subnet from your default VPC for you.
     * </p>
     * <p>
     * [EC2-Classic accounts] If you're launching into EC2-Classic and you
     * don't specify an Availability Zone, we choose one for you.
     * </p>
     * <p>
     * Linux instances have access to the public key of the key pair at
     * boot. You can use this key to provide secure access to the instance.
     * Amazon EC2 public images use this feature to provide secure access
     * without passwords. For more information, see
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
     * If any of the AMIs have a product code attached for which the user
     * has not subscribed, <code>RunInstances</code> fails.
     * </p>
     * <p>
     * T2 instance types can only be launched into a VPC. If you do not have
     * a default VPC, or if you do not specify a subnet ID in the request,
     * <code>RunInstances</code> fails.
     * </p>
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_InstanceStraightToTerminated.html"> What To Do If An Instance Immediately Terminates </a> , and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesConnecting.html"> Troubleshooting Connecting to Your Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param runInstancesRequest Container for the necessary parameters to
     *           execute the RunInstances service method on AmazonEC2.
     * 
     * @return The response from the RunInstances service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RunInstancesResult runInstances(RunInstancesRequest runInstancesRequest) 
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
     *           parameters to execute the AssociateRouteTable service method on
     *           AmazonEC2.
     * 
     * @return The response from the AssociateRouteTable service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssociateRouteTableResult associateRouteTable(AssociateRouteTableRequest associateRouteTableRequest) 
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
     *           parameters to execute the ModifyVolumeAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyVolumeAttribute(ModifyVolumeAttributeRequest modifyVolumeAttributeRequest) 
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
     *           parameters to execute the ModifyInstanceAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyInstanceAttribute(ModifyInstanceAttributeRequest modifyInstanceAttributeRequest) 
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
     *           to execute the DeleteDhcpOptions service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDhcpOptions(DeleteDhcpOptionsRequest deleteDhcpOptionsRequest) 
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
     *           to execute the CancelExportTask service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelExportTask(CancelExportTaskRequest cancelExportTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a VPC endpoint for a specified AWS service. An endpoint
     * enables you to create a private connection between your VPC and
     * another AWS service in your account. You can specify an endpoint
     * policy to attach to the endpoint that will control access to the
     * service from your VPC. You can also specify the VPC route tables that
     * use the endpoint.
     * </p>
     * <p>
     * Currently, only endpoints to Amazon S3 are supported.
     * </p>
     *
     * @param createVpcEndpointRequest Container for the necessary parameters
     *           to execute the CreateVpcEndpoint service method on AmazonEC2.
     * 
     * @return The response from the CreateVpcEndpoint service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpcEndpointResult createVpcEndpoint(CreateVpcEndpointRequest createVpcEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a route in a route table within a VPC.
     * </p>
     * <p>
     * You must specify one of the following targets: Internet gateway or
     * virtual private gateway, NAT instance, NAT gateway, VPC peering
     * connection, or network interface.
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
     * Both routes apply to the traffic destined for <code>192.0.2.3</code>
     * . However, the second route in the list covers a smaller number of IP
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
     *           execute the CreateRoute service method on AmazonEC2.
     * 
     * @return The response from the CreateRoute service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateRouteResult createRoute(CreateRouteRequest createRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS
     * hostnames resolve to public IP addresses when addressed between a
     * linked EC2-Classic instance and instances in the VPC to which it's
     * linked. For more information about ClassicLink, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param disableVpcClassicLinkDnsSupportRequest Container for the
     *           necessary parameters to execute the DisableVpcClassicLinkDnsSupport
     *           service method on AmazonEC2.
     * 
     * @return The response from the DisableVpcClassicLinkDnsSupport service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableVpcClassicLinkDnsSupportResult disableVpcClassicLinkDnsSupport(DisableVpcClassicLinkDnsSupportRequest disableVpcClassicLinkDnsSupportRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Initiates the copy of an AMI from the specified source region to the
     * current region. You specify the destination region by using its
     * endpoint when making the request.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/CopyingAMIs.html"> Copying AMIs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copyImageRequest Container for the necessary parameters to
     *           execute the CopyImage service method on AmazonEC2.
     * 
     * @return The response from the CopyImage service method, as returned by
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
    public CopyImageResult copyImage(CopyImageRequest copyImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     *
     * @param describeVpcClassicLinkRequest Container for the necessary
     *           parameters to execute the DescribeVpcClassicLink service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpcClassicLink service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcClassicLinkResult describeVpcClassicLink(DescribeVpcClassicLinkRequest describeVpcClassicLinkRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified network interface attribute. You can specify
     * only one attribute at a time.
     * </p>
     *
     * @param modifyNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ModifyNetworkInterfaceAttribute
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest modifyNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified route table. You must disassociate the route
     * table from any subnets before you can delete it. You can't delete the
     * main route table.
     * </p>
     *
     * @param deleteRouteTableRequest Container for the necessary parameters
     *           to execute the DeleteRouteTable service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRouteTable(DeleteRouteTableRequest deleteRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the your NAT gateways.
     * </p>
     *
     * @param describeNatGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeNatGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeNatGateways service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNatGatewaysResult describeNatGateways(DescribeNatGatewaysRequest describeNatGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param describeNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the DescribeNetworkInterfaceAttribute
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeNetworkInterfaceAttribute
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkInterfaceAttributeResult describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest describeNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This
     * request only returns information about EC2-Classic instances linked to
     * a VPC through ClassicLink; you cannot use this request to return
     * information about other instances.
     * </p>
     *
     * @param describeClassicLinkInstancesRequest Container for the necessary
     *           parameters to execute the DescribeClassicLinkInstances service method
     *           on AmazonEC2.
     * 
     * @return The response from the DescribeClassicLinkInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClassicLinkInstancesResult describeClassicLinkInstances(DescribeClassicLinkInstancesRequest describeClassicLinkInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the ID format for the specified resource on a per-region
     * basis. You can specify that resources should receive longer IDs
     * (17-character IDs) when they are created. The following resource types
     * support longer IDs: <code>instance</code> | <code>reservation</code> .
     * </p>
     * <p>
     * This setting applies to the IAM user who makes the request; it does
     * not apply to the entire AWS account. By default, an IAM user defaults
     * to the same settings as the root user, unless they explicitly override
     * the settings by running this request. Resources created with longer
     * IDs are visible to all IAM users, regardless of these settings and
     * provided that they have permission to use the relevant
     * <code>Describe</code> command for the resource type.
     * </p>
     *
     * @param modifyIdFormatRequest Container for the necessary parameters to
     *           execute the ModifyIdFormat service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyIdFormat(ModifyIdFormatRequest modifyIdFormatRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified NAT gateway. Deleting a NAT gateway
     * disassociates its Elastic IP address, but does not release the address
     * from your account. Deleting a NAT gateway does not delete any NAT
     * gateway routes in your route tables.
     * </p>
     *
     * @param deleteNatGatewayRequest Container for the necessary parameters
     *           to execute the DeleteNatGateway service method on AmazonEC2.
     * 
     * @return The response from the DeleteNatGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteNatGatewayResult deleteNatGateway(DeleteNatGatewayRequest deleteNatGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables a virtual private gateway (VGW) from propagating routes to a
     * specified route table of a VPC.
     * </p>
     *
     * @param disableVgwRoutePropagationRequest Container for the necessary
     *           parameters to execute the DisableVgwRoutePropagation service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disableVgwRoutePropagation(DisableVgwRoutePropagationRequest disableVgwRoutePropagationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified Spot fleet request.
     * </p>
     * <p>
     * While the Spot fleet request is being modified, it is in the
     * <code>modifying</code> state.
     * </p>
     * <p>
     * To scale up your Spot fleet, increase its target capacity. The Spot
     * fleet launches the additional Spot instances according to the
     * allocation strategy for the Spot fleet request. If the allocation
     * strategy is <code>lowestPrice</code> , the Spot fleet launches
     * instances using the Spot pool with the lowest price. If the allocation
     * strategy is <code>diversified</code> , the Spot fleet distributes the
     * instances across the Spot pools.
     * </p>
     * <p>
     * To scale down your Spot fleet, decrease its target capacity. First,
     * the Spot fleet cancels any open bids that exceed the new target
     * capacity. You can request that the Spot fleet terminate Spot instances
     * until the size of the fleet no longer exceeds the new target capacity.
     * If the allocation strategy is <code>lowestPrice</code> , the Spot
     * fleet terminates the instances with the highest price per unit. If the
     * allocation strategy is <code>diversified</code> , the Spot fleet
     * terminates instances across the Spot pools. Alternatively, you can
     * request that the Spot fleet keep the fleet at its current size, but
     * not replace any Spot instances that are interrupted or that you
     * terminate manually.
     * </p>
     *
     * @param modifySpotFleetRequestRequest Container for the necessary
     *           parameters to execute the ModifySpotFleetRequest service method on
     *           AmazonEC2.
     * 
     * @return The response from the ModifySpotFleetRequest service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifySpotFleetRequestResult modifySpotFleetRequest(ModifySpotFleetRequestRequest modifySpotFleetRequestRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels one or more Spot instance requests. Spot instances are
     * instances that Amazon EC2 starts on your behalf when the bid price
     * that you specify exceeds the current Spot price. Amazon EC2
     * periodically sets the Spot price based on available Spot instance
     * capacity and current Spot instance requests. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html"> Spot Instance Requests </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Canceling a Spot instance request does not
     * terminate running Spot instances associated with the request.
     * </p>
     *
     * @param cancelSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the CancelSpotInstanceRequests service method on
     *           AmazonEC2.
     * 
     * @return The response from the CancelSpotInstanceRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelSpotInstanceRequestsResult cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest cancelSpotInstanceRequestsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Purchases a Reserved instance for use with your account. With Amazon
     * EC2 Reserved instances, you obtain a capacity reservation for a
     * certain instance configuration over a specified period of time and pay
     * a lower hourly rate compared to On-Demand Instance pricing.
     * </p>
     * <p>
     * Use DescribeReservedInstancesOfferings to get a list of Reserved
     * instance offerings that match your specifications. After you've
     * purchased a Reserved instance, you can check for your new Reserved
     * instance with DescribeReservedInstances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param purchaseReservedInstancesOfferingRequest Container for the
     *           necessary parameters to execute the PurchaseReservedInstancesOffering
     *           service method on AmazonEC2.
     * 
     * @return The response from the PurchaseReservedInstancesOffering
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PurchaseReservedInstancesOfferingResult purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest purchaseReservedInstancesOfferingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a NAT gateway in the specified subnet. A NAT gateway can be
     * used to enable instances in a private subnet to connect to the
     * Internet. This action creates a network interface in the specified
     * subnet with a private IP address from the IP address range of the
     * subnet. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html"> NAT Gateways </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNatGatewayRequest Container for the necessary parameters
     *           to execute the CreateNatGateway service method on AmazonEC2.
     * 
     * @return The response from the CreateNatGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateNatGatewayResult createNatGateway(CreateNatGatewayRequest createNatGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the modifications made to your Reserved instances. If no
     * parameter is specified, information about all your Reserved instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"> Modifying Reserved Instances </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param describeReservedInstancesModificationsRequest Container for the
     *           necessary parameters to execute the
     *           DescribeReservedInstancesModifications service method on AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstancesModifications
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesModificationsResult describeReservedInstancesModifications(DescribeReservedInstancesModificationsRequest describeReservedInstancesModificationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies attributes of a specified VPC endpoint. You can modify the
     * policy associated with the endpoint, and you can add and remove route
     * tables associated with the endpoint.
     * </p>
     *
     * @param modifyVpcEndpointRequest Container for the necessary parameters
     *           to execute the ModifyVpcEndpoint service method on AmazonEC2.
     * 
     * @return The response from the ModifyVpcEndpoint service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyVpcEndpointResult modifyVpcEndpoint(ModifyVpcEndpointRequest modifyVpcEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Shuts down one or more instances. This operation is idempotent; if
     * you terminate an instance more than once, each call succeeds.
     * </p>
     * <p>
     * Terminated instances remain visible after termination (for
     * approximately one hour).
     * </p>
     * <p>
     * By default, Amazon EC2 deletes all EBS volumes that were attached
     * when the instance launched. Volumes attached after instance launch
     * continue running.
     * </p>
     * <p>
     * You can stop, start, and terminate EBS-backed instances. You can only
     * terminate instance store-backed instances. What happens to an instance
     * differs if you stop it or terminate it. For example, when you stop an
     * instance, the root device and any other devices attached to the
     * instance persist. When you terminate an instance, any attached EBS
     * volumes with the <code>DeleteOnTermination</code> block device mapping
     * parameter set to <code>true</code> are automatically deleted. For more
     * information about the differences between stopping and terminating
     * instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For more information about troubleshooting, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstancesShuttingDown.html"> Troubleshooting Terminating Your Instance </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param terminateInstancesRequest Container for the necessary
     *           parameters to execute the TerminateInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the TerminateInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public TerminateInstancesResult terminateInstances(TerminateInstancesRequest terminateInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified Internet gateway. You must detach the Internet
     * gateway from the VPC before you can delete it.
     * </p>
     *
     * @param deleteInternetGatewayRequest Container for the necessary
     *           parameters to execute the DeleteInternetGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteInternetGateway(DeleteInternetGatewayRequest deleteInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeAddressesRequest Container for the necessary parameters
     *           to execute the DescribeAddresses service method on AmazonEC2.
     * 
     * @return The response from the DescribeAddresses service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAddressesResult describeAddresses(DescribeAddressesRequest describeAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Determines whether a product code is associated with an instance.
     * This action can only be used by the owner of the product code. It is
     * useful when a product code owner needs to verify whether another
     * user's instance is eligible for support.
     * </p>
     *
     * @param confirmProductInstanceRequest Container for the necessary
     *           parameters to execute the ConfirmProductInstance service method on
     *           AmazonEC2.
     * 
     * @return The response from the ConfirmProductInstance service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ConfirmProductInstanceResult confirmProductInstance(ConfirmProductInstanceRequest confirmProductInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified ingress or egress entry (rule) from the
     * specified network ACL.
     * </p>
     *
     * @param deleteNetworkAclEntryRequest Container for the necessary
     *           parameters to execute the DeleteNetworkAclEntry service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNetworkAclEntry(DeleteNetworkAclEntryRequest deleteNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified VPC. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeVpcAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVpcAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpcAttribute service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcAttributeResult describeVpcAttribute(DescribeVpcAttributeRequest describeVpcAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the status of one or more instances.
     * </p>
     * <p>
     * Instance status includes the following components:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <b>Status checks</b> - Amazon EC2 performs status checks on running
     * EC2 instances to identify hardware and software issues. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html"> Status Checks for Your Instances </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"> Troubleshooting Instances with Failed Status Checks </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * </li>
     * <li> <p>
     * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as
     * reboot, stop, or terminate) for your instances related to hardware
     * issues, software updates, or system maintenance. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html"> Scheduled Events for Your Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * </li>
     * <li> <p>
     * <b>Instance state</b> - You can manage your instances from the moment
     * you launch them through their termination. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param describeInstanceStatusRequest Container for the necessary
     *           parameters to execute the DescribeInstanceStatus service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeInstanceStatus service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceStatusResult describeInstanceStatus(DescribeInstanceStatusRequest describeInstanceStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the events for the specified Spot fleet request during the
     * specified time.
     * </p>
     * <p>
     * Spot fleet events are delayed by up to 30 seconds before they can be
     * described. This ensures that you can query by the last evaluated time
     * and not miss a recorded event.
     * </p>
     *
     * @param describeSpotFleetRequestHistoryRequest Container for the
     *           necessary parameters to execute the DescribeSpotFleetRequestHistory
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeSpotFleetRequestHistory service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotFleetRequestHistoryResult describeSpotFleetRequestHistory(DescribeSpotFleetRequestHistoryRequest describeSpotFleetRequestHistoryRequest) 
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
     * You cannot delete a snapshot of the root device of an EBS volume used
     * by a registered AMI. You must first de-register the AMI before you can
     * delete the snapshot.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-snapshot.html"> Deleting an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteSnapshotRequest Container for the necessary parameters to
     *           execute the DeleteSnapshot service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes which network ACL a subnet is associated with. By default
     * when you create a subnet, it's automatically associated with the
     * default network ACL. For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceNetworkAclAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceNetworkAclAssociation service method
     *           on AmazonEC2.
     * 
     * @return The response from the ReplaceNetworkAclAssociation service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplaceNetworkAclAssociationResult replaceNetworkAclAssociation(ReplaceNetworkAclAssociationRequest replaceNetworkAclAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates an Elastic IP address from the instance or network
     * interface it's associated with.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * This is an idempotent operation. If you perform the operation more
     * than once, Amazon EC2 doesn't return an error.
     * </p>
     *
     * @param disassociateAddressRequest Container for the necessary
     *           parameters to execute the DisassociateAddress service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disassociateAddress(DisassociateAddressRequest disassociateAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a placement group that you launch cluster instances into. You
     * must give the group a name that's unique within the scope of your
     * account.
     * </p>
     * <p>
     * For more information about placement groups and cluster instances,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createPlacementGroupRequest Container for the necessary
     *           parameters to execute the CreatePlacementGroup service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createPlacementGroup(CreatePlacementGroupRequest createPlacementGroupRequest) 
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
     *           parameters to execute the DeletePlacementGroup service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePlacementGroup(DeletePlacementGroupRequest deletePlacementGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies a subnet attribute.
     * </p>
     *
     * @param modifySubnetAttributeRequest Container for the necessary
     *           parameters to execute the ModifySubnetAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifySubnetAttribute(ModifySubnetAttributeRequest modifySubnetAttributeRequest) 
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
     *           execute the DeleteVpc service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpc(DeleteVpcRequest deleteVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes all supported AWS services that can be specified when
     * creating a VPC endpoint.
     * </p>
     *
     * @param describeVpcEndpointServicesRequest Container for the necessary
     *           parameters to execute the DescribeVpcEndpointServices service method
     *           on AmazonEC2.
     * 
     * @return The response from the DescribeVpcEndpointServices service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcEndpointServicesResult describeVpcEndpointServices(DescribeVpcEndpointServicesRequest describeVpcEndpointServicesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Copies a point-in-time snapshot of an EBS volume and stores it in
     * Amazon S3. You can copy the snapshot within the same region or from
     * one region to another. You can use the snapshot to create EBS volumes
     * or Amazon Machine Images (AMIs). The snapshot is copied to the
     * regional endpoint that you send the HTTP request to.
     * </p>
     * <p>
     * Copies of encrypted EBS snapshots remain encrypted. Copies of
     * unencrypted snapshots remain unencrypted, unless the
     * <code>Encrypted</code> flag is specified during the snapshot copy
     * operation. By default, encrypted snapshot copies use the default AWS
     * Key Management Service (AWS KMS) customer master key (CMK); however,
     * you can specify a non-default CMK with the <code>KmsKeyId</code>
     * parameter.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-copy-snapshot.html"> Copying an Amazon EBS Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param copySnapshotRequest Container for the necessary parameters to
     *           execute the CopySnapshot service method on AmazonEC2.
     * 
     * @return The response from the CopySnapshot service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CopySnapshotResult copySnapshot(CopySnapshotRequest copySnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an instance to its default value. To reset the
     * <code>kernel</code> or <code>ramdisk</code> , the instance must be in
     * a stopped state. To reset the <code>SourceDestCheck</code> , the
     * instance can be either running or stopped.
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
     *           parameters to execute the ResetInstanceAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetInstanceAttribute(ResetInstanceAttributeRequest resetInstanceAttributeRequest) 
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
     *           parameters to execute the ReplaceNetworkAclEntry service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void replaceNetworkAclEntry(ReplaceNetworkAclEntryRequest replaceNetworkAclEntryRequest) 
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
     * The key pair returned to you is available only in the region in which
     * you create it. To create a key pair that is available in all regions,
     * use ImportKeyPair.
     * </p>
     * <p>
     * For more information about key pairs, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-key-pairs.html"> Key Pairs </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createKeyPairRequest Container for the necessary parameters to
     *           execute the CreateKeyPair service method on AmazonEC2.
     * 
     * @return The response from the CreateKeyPair service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest createKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the EBS snapshots available to you.
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
     * If you are describing a long list of snapshots, you can paginate the
     * output to make the list more manageable. The <code>MaxResults</code>
     * parameter sets the maximum number of results returned in a single
     * page. If the list of results exceeds your <code>MaxResults</code>
     * value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent
     * <code>DescribeSnapshots</code> request to retrieve the remaining
     * results.
     * </p>
     * <p>
     * For more information about EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotsRequest Container for the necessary parameters
     *           to execute the DescribeSnapshots service method on AmazonEC2.
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a network ACL in a VPC. Network ACLs provide an optional
     * layer of security (in addition to security groups) for the instances
     * in your VPC.
     * </p>
     * <p>
     * For more information about network ACLs, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_ACLs.html"> Network ACLs </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createNetworkAclRequest Container for the necessary parameters
     *           to execute the CreateNetworkAcl service method on AmazonEC2.
     * 
     * @return The response from the CreateNetworkAcl service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateNetworkAclResult createNetworkAcl(CreateNetworkAclRequest createNetworkAclRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets a network interface attribute. You can specify only one
     * attribute at a time.
     * </p>
     *
     * @param resetNetworkInterfaceAttributeRequest Container for the
     *           necessary parameters to execute the ResetNetworkInterfaceAttribute
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetNetworkInterfaceAttribute(ResetNetworkInterfaceAttributeRequest resetNetworkInterfaceAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables a VPC for ClassicLink. You can then link EC2-Classic
     * instances to your ClassicLink-enabled VPC to allow communication over
     * private IP addresses. You cannot enable your VPC for ClassicLink if
     * any of your VPC's route tables have existing routes for address ranges
     * within the <code>10.0.0.0/8</code> IP address range, excluding local
     * routes for VPCs in the <code>10.0.0.0/16</code> and
     * <code>10.1.0.0/16</code> IP address ranges. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param enableVpcClassicLinkRequest Container for the necessary
     *           parameters to execute the EnableVpcClassicLink service method on
     *           AmazonEC2.
     * 
     * @return The response from the EnableVpcClassicLink service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableVpcClassicLinkResult enableVpcClassicLink(EnableVpcClassicLinkRequest enableVpcClassicLinkRequest) 
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
     *           parameters to execute the CreateVpnConnectionRoute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createVpnConnectionRoute(CreateVpnConnectionRouteRequest createVpnConnectionRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unlinks (detaches) a linked EC2-Classic instance from a VPC. After
     * the instance has been unlinked, the VPC security groups are no longer
     * associated with it. An instance is automatically unlinked from a VPC
     * when it's stopped.
     * </p>
     *
     * @param detachClassicLinkVpcRequest Container for the necessary
     *           parameters to execute the DetachClassicLinkVpc service method on
     *           AmazonEC2.
     * 
     * @return The response from the DetachClassicLinkVpc service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DetachClassicLinkVpcResult detachClassicLinkVpc(DetachClassicLinkVpcRequest detachClassicLinkVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates one or more flow logs to capture IP traffic for a specific
     * network interface, subnet, or VPC. Flow logs are delivered to a
     * specified log group in Amazon CloudWatch Logs. If you specify a VPC or
     * subnet in the request, a log stream is created in CloudWatch Logs for
     * each network interface in the subnet or VPC. Log streams can include
     * information about accepted and rejected traffic to a network
     * interface. You can view the data in your log streams using Amazon
     * CloudWatch Logs.
     * </p>
     * <p>
     * In your request, you must also specify an IAM role that has
     * permission to publish logs to CloudWatch Logs.
     * </p>
     *
     * @param createFlowLogsRequest Container for the necessary parameters to
     *           execute the CreateFlowLogs service method on AmazonEC2.
     * 
     * @return The response from the CreateFlowLogs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateFlowLogsResult createFlowLogs(CreateFlowLogsRequest createFlowLogsRequest) 
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
     *           parameters to execute the DescribeAvailabilityZones service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeAvailabilityZones service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAvailabilityZonesResult describeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Restores an Elastic IP address that was previously moved to the
     * EC2-VPC platform back to the EC2-Classic platform. You cannot move an
     * Elastic IP address that was originally allocated for use in EC2-VPC.
     * The Elastic IP address must not be associated with an instance or
     * network interface. You cannot restore an Elastic IP address that's
     * associated with a reverse DNS record. Contact AWS account and billing
     * support to remove the reverse DNS record.
     * </p>
     *
     * @param restoreAddressToClassicRequest Container for the necessary
     *           parameters to execute the RestoreAddressToClassic service method on
     *           AmazonEC2.
     * 
     * @return The response from the RestoreAddressToClassic service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RestoreAddressToClassicResult restoreAddressToClassic(RestoreAddressToClassicRequest restoreAddressToClassicRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables monitoring for a running instance. For more information
     * about monitoring instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-cloudwatch.html"> Monitoring Your Instances and Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param unmonitorInstancesRequest Container for the necessary
     *           parameters to execute the UnmonitorInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the UnmonitorInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UnmonitorInstancesResult unmonitorInstances(UnmonitorInstancesRequest unmonitorInstancesRequest) 
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
     *           parameters to execute the DeleteSecurityGroup service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSecurityGroup(DeleteSecurityGroupRequest deleteSecurityGroupRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Exports a running or stopped instance to an S3 bucket.
     * </p>
     * <p>
     * For information about the supported operating systems, image formats,
     * and known limitations for the types of instances you can export, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ExportingEC2Instances.html"> Exporting EC2 Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createInstanceExportTaskRequest Container for the necessary
     *           parameters to execute the CreateInstanceExportTask service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateInstanceExportTask service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInstanceExportTaskResult createInstanceExportTask(CreateInstanceExportTaskRequest createInstanceExportTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Retrieves the encrypted administrator password for an instance
     * running Windows.
     * </p>
     * <p>
     * The Windows password is generated at boot if the
     * <code>EC2Config</code> service plugin, <code>Ec2SetPassword</code> ,
     * is enabled. This usually only happens the first time an AMI is
     * launched, and then <code>Ec2SetPassword</code> is automatically
     * disabled. The password is not generated for rebundled AMIs unless
     * <code>Ec2SetPassword</code> is enabled before bundling.
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
     *           to execute the GetPasswordData service method on AmazonEC2.
     * 
     * @return The response from the GetPasswordData service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPasswordDataResult getPasswordData(GetPasswordDataRequest getPasswordDataRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Associates a set of DHCP options (that you've previously created)
     * with the specified VPC, or associates no DHCP options with the VPC.
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
     *           parameters to execute the AssociateDhcpOptions service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void associateDhcpOptions(AssociateDhcpOptionsRequest associateDhcpOptionsRequest) 
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
     *           execute the ImportKeyPair service method on AmazonEC2.
     * 
     * @return The response from the ImportKeyPair service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest importKeyPairRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified VPC.
     * </p>
     *
     * @param modifyVpcAttributeRequest Container for the necessary
     *           parameters to execute the ModifyVpcAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyVpcAttribute(ModifyVpcAttributeRequest modifyVpcAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified network interface. You must detach the network
     * interface before you can delete it.
     * </p>
     *
     * @param deleteNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the DeleteNetworkInterface service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNetworkInterface(DeleteNetworkInterfaceRequest deleteNetworkInterfaceRequest) 
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
     *           to execute the DescribeRegions service method on AmazonEC2.
     * 
     * @return The response from the DescribeRegions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRegionsResult describeRegions(DescribeRegionsRequest describeRegionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     *
     * @param describeNetworkInterfacesRequest Container for the necessary
     *           parameters to execute the DescribeNetworkInterfaces service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeNetworkInterfaces service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkInterfacesResult describeNetworkInterfaces(DescribeNetworkInterfacesRequest describeNetworkInterfacesRequest) 
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
     * 
     * <ul>
     * <li> <code>domain-name-servers</code> - The IP addresses of up to
     * four domain name servers, or <code>AmazonProvidedDNS</code> . The
     * default DHCP option set specifies <code>AmazonProvidedDNS</code> . If
     * specifying more than one domain name server, specify the IP addresses
     * in a single parameter, separated by commas.</li>
     * <li> <code>domain-name</code> - If you're using AmazonProvidedDNS in
     * <code>us-east-1</code> , specify <code>ec2.internal</code> . If you're
     * using AmazonProvidedDNS in another region, specify
     * <code>region.compute.internal</code> (for example,
     * <code>ap-northeast-1.compute.internal</code> ). Otherwise, specify a
     * domain name (for example, <code>MyCompany.com</code> ).
     * <b>Important</b> : Some Linux operating systems accept multiple domain
     * names separated by spaces. However, Windows and other Linux operating
     * systems treat the value as a single domain, which results in
     * unexpected behavior. If your DHCP options set is associated with a VPC
     * that has instances with multiple operating systems, specify only one
     * domain name.</li>
     * <li> <code>ntp-servers</code> - The IP addresses of up to four
     * Network Time Protocol (NTP) servers.</li>
     * <li> <code>netbios-name-servers</code> - The IP addresses of up to
     * four NetBIOS name servers.</li>
     * <li> <code>netbios-node-type</code> - The NetBIOS node type (1, 2, 4,
     * or 8). We recommend that you specify 2 (broadcast and multicast are
     * not currently supported). For more information about these node types,
     * see
     * <a href="http://www.ietf.org/rfc/rfc2132.txt"> RFC 2132 </a>
     * . </li>
     * 
     * </ul>
     * <p>
     * Your VPC automatically starts out with a set of DHCP options that
     * includes only a DNS server that we provide (AmazonProvidedDNS). If you
     * create a set of options, and if your VPC has an Internet gateway, make
     * sure to set the <code>domain-name-servers</code> option either to
     * <code>AmazonProvidedDNS</code> or to a domain name server of your
     * choice. For more information about DHCP options, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_DHCP_Options.html"> DHCP Options Sets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createDhcpOptionsRequest Container for the necessary parameters
     *           to execute the CreateDhcpOptions service method on AmazonEC2.
     * 
     * @return The response from the CreateDhcpOptions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDhcpOptionsResult createDhcpOptions(CreateDhcpOptionsRequest createDhcpOptionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes one or more specified VPC endpoints. Deleting the endpoint
     * also deletes the endpoint routes in the route tables that were
     * associated with the endpoint.
     * </p>
     *
     * @param deleteVpcEndpointsRequest Container for the necessary
     *           parameters to execute the DeleteVpcEndpoints service method on
     *           AmazonEC2.
     * 
     * @return The response from the DeleteVpcEndpoints service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteVpcEndpointsResult deleteVpcEndpoints(DeleteVpcEndpointsRequest deleteVpcEndpointsRequest) 
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
     *           parameters to execute the ResetSnapshotAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetSnapshotAttribute(ResetSnapshotAttributeRequest resetSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified route from the specified route table.
     * </p>
     *
     * @param deleteRouteRequest Container for the necessary parameters to
     *           execute the DeleteRoute service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteRoute(DeleteRouteRequest deleteRouteRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     *
     * @param describeInternetGatewaysRequest Container for the necessary
     *           parameters to execute the DescribeInternetGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeInternetGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInternetGatewaysResult describeInternetGateways(DescribeInternetGatewaysRequest describeInternetGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Rejects a VPC peering connection request. The VPC peering connection
     * must be in the <code>pending-acceptance</code> state. Use the
     * DescribeVpcPeeringConnections request to view your outstanding VPC
     * peering connection requests. To delete an active VPC peering
     * connection, or to delete a VPC peering connection request that you
     * initiated, use DeleteVpcPeeringConnection.
     * </p>
     *
     * @param rejectVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the RejectVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the RejectVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RejectVpcPeeringConnectionResult rejectVpcPeeringConnection(RejectVpcPeeringConnectionRequest rejectVpcPeeringConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes one or more flow logs.
     * </p>
     *
     * @param deleteFlowLogsRequest Container for the necessary parameters to
     *           execute the DeleteFlowLogs service method on AmazonEC2.
     * 
     * @return The response from the DeleteFlowLogs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteFlowLogsResult deleteFlowLogs(DeleteFlowLogsRequest deleteFlowLogsRequest) 
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
     *           to execute the DetachVpnGateway service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachVpnGateway(DetachVpnGatewayRequest detachVpnGatewayRequest) 
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
     *           to execute the DeregisterImage service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deregisterImage(DeregisterImageRequest deregisterImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the data feed for Spot instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html"> Spot Instance Data Feed </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DescribeSpotDatafeedSubscription
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeSpotDatafeedSubscription service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest describeSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * When you no longer want to use a Dedicated host it can be released.
     * On-Demand billing is stopped and the host goes into
     * <code>released</code> state. The host ID of Dedicated hosts that have
     * been released can no longer be specified in another request, e.g.,
     * ModifyHosts. You must stop or terminate all instances on a host before
     * it can be released.
     * </p>
     * <p>
     * When Dedicated hosts are released, it make take some time for them to
     * stop counting toward your limit and you may receive capacity errors
     * when trying to allocate new Dedicated hosts. Try waiting a few
     * minutes, and then try again.
     * </p>
     * <p>
     * Released hosts will still appear in a DescribeHosts response.
     * </p>
     *
     * @param releaseHostsRequest Container for the necessary parameters to
     *           execute the ReleaseHosts service method on AmazonEC2.
     * 
     * @return The response from the ReleaseHosts service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReleaseHostsResult releaseHosts(ReleaseHostsRequest releaseHostsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified set of tags from the specified set of
     * resources. This call is designed to follow a <code>DescribeTags</code>
     * request.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteTagsRequest Container for the necessary parameters to
     *           execute the DeleteTags service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteTags(DeleteTagsRequest deleteTagsRequest) 
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
     *           to execute the CreateVpnGateway service method on AmazonEC2.
     * 
     * @return The response from the CreateVpnGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpnGatewayResult createVpnGateway(CreateVpnGatewayRequest createVpnGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables I/O operations for a volume that had I/O operations disabled
     * because the data on the volume was potentially inconsistent.
     * </p>
     *
     * @param enableVolumeIORequest Container for the necessary parameters to
     *           execute the EnableVolumeIO service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void enableVolumeIO(EnableVolumeIORequest enableVolumeIORequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches an EBS volume to a running or stopped instance and exposes
     * it to the instance with the specified device name.
     * </p>
     * <p>
     * Encrypted EBS volumes may only be attached to instances that support
     * Amazon EBS encryption. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For a list of supported device names, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching an EBS Volume to an Instance </a> . Any device names that aren't reserved for instance store volumes can be used for EBS volumes. For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html"> Amazon EC2 Instance Store </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * If a volume has an AWS Marketplace product code:
     * </p>
     * 
     * <ul>
     * <li>The volume can be attached only to a stopped instance.</li>
     * <li>AWS Marketplace product codes are copied from the volume to the
     * instance.</li>
     * <li>You must be subscribed to the product.</li>
     * <li>The instance type and operating system of the instance must
     * support the product. For example, you can't detach a volume from a
     * Windows instance and attach it to a Linux instance.</li>
     * 
     * </ul>
     * <p>
     * For an overview of the AWS Marketplace, see
     * <a href="https://aws.amazon.com/marketplace/help/200900000"> Introducing AWS Marketplace </a>
     * .
     * </p>
     * <p>
     * For more information about EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-attaching-volume.html"> Attaching Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param attachVolumeRequest Container for the necessary parameters to
     *           execute the AttachVolume service method on AmazonEC2.
     * 
     * @return The response from the AttachVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachVolumeResult attachVolume(AttachVolumeRequest attachVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     *
     * @param describeImportSnapshotTasksRequest Container for the necessary
     *           parameters to execute the DescribeImportSnapshotTasks service method
     *           on AmazonEC2.
     * 
     * @return The response from the DescribeImportSnapshotTasks service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImportSnapshotTasksResult describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest describeImportSnapshotTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Resets an attribute of an AMI to its default value.
     * </p>
     * <p>
     * <b>NOTE:</b> The productCodes attribute can't be reset.
     * </p>
     *
     * @param resetImageAttributeRequest Container for the necessary
     *           parameters to execute the ResetImageAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void resetImageAttribute(ResetImageAttributeRequest resetImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified EBS volume. The volume must be in the
     * <code>available</code> state (not attached to an instance).
     * </p>
     * <p>
     * <b>NOTE:</b> The volume may remain in the deleting state for several
     * minutes.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-deleting-volume.html"> Deleting an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVolume(DeleteVolumeRequest deleteVolumeRequest) 
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
     *           parameters to execute the CreateNetworkInterface service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateNetworkInterface service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateNetworkInterfaceResult createNetworkInterface(CreateNetworkInterfaceRequest createNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     *
     * @param describeVpcsRequest Container for the necessary parameters to
     *           execute the DescribeVpcs service method on AmazonEC2.
     * 
     * @return The response from the DescribeVpcs service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcsResult describeVpcs(DescribeVpcsRequest describeVpcsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Unassigns one or more secondary private IP addresses from a network
     * interface.
     * </p>
     *
     * @param unassignPrivateIpAddressesRequest Container for the necessary
     *           parameters to execute the UnassignPrivateIpAddresses service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest unassignPrivateIpAddressesRequest) 
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
     *           parameters to execute the CancelConversionTask service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void cancelConversionTask(CancelConversionTaskRequest cancelConversionTaskRequest) 
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
     *           parameters to execute the CreateNetworkAclEntry service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createNetworkAclEntry(CreateNetworkAclEntryRequest createNetworkAclEntryRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Detaches an Internet gateway from a VPC, disabling connectivity
     * between the Internet and the VPC. The VPC must not contain any running
     * instances with Elastic IP addresses.
     * </p>
     *
     * @param detachInternetGatewayRequest Container for the necessary
     *           parameters to execute the DetachInternetGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void detachInternetGateway(DetachInternetGatewayRequest detachInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC
     * peering connection must be in the <code>pending-acceptance</code>
     * state, and you must be the owner of the peer VPC. Use the
     * <code>DescribeVpcPeeringConnections</code> request to view your
     * outstanding VPC peering connection requests.
     * </p>
     *
     * @param acceptVpcPeeringConnectionRequest Container for the necessary
     *           parameters to execute the AcceptVpcPeeringConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the AcceptVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection(AcceptVpcPeeringConnectionRequest acceptVpcPeeringConnectionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     *
     * @param cancelImportTaskRequest Container for the necessary parameters
     *           to execute the CancelImportTask service method on AmazonEC2.
     * 
     * @return The response from the CancelImportTask service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelImportTaskResult cancelImportTask(CancelImportTaskRequest cancelImportTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * Each subnet in your VPC must be associated with a route table. If a
     * subnet is not explicitly associated with any route table, it is
     * implicitly associated with the main route table. This command does not
     * return the subnet ID for implicit associations.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param describeRouteTablesRequest Container for the necessary
     *           parameters to execute the DescribeRouteTables service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeRouteTables service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRouteTablesResult describeRouteTables(DescribeRouteTablesRequest describeRouteTablesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Submits feedback about the status of an instance. The instance must
     * be in the <code>running</code> state. If your experience with the
     * instance differs from the instance status returned by
     * DescribeInstanceStatus, use ReportInstanceStatus to report your
     * experience with the instance. Amazon EC2 collects this information to
     * improve the accuracy of status checks.
     * </p>
     * <p>
     * Use of this action does not change the value returned by
     * DescribeInstanceStatus.
     * </p>
     *
     * @param reportInstanceStatusRequest Container for the necessary
     *           parameters to execute the ReportInstanceStatus service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void reportInstanceStatus(ReportInstanceStatusRequest reportInstanceStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes your account's Reserved instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell
     * Reserved instance capacity that they no longer need with buyers who
     * want to purchase additional capacity. Reserved instances bought and
     * sold through the Reserved Instance Marketplace work like any other
     * Reserved Instances.
     * </p>
     * <p>
     * As a seller, you choose to list some or all of your Reserved
     * instances, and you specify the upfront price to receive for them. Your
     * Reserved instances are then listed in the Reserved Instance
     * Marketplace and are available for purchase.
     * </p>
     * <p>
     * As a buyer, you specify the configuration of the Reserved instance to
     * purchase, and the Marketplace matches what you're searching for with
     * what's available. The Marketplace first sells the lowest priced
     * Reserved instances to you, and continues to sell available Reserved
     * Instance listings to you until your demand is met. You are charged
     * based on the total price of all of the listings that you purchase.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesListingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesListings
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstancesListings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesListingsResult describeReservedInstancesListings(DescribeReservedInstancesListingsRequest describeReservedInstancesListingsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot
     * tasks that are already created.
     * </p>
     *
     * @param describeImportImageTasksRequest Container for the necessary
     *           parameters to execute the DescribeImportImageTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeImportImageTasks service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImportImageTasksResult describeImportImageTasks(DescribeImportImageTasksRequest describeImportImageTasksRequest) 
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
     *           parameters to execute the DescribeBundleTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeBundleTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBundleTasksResult describeBundleTasks(DescribeBundleTasksRequest describeBundleTasksRequest) 
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
     *           parameters to execute the RevokeSecurityGroupIngress service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupIngress(RevokeSecurityGroupIngressRequest revokeSecurityGroupIngressRequest) 
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
     *           parameters to execute the CreateInternetGateway service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateInternetGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInternetGatewayResult createInternetGateway(CreateInternetGatewayRequest createInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modifies the specified attribute of the specified AMI. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> AWS Marketplace product codes cannot be modified. Images
     * with an AWS Marketplace product code cannot be made public.
     * </p>
     *
     * @param modifyImageAttributeRequest Container for the necessary
     *           parameters to execute the ModifyImageAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifyImageAttribute(ModifyImageAttributeRequest modifyImageAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Provides information to AWS about your VPN customer gateway device.
     * The customer gateway is the appliance at your end of the VPN
     * connection. (The device on the AWS side of the VPN connection is the
     * virtual private gateway.) You must provide the Internet-routable IP
     * address of the customer gateway's external interface. The IP address
     * must be static and may be behind a device performing network address
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
     * <p>
     * <b>IMPORTANT:</b> You cannot create more than one customer gateway
     * with the same VPN type, IP address, and BGP ASN parameter values. If
     * you run an identical request more than one time, the first request
     * creates the customer gateway, and subsequent requests return
     * information about the existing customer gateway. The subsequent
     * requests do not create new customer gateway resources.
     * </p>
     *
     * @param createCustomerGatewayRequest Container for the necessary
     *           parameters to execute the CreateCustomerGateway service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateCustomerGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCustomerGatewayResult createCustomerGateway(CreateCustomerGatewayRequest createCustomerGatewayRequest) 
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
     *           parameters to execute the AttachInternetGateway service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void attachInternetGateway(AttachInternetGatewayRequest attachInternetGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified VPN connection.
     * </p>
     * <p>
     * If you're deleting the VPC and its associated components, we
     * recommend that you detach the virtual private gateway from the VPC and
     * delete the VPC before deleting the VPN connection. If you believe that
     * the tunnel credentials for your VPN connection have been compromised,
     * you can delete the VPN connection and create a new one that has new
     * keys, without needing to delete the VPC or virtual private gateway. If
     * you create a new VPN connection, you must reconfigure the customer
     * gateway using the new configuration information returned with the new
     * VPN connection ID.
     * </p>
     *
     * @param deleteVpnConnectionRequest Container for the necessary
     *           parameters to execute the DeleteVpnConnection service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteVpnConnection(DeleteVpnConnectionRequest deleteVpnConnectionRequest) 
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
     *           parameters to execute the CreateVpnConnection service method on
     *           AmazonEC2.
     * 
     * @return The response from the CreateVpnConnection service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpnConnectionResult createVpnConnection(CreateVpnConnectionRequest createVpnConnectionRequest) 
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
     *           parameters to execute the DescribeConversionTasks service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeConversionTasks service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConversionTasksResult describeConversionTasks(DescribeConversionTasksRequest describeConversionTasksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Import single or multi-volume disk images or EBS snapshots into an
     * Amazon Machine Image (AMI).
     * </p>
     *
     * @param importImageRequest Container for the necessary parameters to
     *           execute the ImportImage service method on AmazonEC2.
     * 
     * @return The response from the ImportImage service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportImageResult importImage(ImportImageRequest importImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disables ClassicLink for a VPC. You cannot disable ClassicLink for a
     * VPC that has EC2-Classic instances linked to it.
     * </p>
     *
     * @param disableVpcClassicLinkRequest Container for the necessary
     *           parameters to execute the DisableVpcClassicLink service method on
     *           AmazonEC2.
     * 
     * @return The response from the DisableVpcClassicLink service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableVpcClassicLinkResult disableVpcClassicLink(DisableVpcClassicLinkRequest disableVpcClassicLinkRequest) 
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
     *           parameters to execute the DescribePlacementGroups service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribePlacementGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePlacementGroupsResult describePlacementGroups(DescribePlacementGroupsRequest describePlacementGroupsRequest) 
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
     *           to execute the DescribeInstances service method on AmazonEC2.
     * 
     * @return The response from the DescribeInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the specified network ACL. You can't delete the ACL if it's
     * associated with any subnets. You can't delete the default network ACL.
     * </p>
     *
     * @param deleteNetworkAclRequest Container for the necessary parameters
     *           to execute the DeleteNetworkAcl service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteNetworkAcl(DeleteNetworkAclRequest deleteNetworkAclRequest) 
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
     *           execute the DescribeImages service method on AmazonEC2.
     * 
     * @return The response from the DescribeImages service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImagesResult describeImages(DescribeImagesRequest describeImagesRequest) 
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
     *           execute the StartInstances service method on AmazonEC2.
     * 
     * @return The response from the StartInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public StartInstancesResult startInstances(StartInstancesRequest startInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels the specified Reserved instance listing in the Reserved
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
     *           service method on AmazonEC2.
     * 
     * @return The response from the CancelReservedInstancesListing service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelReservedInstancesListingResult cancelReservedInstancesListing(CancelReservedInstancesListingRequest cancelReservedInstancesListingRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds one or more ingress rules to a security group.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> EC2-Classic: You can have up to 100 rules per
     * group. EC2-VPC: You can have up to 50 rules per group (covering both
     * ingress and egress rules).
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
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void authorizeSecurityGroupIngress(AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the Spot instance requests that belong to your account.
     * Spot instances are instances that Amazon EC2 launches when the bid
     * price that you specify exceeds the current Spot price. Amazon EC2
     * periodically sets the Spot price based on available Spot instance
     * capacity and current Spot instance requests. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html"> Spot Instance Requests </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a
     * running Spot instance by examining the response. If the status of the
     * Spot instance is <code>fulfilled</code> , the instance ID appears in
     * the response and contains the identifier of the instance.
     * Alternatively, you can use DescribeInstances with a filter to look for
     * instances where the instance lifecycle is <code>spot</code> .
     * </p>
     *
     * @param describeSpotInstanceRequestsRequest Container for the necessary
     *           parameters to execute the DescribeSpotInstanceRequests service method
     *           on AmazonEC2.
     * 
     * @return The response from the DescribeSpotInstanceRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest describeSpotInstanceRequestsRequest) 
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
     *           execute the CreateVpc service method on AmazonEC2.
     * 
     * @return The response from the CreateVpc service method, as returned by
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
    public CreateVpcResult createVpc(CreateVpcRequest createVpcRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Enables a VPC to support DNS hostname resolution for ClassicLink. If
     * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
     * its private IP address when addressed from an instance in the VPC to
     * which it's linked. Similarly, the DNS hostname of an instance in a VPC
     * resolves to its private IP address when addressed from a linked
     * EC2-Classic instance. For more information about ClassicLink, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     *
     * @param enableVpcClassicLinkDnsSupportRequest Container for the
     *           necessary parameters to execute the EnableVpcClassicLinkDnsSupport
     *           service method on AmazonEC2.
     * 
     * @return The response from the EnableVpcClassicLinkDnsSupport service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableVpcClassicLinkDnsSupportResult enableVpcClassicLinkDnsSupport(EnableVpcClassicLinkDnsSupportRequest enableVpcClassicLinkDnsSupportRequest) 
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
     *           parameters to execute the DescribeCustomerGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeCustomerGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCustomerGatewaysResult describeCustomerGateways(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a Spot instance request. Spot instances are instances that
     * Amazon EC2 launches when the bid price that you specify exceeds the
     * current Spot price. Amazon EC2 periodically sets the Spot price based
     * on available Spot Instance capacity and current Spot instance
     * requests. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html"> Spot Instance Requests </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param requestSpotInstancesRequest Container for the necessary
     *           parameters to execute the RequestSpotInstances service method on
     *           AmazonEC2.
     * 
     * @return The response from the RequestSpotInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RequestSpotInstancesResult requestSpotInstances(RequestSpotInstancesRequest requestSpotInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or overwrites one or more tags for the specified Amazon EC2
     * resource or resources. Each resource can have a maximum of 10 tags.
     * Each tag consists of a key and optional value. Tag keys must be unique
     * per resource.
     * </p>
     * <p>
     * For more information about tags, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging Your Resources </a> in the <i>Amazon Elastic Compute Cloud User Guide</i> . For more information about creating IAM policies that control users' access to resources based on tags, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-supported-iam-actions-resources.html"> Supported Resource-Level Permissions for Amazon EC2 API Actions </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createTagsRequest Container for the necessary parameters to
     *           execute the CreateTags service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void createTags(CreateTagsRequest createTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified volume. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeVolumeAttributeRequest Container for the necessary
     *           parameters to execute the DescribeVolumeAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVolumeAttribute service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumeAttributeResult describeVolumeAttribute(DescribeVolumeAttributeRequest describeVolumeAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Attaches a network interface to an instance.
     * </p>
     *
     * @param attachNetworkInterfaceRequest Container for the necessary
     *           parameters to execute the AttachNetworkInterface service method on
     *           AmazonEC2.
     * 
     * @return The response from the AttachNetworkInterface service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AttachNetworkInterfaceResult attachNetworkInterface(AttachNetworkInterfaceRequest attachNetworkInterfaceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Replaces an existing route within a route table in a VPC. You must
     * provide only one of the following: Internet gateway or virtual private
     * gateway, NAT instance, NAT gateway, VPC peering connection, or network
     * interface.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param replaceRouteRequest Container for the necessary parameters to
     *           execute the ReplaceRoute service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void replaceRoute(ReplaceRouteRequest replaceRouteRequest) 
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
     *           execute the DescribeTags service method on AmazonEC2.
     * 
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Cancels a bundling operation for an instance store-backed Windows
     * instance.
     * </p>
     *
     * @param cancelBundleTaskRequest Container for the necessary parameters
     *           to execute the CancelBundleTask service method on AmazonEC2.
     * 
     * @return The response from the CancelBundleTask service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelBundleTaskResult cancelBundleTask(CancelBundleTaskRequest cancelBundleTaskRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     *
     * @param importSnapshotRequest Container for the necessary parameters to
     *           execute the ImportSnapshot service method on AmazonEC2.
     * 
     * @return The response from the ImportSnapshot service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportSnapshotResult importSnapshot(ImportSnapshotRequest importSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes your Spot fleet requests.
     * </p>
     *
     * @param describeSpotFleetRequestsRequest Container for the necessary
     *           parameters to execute the DescribeSpotFleetRequests service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSpotFleetRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotFleetRequestsResult describeSpotFleetRequests(DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Adds or removes permission settings for the specified snapshot. You
     * may add or remove specified AWS account IDs from a snapshot's list of
     * create volume permissions, but you cannot do both in a single API
     * call. If you need to both add and remove account IDs for a snapshot,
     * you must use multiple API calls.
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
     *           parameters to execute the ModifySnapshotAttribute service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void modifySnapshotAttribute(ModifySnapshotAttributeRequest modifySnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Modify the auto-placement setting of a Dedicated host. When
     * auto-placement is enabled, AWS will place instances that you launch
     * with a tenancy of <code>host</code> , but without targeting a specific
     * host ID, onto any available Dedicated host in your account which has
     * auto-placement enabled. When auto-placement is disabled, you need to
     * provide a host ID if you want the instance to launch onto a specific
     * host. If no host ID is provided, the instance will be launched onto a
     * suitable host which has auto-placement enabled.
     * </p>
     *
     * @param modifyHostsRequest Container for the necessary parameters to
     *           execute the ModifyHosts service method on AmazonEC2.
     * 
     * @return The response from the ModifyHosts service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ModifyHostsResult modifyHosts(ModifyHostsRequest modifyHostsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes the data feed for Spot instances.
     * </p>
     *
     * @param deleteSpotDatafeedSubscriptionRequest Container for the
     *           necessary parameters to execute the DeleteSpotDatafeedSubscription
     *           service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSpotDatafeedSubscription(DeleteSpotDatafeedSubscriptionRequest deleteSpotDatafeedSubscriptionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified snapshot. You can
     * specify only one attribute at a time.
     * </p>
     * <p>
     * For more information about EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeSnapshotAttributeRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeSnapshotAttribute service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotAttributeResult describeSnapshotAttribute(DescribeSnapshotAttributeRequest describeSnapshotAttributeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Changes the route table associated with a given subnet in a VPC.
     * After the operation completes, the subnet uses the routes in the new
     * route table it's associated with. For more information about route
     * tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * <p>
     * You can also use ReplaceRouteTableAssociation to change which table
     * is the main route table in the VPC. You just specify the main route
     * table's association ID and the route table to be the new main route
     * table.
     * </p>
     *
     * @param replaceRouteTableAssociationRequest Container for the necessary
     *           parameters to execute the ReplaceRouteTableAssociation service method
     *           on AmazonEC2.
     * 
     * @return The response from the ReplaceRouteTableAssociation service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReplaceRouteTableAssociationResult replaceRouteTableAssociation(ReplaceRouteTableAssociationRequest replaceRouteTableAssociationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the specified attribute of the specified AMI. You can
     * specify only one attribute at a time.
     * </p>
     *
     * @param describeImageAttributeRequest Container for the necessary
     *           parameters to execute the DescribeImageAttribute service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeImageAttribute service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImageAttributeResult describeImageAttribute(DescribeImageAttributeRequest describeImageAttributeRequest) 
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
     *           to execute the DescribeKeyPairs service method on AmazonEC2.
     * 
     * @return The response from the DescribeKeyPairs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeKeyPairsResult describeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Disassociates a subnet from a route table.
     * </p>
     * <p>
     * After you perform this action, the subnet no longer uses the routes
     * in the route table. Instead, it uses the routes in the VPC's main
     * route table. For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param disassociateRouteTableRequest Container for the necessary
     *           parameters to execute the DisassociateRouteTable service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void disassociateRouteTable(DisassociateRouteTableRequest disassociateRouteTableRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * [EC2-VPC only] Removes one or more egress rules from a security group
     * for EC2-VPC. This action doesn't apply to security groups for use in
     * EC2-Classic. The values that you specify in the revoke request (for
     * example, ports) must match the existing rule's values for the rule to
     * be revoked.
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
     *           parameters to execute the RevokeSecurityGroupEgress service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest revokeSecurityGroupEgressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates an EBS volume that can be attached to an instance in the same
     * Availability Zone. The volume is created in the regional endpoint that
     * you send the HTTP request to. For more information see
     * <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html"> Regions and Endpoints </a>
     * .
     * </p>
     * <p>
     * You can create a new empty volume or restore a volume from an EBS
     * snapshot. Any AWS Marketplace product codes from the snapshot are
     * propagated to the volume.
     * </p>
     * <p>
     * You can create encrypted volumes with the <code>Encrypted</code>
     * parameter. Encrypted volumes may only be attached to instances that
     * support Amazon EBS encryption. Volumes that are created from encrypted
     * snapshots are also automatically encrypted. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html"> Amazon EBS Encryption </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-creating-volume.html"> Creating or Restoring an Amazon EBS Volume </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param createVolumeRequest Container for the necessary parameters to
     *           execute the CreateVolume service method on AmazonEC2.
     * 
     * @return The response from the CreateVolume service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVolumeResult createVolume(CreateVolumeRequest createVolumeRequest) 
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
     *           parameters to execute the DescribeVpnGateways service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpnGateways service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnGatewaysResult describeVpnGateways(DescribeVpnGatewaysRequest describeVpnGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a subnet in an existing VPC.
     * </p>
     * <p>
     * When you create each subnet, you provide the VPC ID and the CIDR
     * block you want for the subnet. After you create a subnet, you can't
     * change its CIDR block. The subnet's CIDR block can be the same as the
     * VPC's CIDR block (assuming you want only a single subnet in the VPC),
     * or a subset of the VPC's CIDR block. If you create more than one
     * subnet in a VPC, the subnets' CIDR blocks must not overlap. The
     * smallest subnet (and VPC) you can create uses a /28 netmask (16 IP
     * addresses), and the largest uses a /16 netmask (65,536 IP addresses).
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
     * If you launch an instance in a VPC using an Amazon EBS-backed AMI,
     * the IP address doesn't change if you stop and restart the instance
     * (unlike a similar instance launched outside a VPC, which gets a new IP
     * address when restarted). It's therefore possible to have a subnet with
     * no running instances (they're all stopped), but no remaining IP
     * addresses available.
     * </p>
     * <p>
     * For more information about subnets, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"> Your VPC and Subnets </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     *
     * @param createSubnetRequest Container for the necessary parameters to
     *           execute the CreateSubnet service method on AmazonEC2.
     * 
     * @return The response from the CreateSubnet service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateSubnetResult createSubnet(CreateSubnetRequest createSubnetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes Reserved instance offerings that are available for
     * purchase. With Reserved instances, you purchase the right to launch
     * instances for a period of time. During that time period, you do not
     * receive insufficient capacity errors, and you pay a lower usage rate
     * than the rate charged for On-Demand instances for the actual time
     * used.
     * </p>
     * <p>
     * If you have listed your own Reserved instances for sale in the
     * Reserved Instance Marketplace, they will be excluded from these
     * results. This is to ensure that you do not purchase your own Reserved
     * instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param describeReservedInstancesOfferingsRequest Container for the
     *           necessary parameters to execute the DescribeReservedInstancesOfferings
     *           service method on AmazonEC2.
     * 
     * @return The response from the DescribeReservedInstancesOfferings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings(DescribeReservedInstancesOfferingsRequest describeReservedInstancesOfferingsRequest) 
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
     *           parameters to execute the AssignPrivateIpAddresses service method on
     *           AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void assignPrivateIpAddresses(AssignPrivateIpAddressesRequest assignPrivateIpAddressesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Bundles an Amazon instance store-backed Windows instance.
     * </p>
     * <p>
     * During bundling, only the root device volume (C:\) is bundled. Data
     * on other instance store volumes is not preserved.
     * </p>
     * <p>
     * <b>NOTE:</b> This action is not applicable for Linux/Unix instances
     * or Windows instances that are backed by Amazon EBS.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/Creating_InstanceStoreBacked_WinAMI.html"> Creating an Instance Store-Backed Windows AMI </a>
     * .
     * </p>
     *
     * @param bundleInstanceRequest Container for the necessary parameters to
     *           execute the BundleInstance service method on AmazonEC2.
     * 
     * @return The response from the BundleInstance service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public BundleInstanceResult bundleInstance(BundleInstanceRequest bundleInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     *
     * @param allocateAddressRequest Container for the necessary parameters
     *           to execute the AllocateAddress service method on AmazonEC2.
     * 
     * @return The response from the AllocateAddress service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocateAddressResult allocateAddress(AllocateAddressRequest allocateAddressRequest) 
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
     * [Nondefault VPC] You must use DisassociateAddress to disassociate the
     * Elastic IP address before you try to release it. Otherwise, Amazon EC2
     * returns an error ( <code>InvalidIPAddress.InUse</code> ).
     * </p>
     *
     * @param releaseAddressRequest Container for the necessary parameters to
     *           execute the ReleaseAddress service method on AmazonEC2.
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void releaseAddress(ReleaseAddressRequest releaseAddressRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes the ID format settings for your resources on a per-region
     * basis, for example, to view which resource types are enabled for
     * longer IDs. This request only returns information about resource types
     * whose ID formats can be modified; it does not return information about
     * other resource types.
     * </p>
     * <p>
     * The following resource types support longer IDs:
     * <code>instance</code> | <code>reservation</code> .
     * </p>
     * <p>
     * These settings apply to the IAM user who makes the request; they do
     * not apply to the entire AWS account. By default, an IAM user defaults
     * to the same settings as the root user, unless they explicitly override
     * the settings by running the ModifyIdFormat command. Resources created
     * with longer IDs are visible to all IAM users, regardless of these
     * settings and provided that they have permission to use the relevant
     * <code>Describe</code> command for the resource type.
     * </p>
     *
     * @param describeIdFormatRequest Container for the necessary parameters
     *           to execute the DescribeIdFormat service method on AmazonEC2.
     * 
     * @return The response from the DescribeIdFormat service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIdFormatResult describeIdFormat(DescribeIdFormatRequest describeIdFormatRequest) 
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
     * EBS-backed Linux AMI from a snapshot of a root device volume. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_LaunchingInstanceFromSnapshot.html"> Launching an Instance from a Snapshot </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> Some Linux distributions, such as Red Hat
     * Enterprise Linux (RHEL) and SUSE Linux Enterprise Server (SLES), use
     * the EC2 billingProduct code associated with an AMI to verify
     * subscription status for package updates. Creating an AMI from an EBS
     * snapshot does not maintain this billing code, and subsequent instances
     * launched from such an AMI will not be able to connect to package
     * update infrastructure. Similarly, although you can create a Windows
     * AMI from a snapshot, you can't successfully launch an instance from
     * the AMI. To create Windows AMIs or to create AMIs for Linux operating
     * systems that must retain AMI billing codes to work properly, see
     * CreateImage.
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
     *           execute the RegisterImage service method on AmazonEC2.
     * 
     * @return The response from the RegisterImage service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public RegisterImageResult registerImage(RegisterImageRequest registerImageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     *
     * @param describeVpcEndpointsRequest Container for the necessary
     *           parameters to execute the DescribeVpcEndpoints service method on
     *           AmazonEC2.
     * 
     * @return The response from the DescribeVpcEndpoints service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcEndpointsResult describeVpcEndpoints(DescribeVpcEndpointsRequest describeVpcEndpointsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Describes one or more of the Reserved instances that you purchased.
     * </p>
     * <p>
     * For more information about Reserved instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-on-demand-reserved-instances.html"> Reserved Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesResult describeReservedInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your Dedicated hosts.
     * </p>
     * <p>
     * The results describe only the Dedicated hosts in the region you're
     * currently using. All listed instances consume capacity on your
     * Dedicated host. Dedicated hosts that have recently been released will
     * be listed with the state <code>released</code> .
     * </p>
     * 
     * @return The response from the DescribeHosts service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeHostsResult describeHosts() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the Spot price history. The prices returned are listed in
     * chronological order, from the oldest to the most recent, for up to the
     * past 90 days. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances-history.html"> Spot Instance Pricing History </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * When you specify a start and end time, this operation returns the
     * prices of the instance types within the time range that you specified
     * and the time when the price changed. The price is valid within the
     * time period that you specified; the response merely indicates the last
     * time that the price changed.
     * </p>
     * 
     * @return The response from the DescribeSpotPriceHistory service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotPriceHistoryResult describeSpotPriceHistory() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeSecurityGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSecurityGroupsResult describeSecurityGroups() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes attributes of your AWS account. The following are the
     * supported account attributes:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <code>supported-platforms</code> : Indicates whether your account can
     * launch instances into EC2-Classic and EC2-VPC, or only into EC2-VPC.
     * </p>
     * </li>
     * <li> <p>
     * <code>default-vpc</code> : The ID of the default VPC for your
     * account, or <code>none</code> .
     * </p>
     * </li>
     * <li> <p>
     * <code>max-instances</code> : The maximum number of On-Demand
     * instances that you can run.
     * </p>
     * </li>
     * <li> <p>
     * <code>vpc-max-security-groups-per-interface</code> : The maximum
     * number of security groups that you can assign to a network interface.
     * </p>
     * </li>
     * <li> <p>
     * <code>max-elastic-ips</code> : The maximum number of Elastic IP
     * addresses that you can allocate for use with EC2-Classic.
     * </p>
     * </li>
     * <li> <p>
     * <code>vpc-max-elastic-ips</code> : The maximum number of Elastic IP
     * addresses that you can allocate for use with EC2-VPC.
     * </p>
     * </li>
     * 
     * </ul>
     * 
     * @return The response from the DescribeAccountAttributes service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAccountAttributesResult describeAccountAttributes() throws AmazonServiceException, AmazonClientException;
    
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
     * The <code>DescribeVolumeStatus</code> operation provides the
     * following information about the specified volumes:
     * </p>
     * <p>
     * <i>Status</i> : Reflects the current status of the volume. The
     * possible values are <code>ok</code> , <code>impaired</code> ,
     * <code>warning</code> , or <code>insufficient-data</code> . If all
     * checks pass, the overall status of the volume is <code>ok</code> . If
     * the check fails, the overall status is <code>impaired</code> . If the
     * status is <code>insufficient-data</code> , then the checks may still
     * be taking place on your volume at the time. We recommend that you
     * retry the request. For more information on volume status, see
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
     * @return The response from the DescribeVolumeStatus service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumeStatusResult describeVolumeStatus() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeVpnConnections service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnConnectionsResult describeVpnConnections() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the ClassicLink DNS support status of one or more VPCs. If
     * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
     * its private IP address when addressed from an instance in the VPC to
     * which it's linked. Similarly, the DNS hostname of an instance in a VPC
     * resolves to its private IP address when addressed from a linked
     * EC2-Classic instance. For more information about ClassicLink, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @return The response from the DescribeVpcClassicLinkDnsSupport service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcClassicLinkDnsSupportResult describeVpcClassicLinkDnsSupport() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your export tasks.
     * </p>
     * 
     * @return The response from the DescribeExportTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeExportTasksResult describeExportTasks() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Requests a VPC peering connection between two VPCs: a requester VPC
     * that you own and a peer VPC with which to create the connection. The
     * peer VPC can belong to another AWS account. The requester VPC and peer
     * VPC cannot have overlapping CIDR blocks.
     * </p>
     * <p>
     * The owner of the peer VPC must accept the peering request to activate
     * the peering connection. The VPC peering connection request expires
     * after 7 days, after which it cannot be accepted or rejected.
     * </p>
     * <p>
     * A <code>CreateVpcPeeringConnection</code> request between VPCs with
     * overlapping CIDR blocks results in the VPC peering connection having a
     * status of <code>failed</code> .
     * </p>
     * 
     * @return The response from the CreateVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateVpcPeeringConnectionResult createVpcPeeringConnection() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the specified EBS volumes.
     * </p>
     * <p>
     * If you are describing a long list of volumes, you can paginate the
     * output to make the list more manageable. The <code>MaxResults</code>
     * parameter sets the maximum number of results returned in a single
     * page. If the list of results exceeds your <code>MaxResults</code>
     * value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent
     * <code>DescribeVolumes</code> request to retrieve the remaining
     * results.
     * </p>
     * <p>
     * For more information about EBS volumes, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeVolumes service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVolumesResult describeVolumes() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeDhcpOptions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDhcpOptionsResult describeDhcpOptions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes available AWS services in a prefix list format, which
     * includes the prefix list name and prefix list ID of the service and
     * the IP address range for the service. A prefix list ID is required for
     * creating an outbound security group rule that allows traffic from a
     * VPC to access an AWS service through a VPC endpoint.
     * </p>
     * 
     * @return The response from the DescribePrefixLists service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePrefixListsResult describePrefixLists() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeNetworkAcls service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkAclsResult describeNetworkAcls() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes your Elastic IP addresses that are being moved to the
     * EC2-VPC platform, or that are being restored to the EC2-Classic
     * platform. This request does not return information about any other
     * Elastic IP addresses in your account.
     * </p>
     * 
     * @return The response from the DescribeMovingAddresses service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMovingAddressesResult describeMovingAddresses() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more flow logs. To view the information in your flow
     * logs (the log streams for the network interfaces), you must use the
     * CloudWatch Logs console or the CloudWatch Logs API.
     * </p>
     * 
     * @return The response from the DescribeFlowLogs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeFlowLogsResult describeFlowLogs() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your VPC peering connections.
     * </p>
     * 
     * @return The response from the DescribeVpcPeeringConnections service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeSubnets service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSubnetsResult describeSubnets() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Disables ClassicLink DNS support for a VPC. If disabled, DNS
     * hostnames resolve to public IP addresses when addressed between a
     * linked EC2-Classic instance and instances in the VPC to which it's
     * linked. For more information about ClassicLink, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @return The response from the DisableVpcClassicLinkDnsSupport service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisableVpcClassicLinkDnsSupportResult disableVpcClassicLinkDnsSupport() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the ClassicLink status of one or more VPCs.
     * </p>
     * 
     * @return The response from the DescribeVpcClassicLink service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcClassicLinkResult describeVpcClassicLink() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of the your NAT gateways.
     * </p>
     * 
     * @return The response from the DescribeNatGateways service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNatGatewaysResult describeNatGateways() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your linked EC2-Classic instances. This
     * request only returns information about EC2-Classic instances linked to
     * a VPC through ClassicLink; you cannot use this request to return
     * information about other instances.
     * </p>
     * 
     * @return The response from the DescribeClassicLinkInstances service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeClassicLinkInstancesResult describeClassicLinkInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the modifications made to your Reserved instances. If no
     * parameter is specified, information about all your Reserved instances
     * modification requests is returned. If a modification ID is specified,
     * only information about the specific modification is returned.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-modifying.html"> Modifying Reserved Instances </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @return The response from the DescribeReservedInstancesModifications
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesModificationsResult describeReservedInstancesModifications() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your Elastic IP addresses.
     * </p>
     * <p>
     * An Elastic IP address is for use in either the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeAddresses service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAddressesResult describeAddresses() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the status of one or more instances.
     * </p>
     * <p>
     * Instance status includes the following components:
     * </p>
     * 
     * <ul>
     * <li> <p>
     * <b>Status checks</b> - Amazon EC2 performs status checks on running
     * EC2 instances to identify hardware and software issues. For more
     * information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-system-instance-status-check.html"> Status Checks for Your Instances </a> and <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/TroubleshootingInstances.html"> Troubleshooting Instances with Failed Status Checks </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * </li>
     * <li> <p>
     * <b>Scheduled events</b> - Amazon EC2 can schedule events (such as
     * reboot, stop, or terminate) for your instances related to hardware
     * issues, software updates, or system maintenance. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/monitoring-instances-status-check_sched.html"> Scheduled Events for Your Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * </li>
     * <li> <p>
     * <b>Instance state</b> - You can manage your instances from the moment
     * you launch them through their termination. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html"> Instance Lifecycle </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * </li>
     * 
     * </ul>
     * 
     * @return The response from the DescribeInstanceStatus service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstanceStatusResult describeInstanceStatus() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes all supported AWS services that can be specified when
     * creating a VPC endpoint.
     * </p>
     * 
     * @return The response from the DescribeVpcEndpointServices service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcEndpointServicesResult describeVpcEndpointServices() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of the EBS snapshots available to you.
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
     * If you are describing a long list of snapshots, you can paginate the
     * output to make the list more manageable. The <code>MaxResults</code>
     * parameter sets the maximum number of results returned in a single
     * page. If the list of results exceeds your <code>MaxResults</code>
     * value, then that number of results is returned along with a
     * <code>NextToken</code> value that can be passed to a subsequent
     * <code>DescribeSnapshots</code> request to retrieve the remaining
     * results.
     * </p>
     * <p>
     * For more information about EBS snapshots, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSnapshots service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSnapshotsResult describeSnapshots() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeAvailabilityZones service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeAvailabilityZonesResult describeAvailabilityZones() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeRegions service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRegionsResult describeRegions() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your network interfaces.
     * </p>
     * 
     * @return The response from the DescribeNetworkInterfaces service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeNetworkInterfacesResult describeNetworkInterfaces() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your Internet gateways.
     * </p>
     * 
     * @return The response from the DescribeInternetGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInternetGatewaysResult describeInternetGateways() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the data feed for Spot instances. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html"> Spot Instance Data Feed </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeSpotDatafeedSubscription service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotDatafeedSubscriptionResult describeSpotDatafeedSubscription() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes your import snapshot tasks.
     * </p>
     * 
     * @return The response from the DescribeImportSnapshotTasks service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImportSnapshotTasksResult describeImportSnapshotTasks() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your VPCs.
     * </p>
     * 
     * @return The response from the DescribeVpcs service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcsResult describeVpcs() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Accept a VPC peering connection request. To accept a request, the VPC
     * peering connection must be in the <code>pending-acceptance</code>
     * state, and you must be the owner of the peer VPC. Use the
     * <code>DescribeVpcPeeringConnections</code> request to view your
     * outstanding VPC peering connection requests.
     * </p>
     * 
     * @return The response from the AcceptVpcPeeringConnection service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AcceptVpcPeeringConnectionResult acceptVpcPeeringConnection() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Cancels an in-process import virtual machine or import snapshot task.
     * </p>
     * 
     * @return The response from the CancelImportTask service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CancelImportTaskResult cancelImportTask() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your route tables.
     * </p>
     * <p>
     * Each subnet in your VPC must be associated with a route table. If a
     * subnet is not explicitly associated with any route table, it is
     * implicitly associated with the main route table. This command does not
     * return the subnet ID for implicit associations.
     * </p>
     * <p>
     * For more information about route tables, see
     * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html"> Route Tables </a>
     * in the <i>Amazon Virtual Private Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeRouteTables service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeRouteTablesResult describeRouteTables() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes your account's Reserved instance listings in the Reserved
     * Instance Marketplace.
     * </p>
     * <p>
     * The Reserved Instance Marketplace matches sellers who want to resell
     * Reserved instance capacity that they no longer need with buyers who
     * want to purchase additional capacity. Reserved instances bought and
     * sold through the Reserved Instance Marketplace work like any other
     * Reserved Instances.
     * </p>
     * <p>
     * As a seller, you choose to list some or all of your Reserved
     * instances, and you specify the upfront price to receive for them. Your
     * Reserved instances are then listed in the Reserved Instance
     * Marketplace and are available for purchase.
     * </p>
     * <p>
     * As a buyer, you specify the configuration of the Reserved instance to
     * purchase, and the Marketplace matches what you're searching for with
     * what's available. The Marketplace first sells the lowest priced
     * Reserved instances to you, and continues to sell available Reserved
     * Instance listings to you until your demand is met. You are charged
     * based on the total price of all of the listings that you purchase.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedInstancesListings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesListingsResult describeReservedInstancesListings() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Displays details about an import virtual machine or import snapshot
     * tasks that are already created.
     * </p>
     * 
     * @return The response from the DescribeImportImageTasks service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImportImageTasksResult describeImportImageTasks() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeBundleTasks service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBundleTasksResult describeBundleTasks() throws AmazonServiceException, AmazonClientException;
    
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
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void revokeSecurityGroupIngress() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the CreateInternetGateway service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInternetGatewayResult createInternetGateway() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your conversion tasks. For more information,
     * see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UploadingYourInstancesandVolumes.html"> Using the Command Line Tools to Import Your Virtual Machine to Amazon EC2 </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeConversionTasks service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeConversionTasksResult describeConversionTasks() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Import single or multi-volume disk images or EBS snapshots into an
     * Amazon Machine Image (AMI).
     * </p>
     * 
     * @return The response from the ImportImage service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportImageResult importImage() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your placement groups. For more information
     * about placement groups and cluster instances, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using_cluster_computing.html"> Cluster Instances </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribePlacementGroups service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePlacementGroupsResult describePlacementGroups() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeInstances service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeInstancesResult describeInstances() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeImages service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeImagesResult describeImages() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the Spot instance requests that belong to your account.
     * Spot instances are instances that Amazon EC2 launches when the bid
     * price that you specify exceeds the current Spot price. Amazon EC2
     * periodically sets the Spot price based on available Spot instance
     * capacity and current Spot instance requests. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html"> Spot Instance Requests </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * <p>
     * You can use <code>DescribeSpotInstanceRequests</code> to find a
     * running Spot instance by examining the response. If the status of the
     * Spot instance is <code>fulfilled</code> , the instance ID appears in
     * the response and contains the identifier of the instance.
     * Alternatively, you can use DescribeInstances with a filter to look for
     * instances where the instance lifecycle is <code>spot</code> .
     * </p>
     * 
     * @return The response from the DescribeSpotInstanceRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotInstanceRequestsResult describeSpotInstanceRequests() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Enables a VPC to support DNS hostname resolution for ClassicLink. If
     * enabled, the DNS hostname of a linked EC2-Classic instance resolves to
     * its private IP address when addressed from an instance in the VPC to
     * which it's linked. Similarly, the DNS hostname of an instance in a VPC
     * resolves to its private IP address when addressed from a linked
     * EC2-Classic instance. For more information about ClassicLink, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html"> ClassicLink </a>
     * in the Amazon Elastic Compute Cloud User Guide.
     * </p>
     * 
     * @return The response from the EnableVpcClassicLinkDnsSupport service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EnableVpcClassicLinkDnsSupportResult enableVpcClassicLinkDnsSupport() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeCustomerGateways service method,
     *         as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeCustomerGatewaysResult describeCustomerGateways() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeTags service method, as returned
     *         by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeTagsResult describeTags() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Imports a disk into an EBS snapshot.
     * </p>
     * 
     * @return The response from the ImportSnapshot service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ImportSnapshotResult importSnapshot() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes your Spot fleet requests.
     * </p>
     * 
     * @return The response from the DescribeSpotFleetRequests service
     *         method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeSpotFleetRequestsResult describeSpotFleetRequests() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Deletes the data feed for Spot instances.
     * </p>
     * 
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteSpotDatafeedSubscription() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeKeyPairs service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeKeyPairsResult describeKeyPairs() throws AmazonServiceException, AmazonClientException;
    
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
     * @return The response from the DescribeVpnGateways service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpnGatewaysResult describeVpnGateways() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes Reserved instance offerings that are available for
     * purchase. With Reserved instances, you purchase the right to launch
     * instances for a period of time. During that time period, you do not
     * receive insufficient capacity errors, and you pay a lower usage rate
     * than the rate charged for On-Demand instances for the actual time
     * used.
     * </p>
     * <p>
     * If you have listed your own Reserved instances for sale in the
     * Reserved Instance Marketplace, they will be excluded from these
     * results. This is to ensure that you do not purchase your own Reserved
     * instances.
     * </p>
     * <p>
     * For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the DescribeReservedInstancesOfferings
     *         service method, as returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeReservedInstancesOfferingsResult describeReservedInstancesOfferings() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Acquires an Elastic IP address.
     * </p>
     * <p>
     * An Elastic IP address is for use either in the EC2-Classic platform
     * or in a VPC. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
     * </p>
     * 
     * @return The response from the AllocateAddress service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AllocateAddressResult allocateAddress() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes the ID format settings for your resources on a per-region
     * basis, for example, to view which resource types are enabled for
     * longer IDs. This request only returns information about resource types
     * whose ID formats can be modified; it does not return information about
     * other resource types.
     * </p>
     * <p>
     * The following resource types support longer IDs:
     * <code>instance</code> | <code>reservation</code> .
     * </p>
     * <p>
     * These settings apply to the IAM user who makes the request; they do
     * not apply to the entire AWS account. By default, an IAM user defaults
     * to the same settings as the root user, unless they explicitly override
     * the settings by running the ModifyIdFormat command. Resources created
     * with longer IDs are visible to all IAM users, regardless of these
     * settings and provided that they have permission to use the relevant
     * <code>Describe</code> command for the resource type.
     * </p>
     * 
     * @return The response from the DescribeIdFormat service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeIdFormatResult describeIdFormat() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Describes one or more of your VPC endpoints.
     * </p>
     * 
     * @return The response from the DescribeVpcEndpoints service method, as
     *         returned by AmazonEC2.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeVpcEndpointsResult describeVpcEndpoints() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Checks whether you have the required permissions for the provided
     * AmazonEC2 operation, without actually running it. The returned
     * DryRunResult object contains the information of whether the dry-run was
     * successful. This method will throw exception when the service response
     * does not clearly indicate whether you have the permission.
     *
     * @param request
     *            The request object for any AmazonEC2 operation suppored with
     *            dry-run.
     *
     * @return A DryRunResult object that contains the information of whether
     *         the dry-run was successful.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client
     *             while attempting to make the request or handle the response.
     *             Or if the service response does not clearly indicate whether
     *             you have the permission.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonEC2 indicating
     *             either a problem with the data in the request, or a server
     *             side issue.
     */
    public <X extends AmazonWebServiceRequest> DryRunResult<X> dryRun(DryRunSupportedRequest<X> request) throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        