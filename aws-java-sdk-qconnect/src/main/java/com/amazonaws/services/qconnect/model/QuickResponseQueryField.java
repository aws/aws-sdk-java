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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The quick response fields to query quick responses by.
 * </p>
 * <p>
 * The following is the list of supported field names.
 * </p>
 * <ul>
 * <li>
 * <p>
 * content
 * </p>
 * </li>
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
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QuickResponseQueryField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseQueryField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the query expects only exact matches on the attribute field values. The results of the query will only
     * include exact matches if this parameter is set to false.
     * </p>
     */
    private Boolean allowFuzziness;
    /**
     * <p>
     * The name of the attribute to query the quick responses by.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The operator to use for matching attribute field values in the query.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The importance of the attribute field when calculating query result relevancy scores. The value set for this
     * parameter affects the ordering of search results.
     * </p>
     */
    private String priority;
    /**
     * <p>
     * The values of the attribute to query the quick responses by.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * Whether the query expects only exact matches on the attribute field values. The results of the query will only
     * include exact matches if this parameter is set to false.
     * </p>
     * 
     * @param allowFuzziness
     *        Whether the query expects only exact matches on the attribute field values. The results of the query will
     *        only include exact matches if this parameter is set to false.
     */

    public void setAllowFuzziness(Boolean allowFuzziness) {
        this.allowFuzziness = allowFuzziness;
    }

    /**
     * <p>
     * Whether the query expects only exact matches on the attribute field values. The results of the query will only
     * include exact matches if this parameter is set to false.
     * </p>
     * 
     * @return Whether the query expects only exact matches on the attribute field values. The results of the query will
     *         only include exact matches if this parameter is set to false.
     */

    public Boolean getAllowFuzziness() {
        return this.allowFuzziness;
    }

    /**
     * <p>
     * Whether the query expects only exact matches on the attribute field values. The results of the query will only
     * include exact matches if this parameter is set to false.
     * </p>
     * 
     * @param allowFuzziness
     *        Whether the query expects only exact matches on the attribute field values. The results of the query will
     *        only include exact matches if this parameter is set to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseQueryField withAllowFuzziness(Boolean allowFuzziness) {
        setAllowFuzziness(allowFuzziness);
        return this;
    }

    /**
     * <p>
     * Whether the query expects only exact matches on the attribute field values. The results of the query will only
     * include exact matches if this parameter is set to false.
     * </p>
     * 
     * @return Whether the query expects only exact matches on the attribute field values. The results of the query will
     *         only include exact matches if this parameter is set to false.
     */

    public Boolean isAllowFuzziness() {
        return this.allowFuzziness;
    }

    /**
     * <p>
     * The name of the attribute to query the quick responses by.
     * </p>
     * 
     * @param name
     *        The name of the attribute to query the quick responses by.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the attribute to query the quick responses by.
     * </p>
     * 
     * @return The name of the attribute to query the quick responses by.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the attribute to query the quick responses by.
     * </p>
     * 
     * @param name
     *        The name of the attribute to query the quick responses by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseQueryField withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The operator to use for matching attribute field values in the query.
     * </p>
     * 
     * @param operator
     *        The operator to use for matching attribute field values in the query.
     * @see QuickResponseQueryOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use for matching attribute field values in the query.
     * </p>
     * 
     * @return The operator to use for matching attribute field values in the query.
     * @see QuickResponseQueryOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use for matching attribute field values in the query.
     * </p>
     * 
     * @param operator
     *        The operator to use for matching attribute field values in the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickResponseQueryOperator
     */

    public QuickResponseQueryField withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to use for matching attribute field values in the query.
     * </p>
     * 
     * @param operator
     *        The operator to use for matching attribute field values in the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuickResponseQueryOperator
     */

    public QuickResponseQueryField withOperator(QuickResponseQueryOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The importance of the attribute field when calculating query result relevancy scores. The value set for this
     * parameter affects the ordering of search results.
     * </p>
     * 
     * @param priority
     *        The importance of the attribute field when calculating query result relevancy scores. The value set for
     *        this parameter affects the ordering of search results.
     * @see Priority
     */

    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The importance of the attribute field when calculating query result relevancy scores. The value set for this
     * parameter affects the ordering of search results.
     * </p>
     * 
     * @return The importance of the attribute field when calculating query result relevancy scores. The value set for
     *         this parameter affects the ordering of search results.
     * @see Priority
     */

    public String getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The importance of the attribute field when calculating query result relevancy scores. The value set for this
     * parameter affects the ordering of search results.
     * </p>
     * 
     * @param priority
     *        The importance of the attribute field when calculating query result relevancy scores. The value set for
     *        this parameter affects the ordering of search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Priority
     */

    public QuickResponseQueryField withPriority(String priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The importance of the attribute field when calculating query result relevancy scores. The value set for this
     * parameter affects the ordering of search results.
     * </p>
     * 
     * @param priority
     *        The importance of the attribute field when calculating query result relevancy scores. The value set for
     *        this parameter affects the ordering of search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Priority
     */

    public QuickResponseQueryField withPriority(Priority priority) {
        this.priority = priority.toString();
        return this;
    }

    /**
     * <p>
     * The values of the attribute to query the quick responses by.
     * </p>
     * 
     * @return The values of the attribute to query the quick responses by.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values of the attribute to query the quick responses by.
     * </p>
     * 
     * @param values
     *        The values of the attribute to query the quick responses by.
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
     * The values of the attribute to query the quick responses by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the attribute to query the quick responses by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseQueryField withValues(String... values) {
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
     * The values of the attribute to query the quick responses by.
     * </p>
     * 
     * @param values
     *        The values of the attribute to query the quick responses by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseQueryField withValues(java.util.Collection<String> values) {
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
        if (getAllowFuzziness() != null)
            sb.append("AllowFuzziness: ").append(getAllowFuzziness()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
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

        if (obj instanceof QuickResponseQueryField == false)
            return false;
        QuickResponseQueryField other = (QuickResponseQueryField) obj;
        if (other.getAllowFuzziness() == null ^ this.getAllowFuzziness() == null)
            return false;
        if (other.getAllowFuzziness() != null && other.getAllowFuzziness().equals(this.getAllowFuzziness()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
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

        hashCode = prime * hashCode + ((getAllowFuzziness() == null) ? 0 : getAllowFuzziness().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public QuickResponseQueryField clone() {
        try {
            return (QuickResponseQueryField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.QuickResponseQueryFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
