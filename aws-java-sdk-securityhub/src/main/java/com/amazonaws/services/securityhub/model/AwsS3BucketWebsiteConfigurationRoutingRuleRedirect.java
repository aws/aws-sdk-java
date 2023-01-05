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
 * The rules to redirect the request if the condition in <code>Condition</code> is met.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketWebsiteConfigurationRoutingRuleRedirect"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketWebsiteConfigurationRoutingRuleRedirect implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The HTTP redirect code to use in the response.
     * </p>
     */
    private String httpRedirectCode;
    /**
     * <p>
     * The protocol to use to redirect the request. By default, uses the protocol from the original request.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The object key prefix to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyWith</code> is present.
     * </p>
     */
    private String replaceKeyPrefixWith;
    /**
     * <p>
     * The specific object key to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     * </p>
     */
    private String replaceKeyWith;

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     * 
     * @param hostname
     *        The host name to use in the redirect request.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     * 
     * @return The host name to use in the redirect request.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The host name to use in the redirect request.
     * </p>
     * 
     * @param hostname
     *        The host name to use in the redirect request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The HTTP redirect code to use in the response.
     * </p>
     * 
     * @param httpRedirectCode
     *        The HTTP redirect code to use in the response.
     */

    public void setHttpRedirectCode(String httpRedirectCode) {
        this.httpRedirectCode = httpRedirectCode;
    }

    /**
     * <p>
     * The HTTP redirect code to use in the response.
     * </p>
     * 
     * @return The HTTP redirect code to use in the response.
     */

    public String getHttpRedirectCode() {
        return this.httpRedirectCode;
    }

    /**
     * <p>
     * The HTTP redirect code to use in the response.
     * </p>
     * 
     * @param httpRedirectCode
     *        The HTTP redirect code to use in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect withHttpRedirectCode(String httpRedirectCode) {
        setHttpRedirectCode(httpRedirectCode);
        return this;
    }

    /**
     * <p>
     * The protocol to use to redirect the request. By default, uses the protocol from the original request.
     * </p>
     * 
     * @param protocol
     *        The protocol to use to redirect the request. By default, uses the protocol from the original request.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use to redirect the request. By default, uses the protocol from the original request.
     * </p>
     * 
     * @return The protocol to use to redirect the request. By default, uses the protocol from the original request.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to use to redirect the request. By default, uses the protocol from the original request.
     * </p>
     * 
     * @param protocol
     *        The protocol to use to redirect the request. By default, uses the protocol from the original request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyWith</code> is present.
     * </p>
     * 
     * @param replaceKeyPrefixWith
     *        The object key prefix to use in the redirect request.</p>
     *        <p>
     *        Cannot be provided if <code>ReplaceKeyWith</code> is present.
     */

    public void setReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        this.replaceKeyPrefixWith = replaceKeyPrefixWith;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyWith</code> is present.
     * </p>
     * 
     * @return The object key prefix to use in the redirect request.</p>
     *         <p>
     *         Cannot be provided if <code>ReplaceKeyWith</code> is present.
     */

    public String getReplaceKeyPrefixWith() {
        return this.replaceKeyPrefixWith;
    }

    /**
     * <p>
     * The object key prefix to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyWith</code> is present.
     * </p>
     * 
     * @param replaceKeyPrefixWith
     *        The object key prefix to use in the redirect request.</p>
     *        <p>
     *        Cannot be provided if <code>ReplaceKeyWith</code> is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect withReplaceKeyPrefixWith(String replaceKeyPrefixWith) {
        setReplaceKeyPrefixWith(replaceKeyPrefixWith);
        return this;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     * </p>
     * 
     * @param replaceKeyWith
     *        The specific object key to use in the redirect request.</p>
     *        <p>
     *        Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     */

    public void setReplaceKeyWith(String replaceKeyWith) {
        this.replaceKeyWith = replaceKeyWith;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     * </p>
     * 
     * @return The specific object key to use in the redirect request.</p>
     *         <p>
     *         Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     */

    public String getReplaceKeyWith() {
        return this.replaceKeyWith;
    }

    /**
     * <p>
     * The specific object key to use in the redirect request.
     * </p>
     * <p>
     * Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     * </p>
     * 
     * @param replaceKeyWith
     *        The specific object key to use in the redirect request.</p>
     *        <p>
     *        Cannot be provided if <code>ReplaceKeyPrefixWith</code> is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect withReplaceKeyWith(String replaceKeyWith) {
        setReplaceKeyWith(replaceKeyWith);
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
        if (getHttpRedirectCode() != null)
            sb.append("HttpRedirectCode: ").append(getHttpRedirectCode()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getReplaceKeyPrefixWith() != null)
            sb.append("ReplaceKeyPrefixWith: ").append(getReplaceKeyPrefixWith()).append(",");
        if (getReplaceKeyWith() != null)
            sb.append("ReplaceKeyWith: ").append(getReplaceKeyWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketWebsiteConfigurationRoutingRuleRedirect == false)
            return false;
        AwsS3BucketWebsiteConfigurationRoutingRuleRedirect other = (AwsS3BucketWebsiteConfigurationRoutingRuleRedirect) obj;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getHttpRedirectCode() == null ^ this.getHttpRedirectCode() == null)
            return false;
        if (other.getHttpRedirectCode() != null && other.getHttpRedirectCode().equals(this.getHttpRedirectCode()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getReplaceKeyPrefixWith() == null ^ this.getReplaceKeyPrefixWith() == null)
            return false;
        if (other.getReplaceKeyPrefixWith() != null && other.getReplaceKeyPrefixWith().equals(this.getReplaceKeyPrefixWith()) == false)
            return false;
        if (other.getReplaceKeyWith() == null ^ this.getReplaceKeyWith() == null)
            return false;
        if (other.getReplaceKeyWith() != null && other.getReplaceKeyWith().equals(this.getReplaceKeyWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getHttpRedirectCode() == null) ? 0 : getHttpRedirectCode().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getReplaceKeyPrefixWith() == null) ? 0 : getReplaceKeyPrefixWith().hashCode());
        hashCode = prime * hashCode + ((getReplaceKeyWith() == null) ? 0 : getReplaceKeyWith().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketWebsiteConfigurationRoutingRuleRedirect clone() {
        try {
            return (AwsS3BucketWebsiteConfigurationRoutingRuleRedirect) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketWebsiteConfigurationRoutingRuleRedirectMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
