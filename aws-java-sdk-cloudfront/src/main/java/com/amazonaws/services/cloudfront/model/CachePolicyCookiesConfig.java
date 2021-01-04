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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache
 * key and automatically included in requests that CloudFront sends to the origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CachePolicyCookiesConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CachePolicyCookiesConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in
     * requests that CloudFront sends to the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     * included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>, any
     * cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     * <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     * CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     */
    private String cookieBehavior;

    private CookieNames cookies;

    /**
     * <p>
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in
     * requests that CloudFront sends to the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     * included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>, any
     * cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     * <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     * CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cookieBehavior
     *        Determines whether any cookies in viewer requests are included in the cache key and automatically included
     *        in requests that CloudFront sends to the origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     *        included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>
     *        , any cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin
     *        requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *        type are included in the cache key and automatically included in requests that CloudFront sends to the
     *        origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     *        <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     *        CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically
     *        included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     * @see CachePolicyCookieBehavior
     */

    public void setCookieBehavior(String cookieBehavior) {
        this.cookieBehavior = cookieBehavior;
    }

    /**
     * <p>
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in
     * requests that CloudFront sends to the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     * included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>, any
     * cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     * <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     * CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines whether any cookies in viewer requests are included in the cache key and automatically
     *         included in requests that CloudFront sends to the origin. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>none</code> – Cookies in viewer requests are not included in the cache key and are not
     *         automatically included in requests that CloudFront sends to the origin. Even when this field is set to
     *         <code>none</code>, any cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included
     *         in origin requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *         type are included in the cache key and automatically included in requests that CloudFront sends to the
     *         origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     *         <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     *         CloudFront sends to the origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically
     *         included in requests that CloudFront sends to the origin.
     *         </p>
     *         </li>
     * @see CachePolicyCookieBehavior
     */

    public String getCookieBehavior() {
        return this.cookieBehavior;
    }

    /**
     * <p>
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in
     * requests that CloudFront sends to the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     * included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>, any
     * cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     * <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     * CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cookieBehavior
     *        Determines whether any cookies in viewer requests are included in the cache key and automatically included
     *        in requests that CloudFront sends to the origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     *        included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>
     *        , any cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin
     *        requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *        type are included in the cache key and automatically included in requests that CloudFront sends to the
     *        origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     *        <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     *        CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically
     *        included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CachePolicyCookieBehavior
     */

    public CachePolicyCookiesConfig withCookieBehavior(String cookieBehavior) {
        setCookieBehavior(cookieBehavior);
        return this;
    }

    /**
     * <p>
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in
     * requests that CloudFront sends to the origin. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     * included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>, any
     * cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code> type are
     * included in the cache key and automatically included in requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     * <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     * CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cookieBehavior
     *        Determines whether any cookies in viewer requests are included in the cache key and automatically included
     *        in requests that CloudFront sends to the origin. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – Cookies in viewer requests are not included in the cache key and are not automatically
     *        included in requests that CloudFront sends to the origin. Even when this field is set to <code>none</code>
     *        , any cookies that are listed in an <code>OriginRequestPolicy</code> <i>are</i> included in origin
     *        requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The cookies in viewer requests that are listed in the <code>CookieNames</code>
     *        type are included in the cache key and automatically included in requests that CloudFront sends to the
     *        origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allExcept</code> – All cookies in viewer requests that are <i> <b>not</b> </i> listed in the
     *        <code>CookieNames</code> type are included in the cache key and automatically included in requests that
     *        CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>all</code> – All cookies in viewer requests are included in the cache key and are automatically
     *        included in requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CachePolicyCookieBehavior
     */

    public CachePolicyCookiesConfig withCookieBehavior(CachePolicyCookieBehavior cookieBehavior) {
        this.cookieBehavior = cookieBehavior.toString();
        return this;
    }

    /**
     * @param cookies
     */

    public void setCookies(CookieNames cookies) {
        this.cookies = cookies;
    }

    /**
     * @return
     */

    public CookieNames getCookies() {
        return this.cookies;
    }

    /**
     * @param cookies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachePolicyCookiesConfig withCookies(CookieNames cookies) {
        setCookies(cookies);
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
        if (getCookieBehavior() != null)
            sb.append("CookieBehavior: ").append(getCookieBehavior()).append(",");
        if (getCookies() != null)
            sb.append("Cookies: ").append(getCookies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CachePolicyCookiesConfig == false)
            return false;
        CachePolicyCookiesConfig other = (CachePolicyCookiesConfig) obj;
        if (other.getCookieBehavior() == null ^ this.getCookieBehavior() == null)
            return false;
        if (other.getCookieBehavior() != null && other.getCookieBehavior().equals(this.getCookieBehavior()) == false)
            return false;
        if (other.getCookies() == null ^ this.getCookies() == null)
            return false;
        if (other.getCookies() != null && other.getCookies().equals(this.getCookies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCookieBehavior() == null) ? 0 : getCookieBehavior().hashCode());
        hashCode = prime * hashCode + ((getCookies() == null) ? 0 : getCookies().hashCode());
        return hashCode;
    }

    @Override
    public CachePolicyCookiesConfig clone() {
        try {
            return (CachePolicyCookiesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
