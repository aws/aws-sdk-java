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
 * Metadata options that allow you to configure and secure the Amazon EC2 instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2InstanceMetadataOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2InstanceMetadataOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on the instance.
     * </p>
     */
    private String httpEndpoint;
    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     */
    private String httpProtocolIpv6;
    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * The state of token usage for your instance metadata requests.
     * </p>
     */
    private String httpTokens;
    /**
     * <p>
     * Specifies whether to allow access to instance tags from the instance metadata.
     * </p>
     */
    private String instanceMetadataTags;

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on the instance.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on the instance.
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on the instance.
     * </p>
     * 
     * @return Enables or disables the HTTP metadata endpoint on the instance.
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on the instance.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceMetadataOptions withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service.
     */

    public void setHttpProtocolIpv6(String httpProtocolIpv6) {
        this.httpProtocolIpv6 = httpProtocolIpv6;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * 
     * @return Enables or disables the IPv6 endpoint for the instance metadata service.
     */

    public String getHttpProtocolIpv6() {
        return this.httpProtocolIpv6;
    }

    /**
     * <p>
     * Enables or disables the IPv6 endpoint for the instance metadata service.
     * </p>
     * 
     * @param httpProtocolIpv6
     *        Enables or disables the IPv6 endpoint for the instance metadata service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceMetadataOptions withHttpProtocolIpv6(String httpProtocolIpv6) {
        setHttpProtocolIpv6(httpProtocolIpv6);
        return this;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     *        instance metadata requests can travel.
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * 
     * @return The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the
     *         further instance metadata requests can travel.
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further
     *        instance metadata requests can travel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceMetadataOptions withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
        return this;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests.
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
     * </p>
     * 
     * @return The state of token usage for your instance metadata requests.
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * The state of token usage for your instance metadata requests.
     * </p>
     * 
     * @param httpTokens
     *        The state of token usage for your instance metadata requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceMetadataOptions withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
        return this;
    }

    /**
     * <p>
     * Specifies whether to allow access to instance tags from the instance metadata.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Specifies whether to allow access to instance tags from the instance metadata.
     */

    public void setInstanceMetadataTags(String instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags;
    }

    /**
     * <p>
     * Specifies whether to allow access to instance tags from the instance metadata.
     * </p>
     * 
     * @return Specifies whether to allow access to instance tags from the instance metadata.
     */

    public String getInstanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    /**
     * <p>
     * Specifies whether to allow access to instance tags from the instance metadata.
     * </p>
     * 
     * @param instanceMetadataTags
     *        Specifies whether to allow access to instance tags from the instance metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2InstanceMetadataOptions withInstanceMetadataTags(String instanceMetadataTags) {
        setInstanceMetadataTags(instanceMetadataTags);
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
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: ").append(getHttpEndpoint()).append(",");
        if (getHttpProtocolIpv6() != null)
            sb.append("HttpProtocolIpv6: ").append(getHttpProtocolIpv6()).append(",");
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: ").append(getHttpPutResponseHopLimit()).append(",");
        if (getHttpTokens() != null)
            sb.append("HttpTokens: ").append(getHttpTokens()).append(",");
        if (getInstanceMetadataTags() != null)
            sb.append("InstanceMetadataTags: ").append(getInstanceMetadataTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2InstanceMetadataOptions == false)
            return false;
        AwsEc2InstanceMetadataOptions other = (AwsEc2InstanceMetadataOptions) obj;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        if (other.getHttpProtocolIpv6() == null ^ this.getHttpProtocolIpv6() == null)
            return false;
        if (other.getHttpProtocolIpv6() != null && other.getHttpProtocolIpv6().equals(this.getHttpProtocolIpv6()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        if (other.getInstanceMetadataTags() == null ^ this.getInstanceMetadataTags() == null)
            return false;
        if (other.getInstanceMetadataTags() != null && other.getInstanceMetadataTags().equals(this.getInstanceMetadataTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpProtocolIpv6() == null) ? 0 : getHttpProtocolIpv6().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        hashCode = prime * hashCode + ((getInstanceMetadataTags() == null) ? 0 : getInstanceMetadataTags().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2InstanceMetadataOptions clone() {
        try {
            return (AwsEc2InstanceMetadataOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2InstanceMetadataOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
