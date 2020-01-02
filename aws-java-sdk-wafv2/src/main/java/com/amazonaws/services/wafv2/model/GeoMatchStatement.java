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
 * A rule statement used to identify web requests based on country of origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GeoMatchStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO
     * codes of the ISO 3166 international standard.
     * </p>
     */
    private java.util.List<String> countryCodes;

    /**
     * <p>
     * An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO
     * codes of the ISO 3166 international standard.
     * </p>
     * 
     * @return An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2
     *         country ISO codes of the ISO 3166 international standard.
     * @see CountryCode
     */

    public java.util.List<String> getCountryCodes() {
        return countryCodes;
    }

    /**
     * <p>
     * An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO
     * codes of the ISO 3166 international standard.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2
     *        country ISO codes of the ISO 3166 international standard.
     * @see CountryCode
     */

    public void setCountryCodes(java.util.Collection<String> countryCodes) {
        if (countryCodes == null) {
            this.countryCodes = null;
            return;
        }

        this.countryCodes = new java.util.ArrayList<String>(countryCodes);
    }

    /**
     * <p>
     * An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO
     * codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCountryCodes(java.util.Collection)} or {@link #withCountryCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2
     *        country ISO codes of the ISO 3166 international standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public GeoMatchStatement withCountryCodes(String... countryCodes) {
        if (this.countryCodes == null) {
            setCountryCodes(new java.util.ArrayList<String>(countryCodes.length));
        }
        for (String ele : countryCodes) {
            this.countryCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO
     * codes of the ISO 3166 international standard.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2
     *        country ISO codes of the ISO 3166 international standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public GeoMatchStatement withCountryCodes(java.util.Collection<String> countryCodes) {
        setCountryCodes(countryCodes);
        return this;
    }

    /**
     * <p>
     * An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO
     * codes of the ISO 3166 international standard.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes, for example, <code>[ "US", "CN" ]</code>, from the alpha-2
     *        country ISO codes of the ISO 3166 international standard.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public GeoMatchStatement withCountryCodes(CountryCode... countryCodes) {
        java.util.ArrayList<String> countryCodesCopy = new java.util.ArrayList<String>(countryCodes.length);
        for (CountryCode value : countryCodes) {
            countryCodesCopy.add(value.toString());
        }
        if (getCountryCodes() == null) {
            setCountryCodes(countryCodesCopy);
        } else {
            getCountryCodes().addAll(countryCodesCopy);
        }
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
        if (getCountryCodes() != null)
            sb.append("CountryCodes: ").append(getCountryCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoMatchStatement == false)
            return false;
        GeoMatchStatement other = (GeoMatchStatement) obj;
        if (other.getCountryCodes() == null ^ this.getCountryCodes() == null)
            return false;
        if (other.getCountryCodes() != null && other.getCountryCodes().equals(this.getCountryCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountryCodes() == null) ? 0 : getCountryCodes().hashCode());
        return hashCode;
    }

    @Override
    public GeoMatchStatement clone() {
        try {
            return (GeoMatchStatement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.GeoMatchStatementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
