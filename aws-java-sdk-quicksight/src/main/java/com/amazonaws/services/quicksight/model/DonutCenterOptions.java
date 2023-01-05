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
 * The label options of the label that is displayed in the center of a donut chart. This option isn't available for pie
 * charts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DonutCenterOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DonutCenterOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is called
     * <code>'Show total'</code>.
     * </p>
     */
    private String labelVisibility;

    /**
     * <p>
     * Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is called
     * <code>'Show total'</code>.
     * </p>
     * 
     * @param labelVisibility
     *        Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is
     *        called <code>'Show total'</code>.
     * @see Visibility
     */

    public void setLabelVisibility(String labelVisibility) {
        this.labelVisibility = labelVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is called
     * <code>'Show total'</code>.
     * </p>
     * 
     * @return Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is
     *         called <code>'Show total'</code>.
     * @see Visibility
     */

    public String getLabelVisibility() {
        return this.labelVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is called
     * <code>'Show total'</code>.
     * </p>
     * 
     * @param labelVisibility
     *        Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is
     *        called <code>'Show total'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DonutCenterOptions withLabelVisibility(String labelVisibility) {
        setLabelVisibility(labelVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is called
     * <code>'Show total'</code>.
     * </p>
     * 
     * @param labelVisibility
     *        Determines the visibility of the label in a donut chart. In the Amazon QuickSight console, this option is
     *        called <code>'Show total'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public DonutCenterOptions withLabelVisibility(Visibility labelVisibility) {
        this.labelVisibility = labelVisibility.toString();
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
        if (getLabelVisibility() != null)
            sb.append("LabelVisibility: ").append(getLabelVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DonutCenterOptions == false)
            return false;
        DonutCenterOptions other = (DonutCenterOptions) obj;
        if (other.getLabelVisibility() == null ^ this.getLabelVisibility() == null)
            return false;
        if (other.getLabelVisibility() != null && other.getLabelVisibility().equals(this.getLabelVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelVisibility() == null) ? 0 : getLabelVisibility().hashCode());
        return hashCode;
    }

    @Override
    public DonutCenterOptions clone() {
        try {
            return (DonutCenterOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DonutCenterOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
