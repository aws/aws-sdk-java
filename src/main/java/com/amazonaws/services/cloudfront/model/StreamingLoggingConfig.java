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
 * A complex type that controls whether access logs are written for this streaming distribution.
 * </p>
 */
public class StreamingLoggingConfig implements Serializable {

    /**
     * Specifies whether you want CloudFront to save access logs to an Amazon
     * S3 bucket. If you do not want to enable logging when you create a
     * streaming distribution or if you want to disable logging for an
     * existing streaming distribution, specify false for Enabled, and
     * specify empty Bucket and Prefix elements. If you specify false for
     * Enabled but you specify values for Bucket and Prefix, the values are
     * automatically deleted.
     */
    private Boolean enabled;

    /**
     * The Amazon S3 bucket to store the access logs in, for example,
     * myawslogbucket.s3.amazonaws.com.
     */
    private String bucket;

    /**
     * An optional string that you want CloudFront to prefix to the access
     * log filenames for this streaming distribution, for example, myprefix/.
     * If you want to enable logging, but you do not want to specify a
     * prefix, you still must include an empty Prefix element in the Logging
     * element.
     */
    private String prefix;

    /**
     * Specifies whether you want CloudFront to save access logs to an Amazon
     * S3 bucket. If you do not want to enable logging when you create a
     * streaming distribution or if you want to disable logging for an
     * existing streaming distribution, specify false for Enabled, and
     * specify empty Bucket and Prefix elements. If you specify false for
     * Enabled but you specify values for Bucket and Prefix, the values are
     * automatically deleted.
     *
     * @return Specifies whether you want CloudFront to save access logs to an Amazon
     *         S3 bucket. If you do not want to enable logging when you create a
     *         streaming distribution or if you want to disable logging for an
     *         existing streaming distribution, specify false for Enabled, and
     *         specify empty Bucket and Prefix elements. If you specify false for
     *         Enabled but you specify values for Bucket and Prefix, the values are
     *         automatically deleted.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether you want CloudFront to save access logs to an Amazon
     * S3 bucket. If you do not want to enable logging when you create a
     * streaming distribution or if you want to disable logging for an
     * existing streaming distribution, specify false for Enabled, and
     * specify empty Bucket and Prefix elements. If you specify false for
     * Enabled but you specify values for Bucket and Prefix, the values are
     * automatically deleted.
     *
     * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon
     *         S3 bucket. If you do not want to enable logging when you create a
     *         streaming distribution or if you want to disable logging for an
     *         existing streaming distribution, specify false for Enabled, and
     *         specify empty Bucket and Prefix elements. If you specify false for
     *         Enabled but you specify values for Bucket and Prefix, the values are
     *         automatically deleted.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether you want CloudFront to save access logs to an Amazon
     * S3 bucket. If you do not want to enable logging when you create a
     * streaming distribution or if you want to disable logging for an
     * existing streaming distribution, specify false for Enabled, and
     * specify empty Bucket and Prefix elements. If you specify false for
     * Enabled but you specify values for Bucket and Prefix, the values are
     * automatically deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon
     *         S3 bucket. If you do not want to enable logging when you create a
     *         streaming distribution or if you want to disable logging for an
     *         existing streaming distribution, specify false for Enabled, and
     *         specify empty Bucket and Prefix elements. If you specify false for
     *         Enabled but you specify values for Bucket and Prefix, the values are
     *         automatically deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingLoggingConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether you want CloudFront to save access logs to an Amazon
     * S3 bucket. If you do not want to enable logging when you create a
     * streaming distribution or if you want to disable logging for an
     * existing streaming distribution, specify false for Enabled, and
     * specify empty Bucket and Prefix elements. If you specify false for
     * Enabled but you specify values for Bucket and Prefix, the values are
     * automatically deleted.
     *
     * @return Specifies whether you want CloudFront to save access logs to an Amazon
     *         S3 bucket. If you do not want to enable logging when you create a
     *         streaming distribution or if you want to disable logging for an
     *         existing streaming distribution, specify false for Enabled, and
     *         specify empty Bucket and Prefix elements. If you specify false for
     *         Enabled but you specify values for Bucket and Prefix, the values are
     *         automatically deleted.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The Amazon S3 bucket to store the access logs in, for example,
     * myawslogbucket.s3.amazonaws.com.
     *
     * @return The Amazon S3 bucket to store the access logs in, for example,
     *         myawslogbucket.s3.amazonaws.com.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The Amazon S3 bucket to store the access logs in, for example,
     * myawslogbucket.s3.amazonaws.com.
     *
     * @param bucket The Amazon S3 bucket to store the access logs in, for example,
     *         myawslogbucket.s3.amazonaws.com.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The Amazon S3 bucket to store the access logs in, for example,
     * myawslogbucket.s3.amazonaws.com.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The Amazon S3 bucket to store the access logs in, for example,
     *         myawslogbucket.s3.amazonaws.com.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingLoggingConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * An optional string that you want CloudFront to prefix to the access
     * log filenames for this streaming distribution, for example, myprefix/.
     * If you want to enable logging, but you do not want to specify a
     * prefix, you still must include an empty Prefix element in the Logging
     * element.
     *
     * @return An optional string that you want CloudFront to prefix to the access
     *         log filenames for this streaming distribution, for example, myprefix/.
     *         If you want to enable logging, but you do not want to specify a
     *         prefix, you still must include an empty Prefix element in the Logging
     *         element.
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * An optional string that you want CloudFront to prefix to the access
     * log filenames for this streaming distribution, for example, myprefix/.
     * If you want to enable logging, but you do not want to specify a
     * prefix, you still must include an empty Prefix element in the Logging
     * element.
     *
     * @param prefix An optional string that you want CloudFront to prefix to the access
     *         log filenames for this streaming distribution, for example, myprefix/.
     *         If you want to enable logging, but you do not want to specify a
     *         prefix, you still must include an empty Prefix element in the Logging
     *         element.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * An optional string that you want CloudFront to prefix to the access
     * log filenames for this streaming distribution, for example, myprefix/.
     * If you want to enable logging, but you do not want to specify a
     * prefix, you still must include an empty Prefix element in the Logging
     * element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefix An optional string that you want CloudFront to prefix to the access
     *         log filenames for this streaming distribution, for example, myprefix/.
     *         If you want to enable logging, but you do not want to specify a
     *         prefix, you still must include an empty Prefix element in the Logging
     *         element.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public StreamingLoggingConfig withPrefix(String prefix) {
        this.prefix = prefix;
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
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getBucket() != null) sb.append("Bucket: " + getBucket() + ",");
        if (getPrefix() != null) sb.append("Prefix: " + getPrefix() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode()); 
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamingLoggingConfig == false) return false;
        StreamingLoggingConfig other = (StreamingLoggingConfig)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false; 
        return true;
    }
    
}
    