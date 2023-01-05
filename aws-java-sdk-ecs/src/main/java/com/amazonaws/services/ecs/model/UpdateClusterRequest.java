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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/UpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cluster to modify the settings for.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The cluster settings for your cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSetting> settings;
    /**
     * <p>
     * The execute command configuration for the cluster.
     * </p>
     */
    private ClusterConfiguration configuration;
    /**
     * <p>
     * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace,
     * any new services with Service Connect turned on that are created in the cluster are added as client services in
     * the namespace. This setting only applies to new services that set the <code>enabled</code> parameter to
     * <code>true</code> in the <code>ServiceConnectConfiguration</code>. You can set the namespace of each service
     * individually in the <code>ServiceConnectConfiguration</code> to override this default parameter.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private ClusterServiceConnectDefaultsRequest serviceConnectDefaults;

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

    public UpdateClusterRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The cluster settings for your cluster.
     * </p>
     * 
     * @return The cluster settings for your cluster.
     */

    public java.util.List<ClusterSetting> getSettings() {
        if (settings == null) {
            settings = new com.amazonaws.internal.SdkInternalList<ClusterSetting>();
        }
        return settings;
    }

    /**
     * <p>
     * The cluster settings for your cluster.
     * </p>
     * 
     * @param settings
     *        The cluster settings for your cluster.
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
     * The cluster settings for your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        The cluster settings for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSettings(ClusterSetting... settings) {
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
     * The cluster settings for your cluster.
     * </p>
     * 
     * @param settings
     *        The cluster settings for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSettings(java.util.Collection<ClusterSetting> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The execute command configuration for the cluster.
     * </p>
     * 
     * @param configuration
     *        The execute command configuration for the cluster.
     */

    public void setConfiguration(ClusterConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The execute command configuration for the cluster.
     * </p>
     * 
     * @return The execute command configuration for the cluster.
     */

    public ClusterConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The execute command configuration for the cluster.
     * </p>
     * 
     * @param configuration
     *        The execute command configuration for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withConfiguration(ClusterConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace,
     * any new services with Service Connect turned on that are created in the cluster are added as client services in
     * the namespace. This setting only applies to new services that set the <code>enabled</code> parameter to
     * <code>true</code> in the <code>ServiceConnectConfiguration</code>. You can set the namespace of each service
     * individually in the <code>ServiceConnectConfiguration</code> to override this default parameter.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param serviceConnectDefaults
     *        Use this parameter to set a default Service Connect namespace. After you set a default Service Connect
     *        namespace, any new services with Service Connect turned on that are created in the cluster are added as
     *        client services in the namespace. This setting only applies to new services that set the
     *        <code>enabled</code> parameter to <code>true</code> in the <code>ServiceConnectConfiguration</code>. You
     *        can set the namespace of each service individually in the <code>ServiceConnectConfiguration</code> to
     *        override this default parameter.</p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setServiceConnectDefaults(ClusterServiceConnectDefaultsRequest serviceConnectDefaults) {
        this.serviceConnectDefaults = serviceConnectDefaults;
    }

    /**
     * <p>
     * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace,
     * any new services with Service Connect turned on that are created in the cluster are added as client services in
     * the namespace. This setting only applies to new services that set the <code>enabled</code> parameter to
     * <code>true</code> in the <code>ServiceConnectConfiguration</code>. You can set the namespace of each service
     * individually in the <code>ServiceConnectConfiguration</code> to override this default parameter.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Use this parameter to set a default Service Connect namespace. After you set a default Service Connect
     *         namespace, any new services with Service Connect turned on that are created in the cluster are added as
     *         client services in the namespace. This setting only applies to new services that set the
     *         <code>enabled</code> parameter to <code>true</code> in the <code>ServiceConnectConfiguration</code>. You
     *         can set the namespace of each service individually in the <code>ServiceConnectConfiguration</code> to
     *         override this default parameter.</p>
     *         <p>
     *         Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *         connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *         container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS
     *         services create are supported with Service Connect. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *         Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public ClusterServiceConnectDefaultsRequest getServiceConnectDefaults() {
        return this.serviceConnectDefaults;
    }

    /**
     * <p>
     * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace,
     * any new services with Service Connect turned on that are created in the cluster are added as client services in
     * the namespace. This setting only applies to new services that set the <code>enabled</code> parameter to
     * <code>true</code> in the <code>ServiceConnectConfiguration</code>. You can set the namespace of each service
     * individually in the <code>ServiceConnectConfiguration</code> to override this default parameter.
     * </p>
     * <p>
     * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
     * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that
     * collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported
     * with Service Connect. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param serviceConnectDefaults
     *        Use this parameter to set a default Service Connect namespace. After you set a default Service Connect
     *        namespace, any new services with Service Connect turned on that are created in the cluster are added as
     *        client services in the namespace. This setting only applies to new services that set the
     *        <code>enabled</code> parameter to <code>true</code> in the <code>ServiceConnectConfiguration</code>. You
     *        can set the namespace of each service individually in the <code>ServiceConnectConfiguration</code> to
     *        override this default parameter.</p>
     *        <p>
     *        Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can
     *        connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy
     *        container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services
     *        create are supported with Service Connect. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withServiceConnectDefaults(ClusterServiceConnectDefaultsRequest serviceConnectDefaults) {
        setServiceConnectDefaults(serviceConnectDefaults);
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
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getServiceConnectDefaults() != null)
            sb.append("ServiceConnectDefaults: ").append(getServiceConnectDefaults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterRequest == false)
            return false;
        UpdateClusterRequest other = (UpdateClusterRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getServiceConnectDefaults() == null ^ this.getServiceConnectDefaults() == null)
            return false;
        if (other.getServiceConnectDefaults() != null && other.getServiceConnectDefaults().equals(this.getServiceConnectDefaults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getServiceConnectDefaults() == null) ? 0 : getServiceConnectDefaults().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterRequest clone() {
        return (UpdateClusterRequest) super.clone();
    }

}
