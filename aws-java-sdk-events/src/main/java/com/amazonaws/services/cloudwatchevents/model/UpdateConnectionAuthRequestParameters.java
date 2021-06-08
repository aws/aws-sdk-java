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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the additional parameters to use for the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/UpdateConnectionAuthRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectionAuthRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization parameters for
     * Basic authorization.
     * </p>
     */
    private UpdateConnectionBasicAuthRequestParameters basicAuthParameters;
    /**
     * <p>
     * A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters for OAuth
     * authorization.
     * </p>
     */
    private UpdateConnectionOAuthRequestParameters oAuthParameters;
    /**
     * <p>
     * A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization parameters for
     * API key authorization.
     * </p>
     */
    private UpdateConnectionApiKeyAuthRequestParameters apiKeyAuthParameters;
    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the connection.
     * </p>
     */
    private ConnectionHttpParameters invocationHttpParameters;

    /**
     * <p>
     * A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization parameters for
     * Basic authorization.
     * </p>
     * 
     * @param basicAuthParameters
     *        A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization
     *        parameters for Basic authorization.
     */

    public void setBasicAuthParameters(UpdateConnectionBasicAuthRequestParameters basicAuthParameters) {
        this.basicAuthParameters = basicAuthParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization parameters for
     * Basic authorization.
     * </p>
     * 
     * @return A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization
     *         parameters for Basic authorization.
     */

    public UpdateConnectionBasicAuthRequestParameters getBasicAuthParameters() {
        return this.basicAuthParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization parameters for
     * Basic authorization.
     * </p>
     * 
     * @param basicAuthParameters
     *        A <code>UpdateConnectionBasicAuthRequestParameters</code> object that contains the authorization
     *        parameters for Basic authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionAuthRequestParameters withBasicAuthParameters(UpdateConnectionBasicAuthRequestParameters basicAuthParameters) {
        setBasicAuthParameters(basicAuthParameters);
        return this;
    }

    /**
     * <p>
     * A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters for OAuth
     * authorization.
     * </p>
     * 
     * @param oAuthParameters
     *        A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters
     *        for OAuth authorization.
     */

    public void setOAuthParameters(UpdateConnectionOAuthRequestParameters oAuthParameters) {
        this.oAuthParameters = oAuthParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters for OAuth
     * authorization.
     * </p>
     * 
     * @return A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters
     *         for OAuth authorization.
     */

    public UpdateConnectionOAuthRequestParameters getOAuthParameters() {
        return this.oAuthParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters for OAuth
     * authorization.
     * </p>
     * 
     * @param oAuthParameters
     *        A <code>UpdateConnectionOAuthRequestParameters</code> object that contains the authorization parameters
     *        for OAuth authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionAuthRequestParameters withOAuthParameters(UpdateConnectionOAuthRequestParameters oAuthParameters) {
        setOAuthParameters(oAuthParameters);
        return this;
    }

    /**
     * <p>
     * A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization parameters for
     * API key authorization.
     * </p>
     * 
     * @param apiKeyAuthParameters
     *        A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization
     *        parameters for API key authorization.
     */

    public void setApiKeyAuthParameters(UpdateConnectionApiKeyAuthRequestParameters apiKeyAuthParameters) {
        this.apiKeyAuthParameters = apiKeyAuthParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization parameters for
     * API key authorization.
     * </p>
     * 
     * @return A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization
     *         parameters for API key authorization.
     */

    public UpdateConnectionApiKeyAuthRequestParameters getApiKeyAuthParameters() {
        return this.apiKeyAuthParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization parameters for
     * API key authorization.
     * </p>
     * 
     * @param apiKeyAuthParameters
     *        A <code>UpdateConnectionApiKeyAuthRequestParameters</code> object that contains the authorization
     *        parameters for API key authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionAuthRequestParameters withApiKeyAuthParameters(UpdateConnectionApiKeyAuthRequestParameters apiKeyAuthParameters) {
        setApiKeyAuthParameters(apiKeyAuthParameters);
        return this;
    }

    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the connection.
     * </p>
     * 
     * @param invocationHttpParameters
     *        A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the
     *        connection.
     */

    public void setInvocationHttpParameters(ConnectionHttpParameters invocationHttpParameters) {
        this.invocationHttpParameters = invocationHttpParameters;
    }

    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the connection.
     * </p>
     * 
     * @return A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the
     *         connection.
     */

    public ConnectionHttpParameters getInvocationHttpParameters() {
        return this.invocationHttpParameters;
    }

    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the connection.
     * </p>
     * 
     * @param invocationHttpParameters
     *        A <code>ConnectionHttpParameters</code> object that contains the additional parameters to use for the
     *        connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionAuthRequestParameters withInvocationHttpParameters(ConnectionHttpParameters invocationHttpParameters) {
        setInvocationHttpParameters(invocationHttpParameters);
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
        if (getBasicAuthParameters() != null)
            sb.append("BasicAuthParameters: ").append(getBasicAuthParameters()).append(",");
        if (getOAuthParameters() != null)
            sb.append("OAuthParameters: ").append(getOAuthParameters()).append(",");
        if (getApiKeyAuthParameters() != null)
            sb.append("ApiKeyAuthParameters: ").append(getApiKeyAuthParameters()).append(",");
        if (getInvocationHttpParameters() != null)
            sb.append("InvocationHttpParameters: ").append(getInvocationHttpParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectionAuthRequestParameters == false)
            return false;
        UpdateConnectionAuthRequestParameters other = (UpdateConnectionAuthRequestParameters) obj;
        if (other.getBasicAuthParameters() == null ^ this.getBasicAuthParameters() == null)
            return false;
        if (other.getBasicAuthParameters() != null && other.getBasicAuthParameters().equals(this.getBasicAuthParameters()) == false)
            return false;
        if (other.getOAuthParameters() == null ^ this.getOAuthParameters() == null)
            return false;
        if (other.getOAuthParameters() != null && other.getOAuthParameters().equals(this.getOAuthParameters()) == false)
            return false;
        if (other.getApiKeyAuthParameters() == null ^ this.getApiKeyAuthParameters() == null)
            return false;
        if (other.getApiKeyAuthParameters() != null && other.getApiKeyAuthParameters().equals(this.getApiKeyAuthParameters()) == false)
            return false;
        if (other.getInvocationHttpParameters() == null ^ this.getInvocationHttpParameters() == null)
            return false;
        if (other.getInvocationHttpParameters() != null && other.getInvocationHttpParameters().equals(this.getInvocationHttpParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasicAuthParameters() == null) ? 0 : getBasicAuthParameters().hashCode());
        hashCode = prime * hashCode + ((getOAuthParameters() == null) ? 0 : getOAuthParameters().hashCode());
        hashCode = prime * hashCode + ((getApiKeyAuthParameters() == null) ? 0 : getApiKeyAuthParameters().hashCode());
        hashCode = prime * hashCode + ((getInvocationHttpParameters() == null) ? 0 : getInvocationHttpParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectionAuthRequestParameters clone() {
        try {
            return (UpdateConnectionAuthRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.UpdateConnectionAuthRequestParametersMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
