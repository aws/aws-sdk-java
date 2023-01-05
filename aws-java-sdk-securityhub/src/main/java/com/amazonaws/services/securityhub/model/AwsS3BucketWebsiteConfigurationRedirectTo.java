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
 * The redirect behavior for requests to the website.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketWebsiteConfigurationRedirectTo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketWebsiteConfigurationRedirectTo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the host to redirect requests to.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The protocol to use when redirecting requests. By default, this field uses the same protocol as the original
     * request. Valid values are <code>http</code> or <code>https</code>.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The name of the host to redirect requests to.
     * </p>
     * 
     * @param hostname
     *        The name of the host to redirect requests to.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The name of the host to redirect requests to.
     * </p>
     * 
     * @return The name of the host to redirect requests to.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The name of the host to redirect requests to.
     * </p>
     * 
     * @param hostname
     *        The name of the host to redirect requests to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRedirectTo withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The protocol to use when redirecting requests. By default, this field uses the same protocol as the original
     * request. Valid values are <code>http</code> or <code>https</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use when redirecting requests. By default, this field uses the same protocol as the
     *        original request. Valid values are <code>http</code> or <code>https</code>.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use when redirecting requests. By default, this field uses the same protocol as the original
     * request. Valid values are <code>http</code> or <code>https</code>.
     * </p>
     * 
     * @return The protocol to use when redirecting requests. By default, this field uses the same protocol as the
     *         original request. Valid values are <code>http</code> or <code>https</code>.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use when redirecting requests. By default, this field uses the same protocol as the original
     * request. Valid values are <code>http</code> or <code>https</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol to use when redirecting requests. By default, this field uses the same protocol as the
     *        original request. Valid values are <code>http</code> or <code>https</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRedirectTo withProtocol(String protocol) {
        setProtocol(protocol);
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
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketWebsiteConfigurationRedirectTo == false)
            return false;
        AwsS3BucketWebsiteConfigurationRedirectTo other = (AwsS3BucketWebsiteConfigurationRedirectTo) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketWebsiteConfigurationRedirectTo clone() {
        try {
            return (AwsS3BucketWebsiteConfigurationRedirectTo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketWebsiteConfigurationRedirectToMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
