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
 * The data options for an axis.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisDataOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisDataOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The options for an axis with a numeric field.
     * </p>
     */
    private NumericAxisOptions numericAxisOptions;
    /**
     * <p>
     * The options for an axis with a date field.
     * </p>
     */
    private DateAxisOptions dateAxisOptions;

    /**
     * <p>
     * The options for an axis with a numeric field.
     * </p>
     * 
     * @param numericAxisOptions
     *        The options for an axis with a numeric field.
     */

    public void setNumericAxisOptions(NumericAxisOptions numericAxisOptions) {
        this.numericAxisOptions = numericAxisOptions;
    }

    /**
     * <p>
     * The options for an axis with a numeric field.
     * </p>
     * 
     * @return The options for an axis with a numeric field.
     */

    public NumericAxisOptions getNumericAxisOptions() {
        return this.numericAxisOptions;
    }

    /**
     * <p>
     * The options for an axis with a numeric field.
     * </p>
     * 
     * @param numericAxisOptions
     *        The options for an axis with a numeric field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDataOptions withNumericAxisOptions(NumericAxisOptions numericAxisOptions) {
        setNumericAxisOptions(numericAxisOptions);
        return this;
    }

    /**
     * <p>
     * The options for an axis with a date field.
     * </p>
     * 
     * @param dateAxisOptions
     *        The options for an axis with a date field.
     */

    public void setDateAxisOptions(DateAxisOptions dateAxisOptions) {
        this.dateAxisOptions = dateAxisOptions;
    }

    /**
     * <p>
     * The options for an axis with a date field.
     * </p>
     * 
     * @return The options for an axis with a date field.
     */

    public DateAxisOptions getDateAxisOptions() {
        return this.dateAxisOptions;
    }

    /**
     * <p>
     * The options for an axis with a date field.
     * </p>
     * 
     * @param dateAxisOptions
     *        The options for an axis with a date field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDataOptions withDateAxisOptions(DateAxisOptions dateAxisOptions) {
        setDateAxisOptions(dateAxisOptions);
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
        if (getNumericAxisOptions() != null)
            sb.append("NumericAxisOptions: ").append(getNumericAxisOptions()).append(",");
        if (getDateAxisOptions() != null)
            sb.append("DateAxisOptions: ").append(getDateAxisOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisDataOptions == false)
            return false;
        AxisDataOptions other = (AxisDataOptions) obj;
        if (other.getNumericAxisOptions() == null ^ this.getNumericAxisOptions() == null)
            return false;
        if (other.getNumericAxisOptions() != null && other.getNumericAxisOptions().equals(this.getNumericAxisOptions()) == false)
            return false;
        if (other.getDateAxisOptions() == null ^ this.getDateAxisOptions() == null)
            return false;
        if (other.getDateAxisOptions() != null && other.getDateAxisOptions().equals(this.getDateAxisOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNumericAxisOptions() == null) ? 0 : getNumericAxisOptions().hashCode());
        hashCode = prime * hashCode + ((getDateAxisOptions() == null) ? 0 : getDateAxisOptions().hashCode());
        return hashCode;
    }

    @Override
    public AxisDataOptions clone() {
        try {
            return (AxisDataOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisDataOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
