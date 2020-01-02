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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestInvokeAuthorizerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     */
    private String authorizerName;
    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     */
    private String token;
    /**
     * <p>
     * The signature made with the token and your custom authentication service's private key.
     * </p>
     */
    private String tokenSignature;
    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     */
    private HttpContext httpContext;
    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     */
    private MqttContext mqttContext;
    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     */
    private TlsContext tlsContext;

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * 
     * @param authorizerName
     *        The custom authorizer name.
     */

    public void setAuthorizerName(String authorizerName) {
        this.authorizerName = authorizerName;
    }

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * 
     * @return The custom authorizer name.
     */

    public String getAuthorizerName() {
        return this.authorizerName;
    }

    /**
     * <p>
     * The custom authorizer name.
     * </p>
     * 
     * @param authorizerName
     *        The custom authorizer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withAuthorizerName(String authorizerName) {
        setAuthorizerName(authorizerName);
        return this;
    }

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * 
     * @param token
     *        The token returned by your custom authentication service.
     */

    public void setToken(String token) {
        this.token = token;
    }

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * 
     * @return The token returned by your custom authentication service.
     */

    public String getToken() {
        return this.token;
    }

    /**
     * <p>
     * The token returned by your custom authentication service.
     * </p>
     * 
     * @param token
     *        The token returned by your custom authentication service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withToken(String token) {
        setToken(token);
        return this;
    }

    /**
     * <p>
     * The signature made with the token and your custom authentication service's private key.
     * </p>
     * 
     * @param tokenSignature
     *        The signature made with the token and your custom authentication service's private key.
     */

    public void setTokenSignature(String tokenSignature) {
        this.tokenSignature = tokenSignature;
    }

    /**
     * <p>
     * The signature made with the token and your custom authentication service's private key.
     * </p>
     * 
     * @return The signature made with the token and your custom authentication service's private key.
     */

    public String getTokenSignature() {
        return this.tokenSignature;
    }

    /**
     * <p>
     * The signature made with the token and your custom authentication service's private key.
     * </p>
     * 
     * @param tokenSignature
     *        The signature made with the token and your custom authentication service's private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withTokenSignature(String tokenSignature) {
        setTokenSignature(tokenSignature);
        return this;
    }

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     * 
     * @param httpContext
     *        Specifies a test HTTP authorization request.
     */

    public void setHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
    }

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     * 
     * @return Specifies a test HTTP authorization request.
     */

    public HttpContext getHttpContext() {
        return this.httpContext;
    }

    /**
     * <p>
     * Specifies a test HTTP authorization request.
     * </p>
     * 
     * @param httpContext
     *        Specifies a test HTTP authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withHttpContext(HttpContext httpContext) {
        setHttpContext(httpContext);
        return this;
    }

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     * 
     * @param mqttContext
     *        Specifies a test MQTT authorization request.
     */

    public void setMqttContext(MqttContext mqttContext) {
        this.mqttContext = mqttContext;
    }

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     * 
     * @return Specifies a test MQTT authorization request.
     */

    public MqttContext getMqttContext() {
        return this.mqttContext;
    }

    /**
     * <p>
     * Specifies a test MQTT authorization request.
     * </p>
     * 
     * @param mqttContext
     *        Specifies a test MQTT authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withMqttContext(MqttContext mqttContext) {
        setMqttContext(mqttContext);
        return this;
    }

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     * 
     * @param tlsContext
     *        Specifies a test TLS authorization request.
     */

    public void setTlsContext(TlsContext tlsContext) {
        this.tlsContext = tlsContext;
    }

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     * 
     * @return Specifies a test TLS authorization request.
     */

    public TlsContext getTlsContext() {
        return this.tlsContext;
    }

    /**
     * <p>
     * Specifies a test TLS authorization request.
     * </p>
     * 
     * @param tlsContext
     *        Specifies a test TLS authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestInvokeAuthorizerRequest withTlsContext(TlsContext tlsContext) {
        setTlsContext(tlsContext);
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
        if (getAuthorizerName() != null)
            sb.append("AuthorizerName: ").append(getAuthorizerName()).append(",");
        if (getToken() != null)
            sb.append("Token: ").append(getToken()).append(",");
        if (getTokenSignature() != null)
            sb.append("TokenSignature: ").append(getTokenSignature()).append(",");
        if (getHttpContext() != null)
            sb.append("HttpContext: ").append(getHttpContext()).append(",");
        if (getMqttContext() != null)
            sb.append("MqttContext: ").append(getMqttContext()).append(",");
        if (getTlsContext() != null)
            sb.append("TlsContext: ").append(getTlsContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestInvokeAuthorizerRequest == false)
            return false;
        TestInvokeAuthorizerRequest other = (TestInvokeAuthorizerRequest) obj;
        if (other.getAuthorizerName() == null ^ this.getAuthorizerName() == null)
            return false;
        if (other.getAuthorizerName() != null && other.getAuthorizerName().equals(this.getAuthorizerName()) == false)
            return false;
        if (other.getToken() == null ^ this.getToken() == null)
            return false;
        if (other.getToken() != null && other.getToken().equals(this.getToken()) == false)
            return false;
        if (other.getTokenSignature() == null ^ this.getTokenSignature() == null)
            return false;
        if (other.getTokenSignature() != null && other.getTokenSignature().equals(this.getTokenSignature()) == false)
            return false;
        if (other.getHttpContext() == null ^ this.getHttpContext() == null)
            return false;
        if (other.getHttpContext() != null && other.getHttpContext().equals(this.getHttpContext()) == false)
            return false;
        if (other.getMqttContext() == null ^ this.getMqttContext() == null)
            return false;
        if (other.getMqttContext() != null && other.getMqttContext().equals(this.getMqttContext()) == false)
            return false;
        if (other.getTlsContext() == null ^ this.getTlsContext() == null)
            return false;
        if (other.getTlsContext() != null && other.getTlsContext().equals(this.getTlsContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerName() == null) ? 0 : getAuthorizerName().hashCode());
        hashCode = prime * hashCode + ((getToken() == null) ? 0 : getToken().hashCode());
        hashCode = prime * hashCode + ((getTokenSignature() == null) ? 0 : getTokenSignature().hashCode());
        hashCode = prime * hashCode + ((getHttpContext() == null) ? 0 : getHttpContext().hashCode());
        hashCode = prime * hashCode + ((getMqttContext() == null) ? 0 : getMqttContext().hashCode());
        hashCode = prime * hashCode + ((getTlsContext() == null) ? 0 : getTlsContext().hashCode());
        return hashCode;
    }

    @Override
    public TestInvokeAuthorizerRequest clone() {
        return (TestInvokeAuthorizerRequest) super.clone();
    }

}
