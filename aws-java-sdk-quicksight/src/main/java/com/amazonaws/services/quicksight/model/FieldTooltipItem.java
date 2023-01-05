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
 * The tooltip item for the fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FieldTooltipItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldTooltipItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the field that is targeted by the tooltip.
     * </p>
     */
    private String fieldId;
    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     */
    private String visibility;

    /**
     * <p>
     * The unique ID of the field that is targeted by the tooltip.
     * </p>
     * 
     * @param fieldId
     *        The unique ID of the field that is targeted by the tooltip.
     */

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * <p>
     * The unique ID of the field that is targeted by the tooltip.
     * </p>
     * 
     * @return The unique ID of the field that is targeted by the tooltip.
     */

    public String getFieldId() {
        return this.fieldId;
    }

    /**
     * <p>
     * The unique ID of the field that is targeted by the tooltip.
     * </p>
     * 
     * @param fieldId
     *        The unique ID of the field that is targeted by the tooltip.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldTooltipItem withFieldId(String fieldId) {
        setFieldId(fieldId);
        return this;
    }

    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     * 
     * @param label
     *        The label of the tooltip item.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     * 
     * @return The label of the tooltip item.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The label of the tooltip item.
     * </p>
     * 
     * @param label
     *        The label of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldTooltipItem withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @param visibility
     *        The visibility of the tooltip item.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @return The visibility of the tooltip item.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @param visibility
     *        The visibility of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FieldTooltipItem withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the tooltip item.
     * </p>
     * 
     * @param visibility
     *        The visibility of the tooltip item.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public FieldTooltipItem withVisibility(Visibility visibility) {
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
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

        if (obj instanceof FieldTooltipItem == false)
            return false;
        FieldTooltipItem other = (FieldTooltipItem) obj;
        if (other.getFieldId() == null ^ this.getFieldId() == null)
            return false;
        if (other.getFieldId() != null && other.getFieldId().equals(this.getFieldId()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
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
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        return hashCode;
    }

    @Override
    public FieldTooltipItem clone() {
        try {
            return (FieldTooltipItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FieldTooltipItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
