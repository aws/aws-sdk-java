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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Instance config object
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/InstanceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceConfig implements Serializable, Cloneable, StructuredPojo {

    private String connectInstanceId;

    private EncryptionConfig encryptionConfig;

    private String serviceLinkedRoleArn;

    /**
     * @param connectInstanceId
     */

    public void setConnectInstanceId(String connectInstanceId) {
        this.connectInstanceId = connectInstanceId;
    }

    /**
     * @return
     */

    public String getConnectInstanceId() {
        return this.connectInstanceId;
    }

    /**
     * @param connectInstanceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfig withConnectInstanceId(String connectInstanceId) {
        setConnectInstanceId(connectInstanceId);
        return this;
    }

    /**
     * @param encryptionConfig
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * @return
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * @param encryptionConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfig withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
        return this;
    }

    /**
     * @param serviceLinkedRoleArn
     */

    public void setServiceLinkedRoleArn(String serviceLinkedRoleArn) {
        this.serviceLinkedRoleArn = serviceLinkedRoleArn;
    }

    /**
     * @return
     */

    public String getServiceLinkedRoleArn() {
        return this.serviceLinkedRoleArn;
    }

    /**
     * @param serviceLinkedRoleArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceConfig withServiceLinkedRoleArn(String serviceLinkedRoleArn) {
        setServiceLinkedRoleArn(serviceLinkedRoleArn);
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
        if (getConnectInstanceId() != null)
            sb.append("ConnectInstanceId: ").append(getConnectInstanceId()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig()).append(",");
        if (getServiceLinkedRoleArn() != null)
            sb.append("ServiceLinkedRoleArn: ").append(getServiceLinkedRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceConfig == false)
            return false;
        InstanceConfig other = (InstanceConfig) obj;
        if (other.getConnectInstanceId() == null ^ this.getConnectInstanceId() == null)
            return false;
        if (other.getConnectInstanceId() != null && other.getConnectInstanceId().equals(this.getConnectInstanceId()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        if (other.getServiceLinkedRoleArn() == null ^ this.getServiceLinkedRoleArn() == null)
            return false;
        if (other.getServiceLinkedRoleArn() != null && other.getServiceLinkedRoleArn().equals(this.getServiceLinkedRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectInstanceId() == null) ? 0 : getConnectInstanceId().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        hashCode = prime * hashCode + ((getServiceLinkedRoleArn() == null) ? 0 : getServiceLinkedRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public InstanceConfig clone() {
        try {
            return (InstanceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcampaign.model.transform.InstanceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
