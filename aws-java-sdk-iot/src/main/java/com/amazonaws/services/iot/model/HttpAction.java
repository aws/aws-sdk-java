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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Send data to an HTTPS endpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must also specify a
     * <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the
     * endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If
     * you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that
     * match each possible value of the substituion template before traffic is allowed to your endpoint URL.
     * </p>
     */
    private String confirmationUrl;
    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     */
    private java.util.List<HttpActionHeader> headers;
    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     */
    private HttpAuthorization auth;

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must also specify a
     * <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * 
     * @param url
     *        The endpoint URL. If substitution templates are used in the URL, you must also specify a
     *        <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is
     *        created if possible.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must also specify a
     * <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * 
     * @return The endpoint URL. If substitution templates are used in the URL, you must also specify a
     *         <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is
     *         created if possible.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The endpoint URL. If substitution templates are used in the URL, you must also specify a
     * <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is created if
     * possible.
     * </p>
     * 
     * @param url
     *        The endpoint URL. If substitution templates are used in the URL, you must also specify a
     *        <code>confirmationUrl</code>. If this is a new destination, a new <code>TopicRuleDestination</code> is
     *        created if possible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpAction withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the
     * endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If
     * you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that
     * match each possible value of the substituion template before traffic is allowed to your endpoint URL.
     * </p>
     * 
     * @param confirmationUrl
     *        The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix
     *        of the endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the
     *        confirmation URL. If you use substitution templates in the confirmationUrl, you must create and enable
     *        topic rule destinations that match each possible value of the substituion template before traffic is
     *        allowed to your endpoint URL.
     */

    public void setConfirmationUrl(String confirmationUrl) {
        this.confirmationUrl = confirmationUrl;
    }

    /**
     * <p>
     * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the
     * endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If
     * you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that
     * match each possible value of the substituion template before traffic is allowed to your endpoint URL.
     * </p>
     * 
     * @return The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix
     *         of the endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the
     *         confirmation URL. If you use substitution templates in the confirmationUrl, you must create and enable
     *         topic rule destinations that match each possible value of the substituion template before traffic is
     *         allowed to your endpoint URL.
     */

    public String getConfirmationUrl() {
        return this.confirmationUrl;
    }

    /**
     * <p>
     * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the
     * endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If
     * you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that
     * match each possible value of the substituion template before traffic is allowed to your endpoint URL.
     * </p>
     * 
     * @param confirmationUrl
     *        The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix
     *        of the endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the
     *        confirmation URL. If you use substitution templates in the confirmationUrl, you must create and enable
     *        topic rule destinations that match each possible value of the substituion template before traffic is
     *        allowed to your endpoint URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpAction withConfirmationUrl(String confirmationUrl) {
        setConfirmationUrl(confirmationUrl);
        return this;
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     * 
     * @return The HTTP headers to send with the message data.
     */

    public java.util.List<HttpActionHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     * 
     * @param headers
     *        The HTTP headers to send with the message data.
     */

    public void setHeaders(java.util.Collection<HttpActionHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HttpActionHeader>(headers);
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        The HTTP headers to send with the message data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpAction withHeaders(HttpActionHeader... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<HttpActionHeader>(headers.length));
        }
        for (HttpActionHeader ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The HTTP headers to send with the message data.
     * </p>
     * 
     * @param headers
     *        The HTTP headers to send with the message data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpAction withHeaders(java.util.Collection<HttpActionHeader> headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     * 
     * @param auth
     *        The authentication method to use when sending data to an HTTPS endpoint.
     */

    public void setAuth(HttpAuthorization auth) {
        this.auth = auth;
    }

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     * 
     * @return The authentication method to use when sending data to an HTTPS endpoint.
     */

    public HttpAuthorization getAuth() {
        return this.auth;
    }

    /**
     * <p>
     * The authentication method to use when sending data to an HTTPS endpoint.
     * </p>
     * 
     * @param auth
     *        The authentication method to use when sending data to an HTTPS endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpAction withAuth(HttpAuthorization auth) {
        setAuth(auth);
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
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getConfirmationUrl() != null)
            sb.append("ConfirmationUrl: ").append(getConfirmationUrl()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders()).append(",");
        if (getAuth() != null)
            sb.append("Auth: ").append(getAuth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpAction == false)
            return false;
        HttpAction other = (HttpAction) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getConfirmationUrl() == null ^ this.getConfirmationUrl() == null)
            return false;
        if (other.getConfirmationUrl() != null && other.getConfirmationUrl().equals(this.getConfirmationUrl()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        if (other.getAuth() == null ^ this.getAuth() == null)
            return false;
        if (other.getAuth() != null && other.getAuth().equals(this.getAuth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getConfirmationUrl() == null) ? 0 : getConfirmationUrl().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        hashCode = prime * hashCode + ((getAuth() == null) ? 0 : getAuth().hashCode());
        return hashCode;
    }

    @Override
    public HttpAction clone() {
        try {
            return (HttpAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.HttpActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
