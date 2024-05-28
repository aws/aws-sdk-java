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
 * The search criteria to be used to return hours of operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HoursOfOperationSearchCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HoursOfOperationSearchCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     */
    private java.util.List<HoursOfOperationSearchCriteria> orConditions;
    /**
     * <p>
     * A list of conditions which would be applied together with an AND condition.
     * </p>
     */
    private java.util.List<HoursOfOperationSearchCriteria> andConditions;
    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>,
     * <code>timezone</code>, and <code>resourceID</code>.
     * </p>
     * </note>
     */
    private StringCondition stringCondition;

    /**
     * <p>
     * A list of conditions which would be applied together with an OR condition.
     * </p>
     * 
     * @return A list of conditions which would be applied together with an OR condition.
     */

    public java.util.List<HoursOfOperationSearchCriteria> getOrConditions() {
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

    public void setOrConditions(java.util.Collection<HoursOfOperationSearchCriteria> orConditions) {
        if (orConditions == null) {
            this.orConditions = null;
            return;
        }

        this.orConditions = new java.util.ArrayList<HoursOfOperationSearchCriteria>(orConditions);
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

    public HoursOfOperationSearchCriteria withOrConditions(HoursOfOperationSearchCriteria... orConditions) {
        if (this.orConditions == null) {
            setOrConditions(new java.util.ArrayList<HoursOfOperationSearchCriteria>(orConditions.length));
        }
        for (HoursOfOperationSearchCriteria ele : orConditions) {
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

    public HoursOfOperationSearchCriteria withOrConditions(java.util.Collection<HoursOfOperationSearchCriteria> orConditions) {
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

    public java.util.List<HoursOfOperationSearchCriteria> getAndConditions() {
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

    public void setAndConditions(java.util.Collection<HoursOfOperationSearchCriteria> andConditions) {
        if (andConditions == null) {
            this.andConditions = null;
            return;
        }

        this.andConditions = new java.util.ArrayList<HoursOfOperationSearchCriteria>(andConditions);
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

    public HoursOfOperationSearchCriteria withAndConditions(HoursOfOperationSearchCriteria... andConditions) {
        if (this.andConditions == null) {
            setAndConditions(new java.util.ArrayList<HoursOfOperationSearchCriteria>(andConditions.length));
        }
        for (HoursOfOperationSearchCriteria ele : andConditions) {
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

    public HoursOfOperationSearchCriteria withAndConditions(java.util.Collection<HoursOfOperationSearchCriteria> andConditions) {
        setAndConditions(andConditions);
        return this;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>,
     * <code>timezone</code>, and <code>resourceID</code>.
     * </p>
     * </note>
     * 
     * @param stringCondition
     *        A leaf node condition which can be used to specify a string condition.</p> <note>
     *        <p>
     *        The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>,
     *        <code>timezone</code>, and <code>resourceID</code>.
     *        </p>
     */

    public void setStringCondition(StringCondition stringCondition) {
        this.stringCondition = stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>,
     * <code>timezone</code>, and <code>resourceID</code>.
     * </p>
     * </note>
     * 
     * @return A leaf node condition which can be used to specify a string condition.</p> <note>
     *         <p>
     *         The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>, <code>timezone</code>, and <code>resourceID</code>.
     *         </p>
     */

    public StringCondition getStringCondition() {
        return this.stringCondition;
    }

    /**
     * <p>
     * A leaf node condition which can be used to specify a string condition.
     * </p>
     * <note>
     * <p>
     * The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>,
     * <code>timezone</code>, and <code>resourceID</code>.
     * </p>
     * </note>
     * 
     * @param stringCondition
     *        A leaf node condition which can be used to specify a string condition.</p> <note>
     *        <p>
     *        The currently supported values for <code>FieldName</code> are <code>name</code>, <code>description</code>,
     *        <code>timezone</code>, and <code>resourceID</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HoursOfOperationSearchCriteria withStringCondition(StringCondition stringCondition) {
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

        if (obj instanceof HoursOfOperationSearchCriteria == false)
            return false;
        HoursOfOperationSearchCriteria other = (HoursOfOperationSearchCriteria) obj;
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
    public HoursOfOperationSearchCriteria clone() {
        try {
            return (HoursOfOperationSearchCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HoursOfOperationSearchCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
