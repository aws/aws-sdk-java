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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the ingress endpoint resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/IngressPointConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressPointConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SecretsManager::Secret ARN of the ingress endpoint resource.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The password of the ingress endpoint resource.
     * </p>
     */
    private String smtpPassword;

    /**
     * <p>
     * The SecretsManager::Secret ARN of the ingress endpoint resource.
     * </p>
     * 
     * @param secretArn
     *        The SecretsManager::Secret ARN of the ingress endpoint resource.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The SecretsManager::Secret ARN of the ingress endpoint resource.
     * </p>
     * 
     * @return The SecretsManager::Secret ARN of the ingress endpoint resource.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The SecretsManager::Secret ARN of the ingress endpoint resource.
     * </p>
     * 
     * @param secretArn
     *        The SecretsManager::Secret ARN of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressPointConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The password of the ingress endpoint resource.
     * </p>
     * 
     * @param smtpPassword
     *        The password of the ingress endpoint resource.
     */

    public void setSmtpPassword(String smtpPassword) {
        this.smtpPassword = smtpPassword;
    }

    /**
     * <p>
     * The password of the ingress endpoint resource.
     * </p>
     * 
     * @return The password of the ingress endpoint resource.
     */

    public String getSmtpPassword() {
        return this.smtpPassword;
    }

    /**
     * <p>
     * The password of the ingress endpoint resource.
     * </p>
     * 
     * @param smtpPassword
     *        The password of the ingress endpoint resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressPointConfiguration withSmtpPassword(String smtpPassword) {
        setSmtpPassword(smtpPassword);
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
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSmtpPassword() != null)
            sb.append("SmtpPassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngressPointConfiguration == false)
            return false;
        IngressPointConfiguration other = (IngressPointConfiguration) obj;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSmtpPassword() == null ^ this.getSmtpPassword() == null)
            return false;
        if (other.getSmtpPassword() != null && other.getSmtpPassword().equals(this.getSmtpPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSmtpPassword() == null) ? 0 : getSmtpPassword().hashCode());
        return hashCode;
    }

    @Override
    public IngressPointConfiguration clone() {
        try {
            return (IngressPointConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.IngressPointConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
