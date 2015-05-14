/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the launch specification for VM import.
 * </p>
 */
public class ImportInstanceLaunchSpecification implements Serializable, Cloneable {

    /**
     * The architecture of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     */
    private String architecture;

    /**
     * One or more security group names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNames;

    /**
     * One or more security group IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIds;

    /**
     * Reserved.
     */
    private String additionalInfo;

    /**
     * The Base64-encoded MIME user data to be made available to the
     * instance.
     */
    private UserData userData;

    /**
     * The instance type. For more information about the instance types that
     * you can import, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     * You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     * Linux.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     */
    private String instanceType;

    /**
     * The placement information for the instance.
     */
    private Placement placement;

    /**
     * Indicates whether monitoring is enabled.
     */
    private Boolean monitoring;

    /**
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     */
    private String subnetId;

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * [EC2-VPC] An available IP address from the IP address range of the
     * subnet.
     */
    private String privateIpAddress;

    /**
     * The architecture of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @return The architecture of the instance.
     *
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the instance.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ArchitectureValues
     */
    public ImportInstanceLaunchSpecification withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The architecture of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the instance.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The architecture of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ArchitectureValues
     */
    public ImportInstanceLaunchSpecification withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * One or more security group names.
     *
     * @return One or more security group names.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
              groupNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupNames.setAutoConstruct(true);
        }
        return groupNames;
    }
    
    /**
     * One or more security group names.
     *
     * @param groupNames One or more security group names.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
        groupNamesCopy.addAll(groupNames);
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * One or more security group names.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroupNames(java.util.Collection)} or {@link
     * #withGroupNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames One or more security group names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withGroupNames(String... groupNames) {
        if (getGroupNames() == null) setGroupNames(new java.util.ArrayList<String>(groupNames.length));
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames One or more security group names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupNames.size());
            groupNamesCopy.addAll(groupNames);
            this.groupNames = groupNamesCopy;
        }

        return this;
    }

    /**
     * One or more security group IDs.
     *
     * @return One or more security group IDs.
     */
    public java.util.List<String> getGroupIds() {
        if (groupIds == null) {
              groupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groupIds.setAutoConstruct(true);
        }
        return groupIds;
    }
    
    /**
     * One or more security group IDs.
     *
     * @param groupIds One or more security group IDs.
     */
    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupIds.size());
        groupIdsCopy.addAll(groupIds);
        this.groupIds = groupIdsCopy;
    }
    
    /**
     * One or more security group IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGroupIds(java.util.Collection)} or {@link
     * #withGroupIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupIds One or more security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withGroupIds(String... groupIds) {
        if (getGroupIds() == null) setGroupIds(new java.util.ArrayList<String>(groupIds.length));
        for (String value : groupIds) {
            getGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupIds One or more security group IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groupIds.size());
            groupIdsCopy.addAll(groupIds);
            this.groupIds = groupIdsCopy;
        }

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
    public ImportInstanceLaunchSpecification withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * The Base64-encoded MIME user data to be made available to the
     * instance.
     *
     * @return The Base64-encoded MIME user data to be made available to the
     *         instance.
     */
    public UserData getUserData() {
        return userData;
    }
    
    /**
     * The Base64-encoded MIME user data to be made available to the
     * instance.
     *
     * @param userData The Base64-encoded MIME user data to be made available to the
     *         instance.
     */
    public void setUserData(UserData userData) {
        this.userData = userData;
    }
    
    /**
     * The Base64-encoded MIME user data to be made available to the
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData The Base64-encoded MIME user data to be made available to the
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withUserData(UserData userData) {
        this.userData = userData;
        return this;
    }

    /**
     * The instance type. For more information about the instance types that
     * you can import, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     * You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     * Linux.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @return The instance type. For more information about the instance types that
     *         you can import, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     *         You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     *         Linux.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type. For more information about the instance types that
     * you can import, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     * You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     * Linux.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information about the instance types that
     *         you can import, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     *         You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     *         Linux.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type. For more information about the instance types that
     * you can import, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     * You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     * Linux.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information about the instance types that
     *         you can import, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     *         You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     *         Linux.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public ImportInstanceLaunchSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The instance type. For more information about the instance types that
     * you can import, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     * You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     * Linux.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information about the instance types that
     *         you can import, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     *         You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     *         Linux.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type. For more information about the instance types that
     * you can import, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     * You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     * Linux.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, t2.micro, t2.small, t2.medium, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, cg1.4xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type. For more information about the instance types that
     *         you can import, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/VMImportPrerequisites.html">Before
     *         You Get Started</a> in the Amazon Elastic Compute Cloud User Guide for
     *         Linux.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public ImportInstanceLaunchSpecification withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * The placement information for the instance.
     *
     * @return The placement information for the instance.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * The placement information for the instance.
     *
     * @param placement The placement information for the instance.
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    
    /**
     * The placement information for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement The placement information for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * Indicates whether monitoring is enabled.
     *
     * @return Indicates whether monitoring is enabled.
     */
    public Boolean isMonitoring() {
        return monitoring;
    }
    
    /**
     * Indicates whether monitoring is enabled.
     *
     * @param monitoring Indicates whether monitoring is enabled.
     */
    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Indicates whether monitoring is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring Indicates whether monitoring is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * Indicates whether monitoring is enabled.
     *
     * @return Indicates whether monitoring is enabled.
     */
    public Boolean getMonitoring() {
        return monitoring;
    }

    /**
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     *
     * @return [EC2-VPC] The ID of the subnet in which to launch the instance.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     *
     * @param subnetId [EC2-VPC] The ID of the subnet in which to launch the instance.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId [EC2-VPC] The ID of the subnet in which to launch the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @return Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @see ShutdownBehavior
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ShutdownBehavior
     */
    public ImportInstanceLaunchSpecification withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @see ShutdownBehavior
     */
    public void setInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>stop, terminate
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ShutdownBehavior
     */
    public ImportInstanceLaunchSpecification withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * [EC2-VPC] An available IP address from the IP address range of the
     * subnet.
     *
     * @return [EC2-VPC] An available IP address from the IP address range of the
     *         subnet.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * [EC2-VPC] An available IP address from the IP address range of the
     * subnet.
     *
     * @param privateIpAddress [EC2-VPC] An available IP address from the IP address range of the
     *         subnet.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * [EC2-VPC] An available IP address from the IP address range of the
     * subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress [EC2-VPC] An available IP address from the IP address range of the
     *         subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImportInstanceLaunchSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getGroupNames() != null) sb.append("GroupNames: " + getGroupNames() + ",");
        if (getGroupIds() != null) sb.append("GroupIds: " + getGroupIds() + ",");
        if (getAdditionalInfo() != null) sb.append("AdditionalInfo: " + getAdditionalInfo() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getPlacement() != null) sb.append("Placement: " + getPlacement() + ",");
        if (isMonitoring() != null) sb.append("Monitoring: " + isMonitoring() + ",");
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null) sb.append("InstanceInitiatedShutdownBehavior: " + getInstanceInitiatedShutdownBehavior() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((isMonitoring() == null) ? 0 : isMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode()); 
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportInstanceLaunchSpecification == false) return false;
        ImportInstanceLaunchSpecification other = (ImportInstanceLaunchSpecification)obj;
        
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getGroupNames() == null ^ this.getGroupNames() == null) return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false) return false; 
        if (other.getGroupIds() == null ^ this.getGroupIds() == null) return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
        if (other.isMonitoring() == null ^ this.isMonitoring() == null) return false;
        if (other.isMonitoring() != null && other.isMonitoring().equals(this.isMonitoring()) == false) return false; 
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null) return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false) return false; 
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        return true;
    }
    
    @Override
    public ImportInstanceLaunchSpecification clone() {
        try {
            return (ImportInstanceLaunchSpecification) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    