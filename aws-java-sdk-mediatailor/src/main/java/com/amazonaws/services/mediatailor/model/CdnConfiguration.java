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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
 * management.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/CdnConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CdnConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses
     * Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a
     * rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's
     * name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for ad segments.
     * </p>
     */
    private String adSegmentUrlPrefix;
    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to
     * the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the
     * rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your
     * CDN as the source for content segments.
     * </p>
     */
    private String contentSegmentUrlPrefix;

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses
     * Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a
     * rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's
     * name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for ad segments.
     * </p>
     * 
     * @param adSegmentUrlPrefix
     *        A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor
     *        uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN,
     *        create a rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then
     *        specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it
     *        reports your CDN as the source for ad segments.
     */

    public void setAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
        this.adSegmentUrlPrefix = adSegmentUrlPrefix;
    }

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses
     * Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a
     * rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's
     * name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for ad segments.
     * </p>
     * 
     * @return A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor
     *         uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate
     *         CDN, create a rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then
     *         specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it
     *         reports your CDN as the source for ad segments.
     */

    public String getAdSegmentUrlPrefix() {
        return this.adSegmentUrlPrefix;
    }

    /**
     * <p>
     * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses
     * Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a
     * rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's
     * name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the
     * source for ad segments.
     * </p>
     * 
     * @param adSegmentUrlPrefix
     *        A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor
     *        uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN,
     *        create a rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then
     *        specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it
     *        reports your CDN as the source for ad segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdnConfiguration withAdSegmentUrlPrefix(String adSegmentUrlPrefix) {
        setAdSegmentUrlPrefix(adSegmentUrlPrefix);
        return this;
    }

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to
     * the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the
     * rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your
     * CDN as the source for content segments.
     * </p>
     * 
     * @param contentSegmentUrlPrefix
     *        A content delivery network (CDN) to cache content segments, so that content requests don’t always have to
     *        go to the origin server. First, create a rule in your CDN for the content segment origin server. Then
     *        specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest,
     *        it reports your CDN as the source for content segments.
     */

    public void setContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
        this.contentSegmentUrlPrefix = contentSegmentUrlPrefix;
    }

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to
     * the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the
     * rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your
     * CDN as the source for content segments.
     * </p>
     * 
     * @return A content delivery network (CDN) to cache content segments, so that content requests don’t always have to
     *         go to the origin server. First, create a rule in your CDN for the content segment origin server. Then
     *         specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a
     *         manifest, it reports your CDN as the source for content segments.
     */

    public String getContentSegmentUrlPrefix() {
        return this.contentSegmentUrlPrefix;
    }

    /**
     * <p>
     * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to
     * the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the
     * rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your
     * CDN as the source for content segments.
     * </p>
     * 
     * @param contentSegmentUrlPrefix
     *        A content delivery network (CDN) to cache content segments, so that content requests don’t always have to
     *        go to the origin server. First, create a rule in your CDN for the content segment origin server. Then
     *        specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest,
     *        it reports your CDN as the source for content segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdnConfiguration withContentSegmentUrlPrefix(String contentSegmentUrlPrefix) {
        setContentSegmentUrlPrefix(contentSegmentUrlPrefix);
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
        if (getAdSegmentUrlPrefix() != null)
            sb.append("AdSegmentUrlPrefix: ").append(getAdSegmentUrlPrefix()).append(",");
        if (getContentSegmentUrlPrefix() != null)
            sb.append("ContentSegmentUrlPrefix: ").append(getContentSegmentUrlPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CdnConfiguration == false)
            return false;
        CdnConfiguration other = (CdnConfiguration) obj;
        if (other.getAdSegmentUrlPrefix() == null ^ this.getAdSegmentUrlPrefix() == null)
            return false;
        if (other.getAdSegmentUrlPrefix() != null && other.getAdSegmentUrlPrefix().equals(this.getAdSegmentUrlPrefix()) == false)
            return false;
        if (other.getContentSegmentUrlPrefix() == null ^ this.getContentSegmentUrlPrefix() == null)
            return false;
        if (other.getContentSegmentUrlPrefix() != null && other.getContentSegmentUrlPrefix().equals(this.getContentSegmentUrlPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdSegmentUrlPrefix() == null) ? 0 : getAdSegmentUrlPrefix().hashCode());
        hashCode = prime * hashCode + ((getContentSegmentUrlPrefix() == null) ? 0 : getContentSegmentUrlPrefix().hashCode());
        return hashCode;
    }

    @Override
    public CdnConfiguration clone() {
        try {
            return (CdnConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.CdnConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
