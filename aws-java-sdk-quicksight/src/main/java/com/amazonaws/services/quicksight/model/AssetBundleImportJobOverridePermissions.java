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
 * A structure that contains the override permission configurations that modify the permissions for specified resources
 * before the resource is imported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobOverridePermissions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobOverridePermissions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     */
    private java.util.List<AssetBundleImportJobDataSourceOverridePermissions> dataSources;
    /**
     * <p>
     * A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     */
    private java.util.List<AssetBundleImportJobDataSetOverridePermissions> dataSets;
    /**
     * <p>
     * A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle that is
     * imported.
     * </p>
     */
    private java.util.List<AssetBundleImportJobThemeOverridePermissions> themes;
    /**
     * <p>
     * A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     */
    private java.util.List<AssetBundleImportJobAnalysisOverridePermissions> analyses;
    /**
     * <p>
     * A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     */
    private java.util.List<AssetBundleImportJobDashboardOverridePermissions> dashboards;

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * 
     * @return A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset
     *         bundle that is imported.
     */

    public java.util.List<AssetBundleImportJobDataSourceOverridePermissions> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * 
     * @param dataSources
     *        A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset
     *        bundle that is imported.
     */

    public void setDataSources(java.util.Collection<AssetBundleImportJobDataSourceOverridePermissions> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<AssetBundleImportJobDataSourceOverridePermissions>(dataSources);
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withDataSources(AssetBundleImportJobDataSourceOverridePermissions... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<AssetBundleImportJobDataSourceOverridePermissions>(dataSources.length));
        }
        for (AssetBundleImportJobDataSourceOverridePermissions ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * 
     * @param dataSources
     *        A list of permissions overrides for any <code>DataSource</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withDataSources(java.util.Collection<AssetBundleImportJobDataSourceOverridePermissions> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * 
     * @return A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset
     *         bundle that is imported.
     */

    public java.util.List<AssetBundleImportJobDataSetOverridePermissions> getDataSets() {
        return dataSets;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * 
     * @param dataSets
     *        A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset
     *        bundle that is imported.
     */

    public void setDataSets(java.util.Collection<AssetBundleImportJobDataSetOverridePermissions> dataSets) {
        if (dataSets == null) {
            this.dataSets = null;
            return;
        }

        this.dataSets = new java.util.ArrayList<AssetBundleImportJobDataSetOverridePermissions>(dataSets);
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSets(java.util.Collection)} or {@link #withDataSets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dataSets
     *        A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withDataSets(AssetBundleImportJobDataSetOverridePermissions... dataSets) {
        if (this.dataSets == null) {
            setDataSets(new java.util.ArrayList<AssetBundleImportJobDataSetOverridePermissions>(dataSets.length));
        }
        for (AssetBundleImportJobDataSetOverridePermissions ele : dataSets) {
            this.dataSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * 
     * @param dataSets
     *        A list of permissions overrides for any <code>DataSet</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withDataSets(java.util.Collection<AssetBundleImportJobDataSetOverridePermissions> dataSets) {
        setDataSets(dataSets);
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle that is
     * imported.
     * </p>
     * 
     * @return A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle
     *         that is imported.
     */

    public java.util.List<AssetBundleImportJobThemeOverridePermissions> getThemes() {
        return themes;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle that is
     * imported.
     * </p>
     * 
     * @param themes
     *        A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle
     *        that is imported.
     */

    public void setThemes(java.util.Collection<AssetBundleImportJobThemeOverridePermissions> themes) {
        if (themes == null) {
            this.themes = null;
            return;
        }

        this.themes = new java.util.ArrayList<AssetBundleImportJobThemeOverridePermissions>(themes);
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle that is
     * imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThemes(java.util.Collection)} or {@link #withThemes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param themes
     *        A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle
     *        that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withThemes(AssetBundleImportJobThemeOverridePermissions... themes) {
        if (this.themes == null) {
            setThemes(new java.util.ArrayList<AssetBundleImportJobThemeOverridePermissions>(themes.length));
        }
        for (AssetBundleImportJobThemeOverridePermissions ele : themes) {
            this.themes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle that is
     * imported.
     * </p>
     * 
     * @param themes
     *        A list of permissions overrides for any <code>Theme</code> resources that are present in the asset bundle
     *        that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withThemes(java.util.Collection<AssetBundleImportJobThemeOverridePermissions> themes) {
        setThemes(themes);
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * 
     * @return A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset
     *         bundle that is imported.
     */

    public java.util.List<AssetBundleImportJobAnalysisOverridePermissions> getAnalyses() {
        return analyses;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * 
     * @param analyses
     *        A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset
     *        bundle that is imported.
     */

    public void setAnalyses(java.util.Collection<AssetBundleImportJobAnalysisOverridePermissions> analyses) {
        if (analyses == null) {
            this.analyses = null;
            return;
        }

        this.analyses = new java.util.ArrayList<AssetBundleImportJobAnalysisOverridePermissions>(analyses);
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalyses(java.util.Collection)} or {@link #withAnalyses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param analyses
     *        A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withAnalyses(AssetBundleImportJobAnalysisOverridePermissions... analyses) {
        if (this.analyses == null) {
            setAnalyses(new java.util.ArrayList<AssetBundleImportJobAnalysisOverridePermissions>(analyses.length));
        }
        for (AssetBundleImportJobAnalysisOverridePermissions ele : analyses) {
            this.analyses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset bundle that
     * is imported.
     * </p>
     * 
     * @param analyses
     *        A list of permissions overrides for any <code>Analysis</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withAnalyses(java.util.Collection<AssetBundleImportJobAnalysisOverridePermissions> analyses) {
        setAnalyses(analyses);
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * 
     * @return A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset
     *         bundle that is imported.
     */

    public java.util.List<AssetBundleImportJobDashboardOverridePermissions> getDashboards() {
        return dashboards;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * 
     * @param dashboards
     *        A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset
     *        bundle that is imported.
     */

    public void setDashboards(java.util.Collection<AssetBundleImportJobDashboardOverridePermissions> dashboards) {
        if (dashboards == null) {
            this.dashboards = null;
            return;
        }

        this.dashboards = new java.util.ArrayList<AssetBundleImportJobDashboardOverridePermissions>(dashboards);
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboards(java.util.Collection)} or {@link #withDashboards(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dashboards
     *        A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withDashboards(AssetBundleImportJobDashboardOverridePermissions... dashboards) {
        if (this.dashboards == null) {
            setDashboards(new java.util.ArrayList<AssetBundleImportJobDashboardOverridePermissions>(dashboards.length));
        }
        for (AssetBundleImportJobDashboardOverridePermissions ele : dashboards) {
            this.dashboards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset bundle
     * that is imported.
     * </p>
     * 
     * @param dashboards
     *        A list of permissions overrides for any <code>Dashboard</code> resources that are present in the asset
     *        bundle that is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobOverridePermissions withDashboards(java.util.Collection<AssetBundleImportJobDashboardOverridePermissions> dashboards) {
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

        if (obj instanceof AssetBundleImportJobOverridePermissions == false)
            return false;
        AssetBundleImportJobOverridePermissions other = (AssetBundleImportJobOverridePermissions) obj;
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

        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getDataSets() == null) ? 0 : getDataSets().hashCode());
        hashCode = prime * hashCode + ((getThemes() == null) ? 0 : getThemes().hashCode());
        hashCode = prime * hashCode + ((getAnalyses() == null) ? 0 : getAnalyses().hashCode());
        hashCode = prime * hashCode + ((getDashboards() == null) ? 0 : getDashboards().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobOverridePermissions clone() {
        try {
            return (AssetBundleImportJobOverridePermissions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobOverridePermissionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
