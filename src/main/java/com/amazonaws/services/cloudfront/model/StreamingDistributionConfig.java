/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;


/**
 * <p>
 * The configuration for the streaming distribution.
 * </p>
 */
public class StreamingDistributionConfig implements Serializable {

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * StreamingDistributionConfig object), a new streaming distribution is
     * created. If the CallerReference is a value you already sent in a
     * previous request to create a streaming distribution, and the content
     * of the StreamingDistributionConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create a
     * streaming distribution but the content of the
     * StreamingDistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     */
    private String callerReference;

    /**
     * A complex type that contains information about the Amazon S3 bucket
     * from which you want CloudFront to get your media files for
     * distribution.
     */
    private S3Origin s3Origin;

    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this streaming distribution.
     */
    private Aliases aliases;

    /**
     * Any comments you want to include about the streaming distribution.
     */
    private String comment;

    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution.
     */
    private StreamingLoggingConfig logging;

    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     */
    private TrustedSigners trustedSigners;

    /**
     * A complex type that contains information about price class for this
     * streaming distribution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     */
    private String priceClass;

    /**
     * Whether the streaming distribution is enabled to accept end user
     * requests for content.
     */
    private Boolean enabled;

    /**
     * Default constructor for a new StreamingDistributionConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StreamingDistributionConfig() {}
    
    /**
     * Constructs a new StreamingDistributionConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param callerReference A unique number that ensures the request can't
     * be replayed. If the CallerReference is new (no matter the content of
     * the StreamingDistributionConfig object), a new streaming distribution
     * is created. If the CallerReference is a value you already sent in a
     * previous request to create a streaming distribution, and the content
     * of the StreamingDistributionConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create a
     * streaming distribution but the content of the
     * StreamingDistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     * @param s3Origin A complex type that contains information about the
     * Amazon S3 bucket from which you want CloudFront to get your media
     * files for distribution.
     * @param enabled Whether the streaming distribution is enabled to accept
     * end user requests for content.
     */
    public StreamingDistributionConfig(String callerReference, S3Origin s3Origin, Boolean enabled) {
        setCallerReference(callerReference);
        setS3Origin(s3Origin);
        setEnabled(enabled);
    }

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * StreamingDistributionConfig object), a new streaming distribution is
     * created. If the CallerReference is a value you already sent in a
     * previous request to create a streaming distribution, and the content
     * of the StreamingDistributionConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create a
     * streaming distribution but the content of the
     * StreamingDistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     *
     * @return A unique number that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the
     *         StreamingDistributionConfig object), a new streaming distribution is
     *         created. If the CallerReference is a value you already sent in a
     *         previous request to create a streaming distribution, and the content
     *         of the StreamingDistributionConfig is identical to the original
     *         request (ignoring white space), the response includes the same
     *         information returned to the original request. If the CallerReference
     *         is a value you already sent in a previous request to create a
     *         streaming distribution but the content of the
     *         StreamingDistributionConfig is different from the original request,
     *         CloudFront returns a DistributionAlreadyExists error.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * StreamingDistributionConfig object), a new streaming distribution is
     * created. If the CallerReference is a value you already sent in a
     * previous request to create a streaming distribution, and the content
     * of the StreamingDistributionConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create a
     * streaming distribution but the content of the
     * StreamingDistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     *
     * @param callerReference A unique number that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the
     *         StreamingDistributionConfig object), a new streaming distribution is
     *         created. If the CallerReference is a value you already sent in a
     *         previous request to create a streaming distribution, and the content
     *         of the StreamingDistributionConfig is identical to the original
     *         request (ignoring white space), the response includes the same
     *         information returned to the original request. If the CallerReference
     *         is a value you already sent in a previous request to create a
     *         streaming distribution but the content of the
     *         StreamingDistributionConfig is different from the original request,
     *         CloudFront returns a DistributionAlreadyExists error.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * StreamingDistributionConfig object), a new streaming distribution is
     * created. If the CallerReference is a value you already sent in a
     * previous request to create a streaming distribution, and the content
     * of the StreamingDistributionConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create a
     * streaming distribution but the content of the
     * StreamingDistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param callerReference A unique number that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the
     *         StreamingDistributionConfig object), a new streaming distribution is
     *         created. If the CallerReference is a value you already sent in a
     *         previous request to create a streaming distribution, and the content
     *         of the StreamingDistributionConfig is identical to the original
     *         request (ignoring white space), the response includes the same
     *         information returned to the original request. If the CallerReference
     *         is a value you already sent in a previous request to create a
     *         streaming distribution but the content of the
     *         StreamingDistributionConfig is different from the original request,
     *         CloudFront returns a DistributionAlreadyExists error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * A complex type that contains information about the Amazon S3 bucket
     * from which you want CloudFront to get your media files for
     * distribution.
     *
     * @return A complex type that contains information about the Amazon S3 bucket
     *         from which you want CloudFront to get your media files for
     *         distribution.
     */
    public S3Origin getS3Origin() {
        return s3Origin;
    }
    
    /**
     * A complex type that contains information about the Amazon S3 bucket
     * from which you want CloudFront to get your media files for
     * distribution.
     *
     * @param s3Origin A complex type that contains information about the Amazon S3 bucket
     *         from which you want CloudFront to get your media files for
     *         distribution.
     */
    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }
    
    /**
     * A complex type that contains information about the Amazon S3 bucket
     * from which you want CloudFront to get your media files for
     * distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Origin A complex type that contains information about the Amazon S3 bucket
     *         from which you want CloudFront to get your media files for
     *         distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
        return this;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this streaming distribution.
     *
     * @return A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this streaming distribution.
     */
    public Aliases getAliases() {
        return aliases;
    }
    
    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this streaming distribution.
     *
     * @param aliases A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this streaming distribution.
     */
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }
    
    /**
     * A complex type that contains information about CNAMEs (alternate
     * domain names), if any, for this streaming distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliases A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this streaming distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withAliases(Aliases aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Any comments you want to include about the streaming distribution.
     *
     * @return Any comments you want to include about the streaming distribution.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * Any comments you want to include about the streaming distribution.
     *
     * @param comment Any comments you want to include about the streaming distribution.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * Any comments you want to include about the streaming distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment Any comments you want to include about the streaming distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution.
     *
     * @return A complex type that controls whether access logs are written for the
     *         streaming distribution.
     */
    public StreamingLoggingConfig getLogging() {
        return logging;
    }
    
    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution.
     *
     * @param logging A complex type that controls whether access logs are written for the
     *         streaming distribution.
     */
    public void setLogging(StreamingLoggingConfig logging) {
        this.logging = logging;
    }
    
    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logging A complex type that controls whether access logs are written for the
     *         streaming distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withLogging(StreamingLoggingConfig logging) {
        this.logging = logging;
        return this;
    }

    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     *
     * @return A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     *
     * @param trustedSigners A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trustedSigners A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * A complex type that contains information about price class for this
     * streaming distribution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @return A complex type that contains information about price class for this
     *         streaming distribution.
     *
     * @see PriceClass
     */
    public String getPriceClass() {
        return priceClass;
    }
    
    /**
     * A complex type that contains information about price class for this
     * streaming distribution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass A complex type that contains information about price class for this
     *         streaming distribution.
     *
     * @see PriceClass
     */
    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }
    
    /**
     * A complex type that contains information about price class for this
     * streaming distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass A complex type that contains information about price class for this
     *         streaming distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PriceClass
     */
    public StreamingDistributionConfig withPriceClass(String priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * A complex type that contains information about price class for this
     * streaming distribution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass A complex type that contains information about price class for this
     *         streaming distribution.
     *
     * @see PriceClass
     */
    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }
    
    /**
     * A complex type that contains information about price class for this
     * streaming distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass A complex type that contains information about price class for this
     *         streaming distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PriceClass
     */
    public StreamingDistributionConfig withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * Whether the streaming distribution is enabled to accept end user
     * requests for content.
     *
     * @return Whether the streaming distribution is enabled to accept end user
     *         requests for content.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Whether the streaming distribution is enabled to accept end user
     * requests for content.
     *
     * @param enabled Whether the streaming distribution is enabled to accept end user
     *         requests for content.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Whether the streaming distribution is enabled to accept end user
     * requests for content.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Whether the streaming distribution is enabled to accept end user
     *         requests for content.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether the streaming distribution is enabled to accept end user
     * requests for content.
     *
     * @return Whether the streaming distribution is enabled to accept end user
     *         requests for content.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getS3Origin() != null) sb.append("S3Origin: " + getS3Origin() + ",");
        if (getAliases() != null) sb.append("Aliases: " + getAliases() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getLogging() != null) sb.append("Logging: " + getLogging() + ",");
        if (getTrustedSigners() != null) sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getPriceClass() != null) sb.append("PriceClass: " + getPriceClass() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamingDistributionConfig == false) return false;
        StreamingDistributionConfig other = (StreamingDistributionConfig)obj;
        
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getS3Origin() == null ^ this.getS3Origin() == null) return false;
        if (other.getS3Origin() != null && other.getS3Origin().equals(this.getS3Origin()) == false) return false; 
        if (other.getAliases() == null ^ this.getAliases() == null) return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.getLogging() == null ^ this.getLogging() == null) return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false) return false; 
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null) return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false) return false; 
        if (other.getPriceClass() == null ^ this.getPriceClass() == null) return false;
        if (other.getPriceClass() != null && other.getPriceClass().equals(this.getPriceClass()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
}
    