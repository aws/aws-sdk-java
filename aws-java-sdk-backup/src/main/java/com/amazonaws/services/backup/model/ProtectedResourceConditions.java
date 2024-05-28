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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of conditions that you define for resources in your restore testing plan using tags.
 * </p>
 * <p>
 * For example, <code>"StringEquals": { "Key": "aws:ResourceTag/CreatedByCryo", "Value": "true" },</code>. Condition
 * operators are case sensitive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ProtectedResourceConditions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedResourceConditions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     */
    private java.util.List<KeyValue> stringEquals;
    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged that do not have the same
     * value. Also called "negated matching."
     * </p>
     */
    private java.util.List<KeyValue> stringNotEquals;

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     * 
     * @return Filters the values of your tagged resources for only those resources that you tagged with the same value.
     *         Also called "exact matching."
     */

    public java.util.List<KeyValue> getStringEquals() {
        return stringEquals;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     * 
     * @param stringEquals
     *        Filters the values of your tagged resources for only those resources that you tagged with the same value.
     *        Also called "exact matching."
     */

    public void setStringEquals(java.util.Collection<KeyValue> stringEquals) {
        if (stringEquals == null) {
            this.stringEquals = null;
            return;
        }

        this.stringEquals = new java.util.ArrayList<KeyValue>(stringEquals);
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringEquals(java.util.Collection)} or {@link #withStringEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringEquals
     *        Filters the values of your tagged resources for only those resources that you tagged with the same value.
     *        Also called "exact matching."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResourceConditions withStringEquals(KeyValue... stringEquals) {
        if (this.stringEquals == null) {
            setStringEquals(new java.util.ArrayList<KeyValue>(stringEquals.length));
        }
        for (KeyValue ele : stringEquals) {
            this.stringEquals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     * 
     * @param stringEquals
     *        Filters the values of your tagged resources for only those resources that you tagged with the same value.
     *        Also called "exact matching."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResourceConditions withStringEquals(java.util.Collection<KeyValue> stringEquals) {
        setStringEquals(stringEquals);
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged that do not have the same
     * value. Also called "negated matching."
     * </p>
     * 
     * @return Filters the values of your tagged resources for only those resources that you tagged that do not have the
     *         same value. Also called "negated matching."
     */

    public java.util.List<KeyValue> getStringNotEquals() {
        return stringNotEquals;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged that do not have the same
     * value. Also called "negated matching."
     * </p>
     * 
     * @param stringNotEquals
     *        Filters the values of your tagged resources for only those resources that you tagged that do not have the
     *        same value. Also called "negated matching."
     */

    public void setStringNotEquals(java.util.Collection<KeyValue> stringNotEquals) {
        if (stringNotEquals == null) {
            this.stringNotEquals = null;
            return;
        }

        this.stringNotEquals = new java.util.ArrayList<KeyValue>(stringNotEquals);
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged that do not have the same
     * value. Also called "negated matching."
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringNotEquals(java.util.Collection)} or {@link #withStringNotEquals(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param stringNotEquals
     *        Filters the values of your tagged resources for only those resources that you tagged that do not have the
     *        same value. Also called "negated matching."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResourceConditions withStringNotEquals(KeyValue... stringNotEquals) {
        if (this.stringNotEquals == null) {
            setStringNotEquals(new java.util.ArrayList<KeyValue>(stringNotEquals.length));
        }
        for (KeyValue ele : stringNotEquals) {
            this.stringNotEquals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged that do not have the same
     * value. Also called "negated matching."
     * </p>
     * 
     * @param stringNotEquals
     *        Filters the values of your tagged resources for only those resources that you tagged that do not have the
     *        same value. Also called "negated matching."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedResourceConditions withStringNotEquals(java.util.Collection<KeyValue> stringNotEquals) {
        setStringNotEquals(stringNotEquals);
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
        if (getStringEquals() != null)
            sb.append("StringEquals: ").append(getStringEquals()).append(",");
        if (getStringNotEquals() != null)
            sb.append("StringNotEquals: ").append(getStringNotEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectedResourceConditions == false)
            return false;
        ProtectedResourceConditions other = (ProtectedResourceConditions) obj;
        if (other.getStringEquals() == null ^ this.getStringEquals() == null)
            return false;
        if (other.getStringEquals() != null && other.getStringEquals().equals(this.getStringEquals()) == false)
            return false;
        if (other.getStringNotEquals() == null ^ this.getStringNotEquals() == null)
            return false;
        if (other.getStringNotEquals() != null && other.getStringNotEquals().equals(this.getStringNotEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringEquals() == null) ? 0 : getStringEquals().hashCode());
        hashCode = prime * hashCode + ((getStringNotEquals() == null) ? 0 : getStringNotEquals().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedResourceConditions clone() {
        try {
            return (ProtectedResourceConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ProtectedResourceConditionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
