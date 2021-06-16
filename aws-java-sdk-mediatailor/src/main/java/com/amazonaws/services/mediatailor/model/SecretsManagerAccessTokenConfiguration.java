/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS Secrets Manager access token configuration parameters. For information about Secrets Manager access token
 * authentication, see <a
 * href="https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html"
 * >Working with AWS Secrets Manager access token authentication</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/SecretsManagerAccessTokenConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretsManagerAccessTokenConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the HTTP header used to supply the access token in requests to the source location.
     * </p>
     */
    private String headerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     * </p>
     */
    private String secretArn;
    /**
     * <p>
     * The AWS Secrets Manager <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     * >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString key and
     * value pair containing the access token.
     * </p>
     */
    private String secretStringKey;

    /**
     * <p>
     * The name of the HTTP header used to supply the access token in requests to the source location.
     * </p>
     * 
     * @param headerName
     *        The name of the HTTP header used to supply the access token in requests to the source location.
     */

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * <p>
     * The name of the HTTP header used to supply the access token in requests to the source location.
     * </p>
     * 
     * @return The name of the HTTP header used to supply the access token in requests to the source location.
     */

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * <p>
     * The name of the HTTP header used to supply the access token in requests to the source location.
     * </p>
     * 
     * @param headerName
     *        The name of the HTTP header used to supply the access token in requests to the source location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerAccessTokenConfiguration withHeaderName(String headerName) {
        setHeaderName(headerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerAccessTokenConfiguration withSecretArn(String secretArn) {
        setSecretArn(secretArn);
        return this;
    }

    /**
     * <p>
     * The AWS Secrets Manager <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     * >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString key and
     * value pair containing the access token.
     * </p>
     * 
     * @param secretStringKey
     *        The AWS Secrets Manager <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     *        >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString
     *        key and value pair containing the access token.
     */

    public void setSecretStringKey(String secretStringKey) {
        this.secretStringKey = secretStringKey;
    }

    /**
     * <p>
     * The AWS Secrets Manager <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     * >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString key and
     * value pair containing the access token.
     * </p>
     * 
     * @return The AWS Secrets Manager <a href=
     *         "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     *         >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString
     *         key and value pair containing the access token.
     */

    public String getSecretStringKey() {
        return this.secretStringKey;
    }

    /**
     * <p>
     * The AWS Secrets Manager <a href=
     * "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     * >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString key and
     * value pair containing the access token.
     * </p>
     * 
     * @param secretStringKey
     *        The AWS Secrets Manager <a href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html"
     *        >SecretString</a> key associated with the access token. MediaTailor uses the key to look up SecretString
     *        key and value pair containing the access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerAccessTokenConfiguration withSecretStringKey(String secretStringKey) {
        setSecretStringKey(secretStringKey);
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
        if (getHeaderName() != null)
            sb.append("HeaderName: ").append(getHeaderName()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn()).append(",");
        if (getSecretStringKey() != null)
            sb.append("SecretStringKey: ").append(getSecretStringKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecretsManagerAccessTokenConfiguration == false)
            return false;
        SecretsManagerAccessTokenConfiguration other = (SecretsManagerAccessTokenConfiguration) obj;
        if (other.getHeaderName() == null ^ this.getHeaderName() == null)
            return false;
        if (other.getHeaderName() != null && other.getHeaderName().equals(this.getHeaderName()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        if (other.getSecretStringKey() == null ^ this.getSecretStringKey() == null)
            return false;
        if (other.getSecretStringKey() != null && other.getSecretStringKey().equals(this.getSecretStringKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeaderName() == null) ? 0 : getHeaderName().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        hashCode = prime * hashCode + ((getSecretStringKey() == null) ? 0 : getSecretStringKey().hashCode());
        return hashCode;
    }

    @Override
    public SecretsManagerAccessTokenConfiguration clone() {
        try {
            return (SecretsManagerAccessTokenConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.SecretsManagerAccessTokenConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
