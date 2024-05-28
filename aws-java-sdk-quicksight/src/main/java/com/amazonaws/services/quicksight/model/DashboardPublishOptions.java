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
 * Dashboard publish options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardPublishOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardPublishOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     */
    private AdHocFilteringOption adHocFilteringOption;
    /**
     * <p>
     * Export to .csv option.
     * </p>
     */
    private ExportToCSVOption exportToCSVOption;
    /**
     * <p>
     * Sheet controls option.
     * </p>
     */
    private SheetControlsOption sheetControlsOption;
    /**
     * <p>
     * The visual publish options of a visual in a dashboard.
     * </p>
     */
    @Deprecated
    private DashboardVisualPublishOptions visualPublishOptions;
    /**
     * <p>
     * The sheet layout maximization options of a dashbaord.
     * </p>
     */
    private SheetLayoutElementMaximizationOption sheetLayoutElementMaximizationOption;
    /**
     * <p>
     * The menu options of a visual in a dashboard.
     * </p>
     */
    private VisualMenuOption visualMenuOption;
    /**
     * <p>
     * The axis sort options of a dashboard.
     * </p>
     */
    private VisualAxisSortOption visualAxisSortOption;
    /**
     * <p>
     * Determines if hidden fields are exported with a dashboard.
     * </p>
     */
    private ExportWithHiddenFieldsOption exportWithHiddenFieldsOption;
    /**
     * <p>
     * The drill-down options of data points in a dashboard.
     * </p>
     */
    private DataPointDrillUpDownOption dataPointDrillUpDownOption;
    /**
     * <p>
     * The data point menu label options of a dashboard.
     * </p>
     */
    private DataPointMenuLabelOption dataPointMenuLabelOption;
    /**
     * <p>
     * The data point tool tip options of a dashboard.
     * </p>
     */
    private DataPointTooltipOption dataPointTooltipOption;

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     * 
     * @param adHocFilteringOption
     *        Ad hoc (one-time) filtering option.
     */

    public void setAdHocFilteringOption(AdHocFilteringOption adHocFilteringOption) {
        this.adHocFilteringOption = adHocFilteringOption;
    }

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     * 
     * @return Ad hoc (one-time) filtering option.
     */

    public AdHocFilteringOption getAdHocFilteringOption() {
        return this.adHocFilteringOption;
    }

    /**
     * <p>
     * Ad hoc (one-time) filtering option.
     * </p>
     * 
     * @param adHocFilteringOption
     *        Ad hoc (one-time) filtering option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withAdHocFilteringOption(AdHocFilteringOption adHocFilteringOption) {
        setAdHocFilteringOption(adHocFilteringOption);
        return this;
    }

    /**
     * <p>
     * Export to .csv option.
     * </p>
     * 
     * @param exportToCSVOption
     *        Export to .csv option.
     */

    public void setExportToCSVOption(ExportToCSVOption exportToCSVOption) {
        this.exportToCSVOption = exportToCSVOption;
    }

    /**
     * <p>
     * Export to .csv option.
     * </p>
     * 
     * @return Export to .csv option.
     */

    public ExportToCSVOption getExportToCSVOption() {
        return this.exportToCSVOption;
    }

    /**
     * <p>
     * Export to .csv option.
     * </p>
     * 
     * @param exportToCSVOption
     *        Export to .csv option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withExportToCSVOption(ExportToCSVOption exportToCSVOption) {
        setExportToCSVOption(exportToCSVOption);
        return this;
    }

    /**
     * <p>
     * Sheet controls option.
     * </p>
     * 
     * @param sheetControlsOption
     *        Sheet controls option.
     */

    public void setSheetControlsOption(SheetControlsOption sheetControlsOption) {
        this.sheetControlsOption = sheetControlsOption;
    }

    /**
     * <p>
     * Sheet controls option.
     * </p>
     * 
     * @return Sheet controls option.
     */

    public SheetControlsOption getSheetControlsOption() {
        return this.sheetControlsOption;
    }

    /**
     * <p>
     * Sheet controls option.
     * </p>
     * 
     * @param sheetControlsOption
     *        Sheet controls option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withSheetControlsOption(SheetControlsOption sheetControlsOption) {
        setSheetControlsOption(sheetControlsOption);
        return this;
    }

    /**
     * <p>
     * The visual publish options of a visual in a dashboard.
     * </p>
     * 
     * @param visualPublishOptions
     *        The visual publish options of a visual in a dashboard.
     */
    @Deprecated
    public void setVisualPublishOptions(DashboardVisualPublishOptions visualPublishOptions) {
        this.visualPublishOptions = visualPublishOptions;
    }

    /**
     * <p>
     * The visual publish options of a visual in a dashboard.
     * </p>
     * 
     * @return The visual publish options of a visual in a dashboard.
     */
    @Deprecated
    public DashboardVisualPublishOptions getVisualPublishOptions() {
        return this.visualPublishOptions;
    }

    /**
     * <p>
     * The visual publish options of a visual in a dashboard.
     * </p>
     * 
     * @param visualPublishOptions
     *        The visual publish options of a visual in a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DashboardPublishOptions withVisualPublishOptions(DashboardVisualPublishOptions visualPublishOptions) {
        setVisualPublishOptions(visualPublishOptions);
        return this;
    }

    /**
     * <p>
     * The sheet layout maximization options of a dashbaord.
     * </p>
     * 
     * @param sheetLayoutElementMaximizationOption
     *        The sheet layout maximization options of a dashbaord.
     */

    public void setSheetLayoutElementMaximizationOption(SheetLayoutElementMaximizationOption sheetLayoutElementMaximizationOption) {
        this.sheetLayoutElementMaximizationOption = sheetLayoutElementMaximizationOption;
    }

    /**
     * <p>
     * The sheet layout maximization options of a dashbaord.
     * </p>
     * 
     * @return The sheet layout maximization options of a dashbaord.
     */

    public SheetLayoutElementMaximizationOption getSheetLayoutElementMaximizationOption() {
        return this.sheetLayoutElementMaximizationOption;
    }

    /**
     * <p>
     * The sheet layout maximization options of a dashbaord.
     * </p>
     * 
     * @param sheetLayoutElementMaximizationOption
     *        The sheet layout maximization options of a dashbaord.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withSheetLayoutElementMaximizationOption(SheetLayoutElementMaximizationOption sheetLayoutElementMaximizationOption) {
        setSheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption);
        return this;
    }

    /**
     * <p>
     * The menu options of a visual in a dashboard.
     * </p>
     * 
     * @param visualMenuOption
     *        The menu options of a visual in a dashboard.
     */

    public void setVisualMenuOption(VisualMenuOption visualMenuOption) {
        this.visualMenuOption = visualMenuOption;
    }

    /**
     * <p>
     * The menu options of a visual in a dashboard.
     * </p>
     * 
     * @return The menu options of a visual in a dashboard.
     */

    public VisualMenuOption getVisualMenuOption() {
        return this.visualMenuOption;
    }

    /**
     * <p>
     * The menu options of a visual in a dashboard.
     * </p>
     * 
     * @param visualMenuOption
     *        The menu options of a visual in a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withVisualMenuOption(VisualMenuOption visualMenuOption) {
        setVisualMenuOption(visualMenuOption);
        return this;
    }

    /**
     * <p>
     * The axis sort options of a dashboard.
     * </p>
     * 
     * @param visualAxisSortOption
     *        The axis sort options of a dashboard.
     */

    public void setVisualAxisSortOption(VisualAxisSortOption visualAxisSortOption) {
        this.visualAxisSortOption = visualAxisSortOption;
    }

    /**
     * <p>
     * The axis sort options of a dashboard.
     * </p>
     * 
     * @return The axis sort options of a dashboard.
     */

    public VisualAxisSortOption getVisualAxisSortOption() {
        return this.visualAxisSortOption;
    }

    /**
     * <p>
     * The axis sort options of a dashboard.
     * </p>
     * 
     * @param visualAxisSortOption
     *        The axis sort options of a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withVisualAxisSortOption(VisualAxisSortOption visualAxisSortOption) {
        setVisualAxisSortOption(visualAxisSortOption);
        return this;
    }

    /**
     * <p>
     * Determines if hidden fields are exported with a dashboard.
     * </p>
     * 
     * @param exportWithHiddenFieldsOption
     *        Determines if hidden fields are exported with a dashboard.
     */

    public void setExportWithHiddenFieldsOption(ExportWithHiddenFieldsOption exportWithHiddenFieldsOption) {
        this.exportWithHiddenFieldsOption = exportWithHiddenFieldsOption;
    }

    /**
     * <p>
     * Determines if hidden fields are exported with a dashboard.
     * </p>
     * 
     * @return Determines if hidden fields are exported with a dashboard.
     */

    public ExportWithHiddenFieldsOption getExportWithHiddenFieldsOption() {
        return this.exportWithHiddenFieldsOption;
    }

    /**
     * <p>
     * Determines if hidden fields are exported with a dashboard.
     * </p>
     * 
     * @param exportWithHiddenFieldsOption
     *        Determines if hidden fields are exported with a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withExportWithHiddenFieldsOption(ExportWithHiddenFieldsOption exportWithHiddenFieldsOption) {
        setExportWithHiddenFieldsOption(exportWithHiddenFieldsOption);
        return this;
    }

    /**
     * <p>
     * The drill-down options of data points in a dashboard.
     * </p>
     * 
     * @param dataPointDrillUpDownOption
     *        The drill-down options of data points in a dashboard.
     */

    public void setDataPointDrillUpDownOption(DataPointDrillUpDownOption dataPointDrillUpDownOption) {
        this.dataPointDrillUpDownOption = dataPointDrillUpDownOption;
    }

    /**
     * <p>
     * The drill-down options of data points in a dashboard.
     * </p>
     * 
     * @return The drill-down options of data points in a dashboard.
     */

    public DataPointDrillUpDownOption getDataPointDrillUpDownOption() {
        return this.dataPointDrillUpDownOption;
    }

    /**
     * <p>
     * The drill-down options of data points in a dashboard.
     * </p>
     * 
     * @param dataPointDrillUpDownOption
     *        The drill-down options of data points in a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withDataPointDrillUpDownOption(DataPointDrillUpDownOption dataPointDrillUpDownOption) {
        setDataPointDrillUpDownOption(dataPointDrillUpDownOption);
        return this;
    }

    /**
     * <p>
     * The data point menu label options of a dashboard.
     * </p>
     * 
     * @param dataPointMenuLabelOption
     *        The data point menu label options of a dashboard.
     */

    public void setDataPointMenuLabelOption(DataPointMenuLabelOption dataPointMenuLabelOption) {
        this.dataPointMenuLabelOption = dataPointMenuLabelOption;
    }

    /**
     * <p>
     * The data point menu label options of a dashboard.
     * </p>
     * 
     * @return The data point menu label options of a dashboard.
     */

    public DataPointMenuLabelOption getDataPointMenuLabelOption() {
        return this.dataPointMenuLabelOption;
    }

    /**
     * <p>
     * The data point menu label options of a dashboard.
     * </p>
     * 
     * @param dataPointMenuLabelOption
     *        The data point menu label options of a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withDataPointMenuLabelOption(DataPointMenuLabelOption dataPointMenuLabelOption) {
        setDataPointMenuLabelOption(dataPointMenuLabelOption);
        return this;
    }

    /**
     * <p>
     * The data point tool tip options of a dashboard.
     * </p>
     * 
     * @param dataPointTooltipOption
     *        The data point tool tip options of a dashboard.
     */

    public void setDataPointTooltipOption(DataPointTooltipOption dataPointTooltipOption) {
        this.dataPointTooltipOption = dataPointTooltipOption;
    }

    /**
     * <p>
     * The data point tool tip options of a dashboard.
     * </p>
     * 
     * @return The data point tool tip options of a dashboard.
     */

    public DataPointTooltipOption getDataPointTooltipOption() {
        return this.dataPointTooltipOption;
    }

    /**
     * <p>
     * The data point tool tip options of a dashboard.
     * </p>
     * 
     * @param dataPointTooltipOption
     *        The data point tool tip options of a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardPublishOptions withDataPointTooltipOption(DataPointTooltipOption dataPointTooltipOption) {
        setDataPointTooltipOption(dataPointTooltipOption);
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
        if (getAdHocFilteringOption() != null)
            sb.append("AdHocFilteringOption: ").append(getAdHocFilteringOption()).append(",");
        if (getExportToCSVOption() != null)
            sb.append("ExportToCSVOption: ").append(getExportToCSVOption()).append(",");
        if (getSheetControlsOption() != null)
            sb.append("SheetControlsOption: ").append(getSheetControlsOption()).append(",");
        if (getVisualPublishOptions() != null)
            sb.append("VisualPublishOptions: ").append(getVisualPublishOptions()).append(",");
        if (getSheetLayoutElementMaximizationOption() != null)
            sb.append("SheetLayoutElementMaximizationOption: ").append(getSheetLayoutElementMaximizationOption()).append(",");
        if (getVisualMenuOption() != null)
            sb.append("VisualMenuOption: ").append(getVisualMenuOption()).append(",");
        if (getVisualAxisSortOption() != null)
            sb.append("VisualAxisSortOption: ").append(getVisualAxisSortOption()).append(",");
        if (getExportWithHiddenFieldsOption() != null)
            sb.append("ExportWithHiddenFieldsOption: ").append(getExportWithHiddenFieldsOption()).append(",");
        if (getDataPointDrillUpDownOption() != null)
            sb.append("DataPointDrillUpDownOption: ").append(getDataPointDrillUpDownOption()).append(",");
        if (getDataPointMenuLabelOption() != null)
            sb.append("DataPointMenuLabelOption: ").append(getDataPointMenuLabelOption()).append(",");
        if (getDataPointTooltipOption() != null)
            sb.append("DataPointTooltipOption: ").append(getDataPointTooltipOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardPublishOptions == false)
            return false;
        DashboardPublishOptions other = (DashboardPublishOptions) obj;
        if (other.getAdHocFilteringOption() == null ^ this.getAdHocFilteringOption() == null)
            return false;
        if (other.getAdHocFilteringOption() != null && other.getAdHocFilteringOption().equals(this.getAdHocFilteringOption()) == false)
            return false;
        if (other.getExportToCSVOption() == null ^ this.getExportToCSVOption() == null)
            return false;
        if (other.getExportToCSVOption() != null && other.getExportToCSVOption().equals(this.getExportToCSVOption()) == false)
            return false;
        if (other.getSheetControlsOption() == null ^ this.getSheetControlsOption() == null)
            return false;
        if (other.getSheetControlsOption() != null && other.getSheetControlsOption().equals(this.getSheetControlsOption()) == false)
            return false;
        if (other.getVisualPublishOptions() == null ^ this.getVisualPublishOptions() == null)
            return false;
        if (other.getVisualPublishOptions() != null && other.getVisualPublishOptions().equals(this.getVisualPublishOptions()) == false)
            return false;
        if (other.getSheetLayoutElementMaximizationOption() == null ^ this.getSheetLayoutElementMaximizationOption() == null)
            return false;
        if (other.getSheetLayoutElementMaximizationOption() != null
                && other.getSheetLayoutElementMaximizationOption().equals(this.getSheetLayoutElementMaximizationOption()) == false)
            return false;
        if (other.getVisualMenuOption() == null ^ this.getVisualMenuOption() == null)
            return false;
        if (other.getVisualMenuOption() != null && other.getVisualMenuOption().equals(this.getVisualMenuOption()) == false)
            return false;
        if (other.getVisualAxisSortOption() == null ^ this.getVisualAxisSortOption() == null)
            return false;
        if (other.getVisualAxisSortOption() != null && other.getVisualAxisSortOption().equals(this.getVisualAxisSortOption()) == false)
            return false;
        if (other.getExportWithHiddenFieldsOption() == null ^ this.getExportWithHiddenFieldsOption() == null)
            return false;
        if (other.getExportWithHiddenFieldsOption() != null && other.getExportWithHiddenFieldsOption().equals(this.getExportWithHiddenFieldsOption()) == false)
            return false;
        if (other.getDataPointDrillUpDownOption() == null ^ this.getDataPointDrillUpDownOption() == null)
            return false;
        if (other.getDataPointDrillUpDownOption() != null && other.getDataPointDrillUpDownOption().equals(this.getDataPointDrillUpDownOption()) == false)
            return false;
        if (other.getDataPointMenuLabelOption() == null ^ this.getDataPointMenuLabelOption() == null)
            return false;
        if (other.getDataPointMenuLabelOption() != null && other.getDataPointMenuLabelOption().equals(this.getDataPointMenuLabelOption()) == false)
            return false;
        if (other.getDataPointTooltipOption() == null ^ this.getDataPointTooltipOption() == null)
            return false;
        if (other.getDataPointTooltipOption() != null && other.getDataPointTooltipOption().equals(this.getDataPointTooltipOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdHocFilteringOption() == null) ? 0 : getAdHocFilteringOption().hashCode());
        hashCode = prime * hashCode + ((getExportToCSVOption() == null) ? 0 : getExportToCSVOption().hashCode());
        hashCode = prime * hashCode + ((getSheetControlsOption() == null) ? 0 : getSheetControlsOption().hashCode());
        hashCode = prime * hashCode + ((getVisualPublishOptions() == null) ? 0 : getVisualPublishOptions().hashCode());
        hashCode = prime * hashCode + ((getSheetLayoutElementMaximizationOption() == null) ? 0 : getSheetLayoutElementMaximizationOption().hashCode());
        hashCode = prime * hashCode + ((getVisualMenuOption() == null) ? 0 : getVisualMenuOption().hashCode());
        hashCode = prime * hashCode + ((getVisualAxisSortOption() == null) ? 0 : getVisualAxisSortOption().hashCode());
        hashCode = prime * hashCode + ((getExportWithHiddenFieldsOption() == null) ? 0 : getExportWithHiddenFieldsOption().hashCode());
        hashCode = prime * hashCode + ((getDataPointDrillUpDownOption() == null) ? 0 : getDataPointDrillUpDownOption().hashCode());
        hashCode = prime * hashCode + ((getDataPointMenuLabelOption() == null) ? 0 : getDataPointMenuLabelOption().hashCode());
        hashCode = prime * hashCode + ((getDataPointTooltipOption() == null) ? 0 : getDataPointTooltipOption().hashCode());
        return hashCode;
    }

    @Override
    public DashboardPublishOptions clone() {
        try {
            return (DashboardPublishOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardPublishOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
