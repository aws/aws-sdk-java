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
 * The metadata options for the instances.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAutoScalingLaunchConfigurationMetadataOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingLaunchConfigurationMetadataOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is enabled.
     * </p>
     */
    private String httpEndpoint;
    /**
     * <p>
     * The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     */
    private Integer httpPutResponseHopLimit;
    /**
     * <p>
     * Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     * default, token usage is <code>optional</code>.
     * </p>
     */
    private String httpTokens;

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is enabled.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is
     *        enabled.
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is enabled.
     * </p>
     * 
     * @return Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is
     *         enabled.
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is enabled.
     * </p>
     * 
     * @param httpEndpoint
     *        Enables or disables the HTTP metadata endpoint on your instances. By default, the metadata endpoint is
     *        enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationMetadataOptions withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the
     *        further instance metadata requests can travel.
     */

    public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * 
     * @return The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the
     *         further instance metadata requests can travel.
     */

    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * <p>
     * The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the further
     * instance metadata requests can travel.
     * </p>
     * 
     * @param httpPutResponseHopLimit
     *        The HTTP <code>PUT</code> response hop limit for instance metadata requests. The larger the number, the
     *        further instance metadata requests can travel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationMetadataOptions withHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        setHttpPutResponseHopLimit(httpPutResponseHopLimit);
        return this;
    }

    /**
     * <p>
     * Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     * default, token usage is <code>optional</code>.
     * </p>
     * 
     * @param httpTokens
     *        Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     *        default, token usage is <code>optional</code>.
     */

    public void setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
    }

    /**
     * <p>
     * Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     * default, token usage is <code>optional</code>.
     * </p>
     * 
     * @return Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     *         default, token usage is <code>optional</code>.
     */

    public String getHttpTokens() {
        return this.httpTokens;
    }

    /**
     * <p>
     * Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     * default, token usage is <code>optional</code>.
     * </p>
     * 
     * @param httpTokens
     *        Indicates whether token usage is <code>required</code> or <code>optional</code> for metadata requests. By
     *        default, token usage is <code>optional</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAutoScalingLaunchConfigurationMetadataOptions withHttpTokens(String httpTokens) {
        setHttpTokens(httpTokens);
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
        if (getHttpPutResponseHopLimit() != null)
            sb.append("HttpPutResponseHopLimit: ").append(getHttpPutResponseHopLimit()).append(",");
        if (getHttpTokens() != null)
            sb.append("HttpTokens: ").append(getHttpTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAutoScalingLaunchConfigurationMetadataOptions == false)
            return false;
        AwsAutoScalingLaunchConfigurationMetadataOptions other = (AwsAutoScalingLaunchConfigurationMetadataOptions) obj;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        if (other.getHttpPutResponseHopLimit() == null ^ this.getHttpPutResponseHopLimit() == null)
            return false;
        if (other.getHttpPutResponseHopLimit() != null && other.getHttpPutResponseHopLimit().equals(this.getHttpPutResponseHopLimit()) == false)
            return false;
        if (other.getHttpTokens() == null ^ this.getHttpTokens() == null)
            return false;
        if (other.getHttpTokens() != null && other.getHttpTokens().equals(this.getHttpTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpPutResponseHopLimit() == null) ? 0 : getHttpPutResponseHopLimit().hashCode());
        hashCode = prime * hashCode + ((getHttpTokens() == null) ? 0 : getHttpTokens().hashCode());
        return hashCode;
    }

    @Override
    public AwsAutoScalingLaunchConfigurationMetadataOptions clone() {
        try {
            return (AwsAutoScalingLaunchConfigurationMetadataOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAutoScalingLaunchConfigurationMetadataOptionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
