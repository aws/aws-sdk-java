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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Extended Key Usage X.509 v3 extension defines one or more purposes for which the public key can be used. This is
 * in addition to or in place of the basic purposes specified by the Key Usage extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExtendedKeyUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtendedKeyUsage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an Extended Key Usage value.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     * following OIDs are defined in RFC 3280 and RFC 5280.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     * </p>
     * </li>
     * </ul>
     */
    private String oID;

    /**
     * <p>
     * The name of an Extended Key Usage value.
     * </p>
     * 
     * @param name
     *        The name of an Extended Key Usage value.
     * @see ExtendedKeyUsageName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an Extended Key Usage value.
     * </p>
     * 
     * @return The name of an Extended Key Usage value.
     * @see ExtendedKeyUsageName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an Extended Key Usage value.
     * </p>
     * 
     * @param name
     *        The name of an Extended Key Usage value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public ExtendedKeyUsage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of an Extended Key Usage value.
     * </p>
     * 
     * @param name
     *        The name of an Extended Key Usage value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public ExtendedKeyUsage withName(ExtendedKeyUsageName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     * following OIDs are defined in RFC 3280 and RFC 5280.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param oID
     *        An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     *        following OIDs are defined in RFC 3280 and RFC 5280. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     *        </p>
     *        </li>
     */

    public void setOID(String oID) {
        this.oID = oID;
    }

    /**
     * <p>
     * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     * following OIDs are defined in RFC 3280 and RFC 5280.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     *         following OIDs are defined in RFC 3280 and RFC 5280. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     *         </p>
     *         </li>
     */

    public String getOID() {
        return this.oID;
    }

    /**
     * <p>
     * An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     * following OIDs are defined in RFC 3280 and RFC 5280.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param oID
     *        An object identifier (OID) for the extension value. OIDs are strings of numbers separated by periods. The
     *        following OIDs are defined in RFC 3280 and RFC 5280. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.1 (TLS_WEB_SERVER_AUTHENTICATION)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.2 (TLS_WEB_CLIENT_AUTHENTICATION)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.3 (CODE_SIGNING)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.4 (EMAIL_PROTECTION)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.8 (TIME_STAMPING)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.9 (OCSP_SIGNING)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.5 (IPSEC_END_SYSTEM)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.6 (IPSEC_TUNNEL)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>1.3.6.1.5.5.7.3.7 (IPSEC_USER)</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtendedKeyUsage withOID(String oID) {
        setOID(oID);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOID() != null)
            sb.append("OID: ").append(getOID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtendedKeyUsage == false)
            return false;
        ExtendedKeyUsage other = (ExtendedKeyUsage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOID() == null ^ this.getOID() == null)
            return false;
        if (other.getOID() != null && other.getOID().equals(this.getOID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOID() == null) ? 0 : getOID().hashCode());
        return hashCode;
    }

    @Override
    public ExtendedKeyUsage clone() {
        try {
            return (ExtendedKeyUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.ExtendedKeyUsageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
