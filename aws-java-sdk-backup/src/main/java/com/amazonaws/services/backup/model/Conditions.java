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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about which resources to include or exclude from a backup plan using their tags. Conditions are
 * case sensitive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/Conditions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Conditions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     */
    private java.util.List<ConditionParameter> stringEquals;
    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged that do not have the same
     * value. Also called "negated matching."
     * </p>
     */
    private java.util.List<ConditionParameter> stringNotEquals;
    /**
     * <p>
     * Filters the values of your tagged resources for matching tag values with the use of a wildcard character (*)
     * anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * </p>
     */
    private java.util.List<ConditionParameter> stringLike;
    /**
     * <p>
     * Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (*)
     * anywhere in the string.
     * </p>
     */
    private java.util.List<ConditionParameter> stringNotLike;

    /**
     * <p>
     * Filters the values of your tagged resources for only those resources that you tagged with the same value. Also
     * called "exact matching."
     * </p>
     * 
     * @return Filters the values of your tagged resources for only those resources that you tagged with the same value.
     *         Also called "exact matching."
     */

    public java.util.List<ConditionParameter> getStringEquals() {
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

    public void setStringEquals(java.util.Collection<ConditionParameter> stringEquals) {
        if (stringEquals == null) {
            this.stringEquals = null;
            return;
        }

        this.stringEquals = new java.util.ArrayList<ConditionParameter>(stringEquals);
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

    public Conditions withStringEquals(ConditionParameter... stringEquals) {
        if (this.stringEquals == null) {
            setStringEquals(new java.util.ArrayList<ConditionParameter>(stringEquals.length));
        }
        for (ConditionParameter ele : stringEquals) {
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

    public Conditions withStringEquals(java.util.Collection<ConditionParameter> stringEquals) {
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

    public java.util.List<ConditionParameter> getStringNotEquals() {
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

    public void setStringNotEquals(java.util.Collection<ConditionParameter> stringNotEquals) {
        if (stringNotEquals == null) {
            this.stringNotEquals = null;
            return;
        }

        this.stringNotEquals = new java.util.ArrayList<ConditionParameter>(stringNotEquals);
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

    public Conditions withStringNotEquals(ConditionParameter... stringNotEquals) {
        if (this.stringNotEquals == null) {
            setStringNotEquals(new java.util.ArrayList<ConditionParameter>(stringNotEquals.length));
        }
        for (ConditionParameter ele : stringNotEquals) {
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

    public Conditions withStringNotEquals(java.util.Collection<ConditionParameter> stringNotEquals) {
        setStringNotEquals(stringNotEquals);
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for matching tag values with the use of a wildcard character (*)
     * anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * </p>
     * 
     * @return Filters the values of your tagged resources for matching tag values with the use of a wildcard character
     *         (*) anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     */

    public java.util.List<ConditionParameter> getStringLike() {
        return stringLike;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for matching tag values with the use of a wildcard character (*)
     * anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * </p>
     * 
     * @param stringLike
     *        Filters the values of your tagged resources for matching tag values with the use of a wildcard character
     *        (*) anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     */

    public void setStringLike(java.util.Collection<ConditionParameter> stringLike) {
        if (stringLike == null) {
            this.stringLike = null;
            return;
        }

        this.stringLike = new java.util.ArrayList<ConditionParameter>(stringLike);
    }

    /**
     * <p>
     * Filters the values of your tagged resources for matching tag values with the use of a wildcard character (*)
     * anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringLike(java.util.Collection)} or {@link #withStringLike(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringLike
     *        Filters the values of your tagged resources for matching tag values with the use of a wildcard character
     *        (*) anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withStringLike(ConditionParameter... stringLike) {
        if (this.stringLike == null) {
            setStringLike(new java.util.ArrayList<ConditionParameter>(stringLike.length));
        }
        for (ConditionParameter ele : stringLike) {
            this.stringLike.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for matching tag values with the use of a wildcard character (*)
     * anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * </p>
     * 
     * @param stringLike
     *        Filters the values of your tagged resources for matching tag values with the use of a wildcard character
     *        (*) anywhere in the string. For example, "prod*" or "*rod*" matches the tag value "production".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withStringLike(java.util.Collection<ConditionParameter> stringLike) {
        setStringLike(stringLike);
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (*)
     * anywhere in the string.
     * </p>
     * 
     * @return Filters the values of your tagged resources for non-matching tag values with the use of a wildcard
     *         character (*) anywhere in the string.
     */

    public java.util.List<ConditionParameter> getStringNotLike() {
        return stringNotLike;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (*)
     * anywhere in the string.
     * </p>
     * 
     * @param stringNotLike
     *        Filters the values of your tagged resources for non-matching tag values with the use of a wildcard
     *        character (*) anywhere in the string.
     */

    public void setStringNotLike(java.util.Collection<ConditionParameter> stringNotLike) {
        if (stringNotLike == null) {
            this.stringNotLike = null;
            return;
        }

        this.stringNotLike = new java.util.ArrayList<ConditionParameter>(stringNotLike);
    }

    /**
     * <p>
     * Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (*)
     * anywhere in the string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringNotLike(java.util.Collection)} or {@link #withStringNotLike(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stringNotLike
     *        Filters the values of your tagged resources for non-matching tag values with the use of a wildcard
     *        character (*) anywhere in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withStringNotLike(ConditionParameter... stringNotLike) {
        if (this.stringNotLike == null) {
            setStringNotLike(new java.util.ArrayList<ConditionParameter>(stringNotLike.length));
        }
        for (ConditionParameter ele : stringNotLike) {
            this.stringNotLike.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the values of your tagged resources for non-matching tag values with the use of a wildcard character (*)
     * anywhere in the string.
     * </p>
     * 
     * @param stringNotLike
     *        Filters the values of your tagged resources for non-matching tag values with the use of a wildcard
     *        character (*) anywhere in the string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Conditions withStringNotLike(java.util.Collection<ConditionParameter> stringNotLike) {
        setStringNotLike(stringNotLike);
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
            sb.append("StringNotEquals: ").append(getStringNotEquals()).append(",");
        if (getStringLike() != null)
            sb.append("StringLike: ").append(getStringLike()).append(",");
        if (getStringNotLike() != null)
            sb.append("StringNotLike: ").append(getStringNotLike());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Conditions == false)
            return false;
        Conditions other = (Conditions) obj;
        if (other.getStringEquals() == null ^ this.getStringEquals() == null)
            return false;
        if (other.getStringEquals() != null && other.getStringEquals().equals(this.getStringEquals()) == false)
            return false;
        if (other.getStringNotEquals() == null ^ this.getStringNotEquals() == null)
            return false;
        if (other.getStringNotEquals() != null && other.getStringNotEquals().equals(this.getStringNotEquals()) == false)
            return false;
        if (other.getStringLike() == null ^ this.getStringLike() == null)
            return false;
        if (other.getStringLike() != null && other.getStringLike().equals(this.getStringLike()) == false)
            return false;
        if (other.getStringNotLike() == null ^ this.getStringNotLike() == null)
            return false;
        if (other.getStringNotLike() != null && other.getStringNotLike().equals(this.getStringNotLike()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStringEquals() == null) ? 0 : getStringEquals().hashCode());
        hashCode = prime * hashCode + ((getStringNotEquals() == null) ? 0 : getStringNotEquals().hashCode());
        hashCode = prime * hashCode + ((getStringLike() == null) ? 0 : getStringLike().hashCode());
        hashCode = prime * hashCode + ((getStringNotLike() == null) ? 0 : getStringNotLike().hashCode());
        return hashCode;
    }

    @Override
    public Conditions clone() {
        try {
            return (Conditions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ConditionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
