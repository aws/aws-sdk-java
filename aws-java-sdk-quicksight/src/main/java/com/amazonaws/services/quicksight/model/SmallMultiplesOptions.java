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
 * Options that determine the layout and display options of a chart's small multiples.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SmallMultiplesOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SmallMultiplesOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets the maximum number of visible rows to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the overall
     * layout and size of the given chart.
     * </p>
     */
    private Long maxVisibleRows;
    /**
     * <p>
     * Sets the maximum number of visible columns to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall layout
     * and size of the given chart.
     * </p>
     */
    private Long maxVisibleColumns;
    /**
     * <p>
     * Configures the display options for each small multiples panel.
     * </p>
     */
    private PanelConfiguration panelConfiguration;
    /**
     * <p>
     * The properties of a small multiples X axis.
     * </p>
     */
    private SmallMultiplesAxisProperties xAxis;
    /**
     * <p>
     * The properties of a small multiples Y axis.
     * </p>
     */
    private SmallMultiplesAxisProperties yAxis;

    /**
     * <p>
     * Sets the maximum number of visible rows to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the overall
     * layout and size of the given chart.
     * </p>
     * 
     * @param maxVisibleRows
     *        Sets the maximum number of visible rows to display in the grid of small multiples panels.</p>
     *        <p>
     *        The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the
     *        overall layout and size of the given chart.
     */

    public void setMaxVisibleRows(Long maxVisibleRows) {
        this.maxVisibleRows = maxVisibleRows;
    }

    /**
     * <p>
     * Sets the maximum number of visible rows to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the overall
     * layout and size of the given chart.
     * </p>
     * 
     * @return Sets the maximum number of visible rows to display in the grid of small multiples panels.</p>
     *         <p>
     *         The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the
     *         overall layout and size of the given chart.
     */

    public Long getMaxVisibleRows() {
        return this.maxVisibleRows;
    }

    /**
     * <p>
     * Sets the maximum number of visible rows to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the overall
     * layout and size of the given chart.
     * </p>
     * 
     * @param maxVisibleRows
     *        Sets the maximum number of visible rows to display in the grid of small multiples panels.</p>
     *        <p>
     *        The default value is <code>Auto</code>, which automatically adjusts the rows in the grid to fit the
     *        overall layout and size of the given chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmallMultiplesOptions withMaxVisibleRows(Long maxVisibleRows) {
        setMaxVisibleRows(maxVisibleRows);
        return this;
    }

    /**
     * <p>
     * Sets the maximum number of visible columns to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall layout
     * and size of the given chart.
     * </p>
     * 
     * @param maxVisibleColumns
     *        Sets the maximum number of visible columns to display in the grid of small multiples panels.</p>
     *        <p>
     *        The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall
     *        layout and size of the given chart.
     */

    public void setMaxVisibleColumns(Long maxVisibleColumns) {
        this.maxVisibleColumns = maxVisibleColumns;
    }

    /**
     * <p>
     * Sets the maximum number of visible columns to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall layout
     * and size of the given chart.
     * </p>
     * 
     * @return Sets the maximum number of visible columns to display in the grid of small multiples panels.</p>
     *         <p>
     *         The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall
     *         layout and size of the given chart.
     */

    public Long getMaxVisibleColumns() {
        return this.maxVisibleColumns;
    }

    /**
     * <p>
     * Sets the maximum number of visible columns to display in the grid of small multiples panels.
     * </p>
     * <p>
     * The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall layout
     * and size of the given chart.
     * </p>
     * 
     * @param maxVisibleColumns
     *        Sets the maximum number of visible columns to display in the grid of small multiples panels.</p>
     *        <p>
     *        The default is <code>Auto</code>, which automatically adjusts the columns in the grid to fit the overall
     *        layout and size of the given chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmallMultiplesOptions withMaxVisibleColumns(Long maxVisibleColumns) {
        setMaxVisibleColumns(maxVisibleColumns);
        return this;
    }

    /**
     * <p>
     * Configures the display options for each small multiples panel.
     * </p>
     * 
     * @param panelConfiguration
     *        Configures the display options for each small multiples panel.
     */

    public void setPanelConfiguration(PanelConfiguration panelConfiguration) {
        this.panelConfiguration = panelConfiguration;
    }

    /**
     * <p>
     * Configures the display options for each small multiples panel.
     * </p>
     * 
     * @return Configures the display options for each small multiples panel.
     */

    public PanelConfiguration getPanelConfiguration() {
        return this.panelConfiguration;
    }

    /**
     * <p>
     * Configures the display options for each small multiples panel.
     * </p>
     * 
     * @param panelConfiguration
     *        Configures the display options for each small multiples panel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmallMultiplesOptions withPanelConfiguration(PanelConfiguration panelConfiguration) {
        setPanelConfiguration(panelConfiguration);
        return this;
    }

    /**
     * <p>
     * The properties of a small multiples X axis.
     * </p>
     * 
     * @param xAxis
     *        The properties of a small multiples X axis.
     */

    public void setXAxis(SmallMultiplesAxisProperties xAxis) {
        this.xAxis = xAxis;
    }

    /**
     * <p>
     * The properties of a small multiples X axis.
     * </p>
     * 
     * @return The properties of a small multiples X axis.
     */

    public SmallMultiplesAxisProperties getXAxis() {
        return this.xAxis;
    }

    /**
     * <p>
     * The properties of a small multiples X axis.
     * </p>
     * 
     * @param xAxis
     *        The properties of a small multiples X axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmallMultiplesOptions withXAxis(SmallMultiplesAxisProperties xAxis) {
        setXAxis(xAxis);
        return this;
    }

    /**
     * <p>
     * The properties of a small multiples Y axis.
     * </p>
     * 
     * @param yAxis
     *        The properties of a small multiples Y axis.
     */

    public void setYAxis(SmallMultiplesAxisProperties yAxis) {
        this.yAxis = yAxis;
    }

    /**
     * <p>
     * The properties of a small multiples Y axis.
     * </p>
     * 
     * @return The properties of a small multiples Y axis.
     */

    public SmallMultiplesAxisProperties getYAxis() {
        return this.yAxis;
    }

    /**
     * <p>
     * The properties of a small multiples Y axis.
     * </p>
     * 
     * @param yAxis
     *        The properties of a small multiples Y axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SmallMultiplesOptions withYAxis(SmallMultiplesAxisProperties yAxis) {
        setYAxis(yAxis);
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
        if (getMaxVisibleRows() != null)
            sb.append("MaxVisibleRows: ").append(getMaxVisibleRows()).append(",");
        if (getMaxVisibleColumns() != null)
            sb.append("MaxVisibleColumns: ").append(getMaxVisibleColumns()).append(",");
        if (getPanelConfiguration() != null)
            sb.append("PanelConfiguration: ").append(getPanelConfiguration()).append(",");
        if (getXAxis() != null)
            sb.append("XAxis: ").append(getXAxis()).append(",");
        if (getYAxis() != null)
            sb.append("YAxis: ").append(getYAxis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmallMultiplesOptions == false)
            return false;
        SmallMultiplesOptions other = (SmallMultiplesOptions) obj;
        if (other.getMaxVisibleRows() == null ^ this.getMaxVisibleRows() == null)
            return false;
        if (other.getMaxVisibleRows() != null && other.getMaxVisibleRows().equals(this.getMaxVisibleRows()) == false)
            return false;
        if (other.getMaxVisibleColumns() == null ^ this.getMaxVisibleColumns() == null)
            return false;
        if (other.getMaxVisibleColumns() != null && other.getMaxVisibleColumns().equals(this.getMaxVisibleColumns()) == false)
            return false;
        if (other.getPanelConfiguration() == null ^ this.getPanelConfiguration() == null)
            return false;
        if (other.getPanelConfiguration() != null && other.getPanelConfiguration().equals(this.getPanelConfiguration()) == false)
            return false;
        if (other.getXAxis() == null ^ this.getXAxis() == null)
            return false;
        if (other.getXAxis() != null && other.getXAxis().equals(this.getXAxis()) == false)
            return false;
        if (other.getYAxis() == null ^ this.getYAxis() == null)
            return false;
        if (other.getYAxis() != null && other.getYAxis().equals(this.getYAxis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxVisibleRows() == null) ? 0 : getMaxVisibleRows().hashCode());
        hashCode = prime * hashCode + ((getMaxVisibleColumns() == null) ? 0 : getMaxVisibleColumns().hashCode());
        hashCode = prime * hashCode + ((getPanelConfiguration() == null) ? 0 : getPanelConfiguration().hashCode());
        hashCode = prime * hashCode + ((getXAxis() == null) ? 0 : getXAxis().hashCode());
        hashCode = prime * hashCode + ((getYAxis() == null) ? 0 : getYAxis().hashCode());
        return hashCode;
    }

    @Override
    public SmallMultiplesOptions clone() {
        try {
            return (SmallMultiplesOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SmallMultiplesOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
