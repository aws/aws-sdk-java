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
 * Contains the API key authorization parameters to use to update the connection.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UpdateConnectionApiKeyAuthRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectionApiKeyAuthRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the API key to use for authorization.
     * </p>
     */
    private String apiKeyName;
    /**
     * <p>
     * The value associated with teh API key to use for authorization.
     * </p>
     */
    private String apiKeyValue;

    /**
     * <p>
     * The name of the API key to use for authorization.
     * </p>
     * 
     * @param apiKeyName
     *        The name of the API key to use for authorization.
     */

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    /**
     * <p>
     * The name of the API key to use for authorization.
     * </p>
     * 
     * @return The name of the API key to use for authorization.
     */

    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * <p>
     * The name of the API key to use for authorization.
     * </p>
     * 
     * @param apiKeyName
     *        The name of the API key to use for authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionApiKeyAuthRequestParameters withApiKeyName(String apiKeyName) {
        setApiKeyName(apiKeyName);
        return this;
    }

    /**
     * <p>
     * The value associated with teh API key to use for authorization.
     * </p>
     * 
     * @param apiKeyValue
     *        The value associated with teh API key to use for authorization.
     */

    public void setApiKeyValue(String apiKeyValue) {
        this.apiKeyValue = apiKeyValue;
    }

    /**
     * <p>
     * The value associated with teh API key to use for authorization.
     * </p>
     * 
     * @return The value associated with teh API key to use for authorization.
     */

    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    /**
     * <p>
     * The value associated with teh API key to use for authorization.
     * </p>
     * 
     * @param apiKeyValue
     *        The value associated with teh API key to use for authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionApiKeyAuthRequestParameters withApiKeyValue(String apiKeyValue) {
        setApiKeyValue(apiKeyValue);
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
            sb.append("ApiKeyName: ").append(getApiKeyName()).append(",");
        if (getApiKeyValue() != null)
            sb.append("ApiKeyValue: ").append(getApiKeyValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectionApiKeyAuthRequestParameters == false)
            return false;
        UpdateConnectionApiKeyAuthRequestParameters other = (UpdateConnectionApiKeyAuthRequestParameters) obj;
        if (other.getApiKeyName() == null ^ this.getApiKeyName() == null)
            return false;
        if (other.getApiKeyName() != null && other.getApiKeyName().equals(this.getApiKeyName()) == false)
            return false;
        if (other.getApiKeyValue() == null ^ this.getApiKeyValue() == null)
            return false;
        if (other.getApiKeyValue() != null && other.getApiKeyValue().equals(this.getApiKeyValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKeyName() == null) ? 0 : getApiKeyName().hashCode());
        hashCode = prime * hashCode + ((getApiKeyValue() == null) ? 0 : getApiKeyValue().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectionApiKeyAuthRequestParameters clone() {
        try {
            return (UpdateConnectionApiKeyAuthRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.UpdateConnectionApiKeyAuthRequestParametersMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
