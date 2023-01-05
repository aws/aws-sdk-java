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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/Section" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Section implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the section.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The size, in bytes, of the section contents.
     * </p>
     */
    private Integer size;

    /**
     * <p>
     * The name of the section.
     * </p>
     * 
     * @param name
     *        The name of the section.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the section.
     * </p>
     * 
     * @return The name of the section.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the section.
     * </p>
     * 
     * @param name
     *        The name of the section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Section withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the section contents.
     * </p>
     * 
     * @param size
     *        The size, in bytes, of the section contents.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size, in bytes, of the section contents.
     * </p>
     * 
     * @return The size, in bytes, of the section contents.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size, in bytes, of the section contents.
     * </p>
     * 
     * @param size
     *        The size, in bytes, of the section contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Section withSize(Integer size) {
        setSize(size);
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
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Section == false)
            return false;
        Section other = (Section) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public Section clone() {
        try {
            return (Section) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.SectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
