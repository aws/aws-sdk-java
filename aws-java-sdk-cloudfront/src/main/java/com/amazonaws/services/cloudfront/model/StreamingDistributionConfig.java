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
 * The RTMP distribution's configuration information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/StreamingDistributionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingDistributionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a previous request to create a distribution,
     * CloudFront returns a <code>DistributionAlreadyExists</code> error.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     */
    private S3Origin s3Origin;
    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     */
    private Aliases aliases;
    /**
     * <p>
     * Any comments you want to include about the streaming distribution.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * A complex type that controls whether access logs are written for the streaming distribution.
     * </p>
     */
    private StreamingLoggingConfig logging;
    /**
     * <p>
     * A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private content.
     * If you want the distribution to use signed URLs, include this element; if you want the distribution to use public
     * URLs, remove this element. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private TrustedSigners trustedSigners;
    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     */
    private String priceClass;
    /**
     * <p>
     * Whether the streaming distribution is enabled to accept user requests for content.
     * </p>
     */
    private Boolean enabled;

    /**
     * Default constructor for StreamingDistributionConfig object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public StreamingDistributionConfig() {
    }

    /**
     * Constructs a new StreamingDistributionConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param callerReference
     *        A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *        <p>
     *        If the value of <code>CallerReference</code> is new (regardless of the content of the
     *        <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value that you already sent in a previous request to create a
     *        distribution, CloudFront returns a <code>DistributionAlreadyExists</code> error.
     * @param s3Origin
     *        A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *        your media files for distribution.
     * @param enabled
     *        Whether the streaming distribution is enabled to accept user requests for content.
     */
    public StreamingDistributionConfig(String callerReference, S3Origin s3Origin, Boolean enabled) {
        setCallerReference(callerReference);
        setS3Origin(s3Origin);
        setEnabled(enabled);
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a previous request to create a distribution,
     * CloudFront returns a <code>DistributionAlreadyExists</code> error.
     * </p>
     * 
     * @param callerReference
     *        A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *        <p>
     *        If the value of <code>CallerReference</code> is new (regardless of the content of the
     *        <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value that you already sent in a previous request to create a
     *        distribution, CloudFront returns a <code>DistributionAlreadyExists</code> error.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a previous request to create a distribution,
     * CloudFront returns a <code>DistributionAlreadyExists</code> error.
     * </p>
     * 
     * @return A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *         <p>
     *         If the value of <code>CallerReference</code> is new (regardless of the content of the
     *         <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     *         </p>
     *         <p>
     *         If <code>CallerReference</code> is a value that you already sent in a previous request to create a
     *         distribution, CloudFront returns a <code>DistributionAlreadyExists</code> error.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     * </p>
     * <p>
     * If <code>CallerReference</code> is a value that you already sent in a previous request to create a distribution,
     * CloudFront returns a <code>DistributionAlreadyExists</code> error.
     * </p>
     * 
     * @param callerReference
     *        A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *        <p>
     *        If the value of <code>CallerReference</code> is new (regardless of the content of the
     *        <code>StreamingDistributionConfig</code> object), CloudFront creates a new distribution.
     *        </p>
     *        <p>
     *        If <code>CallerReference</code> is a value that you already sent in a previous request to create a
     *        distribution, CloudFront returns a <code>DistributionAlreadyExists</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     * 
     * @param s3Origin
     *        A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *        your media files for distribution.
     */

    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     * 
     * @return A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *         your media files for distribution.
     */

    public S3Origin getS3Origin() {
        return this.s3Origin;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your
     * media files for distribution.
     * </p>
     * 
     * @param s3Origin
     *        A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get
     *        your media files for distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withS3Origin(S3Origin s3Origin) {
        setS3Origin(s3Origin);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     *        distribution.
     */

    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     * 
     * @return A complex type that contains information about CNAMEs (alternate domain names), if any, for this
     *         streaming distribution.
     */

    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * <p>
     * A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     * distribution.
     * </p>
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate domain names), if any, for this streaming
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * <p>
     * Any comments you want to include about the streaming distribution.
     * </p>
     * 
     * @param comment
     *        Any comments you want to include about the streaming distribution.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments you want to include about the streaming distribution.
     * </p>
     * 
     * @return Any comments you want to include about the streaming distribution.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Any comments you want to include about the streaming distribution.
     * </p>
     * 
     * @param comment
     *        Any comments you want to include about the streaming distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the streaming distribution.
     * </p>
     * 
     * @param logging
     *        A complex type that controls whether access logs are written for the streaming distribution.
     */

    public void setLogging(StreamingLoggingConfig logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the streaming distribution.
     * </p>
     * 
     * @return A complex type that controls whether access logs are written for the streaming distribution.
     */

    public StreamingLoggingConfig getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * A complex type that controls whether access logs are written for the streaming distribution.
     * </p>
     * 
     * @param logging
     *        A complex type that controls whether access logs are written for the streaming distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withLogging(StreamingLoggingConfig logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private content.
     * If you want the distribution to use signed URLs, include this element; if you want the distribution to use public
     * URLs, remove this element. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param trustedSigners
     *        A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private
     *        content. If you want the distribution to use signed URLs, include this element; if you want the
     *        distribution to use public URLs, remove this element. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private content.
     * If you want the distribution to use signed URLs, include this element; if you want the distribution to use public
     * URLs, remove this element. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private
     *         content. If you want the distribution to use signed URLs, include this element; if you want the
     *         distribution to use public URLs, remove this element. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *         Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * <p>
     * A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private content.
     * If you want the distribution to use signed URLs, include this element; if you want the distribution to use public
     * URLs, remove this element. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param trustedSigners
     *        A complex type that specifies any AWS accounts that you want to permit to create signed URLs for private
     *        content. If you want the distribution to use signed URLs, include this element; if you want the
     *        distribution to use public URLs, remove this element. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving
     *        Private Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withTrustedSigners(TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @see PriceClass
     */

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @return A complex type that contains information about price class for this streaming distribution.
     * @see PriceClass
     */

    public String getPriceClass() {
        return this.priceClass;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceClass
     */

    public StreamingDistributionConfig withPriceClass(String priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @see PriceClass
     */

    public void setPriceClass(PriceClass priceClass) {
        withPriceClass(priceClass);
    }

    /**
     * <p>
     * A complex type that contains information about price class for this streaming distribution.
     * </p>
     * 
     * @param priceClass
     *        A complex type that contains information about price class for this streaming distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriceClass
     */

    public StreamingDistributionConfig withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * <p>
     * Whether the streaming distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @param enabled
     *        Whether the streaming distribution is enabled to accept user requests for content.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the streaming distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @return Whether the streaming distribution is enabled to accept user requests for content.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the streaming distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @param enabled
     *        Whether the streaming distribution is enabled to accept user requests for content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamingDistributionConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the streaming distribution is enabled to accept user requests for content.
     * </p>
     * 
     * @return Whether the streaming distribution is enabled to accept user requests for content.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getS3Origin() != null)
            sb.append("S3Origin: ").append(getS3Origin()).append(",");
        if (getAliases() != null)
            sb.append("Aliases: ").append(getAliases()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: ").append(getTrustedSigners()).append(",");
        if (getPriceClass() != null)
            sb.append("PriceClass: ").append(getPriceClass()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamingDistributionConfig == false)
            return false;
        StreamingDistributionConfig other = (StreamingDistributionConfig) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getS3Origin() == null ^ this.getS3Origin() == null)
            return false;
        if (other.getS3Origin() != null && other.getS3Origin().equals(this.getS3Origin()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getPriceClass() == null ^ this.getPriceClass() == null)
            return false;
        if (other.getPriceClass() != null && other.getPriceClass().equals(this.getPriceClass()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode());
        hashCode = prime * hashCode + ((getS3Origin() == null) ? 0 : getS3Origin().hashCode());
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode());
        hashCode = prime * hashCode + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDistributionConfig clone() {
        try {
            return (StreamingDistributionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
