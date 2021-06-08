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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific credentials required when using Amplitude.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/AmplitudeConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmplitudeConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * The Secret Access Key portion of the credentials.
     * </p>
     */
    private String secretKey;

    /**
     * <p>
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * </p>
     * 
     * @param apiKey
     *        A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * </p>
     * 
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * </p>
     * 
     * @param apiKey
     *        A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmplitudeConnectorProfileCredentials withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials.
     * </p>
     * 
     * @param secretKey
     *        The Secret Access Key portion of the credentials.
     */

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials.
     * </p>
     * 
     * @return The Secret Access Key portion of the credentials.
     */

    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * <p>
     * The Secret Access Key portion of the credentials.
     * </p>
     * 
     * @param secretKey
     *        The Secret Access Key portion of the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmplitudeConnectorProfileCredentials withSecretKey(String secretKey) {
        setSecretKey(secretKey);
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
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getSecretKey() != null)
            sb.append("SecretKey: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmplitudeConnectorProfileCredentials == false)
            return false;
        AmplitudeConnectorProfileCredentials other = (AmplitudeConnectorProfileCredentials) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getSecretKey() == null ^ this.getSecretKey() == null)
            return false;
        if (other.getSecretKey() != null && other.getSecretKey().equals(this.getSecretKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        return hashCode;
    }

    @Override
    public AmplitudeConnectorProfileCredentials clone() {
        try {
            return (AmplitudeConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.AmplitudeConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
