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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <note>
 * <p>
 * This is the latest version of <b>AWS WAF</b>, named AWS WAFV2, released in November, 2019. For information, including
 * how to migrate your AWS WAF resources from the prior release, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * Part of the response from <a>GetSampledRequests</a>. This is a complex type that appears as <code>Request</code> in
 * the response syntax. <code>HTTPRequest</code> contains information about one of the web requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/HTTPRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HTTPRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address that the request originated from. If the web ACL is associated with a CloudFront distribution,
     * this is the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * </ul>
     */
    private String clientIP;
    /**
     * <p>
     * The two-letter country code for the country that the request originated from. For a current list of country
     * codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The URI path of the request, which identifies the resource, for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     */
    private String uRI;
    /**
     * <p>
     * The HTTP method specified in the sampled web request.
     * </p>
     */
    private String method;
    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     * </p>
     */
    private String hTTPVersion;
    /**
     * <p>
     * A complex type that contains the name and value for each header in the sampled web request.
     * </p>
     */
    private java.util.List<HTTPHeader> headers;

    /**
     * <p>
     * The IP address that the request originated from. If the web ACL is associated with a CloudFront distribution,
     * this is the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * </ul>
     * 
     * @param clientIP
     *        The IP address that the request originated from. If the web ACL is associated with a CloudFront
     *        distribution, this is the value of one of the following fields in CloudFront access logs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     *        </p>
     *        </li>
     */

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    /**
     * <p>
     * The IP address that the request originated from. If the web ACL is associated with a CloudFront distribution,
     * this is the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * </ul>
     * 
     * @return The IP address that the request originated from. If the web ACL is associated with a CloudFront
     *         distribution, this is the value of one of the following fields in CloudFront access logs:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     *         </p>
     *         </li>
     */

    public String getClientIP() {
        return this.clientIP;
    }

    /**
     * <p>
     * The IP address that the request originated from. If the web ACL is associated with a CloudFront distribution,
     * this is the value of one of the following fields in CloudFront access logs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     * </p>
     * </li>
     * </ul>
     * 
     * @param clientIP
     *        The IP address that the request originated from. If the web ACL is associated with a CloudFront
     *        distribution, this is the value of one of the following fields in CloudFront access logs:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>c-ip</code>, if the viewer did not use an HTTP proxy or a load balancer to send the request
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>x-forwarded-for</code>, if the viewer did use an HTTP proxy or a load balancer to send the request
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withClientIP(String clientIP) {
        setClientIP(clientIP);
        return this;
    }

    /**
     * <p>
     * The two-letter country code for the country that the request originated from. For a current list of country
     * codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param country
     *        The two-letter country code for the country that the request originated from. For a current list of
     *        country codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *        3166-1 alpha-2</a>.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The two-letter country code for the country that the request originated from. For a current list of country
     * codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
     * </p>
     * 
     * @return The two-letter country code for the country that the request originated from. For a current list of
     *         country codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *         3166-1 alpha-2</a>.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The two-letter country code for the country that the request originated from. For a current list of country
     * codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param country
     *        The two-letter country code for the country that the request originated from. For a current list of
     *        country codes, see the Wikipedia entry <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     *        3166-1 alpha-2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The URI path of the request, which identifies the resource, for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @param uRI
     *        The URI path of the request, which identifies the resource, for example, <code>/images/daily-ad.jpg</code>
     *        .
     */

    public void setURI(String uRI) {
        this.uRI = uRI;
    }

    /**
     * <p>
     * The URI path of the request, which identifies the resource, for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @return The URI path of the request, which identifies the resource, for example,
     *         <code>/images/daily-ad.jpg</code>.
     */

    public String getURI() {
        return this.uRI;
    }

    /**
     * <p>
     * The URI path of the request, which identifies the resource, for example, <code>/images/daily-ad.jpg</code>.
     * </p>
     * 
     * @param uRI
     *        The URI path of the request, which identifies the resource, for example, <code>/images/daily-ad.jpg</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withURI(String uRI) {
        setURI(uRI);
        return this;
    }

    /**
     * <p>
     * The HTTP method specified in the sampled web request.
     * </p>
     * 
     * @param method
     *        The HTTP method specified in the sampled web request.
     */

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * <p>
     * The HTTP method specified in the sampled web request.
     * </p>
     * 
     * @return The HTTP method specified in the sampled web request.
     */

    public String getMethod() {
        return this.method;
    }

    /**
     * <p>
     * The HTTP method specified in the sampled web request.
     * </p>
     * 
     * @param method
     *        The HTTP method specified in the sampled web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withMethod(String method) {
        setMethod(method);
        return this;
    }

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     * </p>
     * 
     * @param hTTPVersion
     *        The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     */

    public void setHTTPVersion(String hTTPVersion) {
        this.hTTPVersion = hTTPVersion;
    }

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     * </p>
     * 
     * @return The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     */

    public String getHTTPVersion() {
        return this.hTTPVersion;
    }

    /**
     * <p>
     * The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     * </p>
     * 
     * @param hTTPVersion
     *        The HTTP version specified in the sampled web request, for example, <code>HTTP/1.1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withHTTPVersion(String hTTPVersion) {
        setHTTPVersion(hTTPVersion);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the name and value for each header in the sampled web request.
     * </p>
     * 
     * @return A complex type that contains the name and value for each header in the sampled web request.
     */

    public java.util.List<HTTPHeader> getHeaders() {
        return headers;
    }

    /**
     * <p>
     * A complex type that contains the name and value for each header in the sampled web request.
     * </p>
     * 
     * @param headers
     *        A complex type that contains the name and value for each header in the sampled web request.
     */

    public void setHeaders(java.util.Collection<HTTPHeader> headers) {
        if (headers == null) {
            this.headers = null;
            return;
        }

        this.headers = new java.util.ArrayList<HTTPHeader>(headers);
    }

    /**
     * <p>
     * A complex type that contains the name and value for each header in the sampled web request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaders(java.util.Collection)} or {@link #withHeaders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param headers
     *        A complex type that contains the name and value for each header in the sampled web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withHeaders(HTTPHeader... headers) {
        if (this.headers == null) {
            setHeaders(new java.util.ArrayList<HTTPHeader>(headers.length));
        }
        for (HTTPHeader ele : headers) {
            this.headers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains the name and value for each header in the sampled web request.
     * </p>
     * 
     * @param headers
     *        A complex type that contains the name and value for each header in the sampled web request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HTTPRequest withHeaders(java.util.Collection<HTTPHeader> headers) {
        setHeaders(headers);
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
        if (getClientIP() != null)
            sb.append("ClientIP: ").append(getClientIP()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getURI() != null)
            sb.append("URI: ").append(getURI()).append(",");
        if (getMethod() != null)
            sb.append("Method: ").append(getMethod()).append(",");
        if (getHTTPVersion() != null)
            sb.append("HTTPVersion: ").append(getHTTPVersion()).append(",");
        if (getHeaders() != null)
            sb.append("Headers: ").append(getHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HTTPRequest == false)
            return false;
        HTTPRequest other = (HTTPRequest) obj;
        if (other.getClientIP() == null ^ this.getClientIP() == null)
            return false;
        if (other.getClientIP() != null && other.getClientIP().equals(this.getClientIP()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getURI() == null ^ this.getURI() == null)
            return false;
        if (other.getURI() != null && other.getURI().equals(this.getURI()) == false)
            return false;
        if (other.getMethod() == null ^ this.getMethod() == null)
            return false;
        if (other.getMethod() != null && other.getMethod().equals(this.getMethod()) == false)
            return false;
        if (other.getHTTPVersion() == null ^ this.getHTTPVersion() == null)
            return false;
        if (other.getHTTPVersion() != null && other.getHTTPVersion().equals(this.getHTTPVersion()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientIP() == null) ? 0 : getClientIP().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getURI() == null) ? 0 : getURI().hashCode());
        hashCode = prime * hashCode + ((getMethod() == null) ? 0 : getMethod().hashCode());
        hashCode = prime * hashCode + ((getHTTPVersion() == null) ? 0 : getHTTPVersion().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return hashCode;
    }

    @Override
    public HTTPRequest clone() {
        try {
            return (HTTPRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.HTTPRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
