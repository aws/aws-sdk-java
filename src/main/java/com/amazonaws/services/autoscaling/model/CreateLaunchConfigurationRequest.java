/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class CreateLaunchConfigurationRequest extends AmazonWebServiceRequest {

    /**
     * The name of the launch configuration to create.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     * during registration. For more information about Amazon EC2 images,
     * please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String imageId;

    /**
     * The name of the Amazon EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String keyName;

    /**
     * The names of the security groups with which to associate Amazon EC2 or
     * Amazon VPC instances. Specify Amazon EC2 security groups using
     * security group names, such as <code>websrv</code>. Specify Amazon VPC
     * security groups using security group IDs, such as
     * <code>sg-12345678</code>. For more information about Amazon EC2
     * security groups, go to <a
     * s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the Amazon EC2 product documentation. For
     * more information about Amazon VPC security groups, go to <a
     * es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     * Security Groups</a> in the Amazon VPC product documentation.
     */
    private java.util.List<String> securityGroups;

    /**
     * The user data available to the launched Amazon EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String userData;

    /**
     * The instance type of the Amazon EC2 instance. For more information
     * about Amazon EC2 instance types, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
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
     * WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Enables detailed monitoring, which is enabled by default. <p> When
     * detailed monitoring is enabled, CloudWatch will generate metrics every
     * minute and your account will be charged a fee. When you disable
     * detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     * generate metrics every 5 minutes. For information about monitoring,
     * see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     * CloudWatch</a> product page.
     */
    private InstanceMonitoring instanceMonitoring;

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
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     * during registration. For more information about Amazon EC2 images,
     * please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     *         during registration. For more information about Amazon EC2 images,
     *         please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     * during registration. For more information about Amazon EC2 images,
     * please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     *         during registration. For more information about Amazon EC2 images,
     *         please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     * during registration. For more information about Amazon EC2 images,
     * please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     *         during registration. For more information about Amazon EC2 images,
     *         please see <a href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * The name of the Amazon EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Amazon EC2 key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the Amazon EC2 key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the Amazon EC2 key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the Amazon EC2 key pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    
    
    /**
     * The names of the security groups with which to associate Amazon EC2 or
     * Amazon VPC instances. Specify Amazon EC2 security groups using
     * security group names, such as <code>websrv</code>. Specify Amazon VPC
     * security groups using security group IDs, such as
     * <code>sg-12345678</code>. For more information about Amazon EC2
     * security groups, go to <a
     * s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the Amazon EC2 product documentation. For
     * more information about Amazon VPC security groups, go to <a
     * es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     * Security Groups</a> in the Amazon VPC product documentation.
     *
     * @return The names of the security groups with which to associate Amazon EC2 or
     *         Amazon VPC instances. Specify Amazon EC2 security groups using
     *         security group names, such as <code>websrv</code>. Specify Amazon VPC
     *         security groups using security group IDs, such as
     *         <code>sg-12345678</code>. For more information about Amazon EC2
     *         security groups, go to <a
     *         s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the Amazon EC2 product documentation. For
     *         more information about Amazon VPC security groups, go to <a
     *         es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     *         Security Groups</a> in the Amazon VPC product documentation.
     */
    public java.util.List<String> getSecurityGroups() {
        
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * The names of the security groups with which to associate Amazon EC2 or
     * Amazon VPC instances. Specify Amazon EC2 security groups using
     * security group names, such as <code>websrv</code>. Specify Amazon VPC
     * security groups using security group IDs, such as
     * <code>sg-12345678</code>. For more information about Amazon EC2
     * security groups, go to <a
     * s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the Amazon EC2 product documentation. For
     * more information about Amazon VPC security groups, go to <a
     * es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     * Security Groups</a> in the Amazon VPC product documentation.
     *
     * @param securityGroups The names of the security groups with which to associate Amazon EC2 or
     *         Amazon VPC instances. Specify Amazon EC2 security groups using
     *         security group names, such as <code>websrv</code>. Specify Amazon VPC
     *         security groups using security group IDs, such as
     *         <code>sg-12345678</code>. For more information about Amazon EC2
     *         security groups, go to <a
     *         s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the Amazon EC2 product documentation. For
     *         more information about Amazon VPC security groups, go to <a
     *         es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     *         Security Groups</a> in the Amazon VPC product documentation.
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>(securityGroups.size());
        securityGroupsCopy.addAll(securityGroups);
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * The names of the security groups with which to associate Amazon EC2 or
     * Amazon VPC instances. Specify Amazon EC2 security groups using
     * security group names, such as <code>websrv</code>. Specify Amazon VPC
     * security groups using security group IDs, such as
     * <code>sg-12345678</code>. For more information about Amazon EC2
     * security groups, go to <a
     * s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the Amazon EC2 product documentation. For
     * more information about Amazon VPC security groups, go to <a
     * es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     * Security Groups</a> in the Amazon VPC product documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The names of the security groups with which to associate Amazon EC2 or
     *         Amazon VPC instances. Specify Amazon EC2 security groups using
     *         security group names, such as <code>websrv</code>. Specify Amazon VPC
     *         security groups using security group IDs, such as
     *         <code>sg-12345678</code>. For more information about Amazon EC2
     *         security groups, go to <a
     *         s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the Amazon EC2 product documentation. For
     *         more information about Amazon VPC security groups, go to <a
     *         es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     *         Security Groups</a> in the Amazon VPC product documentation.
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
     * The names of the security groups with which to associate Amazon EC2 or
     * Amazon VPC instances. Specify Amazon EC2 security groups using
     * security group names, such as <code>websrv</code>. Specify Amazon VPC
     * security groups using security group IDs, such as
     * <code>sg-12345678</code>. For more information about Amazon EC2
     * security groups, go to <a
     * s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     * Using Security Groups</a> in the Amazon EC2 product documentation. For
     * more information about Amazon VPC security groups, go to <a
     * es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     * Security Groups</a> in the Amazon VPC product documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The names of the security groups with which to associate Amazon EC2 or
     *         Amazon VPC instances. Specify Amazon EC2 security groups using
     *         security group names, such as <code>websrv</code>. Specify Amazon VPC
     *         security groups using security group IDs, such as
     *         <code>sg-12345678</code>. For more information about Amazon EC2
     *         security groups, go to <a
     *         s.com/AWSEC2/latest/UserGuide/index.html?using-network-security.html">
     *         Using Security Groups</a> in the Amazon EC2 product documentation. For
     *         more information about Amazon VPC security groups, go to <a
     *         es.com/AmazonVPC/latest/UserGuide/index.html?VPC_SecurityGroups.html">
     *         Security Groups</a> in the Amazon VPC product documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
        } else {
            java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>(securityGroups.size());
            securityGroupsCopy.addAll(securityGroups);
            this.securityGroups = securityGroupsCopy;
        }

        return this;
    }
    
    /**
     * The user data available to the launched Amazon EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The user data available to the launched Amazon EC2 instances. For more
     *         information about Amazon EC2 user data, please see <a
     *         href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The user data available to the launched Amazon EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data available to the launched Amazon EC2 instances. For more
     *         information about Amazon EC2 user data, please see <a
     *         href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The user data available to the launched Amazon EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data available to the launched Amazon EC2 instances. For more
     *         information about Amazon EC2 user data, please see <a
     *         href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }
    
    
    /**
     * The instance type of the Amazon EC2 instance. For more information
     * about Amazon EC2 instance types, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The instance type of the Amazon EC2 instance. For more information
     *         about Amazon EC2 instance types, please see <a
     *         href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type of the Amazon EC2 instance. For more information
     * about Amazon EC2 instance types, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the Amazon EC2 instance. For more information
     *         about Amazon EC2 instance types, please see <a
     *         href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type of the Amazon EC2 instance. For more information
     * about Amazon EC2 instance types, please see <a
     * href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the Amazon EC2 instance. For more information
     *         about Amazon EC2 instance types, please see <a
     *         href="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
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
     * WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @return A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @param blockDeviceMappings A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * A list of mappings that specify how block devices are exposed to the
     * instance. Each mapping is made up of a <i>VirtualName</i>, a
     * <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     * information about the associated Elastic Block Storage volume. For
     * more information about Amazon EC2 BlockDeviceMappings, go to <a
     * WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
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
     * WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     * Block Device Mapping</a> in the Amazon EC2 product documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings A list of mappings that specify how block devices are exposed to the
     *         instance. Each mapping is made up of a <i>VirtualName</i>, a
     *         <i>DeviceName</i>, and an <i>ebs</i> data structure that contains
     *         information about the associated Elastic Block Storage volume. For
     *         more information about Amazon EC2 BlockDeviceMappings, go to <a
     *         WSEC2/latest/UserGuide/index.html?block-device-mapping-concepts.html">
     *         Block Device Mapping</a> in the Amazon EC2 product documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }
    
    /**
     * Enables detailed monitoring, which is enabled by default. <p> When
     * detailed monitoring is enabled, CloudWatch will generate metrics every
     * minute and your account will be charged a fee. When you disable
     * detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     * generate metrics every 5 minutes. For information about monitoring,
     * see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     * CloudWatch</a> product page.
     *
     * @return Enables detailed monitoring, which is enabled by default. <p> When
     *         detailed monitoring is enabled, CloudWatch will generate metrics every
     *         minute and your account will be charged a fee. When you disable
     *         detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     *         generate metrics every 5 minutes. For information about monitoring,
     *         see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     *         CloudWatch</a> product page.
     */
    public InstanceMonitoring getInstanceMonitoring() {
        return instanceMonitoring;
    }
    
    /**
     * Enables detailed monitoring, which is enabled by default. <p> When
     * detailed monitoring is enabled, CloudWatch will generate metrics every
     * minute and your account will be charged a fee. When you disable
     * detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     * generate metrics every 5 minutes. For information about monitoring,
     * see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     * CloudWatch</a> product page.
     *
     * @param instanceMonitoring Enables detailed monitoring, which is enabled by default. <p> When
     *         detailed monitoring is enabled, CloudWatch will generate metrics every
     *         minute and your account will be charged a fee. When you disable
     *         detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     *         generate metrics every 5 minutes. For information about monitoring,
     *         see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     *         CloudWatch</a> product page.
     */
    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }
    
    /**
     * Enables detailed monitoring, which is enabled by default. <p> When
     * detailed monitoring is enabled, CloudWatch will generate metrics every
     * minute and your account will be charged a fee. When you disable
     * detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     * generate metrics every 5 minutes. For information about monitoring,
     * see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     * CloudWatch</a> product page.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceMonitoring Enables detailed monitoring, which is enabled by default. <p> When
     *         detailed monitoring is enabled, CloudWatch will generate metrics every
     *         minute and your account will be charged a fee. When you disable
     *         detailed monitoring, by specifying <code>False</code>, Cloudwatch will
     *         generate metrics every 5 minutes. For information about monitoring,
     *         see the <a href="http://aws.amazon.com/cloudwatch/">Amazon
     *         CloudWatch</a> product page.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
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
        if (launchConfigurationName != null) sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        if (imageId != null) sb.append("ImageId: " + imageId + ", ");
        if (keyName != null) sb.append("KeyName: " + keyName + ", ");
        if (securityGroups != null) sb.append("SecurityGroups: " + securityGroups + ", ");
        if (userData != null) sb.append("UserData: " + userData + ", ");
        if (instanceType != null) sb.append("InstanceType: " + instanceType + ", ");
        if (kernelId != null) sb.append("KernelId: " + kernelId + ", ");
        if (ramdiskId != null) sb.append("RamdiskId: " + ramdiskId + ", ");
        if (blockDeviceMappings != null) sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        if (instanceMonitoring != null) sb.append("InstanceMonitoring: " + instanceMonitoring + ", ");
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
        return true;
    }
    
}
    