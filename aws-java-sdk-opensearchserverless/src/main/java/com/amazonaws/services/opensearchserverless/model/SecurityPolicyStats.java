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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics for an OpenSearch Serverless security policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/SecurityPolicyStats"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityPolicyStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of encryption policies in the current account.
     * </p>
     */
    private Long encryptionPolicyCount;
    /**
     * <p>
     * The number of network policies in the current account.
     * </p>
     */
    private Long networkPolicyCount;

    /**
     * <p>
     * The number of encryption policies in the current account.
     * </p>
     * 
     * @param encryptionPolicyCount
     *        The number of encryption policies in the current account.
     */

    public void setEncryptionPolicyCount(Long encryptionPolicyCount) {
        this.encryptionPolicyCount = encryptionPolicyCount;
    }

    /**
     * <p>
     * The number of encryption policies in the current account.
     * </p>
     * 
     * @return The number of encryption policies in the current account.
     */

    public Long getEncryptionPolicyCount() {
        return this.encryptionPolicyCount;
    }

    /**
     * <p>
     * The number of encryption policies in the current account.
     * </p>
     * 
     * @param encryptionPolicyCount
     *        The number of encryption policies in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyStats withEncryptionPolicyCount(Long encryptionPolicyCount) {
        setEncryptionPolicyCount(encryptionPolicyCount);
        return this;
    }

    /**
     * <p>
     * The number of network policies in the current account.
     * </p>
     * 
     * @param networkPolicyCount
     *        The number of network policies in the current account.
     */

    public void setNetworkPolicyCount(Long networkPolicyCount) {
        this.networkPolicyCount = networkPolicyCount;
    }

    /**
     * <p>
     * The number of network policies in the current account.
     * </p>
     * 
     * @return The number of network policies in the current account.
     */

    public Long getNetworkPolicyCount() {
        return this.networkPolicyCount;
    }

    /**
     * <p>
     * The number of network policies in the current account.
     * </p>
     * 
     * @param networkPolicyCount
     *        The number of network policies in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityPolicyStats withNetworkPolicyCount(Long networkPolicyCount) {
        setNetworkPolicyCount(networkPolicyCount);
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
        if (getEncryptionPolicyCount() != null)
            sb.append("EncryptionPolicyCount: ").append(getEncryptionPolicyCount()).append(",");
        if (getNetworkPolicyCount() != null)
            sb.append("NetworkPolicyCount: ").append(getNetworkPolicyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityPolicyStats == false)
            return false;
        SecurityPolicyStats other = (SecurityPolicyStats) obj;
        if (other.getEncryptionPolicyCount() == null ^ this.getEncryptionPolicyCount() == null)
            return false;
        if (other.getEncryptionPolicyCount() != null && other.getEncryptionPolicyCount().equals(this.getEncryptionPolicyCount()) == false)
            return false;
        if (other.getNetworkPolicyCount() == null ^ this.getNetworkPolicyCount() == null)
            return false;
        if (other.getNetworkPolicyCount() != null && other.getNetworkPolicyCount().equals(this.getNetworkPolicyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionPolicyCount() == null) ? 0 : getEncryptionPolicyCount().hashCode());
        hashCode = prime * hashCode + ((getNetworkPolicyCount() == null) ? 0 : getNetworkPolicyCount().hashCode());
        return hashCode;
    }

    @Override
    public SecurityPolicyStats clone() {
        try {
            return (SecurityPolicyStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.SecurityPolicyStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
