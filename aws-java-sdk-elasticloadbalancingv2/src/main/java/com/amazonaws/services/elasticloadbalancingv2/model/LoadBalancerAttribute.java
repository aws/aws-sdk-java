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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a load balancer attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/LoadBalancerAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code> or
     * <code>false</code>. The default is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String key;
    /**
     * <p>
     * The value of the attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code> or
     * <code>false</code>. The default is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is
     *        required if access logs are enabled. The bucket must exist in the same region as the load balancer and
     *        have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by only Application Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     *        seconds. The default is 60 seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code>
     *        or <code>false</code>. The default is <code>true</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by only Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled.
     *        The value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code> or
     * <code>false</code>. The default is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the attribute.</p>
     *         <p>
     *         The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is
     *         <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is
     *         required if access logs are enabled. The bucket must exist in the same region as the load balancer and
     *         have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     *         <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes are supported by only Application Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     *         seconds. The default is 60 seconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code>
     *         or <code>false</code>. The default is <code>true</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes are supported by only Network Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled.
     *         The value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code> or
     * <code>false</code>. The default is <code>true</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is
     *        required if access logs are enabled. The bucket must exist in the same region as the load balancer and
     *        have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by only Application Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     *        seconds. The default is 60 seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The value is <code>true</code>
     *        or <code>false</code>. The default is <code>true</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by only Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled.
     *        The value is <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @return The value of the attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttribute withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerAttribute == false)
            return false;
        LoadBalancerAttribute other = (LoadBalancerAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerAttribute clone() {
        try {
            return (LoadBalancerAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
