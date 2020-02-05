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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainDomainEndpointOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainDomainEndpointOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to require that all traffic to the domain arrive over HTTPS.
     * </p>
     */
    private Boolean enforceHTTPS;
    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     */
    private String tLSSecurityPolicy;

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

    public AwsElasticsearchDomainDomainEndpointOptions withEnforceHTTPS(Boolean enforceHTTPS) {
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
     * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * 
     * @param tLSSecurityPolicy
     *        The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     *        </p>
     *        </li>
     */

    public void setTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * 
     * @return The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     *         </p>
     *         </li>
     */

    public String getTLSSecurityPolicy() {
        return this.tLSSecurityPolicy;
    }

    /**
     * <p>
     * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     * </p>
     * </li>
     * </ul>
     * 
     * @param tLSSecurityPolicy
     *        The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Policy-Min-TLS-1-0-2019-07</code>, which supports TLSv1.0 and higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy-Min-TLS-1-2-2019-07</code>, which only supports TLSv1.2
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDomainEndpointOptions withTLSSecurityPolicy(String tLSSecurityPolicy) {
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
        if (getEnforceHTTPS() != null)
            sb.append("EnforceHTTPS: ").append(getEnforceHTTPS()).append(",");
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

        if (obj instanceof AwsElasticsearchDomainDomainEndpointOptions == false)
            return false;
        AwsElasticsearchDomainDomainEndpointOptions other = (AwsElasticsearchDomainDomainEndpointOptions) obj;
        if (other.getEnforceHTTPS() == null ^ this.getEnforceHTTPS() == null)
            return false;
        if (other.getEnforceHTTPS() != null && other.getEnforceHTTPS().equals(this.getEnforceHTTPS()) == false)
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

        hashCode = prime * hashCode + ((getEnforceHTTPS() == null) ? 0 : getEnforceHTTPS().hashCode());
        hashCode = prime * hashCode + ((getTLSSecurityPolicy() == null) ? 0 : getTLSSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainDomainEndpointOptions clone() {
        try {
            return (AwsElasticsearchDomainDomainEndpointOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainDomainEndpointOptionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
