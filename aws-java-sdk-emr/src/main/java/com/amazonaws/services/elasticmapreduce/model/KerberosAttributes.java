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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes for Kerberos configuration when Kerberos authentication is enabled using a security configuration. For
 * more information see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html">Use Kerberos
 * Authentication</a> in the <i>EMR Management Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/KerberosAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KerberosAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong. For example, <code>EC2.INTERNAL</code>.
     * </p>
     */
    private String realm;
    /**
     * <p>
     * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     * Kerberos principals, password policies, and keytabs for the cluster.
     * </p>
     */
    private String kdcAdminPassword;
    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal
     * password, which must be identical across realms.
     * </p>
     */
    private String crossRealmTrustPrincipalPassword;
    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient
     * privileges to join resources to the domain.
     * </p>
     */
    private String aDDomainJoinUser;
    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     */
    private String aDDomainJoinPassword;

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong. For example, <code>EC2.INTERNAL</code>.
     * </p>
     * 
     * @param realm
     *        The name of the Kerberos realm to which all nodes in a cluster belong. For example,
     *        <code>EC2.INTERNAL</code>.
     */

    public void setRealm(String realm) {
        this.realm = realm;
    }

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong. For example, <code>EC2.INTERNAL</code>.
     * </p>
     * 
     * @return The name of the Kerberos realm to which all nodes in a cluster belong. For example,
     *         <code>EC2.INTERNAL</code>.
     */

    public String getRealm() {
        return this.realm;
    }

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong. For example, <code>EC2.INTERNAL</code>.
     * </p>
     * 
     * @param realm
     *        The name of the Kerberos realm to which all nodes in a cluster belong. For example,
     *        <code>EC2.INTERNAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KerberosAttributes withRealm(String realm) {
        setRealm(realm);
        return this;
    }

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     * Kerberos principals, password policies, and keytabs for the cluster.
     * </p>
     * 
     * @param kdcAdminPassword
     *        The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     *        Kerberos principals, password policies, and keytabs for the cluster.
     */

    public void setKdcAdminPassword(String kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
    }

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     * Kerberos principals, password policies, and keytabs for the cluster.
     * </p>
     * 
     * @return The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     *         Kerberos principals, password policies, and keytabs for the cluster.
     */

    public String getKdcAdminPassword() {
        return this.kdcAdminPassword;
    }

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     * Kerberos principals, password policies, and keytabs for the cluster.
     * </p>
     * 
     * @param kdcAdminPassword
     *        The password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains
     *        Kerberos principals, password policies, and keytabs for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KerberosAttributes withKdcAdminPassword(String kdcAdminPassword) {
        setKdcAdminPassword(kdcAdminPassword);
        return this;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal
     * password, which must be identical across realms.
     * </p>
     * 
     * @param crossRealmTrustPrincipalPassword
     *        Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm
     *        principal password, which must be identical across realms.
     */

    public void setCrossRealmTrustPrincipalPassword(String crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal
     * password, which must be identical across realms.
     * </p>
     * 
     * @return Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm
     *         principal password, which must be identical across realms.
     */

    public String getCrossRealmTrustPrincipalPassword() {
        return this.crossRealmTrustPrincipalPassword;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal
     * password, which must be identical across realms.
     * </p>
     * 
     * @param crossRealmTrustPrincipalPassword
     *        Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm
     *        principal password, which must be identical across realms.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KerberosAttributes withCrossRealmTrustPrincipalPassword(String crossRealmTrustPrincipalPassword) {
        setCrossRealmTrustPrincipalPassword(crossRealmTrustPrincipalPassword);
        return this;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient
     * privileges to join resources to the domain.
     * </p>
     * 
     * @param aDDomainJoinUser
     *        Required only when establishing a cross-realm trust with an Active Directory domain. A user with
     *        sufficient privileges to join resources to the domain.
     */

    public void setADDomainJoinUser(String aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient
     * privileges to join resources to the domain.
     * </p>
     * 
     * @return Required only when establishing a cross-realm trust with an Active Directory domain. A user with
     *         sufficient privileges to join resources to the domain.
     */

    public String getADDomainJoinUser() {
        return this.aDDomainJoinUser;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient
     * privileges to join resources to the domain.
     * </p>
     * 
     * @param aDDomainJoinUser
     *        Required only when establishing a cross-realm trust with an Active Directory domain. A user with
     *        sufficient privileges to join resources to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KerberosAttributes withADDomainJoinUser(String aDDomainJoinUser) {
        setADDomainJoinUser(aDDomainJoinUser);
        return this;
    }

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * 
     * @param aDDomainJoinPassword
     *        The Active Directory password for <code>ADDomainJoinUser</code>.
     */

    public void setADDomainJoinPassword(String aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
    }

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * 
     * @return The Active Directory password for <code>ADDomainJoinUser</code>.
     */

    public String getADDomainJoinPassword() {
        return this.aDDomainJoinPassword;
    }

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * 
     * @param aDDomainJoinPassword
     *        The Active Directory password for <code>ADDomainJoinUser</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KerberosAttributes withADDomainJoinPassword(String aDDomainJoinPassword) {
        setADDomainJoinPassword(aDDomainJoinPassword);
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
        if (getRealm() != null)
            sb.append("Realm: ").append(getRealm()).append(",");
        if (getKdcAdminPassword() != null)
            sb.append("KdcAdminPassword: ").append(getKdcAdminPassword()).append(",");
        if (getCrossRealmTrustPrincipalPassword() != null)
            sb.append("CrossRealmTrustPrincipalPassword: ").append(getCrossRealmTrustPrincipalPassword()).append(",");
        if (getADDomainJoinUser() != null)
            sb.append("ADDomainJoinUser: ").append(getADDomainJoinUser()).append(",");
        if (getADDomainJoinPassword() != null)
            sb.append("ADDomainJoinPassword: ").append(getADDomainJoinPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KerberosAttributes == false)
            return false;
        KerberosAttributes other = (KerberosAttributes) obj;
        if (other.getRealm() == null ^ this.getRealm() == null)
            return false;
        if (other.getRealm() != null && other.getRealm().equals(this.getRealm()) == false)
            return false;
        if (other.getKdcAdminPassword() == null ^ this.getKdcAdminPassword() == null)
            return false;
        if (other.getKdcAdminPassword() != null && other.getKdcAdminPassword().equals(this.getKdcAdminPassword()) == false)
            return false;
        if (other.getCrossRealmTrustPrincipalPassword() == null ^ this.getCrossRealmTrustPrincipalPassword() == null)
            return false;
        if (other.getCrossRealmTrustPrincipalPassword() != null
                && other.getCrossRealmTrustPrincipalPassword().equals(this.getCrossRealmTrustPrincipalPassword()) == false)
            return false;
        if (other.getADDomainJoinUser() == null ^ this.getADDomainJoinUser() == null)
            return false;
        if (other.getADDomainJoinUser() != null && other.getADDomainJoinUser().equals(this.getADDomainJoinUser()) == false)
            return false;
        if (other.getADDomainJoinPassword() == null ^ this.getADDomainJoinPassword() == null)
            return false;
        if (other.getADDomainJoinPassword() != null && other.getADDomainJoinPassword().equals(this.getADDomainJoinPassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRealm() == null) ? 0 : getRealm().hashCode());
        hashCode = prime * hashCode + ((getKdcAdminPassword() == null) ? 0 : getKdcAdminPassword().hashCode());
        hashCode = prime * hashCode + ((getCrossRealmTrustPrincipalPassword() == null) ? 0 : getCrossRealmTrustPrincipalPassword().hashCode());
        hashCode = prime * hashCode + ((getADDomainJoinUser() == null) ? 0 : getADDomainJoinUser().hashCode());
        hashCode = prime * hashCode + ((getADDomainJoinPassword() == null) ? 0 : getADDomainJoinPassword().hashCode());
        return hashCode;
    }

    @Override
    public KerberosAttributes clone() {
        try {
            return (KerberosAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.KerberosAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
