/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones.
 * For more information about forwarding cookies to the origin, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html">How CloudFront Forwards,
 * Caches, and Logs Cookies</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CookiePreference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CookiePreference implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies
     * specified in the <code>WhitelistedNames</code> complex type.
     * </p>
     * <p>
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify
     * none for the <code>Forward</code> element.
     * </p>
     */
    private String forward;
    /**
     * <p>
     * Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if
     * you want to forward selected cookies, the names of those cookies.
     * </p>
     * <p>
     * If you specify <code>all</code> or none for the value of <code>Forward</code>, omit <code>WhitelistedNames</code>
     * . If you change the value of <code>Forward</code> from <code>whitelist</code> to all or none and you don't delete
     * the <code>WhitelistedNames</code> element and its child elements, CloudFront deletes them automatically.
     * </p>
     * <p>
     * For the current limit on the number of cookie names that you can whitelist for each cache behavior, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront
     * Limits</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private CookieNames whitelistedNames;

    /**
     * <p>
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies
     * specified in the <code>WhitelistedNames</code> complex type.
     * </p>
     * <p>
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify
     * none for the <code>Forward</code> element.
     * </p>
     * 
     * @param forward
     *        Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of
     *        cookies specified in the <code>WhitelistedNames</code> complex type.</p>
     *        <p>
     *        Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin,
     *        specify none for the <code>Forward</code> element.
     * @see ItemSelection
     */

    public void setForward(String forward) {
        this.forward = forward;
    }

    /**
     * <p>
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies
     * specified in the <code>WhitelistedNames</code> complex type.
     * </p>
     * <p>
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify
     * none for the <code>Forward</code> element.
     * </p>
     * 
     * @return Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of
     *         cookies specified in the <code>WhitelistedNames</code> complex type.</p>
     *         <p>
     *         Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin,
     *         specify none for the <code>Forward</code> element.
     * @see ItemSelection
     */

    public String getForward() {
        return this.forward;
    }

    /**
     * <p>
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies
     * specified in the <code>WhitelistedNames</code> complex type.
     * </p>
     * <p>
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify
     * none for the <code>Forward</code> element.
     * </p>
     * 
     * @param forward
     *        Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of
     *        cookies specified in the <code>WhitelistedNames</code> complex type.</p>
     *        <p>
     *        Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin,
     *        specify none for the <code>Forward</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ItemSelection
     */

    public CookiePreference withForward(String forward) {
        setForward(forward);
        return this;
    }

    /**
     * <p>
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies
     * specified in the <code>WhitelistedNames</code> complex type.
     * </p>
     * <p>
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify
     * none for the <code>Forward</code> element.
     * </p>
     * 
     * @param forward
     *        Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of
     *        cookies specified in the <code>WhitelistedNames</code> complex type.</p>
     *        <p>
     *        Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin,
     *        specify none for the <code>Forward</code> element.
     * @see ItemSelection
     */

    public void setForward(ItemSelection forward) {
        withForward(forward);
    }

    /**
     * <p>
     * Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies
     * specified in the <code>WhitelistedNames</code> complex type.
     * </p>
     * <p>
     * Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify
     * none for the <code>Forward</code> element.
     * </p>
     * 
     * @param forward
     *        Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of
     *        cookies specified in the <code>WhitelistedNames</code> complex type.</p>
     *        <p>
     *        Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin,
     *        specify none for the <code>Forward</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ItemSelection
     */

    public CookiePreference withForward(ItemSelection forward) {
        this.forward = forward.toString();
        return this;
    }

    /**
     * <p>
     * Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if
     * you want to forward selected cookies, the names of those cookies.
     * </p>
     * <p>
     * If you specify <code>all</code> or none for the value of <code>Forward</code>, omit <code>WhitelistedNames</code>
     * . If you change the value of <code>Forward</code> from <code>whitelist</code> to all or none and you don't delete
     * the <code>WhitelistedNames</code> element and its child elements, CloudFront deletes them automatically.
     * </p>
     * <p>
     * For the current limit on the number of cookie names that you can whitelist for each cache behavior, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront
     * Limits</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param whitelistedNames
     *        Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type that
     *        specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior
     *        and, if you want to forward selected cookies, the names of those cookies.</p>
     *        <p>
     *        If you specify <code>all</code> or none for the value of <code>Forward</code>, omit
     *        <code>WhitelistedNames</code>. If you change the value of <code>Forward</code> from <code>whitelist</code>
     *        to all or none and you don't delete the <code>WhitelistedNames</code> element and its child elements,
     *        CloudFront deletes them automatically.
     *        </p>
     *        <p>
     *        For the current limit on the number of cookie names that you can whitelist for each cache behavior, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon
     *        CloudFront Limits</a> in the <i>AWS General Reference</i>.
     */

    public void setWhitelistedNames(CookieNames whitelistedNames) {
        this.whitelistedNames = whitelistedNames;
    }

    /**
     * <p>
     * Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if
     * you want to forward selected cookies, the names of those cookies.
     * </p>
     * <p>
     * If you specify <code>all</code> or none for the value of <code>Forward</code>, omit <code>WhitelistedNames</code>
     * . If you change the value of <code>Forward</code> from <code>whitelist</code> to all or none and you don't delete
     * the <code>WhitelistedNames</code> element and its child elements, CloudFront deletes them automatically.
     * </p>
     * <p>
     * For the current limit on the number of cookie names that you can whitelist for each cache behavior, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront
     * Limits</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type
     *         that specifies how many different cookies you want CloudFront to forward to the origin for this cache
     *         behavior and, if you want to forward selected cookies, the names of those cookies.</p>
     *         <p>
     *         If you specify <code>all</code> or none for the value of <code>Forward</code>, omit
     *         <code>WhitelistedNames</code>. If you change the value of <code>Forward</code> from
     *         <code>whitelist</code> to all or none and you don't delete the <code>WhitelistedNames</code> element and
     *         its child elements, CloudFront deletes them automatically.
     *         </p>
     *         <p>
     *         For the current limit on the number of cookie names that you can whitelist for each cache behavior, see
     *         <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon
     *         CloudFront Limits</a> in the <i>AWS General Reference</i>.
     */

    public CookieNames getWhitelistedNames() {
        return this.whitelistedNames;
    }

    /**
     * <p>
     * Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type that
     * specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if
     * you want to forward selected cookies, the names of those cookies.
     * </p>
     * <p>
     * If you specify <code>all</code> or none for the value of <code>Forward</code>, omit <code>WhitelistedNames</code>
     * . If you change the value of <code>Forward</code> from <code>whitelist</code> to all or none and you don't delete
     * the <code>WhitelistedNames</code> element and its child elements, CloudFront deletes them automatically.
     * </p>
     * <p>
     * For the current limit on the number of cookie names that you can whitelist for each cache behavior, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront
     * Limits</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param whitelistedNames
     *        Required if you specify <code>whitelist</code> for the value of <code>Forward:</code>. A complex type that
     *        specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior
     *        and, if you want to forward selected cookies, the names of those cookies.</p>
     *        <p>
     *        If you specify <code>all</code> or none for the value of <code>Forward</code>, omit
     *        <code>WhitelistedNames</code>. If you change the value of <code>Forward</code> from <code>whitelist</code>
     *        to all or none and you don't delete the <code>WhitelistedNames</code> element and its child elements,
     *        CloudFront deletes them automatically.
     *        </p>
     *        <p>
     *        For the current limit on the number of cookie names that you can whitelist for each cache behavior, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon
     *        CloudFront Limits</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookiePreference withWhitelistedNames(CookieNames whitelistedNames) {
        setWhitelistedNames(whitelistedNames);
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
        if (getForward() != null)
            sb.append("Forward: ").append(getForward()).append(",");
        if (getWhitelistedNames() != null)
            sb.append("WhitelistedNames: ").append(getWhitelistedNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CookiePreference == false)
            return false;
        CookiePreference other = (CookiePreference) obj;
        if (other.getForward() == null ^ this.getForward() == null)
            return false;
        if (other.getForward() != null && other.getForward().equals(this.getForward()) == false)
            return false;
        if (other.getWhitelistedNames() == null ^ this.getWhitelistedNames() == null)
            return false;
        if (other.getWhitelistedNames() != null && other.getWhitelistedNames().equals(this.getWhitelistedNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForward() == null) ? 0 : getForward().hashCode());
        hashCode = prime * hashCode + ((getWhitelistedNames() == null) ? 0 : getWhitelistedNames().hashCode());
        return hashCode;
    }

    @Override
    public CookiePreference clone() {
        try {
            return (CookiePreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
