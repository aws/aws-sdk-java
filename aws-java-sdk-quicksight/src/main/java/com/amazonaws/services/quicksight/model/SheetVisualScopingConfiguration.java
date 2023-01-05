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
 * The filter that is applied to the options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SheetVisualScopingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SheetVisualScopingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The selected sheet that the filter is applied to.
     * </p>
     */
    private String sheetId;
    /**
     * <p>
     * The scope of the applied entities. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code>
     * </p>
     * </li>
     * </ul>
     */
    private String scope;
    /**
     * <p>
     * The selected visuals that the filter is applied to.
     * </p>
     */
    private java.util.List<String> visualIds;

    /**
     * <p>
     * The selected sheet that the filter is applied to.
     * </p>
     * 
     * @param sheetId
     *        The selected sheet that the filter is applied to.
     */

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    /**
     * <p>
     * The selected sheet that the filter is applied to.
     * </p>
     * 
     * @return The selected sheet that the filter is applied to.
     */

    public String getSheetId() {
        return this.sheetId;
    }

    /**
     * <p>
     * The selected sheet that the filter is applied to.
     * </p>
     * 
     * @param sheetId
     *        The selected sheet that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetVisualScopingConfiguration withSheetId(String sheetId) {
        setSheetId(sheetId);
        return this;
    }

    /**
     * <p>
     * The scope of the applied entities. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        The scope of the applied entities. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SELECTED_VISUALS</code>
     *        </p>
     *        </li>
     * @see FilterVisualScope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope of the applied entities. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The scope of the applied entities. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_VISUALS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SELECTED_VISUALS</code>
     *         </p>
     *         </li>
     * @see FilterVisualScope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope of the applied entities. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        The scope of the applied entities. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SELECTED_VISUALS</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterVisualScope
     */

    public SheetVisualScopingConfiguration withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope of the applied entities. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VISUALS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SELECTED_VISUALS</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        The scope of the applied entities. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VISUALS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SELECTED_VISUALS</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterVisualScope
     */

    public SheetVisualScopingConfiguration withScope(FilterVisualScope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The selected visuals that the filter is applied to.
     * </p>
     * 
     * @return The selected visuals that the filter is applied to.
     */

    public java.util.List<String> getVisualIds() {
        return visualIds;
    }

    /**
     * <p>
     * The selected visuals that the filter is applied to.
     * </p>
     * 
     * @param visualIds
     *        The selected visuals that the filter is applied to.
     */

    public void setVisualIds(java.util.Collection<String> visualIds) {
        if (visualIds == null) {
            this.visualIds = null;
            return;
        }

        this.visualIds = new java.util.ArrayList<String>(visualIds);
    }

    /**
     * <p>
     * The selected visuals that the filter is applied to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVisualIds(java.util.Collection)} or {@link #withVisualIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param visualIds
     *        The selected visuals that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetVisualScopingConfiguration withVisualIds(String... visualIds) {
        if (this.visualIds == null) {
            setVisualIds(new java.util.ArrayList<String>(visualIds.length));
        }
        for (String ele : visualIds) {
            this.visualIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The selected visuals that the filter is applied to.
     * </p>
     * 
     * @param visualIds
     *        The selected visuals that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SheetVisualScopingConfiguration withVisualIds(java.util.Collection<String> visualIds) {
        setVisualIds(visualIds);
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
        if (getSheetId() != null)
            sb.append("SheetId: ").append(getSheetId()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getVisualIds() != null)
            sb.append("VisualIds: ").append(getVisualIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SheetVisualScopingConfiguration == false)
            return false;
        SheetVisualScopingConfiguration other = (SheetVisualScopingConfiguration) obj;
        if (other.getSheetId() == null ^ this.getSheetId() == null)
            return false;
        if (other.getSheetId() != null && other.getSheetId().equals(this.getSheetId()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getVisualIds() == null ^ this.getVisualIds() == null)
            return false;
        if (other.getVisualIds() != null && other.getVisualIds().equals(this.getVisualIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getVisualIds() == null) ? 0 : getVisualIds().hashCode());
        return hashCode;
    }

    @Override
    public SheetVisualScopingConfiguration clone() {
        try {
            return (SheetVisualScopingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SheetVisualScopingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
