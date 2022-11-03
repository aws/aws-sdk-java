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
 * Object for field Options information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/FieldOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     * </p>
     */
    private Boolean active;
    /**
     * <p>
     * <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     * </p>
     */
    private String name;
    /**
     * <p>
     * <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     * </p>
     */
    private String value;

    /**
     * <p>
     * Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     * </p>
     * 
     * @param active
     *        Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     * </p>
     * 
     * @return Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     * </p>
     * 
     * @param active
     *        Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldOption withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     * </p>
     * 
     * @return Describes whether the <code>FieldOption</code> is active (displayed) or inactive.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * <p>
     * <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     * </p>
     * 
     * @param name
     *        <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     * </p>
     * 
     * @return <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     * </p>
     * 
     * @param name
     *        <code>FieldOptionName</code> has max length 100 and disallows trailing spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldOption withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     * </p>
     * 
     * @param value
     *        <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     * </p>
     * 
     * @return <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     * </p>
     * 
     * @param value
     *        <code>FieldOptionValue</code> has max length 100 and must be alphanumeric with hyphens and underscores.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldOption withValue(String value) {
        setValue(value);
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
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldOption == false)
            return false;
        FieldOption other = (FieldOption) obj;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public FieldOption clone() {
        try {
            return (FieldOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.FieldOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
