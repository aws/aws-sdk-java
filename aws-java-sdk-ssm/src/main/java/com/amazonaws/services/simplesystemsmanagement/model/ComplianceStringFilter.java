/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * One or more filters. Use a filter to return a more specific list of results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ComplianceStringFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceStringFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for which to search.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;
    /**
     * <p>
     * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     * GreaterThan.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param key
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceStringFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value for which to search.
     * </p>
     * 
     * @return The value for which to search.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value for which to search.
     * </p>
     * 
     * @param values
     *        The value for which to search.
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
     * The value for which to search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceStringFilter withValues(String... values) {
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
     * The value for which to search.
     * </p>
     * 
     * @param values
     *        The value for which to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceStringFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     * GreaterThan.
     * </p>
     * 
     * @param type
     *        The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     *        GreaterThan.
     * @see ComplianceQueryOperatorType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     * GreaterThan.
     * </p>
     * 
     * @return The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     *         GreaterThan.
     * @see ComplianceQueryOperatorType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     * GreaterThan.
     * </p>
     * 
     * @param type
     *        The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     *        GreaterThan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceQueryOperatorType
     */

    public ComplianceStringFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     * GreaterThan.
     * </p>
     * 
     * @param type
     *        The type of comparison that should be performed for the value: Equal, NotEqual, BeginWith, LessThan, or
     *        GreaterThan.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceQueryOperatorType
     */

    public ComplianceStringFilter withType(ComplianceQueryOperatorType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceStringFilter == false)
            return false;
        ComplianceStringFilter other = (ComplianceStringFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceStringFilter clone() {
        try {
            return (ComplianceStringFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.ComplianceStringFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
