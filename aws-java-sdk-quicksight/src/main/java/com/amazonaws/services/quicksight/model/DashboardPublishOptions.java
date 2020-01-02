/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
            sb.append("SheetControlsOption: ").append(getSheetControlsOption());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdHocFilteringOption() == null) ? 0 : getAdHocFilteringOption().hashCode());
        hashCode = prime * hashCode + ((getExportToCSVOption() == null) ? 0 : getExportToCSVOption().hashCode());
        hashCode = prime * hashCode + ((getSheetControlsOption() == null) ? 0 : getSheetControlsOption().hashCode());
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
