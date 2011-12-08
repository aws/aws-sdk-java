/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyInstanceAttribute(ModifyInstanceAttributeRequest) ModifyInstanceAttribute operation}.
 * <p>
 * Modifies an attribute of an instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyInstanceAttribute(ModifyInstanceAttributeRequest)
 */
public class ModifyInstanceAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the instance whose attribute is being modified.
     */
    private String instanceId;

    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDevice</code>, <code>blockDeviceMapping</code>
     */
    private String attribute;

    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code> or
     * <code>instanceInitiateShutdownBehavior</code> is specified as the
     * attribute being modified.
     */
    private String value;

    /**
     * The new block device mappings for the instance whose attributes are
     * being modified. <p> Only valid when blockDeviceMapping is specified as
     * the attribute being modified.
     */
    private java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;

    /**
     * Boolean value
     */
    private Boolean sourceDestCheck;

    /**
     * Boolean value
     */
    private Boolean disableApiTermination;

    /**
     * String value
     */
    private String instanceType;

    /**
     * String value
     */
    private String kernel;

    /**
     * String value
     */
    private String ramdisk;

    /**
     * String value
     */
    private String userData;

    /**
     * String value
     */
    private String instanceInitiatedShutdownBehavior;

    private java.util.List<String> groups;

    /**
     * Default constructor for a new ModifyInstanceAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyInstanceAttributeRequest() {}
    
    /**
     * Constructs a new ModifyInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance whose attribute is being
     * modified.
     * @param attribute The name of the attribute being modified. <p>
     * Available attribute names: <code>instanceType</code>,
     * <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDevice</code>, <code>blockDeviceMapping</code>
     */
    public ModifyInstanceAttributeRequest(String instanceId, String attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute;
    }

    
    
    /**
     * The ID of the instance whose attribute is being modified.
     *
     * @return The ID of the instance whose attribute is being modified.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance whose attribute is being modified.
     *
     * @param instanceId The ID of the instance whose attribute is being modified.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance whose attribute is being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance whose attribute is being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDevice</code>, <code>blockDeviceMapping</code>
     *
     * @return The name of the attribute being modified. <p> Available attribute
     *         names: <code>instanceType</code>, <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDevice</code>, <code>blockDeviceMapping</code>
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDevice</code>, <code>blockDeviceMapping</code>
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>instanceType</code>, <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDevice</code>, <code>blockDeviceMapping</code>
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDevice</code>, <code>blockDeviceMapping</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>instanceType</code>, <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDevice</code>, <code>blockDeviceMapping</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code> or
     * <code>instanceInitiateShutdownBehavior</code> is specified as the
     * attribute being modified.
     *
     * @return The new value of the instance attribute being modified. <p> Only valid
     *         when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code> or
     *         <code>instanceInitiateShutdownBehavior</code> is specified as the
     *         attribute being modified.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code> or
     * <code>instanceInitiateShutdownBehavior</code> is specified as the
     * attribute being modified.
     *
     * @param value The new value of the instance attribute being modified. <p> Only valid
     *         when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code> or
     *         <code>instanceInitiateShutdownBehavior</code> is specified as the
     *         attribute being modified.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code> or
     * <code>instanceInitiateShutdownBehavior</code> is specified as the
     * attribute being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The new value of the instance attribute being modified. <p> Only valid
     *         when <code>kernel</code>, <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code> or
     *         <code>instanceInitiateShutdownBehavior</code> is specified as the
     *         attribute being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withValue(String value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * The new block device mappings for the instance whose attributes are
     * being modified. <p> Only valid when blockDeviceMapping is specified as
     * the attribute being modified.
     *
     * @return The new block device mappings for the instance whose attributes are
     *         being modified. <p> Only valid when blockDeviceMapping is specified as
     *         the attribute being modified.
     */
    public java.util.List<InstanceBlockDeviceMappingSpecification> getBlockDeviceMappings() {
        
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * The new block device mappings for the instance whose attributes are
     * being modified. <p> Only valid when blockDeviceMapping is specified as
     * the attribute being modified.
     *
     * @param blockDeviceMappings The new block device mappings for the instance whose attributes are
     *         being modified. <p> Only valid when blockDeviceMapping is specified as
     *         the attribute being modified.
     */
    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
        java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * The new block device mappings for the instance whose attributes are
     * being modified. <p> Only valid when blockDeviceMapping is specified as
     * the attribute being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The new block device mappings for the instance whose attributes are
     *         being modified. <p> Only valid when blockDeviceMapping is specified as
     *         the attribute being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withBlockDeviceMappings(InstanceBlockDeviceMappingSpecification... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>());
        for (InstanceBlockDeviceMappingSpecification value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * The new block device mappings for the instance whose attributes are
     * being modified. <p> Only valid when blockDeviceMapping is specified as
     * the attribute being modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The new block device mappings for the instance whose attributes are
     *         being modified. <p> Only valid when blockDeviceMapping is specified as
     *         the attribute being modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMappingSpecification> blockDeviceMappings) {
        java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappingsCopy = new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;

        return this;
    }
    
    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Boolean value
     *
     * @param sourceDestCheck Boolean value
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }
    
    
    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Boolean value
     *
     * @param disableApiTermination Boolean value
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }
    
    
    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * String value
     *
     * @return String value
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * String value
     *
     * @param instanceType String value
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    
    
    /**
     * String value
     *
     * @return String value
     */
    public String getKernel() {
        return kernel;
    }
    
    /**
     * String value
     *
     * @param kernel String value
     */
    public void setKernel(String kernel) {
        this.kernel = kernel;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernel String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withKernel(String kernel) {
        this.kernel = kernel;
        return this;
    }
    
    
    /**
     * String value
     *
     * @return String value
     */
    public String getRamdisk() {
        return ramdisk;
    }
    
    /**
     * String value
     *
     * @param ramdisk String value
     */
    public void setRamdisk(String ramdisk) {
        this.ramdisk = ramdisk;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdisk String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withRamdisk(String ramdisk) {
        this.ramdisk = ramdisk;
        return this;
    }
    
    
    /**
     * String value
     *
     * @return String value
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * String value
     *
     * @param userData String value
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }
    
    
    /**
     * String value
     *
     * @return String value
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * String value
     *
     * @param instanceInitiatedShutdownBehavior String value
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInitiatedShutdownBehavior String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }
    
    
    /**
     * Returns the value of the Groups property for this object.
     *
     * @return The value of the Groups property for this object.
     */
    public java.util.List<String> getGroups() {
        
        if (groups == null) {
            groups = new java.util.ArrayList<String>();
        }
        return groups;
    }
    
    /**
     * Sets the value of the Groups property for this object.
     *
     * @param groups The new value for the Groups property for this object.
     */
    public void setGroups(java.util.Collection<String> groups) {
        java.util.List<String> groupsCopy = new java.util.ArrayList<String>();
        if (groups != null) {
            groupsCopy.addAll(groups);
        }
        this.groups = groupsCopy;
    }
    
    /**
     * Sets the value of the Groups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The new value for the Groups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withGroups(String... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<String>());
        for (String value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Groups property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The new value for the Groups property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyInstanceAttributeRequest withGroups(java.util.Collection<String> groups) {
        java.util.List<String> groupsCopy = new java.util.ArrayList<String>();
        if (groups != null) {
            groupsCopy.addAll(groups);
        }
        this.groups = groupsCopy;

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
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("Attribute: " + attribute + ", ");
        sb.append("Value: " + value + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("SourceDestCheck: " + sourceDestCheck + ", ");
        sb.append("DisableApiTermination: " + disableApiTermination + ", ");
        sb.append("InstanceType: " + instanceType + ", ");
        sb.append("Kernel: " + kernel + ", ");
        sb.append("Ramdisk: " + ramdisk + ", ");
        sb.append("UserData: " + userData + ", ");
        sb.append("InstanceInitiatedShutdownBehavior: " + instanceInitiatedShutdownBehavior + ", ");
        sb.append("Groups: " + groups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    