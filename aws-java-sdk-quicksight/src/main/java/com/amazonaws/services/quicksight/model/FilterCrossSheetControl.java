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
 * A control from a filter that is scoped across more than one sheet. This represents your filter control on a sheet
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterCrossSheetControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCrossSheetControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     */
    private String filterControlId;
    /**
     * <p>
     * The source filter ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     */
    private String sourceFilterId;
    /**
     * <p>
     * The values that are displayed in a control can be configured to only show values that are valid based on what's
     * selected in other controls.
     * </p>
     */
    private CascadingControlConfiguration cascadingControlConfiguration;

    /**
     * <p>
     * The ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     * 
     * @param filterControlId
     *        The ID of the <code>FilterCrossSheetControl</code>.
     */

    public void setFilterControlId(String filterControlId) {
        this.filterControlId = filterControlId;
    }

    /**
     * <p>
     * The ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     * 
     * @return The ID of the <code>FilterCrossSheetControl</code>.
     */

    public String getFilterControlId() {
        return this.filterControlId;
    }

    /**
     * <p>
     * The ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     * 
     * @param filterControlId
     *        The ID of the <code>FilterCrossSheetControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCrossSheetControl withFilterControlId(String filterControlId) {
        setFilterControlId(filterControlId);
        return this;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     * 
     * @param sourceFilterId
     *        The source filter ID of the <code>FilterCrossSheetControl</code>.
     */

    public void setSourceFilterId(String sourceFilterId) {
        this.sourceFilterId = sourceFilterId;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     * 
     * @return The source filter ID of the <code>FilterCrossSheetControl</code>.
     */

    public String getSourceFilterId() {
        return this.sourceFilterId;
    }

    /**
     * <p>
     * The source filter ID of the <code>FilterCrossSheetControl</code>.
     * </p>
     * 
     * @param sourceFilterId
     *        The source filter ID of the <code>FilterCrossSheetControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCrossSheetControl withSourceFilterId(String sourceFilterId) {
        setSourceFilterId(sourceFilterId);
        return this;
    }

    /**
     * <p>
     * The values that are displayed in a control can be configured to only show values that are valid based on what's
     * selected in other controls.
     * </p>
     * 
     * @param cascadingControlConfiguration
     *        The values that are displayed in a control can be configured to only show values that are valid based on
     *        what's selected in other controls.
     */

    public void setCascadingControlConfiguration(CascadingControlConfiguration cascadingControlConfiguration) {
        this.cascadingControlConfiguration = cascadingControlConfiguration;
    }

    /**
     * <p>
     * The values that are displayed in a control can be configured to only show values that are valid based on what's
     * selected in other controls.
     * </p>
     * 
     * @return The values that are displayed in a control can be configured to only show values that are valid based on
     *         what's selected in other controls.
     */

    public CascadingControlConfiguration getCascadingControlConfiguration() {
        return this.cascadingControlConfiguration;
    }

    /**
     * <p>
     * The values that are displayed in a control can be configured to only show values that are valid based on what's
     * selected in other controls.
     * </p>
     * 
     * @param cascadingControlConfiguration
     *        The values that are displayed in a control can be configured to only show values that are valid based on
     *        what's selected in other controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCrossSheetControl withCascadingControlConfiguration(CascadingControlConfiguration cascadingControlConfiguration) {
        setCascadingControlConfiguration(cascadingControlConfiguration);
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
        if (getFilterControlId() != null)
            sb.append("FilterControlId: ").append(getFilterControlId()).append(",");
        if (getSourceFilterId() != null)
            sb.append("SourceFilterId: ").append(getSourceFilterId()).append(",");
        if (getCascadingControlConfiguration() != null)
            sb.append("CascadingControlConfiguration: ").append(getCascadingControlConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterCrossSheetControl == false)
            return false;
        FilterCrossSheetControl other = (FilterCrossSheetControl) obj;
        if (other.getFilterControlId() == null ^ this.getFilterControlId() == null)
            return false;
        if (other.getFilterControlId() != null && other.getFilterControlId().equals(this.getFilterControlId()) == false)
            return false;
        if (other.getSourceFilterId() == null ^ this.getSourceFilterId() == null)
            return false;
        if (other.getSourceFilterId() != null && other.getSourceFilterId().equals(this.getSourceFilterId()) == false)
            return false;
        if (other.getCascadingControlConfiguration() == null ^ this.getCascadingControlConfiguration() == null)
            return false;
        if (other.getCascadingControlConfiguration() != null
                && other.getCascadingControlConfiguration().equals(this.getCascadingControlConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterControlId() == null) ? 0 : getFilterControlId().hashCode());
        hashCode = prime * hashCode + ((getSourceFilterId() == null) ? 0 : getSourceFilterId().hashCode());
        hashCode = prime * hashCode + ((getCascadingControlConfiguration() == null) ? 0 : getCascadingControlConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FilterCrossSheetControl clone() {
        try {
            return (FilterCrossSheetControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterCrossSheetControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
