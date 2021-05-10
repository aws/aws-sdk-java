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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter for a specific list of related-item resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/OpsItemRelatedItemsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpsItemRelatedItemsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>, or
     * <code>AssociationId</code>.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The values for the filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;
    /**
     * <p>
     * The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>, or
     * <code>AssociationId</code>.
     * </p>
     * 
     * @param key
     *        The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>,
     *        or <code>AssociationId</code>.
     * @see OpsItemRelatedItemsFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>, or
     * <code>AssociationId</code>.
     * </p>
     * 
     * @return The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>,
     *         or <code>AssociationId</code>.
     * @see OpsItemRelatedItemsFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>, or
     * <code>AssociationId</code>.
     * </p>
     * 
     * @param key
     *        The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>,
     *        or <code>AssociationId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemRelatedItemsFilterKey
     */

    public OpsItemRelatedItemsFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>, or
     * <code>AssociationId</code>.
     * </p>
     * 
     * @param key
     *        The name of the filter key. Supported values include <code>ResourceUri</code>, <code>ResourceType</code>,
     *        or <code>AssociationId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemRelatedItemsFilterKey
     */

    public OpsItemRelatedItemsFilter withKey(OpsItemRelatedItemsFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * The values for the filter.
     * </p>
     * 
     * @return The values for the filter.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The values for the filter.
     * </p>
     * 
     * @param values
     *        The values for the filter.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The values for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemsFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values for the filter.
     * </p>
     * 
     * @param values
     *        The values for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpsItemRelatedItemsFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * </p>
     * 
     * @param operator
     *        The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * @see OpsItemRelatedItemsFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * </p>
     * 
     * @return The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * @see OpsItemRelatedItemsFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * </p>
     * 
     * @param operator
     *        The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemRelatedItemsFilterOperator
     */

    public OpsItemRelatedItemsFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * </p>
     * 
     * @param operator
     *        The operator used by the filter call. The only supported operator is <code>EQUAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpsItemRelatedItemsFilterOperator
     */

    public OpsItemRelatedItemsFilter withOperator(OpsItemRelatedItemsFilterOperator operator) {
        this.operator = operator.toString();
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpsItemRelatedItemsFilter == false)
            return false;
        OpsItemRelatedItemsFilter other = (OpsItemRelatedItemsFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public OpsItemRelatedItemsFilter clone() {
        try {
            return (OpsItemRelatedItemsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.OpsItemRelatedItemsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
