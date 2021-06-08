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
 * Contains the authorization parameters for the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateConnectionAuthRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionAuthRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization parameters
     * to use for the connection.
     * </p>
     */
    private CreateConnectionBasicAuthRequestParameters basicAuthParameters;
    /**
     * <p>
     * A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization parameters to
     * use for the connection.
     * </p>
     */
    private CreateConnectionOAuthRequestParameters oAuthParameters;
    /**
     * <p>
     * A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     * parameters to use for the connection.
     * </p>
     */
    private CreateConnectionApiKeyAuthRequestParameters apiKeyAuthParameters;
    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use for the
     * connection. Note that if you include additional parameters for the target of a rule via
     * <code>HttpParameters</code>, including query strings, the parameters added for the connection take precedence.
     * </p>
     */
    private ConnectionHttpParameters invocationHttpParameters;

    /**
     * <p>
     * A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization parameters
     * to use for the connection.
     * </p>
     * 
     * @param basicAuthParameters
     *        A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization
     *        parameters to use for the connection.
     */

    public void setBasicAuthParameters(CreateConnectionBasicAuthRequestParameters basicAuthParameters) {
        this.basicAuthParameters = basicAuthParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization parameters
     * to use for the connection.
     * </p>
     * 
     * @return A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization
     *         parameters to use for the connection.
     */

    public CreateConnectionBasicAuthRequestParameters getBasicAuthParameters() {
        return this.basicAuthParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization parameters
     * to use for the connection.
     * </p>
     * 
     * @param basicAuthParameters
     *        A <code>CreateConnectionBasicAuthRequestParameters</code> object that contains the Basic authorization
     *        parameters to use for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAuthRequestParameters withBasicAuthParameters(CreateConnectionBasicAuthRequestParameters basicAuthParameters) {
        setBasicAuthParameters(basicAuthParameters);
        return this;
    }

    /**
     * <p>
     * A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization parameters to
     * use for the connection.
     * </p>
     * 
     * @param oAuthParameters
     *        A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization
     *        parameters to use for the connection.
     */

    public void setOAuthParameters(CreateConnectionOAuthRequestParameters oAuthParameters) {
        this.oAuthParameters = oAuthParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization parameters to
     * use for the connection.
     * </p>
     * 
     * @return A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization
     *         parameters to use for the connection.
     */

    public CreateConnectionOAuthRequestParameters getOAuthParameters() {
        return this.oAuthParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization parameters to
     * use for the connection.
     * </p>
     * 
     * @param oAuthParameters
     *        A <code>CreateConnectionOAuthRequestParameters</code> object that contains the OAuth authorization
     *        parameters to use for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAuthRequestParameters withOAuthParameters(CreateConnectionOAuthRequestParameters oAuthParameters) {
        setOAuthParameters(oAuthParameters);
        return this;
    }

    /**
     * <p>
     * A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     * parameters to use for the connection.
     * </p>
     * 
     * @param apiKeyAuthParameters
     *        A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     *        parameters to use for the connection.
     */

    public void setApiKeyAuthParameters(CreateConnectionApiKeyAuthRequestParameters apiKeyAuthParameters) {
        this.apiKeyAuthParameters = apiKeyAuthParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     * parameters to use for the connection.
     * </p>
     * 
     * @return A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     *         parameters to use for the connection.
     */

    public CreateConnectionApiKeyAuthRequestParameters getApiKeyAuthParameters() {
        return this.apiKeyAuthParameters;
    }

    /**
     * <p>
     * A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     * parameters to use for the connection.
     * </p>
     * 
     * @param apiKeyAuthParameters
     *        A <code>CreateConnectionApiKeyAuthRequestParameters</code> object that contains the API key authorization
     *        parameters to use for the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAuthRequestParameters withApiKeyAuthParameters(CreateConnectionApiKeyAuthRequestParameters apiKeyAuthParameters) {
        setApiKeyAuthParameters(apiKeyAuthParameters);
        return this;
    }

    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use for the
     * connection. Note that if you include additional parameters for the target of a rule via
     * <code>HttpParameters</code>, including query strings, the parameters added for the connection take precedence.
     * </p>
     * 
     * @param invocationHttpParameters
     *        A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use
     *        for the connection. Note that if you include additional parameters for the target of a rule via
     *        <code>HttpParameters</code>, including query strings, the parameters added for the connection take
     *        precedence.
     */

    public void setInvocationHttpParameters(ConnectionHttpParameters invocationHttpParameters) {
        this.invocationHttpParameters = invocationHttpParameters;
    }

    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use for the
     * connection. Note that if you include additional parameters for the target of a rule via
     * <code>HttpParameters</code>, including query strings, the parameters added for the connection take precedence.
     * </p>
     * 
     * @return A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use
     *         for the connection. Note that if you include additional parameters for the target of a rule via
     *         <code>HttpParameters</code>, including query strings, the parameters added for the connection take
     *         precedence.
     */

    public ConnectionHttpParameters getInvocationHttpParameters() {
        return this.invocationHttpParameters;
    }

    /**
     * <p>
     * A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use for the
     * connection. Note that if you include additional parameters for the target of a rule via
     * <code>HttpParameters</code>, including query strings, the parameters added for the connection take precedence.
     * </p>
     * 
     * @param invocationHttpParameters
     *        A <code>ConnectionHttpParameters</code> object that contains the API key authorization parameters to use
     *        for the connection. Note that if you include additional parameters for the target of a rule via
     *        <code>HttpParameters</code>, including query strings, the parameters added for the connection take
     *        precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionAuthRequestParameters withInvocationHttpParameters(ConnectionHttpParameters invocationHttpParameters) {
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

        if (obj instanceof CreateConnectionAuthRequestParameters == false)
            return false;
        CreateConnectionAuthRequestParameters other = (CreateConnectionAuthRequestParameters) obj;
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
    public CreateConnectionAuthRequestParameters clone() {
        try {
            return (CreateConnectionAuthRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.CreateConnectionAuthRequestParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
