/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the access log configuration for the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerAccessLog"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerAccessLog implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interval in minutes for publishing the access logs.
     * </p>
     * <p>
     * You can publish access logs either every 5 minutes or every 60 minutes.
     * </p>
     */
    private Integer emitInterval;
    /**
     * <p>
     * Indicates whether access logs are enabled for the load balancer.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the S3 bucket where the access logs are stored.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The logical hierarchy that was created for the S3 bucket.
     * </p>
     * <p>
     * If a prefix is not provided, the log is placed at the root level of the bucket.
     * </p>
     */
    private String s3BucketPrefix;

    /**
     * <p>
     * The interval in minutes for publishing the access logs.
     * </p>
     * <p>
     * You can publish access logs either every 5 minutes or every 60 minutes.
     * </p>
     * 
     * @param emitInterval
     *        The interval in minutes for publishing the access logs.</p>
     *        <p>
     *        You can publish access logs either every 5 minutes or every 60 minutes.
     */

    public void setEmitInterval(Integer emitInterval) {
        this.emitInterval = emitInterval;
    }

    /**
     * <p>
     * The interval in minutes for publishing the access logs.
     * </p>
     * <p>
     * You can publish access logs either every 5 minutes or every 60 minutes.
     * </p>
     * 
     * @return The interval in minutes for publishing the access logs.</p>
     *         <p>
     *         You can publish access logs either every 5 minutes or every 60 minutes.
     */

    public Integer getEmitInterval() {
        return this.emitInterval;
    }

    /**
     * <p>
     * The interval in minutes for publishing the access logs.
     * </p>
     * <p>
     * You can publish access logs either every 5 minutes or every 60 minutes.
     * </p>
     * 
     * @param emitInterval
     *        The interval in minutes for publishing the access logs.</p>
     *        <p>
     *        You can publish access logs either every 5 minutes or every 60 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAccessLog withEmitInterval(Integer emitInterval) {
        setEmitInterval(emitInterval);
        return this;
    }

    /**
     * <p>
     * Indicates whether access logs are enabled for the load balancer.
     * </p>
     * 
     * @param enabled
     *        Indicates whether access logs are enabled for the load balancer.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether access logs are enabled for the load balancer.
     * </p>
     * 
     * @return Indicates whether access logs are enabled for the load balancer.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether access logs are enabled for the load balancer.
     * </p>
     * 
     * @param enabled
     *        Indicates whether access logs are enabled for the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAccessLog withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether access logs are enabled for the load balancer.
     * </p>
     * 
     * @return Indicates whether access logs are enabled for the load balancer.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the S3 bucket where the access logs are stored.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket where the access logs are stored.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the access logs are stored.
     * </p>
     * 
     * @return The name of the S3 bucket where the access logs are stored.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket where the access logs are stored.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket where the access logs are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAccessLog withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The logical hierarchy that was created for the S3 bucket.
     * </p>
     * <p>
     * If a prefix is not provided, the log is placed at the root level of the bucket.
     * </p>
     * 
     * @param s3BucketPrefix
     *        The logical hierarchy that was created for the S3 bucket.</p>
     *        <p>
     *        If a prefix is not provided, the log is placed at the root level of the bucket.
     */

    public void setS3BucketPrefix(String s3BucketPrefix) {
        this.s3BucketPrefix = s3BucketPrefix;
    }

    /**
     * <p>
     * The logical hierarchy that was created for the S3 bucket.
     * </p>
     * <p>
     * If a prefix is not provided, the log is placed at the root level of the bucket.
     * </p>
     * 
     * @return The logical hierarchy that was created for the S3 bucket.</p>
     *         <p>
     *         If a prefix is not provided, the log is placed at the root level of the bucket.
     */

    public String getS3BucketPrefix() {
        return this.s3BucketPrefix;
    }

    /**
     * <p>
     * The logical hierarchy that was created for the S3 bucket.
     * </p>
     * <p>
     * If a prefix is not provided, the log is placed at the root level of the bucket.
     * </p>
     * 
     * @param s3BucketPrefix
     *        The logical hierarchy that was created for the S3 bucket.</p>
     *        <p>
     *        If a prefix is not provided, the log is placed at the root level of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAccessLog withS3BucketPrefix(String s3BucketPrefix) {
        setS3BucketPrefix(s3BucketPrefix);
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
        if (getEmitInterval() != null)
            sb.append("EmitInterval: ").append(getEmitInterval()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3BucketPrefix() != null)
            sb.append("S3BucketPrefix: ").append(getS3BucketPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerAccessLog == false)
            return false;
        AwsElbLoadBalancerAccessLog other = (AwsElbLoadBalancerAccessLog) obj;
        if (other.getEmitInterval() == null ^ this.getEmitInterval() == null)
            return false;
        if (other.getEmitInterval() != null && other.getEmitInterval().equals(this.getEmitInterval()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3BucketPrefix() == null ^ this.getS3BucketPrefix() == null)
            return false;
        if (other.getS3BucketPrefix() != null && other.getS3BucketPrefix().equals(this.getS3BucketPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmitInterval() == null) ? 0 : getEmitInterval().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3BucketPrefix() == null) ? 0 : getS3BucketPrefix().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerAccessLog clone() {
        try {
            return (AwsElbLoadBalancerAccessLog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerAccessLogMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
