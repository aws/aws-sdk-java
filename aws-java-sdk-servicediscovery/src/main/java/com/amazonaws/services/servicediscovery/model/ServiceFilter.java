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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that lets you specify the namespaces that you want to list services for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ServiceFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The values that are applicable to the value that you specify for <code>Condition</code> to filter the list of
     * services.
     * </p>
     */
    private java.util.List<String> values;
    /**
     * <p>
     * The operator that you want to use to determine whether a service is returned by <code>ListServices</code>. Valid
     * values for <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     * <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you want
     * <code>ListServices</code> to return a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     */
    private String condition;

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * 
     * @param name
     *        Specify <code>NAMESPACE_ID</code>.
     * @see ServiceFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * 
     * @return Specify <code>NAMESPACE_ID</code>.
     * @see ServiceFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * 
     * @param name
     *        Specify <code>NAMESPACE_ID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceFilterName
     */

    public ServiceFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specify <code>NAMESPACE_ID</code>.
     * </p>
     * 
     * @param name
     *        Specify <code>NAMESPACE_ID</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceFilterName
     */

    public ServiceFilter withName(ServiceFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The values that are applicable to the value that you specify for <code>Condition</code> to filter the list of
     * services.
     * </p>
     * 
     * @return The values that are applicable to the value that you specify for <code>Condition</code> to filter the
     *         list of services.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that are applicable to the value that you specify for <code>Condition</code> to filter the list of
     * services.
     * </p>
     * 
     * @param values
     *        The values that are applicable to the value that you specify for <code>Condition</code> to filter the list
     *        of services.
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
     * The values that are applicable to the value that you specify for <code>Condition</code> to filter the list of
     * services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values that are applicable to the value that you specify for <code>Condition</code> to filter the list
     *        of services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceFilter withValues(String... values) {
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
     * The values that are applicable to the value that you specify for <code>Condition</code> to filter the list of
     * services.
     * </p>
     * 
     * @param values
     *        The values that are applicable to the value that you specify for <code>Condition</code> to filter the list
     *        of services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is returned by <code>ListServices</code>. Valid
     * values for <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     * <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you want
     * <code>ListServices</code> to return a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The operator that you want to use to determine whether a service is returned by <code>ListServices</code>.
     *        Valid values for <code>Condition</code> include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     *        <code>EQ</code> is the default condition and can be omitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you
     *        want <code>ListServices</code> to return a list of services for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code>: Not applicable.
     *        </p>
     *        </li>
     * @see FilterCondition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is returned by <code>ListServices</code>. Valid
     * values for <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     * <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you want
     * <code>ListServices</code> to return a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operator that you want to use to determine whether a service is returned by <code>ListServices</code>
     *         . Valid values for <code>Condition</code> include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     *         <code>EQ</code> is the default condition and can be omitted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you
     *         want <code>ListServices</code> to return a list of services for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BETWEEN</code>: Not applicable.
     *         </p>
     *         </li>
     * @see FilterCondition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is returned by <code>ListServices</code>. Valid
     * values for <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     * <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you want
     * <code>ListServices</code> to return a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The operator that you want to use to determine whether a service is returned by <code>ListServices</code>.
     *        Valid values for <code>Condition</code> include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     *        <code>EQ</code> is the default condition and can be omitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you
     *        want <code>ListServices</code> to return a list of services for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code>: Not applicable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterCondition
     */

    public ServiceFilter withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The operator that you want to use to determine whether a service is returned by <code>ListServices</code>. Valid
     * values for <code>Condition</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     * <code>EQ</code> is the default condition and can be omitted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you want
     * <code>ListServices</code> to return a list of services for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BETWEEN</code>: Not applicable.
     * </p>
     * </li>
     * </ul>
     * 
     * @param condition
     *        The operator that you want to use to determine whether a service is returned by <code>ListServices</code>.
     *        Valid values for <code>Condition</code> include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EQ</code>: When you specify <code>EQ</code>, specify one namespace ID for <code>Values</code>.
     *        <code>EQ</code> is the default condition and can be omitted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN</code>: When you specify <code>IN</code>, specify a list of the IDs for the namespaces that you
     *        want <code>ListServices</code> to return a list of services for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BETWEEN</code>: Not applicable.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterCondition
     */

    public ServiceFilter withCondition(FilterCondition condition) {
        this.condition = condition.toString();
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

        if (obj instanceof ServiceFilter == false)
            return false;
        ServiceFilter other = (ServiceFilter) obj;
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
    public ServiceFilter clone() {
        try {
            return (ServiceFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.ServiceFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
