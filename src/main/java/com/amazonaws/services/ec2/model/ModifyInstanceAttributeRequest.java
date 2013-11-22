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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyInstanceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyInstanceAttribute(ModifyInstanceAttributeRequest) ModifyInstanceAttribute operation}.
 * <p>
 * Modifies an attribute of an instance.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyInstanceAttribute(ModifyInstanceAttributeRequest)
 */
public class ModifyInstanceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifyInstanceAttributeRequest> {

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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
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
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;

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

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * Boolean value
     */
    private Boolean ebsOptimized;

    /**
     * String value
     */
    private String sriovNetSupport;

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
        setInstanceId(instanceId);
        setAttribute(attribute);
    }

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
    public ModifyInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute.toString();
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @return The name of the attribute being modified. <p> Available attribute
     *         names: <code>instanceType</code>, <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDevice</code>, <code>blockDeviceMapping</code>
     *
     * @see InstanceAttributeName
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>instanceType</code>, <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDevice</code>, <code>blockDeviceMapping</code>
     *
     * @see InstanceAttributeName
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
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
     *
     * @see InstanceAttributeName
     */
    public ModifyInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The name of the attribute being modified. <p> Available attribute
     * names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDevice</code>, <code>blockDeviceMapping</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The name of the attribute being modified. <p> Available attribute
     *         names: <code>instanceType</code>, <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDevice</code>, <code>blockDeviceMapping</code>
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
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
     *
     * @see InstanceAttributeName
     */
    public ModifyInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
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
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification>();
              blockDeviceMappings.setAutoConstruct(true);
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
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
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
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMappingSpecification>(blockDeviceMappings.length));
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
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

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
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * Sets the value of the Groups property for this object.
     *
     * @param groups The new value for the Groups property for this object.
     */
    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
        groupsCopy.addAll(groups);
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
        if (getGroups() == null) setGroups(new java.util.ArrayList<String>(groups.length));
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
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Boolean value
     *
     * @param ebsOptimized Boolean value
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * String value
     *
     * @return String value
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * String value
     *
     * @param sriovNetSupport String value
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceAttributeRequest> getDryRunRequest() {
        Request<ModifyInstanceAttributeRequest> request = new ModifyInstanceAttributeRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (isSourceDestCheck() != null) sb.append("SourceDestCheck: " + isSourceDestCheck() + ",");
        if (isDisableApiTermination() != null) sb.append("DisableApiTermination: " + isDisableApiTermination() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernel() != null) sb.append("Kernel: " + getKernel() + ",");
        if (getRamdisk() != null) sb.append("Ramdisk: " + getRamdisk() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null) sb.append("InstanceInitiatedShutdownBehavior: " + getInstanceInitiatedShutdownBehavior() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((isSourceDestCheck() == null) ? 0 : isSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((isDisableApiTermination() == null) ? 0 : isDisableApiTermination().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getKernel() == null) ? 0 : getKernel().hashCode()); 
        hashCode = prime * hashCode + ((getRamdisk() == null) ? 0 : getRamdisk().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyInstanceAttributeRequest == false) return false;
        ModifyInstanceAttributeRequest other = (ModifyInstanceAttributeRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.isSourceDestCheck() == null ^ this.isSourceDestCheck() == null) return false;
        if (other.isSourceDestCheck() != null && other.isSourceDestCheck().equals(this.isSourceDestCheck()) == false) return false; 
        if (other.isDisableApiTermination() == null ^ this.isDisableApiTermination() == null) return false;
        if (other.isDisableApiTermination() != null && other.isDisableApiTermination().equals(this.isDisableApiTermination()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getKernel() == null ^ this.getKernel() == null) return false;
        if (other.getKernel() != null && other.getKernel().equals(this.getKernel()) == false) return false; 
        if (other.getRamdisk() == null ^ this.getRamdisk() == null) return false;
        if (other.getRamdisk() != null && other.getRamdisk().equals(this.getRamdisk()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null) return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null) return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false) return false; 
        return true;
    }
    
}
    