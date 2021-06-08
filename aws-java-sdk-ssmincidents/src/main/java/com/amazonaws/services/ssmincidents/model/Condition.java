/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A conditional statement with which to compare a value, after a timestamp, before a timestamp, or equal to a string or
 * integer. If multiple conditions are specified, the conditionals become an <code>AND</code>ed statement. If multiple
 * values are specified for a conditional, the values are <code>OR</code>d.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * After the specified timestamp.
     * </p>
     */
    private java.util.Date after;
    /**
     * <p>
     * Before the specified timestamp
     * </p>
     */
    private java.util.Date before;
    /**
     * <p>
     * The value is equal to the provided string or integer.
     * </p>
     */
    private AttributeValueList equals;

    /**
     * <p>
     * After the specified timestamp.
     * </p>
     * 
     * @param after
     *        After the specified timestamp.
     */

    public void setAfter(java.util.Date after) {
        this.after = after;
    }

    /**
     * <p>
     * After the specified timestamp.
     * </p>
     * 
     * @return After the specified timestamp.
     */

    public java.util.Date getAfter() {
        return this.after;
    }

    /**
     * <p>
     * After the specified timestamp.
     * </p>
     * 
     * @param after
     *        After the specified timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withAfter(java.util.Date after) {
        setAfter(after);
        return this;
    }

    /**
     * <p>
     * Before the specified timestamp
     * </p>
     * 
     * @param before
     *        Before the specified timestamp
     */

    public void setBefore(java.util.Date before) {
        this.before = before;
    }

    /**
     * <p>
     * Before the specified timestamp
     * </p>
     * 
     * @return Before the specified timestamp
     */

    public java.util.Date getBefore() {
        return this.before;
    }

    /**
     * <p>
     * Before the specified timestamp
     * </p>
     * 
     * @param before
     *        Before the specified timestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withBefore(java.util.Date before) {
        setBefore(before);
        return this;
    }

    /**
     * <p>
     * The value is equal to the provided string or integer.
     * </p>
     * 
     * @param equals
     *        The value is equal to the provided string or integer.
     */

    public void setEquals(AttributeValueList equals) {
        this.equals = equals;
    }

    /**
     * <p>
     * The value is equal to the provided string or integer.
     * </p>
     * 
     * @return The value is equal to the provided string or integer.
     */

    public AttributeValueList getEquals() {
        return this.equals;
    }

    /**
     * <p>
     * The value is equal to the provided string or integer.
     * </p>
     * 
     * @param equals
     *        The value is equal to the provided string or integer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withEquals(AttributeValueList equals) {
        setEquals(equals);
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
        if (getAfter() != null)
            sb.append("After: ").append(getAfter()).append(",");
        if (getBefore() != null)
            sb.append("Before: ").append(getBefore()).append(",");
        if (getEquals() != null)
            sb.append("Equals: ").append(getEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getAfter() == null ^ this.getAfter() == null)
            return false;
        if (other.getAfter() != null && other.getAfter().equals(this.getAfter()) == false)
            return false;
        if (other.getBefore() == null ^ this.getBefore() == null)
            return false;
        if (other.getBefore() != null && other.getBefore().equals(this.getBefore()) == false)
            return false;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfter() == null) ? 0 : getAfter().hashCode());
        hashCode = prime * hashCode + ((getBefore() == null) ? 0 : getBefore().hashCode());
        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
