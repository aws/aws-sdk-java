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
 * The format of the comparison.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ComparisonFormatConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComparisonFormatConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number display format.
     * </p>
     */
    private NumberDisplayFormatConfiguration numberDisplayFormatConfiguration;
    /**
     * <p>
     * The percentage display format.
     * </p>
     */
    private PercentageDisplayFormatConfiguration percentageDisplayFormatConfiguration;

    /**
     * <p>
     * The number display format.
     * </p>
     * 
     * @param numberDisplayFormatConfiguration
     *        The number display format.
     */

    public void setNumberDisplayFormatConfiguration(NumberDisplayFormatConfiguration numberDisplayFormatConfiguration) {
        this.numberDisplayFormatConfiguration = numberDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The number display format.
     * </p>
     * 
     * @return The number display format.
     */

    public NumberDisplayFormatConfiguration getNumberDisplayFormatConfiguration() {
        return this.numberDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The number display format.
     * </p>
     * 
     * @param numberDisplayFormatConfiguration
     *        The number display format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparisonFormatConfiguration withNumberDisplayFormatConfiguration(NumberDisplayFormatConfiguration numberDisplayFormatConfiguration) {
        setNumberDisplayFormatConfiguration(numberDisplayFormatConfiguration);
        return this;
    }

    /**
     * <p>
     * The percentage display format.
     * </p>
     * 
     * @param percentageDisplayFormatConfiguration
     *        The percentage display format.
     */

    public void setPercentageDisplayFormatConfiguration(PercentageDisplayFormatConfiguration percentageDisplayFormatConfiguration) {
        this.percentageDisplayFormatConfiguration = percentageDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The percentage display format.
     * </p>
     * 
     * @return The percentage display format.
     */

    public PercentageDisplayFormatConfiguration getPercentageDisplayFormatConfiguration() {
        return this.percentageDisplayFormatConfiguration;
    }

    /**
     * <p>
     * The percentage display format.
     * </p>
     * 
     * @param percentageDisplayFormatConfiguration
     *        The percentage display format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComparisonFormatConfiguration withPercentageDisplayFormatConfiguration(PercentageDisplayFormatConfiguration percentageDisplayFormatConfiguration) {
        setPercentageDisplayFormatConfiguration(percentageDisplayFormatConfiguration);
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
        if (getNumberDisplayFormatConfiguration() != null)
            sb.append("NumberDisplayFormatConfiguration: ").append(getNumberDisplayFormatConfiguration()).append(",");
        if (getPercentageDisplayFormatConfiguration() != null)
            sb.append("PercentageDisplayFormatConfiguration: ").append(getPercentageDisplayFormatConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComparisonFormatConfiguration == false)
            return false;
        ComparisonFormatConfiguration other = (ComparisonFormatConfiguration) obj;
        if (other.getNumberDisplayFormatConfiguration() == null ^ this.getNumberDisplayFormatConfiguration() == null)
            return false;
        if (other.getNumberDisplayFormatConfiguration() != null
                && other.getNumberDisplayFormatConfiguration().equals(this.getNumberDisplayFormatConfiguration()) == false)
            return false;
        if (other.getPercentageDisplayFormatConfiguration() == null ^ this.getPercentageDisplayFormatConfiguration() == null)
            return false;
        if (other.getPercentageDisplayFormatConfiguration() != null
                && other.getPercentageDisplayFormatConfiguration().equals(this.getPercentageDisplayFormatConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumberDisplayFormatConfiguration() == null) ? 0 : getNumberDisplayFormatConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPercentageDisplayFormatConfiguration() == null) ? 0 : getPercentageDisplayFormatConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ComparisonFormatConfiguration clone() {
        try {
            return (ComparisonFormatConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComparisonFormatConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
