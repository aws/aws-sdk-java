/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Modifies the specified attribute of the specified instance. You can
 * specify only one attribute at a time.
 * </p>
 * <p>
 * To modify some attributes, the instance must be stopped. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_ChangingAttributesWhileInstanceStopped.html"> Modifying Attributes of a Stopped Instance </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyInstanceAttribute(ModifyInstanceAttributeRequest)
 */
public class ModifyInstanceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ModifyInstanceAttributeRequest> {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The name of the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     */
    private String attribute;

    /**
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>intanceInitiateShutdownBehavior</code> attribute.
     */
    private String value;

    /**
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes
     * that are currently attached. The volume must be owned by the caller.
     * If no value is specified for <code>DeleteOnTermination</code>, the
     * default is <code>true</code> and the volume is deleted when the
     * instance is terminated. <p>To add instance store volumes to an Amazon
     * EBS-backed instance, you must add them when you launch the instance.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     * the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification> blockDeviceMappings;

    /**
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and
     * <code>false</code> means checking is disabled. This value must be
     * <code>false</code> for a NAT instance to perform NAT.
     */
    private Boolean sourceDestCheck;

    /**
     * Specifies whether to disable the ability to terminate the instance
     * using the Amazon EC2 console, CLI, and API.
     */
    private Boolean disableApiTermination;

    /**
     * Changes the instance type to the specified value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a>. If the instance type is not valid, the error returned is
     * <code>InvalidInstanceAttributeValue</code>.
     */
    private String instanceType;

    /**
     * Changes the instance's kernel to the specified value.
     */
    private String kernel;

    /**
     * Changes the instance's RAM disk to the specified value.
     */
    private String ramdisk;

    /**
     * Changes the instance's user data to the specified value.
     */
    private String userData;

    /**
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * [EC2-VPC] Changes the security groups of the instance. You must
     * specify at least one security group, even if it's just the default
     * security group for the VPC. You must specify the security group ID,
     * not the security group name. <p>For example, if you want the instance
     * to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     * <code>GroupId.1=sg-1a1a1a1a</code> and
     * <code>GroupId.2=sg-9b9b9b9b</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> groups;

    /**
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance.
     */
    private Boolean ebsOptimized;

    /**
     * 
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
     * @param instanceId The ID of the instance.
     * @param attribute The name of the attribute.
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
     * @param instanceId The ID of the instance.
     * @param attribute The name of the attribute.
     */
    public ModifyInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute.toString();
    }

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The name of the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @return The name of the attribute.
     *
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The name of the attribute.
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The name of the attribute.
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
     * The name of the attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The name of the attribute.
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The name of the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The name of the attribute.
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
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>intanceInitiateShutdownBehavior</code> attribute.
     *
     * @return A new value for the attribute. Use only with the <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>, or
     *         <code>intanceInitiateShutdownBehavior</code> attribute.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>intanceInitiateShutdownBehavior</code> attribute.
     *
     * @param value A new value for the attribute. Use only with the <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>, or
     *         <code>intanceInitiateShutdownBehavior</code> attribute.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * A new value for the attribute. Use only with the <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>, or
     * <code>intanceInitiateShutdownBehavior</code> attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value A new value for the attribute. Use only with the <code>kernel</code>,
     *         <code>ramdisk</code>, <code>userData</code>,
     *         <code>disableApiTermination</code>, or
     *         <code>intanceInitiateShutdownBehavior</code> attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes
     * that are currently attached. The volume must be owned by the caller.
     * If no value is specified for <code>DeleteOnTermination</code>, the
     * default is <code>true</code> and the volume is deleted when the
     * instance is terminated. <p>To add instance store volumes to an Amazon
     * EBS-backed instance, you must add them when you launch the instance.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     * the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @return Modifies the <code>DeleteOnTermination</code> attribute for volumes
     *         that are currently attached. The volume must be owned by the caller.
     *         If no value is specified for <code>DeleteOnTermination</code>, the
     *         default is <code>true</code> and the volume is deleted when the
     *         instance is terminated. <p>To add instance store volumes to an Amazon
     *         EBS-backed instance, you must add them when you launch the instance.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     *         the Block Device Mapping when Launching an Instance</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
     */
    public java.util.List<InstanceBlockDeviceMappingSpecification> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMappingSpecification>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes
     * that are currently attached. The volume must be owned by the caller.
     * If no value is specified for <code>DeleteOnTermination</code>, the
     * default is <code>true</code> and the volume is deleted when the
     * instance is terminated. <p>To add instance store volumes to an Amazon
     * EBS-backed instance, you must add them when you launch the instance.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     * the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     *
     * @param blockDeviceMappings Modifies the <code>DeleteOnTermination</code> attribute for volumes
     *         that are currently attached. The volume must be owned by the caller.
     *         If no value is specified for <code>DeleteOnTermination</code>, the
     *         default is <code>true</code> and the volume is deleted when the
     *         instance is terminated. <p>To add instance store volumes to an Amazon
     *         EBS-backed instance, you must add them when you launch the instance.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     *         the Block Device Mapping when Launching an Instance</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes
     * that are currently attached. The volume must be owned by the caller.
     * If no value is specified for <code>DeleteOnTermination</code>, the
     * default is <code>true</code> and the volume is deleted when the
     * instance is terminated. <p>To add instance store volumes to an Amazon
     * EBS-backed instance, you must add them when you launch the instance.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     * the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Modifies the <code>DeleteOnTermination</code> attribute for volumes
     *         that are currently attached. The volume must be owned by the caller.
     *         If no value is specified for <code>DeleteOnTermination</code>, the
     *         default is <code>true</code> and the volume is deleted when the
     *         instance is terminated. <p>To add instance store volumes to an Amazon
     *         EBS-backed instance, you must add them when you launch the instance.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     *         the Block Device Mapping when Launching an Instance</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * Modifies the <code>DeleteOnTermination</code> attribute for volumes
     * that are currently attached. The volume must be owned by the caller.
     * If no value is specified for <code>DeleteOnTermination</code>, the
     * default is <code>true</code> and the volume is deleted when the
     * instance is terminated. <p>To add instance store volumes to an Amazon
     * EBS-backed instance, you must add them when you launch the instance.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     * the Block Device Mapping when Launching an Instance</a> in the
     * <i>Amazon Elastic Compute Cloud User Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Modifies the <code>DeleteOnTermination</code> attribute for volumes
     *         that are currently attached. The volume must be owned by the caller.
     *         If no value is specified for <code>DeleteOnTermination</code>, the
     *         default is <code>true</code> and the volume is deleted when the
     *         instance is terminated. <p>To add instance store volumes to an Amazon
     *         EBS-backed instance, you must add them when you launch the instance.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating
     *         the Block Device Mapping when Launching an Instance</a> in the
     *         <i>Amazon Elastic Compute Cloud User Guide</i>.
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
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and
     * <code>false</code> means checking is disabled. This value must be
     * <code>false</code> for a NAT instance to perform NAT.
     *
     * @return Specifies whether source/destination checking is enabled. A value of
     *         <code>true</code> means that checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and
     * <code>false</code> means checking is disabled. This value must be
     * <code>false</code> for a NAT instance to perform NAT.
     *
     * @param sourceDestCheck Specifies whether source/destination checking is enabled. A value of
     *         <code>true</code> means that checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and
     * <code>false</code> means checking is disabled. This value must be
     * <code>false</code> for a NAT instance to perform NAT.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Specifies whether source/destination checking is enabled. A value of
     *         <code>true</code> means that checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Specifies whether source/destination checking is enabled. A value of
     * <code>true</code> means that checking is enabled, and
     * <code>false</code> means checking is disabled. This value must be
     * <code>false</code> for a NAT instance to perform NAT.
     *
     * @return Specifies whether source/destination checking is enabled. A value of
     *         <code>true</code> means that checking is enabled, and
     *         <code>false</code> means checking is disabled. This value must be
     *         <code>false</code> for a NAT instance to perform NAT.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * Specifies whether to disable the ability to terminate the instance
     * using the Amazon EC2 console, CLI, and API.
     *
     * @return Specifies whether to disable the ability to terminate the instance
     *         using the Amazon EC2 console, CLI, and API.
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Specifies whether to disable the ability to terminate the instance
     * using the Amazon EC2 console, CLI, and API.
     *
     * @param disableApiTermination Specifies whether to disable the ability to terminate the instance
     *         using the Amazon EC2 console, CLI, and API.
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * Specifies whether to disable the ability to terminate the instance
     * using the Amazon EC2 console, CLI, and API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination Specifies whether to disable the ability to terminate the instance
     *         using the Amazon EC2 console, CLI, and API.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * Specifies whether to disable the ability to terminate the instance
     * using the Amazon EC2 console, CLI, and API.
     *
     * @return Specifies whether to disable the ability to terminate the instance
     *         using the Amazon EC2 console, CLI, and API.
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * Changes the instance type to the specified value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a>. If the instance type is not valid, the error returned is
     * <code>InvalidInstanceAttributeValue</code>.
     *
     * @return Changes the instance type to the specified value. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a>. If the instance type is not valid, the error returned is
     *         <code>InvalidInstanceAttributeValue</code>.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * Changes the instance type to the specified value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a>. If the instance type is not valid, the error returned is
     * <code>InvalidInstanceAttributeValue</code>.
     *
     * @param instanceType Changes the instance type to the specified value. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a>. If the instance type is not valid, the error returned is
     *         <code>InvalidInstanceAttributeValue</code>.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * Changes the instance type to the specified value. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * Types</a>. If the instance type is not valid, the error returned is
     * <code>InvalidInstanceAttributeValue</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType Changes the instance type to the specified value. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     *         Types</a>. If the instance type is not valid, the error returned is
     *         <code>InvalidInstanceAttributeValue</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * Changes the instance's kernel to the specified value.
     *
     * @return Changes the instance's kernel to the specified value.
     */
    public String getKernel() {
        return kernel;
    }
    
    /**
     * Changes the instance's kernel to the specified value.
     *
     * @param kernel Changes the instance's kernel to the specified value.
     */
    public void setKernel(String kernel) {
        this.kernel = kernel;
    }
    
    /**
     * Changes the instance's kernel to the specified value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernel Changes the instance's kernel to the specified value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withKernel(String kernel) {
        this.kernel = kernel;
        return this;
    }

    /**
     * Changes the instance's RAM disk to the specified value.
     *
     * @return Changes the instance's RAM disk to the specified value.
     */
    public String getRamdisk() {
        return ramdisk;
    }
    
    /**
     * Changes the instance's RAM disk to the specified value.
     *
     * @param ramdisk Changes the instance's RAM disk to the specified value.
     */
    public void setRamdisk(String ramdisk) {
        this.ramdisk = ramdisk;
    }
    
    /**
     * Changes the instance's RAM disk to the specified value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdisk Changes the instance's RAM disk to the specified value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withRamdisk(String ramdisk) {
        this.ramdisk = ramdisk;
        return this;
    }

    /**
     * Changes the instance's user data to the specified value.
     *
     * @return Changes the instance's user data to the specified value.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * Changes the instance's user data to the specified value.
     *
     * @param userData Changes the instance's user data to the specified value.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * Changes the instance's user data to the specified value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData Changes the instance's user data to the specified value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     *
     * @return Specifies whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     *
     * @param instanceInitiatedShutdownBehavior Specifies whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Specifies whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInitiatedShutdownBehavior Specifies whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * [EC2-VPC] Changes the security groups of the instance. You must
     * specify at least one security group, even if it's just the default
     * security group for the VPC. You must specify the security group ID,
     * not the security group name. <p>For example, if you want the instance
     * to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     * <code>GroupId.1=sg-1a1a1a1a</code> and
     * <code>GroupId.2=sg-9b9b9b9b</code>.
     *
     * @return [EC2-VPC] Changes the security groups of the instance. You must
     *         specify at least one security group, even if it's just the default
     *         security group for the VPC. You must specify the security group ID,
     *         not the security group name. <p>For example, if you want the instance
     *         to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     *         <code>GroupId.1=sg-1a1a1a1a</code> and
     *         <code>GroupId.2=sg-9b9b9b9b</code>.
     */
    public java.util.List<String> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * [EC2-VPC] Changes the security groups of the instance. You must
     * specify at least one security group, even if it's just the default
     * security group for the VPC. You must specify the security group ID,
     * not the security group name. <p>For example, if you want the instance
     * to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     * <code>GroupId.1=sg-1a1a1a1a</code> and
     * <code>GroupId.2=sg-9b9b9b9b</code>.
     *
     * @param groups [EC2-VPC] Changes the security groups of the instance. You must
     *         specify at least one security group, even if it's just the default
     *         security group for the VPC. You must specify the security group ID,
     *         not the security group name. <p>For example, if you want the instance
     *         to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     *         <code>GroupId.1=sg-1a1a1a1a</code> and
     *         <code>GroupId.2=sg-9b9b9b9b</code>.
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
     * [EC2-VPC] Changes the security groups of the instance. You must
     * specify at least one security group, even if it's just the default
     * security group for the VPC. You must specify the security group ID,
     * not the security group name. <p>For example, if you want the instance
     * to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     * <code>GroupId.1=sg-1a1a1a1a</code> and
     * <code>GroupId.2=sg-9b9b9b9b</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups [EC2-VPC] Changes the security groups of the instance. You must
     *         specify at least one security group, even if it's just the default
     *         security group for the VPC. You must specify the security group ID,
     *         not the security group name. <p>For example, if you want the instance
     *         to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     *         <code>GroupId.1=sg-1a1a1a1a</code> and
     *         <code>GroupId.2=sg-9b9b9b9b</code>.
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
     * [EC2-VPC] Changes the security groups of the instance. You must
     * specify at least one security group, even if it's just the default
     * security group for the VPC. You must specify the security group ID,
     * not the security group name. <p>For example, if you want the instance
     * to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     * <code>GroupId.1=sg-1a1a1a1a</code> and
     * <code>GroupId.2=sg-9b9b9b9b</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups [EC2-VPC] Changes the security groups of the instance. You must
     *         specify at least one security group, even if it's just the default
     *         security group for the VPC. You must specify the security group ID,
     *         not the security group name. <p>For example, if you want the instance
     *         to be in sg-1a1a1a1a and sg-9b9b9b9b, specify
     *         <code>GroupId.1=sg-1a1a1a1a</code> and
     *         <code>GroupId.2=sg-9b9b9b9b</code>.
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
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance.
     *
     * @return Specifies whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance.
     *
     * @param ebsOptimized Specifies whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Specifies whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyInstanceAttributeRequest withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Specifies whether the instance is optimized for EBS I/O. This
     * optimization provides dedicated throughput to Amazon EBS and an
     * optimized configuration stack to provide optimal EBS I/O performance.
     * This optimization isn't available with all instance types. Additional
     * usage charges apply when using an EBS Optimized instance.
     *
     * @return Specifies whether the instance is optimized for EBS I/O. This
     *         optimization provides dedicated throughput to Amazon EBS and an
     *         optimized configuration stack to provide optimal EBS I/O performance.
     *         This optimization isn't available with all instance types. Additional
     *         usage charges apply when using an EBS Optimized instance.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * 
     *
     * @return 
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * 
     *
     * @param sriovNetSupport 
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport 
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
    