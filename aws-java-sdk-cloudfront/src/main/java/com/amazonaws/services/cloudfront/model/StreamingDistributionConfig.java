/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * 
 */
public class StreamingDistributionConfig implements Serializable, Cloneable {

    private String callerReference;

    private S3Origin s3Origin;

    private Aliases aliases;

    private String comment;

    private StreamingLoggingConfig logging;

    private TrustedSigners trustedSigners;

    private String priceClass;

    private Boolean enabled;

    /**
     * Default constructor for StreamingDistributionConfig object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public StreamingDistributionConfig() {
    }

    /**
     * Constructs a new StreamingDistributionConfig object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param callerReference
     * @param s3Origin
     * @param enabled
     */
    public StreamingDistributionConfig(String callerReference,
            S3Origin s3Origin, Boolean enabled) {
        setCallerReference(callerReference);
        setS3Origin(s3Origin);
        setEnabled(enabled);
    }

    /**
     * @param callerReference
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * @return
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * @param callerReference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withCallerReference(
            String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * @param s3Origin
     */
    public void setS3Origin(S3Origin s3Origin) {
        this.s3Origin = s3Origin;
    }

    /**
     * @return
     */
    public S3Origin getS3Origin() {
        return this.s3Origin;
    }

    /**
     * @param s3Origin
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withS3Origin(S3Origin s3Origin) {
        setS3Origin(s3Origin);
        return this;
    }

    /**
     * @param aliases
     */
    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * @return
     */
    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * @param aliases
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @param comment
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * @param logging
     */
    public void setLogging(StreamingLoggingConfig logging) {
        this.logging = logging;
    }

    /**
     * @return
     */
    public StreamingLoggingConfig getLogging() {
        return this.logging;
    }

    /**
     * @param logging
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withLogging(
            StreamingLoggingConfig logging) {
        setLogging(logging);
        return this;
    }

    /**
     * @param trustedSigners
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }

    /**
     * @return
     */
    public TrustedSigners getTrustedSigners() {
        return this.trustedSigners;
    }

    /**
     * @param trustedSigners
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withTrustedSigners(
            TrustedSigners trustedSigners) {
        setTrustedSigners(trustedSigners);
        return this;
    }

    /**
     * @param priceClass
     * @see PriceClass
     */
    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * @return
     * @see PriceClass
     */
    public String getPriceClass() {
        return this.priceClass;
    }

    /**
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public StreamingDistributionConfig withPriceClass(String priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }

    /**
     * @param priceClass
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */
    public StreamingDistributionConfig withPriceClass(PriceClass priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @param enabled
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public StreamingDistributionConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * @return
     */
    public Boolean isEnabled() {
        return this.enabled;
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getS3Origin() != null)
            sb.append("S3Origin: " + getS3Origin() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getLogging() != null)
            sb.append("Logging: " + getLogging() + ",");
        if (getTrustedSigners() != null)
            sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getPriceClass() != null)
            sb.append("PriceClass: " + getPriceClass() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
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
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getS3Origin() == null ^ this.getS3Origin() == null)
            return false;
        if (other.getS3Origin() != null
                && other.getS3Origin().equals(this.getS3Origin()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null
                && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null
                && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getTrustedSigners() == null
                ^ this.getTrustedSigners() == null)
            return false;
        if (other.getTrustedSigners() != null
                && other.getTrustedSigners().equals(this.getTrustedSigners()) == false)
            return false;
        if (other.getPriceClass() == null ^ this.getPriceClass() == null)
            return false;
        if (other.getPriceClass() != null
                && other.getPriceClass().equals(this.getPriceClass()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getS3Origin() == null) ? 0 : getS3Origin().hashCode());
        hashCode = prime * hashCode
                + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustedSigners() == null) ? 0 : getTrustedSigners()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public StreamingDistributionConfig clone() {
        try {
            return (StreamingDistributionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}