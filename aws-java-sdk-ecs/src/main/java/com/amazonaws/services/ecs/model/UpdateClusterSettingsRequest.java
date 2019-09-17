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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateClusterSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a
     * cluster. If this value is specified, it will override the <code>containerInsights</code> value set with
     * <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSetting> settings;

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     * 
     * @param cluster
     *        The name of the cluster to modify the settings for.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     * 
     * @return The name of the cluster to modify the settings for.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     * 
     * @param cluster
     *        The name of the cluster to modify the settings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterSettingsRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a
     * cluster. If this value is specified, it will override the <code>containerInsights</code> value set with
     * <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * 
     * @return The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container
     *         Insights for a cluster. If this value is specified, it will override the <code>containerInsights</code>
     *         value set with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     */

    public java.util.List<ClusterSetting> getSettings() {
        if (settings == null) {
            settings = new com.amazonaws.internal.SdkInternalList<ClusterSetting>();
        }
        return settings;
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a
     * cluster. If this value is specified, it will override the <code>containerInsights</code> value set with
     * <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * 
     * @param settings
     *        The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container
     *        Insights for a cluster. If this value is specified, it will override the <code>containerInsights</code>
     *        value set with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     */

    public void setSettings(java.util.Collection<ClusterSetting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new com.amazonaws.internal.SdkInternalList<ClusterSetting>(settings);
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a
     * cluster. If this value is specified, it will override the <code>containerInsights</code> value set with
     * <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container
     *        Insights for a cluster. If this value is specified, it will override the <code>containerInsights</code>
     *        value set with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterSettingsRequest withSettings(ClusterSetting... settings) {
        if (this.settings == null) {
            setSettings(new com.amazonaws.internal.SdkInternalList<ClusterSetting>(settings.length));
        }
        for (ClusterSetting ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a
     * cluster. If this value is specified, it will override the <code>containerInsights</code> value set with
     * <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * </p>
     * 
     * @param settings
     *        The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container
     *        Insights for a cluster. If this value is specified, it will override the <code>containerInsights</code>
     *        value set with <a>PutAccountSetting</a> or <a>PutAccountSettingDefault</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterSettingsRequest withSettings(java.util.Collection<ClusterSetting> settings) {
        setSettings(settings);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterSettingsRequest == false)
            return false;
        UpdateClusterSettingsRequest other = (UpdateClusterSettingsRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterSettingsRequest clone() {
        return (UpdateClusterSettingsRequest) super.clone();
    }

}
