/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to create a new domain name.
 * </p>
 */
public class CreateDomainNameRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the certificate.
     * </p>
     */
    private String certificateName;
    /**
     * <p>
     * The body of the server certificate provided by your certificate authority.
     * </p>
     */
    private String certificateBody;
    /**
     * <p>
     * Your certificate's private key.
     * </p>
     */
    private String certificatePrivateKey;
    /**
     * <p>
     * The intermediate certificates and optionally the root certificate, one after the other without any blank lines.
     * If you include the root certificate, your certificate chain must start with intermediate certificates and end
     * with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do
     * not include any intermediaries that are not in the chain of trust path.
     * </p>
     */
    private String certificateChain;

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @param domainName
     *        The name of the <a>DomainName</a> resource.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @return The name of the <a>DomainName</a> resource.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the <a>DomainName</a> resource.
     * </p>
     * 
     * @param domainName
     *        The name of the <a>DomainName</a> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate.
     */

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @return The name of the certificate.
     */

    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * <p>
     * The name of the certificate.
     * </p>
     * 
     * @param certificateName
     *        The name of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateName(String certificateName) {
        setCertificateName(certificateName);
        return this;
    }

    /**
     * <p>
     * The body of the server certificate provided by your certificate authority.
     * </p>
     * 
     * @param certificateBody
     *        The body of the server certificate provided by your certificate authority.
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The body of the server certificate provided by your certificate authority.
     * </p>
     * 
     * @return The body of the server certificate provided by your certificate authority.
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * The body of the server certificate provided by your certificate authority.
     * </p>
     * 
     * @param certificateBody
     *        The body of the server certificate provided by your certificate authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateBody(String certificateBody) {
        setCertificateBody(certificateBody);
        return this;
    }

    /**
     * <p>
     * Your certificate's private key.
     * </p>
     * 
     * @param certificatePrivateKey
     *        Your certificate's private key.
     */

    public void setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
    }

    /**
     * <p>
     * Your certificate's private key.
     * </p>
     * 
     * @return Your certificate's private key.
     */

    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    /**
     * <p>
     * Your certificate's private key.
     * </p>
     * 
     * @param certificatePrivateKey
     *        Your certificate's private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificatePrivateKey(String certificatePrivateKey) {
        setCertificatePrivateKey(certificatePrivateKey);
        return this;
    }

    /**
     * <p>
     * The intermediate certificates and optionally the root certificate, one after the other without any blank lines.
     * If you include the root certificate, your certificate chain must start with intermediate certificates and end
     * with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do
     * not include any intermediaries that are not in the chain of trust path.
     * </p>
     * 
     * @param certificateChain
     *        The intermediate certificates and optionally the root certificate, one after the other without any blank
     *        lines. If you include the root certificate, your certificate chain must start with intermediate
     *        certificates and end with the root certificate. Use the intermediate certificates that were provided by
     *        your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The intermediate certificates and optionally the root certificate, one after the other without any blank lines.
     * If you include the root certificate, your certificate chain must start with intermediate certificates and end
     * with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do
     * not include any intermediaries that are not in the chain of trust path.
     * </p>
     * 
     * @return The intermediate certificates and optionally the root certificate, one after the other without any blank
     *         lines. If you include the root certificate, your certificate chain must start with intermediate
     *         certificates and end with the root certificate. Use the intermediate certificates that were provided by
     *         your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The intermediate certificates and optionally the root certificate, one after the other without any blank lines.
     * If you include the root certificate, your certificate chain must start with intermediate certificates and end
     * with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do
     * not include any intermediaries that are not in the chain of trust path.
     * </p>
     * 
     * @param certificateChain
     *        The intermediate certificates and optionally the root certificate, one after the other without any blank
     *        lines. If you include the root certificate, your certificate chain must start with intermediate
     *        certificates and end with the root certificate. Use the intermediate certificates that were provided by
     *        your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainNameRequest withCertificateChain(String certificateChain) {
        setCertificateChain(certificateChain);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getCertificateName() != null)
            sb.append("CertificateName: " + getCertificateName() + ",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: " + getCertificateBody() + ",");
        if (getCertificatePrivateKey() != null)
            sb.append("CertificatePrivateKey: " + getCertificatePrivateKey() + ",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: " + getCertificateChain());
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
        return hashCode;
    }

    @Override
    public CreateDomainNameRequest clone() {
        return (CreateDomainNameRequest) super.clone();
    }
}
