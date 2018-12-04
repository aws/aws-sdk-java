/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information on the resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Resource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Resource implements Serializable, Cloneable, StructuredPojo {

    /** Resource Id. */
    private String id;
    /** A descriptive resource name. */
    private String name;
    /** A container of data for all resource types. */
    private ResourceDataContainer resourceDataContainer;

    /**
     * Resource Id.
     * 
     * @param id
     *        Resource Id.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Resource Id.
     * 
     * @return Resource Id.
     */

    public String getId() {
        return this.id;
    }

    /**
     * Resource Id.
     * 
     * @param id
     *        Resource Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withId(String id) {
        setId(id);
        return this;
    }

    /**
     * A descriptive resource name.
     * 
     * @param name
     *        A descriptive resource name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A descriptive resource name.
     * 
     * @return A descriptive resource name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A descriptive resource name.
     * 
     * @param name
     *        A descriptive resource name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * A container of data for all resource types.
     * 
     * @param resourceDataContainer
     *        A container of data for all resource types.
     */

    public void setResourceDataContainer(ResourceDataContainer resourceDataContainer) {
        this.resourceDataContainer = resourceDataContainer;
    }

    /**
     * A container of data for all resource types.
     * 
     * @return A container of data for all resource types.
     */

    public ResourceDataContainer getResourceDataContainer() {
        return this.resourceDataContainer;
    }

    /**
     * A container of data for all resource types.
     * 
     * @param resourceDataContainer
     *        A container of data for all resource types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Resource withResourceDataContainer(ResourceDataContainer resourceDataContainer) {
        setResourceDataContainer(resourceDataContainer);
        return this;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceDataContainer() != null)
            sb.append("ResourceDataContainer: ").append(getResourceDataContainer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Resource == false)
            return false;
        Resource other = (Resource) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceDataContainer() == null ^ this.getResourceDataContainer() == null)
            return false;
        if (other.getResourceDataContainer() != null && other.getResourceDataContainer().equals(this.getResourceDataContainer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceDataContainer() == null) ? 0 : getResourceDataContainer().hashCode());
        return hashCode;
    }

    @Override
    public Resource clone() {
        try {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
