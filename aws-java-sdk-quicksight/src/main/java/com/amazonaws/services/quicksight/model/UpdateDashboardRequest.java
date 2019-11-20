/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDashboardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of the
     * template and also references to replacement datasets for the placeholders set when creating the template. The
     * replacement datasets need to follow the same schema as the datasets for which placeholders were created when
     * creating the template.
     * </p>
     */
    private DashboardSourceEntity sourceEntity;
    /**
     * <p>
     * A structure that contains the parameters of the dashboard.
     * </p>
     */
    private Parameters parameters;
    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * Publishing options when creating a dashboard.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When This is set to set to <code>DISABLED</code>, QuickSight disables the left filter pane on the published
     * dashboard, which can be used for AdHoc filtering. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to CSV is disabled when this is set to <code>DISABLED</code>. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or <code>EXPANDED</code>. The
     * sheet controls pane is collapsed by default when set to true. Collapsed by default.
     * </p>
     * </li>
     * </ul>
     */
    private DashboardPublishOptions dashboardPublishOptions;

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the dashboard you are updating.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     * 
     * @return AWS account ID that contains the dashboard you are updating.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * AWS account ID that contains the dashboard you are updating.
     * </p>
     * 
     * @param awsAccountId
     *        AWS account ID that contains the dashboard you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @return The ID for the dashboard.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * 
     * @param name
     *        The display name of the dashboard.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * 
     * @return The display name of the dashboard.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the dashboard.
     * </p>
     * 
     * @param name
     *        The display name of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of the
     * template and also references to replacement datasets for the placeholders set when creating the template. The
     * replacement datasets need to follow the same schema as the datasets for which placeholders were created when
     * creating the template.
     * </p>
     * 
     * @param sourceEntity
     *        The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of
     *        the template and also references to replacement datasets for the placeholders set when creating the
     *        template. The replacement datasets need to follow the same schema as the datasets for which placeholders
     *        were created when creating the template.
     */

    public void setSourceEntity(DashboardSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of the
     * template and also references to replacement datasets for the placeholders set when creating the template. The
     * replacement datasets need to follow the same schema as the datasets for which placeholders were created when
     * creating the template.
     * </p>
     * 
     * @return The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of
     *         the template and also references to replacement datasets for the placeholders set when creating the
     *         template. The replacement datasets need to follow the same schema as the datasets for which placeholders
     *         were created when creating the template.
     */

    public DashboardSourceEntity getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>
     * The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of the
     * template and also references to replacement datasets for the placeholders set when creating the template. The
     * replacement datasets need to follow the same schema as the datasets for which placeholders were created when
     * creating the template.
     * </p>
     * 
     * @param sourceEntity
     *        The template or analysis from which the dashboard is created. The SouceTemplate entity accepts the Arn of
     *        the template and also references to replacement datasets for the placeholders set when creating the
     *        template. The replacement datasets need to follow the same schema as the datasets for which placeholders
     *        were created when creating the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withSourceEntity(DashboardSourceEntity sourceEntity) {
        setSourceEntity(sourceEntity);
        return this;
    }

    /**
     * <p>
     * A structure that contains the parameters of the dashboard.
     * </p>
     * 
     * @param parameters
     *        A structure that contains the parameters of the dashboard.
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A structure that contains the parameters of the dashboard.
     * </p>
     * 
     * @return A structure that contains the parameters of the dashboard.
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * A structure that contains the parameters of the dashboard.
     * </p>
     * 
     * @param parameters
     *        A structure that contains the parameters of the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withParameters(Parameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * 
     * @param versionDescription
     *        A description for the first version of the dashboard being created.
     */

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * 
     * @return A description for the first version of the dashboard being created.
     */

    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     * 
     * @param versionDescription
     *        A description for the first version of the dashboard being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * Publishing options when creating a dashboard.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When This is set to set to <code>DISABLED</code>, QuickSight disables the left filter pane on the published
     * dashboard, which can be used for AdHoc filtering. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to CSV is disabled when this is set to <code>DISABLED</code>. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or <code>EXPANDED</code>. The
     * sheet controls pane is collapsed by default when set to true. Collapsed by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dashboardPublishOptions
     *        Publishing options when creating a dashboard.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or
     *        <code>DISABLED</code>. When This is set to set to <code>DISABLED</code>, QuickSight disables the left
     *        filter pane on the published dashboard, which can be used for AdHoc filtering. Enabled by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or
     *        <code>DISABLED</code>. The visual option to export data to CSV is disabled when this is set to
     *        <code>DISABLED</code>. Enabled by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or
     *        <code>EXPANDED</code>. The sheet controls pane is collapsed by default when set to true. Collapsed by
     *        default.
     *        </p>
     *        </li>
     */

    public void setDashboardPublishOptions(DashboardPublishOptions dashboardPublishOptions) {
        this.dashboardPublishOptions = dashboardPublishOptions;
    }

    /**
     * <p>
     * Publishing options when creating a dashboard.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When This is set to set to <code>DISABLED</code>, QuickSight disables the left filter pane on the published
     * dashboard, which can be used for AdHoc filtering. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to CSV is disabled when this is set to <code>DISABLED</code>. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or <code>EXPANDED</code>. The
     * sheet controls pane is collapsed by default when set to true. Collapsed by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Publishing options when creating a dashboard.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or
     *         <code>DISABLED</code>. When This is set to set to <code>DISABLED</code>, QuickSight disables the left
     *         filter pane on the published dashboard, which can be used for AdHoc filtering. Enabled by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or
     *         <code>DISABLED</code>. The visual option to export data to CSV is disabled when this is set to
     *         <code>DISABLED</code>. Enabled by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or
     *         <code>EXPANDED</code>. The sheet controls pane is collapsed by default when set to true. Collapsed by
     *         default.
     *         </p>
     *         </li>
     */

    public DashboardPublishOptions getDashboardPublishOptions() {
        return this.dashboardPublishOptions;
    }

    /**
     * <p>
     * Publishing options when creating a dashboard.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>.
     * When This is set to set to <code>DISABLED</code>, QuickSight disables the left filter pane on the published
     * dashboard, which can be used for AdHoc filtering. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or <code>DISABLED</code>. The
     * visual option to export data to CSV is disabled when this is set to <code>DISABLED</code>. Enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or <code>EXPANDED</code>. The
     * sheet controls pane is collapsed by default when set to true. Collapsed by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dashboardPublishOptions
     *        Publishing options when creating a dashboard.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AvailabilityStatus for AdHocFilteringOption - This can be either <code>ENABLED</code> or
     *        <code>DISABLED</code>. When This is set to set to <code>DISABLED</code>, QuickSight disables the left
     *        filter pane on the published dashboard, which can be used for AdHoc filtering. Enabled by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AvailabilityStatus for ExportToCSVOption - This can be either <code>ENABLED</code> or
     *        <code>DISABLED</code>. The visual option to export data to CSV is disabled when this is set to
     *        <code>DISABLED</code>. Enabled by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        VisibilityState for SheetControlsOption - This can be either <code>COLLAPSED</code> or
     *        <code>EXPANDED</code>. The sheet controls pane is collapsed by default when set to true. Collapsed by
     *        default.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDashboardRequest withDashboardPublishOptions(DashboardPublishOptions dashboardPublishOptions) {
        setDashboardPublishOptions(dashboardPublishOptions);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: ").append(getSourceEntity()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getDashboardPublishOptions() != null)
            sb.append("DashboardPublishOptions: ").append(getDashboardPublishOptions());
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
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getDashboardPublishOptions() == null ^ this.getDashboardPublishOptions() == null)
            return false;
        if (other.getDashboardPublishOptions() != null && other.getDashboardPublishOptions().equals(this.getDashboardPublishOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getDashboardPublishOptions() == null) ? 0 : getDashboardPublishOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDashboardRequest clone() {
        return (UpdateDashboardRequest) super.clone();
    }

}
