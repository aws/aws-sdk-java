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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The search criteria to be used to return security profiles.
 * </p>
 * <note>
 * <p>
 * The <code>name</code> field support "contains" queries with a minimum of 2 characters and maximum of 25 characters.
 * Any queries with character lengths outside of this range will throw invalid results.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SecurityProfileSearchCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityProfileSearchCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     */
    private java.util.List<SecurityProfileSearchCriteria> orConditions;
    /**
     * <p>
     * A list of conditions which would be applied together with an AND condition.
     * </p>
     */
    private java.util.List<SecurityProfileSearchCriteria> andConditions;

    private StringCondition stringCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an OR condition.
     */

    public java.util.List<SecurityProfileSearchCriteria> getOrConditions() {
        return orConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an OR condition.
     */

    public void setOrConditions(java.util.Collection<SecurityProfileSearchCriteria> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<SecurityProfileSearchCriteria>(orConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrConditions(java.util.Collection)} or {@link #withOrConditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an OR condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileSearchCriteria withOrConditions(SecurityProfileSearchCriteria... orConditions) {
        if (this.orConditions == null) {
            setOrConditions(new java.util.ArrayList<SecurityProfileSearchCriteria>(orConditions.length));
        }
        for (SecurityProfileSearchCriteria ele : orConditions) {
            this.orConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     * 
     * @param orConditions
     *        A list of conditions which would be applied together with an OR condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileSearchCriteria withOrConditions(java.util.Collection<SecurityProfileSearchCriteria> orConditions) {
        setOrConditions(orConditions);
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an AND condition.
     */

    public java.util.List<SecurityProfileSearchCriteria> getAndConditions() {
        return andConditions;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND condition.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an AND condition.
     */

    public void setAndConditions(java.util.Collection<SecurityProfileSearchCriteria> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<SecurityProfileSearchCriteria>(andConditions);
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND condition.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndConditions(java.util.Collection)} or {@link #withAndConditions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an AND condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileSearchCriteria withAndConditions(SecurityProfileSearchCriteria... andConditions) {
        if (this.andConditions == null) {
            setAndConditions(new java.util.ArrayList<SecurityProfileSearchCriteria>(andConditions.length));
        }
        for (SecurityProfileSearchCriteria ele : andConditions) {
            this.andConditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of conditions which would be applied together with an AND condition.
     * </p>
     * 
     * @param andConditions
     *        A list of conditions which would be applied together with an AND condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileSearchCriteria withAndConditions(java.util.Collection<SecurityProfileSearchCriteria> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * @param stringCondition
     */

    public void setStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
    }

    /**
     * @return
     */

    public StringCondition getStringCondition() {
        return this.stringCondition;
    }

    /**
     * @param stringCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityProfileSearchCriteria withStringCondition(StringCondition stringCondition) {
        setStringCondition(stringCondition);
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
        if (getOrConditions() != null)
            sb.append("OrConditions: ").append(getOrConditions()).append(",");
        if (getAndConditions() != null)
            sb.append("AndConditions: ").append(getAndConditions()).append(",");
        if (getStringCondition() != null)
            sb.append("StringCondition: ").append(getStringCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityProfileSearchCriteria == false)
            return false;
        SecurityProfileSearchCriteria other = (SecurityProfileSearchCriteria) obj;
        if (other.getOrConditions() == null ^ this.getOrConditions() == null)
            return false;
        if (other.getOrConditions() != null && other.getOrConditions().equals(this.getOrConditions()) == false)
            return false;
        if (other.getAndConditions() == null ^ this.getAndConditions() == null)
            return false;
        if (other.getAndConditions() != null && other.getAndConditions().equals(this.getAndConditions()) == false)
            return false;
        if (other.getStringCondition() == null ^ this.getStringCondition() == null)
            return false;
        if (other.getStringCondition() != null && other.getStringCondition().equals(this.getStringCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrConditions() == null) ? 0 : getOrConditions().hashCode());
        hashCode = prime * hashCode + ((getAndConditions() == null) ? 0 : getAndConditions().hashCode());
        hashCode = prime * hashCode + ((getStringCondition() == null) ? 0 : getStringCondition().hashCode());
        return hashCode;
    }

    @Override
    public SecurityProfileSearchCriteria clone() {
        try {
            return (SecurityProfileSearchCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SecurityProfileSearchCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
