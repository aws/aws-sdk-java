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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/UpdateKxClusterDatabases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKxClusterDatabasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of a kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A unique name for the cluster that you want to modify.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The structure of databases mounted on the cluster.
     * </p>
     */
    private java.util.List<KxDatabaseConfiguration> databases;
    /**
     * <p>
     * The configuration that allows you to choose how you want to update the databases on a cluster.
     * </p>
     */
    private KxDeploymentConfiguration deploymentConfiguration;

    /**
     * <p>
     * The unique identifier of a kdb environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of a kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The unique identifier of a kdb environment.
     * </p>
     * 
     * @return The unique identifier of a kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The unique identifier of a kdb environment.
     * </p>
     * 
     * @param environmentId
     *        The unique identifier of a kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterDatabasesRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A unique name for the cluster that you want to modify.
     * </p>
     * 
     * @param clusterName
     *        A unique name for the cluster that you want to modify.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * A unique name for the cluster that you want to modify.
     * </p>
     * 
     * @return A unique name for the cluster that you want to modify.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * A unique name for the cluster that you want to modify.
     * </p>
     * 
     * @param clusterName
     *        A unique name for the cluster that you want to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterDatabasesRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterDatabasesRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The structure of databases mounted on the cluster.
     * </p>
     * 
     * @return The structure of databases mounted on the cluster.
     */

    public java.util.List<KxDatabaseConfiguration> getDatabases() {
        return databases;
    }

    /**
     * <p>
     * The structure of databases mounted on the cluster.
     * </p>
     * 
     * @param databases
     *        The structure of databases mounted on the cluster.
     */

    public void setDatabases(java.util.Collection<KxDatabaseConfiguration> databases) {
        if (databases == null) {
            this.databases = null;
            return;
        }

        this.databases = new java.util.ArrayList<KxDatabaseConfiguration>(databases);
    }

    /**
     * <p>
     * The structure of databases mounted on the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabases(java.util.Collection)} or {@link #withDatabases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databases
     *        The structure of databases mounted on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterDatabasesRequest withDatabases(KxDatabaseConfiguration... databases) {
        if (this.databases == null) {
            setDatabases(new java.util.ArrayList<KxDatabaseConfiguration>(databases.length));
        }
        for (KxDatabaseConfiguration ele : databases) {
            this.databases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The structure of databases mounted on the cluster.
     * </p>
     * 
     * @param databases
     *        The structure of databases mounted on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterDatabasesRequest withDatabases(java.util.Collection<KxDatabaseConfiguration> databases) {
        setDatabases(databases);
        return this;
    }

    /**
     * <p>
     * The configuration that allows you to choose how you want to update the databases on a cluster.
     * </p>
     * 
     * @param deploymentConfiguration
     *        The configuration that allows you to choose how you want to update the databases on a cluster.
     */

    public void setDeploymentConfiguration(KxDeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * The configuration that allows you to choose how you want to update the databases on a cluster.
     * </p>
     * 
     * @return The configuration that allows you to choose how you want to update the databases on a cluster.
     */

    public KxDeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * The configuration that allows you to choose how you want to update the databases on a cluster.
     * </p>
     * 
     * @param deploymentConfiguration
     *        The configuration that allows you to choose how you want to update the databases on a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKxClusterDatabasesRequest withDeploymentConfiguration(KxDeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDatabases() != null)
            sb.append("Databases: ").append(getDatabases()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKxClusterDatabasesRequest == false)
            return false;
        UpdateKxClusterDatabasesRequest other = (UpdateKxClusterDatabasesRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDatabases() == null ^ this.getDatabases() == null)
            return false;
        if (other.getDatabases() != null && other.getDatabases().equals(this.getDatabases()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDatabases() == null) ? 0 : getDatabases().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKxClusterDatabasesRequest clone() {
        return (UpdateKxClusterDatabasesRequest) super.clone();
    }

}
