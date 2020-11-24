/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The authorization configuration details for Amazon FSx for Windows File Server file system. See <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_FSxWindowsFileServerVolumeConfiguration.html"
 * >FSxWindowsFileServerVolumeConfiguration</a> in the <i>Amazon Elastic Container Service API Reference</i>.
 * </p>
 * <p>
 * For more information and the input format, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/wfsx-volumes.html">Amazon FSx for Windows File
 * Server Volumes</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/FSxWindowsFileServerAuthorizationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FSxWindowsFileServerAuthorizationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The authorization credential option to use. The authorization credential options can be provided using either the
     * Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter Store parameter. The
     * ARNs refer to the stored credentials.
     * </p>
     */
    private String credentialsParameter;
    /**
     * <p>
     * A fully qualified domain name hosted by an <a
     * href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS Directory
     * Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The authorization credential option to use. The authorization credential options can be provided using either the
     * Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter Store parameter. The
     * ARNs refer to the stored credentials.
     * </p>
     * 
     * @param credentialsParameter
     *        The authorization credential option to use. The authorization credential options can be provided using
     *        either the Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter
     *        Store parameter. The ARNs refer to the stored credentials.
     */

    public void setCredentialsParameter(String credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    /**
     * <p>
     * The authorization credential option to use. The authorization credential options can be provided using either the
     * Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter Store parameter. The
     * ARNs refer to the stored credentials.
     * </p>
     * 
     * @return The authorization credential option to use. The authorization credential options can be provided using
     *         either the Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter
     *         Store parameter. The ARNs refer to the stored credentials.
     */

    public String getCredentialsParameter() {
        return this.credentialsParameter;
    }

    /**
     * <p>
     * The authorization credential option to use. The authorization credential options can be provided using either the
     * Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter Store parameter. The
     * ARNs refer to the stored credentials.
     * </p>
     * 
     * @param credentialsParameter
     *        The authorization credential option to use. The authorization credential options can be provided using
     *        either the Amazon Resource Name (ARN) of an AWS Secrets Manager secret or AWS Systems Manager Parameter
     *        Store parameter. The ARNs refer to the stored credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FSxWindowsFileServerAuthorizationConfig withCredentialsParameter(String credentialsParameter) {
        setCredentialsParameter(credentialsParameter);
        return this;
    }

    /**
     * <p>
     * A fully qualified domain name hosted by an <a
     * href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS Directory
     * Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * </p>
     * 
     * @param domain
     *        A fully qualified domain name hosted by an <a
     *        href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS
     *        Directory Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * A fully qualified domain name hosted by an <a
     * href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS Directory
     * Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * </p>
     * 
     * @return A fully qualified domain name hosted by an <a
     *         href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS
     *         Directory Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * A fully qualified domain name hosted by an <a
     * href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS Directory
     * Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * </p>
     * 
     * @param domain
     *        A fully qualified domain name hosted by an <a
     *        href="https://docs.aws.amazon.com/directoryservice/latest/admin-guide/directory_microsoft_ad.html">AWS
     *        Directory Service</a> Managed Microsoft AD (Active Directory) or self-hosted AD on Amazon EC2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FSxWindowsFileServerAuthorizationConfig withDomain(String domain) {
        setDomain(domain);
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
        if (getCredentialsParameter() != null)
            sb.append("CredentialsParameter: ").append(getCredentialsParameter()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FSxWindowsFileServerAuthorizationConfig == false)
            return false;
        FSxWindowsFileServerAuthorizationConfig other = (FSxWindowsFileServerAuthorizationConfig) obj;
        if (other.getCredentialsParameter() == null ^ this.getCredentialsParameter() == null)
            return false;
        if (other.getCredentialsParameter() != null && other.getCredentialsParameter().equals(this.getCredentialsParameter()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCredentialsParameter() == null) ? 0 : getCredentialsParameter().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public FSxWindowsFileServerAuthorizationConfig clone() {
        try {
            return (FSxWindowsFileServerAuthorizationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.FSxWindowsFileServerAuthorizationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
