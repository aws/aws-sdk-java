/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter that you apply when searching for dashboards.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardSearchFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardSearchFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The comparison operator that you want to use as a filter. For example, <code>"Operator": "StringEquals"</code>.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The name of the value that you want to use as a filter. For example, <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter. For
     * example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The comparison operator that you want to use as a filter. For example, <code>"Operator": "StringEquals"</code>.
     * </p>
     * 
     * @param operator
     *        The comparison operator that you want to use as a filter. For example,
     *        <code>"Operator": "StringEquals"</code>.
     * @see FilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter. For example, <code>"Operator": "StringEquals"</code>.
     * </p>
     * 
     * @return The comparison operator that you want to use as a filter. For example,
     *         <code>"Operator": "StringEquals"</code>.
     * @see FilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter. For example, <code>"Operator": "StringEquals"</code>.
     * </p>
     * 
     * @param operator
     *        The comparison operator that you want to use as a filter. For example,
     *        <code>"Operator": "StringEquals"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public DashboardSearchFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The comparison operator that you want to use as a filter. For example, <code>"Operator": "StringEquals"</code>.
     * </p>
     * 
     * @param operator
     *        The comparison operator that you want to use as a filter. For example,
     *        <code>"Operator": "StringEquals"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public DashboardSearchFilter withOperator(FilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter. For example, <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * 
     * @param name
     *        The name of the value that you want to use as a filter. For example,
     *        <code>"Name": "QUICKSIGHT_USER"</code>.
     * @see DashboardFilterAttribute
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter. For example, <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * 
     * @return The name of the value that you want to use as a filter. For example,
     *         <code>"Name": "QUICKSIGHT_USER"</code>.
     * @see DashboardFilterAttribute
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter. For example, <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * 
     * @param name
     *        The name of the value that you want to use as a filter. For example,
     *        <code>"Name": "QUICKSIGHT_USER"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashboardFilterAttribute
     */

    public DashboardSearchFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the value that you want to use as a filter. For example, <code>"Name": "QUICKSIGHT_USER"</code>.
     * </p>
     * 
     * @param name
     *        The name of the value that you want to use as a filter. For example,
     *        <code>"Name": "QUICKSIGHT_USER"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DashboardFilterAttribute
     */

    public DashboardSearchFilter withName(DashboardFilterAttribute name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter. For
     * example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     * 
     * @param value
     *        The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter.
     *        For example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter. For
     * example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     * 
     * @return The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter.
     *         For example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter. For
     * example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * </p>
     * 
     * @param value
     *        The value of the named item, in this case <code>QUICKSIGHT_USER</code>, that you want to use as a filter.
     *        For example, <code>"Value": "arn:aws:quicksight:us-east-1:1:user/default/UserName1"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardSearchFilter withValue(String value) {
        setValue(value);
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
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardSearchFilter == false)
            return false;
        DashboardSearchFilter other = (DashboardSearchFilter) obj;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public DashboardSearchFilter clone() {
        try {
            return (DashboardSearchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardSearchFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
