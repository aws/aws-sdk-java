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
 * A customer origin or an Amazon S3 bucket configured as a website endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CustomOriginConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomOriginConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP port the custom origin listens on.
     * </p>
     */
    private Integer hTTPPort;
    /**
     * <p>
     * The HTTPS port the custom origin listens on.
     * </p>
     */
    private Integer hTTPSPort;
    /**
     * <p>
     * The origin protocol policy to apply to your origin.
     * </p>
     */
    private String originProtocolPolicy;
    /**
     * <p>
     * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     * </p>
     */
    private OriginSslProtocols originSslProtocols;
    /**
     * <p>
     * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is
     * 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is
     * 4 seconds; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     */
    private Integer originReadTimeout;
    /**
     * <p>
     * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5
     * seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1
     * second; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     */
    private Integer originKeepaliveTimeout;

    /**
     * <p>
     * The HTTP port the custom origin listens on.
     * </p>
     * 
     * @param hTTPPort
     *        The HTTP port the custom origin listens on.
     */

    public void setHTTPPort(Integer hTTPPort) {
        this.hTTPPort = hTTPPort;
    }

    /**
     * <p>
     * The HTTP port the custom origin listens on.
     * </p>
     * 
     * @return The HTTP port the custom origin listens on.
     */

    public Integer getHTTPPort() {
        return this.hTTPPort;
    }

    /**
     * <p>
     * The HTTP port the custom origin listens on.
     * </p>
     * 
     * @param hTTPPort
     *        The HTTP port the custom origin listens on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomOriginConfig withHTTPPort(Integer hTTPPort) {
        setHTTPPort(hTTPPort);
        return this;
    }

    /**
     * <p>
     * The HTTPS port the custom origin listens on.
     * </p>
     * 
     * @param hTTPSPort
     *        The HTTPS port the custom origin listens on.
     */

    public void setHTTPSPort(Integer hTTPSPort) {
        this.hTTPSPort = hTTPSPort;
    }

    /**
     * <p>
     * The HTTPS port the custom origin listens on.
     * </p>
     * 
     * @return The HTTPS port the custom origin listens on.
     */

    public Integer getHTTPSPort() {
        return this.hTTPSPort;
    }

    /**
     * <p>
     * The HTTPS port the custom origin listens on.
     * </p>
     * 
     * @param hTTPSPort
     *        The HTTPS port the custom origin listens on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomOriginConfig withHTTPSPort(Integer hTTPSPort) {
        setHTTPSPort(hTTPSPort);
        return this;
    }

    /**
     * <p>
     * The origin protocol policy to apply to your origin.
     * </p>
     * 
     * @param originProtocolPolicy
     *        The origin protocol policy to apply to your origin.
     * @see OriginProtocolPolicy
     */

    public void setOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }

    /**
     * <p>
     * The origin protocol policy to apply to your origin.
     * </p>
     * 
     * @return The origin protocol policy to apply to your origin.
     * @see OriginProtocolPolicy
     */

    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    /**
     * <p>
     * The origin protocol policy to apply to your origin.
     * </p>
     * 
     * @param originProtocolPolicy
     *        The origin protocol policy to apply to your origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginProtocolPolicy
     */

    public CustomOriginConfig withOriginProtocolPolicy(String originProtocolPolicy) {
        setOriginProtocolPolicy(originProtocolPolicy);
        return this;
    }

    /**
     * <p>
     * The origin protocol policy to apply to your origin.
     * </p>
     * 
     * @param originProtocolPolicy
     *        The origin protocol policy to apply to your origin.
     * @see OriginProtocolPolicy
     */

    public void setOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
        withOriginProtocolPolicy(originProtocolPolicy);
    }

    /**
     * <p>
     * The origin protocol policy to apply to your origin.
     * </p>
     * 
     * @param originProtocolPolicy
     *        The origin protocol policy to apply to your origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginProtocolPolicy
     */

    public CustomOriginConfig withOriginProtocolPolicy(OriginProtocolPolicy originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     * </p>
     * 
     * @param originSslProtocols
     *        The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     */

    public void setOriginSslProtocols(OriginSslProtocols originSslProtocols) {
        this.originSslProtocols = originSslProtocols;
    }

    /**
     * <p>
     * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     * </p>
     * 
     * @return The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     */

    public OriginSslProtocols getOriginSslProtocols() {
        return this.originSslProtocols;
    }

    /**
     * <p>
     * The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     * </p>
     * 
     * @param originSslProtocols
     *        The SSL/TLS protocols that you want CloudFront to use when communicating with your origin over HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomOriginConfig withOriginSslProtocols(OriginSslProtocols originSslProtocols) {
        setOriginSslProtocols(originSslProtocols);
        return this;
    }

    /**
     * <p>
     * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is
     * 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is
     * 4 seconds; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     * 
     * @param originReadTimeout
     *        You can create a custom origin read timeout. All timeout units are in seconds. The default origin read
     *        timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum
     *        timeout length is 4 seconds; the maximum is 60 seconds.</p>
     *        <p>
     *        If you need to increase the maximum time limit, contact the <a
     *        href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     */

    public void setOriginReadTimeout(Integer originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
    }

    /**
     * <p>
     * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is
     * 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is
     * 4 seconds; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     * 
     * @return You can create a custom origin read timeout. All timeout units are in seconds. The default origin read
     *         timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum
     *         timeout length is 4 seconds; the maximum is 60 seconds.</p>
     *         <p>
     *         If you need to increase the maximum time limit, contact the <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     */

    public Integer getOriginReadTimeout() {
        return this.originReadTimeout;
    }

    /**
     * <p>
     * You can create a custom origin read timeout. All timeout units are in seconds. The default origin read timeout is
     * 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is
     * 4 seconds; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     * 
     * @param originReadTimeout
     *        You can create a custom origin read timeout. All timeout units are in seconds. The default origin read
     *        timeout is 30 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum
     *        timeout length is 4 seconds; the maximum is 60 seconds.</p>
     *        <p>
     *        If you need to increase the maximum time limit, contact the <a
     *        href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomOriginConfig withOriginReadTimeout(Integer originReadTimeout) {
        setOriginReadTimeout(originReadTimeout);
        return this;
    }

    /**
     * <p>
     * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5
     * seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1
     * second; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     * 
     * @param originKeepaliveTimeout
     *        You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive
     *        timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum
     *        timeout length is 1 second; the maximum is 60 seconds.</p>
     *        <p>
     *        If you need to increase the maximum time limit, contact the <a
     *        href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     */

    public void setOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
    }

    /**
     * <p>
     * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5
     * seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1
     * second; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     * 
     * @return You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive
     *         timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum
     *         timeout length is 1 second; the maximum is 60 seconds.</p>
     *         <p>
     *         If you need to increase the maximum time limit, contact the <a
     *         href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     */

    public Integer getOriginKeepaliveTimeout() {
        return this.originKeepaliveTimeout;
    }

    /**
     * <p>
     * You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive timeout is 5
     * seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum timeout length is 1
     * second; the maximum is 60 seconds.
     * </p>
     * <p>
     * If you need to increase the maximum time limit, contact the <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * </p>
     * 
     * @param originKeepaliveTimeout
     *        You can create a custom keep-alive timeout. All timeout units are in seconds. The default keep-alive
     *        timeout is 5 seconds, but you can configure custom timeout lengths using the CloudFront API. The minimum
     *        timeout length is 1 second; the maximum is 60 seconds.</p>
     *        <p>
     *        If you need to increase the maximum time limit, contact the <a
     *        href="https://console.aws.amazon.com/support/home#/">AWS Support Center</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomOriginConfig withOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        setOriginKeepaliveTimeout(originKeepaliveTimeout);
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
        if (getHTTPPort() != null)
            sb.append("HTTPPort: ").append(getHTTPPort()).append(",");
        if (getHTTPSPort() != null)
            sb.append("HTTPSPort: ").append(getHTTPSPort()).append(",");
        if (getOriginProtocolPolicy() != null)
            sb.append("OriginProtocolPolicy: ").append(getOriginProtocolPolicy()).append(",");
        if (getOriginSslProtocols() != null)
            sb.append("OriginSslProtocols: ").append(getOriginSslProtocols()).append(",");
        if (getOriginReadTimeout() != null)
            sb.append("OriginReadTimeout: ").append(getOriginReadTimeout()).append(",");
        if (getOriginKeepaliveTimeout() != null)
            sb.append("OriginKeepaliveTimeout: ").append(getOriginKeepaliveTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomOriginConfig == false)
            return false;
        CustomOriginConfig other = (CustomOriginConfig) obj;
        if (other.getHTTPPort() == null ^ this.getHTTPPort() == null)
            return false;
        if (other.getHTTPPort() != null && other.getHTTPPort().equals(this.getHTTPPort()) == false)
            return false;
        if (other.getHTTPSPort() == null ^ this.getHTTPSPort() == null)
            return false;
        if (other.getHTTPSPort() != null && other.getHTTPSPort().equals(this.getHTTPSPort()) == false)
            return false;
        if (other.getOriginProtocolPolicy() == null ^ this.getOriginProtocolPolicy() == null)
            return false;
        if (other.getOriginProtocolPolicy() != null && other.getOriginProtocolPolicy().equals(this.getOriginProtocolPolicy()) == false)
            return false;
        if (other.getOriginSslProtocols() == null ^ this.getOriginSslProtocols() == null)
            return false;
        if (other.getOriginSslProtocols() != null && other.getOriginSslProtocols().equals(this.getOriginSslProtocols()) == false)
            return false;
        if (other.getOriginReadTimeout() == null ^ this.getOriginReadTimeout() == null)
            return false;
        if (other.getOriginReadTimeout() != null && other.getOriginReadTimeout().equals(this.getOriginReadTimeout()) == false)
            return false;
        if (other.getOriginKeepaliveTimeout() == null ^ this.getOriginKeepaliveTimeout() == null)
            return false;
        if (other.getOriginKeepaliveTimeout() != null && other.getOriginKeepaliveTimeout().equals(this.getOriginKeepaliveTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHTTPPort() == null) ? 0 : getHTTPPort().hashCode());
        hashCode = prime * hashCode + ((getHTTPSPort() == null) ? 0 : getHTTPSPort().hashCode());
        hashCode = prime * hashCode + ((getOriginProtocolPolicy() == null) ? 0 : getOriginProtocolPolicy().hashCode());
        hashCode = prime * hashCode + ((getOriginSslProtocols() == null) ? 0 : getOriginSslProtocols().hashCode());
        hashCode = prime * hashCode + ((getOriginReadTimeout() == null) ? 0 : getOriginReadTimeout().hashCode());
        hashCode = prime * hashCode + ((getOriginKeepaliveTimeout() == null) ? 0 : getOriginKeepaliveTimeout().hashCode());
        return hashCode;
    }

    @Override
    public CustomOriginConfig clone() {
        try {
            return (CustomOriginConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
