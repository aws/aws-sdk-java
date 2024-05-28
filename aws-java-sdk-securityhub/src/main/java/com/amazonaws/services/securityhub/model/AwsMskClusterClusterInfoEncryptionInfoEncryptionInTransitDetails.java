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
 * The settings for encrypting data in transit.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster is
     * encrypted. When set to <code>false</code>, the communication happens in plain text. The default value is
     * <code>true</code>.
     * </p>
     */
    private Boolean inCluster;
    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers.
     * </p>
     */
    private String clientBroker;

    /**
     * <p>
     * When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster is
     * encrypted. When set to <code>false</code>, the communication happens in plain text. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @param inCluster
     *        When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster
     *        is encrypted. When set to <code>false</code>, the communication happens in plain text. The default value
     *        is <code>true</code>.
     */

    public void setInCluster(Boolean inCluster) {
        this.inCluster = inCluster;
    }

    /**
     * <p>
     * When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster is
     * encrypted. When set to <code>false</code>, the communication happens in plain text. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @return When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster
     *         is encrypted. When set to <code>false</code>, the communication happens in plain text. The default value
     *         is <code>true</code>.
     */

    public Boolean getInCluster() {
        return this.inCluster;
    }

    /**
     * <p>
     * When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster is
     * encrypted. When set to <code>false</code>, the communication happens in plain text. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @param inCluster
     *        When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster
     *        is encrypted. When set to <code>false</code>, the communication happens in plain text. The default value
     *        is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails withInCluster(Boolean inCluster) {
        setInCluster(inCluster);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster is
     * encrypted. When set to <code>false</code>, the communication happens in plain text. The default value is
     * <code>true</code>.
     * </p>
     * 
     * @return When set to <code>true</code>, it indicates that data communication among the broker nodes of the cluster
     *         is encrypted. When set to <code>false</code>, the communication happens in plain text. The default value
     *         is <code>true</code>.
     */

    public Boolean isInCluster() {
        return this.inCluster;
    }

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers.
     * </p>
     * 
     * @param clientBroker
     *        Indicates the encryption setting for data in transit between clients and brokers.
     */

    public void setClientBroker(String clientBroker) {
        this.clientBroker = clientBroker;
    }

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers.
     * </p>
     * 
     * @return Indicates the encryption setting for data in transit between clients and brokers.
     */

    public String getClientBroker() {
        return this.clientBroker;
    }

    /**
     * <p>
     * Indicates the encryption setting for data in transit between clients and brokers.
     * </p>
     * 
     * @param clientBroker
     *        Indicates the encryption setting for data in transit between clients and brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails withClientBroker(String clientBroker) {
        setClientBroker(clientBroker);
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
        if (getInCluster() != null)
            sb.append("InCluster: ").append(getInCluster()).append(",");
        if (getClientBroker() != null)
            sb.append("ClientBroker: ").append(getClientBroker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails == false)
            return false;
        AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails other = (AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails) obj;
        if (other.getInCluster() == null ^ this.getInCluster() == null)
            return false;
        if (other.getInCluster() != null && other.getInCluster().equals(this.getInCluster()) == false)
            return false;
        if (other.getClientBroker() == null ^ this.getClientBroker() == null)
            return false;
        if (other.getClientBroker() != null && other.getClientBroker().equals(this.getClientBroker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInCluster() == null) ? 0 : getInCluster().hashCode());
        hashCode = prime * hashCode + ((getClientBroker() == null) ? 0 : getClientBroker().hashCode());
        return hashCode;
    }

    @Override
    public AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails clone() {
        try {
            return (AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsMskClusterClusterInfoEncryptionInfoEncryptionInTransitDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
