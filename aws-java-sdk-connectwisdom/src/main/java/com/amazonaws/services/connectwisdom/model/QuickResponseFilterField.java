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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The quick response fields to filter the quick response query results by.
 * </p>
 * <p>
 * The following is the list of supported field names.
 * </p>
 * <ul>
 * <li>
 * <p>
 * name
 * </p>
 * </li>
 * <li>
 * <p>
 * description
 * </p>
 * </li>
 * <li>
 * <p>
 * shortcutKey
 * </p>
 * </li>
 * <li>
 * <p>
 * isActive
 * </p>
 * </li>
 * <li>
 * <p>
 * channels
 * </p>
 * </li>
 * <li>
 * <p>
 * language
 * </p>
 * </li>
 * <li>
 * <p>
 * contentType
 * </p>
 * </li>
 * <li>
 * <p>
 * createdTime
 * </p>
 * </li>
 * <li>
 * <p>
 * lastModifiedTime
 * </p>
 * </li>
 * <li>
 * <p>
 * lastModifiedBy
 * </p>
 * </li>
 * <li>
 * <p>
 * groupingConfiguration.criteria
 * </p>
 * </li>
 * <li>
 * <p>
 * groupingConfiguration.values
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/QuickResponseFilterField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseFilterField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to treat null value as a match for the attribute field.
     * </p>
     */
    private Boolean includeNoExistence;
    /**
     * <p>
     * The name of the attribute field to filter the quick responses by.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The operator to use for filtering.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The values of attribute field to filter the quick response by.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * Whether to treat null value as a match for the attribute field.
     * </p>
     * 
     * @param includeNoExistence
     *        Whether to treat null value as a match for the attribute field.
     */

    public void setIncludeNoExistence(Boolean includeNoExistence) {
        this.includeNoExistence = includeNoExistence;
    }

    /**
     * <p>
     * Whether to treat null value as a match for the attribute field.
     * </p>
     * 
     * @return Whether to treat null value as a match for the attribute field.
     */

    public Boolean getIncludeNoExistence() {
        return this.includeNoExistence;
    }

    /**
     * <p>
     * Whether to treat null value as a match for the attribute field.
     * </p>
     * 
     * @param includeNoExistence
     *        Whether to treat null value as a match for the attribute field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseFilterField withIncludeNoExistence(Boolean includeNoExistence) {
        setIncludeNoExistence(includeNoExistence);
        return this;
    }

    /**
     * <p>
     * Whether to treat null value as a match for the attribute field.
     * </p>
     * 
     * @return Whether to treat null value as a match for the attribute field.
     */

    public Boolean isIncludeNoExistence() {
        return this.includeNoExistence;
    }

    /**
     * <p>
     * The name of the attribute field to filter the quick responses by.
     * </p>
     * 
     * @param name
     *        The name of the attribute field to filter the quick responses by.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute field to filter the quick responses by.
     * </p>
     * 
     * @return The name of the attribute field to filter the quick responses by.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute field to filter the quick responses by.
     * </p>
     * 
     * @param name
     *        The name of the attribute field to filter the quick responses by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseFilterField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The operator to use for filtering.
     * </p>
     * 
     * @param operator
     *        The operator to use for filtering.
     * @see QuickResponseFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use for filtering.
     * </p>
     * 
     * @return The operator to use for filtering.
     * @see QuickResponseFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use for filtering.
     * </p>
     * 
     * @param operator
     *        The operator to use for filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickResponseFilterOperator
     */

    public QuickResponseFilterField withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to use for filtering.
     * </p>
     * 
     * @param operator
     *        The operator to use for filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickResponseFilterOperator
     */

    public QuickResponseFilterField withOperator(QuickResponseFilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The values of attribute field to filter the quick response by.
     * </p>
     * 
     * @return The values of attribute field to filter the quick response by.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of attribute field to filter the quick response by.
     * </p>
     * 
     * @param values
     *        The values of attribute field to filter the quick response by.
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
     * The values of attribute field to filter the quick response by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of attribute field to filter the quick response by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseFilterField withValues(String... values) {
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
     * The values of attribute field to filter the quick response by.
     * </p>
     * 
     * @param values
     *        The values of attribute field to filter the quick response by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseFilterField withValues(java.util.Collection<String> values) {
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
        if (getIncludeNoExistence() != null)
            sb.append("IncludeNoExistence: ").append(getIncludeNoExistence()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
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

        if (obj instanceof QuickResponseFilterField == false)
            return false;
        QuickResponseFilterField other = (QuickResponseFilterField) obj;
        if (other.getIncludeNoExistence() == null ^ this.getIncludeNoExistence() == null)
            return false;
        if (other.getIncludeNoExistence() != null && other.getIncludeNoExistence().equals(this.getIncludeNoExistence()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
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

        hashCode = prime * hashCode + ((getIncludeNoExistence() == null) ? 0 : getIncludeNoExistence().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public QuickResponseFilterField clone() {
        try {
            return (QuickResponseFilterField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.QuickResponseFilterFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
