/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * CDN Authorization credentials
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/Authorization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Authorization implements Serializable, Cloneable, StructuredPojo {

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN)
     * uses for authorization to access your endpoint.
     */
    private String cdnIdentifierSecret;
    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     */
    private String secretsRoleArn;

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN)
     * uses for authorization to access your endpoint.
     * 
     * @param cdnIdentifierSecret
     *        The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network
     *        (CDN) uses for authorization to access your endpoint.
     */

    public void setCdnIdentifierSecret(String cdnIdentifierSecret) {
        this.cdnIdentifierSecret = cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN)
     * uses for authorization to access your endpoint.
     * 
     * @return The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network
     *         (CDN) uses for authorization to access your endpoint.
     */

    public String getCdnIdentifierSecret() {
        return this.cdnIdentifierSecret;
    }

    /**
     * The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network (CDN)
     * uses for authorization to access your endpoint.
     * 
     * @param cdnIdentifierSecret
     *        The Amazon Resource Name (ARN) for the secret in Secrets Manager that your Content Distribution Network
     *        (CDN) uses for authorization to access your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorization withCdnIdentifierSecret(String cdnIdentifierSecret) {
        setCdnIdentifierSecret(cdnIdentifierSecret);
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     * @param secretsRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets
     *        Manager.
     */

    public void setSecretsRoleArn(String secretsRoleArn) {
        this.secretsRoleArn = secretsRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     * @return The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets
     *         Manager.
     */

    public String getSecretsRoleArn() {
        return this.secretsRoleArn;
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets Manager.
     * 
     * @param secretsRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that allows MediaPackage to communicate with AWS Secrets
     *        Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Authorization withSecretsRoleArn(String secretsRoleArn) {
        setSecretsRoleArn(secretsRoleArn);
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
        if (getCdnIdentifierSecret() != null)
            sb.append("CdnIdentifierSecret: ").append(getCdnIdentifierSecret()).append(",");
        if (getSecretsRoleArn() != null)
            sb.append("SecretsRoleArn: ").append(getSecretsRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Authorization == false)
            return false;
        Authorization other = (Authorization) obj;
        if (other.getCdnIdentifierSecret() == null ^ this.getCdnIdentifierSecret() == null)
            return false;
        if (other.getCdnIdentifierSecret() != null && other.getCdnIdentifierSecret().equals(this.getCdnIdentifierSecret()) == false)
            return false;
        if (other.getSecretsRoleArn() == null ^ this.getSecretsRoleArn() == null)
            return false;
        if (other.getSecretsRoleArn() != null && other.getSecretsRoleArn().equals(this.getSecretsRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCdnIdentifierSecret() == null) ? 0 : getCdnIdentifierSecret().hashCode());
        hashCode = prime * hashCode + ((getSecretsRoleArn() == null) ? 0 : getSecretsRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public Authorization clone() {
        try {
            return (Authorization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.AuthorizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
