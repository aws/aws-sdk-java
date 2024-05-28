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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartAssetBundleExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAssetBundleExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account to export assets from.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     */
    private String assetBundleExportJobId;
    /**
     * <p>
     * An array of resource ARNs to export. The following resources are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Analysis</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dashboard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RefreshSchedule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Theme</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCConnection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the job.
     * For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     * <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource that is a
     * dependency of the dashboard is also exported.
     * </p>
     */
    private Boolean includeAllDependencies;
    /**
     * <p>
     * The export data format.
     * </p>
     */
    private String exportFormat;
    /**
     * <p>
     * An optional collection of structures that generate CloudFormation parameters to override the existing resource
     * property values when the resource is exported to a new CloudFormation template.
     * </p>
     * <p>
     * Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code> API call
     * is set to <code>CLOUDFORMATION_JSON</code>.
     * </p>
     */
    private AssetBundleCloudFormationOverridePropertyConfiguration cloudFormationOverridePropertyConfiguration;
    /**
     * <p>
     * A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you set
     * <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource are exported.
     * </p>
     */
    private Boolean includePermissions;
    /**
     * <p>
     * A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     * <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     * </p>
     */
    private Boolean includeTags;
    /**
     * <p>
     * An optional parameter that determines which validation strategy to use for the export job. If
     * <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     * enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown as
     * warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     * </p>
     */
    private AssetBundleExportJobValidationStrategy validationStrategy;

    /**
     * <p>
     * The ID of the Amazon Web Services account to export assets from.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account to export assets from.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account to export assets from.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account to export assets from.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account to export assets from.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account to export assets from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *        this ID for another job.
     */

    public void setAssetBundleExportJobId(String assetBundleExportJobId) {
        this.assetBundleExportJobId = assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @return The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *         this ID for another job.
     */

    public String getAssetBundleExportJobId() {
        return this.assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *        this ID for another job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withAssetBundleExportJobId(String assetBundleExportJobId) {
        setAssetBundleExportJobId(assetBundleExportJobId);
        return this;
    }

    /**
     * <p>
     * An array of resource ARNs to export. The following resources are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Analysis</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dashboard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RefreshSchedule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Theme</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCConnection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     * 
     * @return An array of resource ARNs to export. The following resources are supported.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Analysis</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Dashboard</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DataSet</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DataSource</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RefreshSchedule</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Theme</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VPCConnection</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The API caller must have the necessary permissions in their IAM role to access each resource before the
     *         resources can be exported.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * An array of resource ARNs to export. The following resources are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Analysis</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dashboard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RefreshSchedule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Theme</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCConnection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     * 
     * @param resourceArns
     *        An array of resource ARNs to export. The following resources are supported.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Analysis</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dashboard</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataSet</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RefreshSchedule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Theme</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPCConnection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The API caller must have the necessary permissions in their IAM role to access each resource before the
     *        resources can be exported.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * An array of resource ARNs to export. The following resources are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Analysis</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dashboard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RefreshSchedule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Theme</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCConnection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        An array of resource ARNs to export. The following resources are supported.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Analysis</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dashboard</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataSet</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RefreshSchedule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Theme</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPCConnection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The API caller must have the necessary permissions in their IAM role to access each resource before the
     *        resources can be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of resource ARNs to export. The following resources are supported.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Analysis</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Dashboard</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSet</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RefreshSchedule</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Theme</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VPCConnection</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The API caller must have the necessary permissions in their IAM role to access each resource before the resources
     * can be exported.
     * </p>
     * 
     * @param resourceArns
     *        An array of resource ARNs to export. The following resources are supported.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Analysis</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Dashboard</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataSet</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RefreshSchedule</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Theme</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VPCConnection</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The API caller must have the necessary permissions in their IAM role to access each resource before the
     *        resources can be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the job.
     * For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     * <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource that is a
     * dependency of the dashboard is also exported.
     * </p>
     * 
     * @param includeAllDependencies
     *        A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the
     *        job. For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     *        <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource
     *        that is a dependency of the dashboard is also exported.
     */

    public void setIncludeAllDependencies(Boolean includeAllDependencies) {
        this.includeAllDependencies = includeAllDependencies;
    }

    /**
     * <p>
     * A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the job.
     * For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     * <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource that is a
     * dependency of the dashboard is also exported.
     * </p>
     * 
     * @return A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the
     *         job. For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     *         <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource
     *         that is a dependency of the dashboard is also exported.
     */

    public Boolean getIncludeAllDependencies() {
        return this.includeAllDependencies;
    }

    /**
     * <p>
     * A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the job.
     * For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     * <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource that is a
     * dependency of the dashboard is also exported.
     * </p>
     * 
     * @param includeAllDependencies
     *        A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the
     *        job. For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     *        <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource
     *        that is a dependency of the dashboard is also exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withIncludeAllDependencies(Boolean includeAllDependencies) {
        setIncludeAllDependencies(includeAllDependencies);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the job.
     * For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     * <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource that is a
     * dependency of the dashboard is also exported.
     * </p>
     * 
     * @return A Boolean that determines whether all dependencies of each resource ARN are recursively exported with the
     *         job. For example, say you provided a Dashboard ARN to the <code>ResourceArns</code> parameter. If you set
     *         <code>IncludeAllDependencies</code> to <code>TRUE</code>, any theme, dataset, and data source resource
     *         that is a dependency of the dashboard is also exported.
     */

    public Boolean isIncludeAllDependencies() {
        return this.includeAllDependencies;
    }

    /**
     * <p>
     * The export data format.
     * </p>
     * 
     * @param exportFormat
     *        The export data format.
     * @see AssetBundleExportFormat
     */

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    /**
     * <p>
     * The export data format.
     * </p>
     * 
     * @return The export data format.
     * @see AssetBundleExportFormat
     */

    public String getExportFormat() {
        return this.exportFormat;
    }

    /**
     * <p>
     * The export data format.
     * </p>
     * 
     * @param exportFormat
     *        The export data format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportFormat
     */

    public StartAssetBundleExportJobRequest withExportFormat(String exportFormat) {
        setExportFormat(exportFormat);
        return this;
    }

    /**
     * <p>
     * The export data format.
     * </p>
     * 
     * @param exportFormat
     *        The export data format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportFormat
     */

    public StartAssetBundleExportJobRequest withExportFormat(AssetBundleExportFormat exportFormat) {
        this.exportFormat = exportFormat.toString();
        return this;
    }

    /**
     * <p>
     * An optional collection of structures that generate CloudFormation parameters to override the existing resource
     * property values when the resource is exported to a new CloudFormation template.
     * </p>
     * <p>
     * Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code> API call
     * is set to <code>CLOUDFORMATION_JSON</code>.
     * </p>
     * 
     * @param cloudFormationOverridePropertyConfiguration
     *        An optional collection of structures that generate CloudFormation parameters to override the existing
     *        resource property values when the resource is exported to a new CloudFormation template.</p>
     *        <p>
     *        Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code>
     *        API call is set to <code>CLOUDFORMATION_JSON</code>.
     */

    public void setCloudFormationOverridePropertyConfiguration(
            AssetBundleCloudFormationOverridePropertyConfiguration cloudFormationOverridePropertyConfiguration) {
        this.cloudFormationOverridePropertyConfiguration = cloudFormationOverridePropertyConfiguration;
    }

    /**
     * <p>
     * An optional collection of structures that generate CloudFormation parameters to override the existing resource
     * property values when the resource is exported to a new CloudFormation template.
     * </p>
     * <p>
     * Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code> API call
     * is set to <code>CLOUDFORMATION_JSON</code>.
     * </p>
     * 
     * @return An optional collection of structures that generate CloudFormation parameters to override the existing
     *         resource property values when the resource is exported to a new CloudFormation template.</p>
     *         <p>
     *         Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code>
     *         API call is set to <code>CLOUDFORMATION_JSON</code>.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration getCloudFormationOverridePropertyConfiguration() {
        return this.cloudFormationOverridePropertyConfiguration;
    }

    /**
     * <p>
     * An optional collection of structures that generate CloudFormation parameters to override the existing resource
     * property values when the resource is exported to a new CloudFormation template.
     * </p>
     * <p>
     * Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code> API call
     * is set to <code>CLOUDFORMATION_JSON</code>.
     * </p>
     * 
     * @param cloudFormationOverridePropertyConfiguration
     *        An optional collection of structures that generate CloudFormation parameters to override the existing
     *        resource property values when the resource is exported to a new CloudFormation template.</p>
     *        <p>
     *        Use this field if the <code>ExportFormat</code> field of a <code>StartAssetBundleExportJobRequest</code>
     *        API call is set to <code>CLOUDFORMATION_JSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withCloudFormationOverridePropertyConfiguration(
            AssetBundleCloudFormationOverridePropertyConfiguration cloudFormationOverridePropertyConfiguration) {
        setCloudFormationOverridePropertyConfiguration(cloudFormationOverridePropertyConfiguration);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you set
     * <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource are exported.
     * </p>
     * 
     * @param includePermissions
     *        A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you
     *        set <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource
     *        are exported.
     */

    public void setIncludePermissions(Boolean includePermissions) {
        this.includePermissions = includePermissions;
    }

    /**
     * <p>
     * A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you set
     * <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource are exported.
     * </p>
     * 
     * @return A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you
     *         set <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource
     *         are exported.
     */

    public Boolean getIncludePermissions() {
        return this.includePermissions;
    }

    /**
     * <p>
     * A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you set
     * <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource are exported.
     * </p>
     * 
     * @param includePermissions
     *        A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you
     *        set <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource
     *        are exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withIncludePermissions(Boolean includePermissions) {
        setIncludePermissions(includePermissions);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you set
     * <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource are exported.
     * </p>
     * 
     * @return A Boolean that determines whether all permissions for each resource ARN are exported with the job. If you
     *         set <code>IncludePermissions</code> to <code>TRUE</code>, any permissions associated with each resource
     *         are exported.
     */

    public Boolean isIncludePermissions() {
        return this.includePermissions;
    }

    /**
     * <p>
     * A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     * <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     * </p>
     * 
     * @param includeTags
     *        A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     *        <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     */

    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    /**
     * <p>
     * A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     * <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     * </p>
     * 
     * @return A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     *         <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     */

    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    /**
     * <p>
     * A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     * <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     * </p>
     * 
     * @param includeTags
     *        A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     *        <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withIncludeTags(Boolean includeTags) {
        setIncludeTags(includeTags);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     * <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     * </p>
     * 
     * @return A Boolean that determines whether all tags for each resource ARN are exported with the job. If you set
     *         <code>IncludeTags</code> to <code>TRUE</code>, any tags associated with each resource are exported.
     */

    public Boolean isIncludeTags() {
        return this.includeTags;
    }

    /**
     * <p>
     * An optional parameter that determines which validation strategy to use for the export job. If
     * <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     * enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown as
     * warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     * </p>
     * 
     * @param validationStrategy
     *        An optional parameter that determines which validation strategy to use for the export job. If
     *        <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     *        enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown
     *        as warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     */

    public void setValidationStrategy(AssetBundleExportJobValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    /**
     * <p>
     * An optional parameter that determines which validation strategy to use for the export job. If
     * <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     * enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown as
     * warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     * </p>
     * 
     * @return An optional parameter that determines which validation strategy to use for the export job. If
     *         <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     *         enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown
     *         as warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     */

    public AssetBundleExportJobValidationStrategy getValidationStrategy() {
        return this.validationStrategy;
    }

    /**
     * <p>
     * An optional parameter that determines which validation strategy to use for the export job. If
     * <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     * enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown as
     * warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     * </p>
     * 
     * @param validationStrategy
     *        An optional parameter that determines which validation strategy to use for the export job. If
     *        <code>StrictModeForAllResources</code> is set to <code>TRUE</code>, strict validation for every error is
     *        enforced. If it is set to <code>FALSE</code>, validation is skipped for specific UI errors that are shown
     *        as warnings. The default value for <code>StrictModeForAllResources</code> is <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAssetBundleExportJobRequest withValidationStrategy(AssetBundleExportJobValidationStrategy validationStrategy) {
        setValidationStrategy(validationStrategy);
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
        if (getAssetBundleExportJobId() != null)
            sb.append("AssetBundleExportJobId: ").append(getAssetBundleExportJobId()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getIncludeAllDependencies() != null)
            sb.append("IncludeAllDependencies: ").append(getIncludeAllDependencies()).append(",");
        if (getExportFormat() != null)
            sb.append("ExportFormat: ").append(getExportFormat()).append(",");
        if (getCloudFormationOverridePropertyConfiguration() != null)
            sb.append("CloudFormationOverridePropertyConfiguration: ").append(getCloudFormationOverridePropertyConfiguration()).append(",");
        if (getIncludePermissions() != null)
            sb.append("IncludePermissions: ").append(getIncludePermissions()).append(",");
        if (getIncludeTags() != null)
            sb.append("IncludeTags: ").append(getIncludeTags()).append(",");
        if (getValidationStrategy() != null)
            sb.append("ValidationStrategy: ").append(getValidationStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAssetBundleExportJobRequest == false)
            return false;
        StartAssetBundleExportJobRequest other = (StartAssetBundleExportJobRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssetBundleExportJobId() == null ^ this.getAssetBundleExportJobId() == null)
            return false;
        if (other.getAssetBundleExportJobId() != null && other.getAssetBundleExportJobId().equals(this.getAssetBundleExportJobId()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getIncludeAllDependencies() == null ^ this.getIncludeAllDependencies() == null)
            return false;
        if (other.getIncludeAllDependencies() != null && other.getIncludeAllDependencies().equals(this.getIncludeAllDependencies()) == false)
            return false;
        if (other.getExportFormat() == null ^ this.getExportFormat() == null)
            return false;
        if (other.getExportFormat() != null && other.getExportFormat().equals(this.getExportFormat()) == false)
            return false;
        if (other.getCloudFormationOverridePropertyConfiguration() == null ^ this.getCloudFormationOverridePropertyConfiguration() == null)
            return false;
        if (other.getCloudFormationOverridePropertyConfiguration() != null
                && other.getCloudFormationOverridePropertyConfiguration().equals(this.getCloudFormationOverridePropertyConfiguration()) == false)
            return false;
        if (other.getIncludePermissions() == null ^ this.getIncludePermissions() == null)
            return false;
        if (other.getIncludePermissions() != null && other.getIncludePermissions().equals(this.getIncludePermissions()) == false)
            return false;
        if (other.getIncludeTags() == null ^ this.getIncludeTags() == null)
            return false;
        if (other.getIncludeTags() != null && other.getIncludeTags().equals(this.getIncludeTags()) == false)
            return false;
        if (other.getValidationStrategy() == null ^ this.getValidationStrategy() == null)
            return false;
        if (other.getValidationStrategy() != null && other.getValidationStrategy().equals(this.getValidationStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleExportJobId() == null) ? 0 : getAssetBundleExportJobId().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllDependencies() == null) ? 0 : getIncludeAllDependencies().hashCode());
        hashCode = prime * hashCode + ((getExportFormat() == null) ? 0 : getExportFormat().hashCode());
        hashCode = prime * hashCode
                + ((getCloudFormationOverridePropertyConfiguration() == null) ? 0 : getCloudFormationOverridePropertyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getIncludePermissions() == null) ? 0 : getIncludePermissions().hashCode());
        hashCode = prime * hashCode + ((getIncludeTags() == null) ? 0 : getIncludeTags().hashCode());
        hashCode = prime * hashCode + ((getValidationStrategy() == null) ? 0 : getValidationStrategy().hashCode());
        return hashCode;
    }

    @Override
    public StartAssetBundleExportJobRequest clone() {
        return (StartAssetBundleExportJobRequest) super.clone();
    }

}
