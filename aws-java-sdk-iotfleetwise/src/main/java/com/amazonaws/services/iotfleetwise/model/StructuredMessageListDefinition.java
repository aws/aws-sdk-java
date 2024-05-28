/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a list type node of the complex data structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/StructuredMessageListDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StructuredMessageListDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the structured message list definition.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The member type of the structured message list definition.
     * </p>
     */
    private StructuredMessage memberType;
    /**
     * <p>
     * The type of list of the structured message list definition.
     * </p>
     */
    private String listType;
    /**
     * <p>
     * The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code> or
     * <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     * </p>
     */
    private Integer capacity;

    /**
     * <p>
     * The name of the structured message list definition.
     * </p>
     * 
     * @param name
     *        The name of the structured message list definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the structured message list definition.
     * </p>
     * 
     * @return The name of the structured message list definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the structured message list definition.
     * </p>
     * 
     * @param name
     *        The name of the structured message list definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessageListDefinition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The member type of the structured message list definition.
     * </p>
     * 
     * @param memberType
     *        The member type of the structured message list definition.
     */

    public void setMemberType(StructuredMessage memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The member type of the structured message list definition.
     * </p>
     * 
     * @return The member type of the structured message list definition.
     */

    public StructuredMessage getMemberType() {
        return this.memberType;
    }

    /**
     * <p>
     * The member type of the structured message list definition.
     * </p>
     * 
     * @param memberType
     *        The member type of the structured message list definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessageListDefinition withMemberType(StructuredMessage memberType) {
        setMemberType(memberType);
        return this;
    }

    /**
     * <p>
     * The type of list of the structured message list definition.
     * </p>
     * 
     * @param listType
     *        The type of list of the structured message list definition.
     * @see StructuredMessageListType
     */

    public void setListType(String listType) {
        this.listType = listType;
    }

    /**
     * <p>
     * The type of list of the structured message list definition.
     * </p>
     * 
     * @return The type of list of the structured message list definition.
     * @see StructuredMessageListType
     */

    public String getListType() {
        return this.listType;
    }

    /**
     * <p>
     * The type of list of the structured message list definition.
     * </p>
     * 
     * @param listType
     *        The type of list of the structured message list definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StructuredMessageListType
     */

    public StructuredMessageListDefinition withListType(String listType) {
        setListType(listType);
        return this;
    }

    /**
     * <p>
     * The type of list of the structured message list definition.
     * </p>
     * 
     * @param listType
     *        The type of list of the structured message list definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StructuredMessageListType
     */

    public StructuredMessageListDefinition withListType(StructuredMessageListType listType) {
        this.listType = listType.toString();
        return this;
    }

    /**
     * <p>
     * The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code> or
     * <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     * </p>
     * 
     * @param capacity
     *        The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code>
     *        or <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     */

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code> or
     * <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     * </p>
     * 
     * @return The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code>
     *         or <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     */

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code> or
     * <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     * </p>
     * 
     * @param capacity
     *        The capacity of the structured message list definition when the list type is <code>FIXED_CAPACITY</code>
     *        or <code>DYNAMIC_BOUNDED_CAPACITY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StructuredMessageListDefinition withCapacity(Integer capacity) {
        setCapacity(capacity);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMemberType() != null)
            sb.append("MemberType: ").append(getMemberType()).append(",");
        if (getListType() != null)
            sb.append("ListType: ").append(getListType()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StructuredMessageListDefinition == false)
            return false;
        StructuredMessageListDefinition other = (StructuredMessageListDefinition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        if (other.getListType() == null ^ this.getListType() == null)
            return false;
        if (other.getListType() != null && other.getListType().equals(this.getListType()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        hashCode = prime * hashCode + ((getListType() == null) ? 0 : getListType().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        return hashCode;
    }

    @Override
    public StructuredMessageListDefinition clone() {
        try {
            return (StructuredMessageListDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.StructuredMessageListDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
