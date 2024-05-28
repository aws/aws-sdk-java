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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about values of a predefined attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PredefinedAttributeValues" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredefinedAttributeValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     */
    private java.util.List<String> stringList;

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     * 
     * @return Predefined attribute values of type string list.
     */

    public java.util.List<String> getStringList() {
        return stringList;
    }

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     * 
     * @param stringList
     *        Predefined attribute values of type string list.
     */

    public void setStringList(java.util.Collection<String> stringList) {
        if (stringList == null) {
            this.stringList = null;
            return;
        }

        this.stringList = new java.util.ArrayList<String>(stringList);
    }

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringList(java.util.Collection)} or {@link #withStringList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringList
     *        Predefined attribute values of type string list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredefinedAttributeValues withStringList(String... stringList) {
        if (this.stringList == null) {
            setStringList(new java.util.ArrayList<String>(stringList.length));
        }
        for (String ele : stringList) {
            this.stringList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Predefined attribute values of type string list.
     * </p>
     * 
     * @param stringList
     *        Predefined attribute values of type string list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredefinedAttributeValues withStringList(java.util.Collection<String> stringList) {
        setStringList(stringList);
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
        if (getStringList() != null)
            sb.append("StringList: ").append(getStringList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredefinedAttributeValues == false)
            return false;
        PredefinedAttributeValues other = (PredefinedAttributeValues) obj;
        if (other.getStringList() == null ^ this.getStringList() == null)
            return false;
        if (other.getStringList() != null && other.getStringList().equals(this.getStringList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringList() == null) ? 0 : getStringList().hashCode());
        return hashCode;
    }

    @Override
    public PredefinedAttributeValues clone() {
        try {
            return (PredefinedAttributeValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.PredefinedAttributeValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
