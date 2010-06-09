/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new launch configuration. Once created, the new launch
 * configuration is available for immediate use.
 * </p>
 * <p>
 * <b>NOTE:</b> The launch configuration name used must be unique, within
 * the scope of the client's AWS account, and the maximum limit of launch
 * configurations must not yet have been met, or else the call will fail.
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
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String imageId;

    /**
     * The name of the EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String keyName;

    /**
     * A list of names of the security groups with which to associate EC2
     * instances. For more information about Amazon EC2 security groups,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     */
    private java.util.List<String> securityGroups;

    /**
     * The user data available to the launched EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String userData;

    /**
     * The instance type of the EC2 instance. For more information about
     * Amazon EC2 instance types, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * The ID of the kernel associated with the EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String kernelId;

    /**
     * The ID of the RAM disk associated with the EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String ramdiskId;

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     * information about Amazon EC2 BlockDeviceMappings, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

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
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     *         during registration. For more information about Amazon EC2 images,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     * during registration. For more information about Amazon EC2 images,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     *         during registration. For more information about Amazon EC2 images,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     * during registration. For more information about Amazon EC2 images,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Unique ID of the <i>Amazon Machine Image</i> (AMI) which was assigned
     *         during registration. For more information about Amazon EC2 images,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * The name of the EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the EC2 key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the EC2 key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the EC2 key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName The name of the EC2 key pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    
    
    /**
     * A list of names of the security groups with which to associate EC2
     * instances. For more information about Amazon EC2 security groups,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     *
     * @return A list of names of the security groups with which to associate EC2
     *         instances. For more information about Amazon EC2 security groups,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * A list of names of the security groups with which to associate EC2
     * instances. For more information about Amazon EC2 security groups,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     *
     * @param securityGroups A list of names of the security groups with which to associate EC2
     *         instances. For more information about Amazon EC2 security groups,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;
    }
    
    /**
     * A list of names of the security groups with which to associate EC2
     * instances. For more information about Amazon EC2 security groups,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of names of the security groups with which to associate EC2
     *         instances. For more information about Amazon EC2 security groups,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(String... securityGroups) {
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of names of the security groups with which to associate EC2
     * instances. For more information about Amazon EC2 security groups,
     * please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A list of names of the security groups with which to associate EC2
     *         instances. For more information about Amazon EC2 security groups,
     *         please see <a hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withSecurityGroups(java.util.Collection<String> securityGroups) {
        java.util.List<String> securityGroupsCopy = new java.util.ArrayList<String>();
        if (securityGroups != null) {
            securityGroupsCopy.addAll(securityGroups);
        }
        this.securityGroups = securityGroupsCopy;

        return this;
    }
    
    /**
     * The user data available to the launched EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The user data available to the launched EC2 instances. For more
     *         information about Amazon EC2 user data, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The user data available to the launched EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data available to the launched EC2 instances. For more
     *         information about Amazon EC2 user data, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The user data available to the launched EC2 instances. For more
     * information about Amazon EC2 user data, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data available to the launched EC2 instances. For more
     *         information about Amazon EC2 user data, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }
    
    
    /**
     * The instance type of the EC2 instance. For more information about
     * Amazon EC2 instance types, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The instance type of the EC2 instance. For more information about
     *         Amazon EC2 instance types, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type of the EC2 instance. For more information about
     * Amazon EC2 instance types, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the EC2 instance. For more information about
     *         Amazon EC2 instance types, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type of the EC2 instance. For more information about
     * Amazon EC2 instance types, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType The instance type of the EC2 instance. For more information about
     *         Amazon EC2 instance types, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
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
     * The ID of the kernel associated with the EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the kernel associated with the EC2 AMI.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The ID of the kernel associated with the EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param kernelId The ID of the kernel associated with the EC2 AMI.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The ID of the kernel associated with the EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param kernelId The ID of the kernel associated with the EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }
    
    
    /**
     * The ID of the RAM disk associated with the EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the RAM disk associated with the EC2 AMI.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ID of the RAM disk associated with the EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId The ID of the RAM disk associated with the EC2 AMI.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ID of the RAM disk associated with the EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId The ID of the RAM disk associated with the EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }
    
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     * information about Amazon EC2 BlockDeviceMappings, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     *
     * @return Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     *         information about Amazon EC2 BlockDeviceMappings, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     * information about Amazon EC2 BlockDeviceMappings, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     *         information about Amazon EC2 BlockDeviceMappings, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     * information about Amazon EC2 BlockDeviceMappings, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     *         information about Amazon EC2 BlockDeviceMappings, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     * information about Amazon EC2 BlockDeviceMappings, please see <a
     * hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     * documentation</a>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>VirtualName</i> and a <i>DeviceName</i>. For more
     *         information about Amazon EC2 BlockDeviceMappings, please see <a
     *         hlink="http://aws.amazon.com/ec2/"> Amazon EC2 product
     *         documentation</a>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLaunchConfigurationRequest withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;

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
        
        sb.append("LaunchConfigurationName: " + launchConfigurationName + ", ");
        sb.append("ImageId: " + imageId + ", ");
        sb.append("KeyName: " + keyName + ", ");
        sb.append("SecurityGroups: " + securityGroups + ", ");
        sb.append("UserData: " + userData + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("KernelId: " + kernelId + ", ");
        sb.append("RamdiskId: " + ramdiskId + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    