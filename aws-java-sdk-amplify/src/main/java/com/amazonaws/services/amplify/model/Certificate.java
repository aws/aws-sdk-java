/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the current SSL/TLS certificate that is in use for the domain. If you are using
 * <code>CreateDomainAssociation</code> to create a new domain association, <code>Certificate</code> describes the new
 * certificate that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of SSL/TLS certificate that you want to use.
     * </p>
     * <p>
     * Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     * </p>
     * <p>
     * Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N. Virginia)
     * Region (us-east-1). For more information about using ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * Certificate Manager</a> in the <i>ACM User guide</i> .
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * This field is required only when the certificate type is <code>CUSTOM</code>.
     * </p>
     */
    private String customCertificateArn;
    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     */
    private String certificateVerificationDNSRecord;

    /**
     * <p>
     * The type of SSL/TLS certificate that you want to use.
     * </p>
     * <p>
     * Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     * </p>
     * <p>
     * Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N. Virginia)
     * Region (us-east-1). For more information about using ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * Certificate Manager</a> in the <i>ACM User guide</i> .
     * </p>
     * 
     * @param type
     *        The type of SSL/TLS certificate that you want to use.</p>
     *        <p>
     *        Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     *        </p>
     *        <p>
     *        Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager
     *        in your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N.
     *        Virginia) Region (us-east-1). For more information about using ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *        into Certificate Manager</a> in the <i>ACM User guide</i> .
     * @see CertificateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of SSL/TLS certificate that you want to use.
     * </p>
     * <p>
     * Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     * </p>
     * <p>
     * Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N. Virginia)
     * Region (us-east-1). For more information about using ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * Certificate Manager</a> in the <i>ACM User guide</i> .
     * </p>
     * 
     * @return The type of SSL/TLS certificate that you want to use.</p>
     *         <p>
     *         Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     *         </p>
     *         <p>
     *         Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate
     *         Manager in your Amazon Web Services account. Make sure you request (or import) the certificate in the US
     *         East (N. Virginia) Region (us-east-1). For more information about using ACM, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *         into Certificate Manager</a> in the <i>ACM User guide</i> .
     * @see CertificateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of SSL/TLS certificate that you want to use.
     * </p>
     * <p>
     * Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     * </p>
     * <p>
     * Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N. Virginia)
     * Region (us-east-1). For more information about using ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * Certificate Manager</a> in the <i>ACM User guide</i> .
     * </p>
     * 
     * @param type
     *        The type of SSL/TLS certificate that you want to use.</p>
     *        <p>
     *        Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     *        </p>
     *        <p>
     *        Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager
     *        in your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N.
     *        Virginia) Region (us-east-1). For more information about using ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *        into Certificate Manager</a> in the <i>ACM User guide</i> .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public Certificate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of SSL/TLS certificate that you want to use.
     * </p>
     * <p>
     * Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     * </p>
     * <p>
     * Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N. Virginia)
     * Region (us-east-1). For more information about using ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates into
     * Certificate Manager</a> in the <i>ACM User guide</i> .
     * </p>
     * 
     * @param type
     *        The type of SSL/TLS certificate that you want to use.</p>
     *        <p>
     *        Specify <code>AMPLIFY_MANAGED</code> to use the default certificate that Amplify provisions for you.
     *        </p>
     *        <p>
     *        Specify <code>CUSTOM</code> to use your own certificate that you have already added to Certificate Manager
     *        in your Amazon Web Services account. Make sure you request (or import) the certificate in the US East (N.
     *        Virginia) Region (us-east-1). For more information about using ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates
     *        into Certificate Manager</a> in the <i>ACM User guide</i> .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public Certificate withType(CertificateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * This field is required only when the certificate type is <code>CUSTOM</code>.
     * </p>
     * 
     * @param customCertificateArn
     *        The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate Manager
     *        in your Amazon Web Services account. </p>
     *        <p>
     *        This field is required only when the certificate type is <code>CUSTOM</code>.
     */

    public void setCustomCertificateArn(String customCertificateArn) {
        this.customCertificateArn = customCertificateArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * This field is required only when the certificate type is <code>CUSTOM</code>.
     * </p>
     * 
     * @return The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate
     *         Manager in your Amazon Web Services account. </p>
     *         <p>
     *         This field is required only when the certificate type is <code>CUSTOM</code>.
     */

    public String getCustomCertificateArn() {
        return this.customCertificateArn;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate Manager in
     * your Amazon Web Services account.
     * </p>
     * <p>
     * This field is required only when the certificate type is <code>CUSTOM</code>.
     * </p>
     * 
     * @param customCertificateArn
     *        The Amazon resource name (ARN) for a custom certificate that you have already added to Certificate Manager
     *        in your Amazon Web Services account. </p>
     *        <p>
     *        This field is required only when the certificate type is <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCustomCertificateArn(String customCertificateArn) {
        setCustomCertificateArn(customCertificateArn);
        return this;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * 
     * @param certificateVerificationDNSRecord
     *        The DNS record for certificate verification.
     */

    public void setCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        this.certificateVerificationDNSRecord = certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * 
     * @return The DNS record for certificate verification.
     */

    public String getCertificateVerificationDNSRecord() {
        return this.certificateVerificationDNSRecord;
    }

    /**
     * <p>
     * The DNS record for certificate verification.
     * </p>
     * 
     * @param certificateVerificationDNSRecord
     *        The DNS record for certificate verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCertificateVerificationDNSRecord(String certificateVerificationDNSRecord) {
        setCertificateVerificationDNSRecord(certificateVerificationDNSRecord);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCustomCertificateArn() != null)
            sb.append("CustomCertificateArn: ").append(getCustomCertificateArn()).append(",");
        if (getCertificateVerificationDNSRecord() != null)
            sb.append("CertificateVerificationDNSRecord: ").append(getCertificateVerificationDNSRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCustomCertificateArn() == null ^ this.getCustomCertificateArn() == null)
            return false;
        if (other.getCustomCertificateArn() != null && other.getCustomCertificateArn().equals(this.getCustomCertificateArn()) == false)
            return false;
        if (other.getCertificateVerificationDNSRecord() == null ^ this.getCertificateVerificationDNSRecord() == null)
            return false;
        if (other.getCertificateVerificationDNSRecord() != null
                && other.getCertificateVerificationDNSRecord().equals(this.getCertificateVerificationDNSRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCustomCertificateArn() == null) ? 0 : getCustomCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateVerificationDNSRecord() == null) ? 0 : getCertificateVerificationDNSRecord().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.CertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
