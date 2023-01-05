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
 * The total options for a table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TotalOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TotalOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     */
    private String totalsVisibility;
    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     */
    private String placement;
    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     */
    private String scrollStatus;
    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     */
    private String customLabel;
    /**
     * <p>
     * Cell styling options for the total cells.
     * </p>
     */
    private TableCellStyle totalCellStyle;

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the total cells.
     * @see Visibility
     */

    public void setTotalsVisibility(String totalsVisibility) {
        this.totalsVisibility = totalsVisibility;
    }

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @return The visibility configuration for the total cells.
     * @see Visibility
     */

    public String getTotalsVisibility() {
        return this.totalsVisibility;
    }

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TotalOptions withTotalsVisibility(String totalsVisibility) {
        setTotalsVisibility(totalsVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public TotalOptions withTotalsVisibility(Visibility totalsVisibility) {
        this.totalsVisibility = totalsVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @param placement
     *        The placement (start, end) for the total cells.
     * @see TableTotalsPlacement
     */

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @return The placement (start, end) for the total cells.
     * @see TableTotalsPlacement
     */

    public String getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @param placement
     *        The placement (start, end) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsPlacement
     */

    public TotalOptions withPlacement(String placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @param placement
     *        The placement (start, end) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsPlacement
     */

    public TotalOptions withPlacement(TableTotalsPlacement placement) {
        this.placement = placement.toString();
        return this;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @param scrollStatus
     *        The scroll status (pinned, scrolled) for the total cells.
     * @see TableTotalsScrollStatus
     */

    public void setScrollStatus(String scrollStatus) {
        this.scrollStatus = scrollStatus;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @return The scroll status (pinned, scrolled) for the total cells.
     * @see TableTotalsScrollStatus
     */

    public String getScrollStatus() {
        return this.scrollStatus;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @param scrollStatus
     *        The scroll status (pinned, scrolled) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsScrollStatus
     */

    public TotalOptions withScrollStatus(String scrollStatus) {
        setScrollStatus(scrollStatus);
        return this;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @param scrollStatus
     *        The scroll status (pinned, scrolled) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsScrollStatus
     */

    public TotalOptions withScrollStatus(TableTotalsScrollStatus scrollStatus) {
        this.scrollStatus = scrollStatus.toString();
        return this;
    }

    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the total cells.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     * 
     * @return The custom label string for the total cells.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalOptions withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
        return this;
    }

    /**
     * <p>
     * Cell styling options for the total cells.
     * </p>
     * 
     * @param totalCellStyle
     *        Cell styling options for the total cells.
     */

    public void setTotalCellStyle(TableCellStyle totalCellStyle) {
        this.totalCellStyle = totalCellStyle;
    }

    /**
     * <p>
     * Cell styling options for the total cells.
     * </p>
     * 
     * @return Cell styling options for the total cells.
     */

    public TableCellStyle getTotalCellStyle() {
        return this.totalCellStyle;
    }

    /**
     * <p>
     * Cell styling options for the total cells.
     * </p>
     * 
     * @param totalCellStyle
     *        Cell styling options for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TotalOptions withTotalCellStyle(TableCellStyle totalCellStyle) {
        setTotalCellStyle(totalCellStyle);
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
        if (getTotalsVisibility() != null)
            sb.append("TotalsVisibility: ").append(getTotalsVisibility()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getScrollStatus() != null)
            sb.append("ScrollStatus: ").append(getScrollStatus()).append(",");
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel()).append(",");
        if (getTotalCellStyle() != null)
            sb.append("TotalCellStyle: ").append(getTotalCellStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TotalOptions == false)
            return false;
        TotalOptions other = (TotalOptions) obj;
        if (other.getTotalsVisibility() == null ^ this.getTotalsVisibility() == null)
            return false;
        if (other.getTotalsVisibility() != null && other.getTotalsVisibility().equals(this.getTotalsVisibility()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getScrollStatus() == null ^ this.getScrollStatus() == null)
            return false;
        if (other.getScrollStatus() != null && other.getScrollStatus().equals(this.getScrollStatus()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        if (other.getTotalCellStyle() == null ^ this.getTotalCellStyle() == null)
            return false;
        if (other.getTotalCellStyle() != null && other.getTotalCellStyle().equals(this.getTotalCellStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalsVisibility() == null) ? 0 : getTotalsVisibility().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getScrollStatus() == null) ? 0 : getScrollStatus().hashCode());
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        hashCode = prime * hashCode + ((getTotalCellStyle() == null) ? 0 : getTotalCellStyle().hashCode());
        return hashCode;
    }

    @Override
    public TotalOptions clone() {
        try {
            return (TotalOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TotalOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
