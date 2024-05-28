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
 * The options for the label thta is located above the row headers. This option is only applicable when
 * <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableRowsLabelOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableRowsLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of the rows label.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The custom label string for the rows label.
     * </p>
     */
    private String customLabel;

    /**
     * <p>
     * The visibility of the rows label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the rows label.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the rows label.
     * </p>
     * 
     * @return The visibility of the rows label.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the rows label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the rows label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableRowsLabelOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the rows label.
     * </p>
     * 
     * @param visibility
     *        The visibility of the rows label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableRowsLabelOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The custom label string for the rows label.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the rows label.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The custom label string for the rows label.
     * </p>
     * 
     * @return The custom label string for the rows label.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The custom label string for the rows label.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the rows label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableRowsLabelOptions withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableRowsLabelOptions == false)
            return false;
        PivotTableRowsLabelOptions other = (PivotTableRowsLabelOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableRowsLabelOptions clone() {
        try {
            return (PivotTableRowsLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableRowsLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
