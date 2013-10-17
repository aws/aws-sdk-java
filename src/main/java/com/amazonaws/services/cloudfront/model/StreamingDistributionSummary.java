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
 * A summary of the information for an Amazon CloudFront streaming distribution.
 * </p>
 */
public class StreamingDistributionSummary implements Serializable {

    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    private String id;

    /**
     * Indicates the current status of the distribution. When the status is
     * Deployed, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     */
    private String status;

    /**
     * The date and time the distribution was last modified.
     */
    private java.util.Date lastModifiedTime;

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     */
    private String domainName;

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
     * The comment originally specified when this distribution was created.
     */
    private String comment;

    private String priceClass;

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     */
    private Boolean enabled;

    /**
     * Default constructor for a new StreamingDistributionSummary object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StreamingDistributionSummary() {}
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @return The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @param id The identifier for the distribution. For example: EDFDVBD632BHDS5.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The identifier for the distribution. For example: EDFDVBD632BHDS5.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The identifier for the distribution. For example: EDFDVBD632BHDS5.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Indicates the current status of the distribution. When the status is
     * Deployed, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     *
     * @return Indicates the current status of the distribution. When the status is
     *         Deployed, the distribution's information is fully propagated
     *         throughout the Amazon CloudFront system.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Indicates the current status of the distribution. When the status is
     * Deployed, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     *
     * @param status Indicates the current status of the distribution. When the status is
     *         Deployed, the distribution's information is fully propagated
     *         throughout the Amazon CloudFront system.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Indicates the current status of the distribution. When the status is
     * Deployed, the distribution's information is fully propagated
     * throughout the Amazon CloudFront system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Indicates the current status of the distribution. When the status is
     *         Deployed, the distribution's information is fully propagated
     *         throughout the Amazon CloudFront system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionSummary withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The date and time the distribution was last modified.
     *
     * @return The date and time the distribution was last modified.
     */
    public java.util.Date getLastModifiedTime() {
        return lastModifiedTime;
    }
    
    /**
     * The date and time the distribution was last modified.
     *
     * @param lastModifiedTime The date and time the distribution was last modified.
     */
    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }
    
    /**
     * The date and time the distribution was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedTime The date and time the distribution was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     *
     * @return The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     *
     * @param domainName The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The domain name corresponding to the distribution. For example:
     * d604721fxaaqy9.cloudfront.net.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainName The domain name corresponding to the distribution. For example:
     *         d604721fxaaqy9.cloudfront.net.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionSummary withDomainName(String domainName) {
        this.domainName = domainName;
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
    public StreamingDistributionSummary withS3Origin(S3Origin s3Origin) {
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
    public StreamingDistributionSummary withAliases(Aliases aliases) {
        this.aliases = aliases;
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
    public StreamingDistributionSummary withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * The comment originally specified when this distribution was created.
     *
     * @return The comment originally specified when this distribution was created.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * The comment originally specified when this distribution was created.
     *
     * @param comment The comment originally specified when this distribution was created.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * The comment originally specified when this distribution was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment The comment originally specified when this distribution was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionSummary withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Returns the value of the PriceClass property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @return The value of the PriceClass property for this object.
     *
     * @see PriceClass
     */
    public String getPriceClass() {
        return priceClass;
    }
    
    /**
     * Sets the value of the PriceClass property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass The new value for the PriceClass property for this object.
     *
     * @see PriceClass
     */
    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }
    
    /**
     * Sets the value of the PriceClass property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass The new value for the PriceClass property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PriceClass
     */
    public StreamingDistributionSummary withPriceClass(String priceClass) {
        this.priceClass = priceClass;
        return this;
    }

    /**
     * Sets the value of the PriceClass property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass The new value for the PriceClass property for this object.
     *
     * @see PriceClass
     */
    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }
    
    /**
     * Sets the value of the PriceClass property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PriceClass_100, PriceClass_200, PriceClass_All
     *
     * @param priceClass The new value for the PriceClass property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PriceClass
     */
    public StreamingDistributionSummary withPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
        return this;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     *
     * @return Whether the distribution is enabled to accept end user requests for
     *         content.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     *
     * @param enabled Whether the distribution is enabled to accept end user requests for
     *         content.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Whether the distribution is enabled to accept end user requests for
     *         content.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingDistributionSummary withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     *
     * @return Whether the distribution is enabled to accept end user requests for
     *         content.
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedTime() != null) sb.append("LastModifiedTime: " + getLastModifiedTime() + ",");
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getS3Origin() != null) sb.append("S3Origin: " + getS3Origin() + ",");
        if (getAliases() != null) sb.append("Aliases: " + getAliases() + ",");
        if (getTrustedSigners() != null) sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() + ",");
        if (getPriceClass() != null) sb.append("PriceClass: " + getPriceClass() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode()); 
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getS3Origin() == null) ? 0 : getS3Origin().hashCode()); 
        hashCode = prime * hashCode + ((getAliases() == null) ? 0 : getAliases().hashCode()); 
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamingDistributionSummary == false) return false;
        StreamingDistributionSummary other = (StreamingDistributionSummary)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null) return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false) return false; 
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getS3Origin() == null ^ this.getS3Origin() == null) return false;
        if (other.getS3Origin() != null && other.getS3Origin().equals(this.getS3Origin()) == false) return false; 
        if (other.getAliases() == null ^ this.getAliases() == null) return false;
        if (other.getAliases() != null && other.getAliases().equals(this.getAliases()) == false) return false; 
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null) return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.getPriceClass() == null ^ this.getPriceClass() == null) return false;
        if (other.getPriceClass() != null && other.getPriceClass().equals(this.getPriceClass()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
}
    