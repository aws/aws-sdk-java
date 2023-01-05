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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource type.
     * </p>
     */
    private String typeName;

    private ResourceDescription resourceDescription;

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @return The name of the resource type.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the resource type.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceResult withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * @param resourceDescription
     */

    public void setResourceDescription(ResourceDescription resourceDescription) {
        this.resourceDescription = resourceDescription;
    }

    /**
     * @return
     */

    public ResourceDescription getResourceDescription() {
        return this.resourceDescription;
    }

    /**
     * @param resourceDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceResult withResourceDescription(ResourceDescription resourceDescription) {
        setResourceDescription(resourceDescription);
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getResourceDescription() != null)
            sb.append("ResourceDescription: ").append(getResourceDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceResult == false)
            return false;
        GetResourceResult other = (GetResourceResult) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getResourceDescription() == null ^ this.getResourceDescription() == null)
            return false;
        if (other.getResourceDescription() != null && other.getResourceDescription().equals(this.getResourceDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getResourceDescription() == null) ? 0 : getResourceDescription().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceResult clone() {
        try {
            return (GetResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
