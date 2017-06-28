/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed resource information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ResourceDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     */
    private String id;
    /**
     * <p>
     * ARN of the resource.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Description of the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Creation time of the resource.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     * 
     * @param id
     *        Identifier of the resource.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     * 
     * @return Identifier of the resource.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Identifier of the resource.
     * </p>
     * 
     * @param id
     *        Identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * ARN of the resource.
     * </p>
     * 
     * @param aRN
     *        ARN of the resource.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * ARN of the resource.
     * </p>
     * 
     * @return ARN of the resource.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * ARN of the resource.
     * </p>
     * 
     * @param aRN
     *        ARN of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @param name
     *        Name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @return Name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the resource.
     * </p>
     * 
     * @param name
     *        Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Description of the resource.
     * </p>
     * 
     * @param description
     *        Description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the resource.
     * </p>
     * 
     * @return Description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the resource.
     * </p>
     * 
     * @param description
     *        Description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Creation time of the resource.
     * </p>
     * 
     * @param createdTime
     *        Creation time of the resource.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Creation time of the resource.
     * </p>
     * 
     * @return Creation time of the resource.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Creation time of the resource.
     * </p>
     * 
     * @param createdTime
     *        Creation time of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetail withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetail == false)
            return false;
        ResourceDetail other = (ResourceDetail) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetail clone() {
        try {
            return (ResourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ResourceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
