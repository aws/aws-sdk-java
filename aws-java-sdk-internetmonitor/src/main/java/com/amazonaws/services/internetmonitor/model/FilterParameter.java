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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter that you use with the results of a Amazon CloudWatch Internet Monitor query that you created and ran. The
 * query sets up a repository of data that is a subset of your application's Internet Monitor data.
 * <code>FilterParameter</code> is a string that defines how you want to filter the repository of data to return a set
 * of results, based on your criteria.
 * </p>
 * <p>
 * The filter parameters that you can specify depend on the query type that you used to create the repository, since
 * each query type returns a different set of Internet Monitor data.
 * </p>
 * <p>
 * For each filter, you specify a field (such as <code>city</code>), an operator (such as <code>not_equals</code>, and a
 * value or array of values (such as <code>["Seattle", "Redmond"]</code>). Separate values in the array with commas.
 * </p>
 * <p>
 * For more information about specifying filter parameters, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
 * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
 * Guide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/FilterParameter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A data field that you want to filter, to further scope your application's Internet Monitor data in a repository
     * that you created by running a query. A field might be <code>city</code>, for example. The field must be one of
     * the fields that was returned by the specific query that you used to create the repository.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * One or more values to be used, together with the specified operator, to filter data for a query. For example, you
     * could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the array are separated
     * by commas.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * A data field that you want to filter, to further scope your application's Internet Monitor data in a repository
     * that you created by running a query. A field might be <code>city</code>, for example. The field must be one of
     * the fields that was returned by the specific query that you used to create the repository.
     * </p>
     * 
     * @param field
     *        A data field that you want to filter, to further scope your application's Internet Monitor data in a
     *        repository that you created by running a query. A field might be <code>city</code>, for example. The field
     *        must be one of the fields that was returned by the specific query that you used to create the repository.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * A data field that you want to filter, to further scope your application's Internet Monitor data in a repository
     * that you created by running a query. A field might be <code>city</code>, for example. The field must be one of
     * the fields that was returned by the specific query that you used to create the repository.
     * </p>
     * 
     * @return A data field that you want to filter, to further scope your application's Internet Monitor data in a
     *         repository that you created by running a query. A field might be <code>city</code>, for example. The
     *         field must be one of the fields that was returned by the specific query that you used to create the
     *         repository.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * A data field that you want to filter, to further scope your application's Internet Monitor data in a repository
     * that you created by running a query. A field might be <code>city</code>, for example. The field must be one of
     * the fields that was returned by the specific query that you used to create the repository.
     * </p>
     * 
     * @param field
     *        A data field that you want to filter, to further scope your application's Internet Monitor data in a
     *        repository that you created by running a query. A field might be <code>city</code>, for example. The field
     *        must be one of the fields that was returned by the specific query that you used to create the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterParameter withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * </p>
     * 
     * @param operator
     *        The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * </p>
     * 
     * @return The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * </p>
     * 
     * @param operator
     *        The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FilterParameter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * </p>
     * 
     * @param operator
     *        The operator to use with the filter field and a value, such as <code>not_equals</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FilterParameter withOperator(Operator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * One or more values to be used, together with the specified operator, to filter data for a query. For example, you
     * could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the array are separated
     * by commas.
     * </p>
     * 
     * @return One or more values to be used, together with the specified operator, to filter data for a query. For
     *         example, you could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the
     *         array are separated by commas.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more values to be used, together with the specified operator, to filter data for a query. For example, you
     * could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the array are separated
     * by commas.
     * </p>
     * 
     * @param values
     *        One or more values to be used, together with the specified operator, to filter data for a query. For
     *        example, you could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the
     *        array are separated by commas.
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
     * One or more values to be used, together with the specified operator, to filter data for a query. For example, you
     * could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the array are separated
     * by commas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One or more values to be used, together with the specified operator, to filter data for a query. For
     *        example, you could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the
     *        array are separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterParameter withValues(String... values) {
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
     * One or more values to be used, together with the specified operator, to filter data for a query. For example, you
     * could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the array are separated
     * by commas.
     * </p>
     * 
     * @param values
     *        One or more values to be used, together with the specified operator, to filter data for a query. For
     *        example, you could specify an array of values such as <code>["Seattle", "Redmond"]</code>. Values in the
     *        array are separated by commas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterParameter withValues(java.util.Collection<String> values) {
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
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

        if (obj instanceof FilterParameter == false)
            return false;
        FilterParameter other = (FilterParameter) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
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

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public FilterParameter clone() {
        try {
            return (FilterParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.FilterParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
