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
 * The configuration of the same-sheet target visuals that you want to be filtered.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SameSheetTargetVisualConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SameSheetTargetVisualConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the target visual IDs that are located in the same sheet of the analysis.
     * </p>
     */
    private java.util.List<String> targetVisuals;
    /**
     * <p>
     * The options that choose the target visual in the same sheet.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     * </p>
     * </li>
     * </ul>
     */
    private String targetVisualOptions;

    /**
     * <p>
     * A list of the target visual IDs that are located in the same sheet of the analysis.
     * </p>
     * 
     * @return A list of the target visual IDs that are located in the same sheet of the analysis.
     */

    public java.util.List<String> getTargetVisuals() {
        return targetVisuals;
    }

    /**
     * <p>
     * A list of the target visual IDs that are located in the same sheet of the analysis.
     * </p>
     * 
     * @param targetVisuals
     *        A list of the target visual IDs that are located in the same sheet of the analysis.
     */

    public void setTargetVisuals(java.util.Collection<String> targetVisuals) {
        if (targetVisuals == null) {
            this.targetVisuals = null;
            return;
        }

        this.targetVisuals = new java.util.ArrayList<String>(targetVisuals);
    }

    /**
     * <p>
     * A list of the target visual IDs that are located in the same sheet of the analysis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetVisuals(java.util.Collection)} or {@link #withTargetVisuals(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param targetVisuals
     *        A list of the target visual IDs that are located in the same sheet of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SameSheetTargetVisualConfiguration withTargetVisuals(String... targetVisuals) {
        if (this.targetVisuals == null) {
            setTargetVisuals(new java.util.ArrayList<String>(targetVisuals.length));
        }
        for (String ele : targetVisuals) {
            this.targetVisuals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the target visual IDs that are located in the same sheet of the analysis.
     * </p>
     * 
     * @param targetVisuals
     *        A list of the target visual IDs that are located in the same sheet of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SameSheetTargetVisualConfiguration withTargetVisuals(java.util.Collection<String> targetVisuals) {
        setTargetVisuals(targetVisuals);
        return this;
    }

    /**
     * <p>
     * The options that choose the target visual in the same sheet.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetVisualOptions
     *        The options that choose the target visual in the same sheet.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     *        </p>
     *        </li>
     * @see TargetVisualOptions
     */

    public void setTargetVisualOptions(String targetVisualOptions) {
        this.targetVisualOptions = targetVisualOptions;
    }

    /**
     * <p>
     * The options that choose the target visual in the same sheet.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The options that choose the target visual in the same sheet.</p>
     *         <p>
     *         Valid values are defined as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     *         </p>
     *         </li>
     * @see TargetVisualOptions
     */

    public String getTargetVisualOptions() {
        return this.targetVisualOptions;
    }

    /**
     * <p>
     * The options that choose the target visual in the same sheet.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetVisualOptions
     *        The options that choose the target visual in the same sheet.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetVisualOptions
     */

    public SameSheetTargetVisualConfiguration withTargetVisualOptions(String targetVisualOptions) {
        setTargetVisualOptions(targetVisualOptions);
        return this;
    }

    /**
     * <p>
     * The options that choose the target visual in the same sheet.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetVisualOptions
     *        The options that choose the target visual in the same sheet.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code>: Applies the filter operation to all visuals in the same sheet.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetVisualOptions
     */

    public SameSheetTargetVisualConfiguration withTargetVisualOptions(TargetVisualOptions targetVisualOptions) {
        this.targetVisualOptions = targetVisualOptions.toString();
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
        if (getTargetVisuals() != null)
            sb.append("TargetVisuals: ").append(getTargetVisuals()).append(",");
        if (getTargetVisualOptions() != null)
            sb.append("TargetVisualOptions: ").append(getTargetVisualOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SameSheetTargetVisualConfiguration == false)
            return false;
        SameSheetTargetVisualConfiguration other = (SameSheetTargetVisualConfiguration) obj;
        if (other.getTargetVisuals() == null ^ this.getTargetVisuals() == null)
            return false;
        if (other.getTargetVisuals() != null && other.getTargetVisuals().equals(this.getTargetVisuals()) == false)
            return false;
        if (other.getTargetVisualOptions() == null ^ this.getTargetVisualOptions() == null)
            return false;
        if (other.getTargetVisualOptions() != null && other.getTargetVisualOptions().equals(this.getTargetVisualOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetVisuals() == null) ? 0 : getTargetVisuals().hashCode());
        hashCode = prime * hashCode + ((getTargetVisualOptions() == null) ? 0 : getTargetVisualOptions().hashCode());
        return hashCode;
    }

    @Override
    public SameSheetTargetVisualConfiguration clone() {
        try {
            return (SameSheetTargetVisualConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SameSheetTargetVisualConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
