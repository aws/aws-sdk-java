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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The API key credentials required for API key authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ApiKeyCredentials" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiKeyCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API key required for API key authentication.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * The API secret key required for API key authentication.
     * </p>
     */
    private String apiSecretKey;

    /**
     * <p>
     * The API key required for API key authentication.
     * </p>
     * 
     * @param apiKey
     *        The API key required for API key authentication.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The API key required for API key authentication.
     * </p>
     * 
     * @return The API key required for API key authentication.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * The API key required for API key authentication.
     * </p>
     * 
     * @param apiKey
     *        The API key required for API key authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKeyCredentials withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * The API secret key required for API key authentication.
     * </p>
     * 
     * @param apiSecretKey
     *        The API secret key required for API key authentication.
     */

    public void setApiSecretKey(String apiSecretKey) {
        this.apiSecretKey = apiSecretKey;
    }

    /**
     * <p>
     * The API secret key required for API key authentication.
     * </p>
     * 
     * @return The API secret key required for API key authentication.
     */

    public String getApiSecretKey() {
        return this.apiSecretKey;
    }

    /**
     * <p>
     * The API secret key required for API key authentication.
     * </p>
     * 
     * @param apiSecretKey
     *        The API secret key required for API key authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiKeyCredentials withApiSecretKey(String apiSecretKey) {
        setApiSecretKey(apiSecretKey);
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
            sb.append("ApiKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getApiSecretKey() != null)
            sb.append("ApiSecretKey: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiKeyCredentials == false)
            return false;
        ApiKeyCredentials other = (ApiKeyCredentials) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getApiSecretKey() == null ^ this.getApiSecretKey() == null)
            return false;
        if (other.getApiSecretKey() != null && other.getApiSecretKey().equals(this.getApiSecretKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getApiSecretKey() == null) ? 0 : getApiSecretKey().hashCode());
        return hashCode;
    }

    @Override
    public ApiKeyCredentials clone() {
        try {
            return (ApiKeyCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ApiKeyCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
