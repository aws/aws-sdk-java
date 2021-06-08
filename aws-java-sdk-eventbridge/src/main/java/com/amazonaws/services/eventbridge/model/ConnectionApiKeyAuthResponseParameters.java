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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the authorization parameters for the connection if API Key is specified as the authorization type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ConnectionApiKeyAuthResponseParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionApiKeyAuthResponseParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     * </p>
     */
    private String apiKeyName;

    /**
     * <p>
     * The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     * </p>
     * 
     * @param apiKeyName
     *        The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     */

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    /**
     * <p>
     * The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     * </p>
     * 
     * @return The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     */

    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * <p>
     * The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     * </p>
     * 
     * @param apiKeyName
     *        The name of the header to use for the <code>APIKeyValue</code> used for authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectionApiKeyAuthResponseParameters withApiKeyName(String apiKeyName) {
        setApiKeyName(apiKeyName);
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
        if (getApiKeyName() != null)
            sb.append("ApiKeyName: ").append(getApiKeyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionApiKeyAuthResponseParameters == false)
            return false;
        ConnectionApiKeyAuthResponseParameters other = (ConnectionApiKeyAuthResponseParameters) obj;
        if (other.getApiKeyName() == null ^ this.getApiKeyName() == null)
            return false;
        if (other.getApiKeyName() != null && other.getApiKeyName().equals(this.getApiKeyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKeyName() == null) ? 0 : getApiKeyName().hashCode());
        return hashCode;
    }

    @Override
    public ConnectionApiKeyAuthResponseParameters clone() {
        try {
            return (ConnectionApiKeyAuthResponseParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.ConnectionApiKeyAuthResponseParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
