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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInstanceAttribute(DescribeInstanceAttributeRequest) DescribeInstanceAttribute operation}.
 * <p>
 * Returns information about an attribute of an instance. Only one attribute can be specified per call.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstanceAttribute(DescribeInstanceAttributeRequest)
 */
public class DescribeInstanceAttributeRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the instance whose instance attribute is being described.
     */
    private String instanceId;

    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     * <code>userData</code>, <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     */
    private String attribute;

    /**
     * Default constructor for a new DescribeInstanceAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeInstanceAttributeRequest() {}
    
    /**
     * Constructs a new DescribeInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance whose instance attribute is
     * being described.
     * @param attribute The name of the attribute to describe. <p> Available
     * attribute names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     */
    public DescribeInstanceAttributeRequest(String instanceId, String attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute;
    }

    
    
    /**
     * Constructs a new DescribeInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance whose instance attribute is
     * being described.
     * @param attribute The name of the attribute to describe. <p> Available
     * attribute names: <code>instanceType</code>, <code>kernel</code>,
     * <code>ramdisk</code>, <code>userData</code>,
     * <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     */
    public DescribeInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
        this.instanceId = instanceId;
        this.attribute = attribute.toString();
    }
    
    /**
     * The ID of the instance whose instance attribute is being described.
     *
     * @return The ID of the instance whose instance attribute is being described.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance whose instance attribute is being described.
     *
     * @param instanceId The ID of the instance whose instance attribute is being described.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance whose instance attribute is being described.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance whose instance attribute is being described.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     * <code>userData</code>, <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @return The name of the attribute to describe. <p> Available attribute names:
     *         <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     *         <code>userData</code>, <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     *
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     * <code>userData</code>, <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     *         <code>userData</code>, <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     * <code>userData</code>, <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     *         <code>userData</code>, <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceAttributeName
     */
    public DescribeInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }
    
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     * <code>userData</code>, <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     *         <code>userData</code>, <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The name of the attribute to describe. <p> Available attribute names:
     * <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     * <code>userData</code>, <code>disableApiTermination</code>,
     * <code>instanceInitiatedShutdownBehavior</code>,
     * <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet
     *
     * @param attribute The name of the attribute to describe. <p> Available attribute names:
     *         <code>instanceType</code>, <code>kernel</code>, <code>ramdisk</code>,
     *         <code>userData</code>, <code>disableApiTermination</code>,
     *         <code>instanceInitiatedShutdownBehavior</code>,
     *         <code>rootDeviceName</code>, <code>blockDeviceMapping</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see InstanceAttributeName
     */
    public DescribeInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
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
        if (instanceId != null) sb.append("InstanceId: " + instanceId + ", ");
        if (attribute != null) sb.append("Attribute: " + attribute + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeInstanceAttributeRequest == false) return false;
        DescribeInstanceAttributeRequest other = (DescribeInstanceAttributeRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    