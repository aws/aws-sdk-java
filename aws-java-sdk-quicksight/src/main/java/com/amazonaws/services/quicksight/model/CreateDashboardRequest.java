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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CreateDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDashboardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account where you want to create the dashboard.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
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
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A
     * dashboard can have any type of parameters, and some parameters might accept multiple values.
     * </p>
     */
    private Parameters parameters;
    /**
     * <p>
     * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions
     * by providing a list of IAM action information for each principal ARN.
     * </p>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;
    /**
     * <p>
     * The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>, you
     * specify the type of object you're using as source. You can only create a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis, first convert the
     * analysis to a template by using the <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>, specify
     * the Amazon Resource Name (ARN) of the source template. The <code>SourceTemplate</code>ARN can contain any AWS
     * Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its placeholder.
     * </p>
     */
    private DashboardSourceEntity sourceEntity;
    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A description for the first version of the dashboard being created.
     * </p>
     */
    private String versionDescription;
    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight disables the
     * left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't enabled when
     * this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     * <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     */
    private DashboardPublishOptions dashboardPublishOptions;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for this
     * field, it overrides the value that is used in the source entity. The theme ARN must exist in the same AWS account
     * where you create the dashboard.
     * </p>
     */
    private String themeArn;

    /**
     * <p>
     * The ID of the AWS account where you want to create the dashboard.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to create the dashboard.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to create the dashboard.
     * </p>
     * 
     * @return The ID of the AWS account where you want to create the dashboard.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account where you want to create the dashboard.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the AWS account where you want to create the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard, also added to the IAM policy.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * 
     * @return The ID for the dashboard, also added to the IAM policy.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID for the dashboard, also added to the IAM policy.
     * </p>
     * 
     * @param dashboardId
     *        The ID for the dashboard, also added to the IAM policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withDashboardId(String dashboardId) {
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

    public CreateDashboardRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A
     * dashboard can have any type of parameters, and some parameters might accept multiple values.
     * </p>
     * 
     * @param parameters
     *        The parameters for the creation of the dashboard, which you want to use to override the default settings.
     *        A dashboard can have any type of parameters, and some parameters might accept multiple values.
     */

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A
     * dashboard can have any type of parameters, and some parameters might accept multiple values.
     * </p>
     * 
     * @return The parameters for the creation of the dashboard, which you want to use to override the default settings.
     *         A dashboard can have any type of parameters, and some parameters might accept multiple values.
     */

    public Parameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The parameters for the creation of the dashboard, which you want to use to override the default settings. A
     * dashboard can have any type of parameters, and some parameters might accept multiple values.
     * </p>
     * 
     * @param parameters
     *        The parameters for the creation of the dashboard, which you want to use to override the default settings.
     *        A dashboard can have any type of parameters, and some parameters might accept multiple values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withParameters(Parameters parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions
     * by providing a list of IAM action information for each principal ARN.
     * </p>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * 
     * @return A structure that contains the permissions of the dashboard. You can use this structure for granting
     *         permissions by providing a list of IAM action information for each principal ARN. </p>
     *         <p>
     *         To specify no permissions, omit the permissions list.
     */

    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions
     * by providing a list of IAM action information for each principal ARN.
     * </p>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * 
     * @param permissions
     *        A structure that contains the permissions of the dashboard. You can use this structure for granting
     *        permissions by providing a list of IAM action information for each principal ARN. </p>
     *        <p>
     *        To specify no permissions, omit the permissions list.
     */

    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions
     * by providing a list of IAM action information for each principal ARN.
     * </p>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        A structure that contains the permissions of the dashboard. You can use this structure for granting
     *        permissions by providing a list of IAM action information for each principal ARN. </p>
     *        <p>
     *        To specify no permissions, omit the permissions list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withPermissions(ResourcePermission... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<ResourcePermission>(permissions.length));
        }
        for (ResourcePermission ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A structure that contains the permissions of the dashboard. You can use this structure for granting permissions
     * by providing a list of IAM action information for each principal ARN.
     * </p>
     * <p>
     * To specify no permissions, omit the permissions list.
     * </p>
     * 
     * @param permissions
     *        A structure that contains the permissions of the dashboard. You can use this structure for granting
     *        permissions by providing a list of IAM action information for each principal ARN. </p>
     *        <p>
     *        To specify no permissions, omit the permissions list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withPermissions(java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>, you
     * specify the type of object you're using as source. You can only create a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis, first convert the
     * analysis to a template by using the <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>, specify
     * the Amazon Resource Name (ARN) of the source template. The <code>SourceTemplate</code>ARN can contain any AWS
     * Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its placeholder.
     * </p>
     * 
     * @param sourceEntity
     *        The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>, you
     *        specify the type of object you're using as source. You can only create a dashboard from a template, so you
     *        use a <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis, first
     *        convert the analysis to a template by using the <a>CreateTemplate</a> API operation. For
     *        <code>SourceTemplate</code>, specify the Amazon Resource Name (ARN) of the source template. The
     *        <code>SourceTemplate</code>ARN can contain any AWS Account and any QuickSight-supported AWS Region. </p>
     *        <p>
     *        Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement
     *        datasets for the placeholders listed in the original. The schema in each dataset must match its
     *        placeholder.
     */

    public void setSourceEntity(DashboardSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>, you
     * specify the type of object you're using as source. You can only create a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis, first convert the
     * analysis to a template by using the <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>, specify
     * the Amazon Resource Name (ARN) of the source template. The <code>SourceTemplate</code>ARN can contain any AWS
     * Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its placeholder.
     * </p>
     * 
     * @return The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>,
     *         you specify the type of object you're using as source. You can only create a dashboard from a template,
     *         so you use a <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis,
     *         first convert the analysis to a template by using the <a>CreateTemplate</a> API operation. For
     *         <code>SourceTemplate</code>, specify the Amazon Resource Name (ARN) of the source template. The
     *         <code>SourceTemplate</code>ARN can contain any AWS Account and any QuickSight-supported AWS Region. </p>
     *         <p>
     *         Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement
     *         datasets for the placeholders listed in the original. The schema in each dataset must match its
     *         placeholder.
     */

    public DashboardSourceEntity getSourceEntity() {
        return this.sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>, you
     * specify the type of object you're using as source. You can only create a dashboard from a template, so you use a
     * <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis, first convert the
     * analysis to a template by using the <a>CreateTemplate</a> API operation. For <code>SourceTemplate</code>, specify
     * the Amazon Resource Name (ARN) of the source template. The <code>SourceTemplate</code>ARN can contain any AWS
     * Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement datasets
     * for the placeholders listed in the original. The schema in each dataset must match its placeholder.
     * </p>
     * 
     * @param sourceEntity
     *        The entity that you are using as a source when you create the dashboard. In <code>SourceEntity</code>, you
     *        specify the type of object you're using as source. You can only create a dashboard from a template, so you
     *        use a <code>SourceTemplate</code> entity. If you need to create a dashboard from an analysis, first
     *        convert the analysis to a template by using the <a>CreateTemplate</a> API operation. For
     *        <code>SourceTemplate</code>, specify the Amazon Resource Name (ARN) of the source template. The
     *        <code>SourceTemplate</code>ARN can contain any AWS Account and any QuickSight-supported AWS Region. </p>
     *        <p>
     *        Use the <code>DataSetReferences</code> entity within <code>SourceTemplate</code> to list the replacement
     *        datasets for the placeholders listed in the original. The schema in each dataset must match its
     *        placeholder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withSourceEntity(DashboardSourceEntity sourceEntity) {
        setSourceEntity(sourceEntity);
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * </p>
     * 
     * @return Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * </p>
     * 
     * @param tags
     *        Contains a map of the key-value pairs for the resource tag or tags assigned to the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public CreateDashboardRequest withVersionDescription(String versionDescription) {
        setVersionDescription(versionDescription);
        return this;
    }

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight disables the
     * left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't enabled when
     * this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     * <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dashboardPublishOptions
     *        Options for publishing the dashboard when you create it:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     *        <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight
     *        disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time)
     *        filtering. This option is <code>ENABLED</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     *        <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't
     *        enabled when this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     *        <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     *        </p>
     *        </li>
     */

    public void setDashboardPublishOptions(DashboardPublishOptions dashboardPublishOptions) {
        this.dashboardPublishOptions = dashboardPublishOptions;
    }

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight disables the
     * left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't enabled when
     * this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     * <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Options for publishing the dashboard when you create it:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     *         <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight
     *         disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time)
     *         filtering. This option is <code>ENABLED</code> by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     *         <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't
     *         enabled when this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     *         <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     *         </p>
     *         </li>
     */

    public DashboardPublishOptions getDashboardPublishOptions() {
        return this.dashboardPublishOptions;
    }

    /**
     * <p>
     * Options for publishing the dashboard when you create it:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight disables the
     * left filter pane on the published dashboard, which can be used for ad hoc (one-time) filtering. This option is
     * <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     * <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't enabled when
     * this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     * <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dashboardPublishOptions
     *        Options for publishing the dashboard when you create it:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AvailabilityStatus</code> for <code>AdHocFilteringOption</code> - This status can be either
     *        <code>ENABLED</code> or <code>DISABLED</code>. When this is set to <code>DISABLED</code>, QuickSight
     *        disables the left filter pane on the published dashboard, which can be used for ad hoc (one-time)
     *        filtering. This option is <code>ENABLED</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AvailabilityStatus</code> for <code>ExportToCSVOption</code> - This status can be either
     *        <code>ENABLED</code> or <code>DISABLED</code>. The visual option to export data to .CSV format isn't
     *        enabled when this is set to <code>DISABLED</code>. This option is <code>ENABLED</code> by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VisibilityState</code> for <code>SheetControlsOption</code> - This visibility state can be either
     *        <code>COLLAPSED</code> or <code>EXPANDED</code>. This option is <code>COLLAPSED</code> by default.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withDashboardPublishOptions(DashboardPublishOptions dashboardPublishOptions) {
        setDashboardPublishOptions(dashboardPublishOptions);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for this
     * field, it overrides the value that is used in the source entity. The theme ARN must exist in the same AWS account
     * where you create the dashboard.
     * </p>
     * 
     * @param themeArn
     *        The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for
     *        this field, it overrides the value that is used in the source entity. The theme ARN must exist in the same
     *        AWS account where you create the dashboard.
     */

    public void setThemeArn(String themeArn) {
        this.themeArn = themeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for this
     * field, it overrides the value that is used in the source entity. The theme ARN must exist in the same AWS account
     * where you create the dashboard.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for
     *         this field, it overrides the value that is used in the source entity. The theme ARN must exist in the
     *         same AWS account where you create the dashboard.
     */

    public String getThemeArn() {
        return this.themeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for this
     * field, it overrides the value that is used in the source entity. The theme ARN must exist in the same AWS account
     * where you create the dashboard.
     * </p>
     * 
     * @param themeArn
     *        The Amazon Resource Name (ARN) of the theme that is being used for this dashboard. If you add a value for
     *        this field, it overrides the value that is used in the source entity. The theme ARN must exist in the same
     *        AWS account where you create the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDashboardRequest withThemeArn(String themeArn) {
        setThemeArn(themeArn);
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
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: ").append(getSourceEntity()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: ").append(getVersionDescription()).append(",");
        if (getDashboardPublishOptions() != null)
            sb.append("DashboardPublishOptions: ").append(getDashboardPublishOptions()).append(",");
        if (getThemeArn() != null)
            sb.append("ThemeArn: ").append(getThemeArn());
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
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getDashboardPublishOptions() == null ^ this.getDashboardPublishOptions() == null)
            return false;
        if (other.getDashboardPublishOptions() != null && other.getDashboardPublishOptions().equals(this.getDashboardPublishOptions()) == false)
            return false;
        if (other.getThemeArn() == null ^ this.getThemeArn() == null)
            return false;
        if (other.getThemeArn() != null && other.getThemeArn().equals(this.getThemeArn()) == false)
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
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getDashboardPublishOptions() == null) ? 0 : getDashboardPublishOptions().hashCode());
        hashCode = prime * hashCode + ((getThemeArn() == null) ? 0 : getThemeArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDashboardRequest clone() {
        return (CreateDashboardRequest) super.clone();
    }

}
