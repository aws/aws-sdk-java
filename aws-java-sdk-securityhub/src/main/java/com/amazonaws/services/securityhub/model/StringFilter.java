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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A string filter for querying findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StringFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The string filter value.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Represents the condition to be applied to a string value when querying for findings.
     * </p>
     */
    private String comparison;

    /**
     * <p>
     * The string filter value.
     * </p>
     * 
     * @param value
     *        The string filter value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The string filter value.
     * </p>
     * 
     * @return The string filter value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The string filter value.
     * </p>
     * 
     * @param value
     *        The string filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringFilter withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Represents the condition to be applied to a string value when querying for findings.
     * </p>
     * 
     * @param comparison
     *        Represents the condition to be applied to a string value when querying for findings.
     * @see StringFilterComparison
     */

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    /**
     * <p>
     * Represents the condition to be applied to a string value when querying for findings.
     * </p>
     * 
     * @return Represents the condition to be applied to a string value when querying for findings.
     * @see StringFilterComparison
     */

    public String getComparison() {
        return this.comparison;
    }

    /**
     * <p>
     * Represents the condition to be applied to a string value when querying for findings.
     * </p>
     * 
     * @param comparison
     *        Represents the condition to be applied to a string value when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringFilterComparison
     */

    public StringFilter withComparison(String comparison) {
        setComparison(comparison);
        return this;
    }

    /**
     * <p>
     * Represents the condition to be applied to a string value when querying for findings.
     * </p>
     * 
     * @param comparison
     *        Represents the condition to be applied to a string value when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StringFilterComparison
     */

    public StringFilter withComparison(StringFilterComparison comparison) {
        this.comparison = comparison.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getComparison() != null)
            sb.append("Comparison: ").append(getComparison());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringFilter == false)
            return false;
        StringFilter other = (StringFilter) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getComparison() == null ^ this.getComparison() == null)
            return false;
        if (other.getComparison() != null && other.getComparison().equals(this.getComparison()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getComparison() == null) ? 0 : getComparison().hashCode());
        return hashCode;
    }

    @Override
    public StringFilter clone() {
        try {
            return (StringFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StringFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
