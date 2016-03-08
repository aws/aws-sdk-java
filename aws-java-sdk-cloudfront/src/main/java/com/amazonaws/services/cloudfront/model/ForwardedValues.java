/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that specifies how CloudFront handles query strings, cookies
 * and headers.
 */
public class ForwardedValues implements Serializable, Cloneable {

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify true;
     * if not, specify false.
     */
    private Boolean queryString;
    /** A complex type that specifies how CloudFront handles cookies. */
    private CookiePreference cookies;
    /**
     * A complex type that specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior.
     */
    private Headers headers;

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify true;
     * if not, specify false.
     * 
     * @param queryString
     *        Indicates whether you want CloudFront to forward query strings to
     *        the origin that is associated with this cache behavior. If so,
     *        specify true; if not, specify false.
     */

    public void setQueryString(Boolean queryString) {
        this.queryString = queryString;
    }

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify true;
     * if not, specify false.
     * 
     * @return Indicates whether you want CloudFront to forward query strings to
     *         the origin that is associated with this cache behavior. If so,
     *         specify true; if not, specify false.
     */

    public Boolean getQueryString() {
        return this.queryString;
    }

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify true;
     * if not, specify false.
     * 
     * @param queryString
     *        Indicates whether you want CloudFront to forward query strings to
     *        the origin that is associated with this cache behavior. If so,
     *        specify true; if not, specify false.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ForwardedValues withQueryString(Boolean queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * Indicates whether you want CloudFront to forward query strings to the
     * origin that is associated with this cache behavior. If so, specify true;
     * if not, specify false.
     * 
     * @return Indicates whether you want CloudFront to forward query strings to
     *         the origin that is associated with this cache behavior. If so,
     *         specify true; if not, specify false.
     */

    public Boolean isQueryString() {
        return this.queryString;
    }

    /**
     * A complex type that specifies how CloudFront handles cookies.
     * 
     * @param cookies
     *        A complex type that specifies how CloudFront handles cookies.
     */

    public void setCookies(CookiePreference cookies) {
        this.cookies = cookies;
    }

    /**
     * A complex type that specifies how CloudFront handles cookies.
     * 
     * @return A complex type that specifies how CloudFront handles cookies.
     */

    public CookiePreference getCookies() {
        return this.cookies;
    }

    /**
     * A complex type that specifies how CloudFront handles cookies.
     * 
     * @param cookies
     *        A complex type that specifies how CloudFront handles cookies.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ForwardedValues withCookies(CookiePreference cookies) {
        setCookies(cookies);
        return this;
    }

    /**
     * A complex type that specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior.
     * 
     * @param headers
     *        A complex type that specifies the Headers, if any, that you want
     *        CloudFront to vary upon for this cache behavior.
     */

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    /**
     * A complex type that specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior.
     * 
     * @return A complex type that specifies the Headers, if any, that you want
     *         CloudFront to vary upon for this cache behavior.
     */

    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * A complex type that specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior.
     * 
     * @param headers
     *        A complex type that specifies the Headers, if any, that you want
     *        CloudFront to vary upon for this cache behavior.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ForwardedValues withHeaders(Headers headers) {
        setHeaders(headers);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getQueryString() != null)
            sb.append("QueryString: " + getQueryString() + ",");
        if (getCookies() != null)
            sb.append("Cookies: " + getCookies() + ",");
        if (getHeaders() != null)
            sb.append("Headers: " + getHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForwardedValues == false)
            return false;
        ForwardedValues other = (ForwardedValues) obj;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null
                && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getCookies() == null ^ this.getCookies() == null)
            return false;
        if (other.getCookies() != null
                && other.getCookies().equals(this.getCookies()) == false)
            return false;
        if (other.getHeaders() == null ^ this.getHeaders() == null)
            return false;
        if (other.getHeaders() != null
                && other.getHeaders().equals(this.getHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode
                + ((getCookies() == null) ? 0 : getCookies().hashCode());
        hashCode = prime * hashCode
                + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return hashCode;
    }

    @Override
    public ForwardedValues clone() {
        try {
            return (ForwardedValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
