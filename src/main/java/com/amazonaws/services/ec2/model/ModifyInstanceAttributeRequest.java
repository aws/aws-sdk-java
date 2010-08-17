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
     * names: kernel, ramdisk, userData, blockDeviceMapping,
     * disableApiTermination, instanceInitiatedShutdownBehavior
     */
    private String attribute;

    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when kernel, ramdisk, userData disableApiTermination, or
     * instanceInitiateShutdownBehavior is specified as the attribute being
     * modified.
     */
    private String value;

    /**
     * The new block device mappings for the instance whose attributes are
     * being modified. <p> Only valid when blockDeviceMapping is specified as
     * the attribute being modified.
     */
    private java.util.List<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;

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
     * Available attribute names: kernel, ramdisk, userData,
     * blockDeviceMapping, disableApiTermination,
     * instanceInitiatedShutdownBehavior
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
     * names: kernel, ramdisk, userData, blockDeviceMapping,
     * disableApiTermination, instanceInitiatedShutdownBehavior
     *
     * @return The name of the attribute being modified. <p> Available attribute
     *         names: kernel, ramdisk, userData, blockDeviceMapping,
     *         disableApiTermination, instanceInitiatedShutdownBehavior
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: kernel, ramdisk, userData, blockDeviceMapping,
     * disableApiTermination, instanceInitiatedShutdownBehavior
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: kernel, ramdisk, userData, blockDeviceMapping,
     *         disableApiTermination, instanceInitiatedShutdownBehavior
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: kernel, ramdisk, userData, blockDeviceMapping,
     * disableApiTermination, instanceInitiatedShutdownBehavior
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: kernel, ramdisk, userData, blockDeviceMapping,
     *         disableApiTermination, instanceInitiatedShutdownBehavior
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
     * when kernel, ramdisk, userData disableApiTermination, or
     * instanceInitiateShutdownBehavior is specified as the attribute being
     * modified.
     *
     * @return The new value of the instance attribute being modified. <p> Only valid
     *         when kernel, ramdisk, userData disableApiTermination, or
     *         instanceInitiateShutdownBehavior is specified as the attribute being
     *         modified.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when kernel, ramdisk, userData disableApiTermination, or
     * instanceInitiateShutdownBehavior is specified as the attribute being
     * modified.
     *
     * @param value The new value of the instance attribute being modified. <p> Only valid
     *         when kernel, ramdisk, userData disableApiTermination, or
     *         instanceInitiateShutdownBehavior is specified as the attribute being
     *         modified.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The new value of the instance attribute being modified. <p> Only valid
     * when kernel, ramdisk, userData disableApiTermination, or
     * instanceInitiateShutdownBehavior is specified as the attribute being
     * modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The new value of the instance attribute being modified. <p> Only valid
     *         when kernel, ramdisk, userData disableApiTermination, or
     *         instanceInitiateShutdownBehavior is specified as the attribute being
     *         modified.
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
        sb.append("}");
        return sb.toString();
    }
    
}
    