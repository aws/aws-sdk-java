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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/UpdateSecurity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Includes all client authentication related information.
     * </p>
     */
    private ClientAuthentication clientAuthentication;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The version of the MSK cluster to update. Cluster versions aren't simple numbers. You can describe an MSK cluster
     * to find its version. When this update operation is successful, it generates a new cluster version.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     */
    private EncryptionInfo encryptionInfo;

    /**
     * <p>
     * Includes all client authentication related information.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication related information.
     *        </p>
     */

    public void setClientAuthentication(ClientAuthentication clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication related information.
     * </p>
     * 
     * @return <p>
     *         Includes all client authentication related information.
     *         </p>
     */

    public ClientAuthentication getClientAuthentication() {
        return this.clientAuthentication;
    }

    /**
     * <p>
     * Includes all client authentication related information.
     * </p>
     * 
     * @param clientAuthentication
     *        <p>
     *        Includes all client authentication related information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityRequest withClientAuthentication(ClientAuthentication clientAuthentication) {
        setClientAuthentication(clientAuthentication);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *         </p>
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn
     *        <p>
     *        The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
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

    public UpdateSecurityRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @param encryptionInfo
     *        <p>
     *        Includes all encryption-related information.
     *        </p>
     */

    public void setEncryptionInfo(EncryptionInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @return <p>
     *         Includes all encryption-related information.
     *         </p>
     */

    public EncryptionInfo getEncryptionInfo() {
        return this.encryptionInfo;
    }

    /**
     * <p>
     * Includes all encryption-related information.
     * </p>
     * 
     * @param encryptionInfo
     *        <p>
     *        Includes all encryption-related information.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSecurityRequest withEncryptionInfo(EncryptionInfo encryptionInfo) {
        setEncryptionInfo(encryptionInfo);
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
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: ").append(getEncryptionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSecurityRequest == false)
            return false;
        UpdateSecurityRequest other = (UpdateSecurityRequest) obj;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getEncryptionInfo() == null ^ this.getEncryptionInfo() == null)
            return false;
        if (other.getEncryptionInfo() != null && other.getEncryptionInfo().equals(this.getEncryptionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSecurityRequest clone() {
        return (UpdateSecurityRequest) super.clone();
    }

}
