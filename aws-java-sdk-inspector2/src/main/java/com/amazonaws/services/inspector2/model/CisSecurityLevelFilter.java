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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The CIS security level filter. Security level refers to the Benchmark levels that CIS assigns to a profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisSecurityLevelFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisSecurityLevelFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CIS security filter comparison value.
     * </p>
     */
    private String comparison;
    /**
     * <p>
     * The CIS security filter value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The CIS security filter comparison value.
     * </p>
     * 
     * @param comparison
     *        The CIS security filter comparison value.
     * @see CisSecurityLevelComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * The CIS security filter comparison value.
     * </p>
     * 
     * @return The CIS security filter comparison value.
     * @see CisSecurityLevelComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * The CIS security filter comparison value.
     * </p>
     * 
     * @param comparison
     *        The CIS security filter comparison value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevelComparison
     */

    public CisSecurityLevelFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * The CIS security filter comparison value.
     * </p>
     * 
     * @param comparison
     *        The CIS security filter comparison value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevelComparison
     */

    public CisSecurityLevelFilter withComparison(CisSecurityLevelComparison comparison) {
        this.comparison = comparison.toString();
        return this;
    }

    /**
     * <p>
     * The CIS security filter value.
     * </p>
     * 
     * @param value
     *        The CIS security filter value.
     * @see CisSecurityLevel
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The CIS security filter value.
     * </p>
     * 
     * @return The CIS security filter value.
     * @see CisSecurityLevel
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The CIS security filter value.
     * </p>
     * 
     * @param value
     *        The CIS security filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisSecurityLevelFilter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The CIS security filter value.
     * </p>
     * 
     * @param value
     *        The CIS security filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisSecurityLevelFilter withValue(CisSecurityLevel value) {
        this.value = value.toString();
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
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison()).append(",");
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

        if (obj instanceof CisSecurityLevelFilter == false)
            return false;
        CisSecurityLevelFilter other = (CisSecurityLevelFilter) obj;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
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

        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CisSecurityLevelFilter clone() {
        try {
            return (CisSecurityLevelFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisSecurityLevelFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
