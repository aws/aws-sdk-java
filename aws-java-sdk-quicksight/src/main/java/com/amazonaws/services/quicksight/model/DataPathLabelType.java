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
 * The option that specifies individual data values for labels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataPathLabelType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPathLabelType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID of the field that the data label needs to be applied to.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The actual value of the field that is labeled.
     * </p>
     */
    private String fieldValue;
    /**
     * <p>
     * The visibility of the data label.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The field ID of the field that the data label needs to be applied to.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the field that the data label needs to be applied to.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID of the field that the data label needs to be applied to.
     * </p>
     * 
     * @return The field ID of the field that the data label needs to be applied to.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID of the field that the data label needs to be applied to.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the field that the data label needs to be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPathLabelType withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The actual value of the field that is labeled.
     * </p>
     * 
     * @param fieldValue
     *        The actual value of the field that is labeled.
     */

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * <p>
     * The actual value of the field that is labeled.
     * </p>
     * 
     * @return The actual value of the field that is labeled.
     */

    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * <p>
     * The actual value of the field that is labeled.
     * </p>
     * 
     * @param fieldValue
     *        The actual value of the field that is labeled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPathLabelType withFieldValue(String fieldValue) {
        setFieldValue(fieldValue);
        return this;
    }

    /**
     * <p>
     * The visibility of the data label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data label.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the data label.
     * </p>
     * 
     * @return The visibility of the data label.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the data label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataPathLabelType withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the data label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the data label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DataPathLabelType withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
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
        if (getFieldValue() != null)
            sb.append("FieldValue: ").append("***Sensitive Data Redacted***").append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPathLabelType == false)
            return false;
        DataPathLabelType other = (DataPathLabelType) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getFieldValue() == null ^ this.getFieldValue() == null)
            return false;
        if (other.getFieldValue() != null && other.getFieldValue().equals(this.getFieldValue()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldId() == null) ? 0 : getFieldId().hashCode());
        hashCode = prime * hashCode + ((getFieldValue() == null) ? 0 : getFieldValue().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public DataPathLabelType clone() {
        try {
            return (DataPathLabelType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataPathLabelTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
