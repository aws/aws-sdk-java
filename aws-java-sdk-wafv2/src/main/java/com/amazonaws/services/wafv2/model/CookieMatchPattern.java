/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * The filter to use to identify the subset of cookies to inspect in a web request.
 * </p>
 * <p>
 * You must specify exactly one setting: either <code>All</code>, <code>IncludedCookies</code>, or
 * <code>ExcludedCookies</code>.
 * </p>
 * <p>
 * Example JSON: <code>"MatchPattern": { "IncludedCookies": {"KeyToInclude1", "KeyToInclude2", "KeyToInclude3"} }</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CookieMatchPattern" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CookieMatchPattern implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Inspect all cookies.
     * </p>
     */
    private All all;
    /**
     * <p>
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     * </p>
     */
    private java.util.List<String> includedCookies;
    /**
     * <p>
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     * </p>
     */
    private java.util.List<String> excludedCookies;

    /**
     * <p>
     * Inspect all cookies.
     * </p>
     * 
     * @param all
     *        Inspect all cookies.
     */

    public void setAll(All all) {
        this.all = all;
    }

    /**
     * <p>
     * Inspect all cookies.
     * </p>
     * 
     * @return Inspect all cookies.
     */

    public All getAll() {
        return this.all;
    }

    /**
     * <p>
     * Inspect all cookies.
     * </p>
     * 
     * @param all
     *        Inspect all cookies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieMatchPattern withAll(All all) {
        setAll(all);
        return this;
    }

    /**
     * <p>
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     * </p>
     * 
     * @return Inspect only the cookies that have a key that matches one of the strings specified here.
     */

    public java.util.List<String> getIncludedCookies() {
        return includedCookies;
    }

    /**
     * <p>
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     * </p>
     * 
     * @param includedCookies
     *        Inspect only the cookies that have a key that matches one of the strings specified here.
     */

    public void setIncludedCookies(java.util.Collection<String> includedCookies) {
        if (includedCookies == null) {
            this.includedCookies = null;
            return;
        }

        this.includedCookies = new java.util.ArrayList<String>(includedCookies);
    }

    /**
     * <p>
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIncludedCookies(java.util.Collection)} or {@link #withIncludedCookies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param includedCookies
     *        Inspect only the cookies that have a key that matches one of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieMatchPattern withIncludedCookies(String... includedCookies) {
        if (this.includedCookies == null) {
            setIncludedCookies(new java.util.ArrayList<String>(includedCookies.length));
        }
        for (String ele : includedCookies) {
            this.includedCookies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Inspect only the cookies that have a key that matches one of the strings specified here.
     * </p>
     * 
     * @param includedCookies
     *        Inspect only the cookies that have a key that matches one of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieMatchPattern withIncludedCookies(java.util.Collection<String> includedCookies) {
        setIncludedCookies(includedCookies);
        return this;
    }

    /**
     * <p>
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     * </p>
     * 
     * @return Inspect only the cookies whose keys don't match any of the strings specified here.
     */

    public java.util.List<String> getExcludedCookies() {
        return excludedCookies;
    }

    /**
     * <p>
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     * </p>
     * 
     * @param excludedCookies
     *        Inspect only the cookies whose keys don't match any of the strings specified here.
     */

    public void setExcludedCookies(java.util.Collection<String> excludedCookies) {
        if (excludedCookies == null) {
            this.excludedCookies = null;
            return;
        }

        this.excludedCookies = new java.util.ArrayList<String>(excludedCookies);
    }

    /**
     * <p>
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedCookies(java.util.Collection)} or {@link #withExcludedCookies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedCookies
     *        Inspect only the cookies whose keys don't match any of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieMatchPattern withExcludedCookies(String... excludedCookies) {
        if (this.excludedCookies == null) {
            setExcludedCookies(new java.util.ArrayList<String>(excludedCookies.length));
        }
        for (String ele : excludedCookies) {
            this.excludedCookies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Inspect only the cookies whose keys don't match any of the strings specified here.
     * </p>
     * 
     * @param excludedCookies
     *        Inspect only the cookies whose keys don't match any of the strings specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieMatchPattern withExcludedCookies(java.util.Collection<String> excludedCookies) {
        setExcludedCookies(excludedCookies);
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
        if (getAll() != null)
            sb.append("All: ").append(getAll()).append(",");
        if (getIncludedCookies() != null)
            sb.append("IncludedCookies: ").append(getIncludedCookies()).append(",");
        if (getExcludedCookies() != null)
            sb.append("ExcludedCookies: ").append(getExcludedCookies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CookieMatchPattern == false)
            return false;
        CookieMatchPattern other = (CookieMatchPattern) obj;
        if (other.getAll() == null ^ this.getAll() == null)
            return false;
        if (other.getAll() != null && other.getAll().equals(this.getAll()) == false)
            return false;
        if (other.getIncludedCookies() == null ^ this.getIncludedCookies() == null)
            return false;
        if (other.getIncludedCookies() != null && other.getIncludedCookies().equals(this.getIncludedCookies()) == false)
            return false;
        if (other.getExcludedCookies() == null ^ this.getExcludedCookies() == null)
            return false;
        if (other.getExcludedCookies() != null && other.getExcludedCookies().equals(this.getExcludedCookies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAll() == null) ? 0 : getAll().hashCode());
        hashCode = prime * hashCode + ((getIncludedCookies() == null) ? 0 : getIncludedCookies().hashCode());
        hashCode = prime * hashCode + ((getExcludedCookies() == null) ? 0 : getExcludedCookies().hashCode());
        return hashCode;
    }

    @Override
    public CookieMatchPattern clone() {
        try {
            return (CookieMatchPattern) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.CookieMatchPatternMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
