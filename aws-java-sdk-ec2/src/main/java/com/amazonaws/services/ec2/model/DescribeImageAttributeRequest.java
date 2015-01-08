/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeImageAttributeRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeImageAttribute(DescribeImageAttributeRequest) DescribeImageAttribute operation}.
 * <p>
 * Describes the specified attribute of the specified AMI. You can
 * specify only one attribute at a time.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeImageAttribute(DescribeImageAttributeRequest)
 */
public class DescribeImageAttributeRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeImageAttributeRequest> {

    /**
     * The ID of the AMI.
     */
    private String imageId;

    /**
     * The AMI attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping
     */
    private String attribute;

    /**
     * Default constructor for a new DescribeImageAttributeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeImageAttributeRequest() {}
    
    /**
     * Constructs a new DescribeImageAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId The ID of the AMI.
     * @param attribute The AMI attribute.
     */
    public DescribeImageAttributeRequest(String imageId, String attribute) {
        setImageId(imageId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new DescribeImageAttributeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param imageId The ID of the AMI.
     * @param attribute The AMI attribute.
     */
    public DescribeImageAttributeRequest(String imageId, ImageAttributeName attribute) {
        this.imageId = imageId;
        this.attribute = attribute.toString();
    }

    /**
     * The ID of the AMI.
     *
     * @return The ID of the AMI.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI.
     *
     * @param imageId The ID of the AMI.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImageAttributeRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * The AMI attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping
     *
     * @return The AMI attribute.
     *
     * @see ImageAttributeName
     */
    public String getAttribute() {
        return attribute;
    }
    
    /**
     * The AMI attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping
     *
     * @param attribute The AMI attribute.
     *
     * @see ImageAttributeName
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    /**
     * The AMI attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping
     *
     * @param attribute The AMI attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ImageAttributeName
     */
    public DescribeImageAttributeRequest withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * The AMI attribute.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping
     *
     * @param attribute The AMI attribute.
     *
     * @see ImageAttributeName
     */
    public void setAttribute(ImageAttributeName attribute) {
        this.attribute = attribute.toString();
    }
    
    /**
     * The AMI attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>description, kernel, ramdisk, launchPermission, productCodes, blockDeviceMapping
     *
     * @param attribute The AMI attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ImageAttributeName
     */
    public DescribeImageAttributeRequest withAttribute(ImageAttributeName attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeImageAttributeRequest> getDryRunRequest() {
        Request<DescribeImageAttributeRequest> request = new DescribeImageAttributeRequestMarshaller().marshall(this);
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
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getAttribute() != null) sb.append("Attribute: " + getAttribute() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImageAttributeRequest == false) return false;
        DescribeImageAttributeRequest other = (DescribeImageAttributeRequest)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getAttribute() == null ^ this.getAttribute() == null) return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false) return false; 
        return true;
    }
    
}
    