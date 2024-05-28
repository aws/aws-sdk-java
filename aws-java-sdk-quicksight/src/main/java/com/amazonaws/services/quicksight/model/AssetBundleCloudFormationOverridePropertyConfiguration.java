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
 * An optional collection of CloudFormation property configurations that control how the export job is generated.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleCloudFormationOverridePropertyConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleCloudFormationOverridePropertyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An optional list of structures that control how resource IDs are parameterized in the returned CloudFormation
     * template.
     * </p>
     */
    private AssetBundleExportJobResourceIdOverrideConfiguration resourceIdOverrideConfiguration;
    /**
     * <p>
     * An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobVPCConnectionOverrideProperties> vPCConnections;
    /**
     * <p>
     * An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobRefreshScheduleOverrideProperties> refreshSchedules;
    /**
     * <p>
     * An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobDataSourceOverrideProperties> dataSources;
    /**
     * <p>
     * An optional list of structures that control how <code>DataSet</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobDataSetOverrideProperties> dataSets;
    /**
     * <p>
     * An optional list of structures that control how <code>Theme</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobThemeOverrideProperties> themes;
    /**
     * <p>
     * An optional list of structures that control how <code>Analysis</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobAnalysisOverrideProperties> analyses;
    /**
     * <p>
     * An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     */
    private java.util.List<AssetBundleExportJobDashboardOverrideProperties> dashboards;

    /**
     * <p>
     * An optional list of structures that control how resource IDs are parameterized in the returned CloudFormation
     * template.
     * </p>
     * 
     * @param resourceIdOverrideConfiguration
     *        An optional list of structures that control how resource IDs are parameterized in the returned
     *        CloudFormation template.
     */

    public void setResourceIdOverrideConfiguration(AssetBundleExportJobResourceIdOverrideConfiguration resourceIdOverrideConfiguration) {
        this.resourceIdOverrideConfiguration = resourceIdOverrideConfiguration;
    }

    /**
     * <p>
     * An optional list of structures that control how resource IDs are parameterized in the returned CloudFormation
     * template.
     * </p>
     * 
     * @return An optional list of structures that control how resource IDs are parameterized in the returned
     *         CloudFormation template.
     */

    public AssetBundleExportJobResourceIdOverrideConfiguration getResourceIdOverrideConfiguration() {
        return this.resourceIdOverrideConfiguration;
    }

    /**
     * <p>
     * An optional list of structures that control how resource IDs are parameterized in the returned CloudFormation
     * template.
     * </p>
     * 
     * @param resourceIdOverrideConfiguration
     *        An optional list of structures that control how resource IDs are parameterized in the returned
     *        CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withResourceIdOverrideConfiguration(
            AssetBundleExportJobResourceIdOverrideConfiguration resourceIdOverrideConfiguration) {
        setResourceIdOverrideConfiguration(resourceIdOverrideConfiguration);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in
     *         the returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobVPCConnectionOverrideProperties> getVPCConnections() {
        return vPCConnections;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param vPCConnections
     *        An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in
     *        the returned CloudFormation template.
     */

    public void setVPCConnections(java.util.Collection<AssetBundleExportJobVPCConnectionOverrideProperties> vPCConnections) {
        if (vPCConnections == null) {
            this.vPCConnections = null;
            return;
        }

        this.vPCConnections = new java.util.ArrayList<AssetBundleExportJobVPCConnectionOverrideProperties>(vPCConnections);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVPCConnections(java.util.Collection)} or {@link #withVPCConnections(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vPCConnections
     *        An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in
     *        the returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withVPCConnections(AssetBundleExportJobVPCConnectionOverrideProperties... vPCConnections) {
        if (this.vPCConnections == null) {
            setVPCConnections(new java.util.ArrayList<AssetBundleExportJobVPCConnectionOverrideProperties>(vPCConnections.length));
        }
        for (AssetBundleExportJobVPCConnectionOverrideProperties ele : vPCConnections) {
            this.vPCConnections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param vPCConnections
     *        An optional list of structures that control how <code>VPCConnection</code> resources are parameterized in
     *        the returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withVPCConnections(
            java.util.Collection<AssetBundleExportJobVPCConnectionOverrideProperties> vPCConnections) {
        setVPCConnections(vPCConnections);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized
     *         in the returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobRefreshScheduleOverrideProperties> getRefreshSchedules() {
        return refreshSchedules;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param refreshSchedules
     *        An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized
     *        in the returned CloudFormation template.
     */

    public void setRefreshSchedules(java.util.Collection<AssetBundleExportJobRefreshScheduleOverrideProperties> refreshSchedules) {
        if (refreshSchedules == null) {
            this.refreshSchedules = null;
            return;
        }

        this.refreshSchedules = new java.util.ArrayList<AssetBundleExportJobRefreshScheduleOverrideProperties>(refreshSchedules);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRefreshSchedules(java.util.Collection)} or {@link #withRefreshSchedules(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param refreshSchedules
     *        An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized
     *        in the returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withRefreshSchedules(
            AssetBundleExportJobRefreshScheduleOverrideProperties... refreshSchedules) {
        if (this.refreshSchedules == null) {
            setRefreshSchedules(new java.util.ArrayList<AssetBundleExportJobRefreshScheduleOverrideProperties>(refreshSchedules.length));
        }
        for (AssetBundleExportJobRefreshScheduleOverrideProperties ele : refreshSchedules) {
            this.refreshSchedules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param refreshSchedules
     *        An optional list of structures that control how <code>RefreshSchedule</code> resources are parameterized
     *        in the returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withRefreshSchedules(
            java.util.Collection<AssetBundleExportJobRefreshScheduleOverrideProperties> refreshSchedules) {
        setRefreshSchedules(refreshSchedules);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>DataSource</code> resources are parameterized in
     *         the returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobDataSourceOverrideProperties> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param dataSources
     *        An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     *        returned CloudFormation template.
     */

    public void setDataSources(java.util.Collection<AssetBundleExportJobDataSourceOverrideProperties> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<AssetBundleExportJobDataSourceOverrideProperties>(dataSources);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withDataSources(AssetBundleExportJobDataSourceOverrideProperties... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<AssetBundleExportJobDataSourceOverrideProperties>(dataSources.length));
        }
        for (AssetBundleExportJobDataSourceOverrideProperties ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param dataSources
     *        An optional list of structures that control how <code>DataSource</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withDataSources(
            java.util.Collection<AssetBundleExportJobDataSourceOverrideProperties> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSet</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>DataSet</code> resources are parameterized in the
     *         returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobDataSetOverrideProperties> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSet</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @param dataSets
     *        An optional list of structures that control how <code>DataSet</code> resources are parameterized in the
     *        returned CloudFormation template.
     */

    public void setDataSets(java.util.Collection<AssetBundleExportJobDataSetOverrideProperties> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<AssetBundleExportJobDataSetOverrideProperties>(dataSets);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSet</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSets(java.util.Collection)} or {@link #withDataSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataSets
     *        An optional list of structures that control how <code>DataSet</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withDataSets(AssetBundleExportJobDataSetOverrideProperties... dataSets) {
        if (this.dataSets == null) {
            setDataSets(new java.util.ArrayList<AssetBundleExportJobDataSetOverrideProperties>(dataSets.length));
        }
        for (AssetBundleExportJobDataSetOverrideProperties ele : dataSets) {
            this.dataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>DataSet</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @param dataSets
     *        An optional list of structures that control how <code>DataSet</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withDataSets(java.util.Collection<AssetBundleExportJobDataSetOverrideProperties> dataSets) {
        setDataSets(dataSets);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Theme</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>Theme</code> resources are parameterized in the
     *         returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobThemeOverrideProperties> getThemes() {
        return themes;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Theme</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @param themes
     *        An optional list of structures that control how <code>Theme</code> resources are parameterized in the
     *        returned CloudFormation template.
     */

    public void setThemes(java.util.Collection<AssetBundleExportJobThemeOverrideProperties> themes) {
        if (themes == null) {
            this.themes = null;
            return;
        }

        this.themes = new java.util.ArrayList<AssetBundleExportJobThemeOverrideProperties>(themes);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Theme</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThemes(java.util.Collection)} or {@link #withThemes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param themes
     *        An optional list of structures that control how <code>Theme</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withThemes(AssetBundleExportJobThemeOverrideProperties... themes) {
        if (this.themes == null) {
            setThemes(new java.util.ArrayList<AssetBundleExportJobThemeOverrideProperties>(themes.length));
        }
        for (AssetBundleExportJobThemeOverrideProperties ele : themes) {
            this.themes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Theme</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @param themes
     *        An optional list of structures that control how <code>Theme</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withThemes(java.util.Collection<AssetBundleExportJobThemeOverrideProperties> themes) {
        setThemes(themes);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Analysis</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>Analysis</code> resources are parameterized in the
     *         returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobAnalysisOverrideProperties> getAnalyses() {
        return analyses;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Analysis</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @param analyses
     *        An optional list of structures that control how <code>Analysis</code> resources are parameterized in the
     *        returned CloudFormation template.
     */

    public void setAnalyses(java.util.Collection<AssetBundleExportJobAnalysisOverrideProperties> analyses) {
        if (analyses == null) {
            this.analyses = null;
            return;
        }

        this.analyses = new java.util.ArrayList<AssetBundleExportJobAnalysisOverrideProperties>(analyses);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Analysis</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalyses(java.util.Collection)} or {@link #withAnalyses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param analyses
     *        An optional list of structures that control how <code>Analysis</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withAnalyses(AssetBundleExportJobAnalysisOverrideProperties... analyses) {
        if (this.analyses == null) {
            setAnalyses(new java.util.ArrayList<AssetBundleExportJobAnalysisOverrideProperties>(analyses.length));
        }
        for (AssetBundleExportJobAnalysisOverrideProperties ele : analyses) {
            this.analyses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Analysis</code> resources are parameterized in the returned
     * CloudFormation template.
     * </p>
     * 
     * @param analyses
     *        An optional list of structures that control how <code>Analysis</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withAnalyses(java.util.Collection<AssetBundleExportJobAnalysisOverrideProperties> analyses) {
        setAnalyses(analyses);
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @return An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     *         returned CloudFormation template.
     */

    public java.util.List<AssetBundleExportJobDashboardOverrideProperties> getDashboards() {
        return dashboards;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param dashboards
     *        An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     *        returned CloudFormation template.
     */

    public void setDashboards(java.util.Collection<AssetBundleExportJobDashboardOverrideProperties> dashboards) {
        if (dashboards == null) {
            this.dashboards = null;
            return;
        }

        this.dashboards = new java.util.ArrayList<AssetBundleExportJobDashboardOverrideProperties>(dashboards);
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboards(java.util.Collection)} or {@link #withDashboards(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dashboards
     *        An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withDashboards(AssetBundleExportJobDashboardOverrideProperties... dashboards) {
        if (this.dashboards == null) {
            setDashboards(new java.util.ArrayList<AssetBundleExportJobDashboardOverrideProperties>(dashboards.length));
        }
        for (AssetBundleExportJobDashboardOverrideProperties ele : dashboards) {
            this.dashboards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     * returned CloudFormation template.
     * </p>
     * 
     * @param dashboards
     *        An optional list of structures that control how <code>Dashboard</code> resources are parameterized in the
     *        returned CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration withDashboards(
            java.util.Collection<AssetBundleExportJobDashboardOverrideProperties> dashboards) {
        setDashboards(dashboards);
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
        if (getResourceIdOverrideConfiguration() != null)
            sb.append("ResourceIdOverrideConfiguration: ").append(getResourceIdOverrideConfiguration()).append(",");
        if (getVPCConnections() != null)
            sb.append("VPCConnections: ").append(getVPCConnections()).append(",");
        if (getRefreshSchedules() != null)
            sb.append("RefreshSchedules: ").append(getRefreshSchedules()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getDataSets() != null)
            sb.append("DataSets: ").append(getDataSets()).append(",");
        if (getThemes() != null)
            sb.append("Themes: ").append(getThemes()).append(",");
        if (getAnalyses() != null)
            sb.append("Analyses: ").append(getAnalyses()).append(",");
        if (getDashboards() != null)
            sb.append("Dashboards: ").append(getDashboards());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleCloudFormationOverridePropertyConfiguration == false)
            return false;
        AssetBundleCloudFormationOverridePropertyConfiguration other = (AssetBundleCloudFormationOverridePropertyConfiguration) obj;
        if (other.getResourceIdOverrideConfiguration() == null ^ this.getResourceIdOverrideConfiguration() == null)
            return false;
        if (other.getResourceIdOverrideConfiguration() != null
                && other.getResourceIdOverrideConfiguration().equals(this.getResourceIdOverrideConfiguration()) == false)
            return false;
        if (other.getVPCConnections() == null ^ this.getVPCConnections() == null)
            return false;
        if (other.getVPCConnections() != null && other.getVPCConnections().equals(this.getVPCConnections()) == false)
            return false;
        if (other.getRefreshSchedules() == null ^ this.getRefreshSchedules() == null)
            return false;
        if (other.getRefreshSchedules() != null && other.getRefreshSchedules().equals(this.getRefreshSchedules()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getDataSets() == null ^ this.getDataSets() == null)
            return false;
        if (other.getDataSets() != null && other.getDataSets().equals(this.getDataSets()) == false)
            return false;
        if (other.getThemes() == null ^ this.getThemes() == null)
            return false;
        if (other.getThemes() != null && other.getThemes().equals(this.getThemes()) == false)
            return false;
        if (other.getAnalyses() == null ^ this.getAnalyses() == null)
            return false;
        if (other.getAnalyses() != null && other.getAnalyses().equals(this.getAnalyses()) == false)
            return false;
        if (other.getDashboards() == null ^ this.getDashboards() == null)
            return false;
        if (other.getDashboards() != null && other.getDashboards().equals(this.getDashboards()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceIdOverrideConfiguration() == null) ? 0 : getResourceIdOverrideConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVPCConnections() == null) ? 0 : getVPCConnections().hashCode());
        hashCode = prime * hashCode + ((getRefreshSchedules() == null) ? 0 : getRefreshSchedules().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        hashCode = prime * hashCode + ((getThemes() == null) ? 0 : getThemes().hashCode());
        hashCode = prime * hashCode + ((getAnalyses() == null) ? 0 : getAnalyses().hashCode());
        hashCode = prime * hashCode + ((getDashboards() == null) ? 0 : getDashboards().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleCloudFormationOverridePropertyConfiguration clone() {
        try {
            return (AssetBundleCloudFormationOverridePropertyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleCloudFormationOverridePropertyConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
