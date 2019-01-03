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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A resource group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/Group" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Group implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     */
    private String groupArn;
    /**
     * <p>
     * The name of a resource group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the resource group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     * 
     * @param groupArn
     *        The ARN of a resource group.
     */

    public void setGroupArn(String groupArn) {
        this.groupArn = groupArn;
    }

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     * 
     * @return The ARN of a resource group.
     */

    public String getGroupArn() {
        return this.groupArn;
    }

    /**
     * <p>
     * The ARN of a resource group.
     * </p>
     * 
     * @param groupArn
     *        The ARN of a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withGroupArn(String groupArn) {
        setGroupArn(groupArn);
        return this;
    }

    /**
     * <p>
     * The name of a resource group.
     * </p>
     * 
     * @param name
     *        The name of a resource group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a resource group.
     * </p>
     * 
     * @return The name of a resource group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a resource group.
     * </p>
     * 
     * @param name
     *        The name of a resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the resource group.
     * </p>
     * 
     * @param description
     *        The description of the resource group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the resource group.
     * </p>
     * 
     * @return The description of the resource group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the resource group.
     * </p>
     * 
     * @param description
     *        The description of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withDescription(String description) {
        setDescription(description);
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
        if (getGroupArn() != null)
            sb.append("GroupArn: ").append(getGroupArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;
        if (other.getGroupArn() == null ^ this.getGroupArn() == null)
            return false;
        if (other.getGroupArn() != null && other.getGroupArn().equals(this.getGroupArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupArn() == null) ? 0 : getGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Group clone() {
        try {
            return (Group) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
