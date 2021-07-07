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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDashboardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * A friendly name for the dashboard.
     * </p>
     */
    private String dashboardName;
    /**
     * <p>
     * A description for the dashboard.
     * </p>
     */
    private String dashboardDescription;
    /**
     * <p>
     * The dashboard definition specified in a JSON literal. For detailed information, see <a
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
     * A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
     * </p>
     * 
     * @param projectId
     *        The ID of the project in which to create the dashboard.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
     * </p>
     * 
     * @return The ID of the project in which to create the dashboard.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project in which to create the dashboard.
     * </p>
     * 
     * @param projectId
     *        The ID of the project in which to create the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * A friendly name for the dashboard.
     * </p>
     * 
     * @param dashboardName
     *        A friendly name for the dashboard.
     */

    public void setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
    }

    /**
     * <p>
     * A friendly name for the dashboard.
     * </p>
     * 
     * @return A friendly name for the dashboard.
     */

    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * <p>
     * A friendly name for the dashboard.
     * </p>
     * 
     * @param dashboardName
     *        A friendly name for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withDashboardName(String dashboardName) {
        setDashboardName(dashboardName);
        return this;
    }

    /**
     * <p>
     * A description for the dashboard.
     * </p>
     * 
     * @param dashboardDescription
     *        A description for the dashboard.
     */

    public void setDashboardDescription(String dashboardDescription) {
        this.dashboardDescription = dashboardDescription;
    }

    /**
     * <p>
     * A description for the dashboard.
     * </p>
     * 
     * @return A description for the dashboard.
     */

    public String getDashboardDescription() {
        return this.dashboardDescription;
    }

    /**
     * <p>
     * A description for the dashboard.
     * </p>
     * 
     * @param dashboardDescription
     *        A description for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withDashboardDescription(String dashboardDescription) {
        setDashboardDescription(dashboardDescription);
        return this;
    }

    /**
     * <p>
     * The dashboard definition specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param dashboardDefinition
     *        The dashboard definition specified in a JSON literal. For detailed information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *        >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setDashboardDefinition(String dashboardDefinition) {
        this.dashboardDefinition = dashboardDefinition;
    }

    /**
     * <p>
     * The dashboard definition specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The dashboard definition specified in a JSON literal. For detailed information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *         >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getDashboardDefinition() {
        return this.dashboardDefinition;
    }

    /**
     * <p>
     * The dashboard definition specified in a JSON literal. For detailed information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html">Creating
     * dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param dashboardDefinition
     *        The dashboard definition specified in a JSON literal. For detailed information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/create-dashboards-using-aws-cli.html"
     *        >Creating dashboards (CLI)</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withDashboardDefinition(String dashboardDefinition) {
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

    public CreateDashboardRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *         SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the dashboard. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDashboardRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest clearTagsEntries() {
        this.tags = null;
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
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getDashboardName() != null)
            sb.append("DashboardName: ").append(getDashboardName()).append(",");
        if (getDashboardDescription() != null)
            sb.append("DashboardDescription: ").append(getDashboardDescription()).append(",");
        if (getDashboardDefinition() != null)
            sb.append("DashboardDefinition: ").append(getDashboardDefinition()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDashboardRequest == false)
            return false;
        CreateDashboardRequest other = (CreateDashboardRequest) obj;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getDashboardName() == null) ? 0 : getDashboardName().hashCode());
        hashCode = prime * hashCode + ((getDashboardDescription() == null) ? 0 : getDashboardDescription().hashCode());
        hashCode = prime * hashCode + ((getDashboardDefinition() == null) ? 0 : getDashboardDefinition().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDashboardRequest clone() {
        return (CreateDashboardRequest) super.clone();
    }

}
