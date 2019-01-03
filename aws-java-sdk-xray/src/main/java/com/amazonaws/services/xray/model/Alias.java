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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An alias for an edge.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Alias" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Alias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The canonical name of the alias.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of names for the alias, including the canonical name.
     * </p>
     */
    private java.util.List<String> names;
    /**
     * <p>
     * The type of the alias.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The canonical name of the alias.
     * </p>
     * 
     * @param name
     *        The canonical name of the alias.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The canonical name of the alias.
     * </p>
     * 
     * @return The canonical name of the alias.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The canonical name of the alias.
     * </p>
     * 
     * @param name
     *        The canonical name of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of names for the alias, including the canonical name.
     * </p>
     * 
     * @return A list of names for the alias, including the canonical name.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of names for the alias, including the canonical name.
     * </p>
     * 
     * @param names
     *        A list of names for the alias, including the canonical name.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of names for the alias, including the canonical name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of names for the alias, including the canonical name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names for the alias, including the canonical name.
     * </p>
     * 
     * @param names
     *        A list of names for the alias, including the canonical name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withNames(java.util.Collection<String> names) {
        setNames(names);
        return this;
    }

    /**
     * <p>
     * The type of the alias.
     * </p>
     * 
     * @param type
     *        The type of the alias.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the alias.
     * </p>
     * 
     * @return The type of the alias.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the alias.
     * </p>
     * 
     * @param type
     *        The type of the alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Alias withType(String type) {
        setType(type);
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
        if (getNames() != null)
            sb.append("Names: ").append(getNames()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Alias == false)
            return false;
        Alias other = (Alias) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Alias clone() {
        try {
            return (Alias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.AliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
