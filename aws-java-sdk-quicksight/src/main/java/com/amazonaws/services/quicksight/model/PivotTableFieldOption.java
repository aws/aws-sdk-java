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
 * The selected field options for the pivot table field options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableFieldOption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableFieldOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field ID of the pivot table field.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The custom label of the pivot table field.
     * </p>
     */
    private String customLabel;
    /**
     * <p>
     * The visibility of the pivot table field.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The field ID of the pivot table field.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the pivot table field.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The field ID of the pivot table field.
     * </p>
     * 
     * @return The field ID of the pivot table field.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The field ID of the pivot table field.
     * </p>
     * 
     * @param fieldId
     *        The field ID of the pivot table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldOption withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The custom label of the pivot table field.
     * </p>
     * 
     * @param customLabel
     *        The custom label of the pivot table field.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The custom label of the pivot table field.
     * </p>
     * 
     * @return The custom label of the pivot table field.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The custom label of the pivot table field.
     * </p>
     * 
     * @param customLabel
     *        The custom label of the pivot table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldOption withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
        return this;
    }

    /**
     * <p>
     * The visibility of the pivot table field.
     * </p>
     * 
     * @param visibility
     *        The visibility of the pivot table field.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the pivot table field.
     * </p>
     * 
     * @return The visibility of the pivot table field.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the pivot table field.
     * </p>
     * 
     * @param visibility
     *        The visibility of the pivot table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableFieldOption withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the pivot table field.
     * </p>
     * 
     * @param visibility
     *        The visibility of the pivot table field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableFieldOption withVisibility(Visibility visibility) {
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
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel()).append(",");
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

        if (obj instanceof PivotTableFieldOption == false)
            return false;
        PivotTableFieldOption other = (PivotTableFieldOption) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
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
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableFieldOption clone() {
        try {
            return (PivotTableFieldOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableFieldOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
