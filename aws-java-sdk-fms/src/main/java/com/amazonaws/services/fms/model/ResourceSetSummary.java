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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summarizes the resource sets used in a policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ResourceSetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the resource set. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The descriptive name of the resource set. You can't change the name of a resource set after you create it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the resource set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The last time that the resource set was changed.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * A unique identifier for the resource set. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the resource set. This ID is returned in the responses to create and list
     *        commands. You provide it to operations like update and delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the resource set. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @return A unique identifier for the resource set. This ID is returned in the responses to create and list
     *         commands. You provide it to operations like update and delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the resource set. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param id
     *        A unique identifier for the resource set. This ID is returned in the responses to create and list
     *        commands. You provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSetSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the resource set. You can't change the name of a resource set after you create it.
     * </p>
     * 
     * @param name
     *        The descriptive name of the resource set. You can't change the name of a resource set after you create it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name of the resource set. You can't change the name of a resource set after you create it.
     * </p>
     * 
     * @return The descriptive name of the resource set. You can't change the name of a resource set after you create
     *         it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name of the resource set. You can't change the name of a resource set after you create it.
     * </p>
     * 
     * @param name
     *        The descriptive name of the resource set. You can't change the name of a resource set after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSetSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the resource set.
     * </p>
     * 
     * @param description
     *        A description of the resource set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the resource set.
     * </p>
     * 
     * @return A description of the resource set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the resource set.
     * </p>
     * 
     * @param description
     *        A description of the resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSetSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The last time that the resource set was changed.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time that the resource set was changed.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time that the resource set was changed.
     * </p>
     * 
     * @return The last time that the resource set was changed.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time that the resource set was changed.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time that the resource set was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSetSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSetSummary == false)
            return false;
        ResourceSetSummary other = (ResourceSetSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSetSummary clone() {
        try {
            return (ResourceSetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ResourceSetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
