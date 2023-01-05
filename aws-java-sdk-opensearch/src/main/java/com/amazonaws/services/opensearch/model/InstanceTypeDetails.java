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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists all instance types and available features for a given OpenSearch or Elasticsearch version.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Whether encryption at rest and node-to-node encryption are supported for the instance type.
     * </p>
     */
    private Boolean encryptionEnabled;
    /**
     * <p>
     * Whether Amazon Cognito access is supported for the instance type.
     * </p>
     */
    private Boolean cognitoEnabled;
    /**
     * <p>
     * Whether logging is supported for the instance type.
     * </p>
     */
    private Boolean appLogsEnabled;
    /**
     * <p>
     * Whether fine-grained access control is supported for the instance type.
     * </p>
     */
    private Boolean advancedSecurityEnabled;
    /**
     * <p>
     * Whether UltraWarm is supported for the instance type.
     * </p>
     */
    private Boolean warmEnabled;
    /**
     * <p>
     * Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * </p>
     */
    private java.util.List<String> instanceRole;

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see OpenSearchPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see OpenSearchPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public InstanceTypeDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OpenSearchPartitionInstanceType
     */

    public InstanceTypeDetails withInstanceType(OpenSearchPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Whether encryption at rest and node-to-node encryption are supported for the instance type.
     * </p>
     * 
     * @param encryptionEnabled
     *        Whether encryption at rest and node-to-node encryption are supported for the instance type.
     */

    public void setEncryptionEnabled(Boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    /**
     * <p>
     * Whether encryption at rest and node-to-node encryption are supported for the instance type.
     * </p>
     * 
     * @return Whether encryption at rest and node-to-node encryption are supported for the instance type.
     */

    public Boolean getEncryptionEnabled() {
        return this.encryptionEnabled;
    }

    /**
     * <p>
     * Whether encryption at rest and node-to-node encryption are supported for the instance type.
     * </p>
     * 
     * @param encryptionEnabled
     *        Whether encryption at rest and node-to-node encryption are supported for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withEncryptionEnabled(Boolean encryptionEnabled) {
        setEncryptionEnabled(encryptionEnabled);
        return this;
    }

    /**
     * <p>
     * Whether encryption at rest and node-to-node encryption are supported for the instance type.
     * </p>
     * 
     * @return Whether encryption at rest and node-to-node encryption are supported for the instance type.
     */

    public Boolean isEncryptionEnabled() {
        return this.encryptionEnabled;
    }

    /**
     * <p>
     * Whether Amazon Cognito access is supported for the instance type.
     * </p>
     * 
     * @param cognitoEnabled
     *        Whether Amazon Cognito access is supported for the instance type.
     */

    public void setCognitoEnabled(Boolean cognitoEnabled) {
        this.cognitoEnabled = cognitoEnabled;
    }

    /**
     * <p>
     * Whether Amazon Cognito access is supported for the instance type.
     * </p>
     * 
     * @return Whether Amazon Cognito access is supported for the instance type.
     */

    public Boolean getCognitoEnabled() {
        return this.cognitoEnabled;
    }

    /**
     * <p>
     * Whether Amazon Cognito access is supported for the instance type.
     * </p>
     * 
     * @param cognitoEnabled
     *        Whether Amazon Cognito access is supported for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withCognitoEnabled(Boolean cognitoEnabled) {
        setCognitoEnabled(cognitoEnabled);
        return this;
    }

    /**
     * <p>
     * Whether Amazon Cognito access is supported for the instance type.
     * </p>
     * 
     * @return Whether Amazon Cognito access is supported for the instance type.
     */

    public Boolean isCognitoEnabled() {
        return this.cognitoEnabled;
    }

    /**
     * <p>
     * Whether logging is supported for the instance type.
     * </p>
     * 
     * @param appLogsEnabled
     *        Whether logging is supported for the instance type.
     */

    public void setAppLogsEnabled(Boolean appLogsEnabled) {
        this.appLogsEnabled = appLogsEnabled;
    }

    /**
     * <p>
     * Whether logging is supported for the instance type.
     * </p>
     * 
     * @return Whether logging is supported for the instance type.
     */

    public Boolean getAppLogsEnabled() {
        return this.appLogsEnabled;
    }

    /**
     * <p>
     * Whether logging is supported for the instance type.
     * </p>
     * 
     * @param appLogsEnabled
     *        Whether logging is supported for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withAppLogsEnabled(Boolean appLogsEnabled) {
        setAppLogsEnabled(appLogsEnabled);
        return this;
    }

    /**
     * <p>
     * Whether logging is supported for the instance type.
     * </p>
     * 
     * @return Whether logging is supported for the instance type.
     */

    public Boolean isAppLogsEnabled() {
        return this.appLogsEnabled;
    }

    /**
     * <p>
     * Whether fine-grained access control is supported for the instance type.
     * </p>
     * 
     * @param advancedSecurityEnabled
     *        Whether fine-grained access control is supported for the instance type.
     */

    public void setAdvancedSecurityEnabled(Boolean advancedSecurityEnabled) {
        this.advancedSecurityEnabled = advancedSecurityEnabled;
    }

    /**
     * <p>
     * Whether fine-grained access control is supported for the instance type.
     * </p>
     * 
     * @return Whether fine-grained access control is supported for the instance type.
     */

    public Boolean getAdvancedSecurityEnabled() {
        return this.advancedSecurityEnabled;
    }

    /**
     * <p>
     * Whether fine-grained access control is supported for the instance type.
     * </p>
     * 
     * @param advancedSecurityEnabled
     *        Whether fine-grained access control is supported for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withAdvancedSecurityEnabled(Boolean advancedSecurityEnabled) {
        setAdvancedSecurityEnabled(advancedSecurityEnabled);
        return this;
    }

    /**
     * <p>
     * Whether fine-grained access control is supported for the instance type.
     * </p>
     * 
     * @return Whether fine-grained access control is supported for the instance type.
     */

    public Boolean isAdvancedSecurityEnabled() {
        return this.advancedSecurityEnabled;
    }

    /**
     * <p>
     * Whether UltraWarm is supported for the instance type.
     * </p>
     * 
     * @param warmEnabled
     *        Whether UltraWarm is supported for the instance type.
     */

    public void setWarmEnabled(Boolean warmEnabled) {
        this.warmEnabled = warmEnabled;
    }

    /**
     * <p>
     * Whether UltraWarm is supported for the instance type.
     * </p>
     * 
     * @return Whether UltraWarm is supported for the instance type.
     */

    public Boolean getWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * <p>
     * Whether UltraWarm is supported for the instance type.
     * </p>
     * 
     * @param warmEnabled
     *        Whether UltraWarm is supported for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withWarmEnabled(Boolean warmEnabled) {
        setWarmEnabled(warmEnabled);
        return this;
    }

    /**
     * <p>
     * Whether UltraWarm is supported for the instance type.
     * </p>
     * 
     * @return Whether UltraWarm is supported for the instance type.
     */

    public Boolean isWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * <p>
     * Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * </p>
     * 
     * @return Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     */

    public java.util.List<String> getInstanceRole() {
        return instanceRole;
    }

    /**
     * <p>
     * Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * </p>
     * 
     * @param instanceRole
     *        Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     */

    public void setInstanceRole(java.util.Collection<String> instanceRole) {
        if (instanceRole == null) {
            this.instanceRole = null;
            return;
        }

        this.instanceRole = new java.util.ArrayList<String>(instanceRole);
    }

    /**
     * <p>
     * Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceRole(java.util.Collection)} or {@link #withInstanceRole(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceRole
     *        Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withInstanceRole(String... instanceRole) {
        if (this.instanceRole == null) {
            setInstanceRole(new java.util.ArrayList<String>(instanceRole.length));
        }
        for (String ele : instanceRole) {
            this.instanceRole.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * </p>
     * 
     * @param instanceRole
     *        Whether the instance acts as a data node, a dedicated master node, or an UltraWarm node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeDetails withInstanceRole(java.util.Collection<String> instanceRole) {
        setInstanceRole(instanceRole);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getEncryptionEnabled() != null)
            sb.append("EncryptionEnabled: ").append(getEncryptionEnabled()).append(",");
        if (getCognitoEnabled() != null)
            sb.append("CognitoEnabled: ").append(getCognitoEnabled()).append(",");
        if (getAppLogsEnabled() != null)
            sb.append("AppLogsEnabled: ").append(getAppLogsEnabled()).append(",");
        if (getAdvancedSecurityEnabled() != null)
            sb.append("AdvancedSecurityEnabled: ").append(getAdvancedSecurityEnabled()).append(",");
        if (getWarmEnabled() != null)
            sb.append("WarmEnabled: ").append(getWarmEnabled()).append(",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: ").append(getInstanceRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeDetails == false)
            return false;
        InstanceTypeDetails other = (InstanceTypeDetails) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getEncryptionEnabled() == null ^ this.getEncryptionEnabled() == null)
            return false;
        if (other.getEncryptionEnabled() != null && other.getEncryptionEnabled().equals(this.getEncryptionEnabled()) == false)
            return false;
        if (other.getCognitoEnabled() == null ^ this.getCognitoEnabled() == null)
            return false;
        if (other.getCognitoEnabled() != null && other.getCognitoEnabled().equals(this.getCognitoEnabled()) == false)
            return false;
        if (other.getAppLogsEnabled() == null ^ this.getAppLogsEnabled() == null)
            return false;
        if (other.getAppLogsEnabled() != null && other.getAppLogsEnabled().equals(this.getAppLogsEnabled()) == false)
            return false;
        if (other.getAdvancedSecurityEnabled() == null ^ this.getAdvancedSecurityEnabled() == null)
            return false;
        if (other.getAdvancedSecurityEnabled() != null && other.getAdvancedSecurityEnabled().equals(this.getAdvancedSecurityEnabled()) == false)
            return false;
        if (other.getWarmEnabled() == null ^ this.getWarmEnabled() == null)
            return false;
        if (other.getWarmEnabled() != null && other.getWarmEnabled().equals(this.getWarmEnabled()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getEncryptionEnabled() == null) ? 0 : getEncryptionEnabled().hashCode());
        hashCode = prime * hashCode + ((getCognitoEnabled() == null) ? 0 : getCognitoEnabled().hashCode());
        hashCode = prime * hashCode + ((getAppLogsEnabled() == null) ? 0 : getAppLogsEnabled().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityEnabled() == null) ? 0 : getAdvancedSecurityEnabled().hashCode());
        hashCode = prime * hashCode + ((getWarmEnabled() == null) ? 0 : getWarmEnabled().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeDetails clone() {
        try {
            return (InstanceTypeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.InstanceTypeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
