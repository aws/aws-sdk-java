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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information to enable and configure Online Certificate Status Protocol (OCSP) for validating certificate
 * revocation status.
 * </p>
 * <p>
 * When you revoke a certificate, OCSP responses may take up to 60 minutes to reflect the new status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/OcspConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OcspConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation status.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     * validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object to
     * define a CNAME specifying a customized OCSP domain.
     * </p>
     * <note>
     * <p>
     * The content of a Canonical Name (CNAME) record must conform to <a
     * href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in URIs.
     * Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or "https://".
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online Certificate
     * Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User Guide</i>.
     * </p>
     */
    private String ocspCustomCname;

    /**
     * <p>
     * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation status.
     * </p>
     * 
     * @param enabled
     *        Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation
     *        status.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation status.
     * </p>
     * 
     * @return Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation
     *         status.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation status.
     * </p>
     * 
     * @param enabled
     *        Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation
     *        status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OcspConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation status.
     * </p>
     * 
     * @return Flag enabling use of the Online Certificate Status Protocol (OCSP) for validating certificate revocation
     *         status.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     * validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object to
     * define a CNAME specifying a customized OCSP domain.
     * </p>
     * <note>
     * <p>
     * The content of a Canonical Name (CNAME) record must conform to <a
     * href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in URIs.
     * Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or "https://".
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online Certificate
     * Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User Guide</i>.
     * </p>
     * 
     * @param ocspCustomCname
     *        By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     *        validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object
     *        to define a CNAME specifying a customized OCSP domain.</p> <note>
     *        <p>
     *        The content of a Canonical Name (CNAME) record must conform to <a
     *        href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in
     *        URIs. Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or
     *        "https://".
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online
     *        Certificate Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User
     *        Guide</i>.
     */

    public void setOcspCustomCname(String ocspCustomCname) {
        this.ocspCustomCname = ocspCustomCname;
    }

    /**
     * <p>
     * By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     * validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object to
     * define a CNAME specifying a customized OCSP domain.
     * </p>
     * <note>
     * <p>
     * The content of a Canonical Name (CNAME) record must conform to <a
     * href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in URIs.
     * Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or "https://".
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online Certificate
     * Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User Guide</i>.
     * </p>
     * 
     * @return By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     *         validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object
     *         to define a CNAME specifying a customized OCSP domain.</p> <note>
     *         <p>
     *         The content of a Canonical Name (CNAME) record must conform to <a
     *         href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in
     *         URIs. Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or
     *         "https://".
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online
     *         Certificate Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User
     *         Guide</i>.
     */

    public String getOcspCustomCname() {
        return this.ocspCustomCname;
    }

    /**
     * <p>
     * By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     * validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object to
     * define a CNAME specifying a customized OCSP domain.
     * </p>
     * <note>
     * <p>
     * The content of a Canonical Name (CNAME) record must conform to <a
     * href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in URIs.
     * Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or "https://".
     * </p>
     * </note>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online Certificate
     * Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User Guide</i>.
     * </p>
     * 
     * @param ocspCustomCname
     *        By default, Amazon Web Services Private CA injects an Amazon Web Services domain into certificates being
     *        validated by the Online Certificate Status Protocol (OCSP). A customer can alternatively use this object
     *        to define a CNAME specifying a customized OCSP domain.</p> <note>
     *        <p>
     *        The content of a Canonical Name (CNAME) record must conform to <a
     *        href="https://www.ietf.org/rfc/rfc2396.txt">RFC2396</a> restrictions on the use of special characters in
     *        URIs. Additionally, the value of the CNAME must not include a protocol prefix such as "http://" or
     *        "https://".
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/privateca/latest/userguide/ocsp-customize.html">Customizing Online
     *        Certificate Status Protocol (OCSP) </a> in the <i>Amazon Web Services Private Certificate Authority User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OcspConfiguration withOcspCustomCname(String ocspCustomCname) {
        setOcspCustomCname(ocspCustomCname);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getOcspCustomCname() != null)
            sb.append("OcspCustomCname: ").append(getOcspCustomCname());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OcspConfiguration == false)
            return false;
        OcspConfiguration other = (OcspConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getOcspCustomCname() == null ^ this.getOcspCustomCname() == null)
            return false;
        if (other.getOcspCustomCname() != null && other.getOcspCustomCname().equals(this.getOcspCustomCname()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getOcspCustomCname() == null) ? 0 : getOcspCustomCname().hashCode());
        return hashCode;
    }

    @Override
    public OcspConfiguration clone() {
        try {
            return (OcspConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.OcspConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
