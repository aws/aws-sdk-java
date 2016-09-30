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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RunInstancesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for RunInstances.
 * </p>
 */
public class RunInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RunInstancesRequest> {

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     */
    private Integer minCount;
    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     */
    private Integer maxCount;
    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     */
    private String keyName;
    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroups;
    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is performed
     * for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
     * </p>
     */
    private String userData;
    /**
     * <p>
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The placement for the instance.
     * </p>
     */
    private Placement placement;
    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String kernelId;
    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     */
    private String ramdiskId;
    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     */
    private Boolean monitoring;
    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later want to be able to
     * terminate the instance, you must first change the value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance by
     * running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean disableApiTermination;
    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     * <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     * </p>
     * <p>
     * You cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * Default: We select an IP address from the IP address range of the subnet.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String additionalInfo;
    /**
     * <p>
     * One or more network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> networkInterfaces;
    /**
     * <p>
     * The IAM instance profile.
     * </p>
     */
    private IamInstanceProfileSpecification iamInstanceProfile;
    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * Default constructor for RunInstancesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RunInstancesRequest() {
    }

    /**
     * Constructs a new RunInstancesRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * @param minCount
     *        The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2
     *        can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     * @param maxCount
     *        The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the
     *        target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *        <code>MinCount</code>.
     *        </p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 FAQ.
     */
    public RunInstancesRequest(String imageId, Integer minCount, Integer maxCount) {
        setImageId(imageId);
        setMinCount(minCount);
        setMaxCount(maxCount);
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * </p>
     * 
     * @return The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     * 
     * @param minCount
     *        The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2
     *        can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     */

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     * 
     * @return The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon
     *         EC2 can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *         <p>
     *         Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can
     *         I run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     */

    public Integer getMinCount() {
        return this.minCount;
    }

    /**
     * <p>
     * The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2 can
     * launch in the target Availability Zone, Amazon EC2 launches no instances.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 General FAQ.
     * </p>
     * 
     * @param minCount
     *        The minimum number of instances to launch. If you specify a minimum that is more instances than Amazon EC2
     *        can launch in the target Availability Zone, Amazon EC2 launches no instances.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 General FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withMinCount(Integer minCount) {
        setMinCount(minCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the
     *        target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *        <code>MinCount</code>.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 FAQ.
     */

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * 
     * @return The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in
     *         the target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *         <code>MinCount</code>.</p>
     *         <p>
     *         Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can
     *         I run in Amazon EC2</a> in the Amazon EC2 FAQ.
     */

    public Integer getMaxCount() {
        return this.maxCount;
    }

    /**
     * <p>
     * The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of instances above <code>MinCount</code>.
     * </p>
     * <p>
     * Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I run in
     * Amazon EC2</a> in the Amazon EC2 FAQ.
     * </p>
     * 
     * @param maxCount
     *        The maximum number of instances to launch. If you specify more instances than Amazon EC2 can launch in the
     *        target Availability Zone, Amazon EC2 launches the largest possible number of instances above
     *        <code>MinCount</code>.</p>
     *        <p>
     *        Constraints: Between 1 and the maximum number you're allowed for the specified instance type. For more
     *        information about the default limits, and how to request an increase, see <a
     *        href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How many instances can I
     *        run in Amazon EC2</a> in the Amazon EC2 FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withMaxCount(Integer maxCount) {
        setMaxCount(maxCount);
        return this;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     * 
     * @param keyName
     *        The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or
     *        <a>ImportKeyPair</a>.</p> <important>
     *        <p>
     *        If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is
     *        configured to allow users another way to log in.
     *        </p>
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     * 
     * @return The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or
     *         <a>ImportKeyPair</a>.</p> <important>
     *         <p>
     *         If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is
     *         configured to allow users another way to log in.
     *         </p>
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or <a>ImportKeyPair</a>.
     * </p>
     * <important>
     * <p>
     * If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is configured
     * to allow users another way to log in.
     * </p>
     * </important>
     * 
     * @param keyName
     *        The name of the key pair. You can create a key pair using <a>CreateKeyPair</a> or
     *        <a>ImportKeyPair</a>.</p> <important>
     *        <p>
     *        If you do not specify a key pair, you can't connect to the instance unless you choose an AMI that is
     *        configured to allow users another way to log in.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @return [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *         group IDs instead.</p>
     *         <p>
     *         Default: Amazon EC2 uses the default security group.
     */

    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroups;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *        group IDs instead.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new com.amazonaws.internal.SdkInternalList<String>(securityGroups);
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *        group IDs instead.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security group
     * IDs instead.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @param securityGroups
     *        [EC2-Classic, default VPC] One or more security group names. For a nondefault VPC, you must use security
     *        group IDs instead.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @return One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *         <p>
     *         Default: Amazon EC2 uses the default security group.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.
     * </p>
     * <p>
     * Default: Amazon EC2 uses the default security group.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security group IDs. You can create a security group using <a>CreateSecurityGroup</a>.</p>
     *        <p>
     *        Default: Amazon EC2 uses the default security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is performed
     * for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *        Instance at Launch</a> (Linux) and <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *        >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is
     *        performed for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
     */

    public void setUserData(String userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is performed
     * for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
     * </p>
     * 
     * @return The user data to make available to the instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *         Instance at Launch</a> (Linux) and <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *         >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is
     *         performed for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded
     *         text.
     */

    public String getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The user data to make available to the instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux Instance
     * at Launch</a> (Linux) and <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     * >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is performed
     * for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
     * </p>
     * 
     * @param userData
     *        The user data to make available to the instance. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running Commands on Your Linux
     *        Instance at Launch</a> (Linux) and <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data"
     *        >Adding User Data</a> (Windows). If you are using an AWS SDK or command line tool, Base64-encoding is
     *        performed for you, and you can load the text from a file. Otherwise, you must provide Base64-encoded text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withUserData(String userData) {
        setUserData(userData);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @return The instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *         <p>
     *         Default: <code>m1.small</code>
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RunInstancesRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }

    /**
     * <p>
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * Default: <code>m1.small</code>
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance Types</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.</p>
     *        <p>
     *        Default: <code>m1.small</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public RunInstancesRequest withInstanceType(InstanceType instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @param placement
     *        The placement for the instance.
     */

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @return The placement for the instance.
     */

    public Placement getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement for the instance.
     * </p>
     * 
     * @param placement
     *        The placement for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withPlacement(Placement placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param kernelId
     *        The ID of the kernel.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @return The ID of the kernel.</p> <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The ID of the kernel.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param kernelId
     *        The ID of the kernel.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @return The ID of the RAM disk.</p> <important>
     *         <p>
     *         We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </p>
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The ID of the RAM disk.
     * </p>
     * <important>
     * <p>
     * We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the <i>Amazon
     * Elastic Compute Cloud User Guide</i>.
     * </p>
     * </important>
     * 
     * @param ramdiskId
     *        The ID of the RAM disk.</p> <important>
     *        <p>
     *        We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html"> PV-GRUB</a> in the
     *        <i>Amazon Elastic Compute Cloud User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * 
     * @return The block device mapping.</p> <important>
     *         <p>
     *         Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *         error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *         snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *         status cannot be changed using this action.
     *         </p>
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * 
     * @param blockDeviceMappings
     *        The block device mapping.</p> <important>
     *        <p>
     *        Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *        error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *        snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *        status cannot be changed using this action.
     *        </p>
     */

    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        The block device mapping.</p> <important>
     *        <p>
     *        Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *        error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *        snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *        status cannot be changed using this action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (BlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The block device mapping.
     * </p>
     * <important>
     * <p>
     * Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an error.
     * This is because only blank volumes can be encrypted on start, and these are not created from a snapshot. If a
     * snapshot is the basis for the volume, it contains data by definition and its encryption status cannot be changed
     * using this action.
     * </p>
     * </important>
     * 
     * @param blockDeviceMappings
     *        The block device mapping.</p> <important>
     *        <p>
     *        Supplying both a snapshot ID and an encryption value as arguments for block-device mapping results in an
     *        error. This is because only blank volumes can be encrypted on start, and these are not created from a
     *        snapshot. If a snapshot is the basis for the volume, it contains data by definition and its encryption
     *        status cannot be changed using this action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring for the instance.
     */

    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public Boolean getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @param monitoring
     *        The monitoring for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withMonitoring(Boolean monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * The monitoring for the instance.
     * </p>
     * 
     * @return The monitoring for the instance.
     */

    public Boolean isMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet to launch the instance into.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the subnet to launch the instance into.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet to launch the instance into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later want to be able to
     * terminate the instance, you must first change the value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance by
     * running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param disableApiTermination
     *        If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *        console, CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later
     *        want to be able to terminate the instance, you must first change the value of the
     *        <code>disableApiTermination</code> attribute to <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *        Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you
     *        can terminate the instance by running the shutdown command from the instance.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later want to be able to
     * terminate the instance, you must first change the value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance by
     * running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *         console, CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later
     *         want to be able to terminate the instance, you must first change the value of the
     *         <code>disableApiTermination</code> attribute to <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *         Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you
     *         can terminate the instance by running the shutdown command from the instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later want to be able to
     * terminate the instance, you must first change the value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance by
     * running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param disableApiTermination
     *        If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *        console, CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later
     *        want to be able to terminate the instance, you must first change the value of the
     *        <code>disableApiTermination</code> attribute to <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *        Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you
     *        can terminate the instance by running the shutdown command from the instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withDisableApiTermination(Boolean disableApiTermination) {
        setDisableApiTermination(disableApiTermination);
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2 console,
     * CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later want to be able to
     * terminate the instance, you must first change the value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>. Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you can terminate the instance by
     * running the shutdown command from the instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, you can't terminate the instance using the Amazon EC2
     *         console, CLI, or API; otherwise, you can. If you set this parameter to <code>true</code> and then later
     *         want to be able to terminate the instance, you must first change the value of the
     *         <code>disableApiTermination</code> attribute to <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *         Alternatively, if you set <code>InstanceInitiatedShutdownBehavior</code> to <code>terminate</code>, you
     *         can terminate the instance by running the shutdown command from the instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isDisableApiTermination() {
        return this.disableApiTermination;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @return Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *         operating system command for system shutdown).</p>
     *         <p>
     *         Default: <code>stop</code>
     * @see ShutdownBehavior
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * <p>
     * Default: <code>stop</code>
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).</p>
     *        <p>
     *        Default: <code>stop</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     * <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     * </p>
     * <p>
     * You cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * Default: We select an IP address from the IP address range of the subnet.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.</p>
     *        <p>
     *        Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     *        <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     *        <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     *        </p>
     *        <p>
     *        You cannot specify this option if you're launching more than one instance in the request.
     *        </p>
     *        <p>
     *        Default: We select an IP address from the IP address range of the subnet.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     * <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     * </p>
     * <p>
     * You cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * Default: We select an IP address from the IP address range of the subnet.
     * </p>
     * 
     * @return [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.</p>
     *         <p>
     *         Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     *         <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     *         <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     *         </p>
     *         <p>
     *         You cannot specify this option if you're launching more than one instance in the request.
     *         </p>
     *         <p>
     *         Default: We select an IP address from the IP address range of the subnet.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.
     * </p>
     * <p>
     * Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     * <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     * </p>
     * <p>
     * You cannot specify this option if you're launching more than one instance in the request.
     * </p>
     * <p>
     * Default: We select an IP address from the IP address range of the subnet.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] The primary IP address. You must specify a value from the IP address range of the subnet.</p>
     *        <p>
     *        Only one private IP address can be designated as primary. Therefore, you can't specify this parameter if
     *        <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code> and
     *        <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP address.
     *        </p>
     *        <p>
     *        You cannot specify this option if you're launching more than one instance in the request.
     *        </p>
     *        <p>
     *        Default: We select an IP address from the IP address range of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Maximum 64 ASCII characters
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.</p>
     *         <p>
     *         Constraints: Maximum 64 ASCII characters
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * <p>
     * Constraints: Maximum 64 ASCII characters
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.</p>
     *        <p>
     *        Constraints: Maximum 64 ASCII characters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @return One or more network interfaces.
     */

    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
            networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>();
        }
        return networkInterfaces;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     */

    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>(networkInterfaces);
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        }
        for (InstanceNetworkInterfaceSpecification ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interfaces.
     * </p>
     * 
     * @param networkInterfaces
     *        One or more network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile.
     */

    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @return The IAM instance profile.
     */

    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * <p>
     * The IAM instance profile.
     * </p>
     * 
     * @param iamInstanceProfile
     *        The IAM instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        setIamInstanceProfile(iamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an
     *        EBS-optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *         to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *         optimization isn't available with all instance types. Additional usage charges apply when using an
     *         EBS-optimized instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param ebsOptimized
     *        Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *        to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *        optimization isn't available with all instance types. Additional usage charges apply when using an
     *        EBS-optimized instance.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesRequest withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to
     * Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't
     * available with all instance types. Additional usage charges apply when using an EBS-optimized instance.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput
     *         to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This
     *         optimization isn't available with all instance types. Additional usage charges apply when using an
     *         EBS-optimized instance.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RunInstancesRequest> getDryRunRequest() {
        Request<RunInstancesRequest> request = new RunInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getMinCount() != null)
            sb.append("MinCount: " + getMinCount() + ",");
        if (getMaxCount() != null)
            sb.append("MaxCount: " + getMaxCount() + ",");
        if (getKeyName() != null)
            sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getUserData() != null)
            sb.append("UserData: " + getUserData() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null)
            sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getMonitoring() != null)
            sb.append("Monitoring: " + getMonitoring() + ",");
        if (getSubnetId() != null)
            sb.append("SubnetId: " + getSubnetId() + ",");
        if (getDisableApiTermination() != null)
            sb.append("DisableApiTermination: " + getDisableApiTermination() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: " + getInstanceInitiatedShutdownBehavior() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null)
            sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunInstancesRequest == false)
            return false;
        RunInstancesRequest other = (RunInstancesRequest) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getMinCount() == null ^ this.getMinCount() == null)
            return false;
        if (other.getMinCount() != null && other.getMinCount().equals(this.getMinCount()) == false)
            return false;
        if (other.getMaxCount() == null ^ this.getMaxCount() == null)
            return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getDisableApiTermination() == null ^ this.getDisableApiTermination() == null)
            return false;
        if (other.getDisableApiTermination() != null && other.getDisableApiTermination().equals(this.getDisableApiTermination()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null)
            return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getMinCount() == null) ? 0 : getMinCount().hashCode());
        hashCode = prime * hashCode + ((getMaxCount() == null) ? 0 : getMaxCount().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getDisableApiTermination() == null) ? 0 : getDisableApiTermination().hashCode());
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        return hashCode;
    }

    @Override
    public RunInstancesRequest clone() {
        return (RunInstancesRequest) super.clone();
    }
}
