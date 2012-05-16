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
 * Configuration for access logging for a distribution.
 * </p>
 */
public class LoggingConfig {

    /**
     * The bucket to receive access logs.
     */
    private String bucket;

    /**
     * The prefix to use for stored access log files.
     */
    private String prefix;

    /**
     * Default constructor for a new LoggingConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public LoggingConfig() {}
    
    /**
     * Constructs a new LoggingConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param bucket The bucket to receive access logs.
     * @param prefix The prefix to use for stored access log files.
     */
    public LoggingConfig(String bucket, String prefix) {
        this.bucket = bucket;
        this.prefix = prefix;
    }

    
    
    /**
     * The bucket to receive access logs.
     *
     * @return The bucket to receive access logs.
     */
    public String getBucket() {
        return bucket;
    }
    
    /**
     * The bucket to receive access logs.
     *
     * @param bucket The bucket to receive access logs.
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
    
    /**
     * The bucket to receive access logs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bucket The bucket to receive access logs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoggingConfig withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    
    
    /**
     * The prefix to use for stored access log files.
     *
     * @return The prefix to use for stored access log files.
     */
    public String getPrefix() {
        return prefix;
    }
    
    /**
     * The prefix to use for stored access log files.
     *
     * @param prefix The prefix to use for stored access log files.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    /**
     * The prefix to use for stored access log files.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefix The prefix to use for stored access log files.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public LoggingConfig withPrefix(String prefix) {
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
        if (bucket != null) sb.append("Bucket: " + bucket + ", ");
        if (prefix != null) sb.append("Prefix: " + prefix + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode()); 
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof LoggingConfig == false) return false;
        LoggingConfig other = (LoggingConfig)obj;
        
        if (other.getBucket() == null ^ this.getBucket() == null) return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false) return false; 
        if (other.getPrefix() == null ^ this.getPrefix() == null) return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false) return false; 
        return true;
    }
    
}
    
