/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>AccessLog</code> data type.
 * </p>
 */
public class AccessLog implements Serializable {

    /**
     * Specifies whether access log is enabled for the load balancer.
     */
    private Boolean enabled;

    /**
     * The name of the Amazon S3 bucket where the access logs are stored.
     */
    private String s3BucketName;

    /**
     * The interval for publishing the access logs. You can specify an
     * interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     */
    private Integer emitInterval;

    /**
     * The logical hierarchy you created for your Amazon S3 bucket, for
     * example <code>my-bucket-prefix/prod</code>. If the prefix is not
     * provided, the log is placed at the root level of the bucket.
     */
    private String s3BucketPrefix;

    /**
     * Specifies whether access log is enabled for the load balancer.
     *
     * @return Specifies whether access log is enabled for the load balancer.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether access log is enabled for the load balancer.
     *
     * @param enabled Specifies whether access log is enabled for the load balancer.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether access log is enabled for the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether access log is enabled for the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessLog withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether access log is enabled for the load balancer.
     *
     * @return Specifies whether access log is enabled for the load balancer.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The name of the Amazon S3 bucket where the access logs are stored.
     *
     * @return The name of the Amazon S3 bucket where the access logs are stored.
     */
    public String getS3BucketName() {
        return s3BucketName;
    }
    
    /**
     * The name of the Amazon S3 bucket where the access logs are stored.
     *
     * @param s3BucketName The name of the Amazon S3 bucket where the access logs are stored.
     */
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }
    
    /**
     * The name of the Amazon S3 bucket where the access logs are stored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3BucketName The name of the Amazon S3 bucket where the access logs are stored.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessLog withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * The interval for publishing the access logs. You can specify an
     * interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     *
     * @return The interval for publishing the access logs. You can specify an
     *         interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     */
    public Integer getEmitInterval() {
        return emitInterval;
    }
    
    /**
     * The interval for publishing the access logs. You can specify an
     * interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     *
     * @param emitInterval The interval for publishing the access logs. You can specify an
     *         interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     */
    public void setEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
    }
    
    /**
     * The interval for publishing the access logs. You can specify an
     * interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param emitInterval The interval for publishing the access logs. You can specify an
     *         interval of either 5 minutes or 60 minutes. <p>Default: 60 minutes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessLog withEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
        return this;
    }

    /**
     * The logical hierarchy you created for your Amazon S3 bucket, for
     * example <code>my-bucket-prefix/prod</code>. If the prefix is not
     * provided, the log is placed at the root level of the bucket.
     *
     * @return The logical hierarchy you created for your Amazon S3 bucket, for
     *         example <code>my-bucket-prefix/prod</code>. If the prefix is not
     *         provided, the log is placed at the root level of the bucket.
     */
    public String getS3BucketPrefix() {
        return s3BucketPrefix;
    }
    
    /**
     * The logical hierarchy you created for your Amazon S3 bucket, for
     * example <code>my-bucket-prefix/prod</code>. If the prefix is not
     * provided, the log is placed at the root level of the bucket.
     *
     * @param s3BucketPrefix The logical hierarchy you created for your Amazon S3 bucket, for
     *         example <code>my-bucket-prefix/prod</code>. If the prefix is not
     *         provided, the log is placed at the root level of the bucket.
     */
    public void setS3BucketPrefix(String s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
    }
    
    /**
     * The logical hierarchy you created for your Amazon S3 bucket, for
     * example <code>my-bucket-prefix/prod</code>. If the prefix is not
     * provided, the log is placed at the root level of the bucket.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param s3BucketPrefix The logical hierarchy you created for your Amazon S3 bucket, for
     *         example <code>my-bucket-prefix/prod</code>. If the prefix is not
     *         provided, the log is placed at the root level of the bucket.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AccessLog withS3BucketPrefix(String s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
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
        if (getS3BucketName() != null) sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getEmitInterval() != null) sb.append("EmitInterval: " + getEmitInterval() + ",");
        if (getS3BucketPrefix() != null) sb.append("S3BucketPrefix: " + getS3BucketPrefix() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode()); 
        hashCode = prime * hashCode + ((getEmitInterval() == null) ? 0 : getEmitInterval().hashCode()); 
        hashCode = prime * hashCode + ((getS3BucketPrefix() == null) ? 0 : getS3BucketPrefix().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AccessLog == false) return false;
        AccessLog other = (AccessLog)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null) return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false) return false; 
        if (other.getEmitInterval() == null ^ this.getEmitInterval() == null) return false;
        if (other.getEmitInterval() != null && other.getEmitInterval().equals(this.getEmitInterval()) == false) return false; 
        if (other.getS3BucketPrefix() == null ^ this.getS3BucketPrefix() == null) return false;
        if (other.getS3BucketPrefix() != null && other.getS3BucketPrefix().equals(this.getS3BucketPrefix()) == false) return false; 
        return true;
    }
    
}
    