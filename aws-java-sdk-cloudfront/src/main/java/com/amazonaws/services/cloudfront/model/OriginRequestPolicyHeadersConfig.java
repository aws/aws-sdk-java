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
 * An object that determines whether any HTTP headers (and if so, which headers) are included in requests that
 * CloudFront sends to the origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/OriginRequestPolicyHeadersConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicyHeadersConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even when this
     * field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code> <i>are</i> included
     * in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional CloudFront
     * headers that are listed in the <code>Headers</code> type are included in requests that CloudFront sends to the
     * origin. The additional headers are added by CloudFront.
     * </p>
     * </li>
     * </ul>
     */
    private String headerBehavior;

    private Headers headers;

    /**
     * <p>
     * Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even when this
     * field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code> <i>are</i> included
     * in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional CloudFront
     * headers that are listed in the <code>Headers</code> type are included in requests that CloudFront sends to the
     * origin. The additional headers are added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * 
     * @param headerBehavior
     *        Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even
     *        when this field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code>
     *        <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     *        requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront
     *        sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional
     *        CloudFront headers that are listed in the <code>Headers</code> type are included in requests that
     *        CloudFront sends to the origin. The additional headers are added by CloudFront.
     *        </p>
     *        </li>
     * @see OriginRequestPolicyHeaderBehavior
     */

    public void setHeaderBehavior(String headerBehavior) {
        this.headerBehavior = headerBehavior;
    }

    /**
     * <p>
     * Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even when this
     * field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code> <i>are</i> included
     * in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional CloudFront
     * headers that are listed in the <code>Headers</code> type are included in requests that CloudFront sends to the
     * origin. The additional headers are added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid
     *         values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even
     *         when this field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code>
     *         <i>are</i> included in origin requests.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included
     *         in requests that CloudFront sends to the origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront
     *         sends to the origin.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional
     *         CloudFront headers that are listed in the <code>Headers</code> type are included in requests that
     *         CloudFront sends to the origin. The additional headers are added by CloudFront.
     *         </p>
     *         </li>
     * @see OriginRequestPolicyHeaderBehavior
     */

    public String getHeaderBehavior() {
        return this.headerBehavior;
    }

    /**
     * <p>
     * Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even when this
     * field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code> <i>are</i> included
     * in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional CloudFront
     * headers that are listed in the <code>Headers</code> type are included in requests that CloudFront sends to the
     * origin. The additional headers are added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * 
     * @param headerBehavior
     *        Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even
     *        when this field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code>
     *        <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     *        requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront
     *        sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional
     *        CloudFront headers that are listed in the <code>Headers</code> type are included in requests that
     *        CloudFront sends to the origin. The additional headers are added by CloudFront.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyHeaderBehavior
     */

    public OriginRequestPolicyHeadersConfig withHeaderBehavior(String headerBehavior) {
        setHeaderBehavior(headerBehavior);
        return this;
    }

    /**
     * <p>
     * Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even when this
     * field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code> <i>are</i> included
     * in origin requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     * requests that CloudFront sends to the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront sends to
     * the origin.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional CloudFront
     * headers that are listed in the <code>Headers</code> type are included in requests that CloudFront sends to the
     * origin. The additional headers are added by CloudFront.
     * </p>
     * </li>
     * </ul>
     * 
     * @param headerBehavior
     *        Determines whether any HTTP headers are included in requests that CloudFront sends to the origin. Valid
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>none</code> – HTTP headers are not included in requests that CloudFront sends to the origin. Even
     *        when this field is set to <code>none</code>, any headers that are listed in a <code>CachePolicy</code>
     *        <i>are</i> included in origin requests.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>whitelist</code> – The HTTP headers that are listed in the <code>Headers</code> type are included in
     *        requests that CloudFront sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allViewer</code> – All HTTP headers in viewer requests are included in requests that CloudFront
     *        sends to the origin.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>allViewerAndWhitelistCloudFront</code> – All HTTP headers in viewer requests and the additional
     *        CloudFront headers that are listed in the <code>Headers</code> type are included in requests that
     *        CloudFront sends to the origin. The additional headers are added by CloudFront.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginRequestPolicyHeaderBehavior
     */

    public OriginRequestPolicyHeadersConfig withHeaderBehavior(OriginRequestPolicyHeaderBehavior headerBehavior) {
        this.headerBehavior = headerBehavior.toString();
        return this;
    }

    /**
     * @param headers
     */

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    /**
     * @return
     */

    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @param headers
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OriginRequestPolicyHeadersConfig withHeaders(Headers headers) {
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
        if (getHeaderBehavior() != null)
            sb.append("HeaderBehavior: ").append(getHeaderBehavior()).append(",");
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

        if (obj instanceof OriginRequestPolicyHeadersConfig == false)
            return false;
        OriginRequestPolicyHeadersConfig other = (OriginRequestPolicyHeadersConfig) obj;
        if (other.getHeaderBehavior() == null ^ this.getHeaderBehavior() == null)
            return false;
        if (other.getHeaderBehavior() != null && other.getHeaderBehavior().equals(this.getHeaderBehavior()) == false)
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

        hashCode = prime * hashCode + ((getHeaderBehavior() == null) ? 0 : getHeaderBehavior().hashCode());
        hashCode = prime * hashCode + ((getHeaders() == null) ? 0 : getHeaders().hashCode());
        return hashCode;
    }

    @Override
    public OriginRequestPolicyHeadersConfig clone() {
        try {
            return (OriginRequestPolicyHeadersConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
