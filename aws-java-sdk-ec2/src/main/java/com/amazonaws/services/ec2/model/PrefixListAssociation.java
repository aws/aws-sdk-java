/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the resource with which a prefix list is associated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PrefixListAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PrefixListAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The owner of the resource.
     * </p>
     */
    private String resourceOwner;

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixListAssociation withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @param resourceOwner
     *        The owner of the resource.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @return The owner of the resource.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The owner of the resource.
     * </p>
     * 
     * @param resourceOwner
     *        The owner of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PrefixListAssociation withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixListAssociation == false)
            return false;
        PrefixListAssociation other = (PrefixListAssociation) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        return hashCode;
    }

    @Override
    public PrefixListAssociation clone() {
        try {
            return (PrefixListAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
