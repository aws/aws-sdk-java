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
 * The configuration for applying a filter to specific sheets or visuals. You can apply this filter to multiple visuals
 * that are on one sheet or to all visuals on a sheet.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SelectedSheetsFilterScopeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectedSheetsFilterScopeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * </p>
     */
    private java.util.List<SheetVisualScopingConfiguration> sheetVisualScopingConfigurations;

    /**
     * <p>
     * The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * </p>
     * 
     * @return The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     */

    public java.util.List<SheetVisualScopingConfiguration> getSheetVisualScopingConfigurations() {
        return sheetVisualScopingConfigurations;
    }

    /**
     * <p>
     * The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * </p>
     * 
     * @param sheetVisualScopingConfigurations
     *        The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     */

    public void setSheetVisualScopingConfigurations(java.util.Collection<SheetVisualScopingConfiguration> sheetVisualScopingConfigurations) {
        if (sheetVisualScopingConfigurations == null) {
            this.sheetVisualScopingConfigurations = null;
            return;
        }

        this.sheetVisualScopingConfigurations = new java.util.ArrayList<SheetVisualScopingConfiguration>(sheetVisualScopingConfigurations);
    }

    /**
     * <p>
     * The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheetVisualScopingConfigurations(java.util.Collection)} or
     * {@link #withSheetVisualScopingConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sheetVisualScopingConfigurations
     *        The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedSheetsFilterScopeConfiguration withSheetVisualScopingConfigurations(SheetVisualScopingConfiguration... sheetVisualScopingConfigurations) {
        if (this.sheetVisualScopingConfigurations == null) {
            setSheetVisualScopingConfigurations(new java.util.ArrayList<SheetVisualScopingConfiguration>(sheetVisualScopingConfigurations.length));
        }
        for (SheetVisualScopingConfiguration ele : sheetVisualScopingConfigurations) {
            this.sheetVisualScopingConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * </p>
     * 
     * @param sheetVisualScopingConfigurations
     *        The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedSheetsFilterScopeConfiguration withSheetVisualScopingConfigurations(
            java.util.Collection<SheetVisualScopingConfiguration> sheetVisualScopingConfigurations) {
        setSheetVisualScopingConfigurations(sheetVisualScopingConfigurations);
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
        if (getSheetVisualScopingConfigurations() != null)
            sb.append("SheetVisualScopingConfigurations: ").append(getSheetVisualScopingConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectedSheetsFilterScopeConfiguration == false)
            return false;
        SelectedSheetsFilterScopeConfiguration other = (SelectedSheetsFilterScopeConfiguration) obj;
        if (other.getSheetVisualScopingConfigurations() == null ^ this.getSheetVisualScopingConfigurations() == null)
            return false;
        if (other.getSheetVisualScopingConfigurations() != null
                && other.getSheetVisualScopingConfigurations().equals(this.getSheetVisualScopingConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetVisualScopingConfigurations() == null) ? 0 : getSheetVisualScopingConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public SelectedSheetsFilterScopeConfiguration clone() {
        try {
            return (SelectedSheetsFilterScopeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SelectedSheetsFilterScopeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
