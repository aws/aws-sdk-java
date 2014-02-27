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
import com.amazonaws.services.ec2.model.transform.DescribeInstanceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInstanceAttribute(DescribeInstanceAttributeRequest) DescribeInstanceAttribute operation}.
 * <p>
 * Describes an attribute of the specified instance. You can specify only
 * one attribute at a time.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstanceAttribute(DescribeInstanceAttributeRequest)
 */
public class DescribeInstanceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeInstanceAttributeRequest> {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The instance attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
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
     * @param instanceId The ID of the instance.
     * @param attribute The instance attribute.
     */
    public DescribeInstanceAttributeRequest(String instanceId, String attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new DescribeInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance.
     * @param attribute The instance attribute.
     */
    public DescribeInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
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
    public DescribeInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @return The instance attribute.
     *
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The instance attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The instance attribute.
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The instance attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The instance attribute.
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
     * The instance attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The instance attribute.
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The instance attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The instance attribute.
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeInstanceAttributeRequest> getDryRunRequest() {
        Request<DescribeInstanceAttributeRequest> request = new DescribeInstanceAttributeRequestMarshaller().marshall(this);
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
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() );
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
    