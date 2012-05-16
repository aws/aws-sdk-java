/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15.model;

/**
 * <p>
 * A summary of the information for an Amazon CloudFront streaming
 * distribution.
 * </p>
 */
public class StreamingDistributionSummary {

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
     * Your S3 origin bucket.
     */
    private S3Origin s3Origin;

    /**
     * The CNAMEs associated with this distribution.
     */
    private java.util.List<String> cNAME;

    /**
     * The comment originally specified when this distribution was created.
     */
    private String comment;

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     */
    private Boolean enabled;

    /**
     * The trusted signers of the URL.
     */
    private TrustedSigners trustedSigners;

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
     * Your S3 origin bucket.
     *
     * @return Your S3 origin bucket.
     */
    public S3Origin getS3Origin() {
        return s3Origin;
    }
    
    /**
     * Your S3 origin bucket.
     *
     * @param s3Origin Your S3 origin bucket.
     */
    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }
    
    /**
     * Your S3 origin bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Origin Your S3 origin bucket.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionSummary withS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
        return this;
    }
    
    
    /**
     * The CNAMEs associated with this distribution.
     *
     * @return The CNAMEs associated with this distribution.
     */
    public java.util.List<String> getCNAME() {
        
        if (cNAME == null) {
            cNAME = new java.util.ArrayList<String>();
        }
        return cNAME;
    }
    
    /**
     * The CNAMEs associated with this distribution.
     *
     * @param cNAME The CNAMEs associated with this distribution.
     */
    public void setCNAME(java.util.Collection<String> cNAME) {
        if (cNAME == null) {
            this.cNAME = null;
            return;
        }

        java.util.List<String> cNAMECopy = new java.util.ArrayList<String>(cNAME.size());
        cNAMECopy.addAll(cNAME);
        this.cNAME = cNAMECopy;
    }
    
    /**
     * The CNAMEs associated with this distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cNAME The CNAMEs associated with this distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionSummary withCNAME(String... cNAME) {
        if (getCNAME() == null) setCNAME(new java.util.ArrayList<String>(cNAME.length));
        for (String value : cNAME) {
            getCNAME().add(value);
        }
        return this;
    }
    
    /**
     * The CNAMEs associated with this distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cNAME The CNAMEs associated with this distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionSummary withCNAME(java.util.Collection<String> cNAME) {
        if (cNAME == null) {
            this.cNAME = null;
        } else {
            java.util.List<String> cNAMECopy = new java.util.ArrayList<String>(cNAME.size());
            cNAMECopy.addAll(cNAME);
            this.cNAME = cNAMECopy;
        }

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
     * The trusted signers of the URL.
     *
     * @return The trusted signers of the URL.
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }
    
    /**
     * The trusted signers of the URL.
     *
     * @param trustedSigners The trusted signers of the URL.
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }
    
    /**
     * The trusted signers of the URL.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trustedSigners The trusted signers of the URL.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionSummary withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
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
        if (id != null) sb.append("Id: " + id + ", ");
        if (status != null) sb.append("Status: " + status + ", ");
        if (lastModifiedTime != null) sb.append("LastModifiedTime: " + lastModifiedTime + ", ");
        if (domainName != null) sb.append("DomainName: " + domainName + ", ");
        if (s3Origin != null) sb.append("S3Origin: " + s3Origin + ", ");
        if (cNAME != null) sb.append("CNAME: " + cNAME + ", ");
        if (comment != null) sb.append("Comment: " + comment + ", ");
        if (enabled != null) sb.append("Enabled: " + enabled + ", ");
        if (trustedSigners != null) sb.append("TrustedSigners: " + trustedSigners + ", ");
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
        hashCode = prime * hashCode + ((getCNAME() == null) ? 0 : getCNAME().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode()); 
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
        if (other.getCNAME() == null ^ this.getCNAME() == null) return false;
        if (other.getCNAME() != null && other.getCNAME().equals(this.getCNAME()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null) return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false) return false; 
        return true;
    }
    
}
    
