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


/**
 * <p>
 * The <code>LaunchConfiguration</code> data type.
 * </p>
 */
public class LaunchConfiguration implements Serializable {

    /**
     * Specifies the name of the launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The launch configuration's Amazon Resource Name (ARN).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationARN;

    /**
     * Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     * was assigned during registration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String imageId;

    /**
     * Provides the name of the Amazon EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String keyName;

    /**
     * A description of the security groups to associate with the Amazon EC2
     * instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> securityGroups;

    /**
     * The user data available to the launched Amazon EC2 instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String userData;

    /**
     * Specifies the instance type of the Amazon EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceType;

    /**
     * Provides the ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String kernelId;

    /**
     * Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String ramdiskId;

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * Controls whether instances in this group are launched with detailed
     * monitoring or not.
     */
    private InstanceMonitoring instanceMonitoring;

    /**
     * Specifies the price to bid when launching Spot Instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String spotPrice;

    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance
     * profile associated with the IAM role for the instance. The instance
     * profile contains the IAM role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String iamInstanceProfile;

    /**
     * Provides the creation date and time for this launch configuration.
     */
    private java.util.Date createdTime;

    /**
     * Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     * or not (<i>false</i>).
     */
    private Boolean ebsOptimized;

    /**
     * Specifies whether the instance is associated with a public IP address
     * (<code>true</code>) or not (<code>false</code>).
     */
    private Boolean associatePublicIpAddress;

    /**
     * Specifies the name of the launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the name of the launch configuration.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * Specifies the name of the launch configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName Specifies the name of the launch configuration.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * Specifies the name of the launch configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName Specifies the name of the launch configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * The launch configuration's Amazon Resource Name (ARN).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The launch configuration's Amazon Resource Name (ARN).
     */
    public String getLaunchConfigurationARN() {
        return launchConfigurationARN;
    }
    
    /**
     * The launch configuration's Amazon Resource Name (ARN).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationARN The launch configuration's Amazon Resource Name (ARN).
     */
    public void setLaunchConfigurationARN(String launchConfigurationARN) {
        this.launchConfigurationARN = launchConfigurationARN;
    }
    
    /**
     * The launch configuration's Amazon Resource Name (ARN).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationARN The launch configuration's Amazon Resource Name (ARN).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withLaunchConfigurationARN(String launchConfigurationARN) {
        this.launchConfigurationARN = launchConfigurationARN;
        return this;
    }

    /**
     * Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     * was assigned during registration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     *         was assigned during registration.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     * was assigned during registration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     *         was assigned during registration.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     * was assigned during registration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param imageId Provides the unique ID of the <i>Amazon Machine Image</i> (AMI) that
     *         was assigned during registration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * Provides the name of the Amazon EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Provides the name of the Amazon EC2 key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * Provides the name of the Amazon EC2 key pair.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName Provides the name of the Amazon EC2 key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * Provides the name of the Amazon EC2 key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param keyName Provides the name of the Amazon EC2 key pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * A description of the security groups to associate with the Amazon EC2
     * instances.
     *
     * @return A description of the security groups to associate with the Amazon EC2
     *         instances.
     */
    public java.util.List<String> getSecurityGroups() {
        if (securityGroups == null) {
              securityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              securityGroups.setAutoConstruct(true);
        }
        return securityGroups;
    }
    
    /**
     * A description of the security groups to associate with the Amazon EC2
     * instances.
     *
     * @param securityGroups A description of the security groups to associate with the Amazon EC2
     *         instances.
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
     * A description of the security groups to associate with the Amazon EC2
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A description of the security groups to associate with the Amazon EC2
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A description of the security groups to associate with the Amazon EC2
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups A description of the security groups to associate with the Amazon EC2
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withSecurityGroups(java.util.Collection<String> securityGroups) {
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
     * The user data available to the launched Amazon EC2 instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The user data available to the launched Amazon EC2 instances.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The user data available to the launched Amazon EC2 instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data available to the launched Amazon EC2 instances.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The user data available to the launched Amazon EC2 instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 21847<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param userData The user data available to the launched Amazon EC2 instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Specifies the instance type of the Amazon EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Specifies the instance type of the Amazon EC2 instance.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Specifies the instance type of the Amazon EC2 instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType Specifies the instance type of the Amazon EC2 instance.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Specifies the instance type of the Amazon EC2 instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceType Specifies the instance type of the Amazon EC2 instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Provides the ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Provides the ID of the kernel associated with the Amazon EC2 AMI.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * Provides the ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param kernelId Provides the ID of the kernel associated with the Amazon EC2 AMI.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * Provides the ID of the kernel associated with the Amazon EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param kernelId Provides the ID of the kernel associated with the Amazon EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param ramdiskId Provides ID of the RAM disk associated with the Amazon EC2 AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     *
     * @return Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>virtualName</i> and a <i>deviceName</i>.
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
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Specifies how block devices are exposed to the instance. Each mapping
     * is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance. Each mapping
     *         is made up of a <i>virtualName</i> and a <i>deviceName</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
     * Controls whether instances in this group are launched with detailed
     * monitoring or not.
     *
     * @return Controls whether instances in this group are launched with detailed
     *         monitoring or not.
     */
    public InstanceMonitoring getInstanceMonitoring() {
        return instanceMonitoring;
    }
    
    /**
     * Controls whether instances in this group are launched with detailed
     * monitoring or not.
     *
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     *         monitoring or not.
     */
    public void setInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }
    
    /**
     * Controls whether instances in this group are launched with detailed
     * monitoring or not.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceMonitoring Controls whether instances in this group are launched with detailed
     *         monitoring or not.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withInstanceMonitoring(InstanceMonitoring instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
    }

    /**
     * Specifies the price to bid when launching Spot Instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return Specifies the price to bid when launching Spot Instances.
     */
    public String getSpotPrice() {
        return spotPrice;
    }
    
    /**
     * Specifies the price to bid when launching Spot Instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice Specifies the price to bid when launching Spot Instances.
     */
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }
    
    /**
     * Specifies the price to bid when launching Spot Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param spotPrice Specifies the price to bid when launching Spot Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance
     * profile associated with the IAM role for the instance. The instance
     * profile contains the IAM role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Provides the name or the Amazon Resource Name (ARN) of the instance
     *         profile associated with the IAM role for the instance. The instance
     *         profile contains the IAM role.
     */
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }
    
    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance
     * profile associated with the IAM role for the instance. The instance
     * profile contains the IAM role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param iamInstanceProfile Provides the name or the Amazon Resource Name (ARN) of the instance
     *         profile associated with the IAM role for the instance. The instance
     *         profile contains the IAM role.
     */
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }
    
    /**
     * Provides the name or the Amazon Resource Name (ARN) of the instance
     * profile associated with the IAM role for the instance. The instance
     * profile contains the IAM role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param iamInstanceProfile Provides the name or the Amazon Resource Name (ARN) of the instance
     *         profile associated with the IAM role for the instance. The instance
     *         profile contains the IAM role.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * Provides the creation date and time for this launch configuration.
     *
     * @return Provides the creation date and time for this launch configuration.
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }
    
    /**
     * Provides the creation date and time for this launch configuration.
     *
     * @param createdTime Provides the creation date and time for this launch configuration.
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }
    
    /**
     * Provides the creation date and time for this launch configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdTime Provides the creation date and time for this launch configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     * or not (<i>false</i>).
     *
     * @return Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     *         or not (<i>false</i>).
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     * or not (<i>false</i>).
     *
     * @param ebsOptimized Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     *         or not (<i>false</i>).
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     * or not (<i>false</i>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     *         or not (<i>false</i>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     * or not (<i>false</i>).
     *
     * @return Specifies whether the instance is optimized for EBS I/O (<i>true</i>)
     *         or not (<i>false</i>).
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * Specifies whether the instance is associated with a public IP address
     * (<code>true</code>) or not (<code>false</code>).
     *
     * @return Specifies whether the instance is associated with a public IP address
     *         (<code>true</code>) or not (<code>false</code>).
     */
    public Boolean isAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }
    
    /**
     * Specifies whether the instance is associated with a public IP address
     * (<code>true</code>) or not (<code>false</code>).
     *
     * @param associatePublicIpAddress Specifies whether the instance is associated with a public IP address
     *         (<code>true</code>) or not (<code>false</code>).
     */
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }
    
    /**
     * Specifies whether the instance is associated with a public IP address
     * (<code>true</code>) or not (<code>false</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param associatePublicIpAddress Specifies whether the instance is associated with a public IP address
     *         (<code>true</code>) or not (<code>false</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LaunchConfiguration withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * Specifies whether the instance is associated with a public IP address
     * (<code>true</code>) or not (<code>false</code>).
     *
     * @return Specifies whether the instance is associated with a public IP address
     *         (<code>true</code>) or not (<code>false</code>).
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
        if (getLaunchConfigurationARN() != null) sb.append("LaunchConfigurationARN: " + getLaunchConfigurationARN() + ",");
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
        if (getCreatedTime() != null) sb.append("CreatedTime: " + getCreatedTime() + ",");
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
        hashCode = prime * hashCode + ((getLaunchConfigurationARN() == null) ? 0 : getLaunchConfigurationARN().hashCode()); 
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
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((isAssociatePublicIpAddress() == null) ? 0 : isAssociatePublicIpAddress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LaunchConfiguration == false) return false;
        LaunchConfiguration other = (LaunchConfiguration)obj;
        
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null) return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false) return false; 
        if (other.getLaunchConfigurationARN() == null ^ this.getLaunchConfigurationARN() == null) return false;
        if (other.getLaunchConfigurationARN() != null && other.getLaunchConfigurationARN().equals(this.getLaunchConfigurationARN()) == false) return false; 
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
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null) return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.isAssociatePublicIpAddress() == null ^ this.isAssociatePublicIpAddress() == null) return false;
        if (other.isAssociatePublicIpAddress() != null && other.isAssociatePublicIpAddress().equals(this.isAssociatePublicIpAddress()) == false) return false; 
        return true;
    }
    
}
    