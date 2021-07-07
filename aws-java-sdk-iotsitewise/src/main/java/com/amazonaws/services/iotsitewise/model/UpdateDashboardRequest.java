/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/UpdateDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDashboardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the dashboard to update.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * A new friendly name for the dashboard.
     * </p>
     */
    private String dashboardName;
    /**
     * <p>
     * A new description for the dashboard.
     * </p>
     */
    private String dashboardDescription;
    /**
     * <p>
     * The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String dashboardDefinition;
    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the dashboard to update.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard to update.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard to update.
     * </p>
     * 
     * @return The ID of the dashboard to update.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard to update.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * A new friendly name for the dashboard.
     * </p>
     * 
     * @param dashboardName
     *        A new friendly name for the dashboard.
     */

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * A new friendly name for the dashboard.
     * </p>
     * 
     * @return A new friendly name for the dashboard.
     */

    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * <p>
     * A new friendly name for the dashboard.
     * </p>
     * 
     * @param dashboardName
     *        A new friendly name for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withDashboardName(String dashboardName) {
        setDashboardName(dashboardName);
        return this;
    }

    /**
     * <p>
     * A new description for the dashboard.
     * </p>
     * 
     * @param dashboardDescription
     *        A new description for the dashboard.
     */

    public void setDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
    }

    /**
     * <p>
     * A new description for the dashboard.
     * </p>
     * 
     * @return A new description for the dashboard.
     */

    public String getDashboardDescription() {
        return this.dashboardDescription;
    }

    /**
     * <p>
     * A new description for the dashboard.
     * </p>
     * 
     * @param dashboardDescription
     *        A new description for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withDashboardDescription(String dashboardDescription) {
        setDashboardDescription(dashboardDescription);
        return this;
    }

    /**
     * <p>
     * The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param dashboardDefinition
     *        The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *        >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setDashboardDefinition(String dashboardDefinition) {
        this.dashboardDefinition = dashboardDefinition;
    }

    /**
     * <p>
     * The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *         >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getDashboardDefinition() {
        return this.dashboardDefinition;
    }

    /**
     * <p>
     * The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param dashboardDefinition
     *        The new dashboard definition, as specified in a JSON literal. For detailed information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *        >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withDashboardDefinition(String dashboardDefinition) {
        setDashboardDefinition(dashboardDefinition);
        return this;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @return A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *         reuse this client token if a new idempotent request is required.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse
     * this client token if a new idempotent request is required.
     * </p>
     * 
     * @param clientToken
     *        A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't
     *        reuse this client token if a new idempotent request is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getDashboardName() != null)
            sb.append("DashboardName: ").append(getDashboardName()).append(",");
        if (getDashboardDescription() != null)
            sb.append("DashboardDescription: ").append(getDashboardDescription()).append(",");
        if (getDashboardDefinition() != null)
            sb.append("DashboardDefinition: ").append(getDashboardDefinition()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDashboardRequest == false)
            return false;
        UpdateDashboardRequest other = (UpdateDashboardRequest) obj;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getDashboardName() == null ^ this.getDashboardName() == null)
            return false;
        if (other.getDashboardName() != null && other.getDashboardName().equals(this.getDashboardName()) == false)
            return false;
        if (other.getDashboardDescription() == null ^ this.getDashboardDescription() == null)
            return false;
        if (other.getDashboardDescription() != null && other.getDashboardDescription().equals(this.getDashboardDescription()) == false)
            return false;
        if (other.getDashboardDefinition() == null ^ this.getDashboardDefinition() == null)
            return false;
        if (other.getDashboardDefinition() != null && other.getDashboardDefinition().equals(this.getDashboardDefinition()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode + ((getDashboardDescription() == null) ? 0 : getDashboardDescription().hashCode());
        hashCode = prime * hashCode + ((getDashboardDefinition() == null) ? 0 : getDashboardDefinition().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDashboardRequest clone() {
        return (UpdateDashboardRequest) super.clone();
    }

}
