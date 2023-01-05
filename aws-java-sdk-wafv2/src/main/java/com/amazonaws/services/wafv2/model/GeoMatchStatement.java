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
 * A rule statement that labels web requests by country and region and that matches against web requests based on
 * country code. A geo match rule labels every request that it inspects regardless of whether it finds a match.
 * </p>
 * <ul>
 * <li>
 * <p>
 * To manage requests only by country, you can use this statement by itself and specify the countries that you want to
 * match against in the <code>CountryCodes</code> array.
 * </p>
 * </li>
 * <li>
 * <p>
 * Otherwise, configure your geo match rule with Count action so that it only labels requests. Then, add one or more
 * label match rules to run after the geo match rule and configure them to match against the geographic labels and
 * handle the requests as needed.
 * </p>
 * </li>
 * </ul>
 * <p>
 * WAF labels requests using the alpha-2 country and region codes from the International Organization for
 * Standardization (ISO) 3166 standard. WAF determines the codes using either the IP address in the web request origin
 * or, if you specify it, the address in the geo match <code>ForwardedIPConfig</code>.
 * </p>
 * <p>
 * If you use the web request origin, the label formats are
 * <code>awswaf:clientip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
 * <code>awswaf:clientip:geo:country:&lt;ISO country code&gt;</code>.
 * </p>
 * <p>
 * If you use a forwarded IP address, the label formats are
 * <code>awswaf:forwardedip:geo:region:&lt;ISO country code&gt;-&lt;ISO region code&gt;</code> and
 * <code>awswaf:forwardedip:geo:country:&lt;ISO country code&gt;</code>.
 * </p>
 * <p>
 * For additional details, see <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-rule-statement-type-geo-match.html">Geographic match
 * rule statement</a> in the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">WAF
 * Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GeoMatchStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoMatchStatement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of two-character country codes that you want to match against, for example, <code>[ "US", "CN" ]</code>,
     * from the alpha-2 country ISO codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * When you use a geo match statement just for the region and country labels that it adds to requests, you still
     * have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count
     * matching requests, but it will still generate logging and count metrics for any matches. You can reduce the
     * logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to
     * your site.
     * </p>
     */
    private java.util.List<String> countryCodes;
    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     */
    private ForwardedIPConfig forwardedIPConfig;

    /**
     * <p>
     * An array of two-character country codes that you want to match against, for example, <code>[ "US", "CN" ]</code>,
     * from the alpha-2 country ISO codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * When you use a geo match statement just for the region and country labels that it adds to requests, you still
     * have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count
     * matching requests, but it will still generate logging and count metrics for any matches. You can reduce the
     * logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to
     * your site.
     * </p>
     * 
     * @return An array of two-character country codes that you want to match against, for example,
     *         <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO codes of the ISO 3166 international standard.
     *         </p>
     *         <p>
     *         When you use a geo match statement just for the region and country labels that it adds to requests, you
     *         still have to supply a country code for the rule to evaluate. In this case, you configure the rule to
     *         only count matching requests, but it will still generate logging and count metrics for any matches. You
     *         can reduce the logging and metrics that the rule produces by specifying a country that's unlikely to be a
     *         source of traffic to your site.
     * @see CountryCode
     */

    public java.util.List<String> getCountryCodes() {
        return countryCodes;
    }

    /**
     * <p>
     * An array of two-character country codes that you want to match against, for example, <code>[ "US", "CN" ]</code>,
     * from the alpha-2 country ISO codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * When you use a geo match statement just for the region and country labels that it adds to requests, you still
     * have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count
     * matching requests, but it will still generate logging and count metrics for any matches. You can reduce the
     * logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to
     * your site.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes that you want to match against, for example,
     *        <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO codes of the ISO 3166 international standard.
     *        </p>
     *        <p>
     *        When you use a geo match statement just for the region and country labels that it adds to requests, you
     *        still have to supply a country code for the rule to evaluate. In this case, you configure the rule to only
     *        count matching requests, but it will still generate logging and count metrics for any matches. You can
     *        reduce the logging and metrics that the rule produces by specifying a country that's unlikely to be a
     *        source of traffic to your site.
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
     * An array of two-character country codes that you want to match against, for example, <code>[ "US", "CN" ]</code>,
     * from the alpha-2 country ISO codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * When you use a geo match statement just for the region and country labels that it adds to requests, you still
     * have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count
     * matching requests, but it will still generate logging and count metrics for any matches. You can reduce the
     * logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to
     * your site.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCountryCodes(java.util.Collection)} or {@link #withCountryCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes that you want to match against, for example,
     *        <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO codes of the ISO 3166 international standard.
     *        </p>
     *        <p>
     *        When you use a geo match statement just for the region and country labels that it adds to requests, you
     *        still have to supply a country code for the rule to evaluate. In this case, you configure the rule to only
     *        count matching requests, but it will still generate logging and count metrics for any matches. You can
     *        reduce the logging and metrics that the rule produces by specifying a country that's unlikely to be a
     *        source of traffic to your site.
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
     * An array of two-character country codes that you want to match against, for example, <code>[ "US", "CN" ]</code>,
     * from the alpha-2 country ISO codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * When you use a geo match statement just for the region and country labels that it adds to requests, you still
     * have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count
     * matching requests, but it will still generate logging and count metrics for any matches. You can reduce the
     * logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to
     * your site.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes that you want to match against, for example,
     *        <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO codes of the ISO 3166 international standard.
     *        </p>
     *        <p>
     *        When you use a geo match statement just for the region and country labels that it adds to requests, you
     *        still have to supply a country code for the rule to evaluate. In this case, you configure the rule to only
     *        count matching requests, but it will still generate logging and count metrics for any matches. You can
     *        reduce the logging and metrics that the rule produces by specifying a country that's unlikely to be a
     *        source of traffic to your site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public GeoMatchStatement withCountryCodes(java.util.Collection<String> countryCodes) {
        setCountryCodes(countryCodes);
        return this;
    }

    /**
     * <p>
     * An array of two-character country codes that you want to match against, for example, <code>[ "US", "CN" ]</code>,
     * from the alpha-2 country ISO codes of the ISO 3166 international standard.
     * </p>
     * <p>
     * When you use a geo match statement just for the region and country labels that it adds to requests, you still
     * have to supply a country code for the rule to evaluate. In this case, you configure the rule to only count
     * matching requests, but it will still generate logging and count metrics for any matches. You can reduce the
     * logging and metrics that the rule produces by specifying a country that's unlikely to be a source of traffic to
     * your site.
     * </p>
     * 
     * @param countryCodes
     *        An array of two-character country codes that you want to match against, for example,
     *        <code>[ "US", "CN" ]</code>, from the alpha-2 country ISO codes of the ISO 3166 international standard.
     *        </p>
     *        <p>
     *        When you use a geo match statement just for the region and country labels that it adds to requests, you
     *        still have to supply a country code for the rule to evaluate. In this case, you configure the rule to only
     *        count matching requests, but it will still generate logging and count metrics for any matches. You can
     *        reduce the logging and metrics that the rule produces by specifying a country that's unlikely to be a
     *        source of traffic to your site.
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
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * 
     * @param forwardedIPConfig
     *        The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP
     *        address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but
     *        you can specify any header name. </p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     */

    public void setForwardedIPConfig(ForwardedIPConfig forwardedIPConfig) {
        this.forwardedIPConfig = forwardedIPConfig;
    }

    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * 
     * @return The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP
     *         address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header,
     *         but you can specify any header name. </p> <note>
     *         <p>
     *         If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *         all.
     *         </p>
     */

    public ForwardedIPConfig getForwardedIPConfig() {
        return this.forwardedIPConfig;
    }

    /**
     * <p>
     * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address
     * that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but you can
     * specify any header name.
     * </p>
     * <note>
     * <p>
     * If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at all.
     * </p>
     * </note>
     * 
     * @param forwardedIPConfig
     *        The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP
     *        address that's reported by the web request origin. Commonly, this is the X-Forwarded-For (XFF) header, but
     *        you can specify any header name. </p> <note>
     *        <p>
     *        If the specified header isn't present in the request, WAF doesn't apply the rule to the web request at
     *        all.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoMatchStatement withForwardedIPConfig(ForwardedIPConfig forwardedIPConfig) {
        setForwardedIPConfig(forwardedIPConfig);
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
            sb.append("CountryCodes: ").append(getCountryCodes()).append(",");
        if (getForwardedIPConfig() != null)
            sb.append("ForwardedIPConfig: ").append(getForwardedIPConfig());
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
        if (other.getForwardedIPConfig() == null ^ this.getForwardedIPConfig() == null)
            return false;
        if (other.getForwardedIPConfig() != null && other.getForwardedIPConfig().equals(this.getForwardedIPConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountryCodes() == null) ? 0 : getCountryCodes().hashCode());
        hashCode = prime * hashCode + ((getForwardedIPConfig() == null) ? 0 : getForwardedIPConfig().hashCode());
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
