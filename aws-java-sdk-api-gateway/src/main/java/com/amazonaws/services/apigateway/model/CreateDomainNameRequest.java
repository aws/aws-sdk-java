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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to create a new domain name.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name
     * provided by your certificate authority.
     * </p>
     */
    private String certificateBody;
    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     * </p>
     */
    private String certificatePrivateKey;
    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any
     * blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your
     * certificate chain must start with intermediate certificates and end with the root certificate. Use the
     * intermediate certificates that were provided by your certificate authority. Do not include any intermediaries
     * that are not in the chain of trust path.
     * </p>
     */
    private String certificateChain;
    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     * </p>
     */
    private String regionalCertificateName;
    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS
     * Certificate Manager is the only supported source.
     * </p>
     */
    private String regionalCertificateArn;
    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     * </p>
     */
    private EndpointConfiguration endpointConfiguration;

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @param domainName
     *        [Required] The name of the <a>DomainName</a> resource.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @return [Required] The name of the <a>DomainName</a> resource.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * [Required] The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @param domainName
     *        [Required] The name of the <a>DomainName</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
     * </p>
     * 
     * @param certificateName
     *        The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain
     *        name.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
     * </p>
     * 
     * @return The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain
     *         name.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
     * </p>
     * 
     * @param certificateName
     *        The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name
     * provided by your certificate authority.
     * </p>
     * 
     * @param certificateBody
     *        [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this
     *        domain name provided by your certificate authority.
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name
     * provided by your certificate authority.
     * </p>
     * 
     * @return [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this
     *         domain name provided by your certificate authority.
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name
     * provided by your certificate authority.
     * </p>
     * 
     * @param certificateBody
     *        [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this
     *        domain name provided by your certificate authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateBody(String certificateBody) {
        setCertificateBody(certificateBody);
        return this;
    }

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     * </p>
     * 
     * @param certificatePrivateKey
     *        [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     */

    public void setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
    }

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     * </p>
     * 
     * @return [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     */

    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    /**
     * <p>
     * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     * </p>
     * 
     * @param certificatePrivateKey
     *        [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificatePrivateKey(String certificatePrivateKey) {
        setCertificatePrivateKey(certificatePrivateKey);
        return this;
    }

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any
     * blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your
     * certificate chain must start with intermediate certificates and end with the root certificate. Use the
     * intermediate certificates that were provided by your certificate authority. Do not include any intermediaries
     * that are not in the chain of trust path.
     * </p>
     * 
     * @param certificateChain
     *        [Deprecated] The intermediate certificates and optionally the root certificate, one after the other
     *        without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root
     *        certificate, your certificate chain must start with intermediate certificates and end with the root
     *        certificate. Use the intermediate certificates that were provided by your certificate authority. Do not
     *        include any intermediaries that are not in the chain of trust path.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any
     * blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your
     * certificate chain must start with intermediate certificates and end with the root certificate. Use the
     * intermediate certificates that were provided by your certificate authority. Do not include any intermediaries
     * that are not in the chain of trust path.
     * </p>
     * 
     * @return [Deprecated] The intermediate certificates and optionally the root certificate, one after the other
     *         without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root
     *         certificate, your certificate chain must start with intermediate certificates and end with the root
     *         certificate. Use the intermediate certificates that were provided by your certificate authority. Do not
     *         include any intermediaries that are not in the chain of trust path.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any
     * blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your
     * certificate chain must start with intermediate certificates and end with the root certificate. Use the
     * intermediate certificates that were provided by your certificate authority. Do not include any intermediaries
     * that are not in the chain of trust path.
     * </p>
     * 
     * @param certificateChain
     *        [Deprecated] The intermediate certificates and optionally the root certificate, one after the other
     *        without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root
     *        certificate, your certificate chain must start with intermediate certificates and end with the root
     *        certificate. Use the intermediate certificates that were provided by your certificate authority. Do not
     *        include any intermediaries that are not in the chain of trust path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     * </p>
     * 
     * @param certificateArn
     *        The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain
     *        name. AWS Certificate Manager is the only supported source.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     * </p>
     * 
     * @return The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain
     *         name. AWS Certificate Manager is the only supported source.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name.
     * AWS Certificate Manager is the only supported source.
     * </p>
     * 
     * @param certificateArn
     *        The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain
     *        name. AWS Certificate Manager is the only supported source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     * </p>
     * 
     * @param regionalCertificateName
     *        The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     */

    public void setRegionalCertificateName(String regionalCertificateName) {
        this.regionalCertificateName = regionalCertificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     * </p>
     * 
     * @return The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     */

    public String getRegionalCertificateName() {
        return this.regionalCertificateName;
    }

    /**
     * <p>
     * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     * </p>
     * 
     * @param regionalCertificateName
     *        The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withRegionalCertificateName(String regionalCertificateName) {
        setRegionalCertificateName(regionalCertificateName);
        return this;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS
     * Certificate Manager is the only supported source.
     * </p>
     * 
     * @param regionalCertificateArn
     *        The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name.
     *        AWS Certificate Manager is the only supported source.
     */

    public void setRegionalCertificateArn(String regionalCertificateArn) {
        this.regionalCertificateArn = regionalCertificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS
     * Certificate Manager is the only supported source.
     * </p>
     * 
     * @return The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name.
     *         AWS Certificate Manager is the only supported source.
     */

    public String getRegionalCertificateArn() {
        return this.regionalCertificateArn;
    }

    /**
     * <p>
     * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS
     * Certificate Manager is the only supported source.
     * </p>
     * 
     * @param regionalCertificateArn
     *        The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name.
     *        AWS Certificate Manager is the only supported source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withRegionalCertificateArn(String regionalCertificateArn) {
        setRegionalCertificateArn(regionalCertificateArn);
        return this;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     * </p>
     * 
     * @param endpointConfiguration
     *        The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     */

    public void setEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     * </p>
     * 
     * @return The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     */

    public EndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * <p>
     * The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     * </p>
     * 
     * @param endpointConfiguration
     *        The endpoint configuration of this <a>DomainName</a> showing the endpoint types of the domain name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withEndpointConfiguration(EndpointConfiguration endpointConfiguration) {
        setEndpointConfiguration(endpointConfiguration);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getCertificateName() != null)
            sb.append("CertificateName: ").append(getCertificateName()).append(",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: ").append(getCertificateBody()).append(",");
        if (getCertificatePrivateKey() != null)
            sb.append("CertificatePrivateKey: ").append(getCertificatePrivateKey()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getRegionalCertificateName() != null)
            sb.append("RegionalCertificateName: ").append(getRegionalCertificateName()).append(",");
        if (getRegionalCertificateArn() != null)
            sb.append("RegionalCertificateArn: ").append(getRegionalCertificateArn()).append(",");
        if (getEndpointConfiguration() != null)
            sb.append("EndpointConfiguration: ").append(getEndpointConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainNameRequest == false)
            return false;
        CreateDomainNameRequest other = (CreateDomainNameRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getCertificateName() == null ^ this.getCertificateName() == null)
            return false;
        if (other.getCertificateName() != null && other.getCertificateName().equals(this.getCertificateName()) == false)
            return false;
        if (other.getCertificateBody() == null ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getCertificatePrivateKey() == null ^ this.getCertificatePrivateKey() == null)
            return false;
        if (other.getCertificatePrivateKey() != null && other.getCertificatePrivateKey().equals(this.getCertificatePrivateKey()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getRegionalCertificateName() == null ^ this.getRegionalCertificateName() == null)
            return false;
        if (other.getRegionalCertificateName() != null && other.getRegionalCertificateName().equals(this.getRegionalCertificateName()) == false)
            return false;
        if (other.getRegionalCertificateArn() == null ^ this.getRegionalCertificateArn() == null)
            return false;
        if (other.getRegionalCertificateArn() != null && other.getRegionalCertificateArn().equals(this.getRegionalCertificateArn()) == false)
            return false;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getCertificateName() == null) ? 0 : getCertificateName().hashCode());
        hashCode = prime * hashCode + ((getCertificateBody() == null) ? 0 : getCertificateBody().hashCode());
        hashCode = prime * hashCode + ((getCertificatePrivateKey() == null) ? 0 : getCertificatePrivateKey().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getRegionalCertificateName() == null) ? 0 : getRegionalCertificateName().hashCode());
        hashCode = prime * hashCode + ((getRegionalCertificateArn() == null) ? 0 : getRegionalCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainNameRequest clone() {
        return (CreateDomainNameRequest) super.clone();
    }

}
