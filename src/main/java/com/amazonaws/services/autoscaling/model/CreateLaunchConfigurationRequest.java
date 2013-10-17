/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createLaunchConfiguration(CreateLaunchConfigurationRequest) CreateLaunchConfiguration operation}.
 * <p>
 * Creates a new launch configuration. The launch configuration name must be unique within the scope of the client's AWS account. The maximum limit of
 * launch configurations, which by default is 100, must not yet have been met; otherwise, the call will fail. When created, the new launch configuration
 * is available for immediate use.
 * </p>
 * <p>
 * You can create a launch configuration with Amazon EC2 security groups or with Amazon VPC security groups. However, you can't use Amazon EC2 security
 * groups together with Amazon VPC security groups, or vice versa.
 * </p>
 * <p>
 * <b>NOTE:</b> At this time, Auto Scaling launch configurations don't support compressed (e.g. zipped) user data files.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createLaunchConfiguration(CreateLaunchConfigurationRequest)
 */
public class CreateLaunchConfigurationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the launch configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     * launch your EC2 instances. For information about finding Amazon EC2
     * AMIs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String imageId;

    /**
     * The name of the Amazon EC2 key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     * a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String keyName;

    /**
     * The security groups with which to associate Amazon EC2 or Amazon VPC
     * instances. <p>If your instances are launched in EC2, you can either
     * specify Amazon EC2 security group names or the security group IDs. For
     * more information about Amazon EC2 security groups, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. If your instances are launched within VPC, specify Amazon
     * VPC security group IDs. For more information about Amazon VPC security
     * groups, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     * Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The user data to make available to the launched Amazon EC2 instances.
     * For more information about Amazon EC2 user data, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     * Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String userData;

    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String kernelId;

    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String ramdiskId;

    /**
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p> When detailed monitoring is enabled, Amazon
     * Cloudwatch will generate metrics every minute and your account will be
     * charged a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a>. For information about Amazon
     * CloudWatch, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     * CloudWatch Developer Guide</a>.
     */
    private InstanceMonitoring instanceMonitoring;

    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information on
     * launching Spot Instances, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     * Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String spotPrice;

    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For information on launching
     * EC2 instances with an IAM role, go to <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     * Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String iamInstanceProfile;

    /**
     * Whether the instance is optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. By default
     * the instance is not optimized for EBS I/O. For information about
     * EBS-optimized instances, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    private Boolean ebsOptimized;

    /**
     * Used for Auto Scaling groups that launch instances into an Amazon
     * Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     * public IP address to each instance launched in a Amazon VPC. <note>
     * <p>If you specify a value for this parameter, be sure to specify at
     * least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     * you create your Auto Scaling group. </note> <p>Default: If the
     * instance is launched in default VPC, the default is <code>true</code>.
     * If the instance is launched in a nondefault VPC (EC2-VPC), the default
     * is <code>false</code>. For more information about the platforms
     * supported by Auto Scaling, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     * Auto Scaling Configuration</a>.
     */
    private Boolean associatePublicIpAddress;

    /**
     * The name of the launch configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the launch configuration to create.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration to create.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The name of the launch configuration to create.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The name of the launch configuration to create.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     * launch your EC2 instances. For information about finding Amazon EC2
     * AMIs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     *         launch your EC2 instances. For information about finding Amazon EC2
     *         AMIs, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     *         a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     * launch your EC2 instances. For information about finding Amazon EC2
     * AMIs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     *         launch your EC2 instances. For information about finding Amazon EC2
     *         AMIs, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     *         a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     * launch your EC2 instances. For information about finding Amazon EC2
     * AMIs, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     * a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Unique ID of the <i>Amazon Machine Image</i> (AMI) you want to use to
     *         launch your EC2 instances. For information about finding Amazon EC2
     *         AMIs, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/finding-an-ami.html">Finding
     *         a Suitable AMI</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The name of the Amazon EC2 key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     * a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Amazon EC2 key pair. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     *         a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     * a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the Amazon EC2 key pair. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     *         a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     * a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the Amazon EC2 key pair. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/generating-a-keypair.html">Getting
     *         a Key Pair</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The security groups with which to associate Amazon EC2 or Amazon VPC
     * instances. <p>If your instances are launched in EC2, you can either
     * specify Amazon EC2 security group names or the security group IDs. For
     * more information about Amazon EC2 security groups, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. If your instances are launched within VPC, specify Amazon
     * VPC security group IDs. For more information about Amazon VPC security
     * groups, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     * Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return The security groups with which to associate Amazon EC2 or Amazon VPC
     *         instances. <p>If your instances are launched in EC2, you can either
     *         specify Amazon EC2 security group names or the security group IDs. For
     *         more information about Amazon EC2 security groups, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. If your instances are launched within VPC, specify Amazon
     *         VPC security group IDs. For more information about Amazon VPC security
     *         groups, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     *         Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * The security groups with which to associate Amazon EC2 or Amazon VPC
     * instances. <p>If your instances are launched in EC2, you can either
     * specify Amazon EC2 security group names or the security group IDs. For
     * more information about Amazon EC2 security groups, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. If your instances are launched within VPC, specify Amazon
     * VPC security group IDs. For more information about Amazon VPC security
     * groups, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     * Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @param securityGroups The security groups with which to associate Amazon EC2 or Amazon VPC
     *         instances. <p>If your instances are launched in EC2, you can either
     *         specify Amazon EC2 security group names or the security group IDs. For
     *         more information about Amazon EC2 security groups, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. If your instances are launched within VPC, specify Amazon
     *         VPC security group IDs. For more information about Amazon VPC security
     *         groups, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     *         Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
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
     * The security groups with which to associate Amazon EC2 or Amazon VPC
     * instances. <p>If your instances are launched in EC2, you can either
     * specify Amazon EC2 security group names or the security group IDs. For
     * more information about Amazon EC2 security groups, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. If your instances are launched within VPC, specify Amazon
     * VPC security group IDs. For more information about Amazon VPC security
     * groups, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     * Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups with which to associate Amazon EC2 or Amazon VPC
     *         instances. <p>If your instances are launched in EC2, you can either
     *         specify Amazon EC2 security group names or the security group IDs. For
     *         more information about Amazon EC2 security groups, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. If your instances are launched within VPC, specify Amazon
     *         VPC security group IDs. For more information about Amazon VPC security
     *         groups, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     *         Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * The security groups with which to associate Amazon EC2 or Amazon VPC
     * instances. <p>If your instances are launched in EC2, you can either
     * specify Amazon EC2 security group names or the security group IDs. For
     * more information about Amazon EC2 security groups, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>. If your instances are launched within VPC, specify Amazon
     * VPC security group IDs. For more information about Amazon VPC security
     * groups, see <a
     * href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     * Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The security groups with which to associate Amazon EC2 or Amazon VPC
     *         instances. <p>If your instances are launched in EC2, you can either
     *         specify Amazon EC2 security group names or the security group IDs. For
     *         more information about Amazon EC2 security groups, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>. If your instances are launched within VPC, specify Amazon
     *         VPC security group IDs. For more information about Amazon VPC security
     *         groups, see <a
     *         href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">Security
     *         Groups</a> in the <i>Amazon Virtual Private Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
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
     * The user data to make available to the launched Amazon EC2 instances.
     * For more information about Amazon EC2 user data, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     * Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The user data to make available to the launched Amazon EC2 instances.
     *         For more information about Amazon EC2 user data, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     *         Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The user data to make available to the launched Amazon EC2 instances.
     * For more information about Amazon EC2 user data, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     * Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data to make available to the launched Amazon EC2 instances.
     *         For more information about Amazon EC2 user data, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     *         Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The user data to make available to the launched Amazon EC2 instances.
     * For more information about Amazon EC2 user data, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     * Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data to make available to the launched Amazon EC2 instances.
     *         For more information about Amazon EC2 user data, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html#instancedata-user-data-retrieval">User
     *         Data Retrieval</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The instance type of the Amazon EC2 instance. For information about
     *         available Amazon EC2 instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     *         Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     *         User Guide.</i>
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the Amazon EC2 instance. For information about
     *         available Amazon EC2 instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     *         Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     *         User Guide.</i>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type of the Amazon EC2 instance. For information about
     * available Amazon EC2 instance types, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     * Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     * User Guide.</i>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the Amazon EC2 instance. For information about
     *         available Amazon EC2 instance types, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#AvailableInstanceTypes">
     *         Available Instance Types</a> in the <i>Amazon Elastic Cloud Compute
     *         User Guide.</i>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the kernel associated with the Amazon EC2 AMI.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param kernelId The ID of the kernel associated with the Amazon EC2 AMI.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param kernelId The ID of the kernel associated with the Amazon EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the RAM disk associated with the Amazon EC2 AMI.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId The ID of the RAM disk associated with the Amazon EC2 AMI.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId The ID of the RAM disk associated with the Amazon EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @return A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @param blockDeviceMappings A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
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
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p> When detailed monitoring is enabled, Amazon
     * Cloudwatch will generate metrics every minute and your account will be
     * charged a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a>. For information about Amazon
     * CloudWatch, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     * CloudWatch Developer Guide</a>.
     *
     * @return Enables detailed monitoring if it is disabled. Detailed monitoring is
     *         enabled by default. <p> When detailed monitoring is enabled, Amazon
     *         Cloudwatch will generate metrics every minute and your account will be
     *         charged a fee. When you disable detailed monitoring, by specifying
     *         <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     *         Your Auto Scaling Instances</a>. For information about Amazon
     *         CloudWatch, see the <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     *         CloudWatch Developer Guide</a>.
     */
    public InstanceMonitoring getInstanceMonitoring() {
        return instanceMonitoring;
    }
    
    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p> When detailed monitoring is enabled, Amazon
     * Cloudwatch will generate metrics every minute and your account will be
     * charged a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a>. For information about Amazon
     * CloudWatch, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     * CloudWatch Developer Guide</a>.
     *
     * @param instanceMonitoring Enables detailed monitoring if it is disabled. Detailed monitoring is
     *         enabled by default. <p> When detailed monitoring is enabled, Amazon
     *         Cloudwatch will generate metrics every minute and your account will be
     *         charged a fee. When you disable detailed monitoring, by specifying
     *         <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     *         Your Auto Scaling Instances</a>. For information about Amazon
     *         CloudWatch, see the <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     *         CloudWatch Developer Guide</a>.
     */
    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }
    
    /**
     * Enables detailed monitoring if it is disabled. Detailed monitoring is
     * enabled by default. <p> When detailed monitoring is enabled, Amazon
     * Cloudwatch will generate metrics every minute and your account will be
     * charged a fee. When you disable detailed monitoring, by specifying
     * <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     * Your Auto Scaling Instances</a>. For information about Amazon
     * CloudWatch, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     * CloudWatch Developer Guide</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceMonitoring Enables detailed monitoring if it is disabled. Detailed monitoring is
     *         enabled by default. <p> When detailed monitoring is enabled, Amazon
     *         Cloudwatch will generate metrics every minute and your account will be
     *         charged a fee. When you disable detailed monitoring, by specifying
     *         <code>False</code>, Cloudwatch will generate metrics every 5 minutes.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/as-instance-monitoring.html">Monitor
     *         Your Auto Scaling Instances</a>. For information about Amazon
     *         CloudWatch, see the <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/Welcome.html">Amazon
     *         CloudWatch Developer Guide</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
    }

    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information on
     * launching Spot Instances, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     * Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return The maximum hourly price to be paid for any Spot Instance launched to
     *         fulfill the request. Spot Instances are launched when the price you
     *         specify exceeds the current Spot market price. For more information on
     *         launching Spot Instances, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     *         Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information on
     * launching Spot Instances, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     * Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     *         fulfill the request. Spot Instances are launched when the price you
     *         specify exceeds the current Spot market price. For more information on
     *         launching Spot Instances, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     *         Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * The maximum hourly price to be paid for any Spot Instance launched to
     * fulfill the request. Spot Instances are launched when the price you
     * specify exceeds the current Spot market price. For more information on
     * launching Spot Instances, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     * Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice The maximum hourly price to be paid for any Spot Instance launched to
     *         fulfill the request. Spot Instances are launched when the price you
     *         specify exceeds the current Spot market price. For more information on
     *         launching Spot Instances, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US-SpotInstances.html">
     *         Using Auto Scaling to Launch Spot Instances</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For information on launching
     * EC2 instances with an IAM role, go to <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     * Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or the Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance. <p>Amazon EC2 instances
     *         launched with an IAM role will automatically have AWS security
     *         credentials available. You can use IAM roles with Auto Scaling to
     *         automatically enable applications running on your Amazon EC2 instances
     *         to securely access other AWS resources. For information on launching
     *         EC2 instances with an IAM role, go to <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     *         Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For information on launching
     * EC2 instances with an IAM role, go to <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     * Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance. <p>Amazon EC2 instances
     *         launched with an IAM role will automatically have AWS security
     *         credentials available. You can use IAM roles with Auto Scaling to
     *         automatically enable applications running on your Amazon EC2 instances
     *         to securely access other AWS resources. For information on launching
     *         EC2 instances with an IAM role, go to <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     *         Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * The name or the Amazon Resource Name (ARN) of the instance profile
     * associated with the IAM role for the instance. <p>Amazon EC2 instances
     * launched with an IAM role will automatically have AWS security
     * credentials available. You can use IAM roles with Auto Scaling to
     * automatically enable applications running on your Amazon EC2 instances
     * to securely access other AWS resources. For information on launching
     * EC2 instances with an IAM role, go to <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     * Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param iamInstanceProfile The name or the Amazon Resource Name (ARN) of the instance profile
     *         associated with the IAM role for the instance. <p>Amazon EC2 instances
     *         launched with an IAM role will automatically have AWS security
     *         credentials available. You can use IAM roles with Auto Scaling to
     *         automatically enable applications running on your Amazon EC2 instances
     *         to securely access other AWS resources. For information on launching
     *         EC2 instances with an IAM role, go to <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-iam-role.html">Launching
     *         Auto Scaling Instances With an IAM Role</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Whether the instance is optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. By default
     * the instance is not optimized for EBS I/O. For information about
     * EBS-optimized instances, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return Whether the instance is optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal EBS I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. By default
     *         the instance is not optimized for EBS I/O. For information about
     *         EBS-optimized instances, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     *         Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Whether the instance is optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. By default
     * the instance is not optimized for EBS I/O. For information about
     * EBS-optimized instances, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @param ebsOptimized Whether the instance is optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal EBS I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. By default
     *         the instance is not optimized for EBS I/O. For information about
     *         EBS-optimized instances, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     *         Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Whether the instance is optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. By default
     * the instance is not optimized for EBS I/O. For information about
     * EBS-optimized instances, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Whether the instance is optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal EBS I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. By default
     *         the instance is not optimized for EBS I/O. For information about
     *         EBS-optimized instances, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     *         Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Whether the instance is optimized for EBS I/O. The optimization
     * provides dedicated throughput to Amazon EBS and an optimized
     * configuration stack to provide optimal EBS I/O performance. This
     * optimization is not available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance. By default
     * the instance is not optimized for EBS I/O. For information about
     * EBS-optimized instances, go to <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     * Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return Whether the instance is optimized for EBS I/O. The optimization
     *         provides dedicated throughput to Amazon EBS and an optimized
     *         configuration stack to provide optimal EBS I/O performance. This
     *         optimization is not available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance. By default
     *         the instance is not optimized for EBS I/O. For information about
     *         EBS-optimized instances, go to <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#EBSOptimized">EBS-Optimized
     *         Instances</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * Used for Auto Scaling groups that launch instances into an Amazon
     * Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     * public IP address to each instance launched in a Amazon VPC. <note>
     * <p>If you specify a value for this parameter, be sure to specify at
     * least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     * you create your Auto Scaling group. </note> <p>Default: If the
     * instance is launched in default VPC, the default is <code>true</code>.
     * If the instance is launched in a nondefault VPC (EC2-VPC), the default
     * is <code>false</code>. For more information about the platforms
     * supported by Auto Scaling, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     * Auto Scaling Configuration</a>.
     *
     * @return Used for Auto Scaling groups that launch instances into an Amazon
     *         Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     *         public IP address to each instance launched in a Amazon VPC. <note>
     *         <p>If you specify a value for this parameter, be sure to specify at
     *         least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     *         you create your Auto Scaling group. </note> <p>Default: If the
     *         instance is launched in default VPC, the default is <code>true</code>.
     *         If the instance is launched in a nondefault VPC (EC2-VPC), the default
     *         is <code>false</code>. For more information about the platforms
     *         supported by Auto Scaling, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     *         Auto Scaling Configuration</a>.
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }
    
    /**
     * Used for Auto Scaling groups that launch instances into an Amazon
     * Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     * public IP address to each instance launched in a Amazon VPC. <note>
     * <p>If you specify a value for this parameter, be sure to specify at
     * least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     * you create your Auto Scaling group. </note> <p>Default: If the
     * instance is launched in default VPC, the default is <code>true</code>.
     * If the instance is launched in a nondefault VPC (EC2-VPC), the default
     * is <code>false</code>. For more information about the platforms
     * supported by Auto Scaling, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     * Auto Scaling Configuration</a>.
     *
     * @param associatePublicIpAddress Used for Auto Scaling groups that launch instances into an Amazon
     *         Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     *         public IP address to each instance launched in a Amazon VPC. <note>
     *         <p>If you specify a value for this parameter, be sure to specify at
     *         least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     *         you create your Auto Scaling group. </note> <p>Default: If the
     *         instance is launched in default VPC, the default is <code>true</code>.
     *         If the instance is launched in a nondefault VPC (EC2-VPC), the default
     *         is <code>false</code>. For more information about the platforms
     *         supported by Auto Scaling, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     *         Auto Scaling Configuration</a>.
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }
    
    /**
     * Used for Auto Scaling groups that launch instances into an Amazon
     * Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     * public IP address to each instance launched in a Amazon VPC. <note>
     * <p>If you specify a value for this parameter, be sure to specify at
     * least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     * you create your Auto Scaling group. </note> <p>Default: If the
     * instance is launched in default VPC, the default is <code>true</code>.
     * If the instance is launched in a nondefault VPC (EC2-VPC), the default
     * is <code>false</code>. For more information about the platforms
     * supported by Auto Scaling, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     * Auto Scaling Configuration</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associatePublicIpAddress Used for Auto Scaling groups that launch instances into an Amazon
     *         Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     *         public IP address to each instance launched in a Amazon VPC. <note>
     *         <p>If you specify a value for this parameter, be sure to specify at
     *         least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     *         you create your Auto Scaling group. </note> <p>Default: If the
     *         instance is launched in default VPC, the default is <code>true</code>.
     *         If the instance is launched in a nondefault VPC (EC2-VPC), the default
     *         is <code>false</code>. For more information about the platforms
     *         supported by Auto Scaling, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     *         Auto Scaling Configuration</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateLaunchConfigurationRequest withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * Used for Auto Scaling groups that launch instances into an Amazon
     * Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     * public IP address to each instance launched in a Amazon VPC. <note>
     * <p>If you specify a value for this parameter, be sure to specify at
     * least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     * you create your Auto Scaling group. </note> <p>Default: If the
     * instance is launched in default VPC, the default is <code>true</code>.
     * If the instance is launched in a nondefault VPC (EC2-VPC), the default
     * is <code>false</code>. For more information about the platforms
     * supported by Auto Scaling, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     * Auto Scaling Configuration</a>.
     *
     * @return Used for Auto Scaling groups that launch instances into an Amazon
     *         Virtual Private Cloud (Amazon VPC). Specifies whether to assign a
     *         public IP address to each instance launched in a Amazon VPC. <note>
     *         <p>If you specify a value for this parameter, be sure to specify at
     *         least one VPC subnet using the <i>VPCZoneIdentifier</i> parameter when
     *         you create your Auto Scaling group. </note> <p>Default: If the
     *         instance is launched in default VPC, the default is <code>true</code>.
     *         If the instance is launched in a nondefault VPC (EC2-VPC), the default
     *         is <code>false</code>. For more information about the platforms
     *         supported by Auto Scaling, see <a
     *         href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_BasicSetup.html">Basic
     *         Auto Scaling Configuration</a>.
     */
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
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
        if (getLaunchConfigurationName() != null) sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() + ",");
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getSecurityGroups() != null) sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getInstanceMonitoring() != null) sb.append("InstanceMonitoring: " + getInstanceMonitoring() + ",");
        if (getSpotPrice() != null) sb.append("SpotPrice: " + getSpotPrice() + ",");
        if (getIamInstanceProfile() != null) sb.append("IamInstanceProfile: " + getIamInstanceProfile() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (isAssociatePublicIpAddress() != null) sb.append("AssociatePublicIpAddress: " + isAssociatePublicIpAddress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode()); 
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceMonitoring() == null) ? 0 : getInstanceMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSpotPrice() == null) ? 0 : getSpotPrice().hashCode()); 
        hashCode = prime * hashCode + ((getIamInstanceProfile() == null) ? 0 : getIamInstanceProfile().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((isAssociatePublicIpAddress() == null) ? 0 : isAssociatePublicIpAddress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLaunchConfigurationRequest == false) return false;
        CreateLaunchConfigurationRequest other = (CreateLaunchConfigurationRequest)obj;
        
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null) return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false) return false; 
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getInstanceMonitoring() == null ^ this.getInstanceMonitoring() == null) return false;
        if (other.getInstanceMonitoring() != null && other.getInstanceMonitoring().equals(this.getInstanceMonitoring()) == false) return false; 
        if (other.getSpotPrice() == null ^ this.getSpotPrice() == null) return false;
        if (other.getSpotPrice() != null && other.getSpotPrice().equals(this.getSpotPrice()) == false) return false; 
        if (other.getIamInstanceProfile() == null ^ this.getIamInstanceProfile() == null) return false;
        if (other.getIamInstanceProfile() != null && other.getIamInstanceProfile().equals(this.getIamInstanceProfile()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.isAssociatePublicIpAddress() == null ^ this.isAssociatePublicIpAddress() == null) return false;
        if (other.isAssociatePublicIpAddress() != null && other.isAssociatePublicIpAddress().equals(this.isAssociatePublicIpAddress()) == false) return false; 
        return true;
    }
    
}
    