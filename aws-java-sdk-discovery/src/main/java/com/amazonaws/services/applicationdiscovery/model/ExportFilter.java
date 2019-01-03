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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to select which agent's data is to be exported. A single agent ID may be selected for export using the <a
 * href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_StartExportTask.html"
 * >StartExportTask</a> action.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form <code>o-0123456789abcdef0</code>
     * .
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * Supported condition: <code>EQUALS</code>
     * </p>
     */
    private String condition;

    /**
     * <p>
     * A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     * </p>
     * 
     * @param name
     *        A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     * </p>
     * 
     * @return A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     * </p>
     * 
     * @param name
     *        A single <code>ExportFilter</code> name. Supported filters: <code>agentId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form <code>o-0123456789abcdef0</code>
     * .
     * </p>
     * 
     * @return A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     *         href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html">
     *         DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form
     *         <code>o-0123456789abcdef0</code>.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form <code>o-0123456789abcdef0</code>
     * .
     * </p>
     * 
     * @param values
     *        A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     *        href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html">
     *        DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form
     *        <code>o-0123456789abcdef0</code>.
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
     * A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form <code>o-0123456789abcdef0</code>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     *        href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html">
     *        DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form
     *        <code>o-0123456789abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportFilter withValues(String... values) {
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
     * A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     * href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html"
     * >DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form <code>o-0123456789abcdef0</code>
     * .
     * </p>
     * 
     * @param values
     *        A single <code>agentId</code> for a Discovery Agent. An <code>agentId</code> can be found using the <a
     *        href="http://docs.aws.amazon.com/application-discovery/latest/APIReference/API_DescribeExportTasks.html">
     *        DescribeAgents</a> action. Typically an ADS <code>agentId</code> is in the form
     *        <code>o-0123456789abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * Supported condition: <code>EQUALS</code>
     * </p>
     * 
     * @param condition
     *        Supported condition: <code>EQUALS</code>
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * Supported condition: <code>EQUALS</code>
     * </p>
     * 
     * @return Supported condition: <code>EQUALS</code>
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * Supported condition: <code>EQUALS</code>
     * </p>
     * 
     * @param condition
     *        Supported condition: <code>EQUALS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportFilter withCondition(String condition) {
        setCondition(condition);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportFilter == false)
            return false;
        ExportFilter other = (ExportFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        return hashCode;
    }

    @Override
    public ExportFilter clone() {
        try {
            return (ExportFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ExportFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
