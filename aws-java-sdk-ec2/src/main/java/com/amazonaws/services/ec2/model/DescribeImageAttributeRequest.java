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
import com.amazonaws.services.ec2.model.transform.DescribeImageAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeImageAttribute.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeImageAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeImageAttributeRequest> {

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get information about the
     * block device mapping for the AMI.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;

    /**
     * Default constructor for DescribeImageAttributeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DescribeImageAttributeRequest() {
    }

    /**
     * Constructs a new DescribeImageAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param imageId
     *        The ID of the AMI.
     * @param attribute
     *        The AMI attribute.</p>
     *        <p>
     *        <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *        return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *        information about the block device mapping for the AMI.
     */
    public DescribeImageAttributeRequest(String imageId, String attribute) {
        setImageId(imageId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new DescribeImageAttributeRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param imageId
     *        The ID of the AMI.
     * @param attribute
     *        The AMI attribute.</p>
     *        <p>
     *        <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *        return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *        information about the block device mapping for the AMI.
     */
    public DescribeImageAttributeRequest(String imageId, ImageAttributeName attribute) {
        setImageId(imageId);
        setAttribute(attribute.toString());
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get information about the
     * block device mapping for the AMI.
     * </p>
     * 
     * @param attribute
     *        The AMI attribute.</p>
     *        <p>
     *        <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *        return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *        information about the block device mapping for the AMI.
     * @see ImageAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get information about the
     * block device mapping for the AMI.
     * </p>
     * 
     * @return The AMI attribute.</p>
     *         <p>
     *         <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *         return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *         information about the block device mapping for the AMI.
     * @see ImageAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get information about the
     * block device mapping for the AMI.
     * </p>
     * 
     * @param attribute
     *        The AMI attribute.</p>
     *        <p>
     *        <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *        return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *        information about the block device mapping for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageAttributeName
     */

    public DescribeImageAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get information about the
     * block device mapping for the AMI.
     * </p>
     * 
     * @param attribute
     *        The AMI attribute.</p>
     *        <p>
     *        <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *        return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *        information about the block device mapping for the AMI.
     * @see ImageAttributeName
     */

    public void setAttribute(ImageAttributeName attribute) {
        withAttribute(attribute);
    }

    /**
     * <p>
     * The AMI attribute.
     * </p>
     * <p>
     * <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may return a
     * <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get information about the
     * block device mapping for the AMI.
     * </p>
     * 
     * @param attribute
     *        The AMI attribute.</p>
     *        <p>
     *        <b>Note</b>: Depending on your account privileges, the <code>blockDeviceMapping</code> attribute may
     *        return a <code>Client.AuthFailure</code> error. If this happens, use <a>DescribeImages</a> to get
     *        information about the block device mapping for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageAttributeName
     */

    public DescribeImageAttributeRequest withAttribute(ImageAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeImageAttributeRequest withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeImageAttributeRequest> getDryRunRequest() {
        Request<DescribeImageAttributeRequest> request = new DescribeImageAttributeRequestMarshaller().marshall(this);
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
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImageAttributeRequest == false)
            return false;
        DescribeImageAttributeRequest other = (DescribeImageAttributeRequest) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImageAttributeRequest clone() {
        return (DescribeImageAttributeRequest) super.clone();
    }
}
