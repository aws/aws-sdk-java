/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the access log configuration for a bucket in the Amazon Lightsail object storage service.
 * </p>
 * <p>
 * For more information about bucket access logs, see <a
 * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-bucket-access-logs">Logging bucket
 * requests using access logging in Amazon Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/BucketAccessLogConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketAccessLogConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the same
     * account, and in the same Amazon Web Services Region as the source bucket.
     * </p>
     * <note>
     * <p>
     * This parameter is required when enabling the access log for a bucket, and should be omitted when disabling the
     * access log.
     * </p>
     * </note>
     */
    private String destination;
    /**
     * <p>
     * The optional object prefix for the bucket access log.
     * </p>
     * <p>
     * The prefix is an optional addition to the object key that organizes your access log files in the destination
     * bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will begin with the
     * <code>logs/</code> prefix in its key (for example, <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     * </p>
     * <note>
     * <p>
     * This parameter can be optionally specified when enabling the access log for a bucket, and should be omitted when
     * disabling the access log.
     * </p>
     * </note>
     */
    private String prefix;

    /**
     * <p>
     * A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     * </p>
     * 
     * @param enabled
     *        A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     * </p>
     * 
     * @return A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     * </p>
     * 
     * @param enabled
     *        A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketAccessLogConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     * </p>
     * 
     * @return A Boolean value that indicates whether bucket access logging is enabled for the bucket.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the same
     * account, and in the same Amazon Web Services Region as the source bucket.
     * </p>
     * <note>
     * <p>
     * This parameter is required when enabling the access log for a bucket, and should be omitted when disabling the
     * access log.
     * </p>
     * </note>
     * 
     * @param destination
     *        The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the
     *        same account, and in the same Amazon Web Services Region as the source bucket.</p> <note>
     *        <p>
     *        This parameter is required when enabling the access log for a bucket, and should be omitted when disabling
     *        the access log.
     *        </p>
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the same
     * account, and in the same Amazon Web Services Region as the source bucket.
     * </p>
     * <note>
     * <p>
     * This parameter is required when enabling the access log for a bucket, and should be omitted when disabling the
     * access log.
     * </p>
     * </note>
     * 
     * @return The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the
     *         same account, and in the same Amazon Web Services Region as the source bucket.</p> <note>
     *         <p>
     *         This parameter is required when enabling the access log for a bucket, and should be omitted when
     *         disabling the access log.
     *         </p>
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the same
     * account, and in the same Amazon Web Services Region as the source bucket.
     * </p>
     * <note>
     * <p>
     * This parameter is required when enabling the access log for a bucket, and should be omitted when disabling the
     * access log.
     * </p>
     * </note>
     * 
     * @param destination
     *        The name of the bucket where the access logs are saved. The destination can be a Lightsail bucket in the
     *        same account, and in the same Amazon Web Services Region as the source bucket.</p> <note>
     *        <p>
     *        This parameter is required when enabling the access log for a bucket, and should be omitted when disabling
     *        the access log.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketAccessLogConfig withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The optional object prefix for the bucket access log.
     * </p>
     * <p>
     * The prefix is an optional addition to the object key that organizes your access log files in the destination
     * bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will begin with the
     * <code>logs/</code> prefix in its key (for example, <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     * </p>
     * <note>
     * <p>
     * This parameter can be optionally specified when enabling the access log for a bucket, and should be omitted when
     * disabling the access log.
     * </p>
     * </note>
     * 
     * @param prefix
     *        The optional object prefix for the bucket access log.</p>
     *        <p>
     *        The prefix is an optional addition to the object key that organizes your access log files in the
     *        destination bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will
     *        begin with the <code>logs/</code> prefix in its key (for example,
     *        <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     *        </p>
     *        <note>
     *        <p>
     *        This parameter can be optionally specified when enabling the access log for a bucket, and should be
     *        omitted when disabling the access log.
     *        </p>
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The optional object prefix for the bucket access log.
     * </p>
     * <p>
     * The prefix is an optional addition to the object key that organizes your access log files in the destination
     * bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will begin with the
     * <code>logs/</code> prefix in its key (for example, <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     * </p>
     * <note>
     * <p>
     * This parameter can be optionally specified when enabling the access log for a bucket, and should be omitted when
     * disabling the access log.
     * </p>
     * </note>
     * 
     * @return The optional object prefix for the bucket access log.</p>
     *         <p>
     *         The prefix is an optional addition to the object key that organizes your access log files in the
     *         destination bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will
     *         begin with the <code>logs/</code> prefix in its key (for example,
     *         <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     *         </p>
     *         <note>
     *         <p>
     *         This parameter can be optionally specified when enabling the access log for a bucket, and should be
     *         omitted when disabling the access log.
     *         </p>
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The optional object prefix for the bucket access log.
     * </p>
     * <p>
     * The prefix is an optional addition to the object key that organizes your access log files in the destination
     * bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will begin with the
     * <code>logs/</code> prefix in its key (for example, <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     * </p>
     * <note>
     * <p>
     * This parameter can be optionally specified when enabling the access log for a bucket, and should be omitted when
     * disabling the access log.
     * </p>
     * </note>
     * 
     * @param prefix
     *        The optional object prefix for the bucket access log.</p>
     *        <p>
     *        The prefix is an optional addition to the object key that organizes your access log files in the
     *        destination bucket. For example, if you specify a <code>logs/</code> prefix, then each log object will
     *        begin with the <code>logs/</code> prefix in its key (for example,
     *        <code>logs/2021-11-01-21-32-16-E568B2907131C0C0</code>).
     *        </p>
     *        <note>
     *        <p>
     *        This parameter can be optionally specified when enabling the access log for a bucket, and should be
     *        omitted when disabling the access log.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketAccessLogConfig withPrefix(String prefix) {
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
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

        if (obj instanceof BucketAccessLogConfig == false)
            return false;
        BucketAccessLogConfig other = (BucketAccessLogConfig) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
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
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public BucketAccessLogConfig clone() {
        try {
            return (BucketAccessLogConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.BucketAccessLogConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
