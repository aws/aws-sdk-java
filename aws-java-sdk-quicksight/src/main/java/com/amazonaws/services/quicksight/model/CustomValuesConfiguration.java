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
 * The configuration of custom values for the destination parameter in
 * <code>DestinationParameterValueConfiguration</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomValuesConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomValuesConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Includes the null value in custom action parameter values.
     * </p>
     */
    private Boolean includeNullValue;

    private CustomParameterValues customValues;

    /**
     * <p>
     * Includes the null value in custom action parameter values.
     * </p>
     * 
     * @param includeNullValue
     *        Includes the null value in custom action parameter values.
     */

    public void setIncludeNullValue(Boolean includeNullValue) {
        this.includeNullValue = includeNullValue;
    }

    /**
     * <p>
     * Includes the null value in custom action parameter values.
     * </p>
     * 
     * @return Includes the null value in custom action parameter values.
     */

    public Boolean getIncludeNullValue() {
        return this.includeNullValue;
    }

    /**
     * <p>
     * Includes the null value in custom action parameter values.
     * </p>
     * 
     * @param includeNullValue
     *        Includes the null value in custom action parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomValuesConfiguration withIncludeNullValue(Boolean includeNullValue) {
        setIncludeNullValue(includeNullValue);
        return this;
    }

    /**
     * <p>
     * Includes the null value in custom action parameter values.
     * </p>
     * 
     * @return Includes the null value in custom action parameter values.
     */

    public Boolean isIncludeNullValue() {
        return this.includeNullValue;
    }

    /**
     * @param customValues
     */

    public void setCustomValues(CustomParameterValues customValues) {
        this.customValues = customValues;
    }

    /**
     * @return
     */

    public CustomParameterValues getCustomValues() {
        return this.customValues;
    }

    /**
     * @param customValues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomValuesConfiguration withCustomValues(CustomParameterValues customValues) {
        setCustomValues(customValues);
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
        if (getIncludeNullValue() != null)
            sb.append("IncludeNullValue: ").append(getIncludeNullValue()).append(",");
        if (getCustomValues() != null)
            sb.append("CustomValues: ").append(getCustomValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomValuesConfiguration == false)
            return false;
        CustomValuesConfiguration other = (CustomValuesConfiguration) obj;
        if (other.getIncludeNullValue() == null ^ this.getIncludeNullValue() == null)
            return false;
        if (other.getIncludeNullValue() != null && other.getIncludeNullValue().equals(this.getIncludeNullValue()) == false)
            return false;
        if (other.getCustomValues() == null ^ this.getCustomValues() == null)
            return false;
        if (other.getCustomValues() != null && other.getCustomValues().equals(this.getCustomValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncludeNullValue() == null) ? 0 : getIncludeNullValue().hashCode());
        hashCode = prime * hashCode + ((getCustomValues() == null) ? 0 : getCustomValues().hashCode());
        return hashCode;
    }

    @Override
    public CustomValuesConfiguration clone() {
        try {
            return (CustomValuesConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomValuesConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
