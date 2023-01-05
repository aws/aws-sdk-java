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
 * A control to display a list with buttons or boxes that are used to select either a single value or multiple values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ParameterListControl" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterListControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>ParameterListControl</code>.
     * </p>
     */
    private String parameterControlId;
    /**
     * <p>
     * The title of the <code>ParameterListControl</code>.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The source parameter name of the <code>ParameterListControl</code>.
     * </p>
     */
    private String sourceParameterName;
    /**
     * <p>
     * The display options of a control.
     * </p>
     */
    private ListControlDisplayOptions displayOptions;
    /**
     * <p>
     * The type of <code>ParameterListControl</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     */
    private ParameterSelectableValues selectableValues;
    /**
     * <p>
     * The values that are displayed in a control can be configured to only show values that are valid based on what's
     * selected in other controls.
     * </p>
     */
    private CascadingControlConfiguration cascadingControlConfiguration;

    /**
     * <p>
     * The ID of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @param parameterControlId
     *        The ID of the <code>ParameterListControl</code>.
     */

    public void setParameterControlId(String parameterControlId) {
        this.parameterControlId = parameterControlId;
    }

    /**
     * <p>
     * The ID of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @return The ID of the <code>ParameterListControl</code>.
     */

    public String getParameterControlId() {
        return this.parameterControlId;
    }

    /**
     * <p>
     * The ID of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @param parameterControlId
     *        The ID of the <code>ParameterListControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterListControl withParameterControlId(String parameterControlId) {
        setParameterControlId(parameterControlId);
        return this;
    }

    /**
     * <p>
     * The title of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>ParameterListControl</code>.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @return The title of the <code>ParameterListControl</code>.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @param title
     *        The title of the <code>ParameterListControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterListControl withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the <code>ParameterListControl</code>.
     */

    public void setSourceParameterName(String sourceParameterName) {
        this.sourceParameterName = sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @return The source parameter name of the <code>ParameterListControl</code>.
     */

    public String getSourceParameterName() {
        return this.sourceParameterName;
    }

    /**
     * <p>
     * The source parameter name of the <code>ParameterListControl</code>.
     * </p>
     * 
     * @param sourceParameterName
     *        The source parameter name of the <code>ParameterListControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterListControl withSourceParameterName(String sourceParameterName) {
        setSourceParameterName(sourceParameterName);
        return this;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     */

    public void setDisplayOptions(ListControlDisplayOptions displayOptions) {
        this.displayOptions = displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @return The display options of a control.
     */

    public ListControlDisplayOptions getDisplayOptions() {
        return this.displayOptions;
    }

    /**
     * <p>
     * The display options of a control.
     * </p>
     * 
     * @param displayOptions
     *        The display options of a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterListControl withDisplayOptions(ListControlDisplayOptions displayOptions) {
        setDisplayOptions(displayOptions);
        return this;
    }

    /**
     * <p>
     * The type of <code>ParameterListControl</code>.
     * </p>
     * 
     * @param type
     *        The type of <code>ParameterListControl</code>.
     * @see SheetControlListType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of <code>ParameterListControl</code>.
     * </p>
     * 
     * @return The type of <code>ParameterListControl</code>.
     * @see SheetControlListType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of <code>ParameterListControl</code>.
     * </p>
     * 
     * @param type
     *        The type of <code>ParameterListControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlListType
     */

    public ParameterListControl withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of <code>ParameterListControl</code>.
     * </p>
     * 
     * @param type
     *        The type of <code>ParameterListControl</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SheetControlListType
     */

    public ParameterListControl withType(SheetControlListType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     * 
     * @param selectableValues
     *        A list of selectable values that are used in a control.
     */

    public void setSelectableValues(ParameterSelectableValues selectableValues) {
        this.selectableValues = selectableValues;
    }

    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     * 
     * @return A list of selectable values that are used in a control.
     */

    public ParameterSelectableValues getSelectableValues() {
        return this.selectableValues;
    }

    /**
     * <p>
     * A list of selectable values that are used in a control.
     * </p>
     * 
     * @param selectableValues
     *        A list of selectable values that are used in a control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterListControl withSelectableValues(ParameterSelectableValues selectableValues) {
        setSelectableValues(selectableValues);
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

    public ParameterListControl withCascadingControlConfiguration(CascadingControlConfiguration cascadingControlConfiguration) {
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
        if (getParameterControlId() != null)
            sb.append("ParameterControlId: ").append(getParameterControlId()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSourceParameterName() != null)
            sb.append("SourceParameterName: ").append(getSourceParameterName()).append(",");
        if (getDisplayOptions() != null)
            sb.append("DisplayOptions: ").append(getDisplayOptions()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSelectableValues() != null)
            sb.append("SelectableValues: ").append(getSelectableValues()).append(",");
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

        if (obj instanceof ParameterListControl == false)
            return false;
        ParameterListControl other = (ParameterListControl) obj;
        if (other.getParameterControlId() == null ^ this.getParameterControlId() == null)
            return false;
        if (other.getParameterControlId() != null && other.getParameterControlId().equals(this.getParameterControlId()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSourceParameterName() == null ^ this.getSourceParameterName() == null)
            return false;
        if (other.getSourceParameterName() != null && other.getSourceParameterName().equals(this.getSourceParameterName()) == false)
            return false;
        if (other.getDisplayOptions() == null ^ this.getDisplayOptions() == null)
            return false;
        if (other.getDisplayOptions() != null && other.getDisplayOptions().equals(this.getDisplayOptions()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSelectableValues() == null ^ this.getSelectableValues() == null)
            return false;
        if (other.getSelectableValues() != null && other.getSelectableValues().equals(this.getSelectableValues()) == false)
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

        hashCode = prime * hashCode + ((getParameterControlId() == null) ? 0 : getParameterControlId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSourceParameterName() == null) ? 0 : getSourceParameterName().hashCode());
        hashCode = prime * hashCode + ((getDisplayOptions() == null) ? 0 : getDisplayOptions().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSelectableValues() == null) ? 0 : getSelectableValues().hashCode());
        hashCode = prime * hashCode + ((getCascadingControlConfiguration() == null) ? 0 : getCascadingControlConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ParameterListControl clone() {
        try {
            return (ParameterListControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ParameterListControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
