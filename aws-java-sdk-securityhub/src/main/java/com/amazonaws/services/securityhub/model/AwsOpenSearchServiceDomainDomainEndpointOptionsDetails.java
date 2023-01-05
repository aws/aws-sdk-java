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
 * Information about additional options for the domain endpoint.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainDomainEndpointOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainDomainEndpointOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the security certificate. The certificate is managed in ACM.
     * </p>
     */
    private String customEndpointCertificateArn;
    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     */
    private Boolean customEndpointEnabled;
    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     */
    private Boolean enforceHTTPS;
    /**
     * <p>
     * The fully qualified URL for the custom endpoint.
     * </p>
     */
    private String customEndpoint;
    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     * </p>
     */
    private String tLSSecurityPolicy;

    /**
     * <p>
     * The ARN for the security certificate. The certificate is managed in ACM.
     * </p>
     * 
     * @param customEndpointCertificateArn
     *        The ARN for the security certificate. The certificate is managed in ACM.
     */

    public void setCustomEndpointCertificateArn(String customEndpointCertificateArn) {
        this.customEndpointCertificateArn = customEndpointCertificateArn;
    }

    /**
     * <p>
     * The ARN for the security certificate. The certificate is managed in ACM.
     * </p>
     * 
     * @return The ARN for the security certificate. The certificate is managed in ACM.
     */

    public String getCustomEndpointCertificateArn() {
        return this.customEndpointCertificateArn;
    }

    /**
     * <p>
     * The ARN for the security certificate. The certificate is managed in ACM.
     * </p>
     * 
     * @param customEndpointCertificateArn
     *        The ARN for the security certificate. The certificate is managed in ACM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails withCustomEndpointCertificateArn(String customEndpointCertificateArn) {
        setCustomEndpointCertificateArn(customEndpointCertificateArn);
        return this;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @param customEndpointEnabled
     *        Whether to enable a custom endpoint for the domain.
     */

    public void setCustomEndpointEnabled(Boolean customEndpointEnabled) {
        this.customEndpointEnabled = customEndpointEnabled;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @return Whether to enable a custom endpoint for the domain.
     */

    public Boolean getCustomEndpointEnabled() {
        return this.customEndpointEnabled;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @param customEndpointEnabled
     *        Whether to enable a custom endpoint for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails withCustomEndpointEnabled(Boolean customEndpointEnabled) {
        setCustomEndpointEnabled(customEndpointEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @return Whether to enable a custom endpoint for the domain.
     */

    public Boolean isCustomEndpointEnabled() {
        return this.customEndpointEnabled;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     * 
     * @param enforceHTTPS
     *        Whether to require that all traffic to the domain arrive over HTTPS.
     */

    public void setEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     * 
     * @return Whether to require that all traffic to the domain arrive over HTTPS.
     */

    public Boolean getEnforceHTTPS() {
        return this.enforceHTTPS;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     * 
     * @param enforceHTTPS
     *        Whether to require that all traffic to the domain arrive over HTTPS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails withEnforceHTTPS(Boolean enforceHTTPS) {
        setEnforceHTTPS(enforceHTTPS);
        return this;
    }

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     * 
     * @return Whether to require that all traffic to the domain arrive over HTTPS.
     */

    public Boolean isEnforceHTTPS() {
        return this.enforceHTTPS;
    }

    /**
     * <p>
     * The fully qualified URL for the custom endpoint.
     * </p>
     * 
     * @param customEndpoint
     *        The fully qualified URL for the custom endpoint.
     */

    public void setCustomEndpoint(String customEndpoint) {
        this.customEndpoint = customEndpoint;
    }

    /**
     * <p>
     * The fully qualified URL for the custom endpoint.
     * </p>
     * 
     * @return The fully qualified URL for the custom endpoint.
     */

    public String getCustomEndpoint() {
        return this.customEndpoint;
    }

    /**
     * <p>
     * The fully qualified URL for the custom endpoint.
     * </p>
     * 
     * @param customEndpoint
     *        The fully qualified URL for the custom endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails withCustomEndpoint(String customEndpoint) {
        setCustomEndpoint(customEndpoint);
        return this;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     */

    public void setTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     * </p>
     * 
     * @return The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     */

    public String getTLSSecurityPolicy() {
        return this.tLSSecurityPolicy;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails withTLSSecurityPolicy(String tLSSecurityPolicy) {
        setTLSSecurityPolicy(tLSSecurityPolicy);
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
        if (getCustomEndpointCertificateArn() != null)
            sb.append("CustomEndpointCertificateArn: ").append(getCustomEndpointCertificateArn()).append(",");
        if (getCustomEndpointEnabled() != null)
            sb.append("CustomEndpointEnabled: ").append(getCustomEndpointEnabled()).append(",");
        if (getEnforceHTTPS() != null)
            sb.append("EnforceHTTPS: ").append(getEnforceHTTPS()).append(",");
        if (getCustomEndpoint() != null)
            sb.append("CustomEndpoint: ").append(getCustomEndpoint()).append(",");
        if (getTLSSecurityPolicy() != null)
            sb.append("TLSSecurityPolicy: ").append(getTLSSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainDomainEndpointOptionsDetails == false)
            return false;
        AwsOpenSearchServiceDomainDomainEndpointOptionsDetails other = (AwsOpenSearchServiceDomainDomainEndpointOptionsDetails) obj;
        if (other.getCustomEndpointCertificateArn() == null ^ this.getCustomEndpointCertificateArn() == null)
            return false;
        if (other.getCustomEndpointCertificateArn() != null && other.getCustomEndpointCertificateArn().equals(this.getCustomEndpointCertificateArn()) == false)
            return false;
        if (other.getCustomEndpointEnabled() == null ^ this.getCustomEndpointEnabled() == null)
            return false;
        if (other.getCustomEndpointEnabled() != null && other.getCustomEndpointEnabled().equals(this.getCustomEndpointEnabled()) == false)
            return false;
        if (other.getEnforceHTTPS() == null ^ this.getEnforceHTTPS() == null)
            return false;
        if (other.getEnforceHTTPS() != null && other.getEnforceHTTPS().equals(this.getEnforceHTTPS()) == false)
            return false;
        if (other.getCustomEndpoint() == null ^ this.getCustomEndpoint() == null)
            return false;
        if (other.getCustomEndpoint() != null && other.getCustomEndpoint().equals(this.getCustomEndpoint()) == false)
            return false;
        if (other.getTLSSecurityPolicy() == null ^ this.getTLSSecurityPolicy() == null)
            return false;
        if (other.getTLSSecurityPolicy() != null && other.getTLSSecurityPolicy().equals(this.getTLSSecurityPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomEndpointCertificateArn() == null) ? 0 : getCustomEndpointCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpointEnabled() == null) ? 0 : getCustomEndpointEnabled().hashCode());
        hashCode = prime * hashCode + ((getEnforceHTTPS() == null) ? 0 : getEnforceHTTPS().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpoint() == null) ? 0 : getCustomEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTLSSecurityPolicy() == null) ? 0 : getTLSSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainDomainEndpointOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainDomainEndpointOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
