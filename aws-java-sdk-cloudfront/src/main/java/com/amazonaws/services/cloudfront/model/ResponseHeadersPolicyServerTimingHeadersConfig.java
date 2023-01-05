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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A configuration for enabling the <code>Server-Timing</code> header in HTTP responses sent from CloudFront. CloudFront
 * adds this header to HTTP responses that it sends in response to requests that match a cache behavior that's
 * associated with this response headers policy.
 * </p>
 * <p>
 * You can use the <code>Server-Timing</code> header to view metrics that can help you gain insights about the behavior
 * and performance of CloudFront. For example, you can see which cache layer served a cache hit, or the first byte
 * latency from the origin when there was a cache miss. You can use the metrics in the <code>Server-Timing</code> header
 * to troubleshoot issues or test the efficiency of your CloudFront configuration. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/understanding-response-headers-policies.html#server-timing-header"
 * >Server-Timing header</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ResponseHeadersPolicyServerTimingHeadersConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseHeadersPolicyServerTimingHeadersConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses that it
     * sends in response to requests that match a cache behavior that's associated with this response headers policy.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     * <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     * <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior that
     * this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
     * responses for requests that match the cache behavior. You can set the sampling rate to any number 0–100 with up
     * to four decimal places.
     * </p>
     */
    private Double samplingRate;

    /**
     * <p>
     * A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses that it
     * sends in response to requests that match a cache behavior that's associated with this response headers policy.
     * </p>
     * 
     * @param enabled
     *        A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses
     *        that it sends in response to requests that match a cache behavior that's associated with this response
     *        headers policy.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses that it
     * sends in response to requests that match a cache behavior that's associated with this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses
     *         that it sends in response to requests that match a cache behavior that's associated with this response
     *         headers policy.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses that it
     * sends in response to requests that match a cache behavior that's associated with this response headers policy.
     * </p>
     * 
     * @param enabled
     *        A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses
     *        that it sends in response to requests that match a cache behavior that's associated with this response
     *        headers policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyServerTimingHeadersConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses that it
     * sends in response to requests that match a cache behavior that's associated with this response headers policy.
     * </p>
     * 
     * @return A Boolean that determines whether CloudFront adds the <code>Server-Timing</code> header to HTTP responses
     *         that it sends in response to requests that match a cache behavior that's associated with this response
     *         headers policy.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     * <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     * <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior that
     * this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
     * responses for requests that match the cache behavior. You can set the sampling rate to any number 0–100 with up
     * to four decimal places.
     * </p>
     * 
     * @param samplingRate
     *        A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     *        <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     *        <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior
     *        that this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50%
     *        of the responses for requests that match the cache behavior. You can set the sampling rate to any number
     *        0–100 with up to four decimal places.
     */

    public void setSamplingRate(Double samplingRate) {
        this.samplingRate = samplingRate;
    }

    /**
     * <p>
     * A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     * <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     * <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior that
     * this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
     * responses for requests that match the cache behavior. You can set the sampling rate to any number 0–100 with up
     * to four decimal places.
     * </p>
     * 
     * @return A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     *         <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     *         <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior
     *         that this response headers policy is attached to. When you set it to 50, CloudFront adds the header to
     *         50% of the responses for requests that match the cache behavior. You can set the sampling rate to any
     *         number 0–100 with up to four decimal places.
     */

    public Double getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * <p>
     * A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     * <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     * <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior that
     * this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50% of the
     * responses for requests that match the cache behavior. You can set the sampling rate to any number 0–100 with up
     * to four decimal places.
     * </p>
     * 
     * @param samplingRate
     *        A number 0–100 (inclusive) that specifies the percentage of responses that you want CloudFront to add the
     *        <code>Server-Timing</code> header to. When you set the sampling rate to 100, CloudFront adds the
     *        <code>Server-Timing</code> header to the HTTP response for every request that matches the cache behavior
     *        that this response headers policy is attached to. When you set it to 50, CloudFront adds the header to 50%
     *        of the responses for requests that match the cache behavior. You can set the sampling rate to any number
     *        0–100 with up to four decimal places.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseHeadersPolicyServerTimingHeadersConfig withSamplingRate(Double samplingRate) {
        setSamplingRate(samplingRate);
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
        if (getSamplingRate() != null)
            sb.append("SamplingRate: ").append(getSamplingRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseHeadersPolicyServerTimingHeadersConfig == false)
            return false;
        ResponseHeadersPolicyServerTimingHeadersConfig other = (ResponseHeadersPolicyServerTimingHeadersConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSamplingRate() == null ^ this.getSamplingRate() == null)
            return false;
        if (other.getSamplingRate() != null && other.getSamplingRate().equals(this.getSamplingRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSamplingRate() == null) ? 0 : getSamplingRate().hashCode());
        return hashCode;
    }

    @Override
    public ResponseHeadersPolicyServerTimingHeadersConfig clone() {
        try {
            return (ResponseHeadersPolicyServerTimingHeadersConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
