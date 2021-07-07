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
 * CloudFront Origin Shield.
 * </p>
 * <p>
 * Using Origin Shield can help reduce the load on your origin. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin Shield</a>
 * in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginShield" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginShield implements Serializable, Cloneable {

    /**
     * <p>
     * A flag that specifies whether Origin Shield is enabled.
     * </p>
     * <p>
     * When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When
     * it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional
     * edge caches.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The Region for Origin Shield.
     * </p>
     * <p>
     * Specify the Region that has the lowest latency to your origin. To specify a region, use the region code, not the
     * region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     * </p>
     * <p>
     * When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of Regions
     * that you can specify, and for help choosing the best Region for your origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     * >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String originShieldRegion;

    /**
     * <p>
     * A flag that specifies whether Origin Shield is enabled.
     * </p>
     * <p>
     * When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When
     * it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional
     * edge caches.
     * </p>
     * 
     * @param enabled
     *        A flag that specifies whether Origin Shield is enabled.</p>
     *        <p>
     *        When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your
     *        origin. When it’s disabled, CloudFront might send requests directly to your origin from multiple edge
     *        locations or regional edge caches.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A flag that specifies whether Origin Shield is enabled.
     * </p>
     * <p>
     * When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When
     * it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional
     * edge caches.
     * </p>
     * 
     * @return A flag that specifies whether Origin Shield is enabled.</p>
     *         <p>
     *         When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your
     *         origin. When it’s disabled, CloudFront might send requests directly to your origin from multiple edge
     *         locations or regional edge caches.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A flag that specifies whether Origin Shield is enabled.
     * </p>
     * <p>
     * When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When
     * it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional
     * edge caches.
     * </p>
     * 
     * @param enabled
     *        A flag that specifies whether Origin Shield is enabled.</p>
     *        <p>
     *        When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your
     *        origin. When it’s disabled, CloudFront might send requests directly to your origin from multiple edge
     *        locations or regional edge caches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginShield withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A flag that specifies whether Origin Shield is enabled.
     * </p>
     * <p>
     * When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your origin. When
     * it’s disabled, CloudFront might send requests directly to your origin from multiple edge locations or regional
     * edge caches.
     * </p>
     * 
     * @return A flag that specifies whether Origin Shield is enabled.</p>
     *         <p>
     *         When it’s enabled, CloudFront routes all requests through Origin Shield, which can help protect your
     *         origin. When it’s disabled, CloudFront might send requests directly to your origin from multiple edge
     *         locations or regional edge caches.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The Region for Origin Shield.
     * </p>
     * <p>
     * Specify the Region that has the lowest latency to your origin. To specify a region, use the region code, not the
     * region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     * </p>
     * <p>
     * When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of Regions
     * that you can specify, and for help choosing the best Region for your origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     * >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originShieldRegion
     *        The Region for Origin Shield.</p>
     *        <p>
     *        Specify the Region that has the lowest latency to your origin. To specify a region, use the region code,
     *        not the region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     *        </p>
     *        <p>
     *        When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of
     *        Regions that you can specify, and for help choosing the best Region for your origin, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     *        >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setOriginShieldRegion(String originShieldRegion) {
        this.originShieldRegion = originShieldRegion;
    }

    /**
     * <p>
     * The Region for Origin Shield.
     * </p>
     * <p>
     * Specify the Region that has the lowest latency to your origin. To specify a region, use the region code, not the
     * region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     * </p>
     * <p>
     * When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of Regions
     * that you can specify, and for help choosing the best Region for your origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     * >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The Region for Origin Shield.</p>
     *         <p>
     *         Specify the Region that has the lowest latency to your origin. To specify a region, use the region code,
     *         not the region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     *         </p>
     *         <p>
     *         When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of
     *         Regions that you can specify, and for help choosing the best Region for your origin, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     *         >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getOriginShieldRegion() {
        return this.originShieldRegion;
    }

    /**
     * <p>
     * The Region for Origin Shield.
     * </p>
     * <p>
     * Specify the Region that has the lowest latency to your origin. To specify a region, use the region code, not the
     * region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     * </p>
     * <p>
     * When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of Regions
     * that you can specify, and for help choosing the best Region for your origin, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     * >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originShieldRegion
     *        The Region for Origin Shield.</p>
     *        <p>
     *        Specify the Region that has the lowest latency to your origin. To specify a region, use the region code,
     *        not the region name. For example, specify the US East (Ohio) region as <code>us-east-2</code>.
     *        </p>
     *        <p>
     *        When you enable CloudFront Origin Shield, you must specify the Region for Origin Shield. For the list of
     *        Regions that you can specify, and for help choosing the best Region for your origin, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html#choose-origin-shield-region"
     *        >Choosing the Region for Origin Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginShield withOriginShieldRegion(String originShieldRegion) {
        setOriginShieldRegion(originShieldRegion);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getOriginShieldRegion() != null)
            sb.append("OriginShieldRegion: ").append(getOriginShieldRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginShield == false)
            return false;
        OriginShield other = (OriginShield) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getOriginShieldRegion() == null ^ this.getOriginShieldRegion() == null)
            return false;
        if (other.getOriginShieldRegion() != null && other.getOriginShieldRegion().equals(this.getOriginShieldRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getOriginShieldRegion() == null) ? 0 : getOriginShieldRegion().hashCode());
        return hashCode;
    }

    @Override
    public OriginShield clone() {
        try {
            return (OriginShield) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
