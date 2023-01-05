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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Request body for UpdateConnectivity.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateConnectivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectivityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * Information about the broker access configuration.
     * </p>
     */
    private ConnectivityInfo connectivityInfo;
    /**
     * <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster
     * to find its version. When this update operation is successful, it generates a new cluster version.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the configuration.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) of the configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * Information about the broker access configuration.
     * </p>
     * 
     * @param connectivityInfo
     *        <p>
     *        Information about the broker access configuration.
     *        </p>
     */

    public void setConnectivityInfo(ConnectivityInfo connectivityInfo) {
        this.connectivityInfo = connectivityInfo;
    }

    /**
     * <p>
     * Information about the broker access configuration.
     * </p>
     * 
     * @return <p>
     *         Information about the broker access configuration.
     *         </p>
     */

    public ConnectivityInfo getConnectivityInfo() {
        return this.connectivityInfo;
    }

    /**
     * <p>
     * Information about the broker access configuration.
     * </p>
     * 
     * @param connectivityInfo
     *        <p>
     *        Information about the broker access configuration.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityRequest withConnectivityInfo(ConnectivityInfo connectivityInfo) {
        setConnectivityInfo(connectivityInfo);
        return this;
    }

    /**
     * <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster
     * to find its version. When this update operation is successful, it generates a new cluster version.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK
     *        cluster to find its version. When this update operation is successful, it generates a new cluster version.
     *        </p>
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster
     * to find its version. When this update operation is successful, it generates a new cluster version.
     * </p>
     * 
     * @return <p>
     *         The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK
     *         cluster to find its version. When this update operation is successful, it generates a new cluster
     *         version.
     *         </p>
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster
     * to find its version. When this update operation is successful, it generates a new cluster version.
     * </p>
     * 
     * @param currentVersion
     *        <p>
     *        The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK
     *        cluster to find its version. When this update operation is successful, it generates a new cluster version.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getConnectivityInfo() != null)
            sb.append("ConnectivityInfo: ").append(getConnectivityInfo()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectivityRequest == false)
            return false;
        UpdateConnectivityRequest other = (UpdateConnectivityRequest) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getConnectivityInfo() == null ^ this.getConnectivityInfo() == null)
            return false;
        if (other.getConnectivityInfo() != null && other.getConnectivityInfo().equals(this.getConnectivityInfo()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getConnectivityInfo() == null) ? 0 : getConnectivityInfo().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectivityRequest clone() {
        return (UpdateConnectivityRequest) super.clone();
    }

}
