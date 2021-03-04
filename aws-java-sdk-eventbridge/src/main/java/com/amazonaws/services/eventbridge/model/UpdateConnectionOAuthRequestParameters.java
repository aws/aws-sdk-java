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
 * Contains the OAuth request parameters to use for the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UpdateConnectionOAuthRequestParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectionOAuthRequestParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to use for
     * the connection when OAuth is specified as the authorization type.
     * </p>
     */
    private UpdateConnectionOAuthClientRequestParameters clientParameters;
    /**
     * <p>
     * The URL to the authorization endpoint when OAuth is specified as the authorization type.
     * </p>
     */
    private String authorizationEndpoint;
    /**
     * <p>
     * The method used to connect to the HTTP endpoint.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The additional HTTP parameters used for the OAuth authorization request.
     * </p>
     */
    private ConnectionHttpParameters oAuthHttpParameters;

    /**
     * <p>
     * A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to use for
     * the connection when OAuth is specified as the authorization type.
     * </p>
     * 
     * @param clientParameters
     *        A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to
     *        use for the connection when OAuth is specified as the authorization type.
     */

    public void setClientParameters(UpdateConnectionOAuthClientRequestParameters clientParameters) {
        this.clientParameters = clientParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to use for
     * the connection when OAuth is specified as the authorization type.
     * </p>
     * 
     * @return A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to
     *         use for the connection when OAuth is specified as the authorization type.
     */

    public UpdateConnectionOAuthClientRequestParameters getClientParameters() {
        return this.clientParameters;
    }

    /**
     * <p>
     * A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to use for
     * the connection when OAuth is specified as the authorization type.
     * </p>
     * 
     * @param clientParameters
     *        A <code>UpdateConnectionOAuthClientRequestParameters</code> object that contains the client parameters to
     *        use for the connection when OAuth is specified as the authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionOAuthRequestParameters withClientParameters(UpdateConnectionOAuthClientRequestParameters clientParameters) {
        setClientParameters(clientParameters);
        return this;
    }

    /**
     * <p>
     * The URL to the authorization endpoint when OAuth is specified as the authorization type.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The URL to the authorization endpoint when OAuth is specified as the authorization type.
     */

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * <p>
     * The URL to the authorization endpoint when OAuth is specified as the authorization type.
     * </p>
     * 
     * @return The URL to the authorization endpoint when OAuth is specified as the authorization type.
     */

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * <p>
     * The URL to the authorization endpoint when OAuth is specified as the authorization type.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The URL to the authorization endpoint when OAuth is specified as the authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionOAuthRequestParameters withAuthorizationEndpoint(String authorizationEndpoint) {
        setAuthorizationEndpoint(authorizationEndpoint);
        return this;
    }

    /**
     * <p>
     * The method used to connect to the HTTP endpoint.
     * </p>
     * 
     * @param httpMethod
     *        The method used to connect to the HTTP endpoint.
     * @see ConnectionOAuthHttpMethod
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The method used to connect to the HTTP endpoint.
     * </p>
     * 
     * @return The method used to connect to the HTTP endpoint.
     * @see ConnectionOAuthHttpMethod
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The method used to connect to the HTTP endpoint.
     * </p>
     * 
     * @param httpMethod
     *        The method used to connect to the HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionOAuthHttpMethod
     */

    public UpdateConnectionOAuthRequestParameters withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method used to connect to the HTTP endpoint.
     * </p>
     * 
     * @param httpMethod
     *        The method used to connect to the HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionOAuthHttpMethod
     */

    public UpdateConnectionOAuthRequestParameters withHttpMethod(ConnectionOAuthHttpMethod httpMethod) {
        this.httpMethod = httpMethod.toString();
        return this;
    }

    /**
     * <p>
     * The additional HTTP parameters used for the OAuth authorization request.
     * </p>
     * 
     * @param oAuthHttpParameters
     *        The additional HTTP parameters used for the OAuth authorization request.
     */

    public void setOAuthHttpParameters(ConnectionHttpParameters oAuthHttpParameters) {
        this.oAuthHttpParameters = oAuthHttpParameters;
    }

    /**
     * <p>
     * The additional HTTP parameters used for the OAuth authorization request.
     * </p>
     * 
     * @return The additional HTTP parameters used for the OAuth authorization request.
     */

    public ConnectionHttpParameters getOAuthHttpParameters() {
        return this.oAuthHttpParameters;
    }

    /**
     * <p>
     * The additional HTTP parameters used for the OAuth authorization request.
     * </p>
     * 
     * @param oAuthHttpParameters
     *        The additional HTTP parameters used for the OAuth authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionOAuthRequestParameters withOAuthHttpParameters(ConnectionHttpParameters oAuthHttpParameters) {
        setOAuthHttpParameters(oAuthHttpParameters);
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
        if (getClientParameters() != null)
            sb.append("ClientParameters: ").append(getClientParameters()).append(",");
        if (getAuthorizationEndpoint() != null)
            sb.append("AuthorizationEndpoint: ").append(getAuthorizationEndpoint()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getOAuthHttpParameters() != null)
            sb.append("OAuthHttpParameters: ").append(getOAuthHttpParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectionOAuthRequestParameters == false)
            return false;
        UpdateConnectionOAuthRequestParameters other = (UpdateConnectionOAuthRequestParameters) obj;
        if (other.getClientParameters() == null ^ this.getClientParameters() == null)
            return false;
        if (other.getClientParameters() != null && other.getClientParameters().equals(this.getClientParameters()) == false)
            return false;
        if (other.getAuthorizationEndpoint() == null ^ this.getAuthorizationEndpoint() == null)
            return false;
        if (other.getAuthorizationEndpoint() != null && other.getAuthorizationEndpoint().equals(this.getAuthorizationEndpoint()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getOAuthHttpParameters() == null ^ this.getOAuthHttpParameters() == null)
            return false;
        if (other.getOAuthHttpParameters() != null && other.getOAuthHttpParameters().equals(this.getOAuthHttpParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientParameters() == null) ? 0 : getClientParameters().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationEndpoint() == null) ? 0 : getAuthorizationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getOAuthHttpParameters() == null) ? 0 : getOAuthHttpParameters().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectionOAuthRequestParameters clone() {
        try {
            return (UpdateConnectionOAuthRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.UpdateConnectionOAuthRequestParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
