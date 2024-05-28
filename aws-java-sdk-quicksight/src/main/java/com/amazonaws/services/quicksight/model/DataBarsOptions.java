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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options for data bars.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataBarsOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataBarsOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID for the data bars options.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The color of the positive data bar.
     * </p>
     */
    private String positiveColor;
    /**
     * <p>
     * The color of the negative data bar.
     * </p>
     */
    private String negativeColor;

    /**
     * <p>
     * The field ID for the data bars options.
     * </p>
     * 
     * @param fieldId
     *        The field ID for the data bars options.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID for the data bars options.
     * </p>
     * 
     * @return The field ID for the data bars options.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID for the data bars options.
     * </p>
     * 
     * @param fieldId
     *        The field ID for the data bars options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataBarsOptions withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The color of the positive data bar.
     * </p>
     * 
     * @param positiveColor
     *        The color of the positive data bar.
     */

    public void setPositiveColor(String positiveColor) {
        this.positiveColor = positiveColor;
    }

    /**
     * <p>
     * The color of the positive data bar.
     * </p>
     * 
     * @return The color of the positive data bar.
     */

    public String getPositiveColor() {
        return this.positiveColor;
    }

    /**
     * <p>
     * The color of the positive data bar.
     * </p>
     * 
     * @param positiveColor
     *        The color of the positive data bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataBarsOptions withPositiveColor(String positiveColor) {
        setPositiveColor(positiveColor);
        return this;
    }

    /**
     * <p>
     * The color of the negative data bar.
     * </p>
     * 
     * @param negativeColor
     *        The color of the negative data bar.
     */

    public void setNegativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
    }

    /**
     * <p>
     * The color of the negative data bar.
     * </p>
     * 
     * @return The color of the negative data bar.
     */

    public String getNegativeColor() {
        return this.negativeColor;
    }

    /**
     * <p>
     * The color of the negative data bar.
     * </p>
     * 
     * @param negativeColor
     *        The color of the negative data bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataBarsOptions withNegativeColor(String negativeColor) {
        setNegativeColor(negativeColor);
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
        if (getFieldId() != null)
            sb.append("FieldId: ").append(getFieldId()).append(",");
        if (getPositiveColor() != null)
            sb.append("PositiveColor: ").append(getPositiveColor()).append(",");
        if (getNegativeColor() != null)
            sb.append("NegativeColor: ").append(getNegativeColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataBarsOptions == false)
            return false;
        DataBarsOptions other = (DataBarsOptions) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getPositiveColor() == null ^ this.getPositiveColor() == null)
            return false;
        if (other.getPositiveColor() != null && other.getPositiveColor().equals(this.getPositiveColor()) == false)
            return false;
        if (other.getNegativeColor() == null ^ this.getNegativeColor() == null)
            return false;
        if (other.getNegativeColor() != null && other.getNegativeColor().equals(this.getNegativeColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getPositiveColor() == null) ? 0 : getPositiveColor().hashCode());
        hashCode = prime * hashCode + ((getNegativeColor() == null) ? 0 : getNegativeColor().hashCode());
        return hashCode;
    }

    @Override
    public DataBarsOptions clone() {
        try {
            return (DataBarsOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataBarsOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
