/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration of a Kubernetes <code>secret</code> volume. For more information, see <a
 * href="https://kubernetes.io/docs/concepts/storage/volumes/#secret">secret</a> in the <i>Kubernetes documentation</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/EksSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksSecret implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     */
    private String secretName;
    /**
     * <p>
     * Specifies whether the secret or the secret's keys must be defined.
     * </p>
     */
    private Boolean optional;

    /**
     * <p>
     * The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param secretName
     *        The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS
     *        subdomain names</a> in the <i>Kubernetes documentation</i>.
     */

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    /**
     * <p>
     * The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @return The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     *         href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS
     *         subdomain names</a> in the <i>Kubernetes documentation</i>.
     */

    public String getSecretName() {
        return this.secretName;
    }

    /**
     * <p>
     * The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     * href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS subdomain
     * names</a> in the <i>Kubernetes documentation</i>.
     * </p>
     * 
     * @param secretName
     *        The name of the secret. The name must be allowed as a DNS subdomain name. For more information, see <a
     *        href="https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names">DNS
     *        subdomain names</a> in the <i>Kubernetes documentation</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksSecret withSecretName(String secretName) {
        setSecretName(secretName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the secret or the secret's keys must be defined.
     * </p>
     * 
     * @param optional
     *        Specifies whether the secret or the secret's keys must be defined.
     */

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * <p>
     * Specifies whether the secret or the secret's keys must be defined.
     * </p>
     * 
     * @return Specifies whether the secret or the secret's keys must be defined.
     */

    public Boolean getOptional() {
        return this.optional;
    }

    /**
     * <p>
     * Specifies whether the secret or the secret's keys must be defined.
     * </p>
     * 
     * @param optional
     *        Specifies whether the secret or the secret's keys must be defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksSecret withOptional(Boolean optional) {
        setOptional(optional);
        return this;
    }

    /**
     * <p>
     * Specifies whether the secret or the secret's keys must be defined.
     * </p>
     * 
     * @return Specifies whether the secret or the secret's keys must be defined.
     */

    public Boolean isOptional() {
        return this.optional;
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
        if (getSecretName() != null)
            sb.append("SecretName: ").append(getSecretName()).append(",");
        if (getOptional() != null)
            sb.append("Optional: ").append(getOptional());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksSecret == false)
            return false;
        EksSecret other = (EksSecret) obj;
        if (other.getSecretName() == null ^ this.getSecretName() == null)
            return false;
        if (other.getSecretName() != null && other.getSecretName().equals(this.getSecretName()) == false)
            return false;
        if (other.getOptional() == null ^ this.getOptional() == null)
            return false;
        if (other.getOptional() != null && other.getOptional().equals(this.getOptional()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretName() == null) ? 0 : getSecretName().hashCode());
        hashCode = prime * hashCode + ((getOptional() == null) ? 0 : getOptional().hashCode());
        return hashCode;
    }

    @Override
    public EksSecret clone() {
        try {
            return (EksSecret) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.EksSecretMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
