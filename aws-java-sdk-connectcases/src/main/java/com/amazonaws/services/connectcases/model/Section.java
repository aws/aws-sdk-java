/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This represents a sections within a panel or tab of the page layout.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/Section" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Section implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Consists of a group of fields and associated properties.
     * </p>
     */
    private FieldGroup fieldGroup;

    /**
     * <p>
     * Consists of a group of fields and associated properties.
     * </p>
     * 
     * @param fieldGroup
     *        Consists of a group of fields and associated properties.
     */

    public void setFieldGroup(FieldGroup fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    /**
     * <p>
     * Consists of a group of fields and associated properties.
     * </p>
     * 
     * @return Consists of a group of fields and associated properties.
     */

    public FieldGroup getFieldGroup() {
        return this.fieldGroup;
    }

    /**
     * <p>
     * Consists of a group of fields and associated properties.
     * </p>
     * 
     * @param fieldGroup
     *        Consists of a group of fields and associated properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Section withFieldGroup(FieldGroup fieldGroup) {
        setFieldGroup(fieldGroup);
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
        if (getFieldGroup() != null)
            sb.append("FieldGroup: ").append(getFieldGroup());
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
        if (other.getFieldGroup() == null ^ this.getFieldGroup() == null)
            return false;
        if (other.getFieldGroup() != null && other.getFieldGroup().equals(this.getFieldGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldGroup() == null) ? 0 : getFieldGroup().hashCode());
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
        com.amazonaws.services.connectcases.model.transform.SectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
