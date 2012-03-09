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
package com.amazonaws.services.ec2.model;

/**
 * Import Instance Launch Specification
 */
public class ImportInstanceLaunchSpecification {

    private String architecture;

    private java.util.List<String> securityGroups;

    private String additionalInfo;

    private String userData;

    private String instanceType;

    /**
     * Describes where an Amazon EC2 instance is running within an Amazon EC2
     * region.
     */
    private Placement placement;

    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    private Boolean monitoring;

    private String subnetId;

    private Boolean disableApiTermination;

    private String instanceInitiatedShutdownBehavior;

    private String privateIpAddress;

    /**
     * Returns the value of the Architecture property for this object.
     *
     * @return The value of the Architecture property for this object.
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * Sets the value of the Architecture property for this object.
     *
     * @param architecture The new value for the Architecture property for this object.
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * Sets the value of the Architecture property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param architecture The new value for the Architecture property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    
    
    /**
     * Returns the value of the SecurityGroups property for this object.
     *
     * @return The value of the SecurityGroups property for this object.
     */
    public java.util.List<String> getSecurityGroups() {
        
        if (securityGroups == null) {
            securityGroups = new java.util.ArrayList<String>();
        }
        return securityGroups;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
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
     * Sets the value of the SecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withSecurityGroups(String... securityGroups) {
        if (getSecurityGroups() == null) setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        for (String value : securityGroups) {
            getSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SecurityGroups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param securityGroups The new value for the SecurityGroups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withSecurityGroups(java.util.Collection<String> securityGroups) {
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
     * Returns the value of the AdditionalInfo property for this object.
     *
     * @return The value of the AdditionalInfo property for this object.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * Sets the value of the AdditionalInfo property for this object.
     *
     * @param additionalInfo The new value for the AdditionalInfo property for this object.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * Sets the value of the AdditionalInfo property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param additionalInfo The new value for the AdditionalInfo property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    
    /**
     * Returns the value of the UserData property for this object.
     *
     * @return The value of the UserData property for this object.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * Sets the value of the UserData property for this object.
     *
     * @param userData The new value for the UserData property for this object.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * Sets the value of the UserData property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData The new value for the UserData property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withUserData(String userData) {
        this.userData = userData;
        return this;
    }
    
    
    /**
     * Returns the value of the InstanceType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @return The value of the InstanceType property for this object.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Sets the value of the InstanceType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The new value for the InstanceType property for this object.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Sets the value of the InstanceType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The new value for the InstanceType property for this object.
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
     * Sets the value of the InstanceType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The new value for the InstanceType property for this object.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * Sets the value of the InstanceType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, m1.small, m1.medium, m1.large, m1.xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, c1.medium, c1.xlarge, cc1.4xlarge, cc2.8xlarge, cg1.4xlarge
     *
     * @param instanceType The new value for the InstanceType property for this object.
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
     * Describes where an Amazon EC2 instance is running within an Amazon EC2
     * region.
     *
     * @return Describes where an Amazon EC2 instance is running within an Amazon EC2
     *         region.
     */
    public Placement getPlacement() {
        return placement;
    }
    
    /**
     * Describes where an Amazon EC2 instance is running within an Amazon EC2
     * region.
     *
     * @param placement Describes where an Amazon EC2 instance is running within an Amazon EC2
     *         region.
     */
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }
    
    /**
     * Describes where an Amazon EC2 instance is running within an Amazon EC2
     * region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param placement Describes where an Amazon EC2 instance is running within an Amazon EC2
     *         region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }
    
    
    /**
     * Returns the value of the BlockDeviceMappings property for this object.
     *
     * @return The value of the BlockDeviceMappings property for this object.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * Sets the value of the BlockDeviceMappings property for this object.
     *
     * @param blockDeviceMappings The new value for the BlockDeviceMappings property for this object.
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
     * Sets the value of the BlockDeviceMappings property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The new value for the BlockDeviceMappings property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the BlockDeviceMappings property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The new value for the BlockDeviceMappings property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
     * Returns the value of the Monitoring property for this object.
     *
     * @return The value of the Monitoring property for this object.
     */
    public Boolean isMonitoring() {
        return monitoring;
    }
    
    /**
     * Sets the value of the Monitoring property for this object.
     *
     * @param monitoring The new value for the Monitoring property for this object.
     */
    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }
    
    /**
     * Sets the value of the Monitoring property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoring The new value for the Monitoring property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
        return this;
    }
    
    
    /**
     * Returns the value of the Monitoring property for this object.
     *
     * @return The value of the Monitoring property for this object.
     */
    public Boolean getMonitoring() {
        return monitoring;
    }
    
    /**
     * Returns the value of the SubnetId property for this object.
     *
     * @return The value of the SubnetId property for this object.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * Sets the value of the SubnetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The new value for the SubnetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    
    
    /**
     * Returns the value of the DisableApiTermination property for this
     * object.
     *
     * @return The value of the DisableApiTermination property for this object.
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Sets the value of the DisableApiTermination property for this object.
     *
     * @param disableApiTermination The new value for the DisableApiTermination property for this object.
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * Sets the value of the DisableApiTermination property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination The new value for the DisableApiTermination property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }
    
    
    /**
     * Returns the value of the DisableApiTermination property for this
     * object.
     *
     * @return The value of the DisableApiTermination property for this object.
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Returns the value of the InstanceInitiatedShutdownBehavior property
     * for this object.
     *
     * @return The value of the InstanceInitiatedShutdownBehavior property for this
     *         object.
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Sets the value of the InstanceInitiatedShutdownBehavior property for
     * this object.
     *
     * @param instanceInitiatedShutdownBehavior The new value for the InstanceInitiatedShutdownBehavior property for
     *         this object.
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Sets the value of the InstanceInitiatedShutdownBehavior property for
     * this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInitiatedShutdownBehavior The new value for the InstanceInitiatedShutdownBehavior property for
     *         this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImportInstanceLaunchSpecification withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }
    
    
    /**
     * Returns the value of the PrivateIpAddress property for this object.
     *
     * @return The value of the PrivateIpAddress property for this object.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * Sets the value of the PrivateIpAddress property for this object.
     *
     * @param privateIpAddress The new value for the PrivateIpAddress property for this object.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * Sets the value of the PrivateIpAddress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The new value for the PrivateIpAddress property for this object.
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
        if (architecture != null) sb.append("Architecture: " + architecture + ", ");
        if (securityGroups != null) sb.append("SecurityGroups: " + securityGroups + ", ");
        if (additionalInfo != null) sb.append("AdditionalInfo: " + additionalInfo + ", ");
        if (userData != null) sb.append("UserData: " + userData + ", ");
        if (instanceType != null) sb.append("InstanceType: " + instanceType + ", ");
        if (placement != null) sb.append("Placement: " + placement + ", ");
        if (blockDeviceMappings != null) sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        if (monitoring != null) sb.append("Monitoring: " + monitoring + ", ");
        if (subnetId != null) sb.append("SubnetId: " + subnetId + ", ");
        if (disableApiTermination != null) sb.append("DisableApiTermination: " + disableApiTermination + ", ");
        if (instanceInitiatedShutdownBehavior != null) sb.append("InstanceInitiatedShutdownBehavior: " + instanceInitiatedShutdownBehavior + ", ");
        if (privateIpAddress != null) sb.append("PrivateIpAddress: " + privateIpAddress + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((isMonitoring() == null) ? 0 : isMonitoring().hashCode()); 
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((isDisableApiTermination() == null) ? 0 : isDisableApiTermination().hashCode()); 
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
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null) return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false) return false; 
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null) return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getPlacement() == null ^ this.getPlacement() == null) return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false) return false; 
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
        return true;
    }
    
}
    