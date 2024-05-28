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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * v2 template schema that uses Legacy Cryptographic Providers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TemplateV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Certificate validity describes the validity and renewal periods of a certificate.
     * </p>
     */
    private CertificateValidity certificateValidity;
    /**
     * <p>
     * Enrollment flags describe the enrollment settings for certificates such as using the existing private key and
     * deleting expired or revoked certificates.
     * </p>
     */
    private EnrollmentFlagsV2 enrollmentFlags;
    /**
     * <p>
     * Extensions describe the key usage extensions and application policies for a template.
     * </p>
     */
    private ExtensionsV2 extensions;
    /**
     * <p>
     * General flags describe whether the template is used for computers or users and if the template can be used with
     * autoenrollment.
     * </p>
     */
    private GeneralFlagsV2 generalFlags;
    /**
     * <p>
     * Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers for the
     * private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic Service
     * Providers.
     * </p>
     */
    private PrivateKeyAttributesV2 privateKeyAttributes;
    /**
     * <p>
     * Private key flags for v2 templates specify the client compatibility, if the private key can be exported, and if
     * user input is required when using a private key.
     * </p>
     */
    private PrivateKeyFlagsV2 privateKeyFlags;
    /**
     * <p>
     * Subject name flags describe the subject name and subject alternate name that is included in a certificate.
     * </p>
     */
    private SubjectNameFlagsV2 subjectNameFlags;
    /**
     * <p>
     * List of templates in Active Directory that are superseded by this template.
     * </p>
     */
    private java.util.List<String> supersededTemplates;

    /**
     * <p>
     * Certificate validity describes the validity and renewal periods of a certificate.
     * </p>
     * 
     * @param certificateValidity
     *        Certificate validity describes the validity and renewal periods of a certificate.
     */

    public void setCertificateValidity(CertificateValidity certificateValidity) {
        this.certificateValidity = certificateValidity;
    }

    /**
     * <p>
     * Certificate validity describes the validity and renewal periods of a certificate.
     * </p>
     * 
     * @return Certificate validity describes the validity and renewal periods of a certificate.
     */

    public CertificateValidity getCertificateValidity() {
        return this.certificateValidity;
    }

    /**
     * <p>
     * Certificate validity describes the validity and renewal periods of a certificate.
     * </p>
     * 
     * @param certificateValidity
     *        Certificate validity describes the validity and renewal periods of a certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withCertificateValidity(CertificateValidity certificateValidity) {
        setCertificateValidity(certificateValidity);
        return this;
    }

    /**
     * <p>
     * Enrollment flags describe the enrollment settings for certificates such as using the existing private key and
     * deleting expired or revoked certificates.
     * </p>
     * 
     * @param enrollmentFlags
     *        Enrollment flags describe the enrollment settings for certificates such as using the existing private key
     *        and deleting expired or revoked certificates.
     */

    public void setEnrollmentFlags(EnrollmentFlagsV2 enrollmentFlags) {
        this.enrollmentFlags = enrollmentFlags;
    }

    /**
     * <p>
     * Enrollment flags describe the enrollment settings for certificates such as using the existing private key and
     * deleting expired or revoked certificates.
     * </p>
     * 
     * @return Enrollment flags describe the enrollment settings for certificates such as using the existing private key
     *         and deleting expired or revoked certificates.
     */

    public EnrollmentFlagsV2 getEnrollmentFlags() {
        return this.enrollmentFlags;
    }

    /**
     * <p>
     * Enrollment flags describe the enrollment settings for certificates such as using the existing private key and
     * deleting expired or revoked certificates.
     * </p>
     * 
     * @param enrollmentFlags
     *        Enrollment flags describe the enrollment settings for certificates such as using the existing private key
     *        and deleting expired or revoked certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withEnrollmentFlags(EnrollmentFlagsV2 enrollmentFlags) {
        setEnrollmentFlags(enrollmentFlags);
        return this;
    }

    /**
     * <p>
     * Extensions describe the key usage extensions and application policies for a template.
     * </p>
     * 
     * @param extensions
     *        Extensions describe the key usage extensions and application policies for a template.
     */

    public void setExtensions(ExtensionsV2 extensions) {
        this.extensions = extensions;
    }

    /**
     * <p>
     * Extensions describe the key usage extensions and application policies for a template.
     * </p>
     * 
     * @return Extensions describe the key usage extensions and application policies for a template.
     */

    public ExtensionsV2 getExtensions() {
        return this.extensions;
    }

    /**
     * <p>
     * Extensions describe the key usage extensions and application policies for a template.
     * </p>
     * 
     * @param extensions
     *        Extensions describe the key usage extensions and application policies for a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withExtensions(ExtensionsV2 extensions) {
        setExtensions(extensions);
        return this;
    }

    /**
     * <p>
     * General flags describe whether the template is used for computers or users and if the template can be used with
     * autoenrollment.
     * </p>
     * 
     * @param generalFlags
     *        General flags describe whether the template is used for computers or users and if the template can be used
     *        with autoenrollment.
     */

    public void setGeneralFlags(GeneralFlagsV2 generalFlags) {
        this.generalFlags = generalFlags;
    }

    /**
     * <p>
     * General flags describe whether the template is used for computers or users and if the template can be used with
     * autoenrollment.
     * </p>
     * 
     * @return General flags describe whether the template is used for computers or users and if the template can be
     *         used with autoenrollment.
     */

    public GeneralFlagsV2 getGeneralFlags() {
        return this.generalFlags;
    }

    /**
     * <p>
     * General flags describe whether the template is used for computers or users and if the template can be used with
     * autoenrollment.
     * </p>
     * 
     * @param generalFlags
     *        General flags describe whether the template is used for computers or users and if the template can be used
     *        with autoenrollment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withGeneralFlags(GeneralFlagsV2 generalFlags) {
        setGeneralFlags(generalFlags);
        return this;
    }

    /**
     * <p>
     * Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers for the
     * private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic Service
     * Providers.
     * </p>
     * 
     * @param privateKeyAttributes
     *        Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers
     *        for the private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic
     *        Service Providers.
     */

    public void setPrivateKeyAttributes(PrivateKeyAttributesV2 privateKeyAttributes) {
        this.privateKeyAttributes = privateKeyAttributes;
    }

    /**
     * <p>
     * Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers for the
     * private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic Service
     * Providers.
     * </p>
     * 
     * @return Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers
     *         for the private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic
     *         Service Providers.
     */

    public PrivateKeyAttributesV2 getPrivateKeyAttributes() {
        return this.privateKeyAttributes;
    }

    /**
     * <p>
     * Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers for the
     * private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic Service
     * Providers.
     * </p>
     * 
     * @param privateKeyAttributes
     *        Private key attributes allow you to specify the minimal key length, key spec, and cryptographic providers
     *        for the private key of a certificate for v2 templates. V2 templates allow you to use Legacy Cryptographic
     *        Service Providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withPrivateKeyAttributes(PrivateKeyAttributesV2 privateKeyAttributes) {
        setPrivateKeyAttributes(privateKeyAttributes);
        return this;
    }

    /**
     * <p>
     * Private key flags for v2 templates specify the client compatibility, if the private key can be exported, and if
     * user input is required when using a private key.
     * </p>
     * 
     * @param privateKeyFlags
     *        Private key flags for v2 templates specify the client compatibility, if the private key can be exported,
     *        and if user input is required when using a private key.
     */

    public void setPrivateKeyFlags(PrivateKeyFlagsV2 privateKeyFlags) {
        this.privateKeyFlags = privateKeyFlags;
    }

    /**
     * <p>
     * Private key flags for v2 templates specify the client compatibility, if the private key can be exported, and if
     * user input is required when using a private key.
     * </p>
     * 
     * @return Private key flags for v2 templates specify the client compatibility, if the private key can be exported,
     *         and if user input is required when using a private key.
     */

    public PrivateKeyFlagsV2 getPrivateKeyFlags() {
        return this.privateKeyFlags;
    }

    /**
     * <p>
     * Private key flags for v2 templates specify the client compatibility, if the private key can be exported, and if
     * user input is required when using a private key.
     * </p>
     * 
     * @param privateKeyFlags
     *        Private key flags for v2 templates specify the client compatibility, if the private key can be exported,
     *        and if user input is required when using a private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withPrivateKeyFlags(PrivateKeyFlagsV2 privateKeyFlags) {
        setPrivateKeyFlags(privateKeyFlags);
        return this;
    }

    /**
     * <p>
     * Subject name flags describe the subject name and subject alternate name that is included in a certificate.
     * </p>
     * 
     * @param subjectNameFlags
     *        Subject name flags describe the subject name and subject alternate name that is included in a certificate.
     */

    public void setSubjectNameFlags(SubjectNameFlagsV2 subjectNameFlags) {
        this.subjectNameFlags = subjectNameFlags;
    }

    /**
     * <p>
     * Subject name flags describe the subject name and subject alternate name that is included in a certificate.
     * </p>
     * 
     * @return Subject name flags describe the subject name and subject alternate name that is included in a
     *         certificate.
     */

    public SubjectNameFlagsV2 getSubjectNameFlags() {
        return this.subjectNameFlags;
    }

    /**
     * <p>
     * Subject name flags describe the subject name and subject alternate name that is included in a certificate.
     * </p>
     * 
     * @param subjectNameFlags
     *        Subject name flags describe the subject name and subject alternate name that is included in a certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withSubjectNameFlags(SubjectNameFlagsV2 subjectNameFlags) {
        setSubjectNameFlags(subjectNameFlags);
        return this;
    }

    /**
     * <p>
     * List of templates in Active Directory that are superseded by this template.
     * </p>
     * 
     * @return List of templates in Active Directory that are superseded by this template.
     */

    public java.util.List<String> getSupersededTemplates() {
        return supersededTemplates;
    }

    /**
     * <p>
     * List of templates in Active Directory that are superseded by this template.
     * </p>
     * 
     * @param supersededTemplates
     *        List of templates in Active Directory that are superseded by this template.
     */

    public void setSupersededTemplates(java.util.Collection<String> supersededTemplates) {
        if (supersededTemplates == null) {
            this.supersededTemplates = null;
            return;
        }

        this.supersededTemplates = new java.util.ArrayList<String>(supersededTemplates);
    }

    /**
     * <p>
     * List of templates in Active Directory that are superseded by this template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupersededTemplates(java.util.Collection)} or {@link #withSupersededTemplates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supersededTemplates
     *        List of templates in Active Directory that are superseded by this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withSupersededTemplates(String... supersededTemplates) {
        if (this.supersededTemplates == null) {
            setSupersededTemplates(new java.util.ArrayList<String>(supersededTemplates.length));
        }
        for (String ele : supersededTemplates) {
            this.supersededTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of templates in Active Directory that are superseded by this template.
     * </p>
     * 
     * @param supersededTemplates
     *        List of templates in Active Directory that are superseded by this template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateV2 withSupersededTemplates(java.util.Collection<String> supersededTemplates) {
        setSupersededTemplates(supersededTemplates);
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
        if (getCertificateValidity() != null)
            sb.append("CertificateValidity: ").append(getCertificateValidity()).append(",");
        if (getEnrollmentFlags() != null)
            sb.append("EnrollmentFlags: ").append(getEnrollmentFlags()).append(",");
        if (getExtensions() != null)
            sb.append("Extensions: ").append(getExtensions()).append(",");
        if (getGeneralFlags() != null)
            sb.append("GeneralFlags: ").append(getGeneralFlags()).append(",");
        if (getPrivateKeyAttributes() != null)
            sb.append("PrivateKeyAttributes: ").append(getPrivateKeyAttributes()).append(",");
        if (getPrivateKeyFlags() != null)
            sb.append("PrivateKeyFlags: ").append(getPrivateKeyFlags()).append(",");
        if (getSubjectNameFlags() != null)
            sb.append("SubjectNameFlags: ").append(getSubjectNameFlags()).append(",");
        if (getSupersededTemplates() != null)
            sb.append("SupersededTemplates: ").append(getSupersededTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateV2 == false)
            return false;
        TemplateV2 other = (TemplateV2) obj;
        if (other.getCertificateValidity() == null ^ this.getCertificateValidity() == null)
            return false;
        if (other.getCertificateValidity() != null && other.getCertificateValidity().equals(this.getCertificateValidity()) == false)
            return false;
        if (other.getEnrollmentFlags() == null ^ this.getEnrollmentFlags() == null)
            return false;
        if (other.getEnrollmentFlags() != null && other.getEnrollmentFlags().equals(this.getEnrollmentFlags()) == false)
            return false;
        if (other.getExtensions() == null ^ this.getExtensions() == null)
            return false;
        if (other.getExtensions() != null && other.getExtensions().equals(this.getExtensions()) == false)
            return false;
        if (other.getGeneralFlags() == null ^ this.getGeneralFlags() == null)
            return false;
        if (other.getGeneralFlags() != null && other.getGeneralFlags().equals(this.getGeneralFlags()) == false)
            return false;
        if (other.getPrivateKeyAttributes() == null ^ this.getPrivateKeyAttributes() == null)
            return false;
        if (other.getPrivateKeyAttributes() != null && other.getPrivateKeyAttributes().equals(this.getPrivateKeyAttributes()) == false)
            return false;
        if (other.getPrivateKeyFlags() == null ^ this.getPrivateKeyFlags() == null)
            return false;
        if (other.getPrivateKeyFlags() != null && other.getPrivateKeyFlags().equals(this.getPrivateKeyFlags()) == false)
            return false;
        if (other.getSubjectNameFlags() == null ^ this.getSubjectNameFlags() == null)
            return false;
        if (other.getSubjectNameFlags() != null && other.getSubjectNameFlags().equals(this.getSubjectNameFlags()) == false)
            return false;
        if (other.getSupersededTemplates() == null ^ this.getSupersededTemplates() == null)
            return false;
        if (other.getSupersededTemplates() != null && other.getSupersededTemplates().equals(this.getSupersededTemplates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateValidity() == null) ? 0 : getCertificateValidity().hashCode());
        hashCode = prime * hashCode + ((getEnrollmentFlags() == null) ? 0 : getEnrollmentFlags().hashCode());
        hashCode = prime * hashCode + ((getExtensions() == null) ? 0 : getExtensions().hashCode());
        hashCode = prime * hashCode + ((getGeneralFlags() == null) ? 0 : getGeneralFlags().hashCode());
        hashCode = prime * hashCode + ((getPrivateKeyAttributes() == null) ? 0 : getPrivateKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getPrivateKeyFlags() == null) ? 0 : getPrivateKeyFlags().hashCode());
        hashCode = prime * hashCode + ((getSubjectNameFlags() == null) ? 0 : getSubjectNameFlags().hashCode());
        hashCode = prime * hashCode + ((getSupersededTemplates() == null) ? 0 : getSupersededTemplates().hashCode());
        return hashCode;
    }

    @Override
    public TemplateV2 clone() {
        try {
            return (TemplateV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.TemplateV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
