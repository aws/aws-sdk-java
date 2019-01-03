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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the certificate subject. The certificate can be one issued by your private certificate
 * authority (CA) or it can be your private CA certificate. The <b>Subject</b> field in the certificate identifies the
 * entity that owns or controls the public key in the certificate. The entity can be a user, computer, device, or
 * service. The <b>Subject</b> must contain an X.500 distinguished name (DN). A DN is a sequence of relative
 * distinguished names (RDNs). The RDNs are separated by commas in the certificate. The DN must be unique for each
 * entity, but your private CA can issue more than one certificate with the same DN to the same entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ASN1Subject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ASN1Subject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Two-digit code that specifies the country in which the certificate subject located.
     * </p>
     */
    private String country;
    /**
     * <p>
     * Legal name of the organization with which the certificate subject is affiliated.
     * </p>
     */
    private String organization;
    /**
     * <p>
     * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is
     * affiliated.
     * </p>
     */
    private String organizationalUnit;
    /**
     * <p>
     * Disambiguating information for the certificate subject.
     * </p>
     */
    private String distinguishedNameQualifier;
    /**
     * <p>
     * State in which the subject of the certificate is located.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Fully qualified domain name (FQDN) associated with the certificate subject.
     * </p>
     */
    private String commonName;
    /**
     * <p>
     * The certificate serial number.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The locality (such as a city or town) in which the certificate subject is located.
     * </p>
     */
    private String locality;
    /**
     * <p>
     * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     * </p>
     */
    private String title;
    /**
     * <p>
     * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures
     * the surname is typically ordered first.
     * </p>
     */
    private String surname;
    /**
     * <p>
     * First name.
     * </p>
     */
    private String givenName;
    /**
     * <p>
     * Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the middle
     * name if one exists, and the first letter of the <b>SurName</b>.
     * </p>
     */
    private String initials;
    /**
     * <p>
     * Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to John.
     * Elizabeth is often shortened to Beth, Liz, or Eliza.
     * </p>
     */
    private String pseudonym;
    /**
     * <p>
     * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and
     * III for third.
     * </p>
     */
    private String generationQualifier;

    /**
     * <p>
     * Two-digit code that specifies the country in which the certificate subject located.
     * </p>
     * 
     * @param country
     *        Two-digit code that specifies the country in which the certificate subject located.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * Two-digit code that specifies the country in which the certificate subject located.
     * </p>
     * 
     * @return Two-digit code that specifies the country in which the certificate subject located.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * Two-digit code that specifies the country in which the certificate subject located.
     * </p>
     * 
     * @param country
     *        Two-digit code that specifies the country in which the certificate subject located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * Legal name of the organization with which the certificate subject is affiliated.
     * </p>
     * 
     * @param organization
     *        Legal name of the organization with which the certificate subject is affiliated.
     */

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * Legal name of the organization with which the certificate subject is affiliated.
     * </p>
     * 
     * @return Legal name of the organization with which the certificate subject is affiliated.
     */

    public String getOrganization() {
        return this.organization;
    }

    /**
     * <p>
     * Legal name of the organization with which the certificate subject is affiliated.
     * </p>
     * 
     * @param organization
     *        Legal name of the organization with which the certificate subject is affiliated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withOrganization(String organization) {
        setOrganization(organization);
        return this;
    }

    /**
     * <p>
     * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is
     * affiliated.
     * </p>
     * 
     * @param organizationalUnit
     *        A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is
     *        affiliated.
     */

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * <p>
     * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is
     * affiliated.
     * </p>
     * 
     * @return A subdivision or unit of the organization (such as sales or finance) with which the certificate subject
     *         is affiliated.
     */

    public String getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * <p>
     * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is
     * affiliated.
     * </p>
     * 
     * @param organizationalUnit
     *        A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is
     *        affiliated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withOrganizationalUnit(String organizationalUnit) {
        setOrganizationalUnit(organizationalUnit);
        return this;
    }

    /**
     * <p>
     * Disambiguating information for the certificate subject.
     * </p>
     * 
     * @param distinguishedNameQualifier
     *        Disambiguating information for the certificate subject.
     */

    public void setDistinguishedNameQualifier(String distinguishedNameQualifier) {
        this.distinguishedNameQualifier = distinguishedNameQualifier;
    }

    /**
     * <p>
     * Disambiguating information for the certificate subject.
     * </p>
     * 
     * @return Disambiguating information for the certificate subject.
     */

    public String getDistinguishedNameQualifier() {
        return this.distinguishedNameQualifier;
    }

    /**
     * <p>
     * Disambiguating information for the certificate subject.
     * </p>
     * 
     * @param distinguishedNameQualifier
     *        Disambiguating information for the certificate subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withDistinguishedNameQualifier(String distinguishedNameQualifier) {
        setDistinguishedNameQualifier(distinguishedNameQualifier);
        return this;
    }

    /**
     * <p>
     * State in which the subject of the certificate is located.
     * </p>
     * 
     * @param state
     *        State in which the subject of the certificate is located.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State in which the subject of the certificate is located.
     * </p>
     * 
     * @return State in which the subject of the certificate is located.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State in which the subject of the certificate is located.
     * </p>
     * 
     * @param state
     *        State in which the subject of the certificate is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN) associated with the certificate subject.
     * </p>
     * 
     * @param commonName
     *        Fully qualified domain name (FQDN) associated with the certificate subject.
     */

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN) associated with the certificate subject.
     * </p>
     * 
     * @return Fully qualified domain name (FQDN) associated with the certificate subject.
     */

    public String getCommonName() {
        return this.commonName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN) associated with the certificate subject.
     * </p>
     * 
     * @param commonName
     *        Fully qualified domain name (FQDN) associated with the certificate subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withCommonName(String commonName) {
        setCommonName(commonName);
        return this;
    }

    /**
     * <p>
     * The certificate serial number.
     * </p>
     * 
     * @param serialNumber
     *        The certificate serial number.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The certificate serial number.
     * </p>
     * 
     * @return The certificate serial number.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The certificate serial number.
     * </p>
     * 
     * @param serialNumber
     *        The certificate serial number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The locality (such as a city or town) in which the certificate subject is located.
     * </p>
     * 
     * @param locality
     *        The locality (such as a city or town) in which the certificate subject is located.
     */

    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * <p>
     * The locality (such as a city or town) in which the certificate subject is located.
     * </p>
     * 
     * @return The locality (such as a city or town) in which the certificate subject is located.
     */

    public String getLocality() {
        return this.locality;
    }

    /**
     * <p>
     * The locality (such as a city or town) in which the certificate subject is located.
     * </p>
     * 
     * @param locality
     *        The locality (such as a city or town) in which the certificate subject is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withLocality(String locality) {
        setLocality(locality);
        return this;
    }

    /**
     * <p>
     * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     * </p>
     * 
     * @param title
     *        A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     * </p>
     * 
     * @return A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     * </p>
     * 
     * @param title
     *        A title such as Mr. or Ms., which is pre-pended to the name to refer formally to the certificate subject.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures
     * the surname is typically ordered first.
     * </p>
     * 
     * @param surname
     *        Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian
     *        cultures the surname is typically ordered first.
     */

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * <p>
     * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures
     * the surname is typically ordered first.
     * </p>
     * 
     * @return Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian
     *         cultures the surname is typically ordered first.
     */

    public String getSurname() {
        return this.surname;
    }

    /**
     * <p>
     * Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian cultures
     * the surname is typically ordered first.
     * </p>
     * 
     * @param surname
     *        Family name. In the US and the UK, for example, the surname of an individual is ordered last. In Asian
     *        cultures the surname is typically ordered first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withSurname(String surname) {
        setSurname(surname);
        return this;
    }

    /**
     * <p>
     * First name.
     * </p>
     * 
     * @param givenName
     *        First name.
     */

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * <p>
     * First name.
     * </p>
     * 
     * @return First name.
     */

    public String getGivenName() {
        return this.givenName;
    }

    /**
     * <p>
     * First name.
     * </p>
     * 
     * @param givenName
     *        First name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withGivenName(String givenName) {
        setGivenName(givenName);
        return this;
    }

    /**
     * <p>
     * Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the middle
     * name if one exists, and the first letter of the <b>SurName</b>.
     * </p>
     * 
     * @param initials
     *        Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the
     *        middle name if one exists, and the first letter of the <b>SurName</b>.
     */

    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * <p>
     * Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the middle
     * name if one exists, and the first letter of the <b>SurName</b>.
     * </p>
     * 
     * @return Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the
     *         middle name if one exists, and the first letter of the <b>SurName</b>.
     */

    public String getInitials() {
        return this.initials;
    }

    /**
     * <p>
     * Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the middle
     * name if one exists, and the first letter of the <b>SurName</b>.
     * </p>
     * 
     * @param initials
     *        Concatenation that typically contains the first letter of the <b>GivenName</b>, the first letter of the
     *        middle name if one exists, and the first letter of the <b>SurName</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withInitials(String initials) {
        setInitials(initials);
        return this;
    }

    /**
     * <p>
     * Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to John.
     * Elizabeth is often shortened to Beth, Liz, or Eliza.
     * </p>
     * 
     * @param pseudonym
     *        Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to
     *        John. Elizabeth is often shortened to Beth, Liz, or Eliza.
     */

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    /**
     * <p>
     * Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to John.
     * Elizabeth is often shortened to Beth, Liz, or Eliza.
     * </p>
     * 
     * @return Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to
     *         John. Elizabeth is often shortened to Beth, Liz, or Eliza.
     */

    public String getPseudonym() {
        return this.pseudonym;
    }

    /**
     * <p>
     * Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to John.
     * Elizabeth is often shortened to Beth, Liz, or Eliza.
     * </p>
     * 
     * @param pseudonym
     *        Typically a shortened version of a longer <b>GivenName</b>. For example, Jonathan is often shortened to
     *        John. Elizabeth is often shortened to Beth, Liz, or Eliza.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withPseudonym(String pseudonym) {
        setPseudonym(pseudonym);
        return this;
    }

    /**
     * <p>
     * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and
     * III for third.
     * </p>
     * 
     * @param generationQualifier
     *        Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for
     *        senior, and III for third.
     */

    public void setGenerationQualifier(String generationQualifier) {
        this.generationQualifier = generationQualifier;
    }

    /**
     * <p>
     * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and
     * III for third.
     * </p>
     * 
     * @return Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for
     *         senior, and III for third.
     */

    public String getGenerationQualifier() {
        return this.generationQualifier;
    }

    /**
     * <p>
     * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and
     * III for third.
     * </p>
     * 
     * @param generationQualifier
     *        Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for
     *        senior, and III for third.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ASN1Subject withGenerationQualifier(String generationQualifier) {
        setGenerationQualifier(generationQualifier);
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
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getOrganization() != null)
            sb.append("Organization: ").append(getOrganization()).append(",");
        if (getOrganizationalUnit() != null)
            sb.append("OrganizationalUnit: ").append(getOrganizationalUnit()).append(",");
        if (getDistinguishedNameQualifier() != null)
            sb.append("DistinguishedNameQualifier: ").append(getDistinguishedNameQualifier()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCommonName() != null)
            sb.append("CommonName: ").append(getCommonName()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getLocality() != null)
            sb.append("Locality: ").append(getLocality()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getSurname() != null)
            sb.append("Surname: ").append(getSurname()).append(",");
        if (getGivenName() != null)
            sb.append("GivenName: ").append(getGivenName()).append(",");
        if (getInitials() != null)
            sb.append("Initials: ").append(getInitials()).append(",");
        if (getPseudonym() != null)
            sb.append("Pseudonym: ").append(getPseudonym()).append(",");
        if (getGenerationQualifier() != null)
            sb.append("GenerationQualifier: ").append(getGenerationQualifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ASN1Subject == false)
            return false;
        ASN1Subject other = (ASN1Subject) obj;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        if (other.getOrganizationalUnit() == null ^ this.getOrganizationalUnit() == null)
            return false;
        if (other.getOrganizationalUnit() != null && other.getOrganizationalUnit().equals(this.getOrganizationalUnit()) == false)
            return false;
        if (other.getDistinguishedNameQualifier() == null ^ this.getDistinguishedNameQualifier() == null)
            return false;
        if (other.getDistinguishedNameQualifier() != null && other.getDistinguishedNameQualifier().equals(this.getDistinguishedNameQualifier()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCommonName() == null ^ this.getCommonName() == null)
            return false;
        if (other.getCommonName() != null && other.getCommonName().equals(this.getCommonName()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getLocality() == null ^ this.getLocality() == null)
            return false;
        if (other.getLocality() != null && other.getLocality().equals(this.getLocality()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getSurname() == null ^ this.getSurname() == null)
            return false;
        if (other.getSurname() != null && other.getSurname().equals(this.getSurname()) == false)
            return false;
        if (other.getGivenName() == null ^ this.getGivenName() == null)
            return false;
        if (other.getGivenName() != null && other.getGivenName().equals(this.getGivenName()) == false)
            return false;
        if (other.getInitials() == null ^ this.getInitials() == null)
            return false;
        if (other.getInitials() != null && other.getInitials().equals(this.getInitials()) == false)
            return false;
        if (other.getPseudonym() == null ^ this.getPseudonym() == null)
            return false;
        if (other.getPseudonym() != null && other.getPseudonym().equals(this.getPseudonym()) == false)
            return false;
        if (other.getGenerationQualifier() == null ^ this.getGenerationQualifier() == null)
            return false;
        if (other.getGenerationQualifier() != null && other.getGenerationQualifier().equals(this.getGenerationQualifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnit() == null) ? 0 : getOrganizationalUnit().hashCode());
        hashCode = prime * hashCode + ((getDistinguishedNameQualifier() == null) ? 0 : getDistinguishedNameQualifier().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getLocality() == null) ? 0 : getLocality().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getSurname() == null) ? 0 : getSurname().hashCode());
        hashCode = prime * hashCode + ((getGivenName() == null) ? 0 : getGivenName().hashCode());
        hashCode = prime * hashCode + ((getInitials() == null) ? 0 : getInitials().hashCode());
        hashCode = prime * hashCode + ((getPseudonym() == null) ? 0 : getPseudonym().hashCode());
        hashCode = prime * hashCode + ((getGenerationQualifier() == null) ? 0 : getGenerationQualifier().hashCode());
        return hashCode;
    }

    @Override
    public ASN1Subject clone() {
        try {
            return (ASN1Subject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.acmpca.model.transform.ASN1SubjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
