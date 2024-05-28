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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provide details about an Amazon Managed Streaming for Apache Kafka (Amazon MSK) cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsMskClusterClusterInfoDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsMskClusterClusterInfoDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether you
     * want Amazon MSK to encrypt your data in transit.
     * </p>
     */
    private AwsMskClusterClusterInfoEncryptionInfoDetails encryptionInfo;
    /**
     * <p>
     * The current version of the cluster.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     */
    private Integer numberOfBrokerNodes;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * Provides information for different modes of client authentication.
     * </p>
     */
    private AwsMskClusterClusterInfoClientAuthenticationDetails clientAuthentication;
    /**
     * <p>
     * Specifies the level of monitoring for the cluster.
     * </p>
     */
    private String enhancedMonitoring;

    /**
     * <p>
     * Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether you
     * want Amazon MSK to encrypt your data in transit.
     * </p>
     * 
     * @param encryptionInfo
     *        Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether
     *        you want Amazon MSK to encrypt your data in transit.
     */

    public void setEncryptionInfo(AwsMskClusterClusterInfoEncryptionInfoDetails encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    /**
     * <p>
     * Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether you
     * want Amazon MSK to encrypt your data in transit.
     * </p>
     * 
     * @return Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether
     *         you want Amazon MSK to encrypt your data in transit.
     */

    public AwsMskClusterClusterInfoEncryptionInfoDetails getEncryptionInfo() {
        return this.encryptionInfo;
    }

    /**
     * <p>
     * Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether you
     * want Amazon MSK to encrypt your data in transit.
     * </p>
     * 
     * @param encryptionInfo
     *        Includes encryption-related information, such as the KMS key used for encrypting data at rest and whether
     *        you want Amazon MSK to encrypt your data in transit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoDetails withEncryptionInfo(AwsMskClusterClusterInfoEncryptionInfoDetails encryptionInfo) {
        setEncryptionInfo(encryptionInfo);
        return this;
    }

    /**
     * <p>
     * The current version of the cluster.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the cluster.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the cluster.
     * </p>
     * 
     * @return The current version of the cluster.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the cluster.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoDetails withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        The number of broker nodes in the cluster.
     */

    public void setNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        this.numberOfBrokerNodes = numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @return The number of broker nodes in the cluster.
     */

    public Integer getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * <p>
     * The number of broker nodes in the cluster.
     * </p>
     * 
     * @param numberOfBrokerNodes
     *        The number of broker nodes in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoDetails withNumberOfBrokerNodes(Integer numberOfBrokerNodes) {
        setNumberOfBrokerNodes(numberOfBrokerNodes);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoDetails withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * Provides information for different modes of client authentication.
     * </p>
     * 
     * @param clientAuthentication
     *        Provides information for different modes of client authentication.
     */

    public void setClientAuthentication(AwsMskClusterClusterInfoClientAuthenticationDetails clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    /**
     * <p>
     * Provides information for different modes of client authentication.
     * </p>
     * 
     * @return Provides information for different modes of client authentication.
     */

    public AwsMskClusterClusterInfoClientAuthenticationDetails getClientAuthentication() {
        return this.clientAuthentication;
    }

    /**
     * <p>
     * Provides information for different modes of client authentication.
     * </p>
     * 
     * @param clientAuthentication
     *        Provides information for different modes of client authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoDetails withClientAuthentication(AwsMskClusterClusterInfoClientAuthenticationDetails clientAuthentication) {
        setClientAuthentication(clientAuthentication);
        return this;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the cluster.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies the level of monitoring for the cluster.
     */

    public void setEnhancedMonitoring(String enhancedMonitoring) {
        this.enhancedMonitoring = enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the cluster.
     * </p>
     * 
     * @return Specifies the level of monitoring for the cluster.
     */

    public String getEnhancedMonitoring() {
        return this.enhancedMonitoring;
    }

    /**
     * <p>
     * Specifies the level of monitoring for the cluster.
     * </p>
     * 
     * @param enhancedMonitoring
     *        Specifies the level of monitoring for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoDetails withEnhancedMonitoring(String enhancedMonitoring) {
        setEnhancedMonitoring(enhancedMonitoring);
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
        if (getEncryptionInfo() != null)
            sb.append("EncryptionInfo: ").append(getEncryptionInfo()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getNumberOfBrokerNodes() != null)
            sb.append("NumberOfBrokerNodes: ").append(getNumberOfBrokerNodes()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getClientAuthentication() != null)
            sb.append("ClientAuthentication: ").append(getClientAuthentication()).append(",");
        if (getEnhancedMonitoring() != null)
            sb.append("EnhancedMonitoring: ").append(getEnhancedMonitoring());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsMskClusterClusterInfoDetails == false)
            return false;
        AwsMskClusterClusterInfoDetails other = (AwsMskClusterClusterInfoDetails) obj;
        if (other.getEncryptionInfo() == null ^ this.getEncryptionInfo() == null)
            return false;
        if (other.getEncryptionInfo() != null && other.getEncryptionInfo().equals(this.getEncryptionInfo()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getNumberOfBrokerNodes() == null ^ this.getNumberOfBrokerNodes() == null)
            return false;
        if (other.getNumberOfBrokerNodes() != null && other.getNumberOfBrokerNodes().equals(this.getNumberOfBrokerNodes()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getClientAuthentication() == null ^ this.getClientAuthentication() == null)
            return false;
        if (other.getClientAuthentication() != null && other.getClientAuthentication().equals(this.getClientAuthentication()) == false)
            return false;
        if (other.getEnhancedMonitoring() == null ^ this.getEnhancedMonitoring() == null)
            return false;
        if (other.getEnhancedMonitoring() != null && other.getEnhancedMonitoring().equals(this.getEnhancedMonitoring()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionInfo() == null) ? 0 : getEncryptionInfo().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getNumberOfBrokerNodes() == null) ? 0 : getNumberOfBrokerNodes().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getClientAuthentication() == null) ? 0 : getClientAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoring() == null) ? 0 : getEnhancedMonitoring().hashCode());
        return hashCode;
    }

    @Override
    public AwsMskClusterClusterInfoDetails clone() {
        try {
            return (AwsMskClusterClusterInfoDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsMskClusterClusterInfoDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
