/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The comparison display configuration of a KPI or gauge chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ComparisonConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComparisonConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method of the comparison. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String comparisonMethod;
    /**
     * <p>
     * The format of the comparison.
     * </p>
     */
    private ComparisonFormatConfiguration comparisonFormat;

    /**
     * <p>
     * The method of the comparison. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param comparisonMethod
     *        The method of the comparison. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DIFFERENCE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT_DIFFERENCE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT</code>
     *        </p>
     *        </li>
     * @see ComparisonMethod
     */

    public void setComparisonMethod(String comparisonMethod) {
        this.comparisonMethod = comparisonMethod;
    }

    /**
     * <p>
     * The method of the comparison. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The method of the comparison. Choose from the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DIFFERENCE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PERCENT_DIFFERENCE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PERCENT</code>
     *         </p>
     *         </li>
     * @see ComparisonMethod
     */

    public String getComparisonMethod() {
        return this.comparisonMethod;
    }

    /**
     * <p>
     * The method of the comparison. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param comparisonMethod
     *        The method of the comparison. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DIFFERENCE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT_DIFFERENCE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonMethod
     */

    public ComparisonConfiguration withComparisonMethod(String comparisonMethod) {
        setComparisonMethod(comparisonMethod);
        return this;
    }

    /**
     * <p>
     * The method of the comparison. Choose from the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT_DIFFERENCE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERCENT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param comparisonMethod
     *        The method of the comparison. Choose from the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DIFFERENCE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT_DIFFERENCE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERCENT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonMethod
     */

    public ComparisonConfiguration withComparisonMethod(ComparisonMethod comparisonMethod) {
        this.comparisonMethod = comparisonMethod.toString();
        return this;
    }

    /**
     * <p>
     * The format of the comparison.
     * </p>
     * 
     * @param comparisonFormat
     *        The format of the comparison.
     */

    public void setComparisonFormat(ComparisonFormatConfiguration comparisonFormat) {
        this.comparisonFormat = comparisonFormat;
    }

    /**
     * <p>
     * The format of the comparison.
     * </p>
     * 
     * @return The format of the comparison.
     */

    public ComparisonFormatConfiguration getComparisonFormat() {
        return this.comparisonFormat;
    }

    /**
     * <p>
     * The format of the comparison.
     * </p>
     * 
     * @param comparisonFormat
     *        The format of the comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparisonConfiguration withComparisonFormat(ComparisonFormatConfiguration comparisonFormat) {
        setComparisonFormat(comparisonFormat);
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
        if (getComparisonMethod() != null)
            sb.append("ComparisonMethod: ").append(getComparisonMethod()).append(",");
        if (getComparisonFormat() != null)
            sb.append("ComparisonFormat: ").append(getComparisonFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparisonConfiguration == false)
            return false;
        ComparisonConfiguration other = (ComparisonConfiguration) obj;
        if (other.getComparisonMethod() == null ^ this.getComparisonMethod() == null)
            return false;
        if (other.getComparisonMethod() != null && other.getComparisonMethod().equals(this.getComparisonMethod()) == false)
            return false;
        if (other.getComparisonFormat() == null ^ this.getComparisonFormat() == null)
            return false;
        if (other.getComparisonFormat() != null && other.getComparisonFormat().equals(this.getComparisonFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComparisonMethod() == null) ? 0 : getComparisonMethod().hashCode());
        hashCode = prime * hashCode + ((getComparisonFormat() == null) ? 0 : getComparisonFormat().hashCode());
        return hashCode;
    }

    @Override
    public ComparisonConfiguration clone() {
        try {
            return (ComparisonConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComparisonConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
