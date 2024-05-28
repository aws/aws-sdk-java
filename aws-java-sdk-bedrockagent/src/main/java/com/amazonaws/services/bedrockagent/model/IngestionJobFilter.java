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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines a filter by which to filter the results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/IngestionJobFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionJobFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attribute by which to filter the results.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The operation to carry out between the attribute and the values.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * A list of values for the attribute.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The attribute by which to filter the results.
     * </p>
     * 
     * @param attribute
     *        The attribute by which to filter the results.
     * @see IngestionJobFilterAttribute
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The attribute by which to filter the results.
     * </p>
     * 
     * @return The attribute by which to filter the results.
     * @see IngestionJobFilterAttribute
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The attribute by which to filter the results.
     * </p>
     * 
     * @param attribute
     *        The attribute by which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobFilterAttribute
     */

    public IngestionJobFilter withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The attribute by which to filter the results.
     * </p>
     * 
     * @param attribute
     *        The attribute by which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobFilterAttribute
     */

    public IngestionJobFilter withAttribute(IngestionJobFilterAttribute attribute) {
        this.attribute = attribute.toString();
        return this;
    }

    /**
     * <p>
     * The operation to carry out between the attribute and the values.
     * </p>
     * 
     * @param operator
     *        The operation to carry out between the attribute and the values.
     * @see IngestionJobFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operation to carry out between the attribute and the values.
     * </p>
     * 
     * @return The operation to carry out between the attribute and the values.
     * @see IngestionJobFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operation to carry out between the attribute and the values.
     * </p>
     * 
     * @param operator
     *        The operation to carry out between the attribute and the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobFilterOperator
     */

    public IngestionJobFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operation to carry out between the attribute and the values.
     * </p>
     * 
     * @param operator
     *        The operation to carry out between the attribute and the values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionJobFilterOperator
     */

    public IngestionJobFilter withOperator(IngestionJobFilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * A list of values for the attribute.
     * </p>
     * 
     * @return A list of values for the attribute.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of values for the attribute.
     * </p>
     * 
     * @param values
     *        A list of values for the attribute.
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
     * A list of values for the attribute.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of values for the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobFilter withValues(String... values) {
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
     * A list of values for the attribute.
     * </p>
     * 
     * @param values
     *        A list of values for the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionJobFilter withValues(java.util.Collection<String> values) {
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
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

        if (obj instanceof IngestionJobFilter == false)
            return false;
        IngestionJobFilter other = (IngestionJobFilter) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
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

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public IngestionJobFilter clone() {
        try {
            return (IngestionJobFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.IngestionJobFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
