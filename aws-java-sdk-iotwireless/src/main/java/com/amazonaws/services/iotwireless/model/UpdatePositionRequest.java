/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdatePosition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resource identifier of the resource for which position is updated.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * Resource type of the resource for which position is updated.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The position information of the resource.
     * </p>
     */
    private java.util.List<Float> position;

    /**
     * <p>
     * Resource identifier of the resource for which position is updated.
     * </p>
     * 
     * @param resourceIdentifier
     *        Resource identifier of the resource for which position is updated.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Resource identifier of the resource for which position is updated.
     * </p>
     * 
     * @return Resource identifier of the resource for which position is updated.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * Resource identifier of the resource for which position is updated.
     * </p>
     * 
     * @param resourceIdentifier
     *        Resource identifier of the resource for which position is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePositionRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource for which position is updated.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which position is updated.
     * @see PositionResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type of the resource for which position is updated.
     * </p>
     * 
     * @return Resource type of the resource for which position is updated.
     * @see PositionResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type of the resource for which position is updated.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which position is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public UpdatePositionRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Resource type of the resource for which position is updated.
     * </p>
     * 
     * @param resourceType
     *        Resource type of the resource for which position is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionResourceType
     */

    public UpdatePositionRequest withResourceType(PositionResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * 
     * @return The position information of the resource.
     */

    public java.util.List<Float> getPosition() {
        return position;
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * 
     * @param position
     *        The position information of the resource.
     */

    public void setPosition(java.util.Collection<Float> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Float>(position);
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPosition(java.util.Collection)} or {@link #withPosition(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param position
     *        The position information of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePositionRequest withPosition(Float... position) {
        if (this.position == null) {
            setPosition(new java.util.ArrayList<Float>(position.length));
        }
        for (Float ele : position) {
            this.position.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The position information of the resource.
     * </p>
     * 
     * @param position
     *        The position information of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePositionRequest withPosition(java.util.Collection<Float> position) {
        setPosition(position);
        return this;
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePositionRequest == false)
            return false;
        UpdatePositionRequest other = (UpdatePositionRequest) obj;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePositionRequest clone() {
        return (UpdatePositionRequest) super.clone();
    }

}
