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
import com.amazonaws.services.ec2.model.transform.ResetInstanceAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#resetInstanceAttribute(ResetInstanceAttributeRequest) ResetInstanceAttribute operation}.
 * <p>
 * Resets an attribute of an instance to its default value. To reset the
 * kernel or RAM disk, the instance must be in a stopped state. To reset
 * the <code>SourceDestCheck</code> , the instance can be either running
 * or stopped.
 * </p>
 * <p>
 * The <code>SourceDestCheck</code> attribute controls whether
 * source/destination checking is enabled. The default value is
 * <code>true</code> , which means checking is enabled. This value must
 * be <code>false</code> for a NAT instance to perform NAT. For more
 * information, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_NAT_Instance.html"> NAT Instances </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#resetInstanceAttribute(ResetInstanceAttributeRequest)
 */
public class ResetInstanceAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<ResetInstanceAttributeRequest> {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The attribute to reset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     */
    private String attribute;

    /**
     * Default constructor for a new ResetInstanceAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResetInstanceAttributeRequest() {}
    
    /**
     * Constructs a new ResetInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance.
     * @param attribute The attribute to reset.
     */
    public ResetInstanceAttributeRequest(String instanceId, String attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new ResetInstanceAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The ID of the instance.
     * @param attribute The attribute to reset.
     */
    public ResetInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
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
    public ResetInstanceAttributeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The attribute to reset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @return The attribute to reset.
     *
     * @see InstanceAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The attribute to reset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The attribute to reset.
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The attribute to reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The attribute to reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceAttributeName
     */
    public ResetInstanceAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The attribute to reset.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The attribute to reset.
     *
     * @see InstanceAttributeName
     */
    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The attribute to reset.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>instanceType, kernel, ramdisk, userData, disableApiTermination, instanceInitiatedShutdownBehavior, rootDeviceName, blockDeviceMapping, productCodes, sourceDestCheck, groupSet, ebsOptimized
     *
     * @param attribute The attribute to reset.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceAttributeName
     */
    public ResetInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<ResetInstanceAttributeRequest> getDryRunRequest() {
        Request<ResetInstanceAttributeRequest> request = new ResetInstanceAttributeRequestMarshaller().marshall(this);
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

        if (obj instanceof ResetInstanceAttributeRequest == false) return false;
        ResetInstanceAttributeRequest other = (ResetInstanceAttributeRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    