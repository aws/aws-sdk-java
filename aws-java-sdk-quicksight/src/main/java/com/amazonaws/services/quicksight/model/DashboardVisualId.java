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
 * A structure that contains the following elements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The <code>DashboardId</code> of the dashboard that has the visual that you want to embed.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>SheetId</code> of the sheet that has the visual that you want to embed.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>VisualId</code> of the visual that you want to embed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * The <code>DashboardId</code>, <code>SheetId</code>, and <code>VisualId</code> can be found in the
 * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of the
 * Amazon QuickSight console. You can also get the <code>DashboardId</code> with a <code>ListDashboards</code> API
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardVisualId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardVisualId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be found in
     * the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu
     * of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a
     * <code>ListDashboards</code> API operation.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     */
    private String sheetId;
    /**
     * <p>
     * The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     */
    private String visualId;

    /**
     * <p>
     * The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be found in
     * the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu
     * of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a
     * <code>ListDashboards</code> API operation.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be
     *        found in the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's
     *        on-visual menu of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a
     *        <code>ListDashboards</code> API operation.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be found in
     * the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu
     * of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a
     * <code>ListDashboards</code> API operation.
     * </p>
     * 
     * @return The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be
     *         found in the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the
     *         visual's on-visual menu of the Amazon QuickSight console. You can also get the <code>DashboardId</code>
     *         with a <code>ListDashboards</code> API operation.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be found in
     * the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu
     * of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a
     * <code>ListDashboards</code> API operation.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that has the visual that you want to embed. The <code>DashboardId</code> can be
     *        found in the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's
     *        on-visual menu of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a
     *        <code>ListDashboards</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVisualId withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     * 
     * @param sheetId
     *        The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in
     *        the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's
     *        on-visual menu of the Amazon QuickSight console.
     */

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId;
    }

    /**
     * <p>
     * The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     * 
     * @return The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in
     *         the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's
     *         on-visual menu of the Amazon QuickSight console.
     */

    public String getSheetId() {
        return this.sheetId;
    }

    /**
     * <p>
     * The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     * 
     * @param sheetId
     *        The ID of the sheet that the has visual that you want to embed. The <code>SheetId</code> can be found in
     *        the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's
     *        on-visual menu of the Amazon QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVisualId withSheetId(String sheetId) {
        setSheetId(sheetId);
        return this;
    }

    /**
     * <p>
     * The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     * 
     * @param visualId
     *        The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     *        <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual
     *        menu of the Amazon QuickSight console.
     */

    public void setVisualId(String visualId) {
        this.visualId = visualId;
    }

    /**
     * <p>
     * The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     * 
     * @return The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     *         <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual
     *         menu of the Amazon QuickSight console.
     */

    public String getVisualId() {
        return this.visualId;
    }

    /**
     * <p>
     * The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     * <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of
     * the Amazon QuickSight console.
     * </p>
     * 
     * @param visualId
     *        The ID of the visual that you want to embed. The <code>VisualID</code> can be found in the
     *        <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual
     *        menu of the Amazon QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVisualId withVisualId(String visualId) {
        setVisualId(visualId);
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
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getSheetId() != null)
            sb.append("SheetId: ").append(getSheetId()).append(",");
        if (getVisualId() != null)
            sb.append("VisualId: ").append(getVisualId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardVisualId == false)
            return false;
        DashboardVisualId other = (DashboardVisualId) obj;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getSheetId() == null ^ this.getSheetId() == null)
            return false;
        if (other.getSheetId() != null && other.getSheetId().equals(this.getSheetId()) == false)
            return false;
        if (other.getVisualId() == null ^ this.getVisualId() == null)
            return false;
        if (other.getVisualId() != null && other.getVisualId().equals(this.getVisualId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getSheetId() == null) ? 0 : getSheetId().hashCode());
        hashCode = prime * hashCode + ((getVisualId() == null) ? 0 : getVisualId().hashCode());
        return hashCode;
    }

    @Override
    public DashboardVisualId clone() {
        try {
            return (DashboardVisualId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardVisualIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
