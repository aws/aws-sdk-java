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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes whether an Amazon Lightsail content delivery network (CDN) distribution forwards cookies to the origin and,
 * if so, which ones.
 * </p>
 * <p>
 * For the cookies that you specify, your distribution caches separate versions of the specified content based on the
 * cookie values in viewer requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CookieObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CookieObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     * <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     * <code>cookiesAllowList</code> parameter.
     * </p>
     */
    private String option;
    /**
     * <p>
     * The specific cookies to forward to your distribution's origin.
     * </p>
     */
    private java.util.List<String> cookiesAllowList;

    /**
     * <p>
     * Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     * <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     * <code>cookiesAllowList</code> parameter.
     * </p>
     * 
     * @param option
     *        Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     *        <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     *        <code>cookiesAllowList</code> parameter.
     * @see ForwardValues
     */

    public void setOption(String option) {
        this.option = option;
    }

    /**
     * <p>
     * Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     * <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     * <code>cookiesAllowList</code> parameter.
     * </p>
     * 
     * @return Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     *         <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     *         <code>cookiesAllowList</code> parameter.
     * @see ForwardValues
     */

    public String getOption() {
        return this.option;
    }

    /**
     * <p>
     * Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     * <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     * <code>cookiesAllowList</code> parameter.
     * </p>
     * 
     * @param option
     *        Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     *        <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     *        <code>cookiesAllowList</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForwardValues
     */

    public CookieObject withOption(String option) {
        setOption(option);
        return this;
    }

    /**
     * <p>
     * Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     * <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     * <code>cookiesAllowList</code> parameter.
     * </p>
     * 
     * @param option
     *        Specifies which cookies to forward to the distribution's origin for a cache behavior: <code>all</code>,
     *        <code>none</code>, or <code>allow-list</code> to forward only the cookies specified in the
     *        <code>cookiesAllowList</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ForwardValues
     */

    public CookieObject withOption(ForwardValues option) {
        this.option = option.toString();
        return this;
    }

    /**
     * <p>
     * The specific cookies to forward to your distribution's origin.
     * </p>
     * 
     * @return The specific cookies to forward to your distribution's origin.
     */

    public java.util.List<String> getCookiesAllowList() {
        return cookiesAllowList;
    }

    /**
     * <p>
     * The specific cookies to forward to your distribution's origin.
     * </p>
     * 
     * @param cookiesAllowList
     *        The specific cookies to forward to your distribution's origin.
     */

    public void setCookiesAllowList(java.util.Collection<String> cookiesAllowList) {
        if (cookiesAllowList == null) {
            this.cookiesAllowList = null;
            return;
        }

        this.cookiesAllowList = new java.util.ArrayList<String>(cookiesAllowList);
    }

    /**
     * <p>
     * The specific cookies to forward to your distribution's origin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCookiesAllowList(java.util.Collection)} or {@link #withCookiesAllowList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cookiesAllowList
     *        The specific cookies to forward to your distribution's origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieObject withCookiesAllowList(String... cookiesAllowList) {
        if (this.cookiesAllowList == null) {
            setCookiesAllowList(new java.util.ArrayList<String>(cookiesAllowList.length));
        }
        for (String ele : cookiesAllowList) {
            this.cookiesAllowList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific cookies to forward to your distribution's origin.
     * </p>
     * 
     * @param cookiesAllowList
     *        The specific cookies to forward to your distribution's origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieObject withCookiesAllowList(java.util.Collection<String> cookiesAllowList) {
        setCookiesAllowList(cookiesAllowList);
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
        if (getOption() != null)
            sb.append("Option: ").append(getOption()).append(",");
        if (getCookiesAllowList() != null)
            sb.append("CookiesAllowList: ").append(getCookiesAllowList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CookieObject == false)
            return false;
        CookieObject other = (CookieObject) obj;
        if (other.getOption() == null ^ this.getOption() == null)
            return false;
        if (other.getOption() != null && other.getOption().equals(this.getOption()) == false)
            return false;
        if (other.getCookiesAllowList() == null ^ this.getCookiesAllowList() == null)
            return false;
        if (other.getCookiesAllowList() != null && other.getCookiesAllowList().equals(this.getCookiesAllowList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOption() == null) ? 0 : getOption().hashCode());
        hashCode = prime * hashCode + ((getCookiesAllowList() == null) ? 0 : getCookiesAllowList().hashCode());
        return hashCode;
    }

    @Override
    public CookieObject clone() {
        try {
            return (CookieObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CookieObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
