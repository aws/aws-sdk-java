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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a condition for filtering the results of a query for quota and usage data for one or more Amazon Macie
 * accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UsageStatisticsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageStatisticsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to use in the condition. If the value for the key property is accountId, this value must be
     * CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE,
     * or NE.
     * </p>
     */
    private String comparator;
    /**
     * <p>
     * The field to use in the condition.
     * </p>
     */
    private String key;
    /**
     * <p>
     * An array that lists values to use in the condition, based on the value for the field specified by the key
     * property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this
     * array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported field are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId - The unique identifier for an Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * total - A string that represents the current estimated cost for an account.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator to use in the condition. If the value for the key property is accountId, this value must be
     * CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE,
     * or NE.
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. If the value for the key property is accountId, this value must be
     *        CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE,
     *        LT, LTE, or NE.
     * @see UsageStatisticsFilterComparator
     */

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. If the value for the key property is accountId, this value must be
     * CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE,
     * or NE.
     * </p>
     * 
     * @return The operator to use in the condition. If the value for the key property is accountId, this value must be
     *         CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE,
     *         LT, LTE, or NE.
     * @see UsageStatisticsFilterComparator
     */

    public String getComparator() {
        return this.comparator;
    }

    /**
     * <p>
     * The operator to use in the condition. If the value for the key property is accountId, this value must be
     * CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE,
     * or NE.
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. If the value for the key property is accountId, this value must be
     *        CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE,
     *        LT, LTE, or NE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticsFilterComparator
     */

    public UsageStatisticsFilter withComparator(String comparator) {
        setComparator(comparator);
        return this;
    }

    /**
     * <p>
     * The operator to use in the condition. If the value for the key property is accountId, this value must be
     * CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE,
     * or NE.
     * </p>
     * 
     * @param comparator
     *        The operator to use in the condition. If the value for the key property is accountId, this value must be
     *        CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE,
     *        LT, LTE, or NE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticsFilterComparator
     */

    public UsageStatisticsFilter withComparator(UsageStatisticsFilterComparator comparator) {
        this.comparator = comparator.toString();
        return this;
    }

    /**
     * <p>
     * The field to use in the condition.
     * </p>
     * 
     * @param key
     *        The field to use in the condition.
     * @see UsageStatisticsFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The field to use in the condition.
     * </p>
     * 
     * @return The field to use in the condition.
     * @see UsageStatisticsFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The field to use in the condition.
     * </p>
     * 
     * @param key
     *        The field to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticsFilterKey
     */

    public UsageStatisticsFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The field to use in the condition.
     * </p>
     * 
     * @param key
     *        The field to use in the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticsFilterKey
     */

    public UsageStatisticsFilter withKey(UsageStatisticsFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * An array that lists values to use in the condition, based on the value for the field specified by the key
     * property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this
     * array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported field are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId - The unique identifier for an Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * total - A string that represents the current estimated cost for an account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An array that lists values to use in the condition, based on the value for the field specified by the key
     *         property. If the value for the key property is accountId, this array can specify multiple values.
     *         Otherwise, this array can specify only one value.</p>
     *         <p>
     *         Valid values for each supported field are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         accountId - The unique identifier for an Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started
     *         for an account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly
     *         quota.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         total - A string that represents the current estimated cost for an account.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array that lists values to use in the condition, based on the value for the field specified by the key
     * property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this
     * array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported field are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId - The unique identifier for an Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * total - A string that represents the current estimated cost for an account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        An array that lists values to use in the condition, based on the value for the field specified by the key
     *        property. If the value for the key property is accountId, this array can specify multiple values.
     *        Otherwise, this array can specify only one value.</p>
     *        <p>
     *        Valid values for each supported field are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId - The unique identifier for an Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started
     *        for an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly
     *        quota.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        total - A string that represents the current estimated cost for an account.
     *        </p>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array that lists values to use in the condition, based on the value for the field specified by the key
     * property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this
     * array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported field are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId - The unique identifier for an Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * total - A string that represents the current estimated cost for an account.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array that lists values to use in the condition, based on the value for the field specified by the key
     *        property. If the value for the key property is accountId, this array can specify multiple values.
     *        Otherwise, this array can specify only one value.</p>
     *        <p>
     *        Valid values for each supported field are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId - The unique identifier for an Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started
     *        for an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly
     *        quota.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        total - A string that represents the current estimated cost for an account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatisticsFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists values to use in the condition, based on the value for the field specified by the key
     * property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this
     * array can specify only one value.
     * </p>
     * <p>
     * Valid values for each supported field are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * accountId - The unique identifier for an Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota.
     * </p>
     * </li>
     * <li>
     * <p>
     * total - A string that represents the current estimated cost for an account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param values
     *        An array that lists values to use in the condition, based on the value for the field specified by the key
     *        property. If the value for the key property is accountId, this array can specify multiple values.
     *        Otherwise, this array can specify only one value.</p>
     *        <p>
     *        Valid values for each supported field are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        accountId - The unique identifier for an Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started
     *        for an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly
     *        quota.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        total - A string that represents the current estimated cost for an account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatisticsFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getComparator() != null)
            sb.append("Comparator: ").append(getComparator()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageStatisticsFilter == false)
            return false;
        UsageStatisticsFilter other = (UsageStatisticsFilter) obj;
        if (other.getComparator() == null ^ this.getComparator() == null)
            return false;
        if (other.getComparator() != null && other.getComparator().equals(this.getComparator()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparator() == null) ? 0 : getComparator().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public UsageStatisticsFilter clone() {
        try {
            return (UsageStatisticsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UsageStatisticsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
