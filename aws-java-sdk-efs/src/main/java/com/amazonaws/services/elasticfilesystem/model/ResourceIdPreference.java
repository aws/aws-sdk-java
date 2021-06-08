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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ResourceIdPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceIdPreference implements Serializable, Cloneable, StructuredPojo {

    private String resourceIdType;

    private com.amazonaws.internal.SdkInternalList<String> resources;

    /**
     * @param resourceIdType
     * @see ResourceIdType
     */

    public void setResourceIdType(String resourceIdType) {
        this.resourceIdType = resourceIdType;
    }

    /**
     * @return
     * @see ResourceIdType
     */

    public String getResourceIdType() {
        return this.resourceIdType;
    }

    /**
     * @param resourceIdType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceIdType
     */

    public ResourceIdPreference withResourceIdType(String resourceIdType) {
        setResourceIdType(resourceIdType);
        return this;
    }

    /**
     * @param resourceIdType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceIdType
     */

    public ResourceIdPreference withResourceIdType(ResourceIdType resourceIdType) {
        this.resourceIdType = resourceIdType.toString();
        return this;
    }

    /**
     * @return
     * @see Resource
     */

    public java.util.List<String> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resources;
    }

    /**
     * @param resources
     * @see Resource
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<String>(resources);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Resource
     */

    public ResourceIdPreference withResources(String... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Resource
     */

    public ResourceIdPreference withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * @param resources
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Resource
     */

    public ResourceIdPreference withResources(Resource... resources) {
        com.amazonaws.internal.SdkInternalList<String> resourcesCopy = new com.amazonaws.internal.SdkInternalList<String>(resources.length);
        for (Resource value : resources) {
            resourcesCopy.add(value.toString());
        }
        if (getResources() == null) {
            setResources(resourcesCopy);
        } else {
            getResources().addAll(resourcesCopy);
        }
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
        if (getResourceIdType() != null)
            sb.append("ResourceIdType: ").append(getResourceIdType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceIdPreference == false)
            return false;
        ResourceIdPreference other = (ResourceIdPreference) obj;
        if (other.getResourceIdType() == null ^ this.getResourceIdType() == null)
            return false;
        if (other.getResourceIdType() != null && other.getResourceIdType().equals(this.getResourceIdType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdType() == null) ? 0 : getResourceIdType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public ResourceIdPreference clone() {
        try {
            return (ResourceIdPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.ResourceIdPreferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
