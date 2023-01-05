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
 * The options for an axis with a numeric field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericAxisOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericAxisOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scale setup of a numeric axis.
     * </p>
     */
    private AxisScale scale;
    /**
     * <p>
     * The range setup of a numeric axis.
     * </p>
     */
    private AxisDisplayRange range;

    /**
     * <p>
     * The scale setup of a numeric axis.
     * </p>
     * 
     * @param scale
     *        The scale setup of a numeric axis.
     */

    public void setScale(AxisScale scale) {
        this.scale = scale;
    }

    /**
     * <p>
     * The scale setup of a numeric axis.
     * </p>
     * 
     * @return The scale setup of a numeric axis.
     */

    public AxisScale getScale() {
        return this.scale;
    }

    /**
     * <p>
     * The scale setup of a numeric axis.
     * </p>
     * 
     * @param scale
     *        The scale setup of a numeric axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericAxisOptions withScale(AxisScale scale) {
        setScale(scale);
        return this;
    }

    /**
     * <p>
     * The range setup of a numeric axis.
     * </p>
     * 
     * @param range
     *        The range setup of a numeric axis.
     */

    public void setRange(AxisDisplayRange range) {
        this.range = range;
    }

    /**
     * <p>
     * The range setup of a numeric axis.
     * </p>
     * 
     * @return The range setup of a numeric axis.
     */

    public AxisDisplayRange getRange() {
        return this.range;
    }

    /**
     * <p>
     * The range setup of a numeric axis.
     * </p>
     * 
     * @param range
     *        The range setup of a numeric axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericAxisOptions withRange(AxisDisplayRange range) {
        setRange(range);
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
        if (getScale() != null)
            sb.append("Scale: ").append(getScale()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericAxisOptions == false)
            return false;
        NumericAxisOptions other = (NumericAxisOptions) obj;
        if (other.getScale() == null ^ this.getScale() == null)
            return false;
        if (other.getScale() != null && other.getScale().equals(this.getScale()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScale() == null) ? 0 : getScale().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        return hashCode;
    }

    @Override
    public NumericAxisOptions clone() {
        try {
            return (NumericAxisOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericAxisOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
