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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.RunInstancesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#runInstances(RunInstancesRequest) RunInstances operation}.
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
 * [EC2-VPC only accounts] If you don't specify a subnet in the request,
 * we choose a default subnet from your default VPC for you.
 * </p>
 * <p>
 * [EC2-Classic accounts] If you're launching into EC2-Classic and you
 * don't specify an Availability Zone, we choose one for you.
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
 * @see com.amazonaws.services.ec2.AmazonEC2#runInstances(RunInstancesRequest)
 */
public class RunInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<RunInstancesRequest> {

    /**
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     */
    private String imageId;

    /**
     * The minimum number of instances to launch. If you specify a minimum
     * that is more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     * Between 1 and the maximum number you're allowed for the specified
     * instance type. For more information about the default limits, and how
     * to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     */
    private Integer minCount;

    /**
     * The maximum number of instances to launch. If you specify more
     * instances than Amazon EC2 can launch in the target Availability Zone,
     * Amazon EC2 launches the largest possible number of instances above
     * <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     * number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase,
     * see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     */
    private Integer maxCount;

    /**
     * The name of the key pair. You can create a key pair using
     * <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     * not specify a key pair, you can't connect to the instance unless you
     * choose an AMI that is configured to allow users another way to log in.
     * </important>
     */
    private String keyName;

    /**
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. <p>Default:
     * Amazon EC2 uses the default security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * One or more security group IDs. You can create a security group using
     * <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     * security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIds;

    /**
     * Data to configure the instance, or a script to run during instance
     * launch. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     * Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     * User Data</a> (Windows). For API calls, the text must be
     * base64-encoded. Command line tools perform encoding for you.
     */
    private String userData;

    /**
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>Default: <code>m1.small</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     */
    private String instanceType;

    /**
     * The placement for the instance.
     */
    private Placement placement;

    /**
     * The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     * instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     */
    private String kernelId;

    /**
     * The ID of the RAM disk. <important> <p>We recommend that you use
     * PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     */
    private String ramdiskId;

    /**
     * The block device mapping.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The monitoring for the instance.
     */
    private Boolean monitoring;

    /**
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     */
    private String subnetId;

    /**
     * If you set this parameter to <code>true</code>, you can't terminate
     * the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     * can. If you set this parameter to <code>true</code> and then later
     * want to be able to terminate the instance, you must first change the
     * value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>.
     * Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the
     * shutdown command from the instance. <p>Default: <code>false</code>
     */
    private Boolean disableApiTermination;

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown). <p>Default: <code>stop</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * [EC2-VPC] The primary IP address. You must specify a value from the IP
     * address range of the subnet. <p>Only one private IP address can be
     * designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     * and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     * address. <p>Default: We select an IP address from the IP address range
     * of the subnet.
     */
    private String privateIpAddress;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     */
    private String clientToken;

    /**
     * Reserved.
     */
    private String additionalInfo;

    /**
     * One or more network interfaces.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfaces;

    /**
     * The IAM instance profile.
     */
    private IamInstanceProfileSpecification iamInstanceProfile;

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     */
    private Boolean ebsOptimized;

    /**
     * Default constructor for a new RunInstancesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RunInstancesRequest() {}
    
    /**
     * Constructs a new RunInstancesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId The ID of the AMI, which you can get by calling
     * <a>DescribeImages</a>.
     * @param minCount The minimum number of instances to launch. If you
     * specify a minimum that is more instances than Amazon EC2 can launch in
     * the target Availability Zone, Amazon EC2 launches no instances.
     * <p>Constraints: Between 1 and the maximum number you're allowed for
     * the specified instance type. For more information about the default
     * limits, and how to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * @param maxCount The maximum number of instances to launch. If you
     * specify more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches the largest possible number of
     * instances above <code>MinCount</code>. <p>Constraints: Between 1 and
     * the maximum number you're allowed for the specified instance type. For
     * more information about the default limits, and how to request an
     * increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     */
    public RunInstancesRequest(String imageId, Integer minCount, Integer maxCount) {
        setImageId(imageId);
        setMinCount(minCount);
        setMaxCount(maxCount);
    }

    /**
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     *
     * @return The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     *
     * @param imageId The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI, which you can get by calling <a>DescribeImages</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The minimum number of instances to launch. If you specify a minimum
     * that is more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     * Between 1 and the maximum number you're allowed for the specified
     * instance type. For more information about the default limits, and how
     * to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     *
     * @return The minimum number of instances to launch. If you specify a minimum
     *         that is more instances than Amazon EC2 can launch in the target
     *         Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     *         Between 1 and the maximum number you're allowed for the specified
     *         instance type. For more information about the default limits, and how
     *         to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     *         many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     *         FAQ.
     */
    public Integer getMinCount() {
        return minCount;
    }
    
    /**
     * The minimum number of instances to launch. If you specify a minimum
     * that is more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     * Between 1 and the maximum number you're allowed for the specified
     * instance type. For more information about the default limits, and how
     * to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     *
     * @param minCount The minimum number of instances to launch. If you specify a minimum
     *         that is more instances than Amazon EC2 can launch in the target
     *         Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     *         Between 1 and the maximum number you're allowed for the specified
     *         instance type. For more information about the default limits, and how
     *         to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     *         many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     *         FAQ.
     */
    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }
    
    /**
     * The minimum number of instances to launch. If you specify a minimum
     * that is more instances than Amazon EC2 can launch in the target
     * Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     * Between 1 and the maximum number you're allowed for the specified
     * instance type. For more information about the default limits, and how
     * to request an increase, see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minCount The minimum number of instances to launch. If you specify a minimum
     *         that is more instances than Amazon EC2 can launch in the target
     *         Availability Zone, Amazon EC2 launches no instances. <p>Constraints:
     *         Between 1 and the maximum number you're allowed for the specified
     *         instance type. For more information about the default limits, and how
     *         to request an increase, see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     *         many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     *         FAQ.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * The maximum number of instances to launch. If you specify more
     * instances than Amazon EC2 can launch in the target Availability Zone,
     * Amazon EC2 launches the largest possible number of instances above
     * <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     * number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase,
     * see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     *
     * @return The maximum number of instances to launch. If you specify more
     *         instances than Amazon EC2 can launch in the target Availability Zone,
     *         Amazon EC2 launches the largest possible number of instances above
     *         <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     *         number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase,
     *         see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     *         many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     *         FAQ.
     */
    public Integer getMaxCount() {
        return maxCount;
    }
    
    /**
     * The maximum number of instances to launch. If you specify more
     * instances than Amazon EC2 can launch in the target Availability Zone,
     * Amazon EC2 launches the largest possible number of instances above
     * <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     * number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase,
     * see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     *
     * @param maxCount The maximum number of instances to launch. If you specify more
     *         instances than Amazon EC2 can launch in the target Availability Zone,
     *         Amazon EC2 launches the largest possible number of instances above
     *         <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     *         number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase,
     *         see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     *         many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     *         FAQ.
     */
    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }
    
    /**
     * The maximum number of instances to launch. If you specify more
     * instances than Amazon EC2 can launch in the target Availability Zone,
     * Amazon EC2 launches the largest possible number of instances above
     * <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     * number you're allowed for the specified instance type. For more
     * information about the default limits, and how to request an increase,
     * see <a
     * href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     * many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     * FAQ.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxCount The maximum number of instances to launch. If you specify more
     *         instances than Amazon EC2 can launch in the target Availability Zone,
     *         Amazon EC2 launches the largest possible number of instances above
     *         <code>MinCount</code>. <p>Constraints: Between 1 and the maximum
     *         number you're allowed for the specified instance type. For more
     *         information about the default limits, and how to request an increase,
     *         see <a
     *         href="http://aws.amazon.com/ec2/faqs/#How_many_instances_can_I_run_in_Amazon_EC2">How
     *         many instances can I run in Amazon EC2</a> in the Amazon EC2 General
     *         FAQ.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * The name of the key pair. You can create a key pair using
     * <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     * not specify a key pair, you can't connect to the instance unless you
     * choose an AMI that is configured to allow users another way to log in.
     * </important>
     *
     * @return The name of the key pair. You can create a key pair using
     *         <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     *         not specify a key pair, you can't connect to the instance unless you
     *         choose an AMI that is configured to allow users another way to log in.
     *         </important>
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair. You can create a key pair using
     * <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     * not specify a key pair, you can't connect to the instance unless you
     * choose an AMI that is configured to allow users another way to log in.
     * </important>
     *
     * @param keyName The name of the key pair. You can create a key pair using
     *         <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     *         not specify a key pair, you can't connect to the instance unless you
     *         choose an AMI that is configured to allow users another way to log in.
     *         </important>
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair. You can create a key pair using
     * <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     * not specify a key pair, you can't connect to the instance unless you
     * choose an AMI that is configured to allow users another way to log in.
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair. You can create a key pair using
     *         <a>CreateKeyPair</a> or <a>ImportKeyPair</a>. <important> <p>If you do
     *         not specify a key pair, you can't connect to the instance unless you
     *         choose an AMI that is configured to allow users another way to log in.
     *         </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. <p>Default:
     * Amazon EC2 uses the default security group.
     *
     * @return [EC2-Classic, default VPC] One or more security group names. For a
     *         nondefault VPC, you must use security group IDs instead. <p>Default:
     *         Amazon EC2 uses the default security group.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. <p>Default:
     * Amazon EC2 uses the default security group.
     *
     * @param securityGroups [EC2-Classic, default VPC] One or more security group names. For a
     *         nondefault VPC, you must use security group IDs instead. <p>Default:
     *         Amazon EC2 uses the default security group.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. <p>Default:
     * Amazon EC2 uses the default security group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroups(java.util.Collection)} or {@link
     * #withSecurityGroups(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups [EC2-Classic, default VPC] One or more security group names. For a
     *         nondefault VPC, you must use security group IDs instead. <p>Default:
     *         Amazon EC2 uses the default security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * [EC2-Classic, default VPC] One or more security group names. For a
     * nondefault VPC, you must use security group IDs instead. <p>Default:
     * Amazon EC2 uses the default security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups [EC2-Classic, default VPC] One or more security group names. For a
     *         nondefault VPC, you must use security group IDs instead. <p>Default:
     *         Amazon EC2 uses the default security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }

    /**
     * One or more security group IDs. You can create a security group using
     * <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     * security group.
     *
     * @return One or more security group IDs. You can create a security group using
     *         <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     *         security group.
     */
    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
              securityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroupIds.setAutoConstruct(true);
        }
        return securityGroupIds;
    }
    
    /**
     * One or more security group IDs. You can create a security group using
     * <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     * security group.
     *
     * @param securityGroupIds One or more security group IDs. You can create a security group using
     *         <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     *         security group.
     */
    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
        securityGroupIdsCopy.addAll(securityGroupIds);
        this.securityGroupIds = securityGroupIdsCopy;
    }
    
    /**
     * One or more security group IDs. You can create a security group using
     * <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     * security group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSecurityGroupIds(java.util.Collection)} or {@link
     * #withSecurityGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds One or more security group IDs. You can create a security group using
     *         <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     *         security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withSecurityGroupIds(String... securityGroupIds) {
        if (getSecurityGroupIds() == null) setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        for (String value : securityGroupIds) {
            getSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group IDs. You can create a security group using
     * <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     * security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroupIds One or more security group IDs. You can create a security group using
     *         <a>CreateSecurityGroup</a>. <p>Default: Amazon EC2 uses the default
     *         security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(securityGroupIds.size());
            securityGroupIdsCopy.addAll(securityGroupIds);
            this.securityGroupIds = securityGroupIdsCopy;
        }

        return this;
    }

    /**
     * Data to configure the instance, or a script to run during instance
     * launch. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     * Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     * User Data</a> (Windows). For API calls, the text must be
     * base64-encoded. Command line tools perform encoding for you.
     *
     * @return Data to configure the instance, or a script to run during instance
     *         launch. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     *         Commands on Your Linux Instance at Launch</a> (Linux) and <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     *         User Data</a> (Windows). For API calls, the text must be
     *         base64-encoded. Command line tools perform encoding for you.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * Data to configure the instance, or a script to run during instance
     * launch. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     * Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     * User Data</a> (Windows). For API calls, the text must be
     * base64-encoded. Command line tools perform encoding for you.
     *
     * @param userData Data to configure the instance, or a script to run during instance
     *         launch. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     *         Commands on Your Linux Instance at Launch</a> (Linux) and <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     *         User Data</a> (Windows). For API calls, the text must be
     *         base64-encoded. Command line tools perform encoding for you.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * Data to configure the instance, or a script to run during instance
     * launch. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     * Commands on Your Linux Instance at Launch</a> (Linux) and <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     * User Data</a> (Windows). For API calls, the text must be
     * base64-encoded. Command line tools perform encoding for you.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData Data to configure the instance, or a script to run during instance
     *         launch. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/user-data.html">Running
     *         Commands on Your Linux Instance at Launch</a> (Linux) and <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/ec2-instance-metadata.html#instancedata-add-user-data">Adding
     *         User Data</a> (Windows). For API calls, the text must be
     *         base64-encoded. Command line tools perform encoding for you.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>Default: <code>m1.small</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @return The instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         <p>Default: <code>m1.small</code>
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>Default: <code>m1.small</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         <p>Default: <code>m1.small</code>
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>Default: <code>m1.small</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         <p>Default: <code>m1.small</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public RunInstancesRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>Default: <code>m1.small</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         <p>Default: <code>m1.small</code>
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>Default: <code>m1.small</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         <p>Default: <code>m1.small</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public RunInstancesRequest withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * The placement for the instance.
     *
     * @return The placement for the instance.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * The placement for the instance.
     *
     * @param placement The placement for the instance.
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    
    /**
     * The placement for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The placement for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     * instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     *
     * @return The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     *         instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     *         PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </important>
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     * instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     *
     * @param kernelId The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     *         instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     *         PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </important>
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     * instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The ID of the kernel. <important> <p>We recommend that you use PV-GRUB
     *         instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     *         PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ID of the RAM disk. <important> <p>We recommend that you use
     * PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     *
     * @return The ID of the RAM disk. <important> <p>We recommend that you use
     *         PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     *         PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </important>
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk. <important> <p>We recommend that you use
     * PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     *
     * @param ramdiskId The ID of the RAM disk. <important> <p>We recommend that you use
     *         PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     *         PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </important>
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk. <important> <p>We recommend that you use
     * PV-GRUB instead of kernels and RAM disks. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     * PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ID of the RAM disk. <important> <p>We recommend that you use
     *         PV-GRUB instead of kernels and RAM disks. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedkernels.html">
     *         PV-GRUB</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *         </important>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * The block device mapping.
     *
     * @return The block device mapping.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * The block device mapping.
     *
     * @param blockDeviceMappings The block device mapping.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * The block device mapping.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setBlockDeviceMappings(java.util.Collection)} or
     * {@link #withBlockDeviceMappings(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The block device mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * The block device mapping.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The block device mapping.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * The monitoring for the instance.
     *
     * @return The monitoring for the instance.
     */
    public Boolean isMonitoring() {
        return monitoring;
    }
    
    /**
     * The monitoring for the instance.
     *
     * @param monitoring The monitoring for the instance.
     */
    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * The monitoring for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring The monitoring for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * The monitoring for the instance.
     *
     * @return The monitoring for the instance.
     */
    public Boolean getMonitoring() {
        return monitoring;
    }

    /**
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     *
     * @return [EC2-VPC] The ID of the subnet to launch the instance into.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     *
     * @param subnetId [EC2-VPC] The ID of the subnet to launch the instance into.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * [EC2-VPC] The ID of the subnet to launch the instance into.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId [EC2-VPC] The ID of the subnet to launch the instance into.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * If you set this parameter to <code>true</code>, you can't terminate
     * the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     * can. If you set this parameter to <code>true</code> and then later
     * want to be able to terminate the instance, you must first change the
     * value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>.
     * Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the
     * shutdown command from the instance. <p>Default: <code>false</code>
     *
     * @return If you set this parameter to <code>true</code>, you can't terminate
     *         the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     *         can. If you set this parameter to <code>true</code> and then later
     *         want to be able to terminate the instance, you must first change the
     *         value of the <code>disableApiTermination</code> attribute to
     *         <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *         Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to
     *         <code>terminate</code>, you can terminate the instance by running the
     *         shutdown command from the instance. <p>Default: <code>false</code>
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * If you set this parameter to <code>true</code>, you can't terminate
     * the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     * can. If you set this parameter to <code>true</code> and then later
     * want to be able to terminate the instance, you must first change the
     * value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>.
     * Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the
     * shutdown command from the instance. <p>Default: <code>false</code>
     *
     * @param disableApiTermination If you set this parameter to <code>true</code>, you can't terminate
     *         the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     *         can. If you set this parameter to <code>true</code> and then later
     *         want to be able to terminate the instance, you must first change the
     *         value of the <code>disableApiTermination</code> attribute to
     *         <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *         Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to
     *         <code>terminate</code>, you can terminate the instance by running the
     *         shutdown command from the instance. <p>Default: <code>false</code>
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * If you set this parameter to <code>true</code>, you can't terminate
     * the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     * can. If you set this parameter to <code>true</code> and then later
     * want to be able to terminate the instance, you must first change the
     * value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>.
     * Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the
     * shutdown command from the instance. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination If you set this parameter to <code>true</code>, you can't terminate
     *         the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     *         can. If you set this parameter to <code>true</code> and then later
     *         want to be able to terminate the instance, you must first change the
     *         value of the <code>disableApiTermination</code> attribute to
     *         <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *         Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to
     *         <code>terminate</code>, you can terminate the instance by running the
     *         shutdown command from the instance. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * If you set this parameter to <code>true</code>, you can't terminate
     * the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     * can. If you set this parameter to <code>true</code> and then later
     * want to be able to terminate the instance, you must first change the
     * value of the <code>disableApiTermination</code> attribute to
     * <code>false</code> using <a>ModifyInstanceAttribute</a>.
     * Alternatively, if you set
     * <code>InstanceInitiatedShutdownBehavior</code> to
     * <code>terminate</code>, you can terminate the instance by running the
     * shutdown command from the instance. <p>Default: <code>false</code>
     *
     * @return If you set this parameter to <code>true</code>, you can't terminate
     *         the instance using the Amazon EC2 console, CLI, or API; otherwise, you
     *         can. If you set this parameter to <code>true</code> and then later
     *         want to be able to terminate the instance, you must first change the
     *         value of the <code>disableApiTermination</code> attribute to
     *         <code>false</code> using <a>ModifyInstanceAttribute</a>.
     *         Alternatively, if you set
     *         <code>InstanceInitiatedShutdownBehavior</code> to
     *         <code>terminate</code>, you can terminate the instance by running the
     *         shutdown command from the instance. <p>Default: <code>false</code>
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown). <p>Default: <code>stop</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @return Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown). <p>Default: <code>stop</code>
     *
     * @see ShutdownBehavior
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown). <p>Default: <code>stop</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown). <p>Default: <code>stop</code>
     *
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown). <p>Default: <code>stop</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown). <p>Default: <code>stop</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ShutdownBehavior
     */
    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown). <p>Default: <code>stop</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown). <p>Default: <code>stop</code>
     *
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown). <p>Default: <code>stop</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown). <p>Default: <code>stop</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ShutdownBehavior
     */
    public RunInstancesRequest withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * [EC2-VPC] The primary IP address. You must specify a value from the IP
     * address range of the subnet. <p>Only one private IP address can be
     * designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     * and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     * address. <p>Default: We select an IP address from the IP address range
     * of the subnet.
     *
     * @return [EC2-VPC] The primary IP address. You must specify a value from the IP
     *         address range of the subnet. <p>Only one private IP address can be
     *         designated as primary. Therefore, you can't specify this parameter if
     *         <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     *         and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     *         address. <p>Default: We select an IP address from the IP address range
     *         of the subnet.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * [EC2-VPC] The primary IP address. You must specify a value from the IP
     * address range of the subnet. <p>Only one private IP address can be
     * designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     * and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     * address. <p>Default: We select an IP address from the IP address range
     * of the subnet.
     *
     * @param privateIpAddress [EC2-VPC] The primary IP address. You must specify a value from the IP
     *         address range of the subnet. <p>Only one private IP address can be
     *         designated as primary. Therefore, you can't specify this parameter if
     *         <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     *         and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     *         address. <p>Default: We select an IP address from the IP address range
     *         of the subnet.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * [EC2-VPC] The primary IP address. You must specify a value from the IP
     * address range of the subnet. <p>Only one private IP address can be
     * designated as primary. Therefore, you can't specify this parameter if
     * <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     * and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     * address. <p>Default: We select an IP address from the IP address range
     * of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress [EC2-VPC] The primary IP address. You must specify a value from the IP
     *         address range of the subnet. <p>Only one private IP address can be
     *         designated as primary. Therefore, you can't specify this parameter if
     *         <code>PrivateIpAddresses.n.Primary</code> is set to <code>true</code>
     *         and <code>PrivateIpAddresses.n.PrivateIpAddress</code> is set to an IP
     *         address. <p>Default: We select an IP address from the IP address range
     *         of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>. <p>Constraints: Maximum 64 ASCII characters
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * Reserved.
     *
     * @return Reserved.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * Reserved.
     *
     * @param additionalInfo Reserved.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * Reserved.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalInfo Reserved.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * One or more network interfaces.
     *
     * @return One or more network interfaces.
     */
    public java.util.List<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        if (networkInterfaces == null) {
              networkInterfaces = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>();
              networkInterfaces.setAutoConstruct(true);
        }
        return networkInterfaces;
    }
    
    /**
     * One or more network interfaces.
     *
     * @param networkInterfaces One or more network interfaces.
     */
    public void setNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
        networkInterfacesCopy.addAll(networkInterfaces);
        this.networkInterfaces = networkInterfacesCopy;
    }
    
    /**
     * One or more network interfaces.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNetworkInterfaces(java.util.Collection)} or
     * {@link #withNetworkInterfaces(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces One or more network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withNetworkInterfaces(InstanceNetworkInterfaceSpecification... networkInterfaces) {
        if (getNetworkInterfaces() == null) setNetworkInterfaces(new java.util.ArrayList<InstanceNetworkInterfaceSpecification>(networkInterfaces.length));
        for (InstanceNetworkInterfaceSpecification value : networkInterfaces) {
            getNetworkInterfaces().add(value);
        }
        return this;
    }
    
    /**
     * One or more network interfaces.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaces One or more network interfaces.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withNetworkInterfaces(java.util.Collection<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification> networkInterfacesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceNetworkInterfaceSpecification>(networkInterfaces.size());
            networkInterfacesCopy.addAll(networkInterfaces);
            this.networkInterfaces = networkInterfacesCopy;
        }

        return this;
    }

    /**
     * The IAM instance profile.
     *
     * @return The IAM instance profile.
     */
    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * The IAM instance profile.
     *
     * @param iamInstanceProfile The IAM instance profile.
     */
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * The IAM instance profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamInstanceProfile The IAM instance profile.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     *
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RunInstancesRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS-optimized instance. <p>Default:
     * <code>false</code>
     *
     * @return Indicates whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS-optimized instance. <p>Default:
     *         <code>false</code>
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<RunInstancesRequest> getDryRunRequest() {
        Request<RunInstancesRequest> request = new RunInstancesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getMinCount() != null) sb.append("MinCount: " + getMinCount() + ",");
        if (getMaxCount() != null) sb.append("MaxCount: " + getMaxCount() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSecurityGroupIds() != null) sb.append("SecurityGroupIds: " + getSecurityGroupIds() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (isMonitoring() != null) sb.append("Monitoring: " + isMonitoring() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (isDisableApiTermination() != null) sb.append("DisableApiTermination: " + isDisableApiTermination() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null) sb.append("InstanceInitiatedShutdownBehavior: " + getInstanceInitiatedShutdownBehavior() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getNetworkInterfaces() != null) sb.append("NetworkInterfaces: " + getNetworkInterfaces() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isMonitoring() == null) ? 0 : isMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((isDisableApiTermination() == null) ? 0 : isDisableApiTermination().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RunInstancesRequest == false) return false;
        RunInstancesRequest other = (RunInstancesRequest)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getMinCount() == null ^ this.getMinCount() == null) return false;
        if (other.getMinCount() != null && other.getMinCount().equals(this.getMinCount()) == false) return false; 
        if (other.getMaxCount() == null ^ this.getMaxCount() == null) return false;
        if (other.getMaxCount() != null && other.getMaxCount().equals(this.getMaxCount()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null) return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.isMonitoring() == null ^ this.isMonitoring() == null) return false;
        if (other.isMonitoring() != null && other.isMonitoring().equals(this.isMonitoring()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.isDisableApiTermination() == null ^ this.isDisableApiTermination() == null) return false;
        if (other.isDisableApiTermination() != null && other.isDisableApiTermination().equals(this.isDisableApiTermination()) == false) return false; 
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null) return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null) return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        return true;
    }
    
    @Override
    public RunInstancesRequest clone() {
        
            return (RunInstancesRequest) super.clone();
    }

}
    