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
 * A complex type that controls whether access logs are written for the distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/LoggingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfig implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable
     * logging when you create a distribution or if you want to disable logging for an existing distribution, specify
     * <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code> and <code>Prefix</code>
     * elements. If you specify <code>false</code> for <code>Enabled</code> but you specify values for
     * <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     * <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies regardless of
     * how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create
     * a distribution or if you want to disable include cookies for an existing distribution, specify <code>false</code>
     * for <code>IncludeCookies</code>.
     * </p>
     */
    private Boolean includeCookies;
    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example, <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     * distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to specify a
     * prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code> element.
     * </p>
     */
    private String prefix;

    /**
     * Default constructor for LoggingConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public LoggingConfig() {
    }

    /**
     * Constructs a new LoggingConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param bucket
     *        The Amazon S3 bucket to store the access logs in, for example,
     *        <code>myawslogbucket.s3.amazonaws.com</code>.
     * @param prefix
     *        An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     *        distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to
     *        specify a prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code>
     *        element.
     */
    public LoggingConfig(String bucket, String prefix) {
        setBucket(bucket);
        setPrefix(prefix);
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable
     * logging when you create a distribution or if you want to disable logging for an existing distribution, specify
     * <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code> and <code>Prefix</code>
     * elements. If you specify <code>false</code> for <code>Enabled</code> but you specify values for
     * <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     * 
     * @param enabled
     *        Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to
     *        enable logging when you create a distribution or if you want to disable logging for an existing
     *        distribution, specify <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code>
     *        and <code>Prefix</code> elements. If you specify <code>false</code> for <code>Enabled</code> but you
     *        specify values for <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values
     *        are automatically deleted.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable
     * logging when you create a distribution or if you want to disable logging for an existing distribution, specify
     * <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code> and <code>Prefix</code>
     * elements. If you specify <code>false</code> for <code>Enabled</code> but you specify values for
     * <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     * 
     * @return Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to
     *         enable logging when you create a distribution or if you want to disable logging for an existing
     *         distribution, specify <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code>
     *         and <code>Prefix</code> elements. If you specify <code>false</code> for <code>Enabled</code> but you
     *         specify values for <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values
     *         are automatically deleted.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable
     * logging when you create a distribution or if you want to disable logging for an existing distribution, specify
     * <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code> and <code>Prefix</code>
     * elements. If you specify <code>false</code> for <code>Enabled</code> but you specify values for
     * <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     * 
     * @param enabled
     *        Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to
     *        enable logging when you create a distribution or if you want to disable logging for an existing
     *        distribution, specify <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code>
     *        and <code>Prefix</code> elements. If you specify <code>false</code> for <code>Enabled</code> but you
     *        specify values for <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values
     *        are automatically deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to enable
     * logging when you create a distribution or if you want to disable logging for an existing distribution, specify
     * <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code> and <code>Prefix</code>
     * elements. If you specify <code>false</code> for <code>Enabled</code> but you specify values for
     * <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values are automatically deleted.
     * </p>
     * 
     * @return Specifies whether you want CloudFront to save access logs to an Amazon S3 bucket. If you don't want to
     *         enable logging when you create a distribution or if you want to disable logging for an existing
     *         distribution, specify <code>false</code> for <code>Enabled</code>, and specify empty <code>Bucket</code>
     *         and <code>Prefix</code> elements. If you specify <code>false</code> for <code>Enabled</code> but you
     *         specify values for <code>Bucket</code>, <code>prefix</code>, and <code>IncludeCookies</code>, the values
     *         are automatically deleted.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     * <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies regardless of
     * how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create
     * a distribution or if you want to disable include cookies for an existing distribution, specify <code>false</code>
     * for <code>IncludeCookies</code>.
     * </p>
     * 
     * @param includeCookies
     *        Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     *        <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies
     *        regardless of how you configure the cache behaviors for this distribution. If you don't want to include
     *        cookies when you create a distribution or if you want to disable include cookies for an existing
     *        distribution, specify <code>false</code> for <code>IncludeCookies</code>.
     */

    public void setIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     * <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies regardless of
     * how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create
     * a distribution or if you want to disable include cookies for an existing distribution, specify <code>false</code>
     * for <code>IncludeCookies</code>.
     * </p>
     * 
     * @return Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     *         <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies
     *         regardless of how you configure the cache behaviors for this distribution. If you don't want to include
     *         cookies when you create a distribution or if you want to disable include cookies for an existing
     *         distribution, specify <code>false</code> for <code>IncludeCookies</code>.
     */

    public Boolean getIncludeCookies() {
        return this.includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     * <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies regardless of
     * how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create
     * a distribution or if you want to disable include cookies for an existing distribution, specify <code>false</code>
     * for <code>IncludeCookies</code>.
     * </p>
     * 
     * @param includeCookies
     *        Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     *        <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies
     *        regardless of how you configure the cache behaviors for this distribution. If you don't want to include
     *        cookies when you create a distribution or if you want to disable include cookies for an existing
     *        distribution, specify <code>false</code> for <code>IncludeCookies</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withIncludeCookies(Boolean includeCookies) {
        setIncludeCookies(includeCookies);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     * <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies regardless of
     * how you configure the cache behaviors for this distribution. If you don't want to include cookies when you create
     * a distribution or if you want to disable include cookies for an existing distribution, specify <code>false</code>
     * for <code>IncludeCookies</code>.
     * </p>
     * 
     * @return Specifies whether you want CloudFront to include cookies in access logs, specify <code>true</code> for
     *         <code>IncludeCookies</code>. If you choose to include cookies in logs, CloudFront logs all cookies
     *         regardless of how you configure the cache behaviors for this distribution. If you don't want to include
     *         cookies when you create a distribution or if you want to disable include cookies for an existing
     *         distribution, specify <code>false</code> for <code>IncludeCookies</code>.
     */

    public Boolean isIncludeCookies() {
        return this.includeCookies;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example, <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket to store the access logs in, for example,
     *        <code>myawslogbucket.s3.amazonaws.com</code>.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example, <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     * 
     * @return The Amazon S3 bucket to store the access logs in, for example,
     *         <code>myawslogbucket.s3.amazonaws.com</code>.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in, for example, <code>myawslogbucket.s3.amazonaws.com</code>.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket to store the access logs in, for example,
     *        <code>myawslogbucket.s3.amazonaws.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     * distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to specify a
     * prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code> element.
     * </p>
     * 
     * @param prefix
     *        An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     *        distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to
     *        specify a prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code>
     *        element.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     * distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to specify a
     * prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code> element.
     * </p>
     * 
     * @return An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     *         distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to
     *         specify a prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code>
     *         element.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     * distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to specify a
     * prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code> element.
     * </p>
     * 
     * @param prefix
     *        An optional string that you want CloudFront to prefix to the access log <code>filenames</code> for this
     *        distribution, for example, <code>myprefix/</code>. If you want to enable logging, but you don't want to
     *        specify a prefix, you still must include an empty <code>Prefix</code> element in the <code>Logging</code>
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIncludeCookies() != null)
            sb.append("IncludeCookies: ").append(getIncludeCookies()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIncludeCookies() == null ^ this.getIncludeCookies() == null)
            return false;
        if (other.getIncludeCookies() != null && other.getIncludeCookies().equals(this.getIncludeCookies()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIncludeCookies() == null) ? 0 : getIncludeCookies().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfig clone() {
        try {
            return (LoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
