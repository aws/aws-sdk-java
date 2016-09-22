/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVolumeAttributeRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVolumeAttribute.
 * </p>
 */
public class DescribeVolumeAttributeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVolumeAttributeRequest> {

    /**
     * <p>
     * The ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The instance attribute.
     * </p>
     */
    private String attribute;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumeAttributeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @see VolumeAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @return The instance attribute.
     * @see VolumeAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeAttributeName
     */

    public DescribeVolumeAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @see VolumeAttributeName
     */

    public void setAttribute(VolumeAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeAttributeName
     */

    public DescribeVolumeAttributeRequest withAttribute(VolumeAttributeName attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVolumeAttributeRequest> getDryRunRequest() {
        Request<DescribeVolumeAttributeRequest> request = new DescribeVolumeAttributeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumeAttributeRequest == false)
            return false;
        DescribeVolumeAttributeRequest other = (DescribeVolumeAttributeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumeAttributeRequest clone() {
        return (DescribeVolumeAttributeRequest) super.clone();
    }
}
