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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom origin. A custom origin is any origin that is not an Amazon S3 bucket, with one exception. An Amazon S3
 * bucket that is <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">configured with static
 * website hosting</a> is a custom origin.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionOriginCustomOriginConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionOriginCustomOriginConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin.
     * </p>
     */
    private Integer httpPort;
    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin.
     * </p>
     */
    private Integer httpsPort;
    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     * </p>
     */
    private Integer originKeepaliveTimeout;
    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     * </p>
     */
    private String originProtocolPolicy;
    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the origin.
     * </p>
     */
    private Integer originReadTimeout;
    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     * </p>
     */
    private AwsCloudFrontDistributionOriginSslProtocols originSslProtocols;

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @param httpPort
     *        The HTTP port that CloudFront uses to connect to the origin.
     */

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @return The HTTP port that CloudFront uses to connect to the origin.
     */

    public Integer getHttpPort() {
        return this.httpPort;
    }

    /**
     * <p>
     * The HTTP port that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @param httpPort
     *        The HTTP port that CloudFront uses to connect to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginCustomOriginConfig withHttpPort(Integer httpPort) {
        setHttpPort(httpPort);
        return this;
    }

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @param httpsPort
     *        The HTTPS port that CloudFront uses to connect to the origin.
     */

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @return The HTTPS port that CloudFront uses to connect to the origin.
     */

    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    /**
     * <p>
     * The HTTPS port that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @param httpsPort
     *        The HTTPS port that CloudFront uses to connect to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginCustomOriginConfig withHttpsPort(Integer httpsPort) {
        setHttpsPort(httpsPort);
        return this;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     * </p>
     * 
     * @param originKeepaliveTimeout
     *        Specifies how long, in seconds, CloudFront persists its connection to the origin.
     */

    public void setOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        this.originKeepaliveTimeout = originKeepaliveTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     * </p>
     * 
     * @return Specifies how long, in seconds, CloudFront persists its connection to the origin.
     */

    public Integer getOriginKeepaliveTimeout() {
        return this.originKeepaliveTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     * </p>
     * 
     * @param originKeepaliveTimeout
     *        Specifies how long, in seconds, CloudFront persists its connection to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginCustomOriginConfig withOriginKeepaliveTimeout(Integer originKeepaliveTimeout) {
        setOriginKeepaliveTimeout(originKeepaliveTimeout);
        return this;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @param originProtocolPolicy
     *        Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     */

    public void setOriginProtocolPolicy(String originProtocolPolicy) {
        this.originProtocolPolicy = originProtocolPolicy;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @return Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     */

    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    /**
     * <p>
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     * </p>
     * 
     * @param originProtocolPolicy
     *        Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginCustomOriginConfig withOriginProtocolPolicy(String originProtocolPolicy) {
        setOriginProtocolPolicy(originProtocolPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the origin.
     * </p>
     * 
     * @param originReadTimeout
     *        Specifies how long, in seconds, CloudFront waits for a response from the origin.
     */

    public void setOriginReadTimeout(Integer originReadTimeout) {
        this.originReadTimeout = originReadTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the origin.
     * </p>
     * 
     * @return Specifies how long, in seconds, CloudFront waits for a response from the origin.
     */

    public Integer getOriginReadTimeout() {
        return this.originReadTimeout;
    }

    /**
     * <p>
     * Specifies how long, in seconds, CloudFront waits for a response from the origin.
     * </p>
     * 
     * @param originReadTimeout
     *        Specifies how long, in seconds, CloudFront waits for a response from the origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginCustomOriginConfig withOriginReadTimeout(Integer originReadTimeout) {
        setOriginReadTimeout(originReadTimeout);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     * </p>
     * 
     * @param originSslProtocols
     *        Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     */

    public void setOriginSslProtocols(AwsCloudFrontDistributionOriginSslProtocols originSslProtocols) {
        this.originSslProtocols = originSslProtocols;
    }

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     * </p>
     * 
     * @return Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     */

    public AwsCloudFrontDistributionOriginSslProtocols getOriginSslProtocols() {
        return this.originSslProtocols;
    }

    /**
     * <p>
     * Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     * </p>
     * 
     * @param originSslProtocols
     *        Specifies the minimum SSL/TLS protocol that CloudFront uses when connecting to your origin over HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionOriginCustomOriginConfig withOriginSslProtocols(AwsCloudFrontDistributionOriginSslProtocols originSslProtocols) {
        setOriginSslProtocols(originSslProtocols);
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
        if (getHttpPort() != null)
            sb.append("HttpPort: ").append(getHttpPort()).append(",");
        if (getHttpsPort() != null)
            sb.append("HttpsPort: ").append(getHttpsPort()).append(",");
        if (getOriginKeepaliveTimeout() != null)
            sb.append("OriginKeepaliveTimeout: ").append(getOriginKeepaliveTimeout()).append(",");
        if (getOriginProtocolPolicy() != null)
            sb.append("OriginProtocolPolicy: ").append(getOriginProtocolPolicy()).append(",");
        if (getOriginReadTimeout() != null)
            sb.append("OriginReadTimeout: ").append(getOriginReadTimeout()).append(",");
        if (getOriginSslProtocols() != null)
            sb.append("OriginSslProtocols: ").append(getOriginSslProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOriginCustomOriginConfig == false)
            return false;
        AwsCloudFrontDistributionOriginCustomOriginConfig other = (AwsCloudFrontDistributionOriginCustomOriginConfig) obj;
        if (other.getHttpPort() == null ^ this.getHttpPort() == null)
            return false;
        if (other.getHttpPort() != null && other.getHttpPort().equals(this.getHttpPort()) == false)
            return false;
        if (other.getHttpsPort() == null ^ this.getHttpsPort() == null)
            return false;
        if (other.getHttpsPort() != null && other.getHttpsPort().equals(this.getHttpsPort()) == false)
            return false;
        if (other.getOriginKeepaliveTimeout() == null ^ this.getOriginKeepaliveTimeout() == null)
            return false;
        if (other.getOriginKeepaliveTimeout() != null && other.getOriginKeepaliveTimeout().equals(this.getOriginKeepaliveTimeout()) == false)
            return false;
        if (other.getOriginProtocolPolicy() == null ^ this.getOriginProtocolPolicy() == null)
            return false;
        if (other.getOriginProtocolPolicy() != null && other.getOriginProtocolPolicy().equals(this.getOriginProtocolPolicy()) == false)
            return false;
        if (other.getOriginReadTimeout() == null ^ this.getOriginReadTimeout() == null)
            return false;
        if (other.getOriginReadTimeout() != null && other.getOriginReadTimeout().equals(this.getOriginReadTimeout()) == false)
            return false;
        if (other.getOriginSslProtocols() == null ^ this.getOriginSslProtocols() == null)
            return false;
        if (other.getOriginSslProtocols() != null && other.getOriginSslProtocols().equals(this.getOriginSslProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpPort() == null) ? 0 : getHttpPort().hashCode());
        hashCode = prime * hashCode + ((getHttpsPort() == null) ? 0 : getHttpsPort().hashCode());
        hashCode = prime * hashCode + ((getOriginKeepaliveTimeout() == null) ? 0 : getOriginKeepaliveTimeout().hashCode());
        hashCode = prime * hashCode + ((getOriginProtocolPolicy() == null) ? 0 : getOriginProtocolPolicy().hashCode());
        hashCode = prime * hashCode + ((getOriginReadTimeout() == null) ? 0 : getOriginReadTimeout().hashCode());
        hashCode = prime * hashCode + ((getOriginSslProtocols() == null) ? 0 : getOriginSslProtocols().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionOriginCustomOriginConfig clone() {
        try {
            return (AwsCloudFrontDistributionOriginCustomOriginConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionOriginCustomOriginConfigMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
