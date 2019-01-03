/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ResetInstanceAttributeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResetInstanceAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ResetInstanceAttributeRequest> {

    /**
     * <p>
     * The attribute to reset.
     * </p>
     * <important>
     * <p>
     * You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     * <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * </important>
     */
    private String attribute;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * Default constructor for ResetInstanceAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ResetInstanceAttributeRequest() {
    }

    /**
     * Constructs a new ResetInstanceAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param attribute
     *        The attribute to reset.</p> <important>
     *        <p>
     *        You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *        <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *        </p>
     */
    public ResetInstanceAttributeRequest(String instanceId, String attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new ResetInstanceAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param attribute
     *        The attribute to reset.</p> <important>
     *        <p>
     *        You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *        <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *        </p>
     */
    public ResetInstanceAttributeRequest(String instanceId, InstanceAttributeName attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute.toString());
    }

    /**
     * <p>
     * The attribute to reset.
     * </p>
     * <important>
     * <p>
     * You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     * <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * </important>
     * 
     * @param attribute
     *        The attribute to reset.</p> <important>
     *        <p>
     *        You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *        <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *        </p>
     * @see InstanceAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute to reset.
     * </p>
     * <important>
     * <p>
     * You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     * <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * </important>
     * 
     * @return The attribute to reset.</p> <important>
     *         <p>
     *         You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *         <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *         </p>
     * @see InstanceAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute to reset.
     * </p>
     * <important>
     * <p>
     * You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     * <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * </important>
     * 
     * @param attribute
     *        The attribute to reset.</p> <important>
     *        <p>
     *        You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *        <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAttributeName
     */

    public ResetInstanceAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute to reset.
     * </p>
     * <important>
     * <p>
     * You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     * <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * </important>
     * 
     * @param attribute
     *        The attribute to reset.</p> <important>
     *        <p>
     *        You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *        <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *        </p>
     * @see InstanceAttributeName
     */

    public void setAttribute(InstanceAttributeName attribute) {
        withAttribute(attribute);
    }

    /**
     * <p>
     * The attribute to reset.
     * </p>
     * <important>
     * <p>
     * You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     * <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     * </p>
     * </important>
     * 
     * @param attribute
     *        The attribute to reset.</p> <important>
     *        <p>
     *        You can only reset the following attributes: <code>kernel</code> | <code>ramdisk</code> |
     *        <code>sourceDestCheck</code>. To change an instance attribute, use <a>ModifyInstanceAttribute</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAttributeName
     */

    public ResetInstanceAttributeRequest withAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResetInstanceAttributeRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ResetInstanceAttributeRequest> getDryRunRequest() {
        Request<ResetInstanceAttributeRequest> request = new ResetInstanceAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetInstanceAttributeRequest == false)
            return false;
        ResetInstanceAttributeRequest other = (ResetInstanceAttributeRequest) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public ResetInstanceAttributeRequest clone() {
        return (ResetInstanceAttributeRequest) super.clone();
    }
}
