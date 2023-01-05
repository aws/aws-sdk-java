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
 * The display options for the visual tooltip.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TooltipOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TooltipOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether or not the tooltip is visible.
     * </p>
     */
    private String tooltipVisibility;
    /**
     * <p>
     * The selected type for the tooltip. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code>: A basic tooltip.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETAILED</code>: A detailed tooltip.
     * </p>
     * </li>
     * </ul>
     */
    private String selectedTooltipType;
    /**
     * <p>
     * The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based on the
     * tooltip type.
     * </p>
     */
    private FieldBasedTooltip fieldBasedTooltip;

    /**
     * <p>
     * Determines whether or not the tooltip is visible.
     * </p>
     * 
     * @param tooltipVisibility
     *        Determines whether or not the tooltip is visible.
     * @see Visibility
     */

    public void setTooltipVisibility(String tooltipVisibility) {
        this.tooltipVisibility = tooltipVisibility;
    }

    /**
     * <p>
     * Determines whether or not the tooltip is visible.
     * </p>
     * 
     * @return Determines whether or not the tooltip is visible.
     * @see Visibility
     */

    public String getTooltipVisibility() {
        return this.tooltipVisibility;
    }

    /**
     * <p>
     * Determines whether or not the tooltip is visible.
     * </p>
     * 
     * @param tooltipVisibility
     *        Determines whether or not the tooltip is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TooltipOptions withTooltipVisibility(String tooltipVisibility) {
        setTooltipVisibility(tooltipVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not the tooltip is visible.
     * </p>
     * 
     * @param tooltipVisibility
     *        Determines whether or not the tooltip is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TooltipOptions withTooltipVisibility(Visibility tooltipVisibility) {
        this.tooltipVisibility = tooltipVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The selected type for the tooltip. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code>: A basic tooltip.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETAILED</code>: A detailed tooltip.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectedTooltipType
     *        The selected type for the tooltip. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC</code>: A basic tooltip.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DETAILED</code>: A detailed tooltip.
     *        </p>
     *        </li>
     * @see SelectedTooltipType
     */

    public void setSelectedTooltipType(String selectedTooltipType) {
        this.selectedTooltipType = selectedTooltipType;
    }

    /**
     * <p>
     * The selected type for the tooltip. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code>: A basic tooltip.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETAILED</code>: A detailed tooltip.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The selected type for the tooltip. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BASIC</code>: A basic tooltip.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DETAILED</code>: A detailed tooltip.
     *         </p>
     *         </li>
     * @see SelectedTooltipType
     */

    public String getSelectedTooltipType() {
        return this.selectedTooltipType;
    }

    /**
     * <p>
     * The selected type for the tooltip. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code>: A basic tooltip.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETAILED</code>: A detailed tooltip.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectedTooltipType
     *        The selected type for the tooltip. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC</code>: A basic tooltip.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DETAILED</code>: A detailed tooltip.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectedTooltipType
     */

    public TooltipOptions withSelectedTooltipType(String selectedTooltipType) {
        setSelectedTooltipType(selectedTooltipType);
        return this;
    }

    /**
     * <p>
     * The selected type for the tooltip. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BASIC</code>: A basic tooltip.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETAILED</code>: A detailed tooltip.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectedTooltipType
     *        The selected type for the tooltip. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BASIC</code>: A basic tooltip.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DETAILED</code>: A detailed tooltip.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SelectedTooltipType
     */

    public TooltipOptions withSelectedTooltipType(SelectedTooltipType selectedTooltipType) {
        this.selectedTooltipType = selectedTooltipType.toString();
        return this;
    }

    /**
     * <p>
     * The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based on the
     * tooltip type.
     * </p>
     * 
     * @param fieldBasedTooltip
     *        The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based
     *        on the tooltip type.
     */

    public void setFieldBasedTooltip(FieldBasedTooltip fieldBasedTooltip) {
        this.fieldBasedTooltip = fieldBasedTooltip;
    }

    /**
     * <p>
     * The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based on the
     * tooltip type.
     * </p>
     * 
     * @return The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based
     *         on the tooltip type.
     */

    public FieldBasedTooltip getFieldBasedTooltip() {
        return this.fieldBasedTooltip;
    }

    /**
     * <p>
     * The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based on the
     * tooltip type.
     * </p>
     * 
     * @param fieldBasedTooltip
     *        The setup for the detailed tooltip. The tooltip setup is always saved. The display type is decided based
     *        on the tooltip type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TooltipOptions withFieldBasedTooltip(FieldBasedTooltip fieldBasedTooltip) {
        setFieldBasedTooltip(fieldBasedTooltip);
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
        if (getTooltipVisibility() != null)
            sb.append("TooltipVisibility: ").append(getTooltipVisibility()).append(",");
        if (getSelectedTooltipType() != null)
            sb.append("SelectedTooltipType: ").append(getSelectedTooltipType()).append(",");
        if (getFieldBasedTooltip() != null)
            sb.append("FieldBasedTooltip: ").append(getFieldBasedTooltip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TooltipOptions == false)
            return false;
        TooltipOptions other = (TooltipOptions) obj;
        if (other.getTooltipVisibility() == null ^ this.getTooltipVisibility() == null)
            return false;
        if (other.getTooltipVisibility() != null && other.getTooltipVisibility().equals(this.getTooltipVisibility()) == false)
            return false;
        if (other.getSelectedTooltipType() == null ^ this.getSelectedTooltipType() == null)
            return false;
        if (other.getSelectedTooltipType() != null && other.getSelectedTooltipType().equals(this.getSelectedTooltipType()) == false)
            return false;
        if (other.getFieldBasedTooltip() == null ^ this.getFieldBasedTooltip() == null)
            return false;
        if (other.getFieldBasedTooltip() != null && other.getFieldBasedTooltip().equals(this.getFieldBasedTooltip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTooltipVisibility() == null) ? 0 : getTooltipVisibility().hashCode());
        hashCode = prime * hashCode + ((getSelectedTooltipType() == null) ? 0 : getSelectedTooltipType().hashCode());
        hashCode = prime * hashCode + ((getFieldBasedTooltip() == null) ? 0 : getFieldBasedTooltip().hashCode());
        return hashCode;
    }

    @Override
    public TooltipOptions clone() {
        try {
            return (TooltipOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TooltipOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
