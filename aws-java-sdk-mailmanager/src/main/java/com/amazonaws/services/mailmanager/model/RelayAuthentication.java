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
 * Authentication for the relay destination server—specify the secretARN where the SMTP credentials are stored, or
 * specify an empty NoAuthentication structure if the relay destination server does not require SMTP credential
 * authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RelayAuthentication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelayAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     * </p>
     */
    private NoAuthentication noAuthentication;
    /**
     * <p>
     * The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     * </p>
     * 
     * @param noAuthentication
     *        Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     */

    public void setNoAuthentication(NoAuthentication noAuthentication) {
        this.noAuthentication = noAuthentication;
    }

    /**
     * <p>
     * Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     * </p>
     * 
     * @return Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     */

    public NoAuthentication getNoAuthentication() {
        return this.noAuthentication;
    }

    /**
     * <p>
     * Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     * </p>
     * 
     * @param noAuthentication
     *        Keep an empty structure if the relay destination server does not require SMTP credential authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelayAuthentication withNoAuthentication(NoAuthentication noAuthentication) {
        setNoAuthentication(noAuthentication);
        return this;
    }

    /**
     * <p>
     * The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     * </p>
     * 
     * @param secretArn
     *        The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     * </p>
     * 
     * @return The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     * </p>
     * 
     * @param secretArn
     *        The ARN of the secret created in secrets manager where the relay server's SMTP credentials are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelayAuthentication withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getNoAuthentication() != null)
            sb.append("NoAuthentication: ").append(getNoAuthentication()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelayAuthentication == false)
            return false;
        RelayAuthentication other = (RelayAuthentication) obj;
        if (other.getNoAuthentication() == null ^ this.getNoAuthentication() == null)
            return false;
        if (other.getNoAuthentication() != null && other.getNoAuthentication().equals(this.getNoAuthentication()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoAuthentication() == null) ? 0 : getNoAuthentication().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public RelayAuthentication clone() {
        try {
            return (RelayAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RelayAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
