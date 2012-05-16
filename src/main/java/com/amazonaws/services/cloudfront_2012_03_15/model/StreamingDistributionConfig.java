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
 * The configuration for the streaming distribution.
 * </p>
 */
public class StreamingDistributionConfig {

    /**
     * S3 Origin information to associate with the distribution.
     */
    private S3Origin s3Origin;

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
     * A CNAME alias you want to associate with this streaming distribution.
     * You can have up to 10 CNAME aliases per streaming distribution. Only
     * include a CNAME element if you have a CNAME to associate with the
     * distribution. Don't include an empty CNAME element in the
     * StreamingDistributionConfig object. If you do, CloudFront returns a
     * MalformedXML error.
     */
    private java.util.List<String> cNAME;

    /**
     * Any comments you want to include about the streaming distribution.
     */
    private String comment;

    /**
     * Whether the streaming distribution is enabled to accept end user
     * requests for content.
     */
    private Boolean enabled;

    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution. If you want to turn on access logs, include
     * this element; if you want to turn off access logs, remove this
     * element.
     */
    private LoggingConfig logging;

    /**
     * A complex type that specifies any AWS accounts you want to permit to
     * create signed URLs for private content. If you want the distribution
     * to use signed URLs, include this element; if you want the distribution
     * to use basic URLs, remove this element.
     */
    private TrustedSigners trustedSigners;

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
     * @param s3Origin S3 Origin information to associate with the
     * distribution.
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
     * @param enabled Whether the streaming distribution is enabled to accept
     * end user requests for content.
     */
    public StreamingDistributionConfig(S3Origin s3Origin, String callerReference, Boolean enabled) {
        this.s3Origin = s3Origin;
        this.callerReference = callerReference;
        this.enabled = enabled;
    }

    
    
    /**
     * S3 Origin information to associate with the distribution.
     *
     * @return S3 Origin information to associate with the distribution.
     */
    public S3Origin getS3Origin() {
        return s3Origin;
    }
    
    /**
     * S3 Origin information to associate with the distribution.
     *
     * @param s3Origin S3 Origin information to associate with the distribution.
     */
    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }
    
    /**
     * S3 Origin information to associate with the distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3Origin S3 Origin information to associate with the distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionConfig withS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
        return this;
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
     * A CNAME alias you want to associate with this streaming distribution.
     * You can have up to 10 CNAME aliases per streaming distribution. Only
     * include a CNAME element if you have a CNAME to associate with the
     * distribution. Don't include an empty CNAME element in the
     * StreamingDistributionConfig object. If you do, CloudFront returns a
     * MalformedXML error.
     *
     * @return A CNAME alias you want to associate with this streaming distribution.
     *         You can have up to 10 CNAME aliases per streaming distribution. Only
     *         include a CNAME element if you have a CNAME to associate with the
     *         distribution. Don't include an empty CNAME element in the
     *         StreamingDistributionConfig object. If you do, CloudFront returns a
     *         MalformedXML error.
     */
    public java.util.List<String> getCNAME() {
        
        if (cNAME == null) {
            cNAME = new java.util.ArrayList<String>();
        }
        return cNAME;
    }
    
    /**
     * A CNAME alias you want to associate with this streaming distribution.
     * You can have up to 10 CNAME aliases per streaming distribution. Only
     * include a CNAME element if you have a CNAME to associate with the
     * distribution. Don't include an empty CNAME element in the
     * StreamingDistributionConfig object. If you do, CloudFront returns a
     * MalformedXML error.
     *
     * @param cNAME A CNAME alias you want to associate with this streaming distribution.
     *         You can have up to 10 CNAME aliases per streaming distribution. Only
     *         include a CNAME element if you have a CNAME to associate with the
     *         distribution. Don't include an empty CNAME element in the
     *         StreamingDistributionConfig object. If you do, CloudFront returns a
     *         MalformedXML error.
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
     * A CNAME alias you want to associate with this streaming distribution.
     * You can have up to 10 CNAME aliases per streaming distribution. Only
     * include a CNAME element if you have a CNAME to associate with the
     * distribution. Don't include an empty CNAME element in the
     * StreamingDistributionConfig object. If you do, CloudFront returns a
     * MalformedXML error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cNAME A CNAME alias you want to associate with this streaming distribution.
     *         You can have up to 10 CNAME aliases per streaming distribution. Only
     *         include a CNAME element if you have a CNAME to associate with the
     *         distribution. Don't include an empty CNAME element in the
     *         StreamingDistributionConfig object. If you do, CloudFront returns a
     *         MalformedXML error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionConfig withCNAME(String... cNAME) {
        if (getCNAME() == null) setCNAME(new java.util.ArrayList<String>(cNAME.length));
        for (String value : cNAME) {
            getCNAME().add(value);
        }
        return this;
    }
    
    /**
     * A CNAME alias you want to associate with this streaming distribution.
     * You can have up to 10 CNAME aliases per streaming distribution. Only
     * include a CNAME element if you have a CNAME to associate with the
     * distribution. Don't include an empty CNAME element in the
     * StreamingDistributionConfig object. If you do, CloudFront returns a
     * MalformedXML error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cNAME A CNAME alias you want to associate with this streaming distribution.
     *         You can have up to 10 CNAME aliases per streaming distribution. Only
     *         include a CNAME element if you have a CNAME to associate with the
     *         distribution. Don't include an empty CNAME element in the
     *         StreamingDistributionConfig object. If you do, CloudFront returns a
     *         MalformedXML error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionConfig withCNAME(java.util.Collection<String> cNAME) {
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
     * A complex type that controls whether access logs are written for the
     * streaming distribution. If you want to turn on access logs, include
     * this element; if you want to turn off access logs, remove this
     * element.
     *
     * @return A complex type that controls whether access logs are written for the
     *         streaming distribution. If you want to turn on access logs, include
     *         this element; if you want to turn off access logs, remove this
     *         element.
     */
    public LoggingConfig getLogging() {
        return logging;
    }
    
    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution. If you want to turn on access logs, include
     * this element; if you want to turn off access logs, remove this
     * element.
     *
     * @param logging A complex type that controls whether access logs are written for the
     *         streaming distribution. If you want to turn on access logs, include
     *         this element; if you want to turn off access logs, remove this
     *         element.
     */
    public void setLogging(LoggingConfig logging) {
        this.logging = logging;
    }
    
    /**
     * A complex type that controls whether access logs are written for the
     * streaming distribution. If you want to turn on access logs, include
     * this element; if you want to turn off access logs, remove this
     * element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logging A complex type that controls whether access logs are written for the
     *         streaming distribution. If you want to turn on access logs, include
     *         this element; if you want to turn off access logs, remove this
     *         element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionConfig withLogging(LoggingConfig logging) {
        this.logging = logging;
        return this;
    }
    
    
    /**
     * A complex type that specifies any AWS accounts you want to permit to
     * create signed URLs for private content. If you want the distribution
     * to use signed URLs, include this element; if you want the distribution
     * to use basic URLs, remove this element.
     *
     * @return A complex type that specifies any AWS accounts you want to permit to
     *         create signed URLs for private content. If you want the distribution
     *         to use signed URLs, include this element; if you want the distribution
     *         to use basic URLs, remove this element.
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }
    
    /**
     * A complex type that specifies any AWS accounts you want to permit to
     * create signed URLs for private content. If you want the distribution
     * to use signed URLs, include this element; if you want the distribution
     * to use basic URLs, remove this element.
     *
     * @param trustedSigners A complex type that specifies any AWS accounts you want to permit to
     *         create signed URLs for private content. If you want the distribution
     *         to use signed URLs, include this element; if you want the distribution
     *         to use basic URLs, remove this element.
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }
    
    /**
     * A complex type that specifies any AWS accounts you want to permit to
     * create signed URLs for private content. If you want the distribution
     * to use signed URLs, include this element; if you want the distribution
     * to use basic URLs, remove this element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trustedSigners A complex type that specifies any AWS accounts you want to permit to
     *         create signed URLs for private content. If you want the distribution
     *         to use signed URLs, include this element; if you want the distribution
     *         to use basic URLs, remove this element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StreamingDistributionConfig withTrustedSigners(TrustedSigners trustedSigners) {
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
        if (s3Origin != null) sb.append("S3Origin: " + s3Origin + ", ");
        if (callerReference != null) sb.append("CallerReference: " + callerReference + ", ");
        if (cNAME != null) sb.append("CNAME: " + cNAME + ", ");
        if (comment != null) sb.append("Comment: " + comment + ", ");
        if (enabled != null) sb.append("Enabled: " + enabled + ", ");
        if (logging != null) sb.append("Logging: " + logging + ", ");
        if (trustedSigners != null) sb.append("TrustedSigners: " + trustedSigners + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getS3Origin() == null) ? 0 : getS3Origin().hashCode()); 
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getCNAME() == null) ? 0 : getCNAME().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode()); 
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof StreamingDistributionConfig == false) return false;
        StreamingDistributionConfig other = (StreamingDistributionConfig)obj;
        
        if (other.getS3Origin() == null ^ this.getS3Origin() == null) return false;
        if (other.getS3Origin() != null && other.getS3Origin().equals(this.getS3Origin()) == false) return false; 
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getCNAME() == null ^ this.getCNAME() == null) return false;
        if (other.getCNAME() != null && other.getCNAME().equals(this.getCNAME()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getLogging() == null ^ this.getLogging() == null) return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false) return false; 
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null) return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false) return false; 
        return true;
    }
    
}
    
