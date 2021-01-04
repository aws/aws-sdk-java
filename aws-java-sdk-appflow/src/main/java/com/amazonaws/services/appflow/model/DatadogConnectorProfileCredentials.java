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
 * The connector-specific credentials required by Datadog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DatadogConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatadogConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     * Application keys are associated with the user account that created them. The application key is used to log all
     * requests made to the API.
     * </p>
     */
    private String applicationKey;

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

    public DatadogConnectorProfileCredentials withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     * Application keys are associated with the user account that created them. The application key is used to log all
     * requests made to the API.
     * </p>
     * 
     * @param applicationKey
     *        Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     *        Application keys are associated with the user account that created them. The application key is used to
     *        log all requests made to the API.
     */

    public void setApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
    }

    /**
     * <p>
     * Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     * Application keys are associated with the user account that created them. The application key is used to log all
     * requests made to the API.
     * </p>
     * 
     * @return Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     *         Application keys are associated with the user account that created them. The application key is used to
     *         log all requests made to the API.
     */

    public String getApplicationKey() {
        return this.applicationKey;
    }

    /**
     * <p>
     * Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     * Application keys are associated with the user account that created them. The application key is used to log all
     * requests made to the API.
     * </p>
     * 
     * @param applicationKey
     *        Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API.
     *        Application keys are associated with the user account that created them. The application key is used to
     *        log all requests made to the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatadogConnectorProfileCredentials withApplicationKey(String applicationKey) {
        setApplicationKey(applicationKey);
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
        if (getApplicationKey() != null)
            sb.append("ApplicationKey: ").append(getApplicationKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatadogConnectorProfileCredentials == false)
            return false;
        DatadogConnectorProfileCredentials other = (DatadogConnectorProfileCredentials) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getApplicationKey() == null ^ this.getApplicationKey() == null)
            return false;
        if (other.getApplicationKey() != null && other.getApplicationKey().equals(this.getApplicationKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getApplicationKey() == null) ? 0 : getApplicationKey().hashCode());
        return hashCode;
    }

    @Override
    public DatadogConnectorProfileCredentials clone() {
        try {
            return (DatadogConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.DatadogConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
