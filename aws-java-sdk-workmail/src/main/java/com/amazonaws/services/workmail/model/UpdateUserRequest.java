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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier for the user to be updated.
     * </p>
     * <p>
     * The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: user@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: user
     * </p>
     * </li>
     * </ul>
     */
    private String userId;
    /**
     * <p>
     * Updates the user role.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Updates the display name of the user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * Updates the user's first name.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * Updates the user's last name.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * If enabled, the user is hidden from the global address list.
     * </p>
     */
    private Boolean hiddenFromGlobalAddressList;
    /**
     * <p>
     * Updates the user's initials.
     * </p>
     */
    private String initials;
    /**
     * <p>
     * Updates the user's contact details.
     * </p>
     */
    private String telephone;
    /**
     * <p>
     * Updates the user's street address.
     * </p>
     */
    private String street;
    /**
     * <p>
     * Updates the user's job title.
     * </p>
     */
    private String jobTitle;
    /**
     * <p>
     * Updates the user's city.
     * </p>
     */
    private String city;
    /**
     * <p>
     * Updates the user's company.
     * </p>
     */
    private String company;
    /**
     * <p>
     * Updates the user's zipcode.
     * </p>
     */
    private String zipCode;
    /**
     * <p>
     * Updates the user's department.
     * </p>
     */
    private String department;
    /**
     * <p>
     * Updates the user's country.
     * </p>
     */
    private String country;
    /**
     * <p>
     * Updates the user's office.
     * </p>
     */
    private String office;

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the user exists.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * 
     * @return The identifier for the organization under which the user exists.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier for the organization under which the user exists.
     * </p>
     * 
     * @param organizationId
     *        The identifier for the organization under which the user exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier for the user to be updated.
     * </p>
     * <p>
     * The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: user@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: user
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The identifier for the user to be updated.</p>
     *        <p>
     *        The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats
     *        are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: user@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: user
     *        </p>
     *        </li>
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user to be updated.
     * </p>
     * <p>
     * The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: user@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: user
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the user to be updated.</p>
     *         <p>
     *         The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats
     *         are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Email address: user@domain.tld
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         User name: user
     *         </p>
     *         </li>
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for the user to be updated.
     * </p>
     * <p>
     * The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats are
     * available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     * </p>
     * </li>
     * <li>
     * <p>
     * Email address: user@domain.tld
     * </p>
     * </li>
     * <li>
     * <p>
     * User name: user
     * </p>
     * </li>
     * </ul>
     * 
     * @param userId
     *        The identifier for the user to be updated.</p>
     *        <p>
     *        The identifier can be the <i>UserId</i>, <i>Username</i>, or <i>email</i>. The following identity formats
     *        are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        User ID: 12345678-1234-1234-1234-123456789012 or S-1-1-12-1234567890-123456789-123456789-1234
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Email address: user@domain.tld
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        User name: user
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * Updates the user role.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * </p>
     * 
     * @param role
     *        Updates the user role.</p>
     *        <p>
     *        You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * @see UserRole
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Updates the user role.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * </p>
     * 
     * @return Updates the user role.</p>
     *         <p>
     *         You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * @see UserRole
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * Updates the user role.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * </p>
     * 
     * @param role
     *        Updates the user role.</p>
     *        <p>
     *        You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public UpdateUserRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Updates the user role.
     * </p>
     * <p>
     * You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * </p>
     * 
     * @param role
     *        Updates the user role.</p>
     *        <p>
     *        You cannot pass <i>SYSTEM_USER</i> or <i>RESOURCE</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public UpdateUserRequest withRole(UserRole role) {
        this.role = role.toString();
        return this;
    }

    /**
     * <p>
     * Updates the display name of the user.
     * </p>
     * 
     * @param displayName
     *        Updates the display name of the user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Updates the display name of the user.
     * </p>
     * 
     * @return Updates the display name of the user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Updates the display name of the user.
     * </p>
     * 
     * @param displayName
     *        Updates the display name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * Updates the user's first name.
     * </p>
     * 
     * @param firstName
     *        Updates the user's first name.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * Updates the user's first name.
     * </p>
     * 
     * @return Updates the user's first name.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * Updates the user's first name.
     * </p>
     * 
     * @param firstName
     *        Updates the user's first name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * Updates the user's last name.
     * </p>
     * 
     * @param lastName
     *        Updates the user's last name.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * Updates the user's last name.
     * </p>
     * 
     * @return Updates the user's last name.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * Updates the user's last name.
     * </p>
     * 
     * @param lastName
     *        Updates the user's last name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * If enabled, the user is hidden from the global address list.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If enabled, the user is hidden from the global address list.
     */

    public void setHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        this.hiddenFromGlobalAddressList = hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If enabled, the user is hidden from the global address list.
     * </p>
     * 
     * @return If enabled, the user is hidden from the global address list.
     */

    public Boolean getHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * If enabled, the user is hidden from the global address list.
     * </p>
     * 
     * @param hiddenFromGlobalAddressList
     *        If enabled, the user is hidden from the global address list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
        setHiddenFromGlobalAddressList(hiddenFromGlobalAddressList);
        return this;
    }

    /**
     * <p>
     * If enabled, the user is hidden from the global address list.
     * </p>
     * 
     * @return If enabled, the user is hidden from the global address list.
     */

    public Boolean isHiddenFromGlobalAddressList() {
        return this.hiddenFromGlobalAddressList;
    }

    /**
     * <p>
     * Updates the user's initials.
     * </p>
     * 
     * @param initials
     *        Updates the user's initials.
     */

    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * <p>
     * Updates the user's initials.
     * </p>
     * 
     * @return Updates the user's initials.
     */

    public String getInitials() {
        return this.initials;
    }

    /**
     * <p>
     * Updates the user's initials.
     * </p>
     * 
     * @param initials
     *        Updates the user's initials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withInitials(String initials) {
        setInitials(initials);
        return this;
    }

    /**
     * <p>
     * Updates the user's contact details.
     * </p>
     * 
     * @param telephone
     *        Updates the user's contact details.
     */

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * <p>
     * Updates the user's contact details.
     * </p>
     * 
     * @return Updates the user's contact details.
     */

    public String getTelephone() {
        return this.telephone;
    }

    /**
     * <p>
     * Updates the user's contact details.
     * </p>
     * 
     * @param telephone
     *        Updates the user's contact details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withTelephone(String telephone) {
        setTelephone(telephone);
        return this;
    }

    /**
     * <p>
     * Updates the user's street address.
     * </p>
     * 
     * @param street
     *        Updates the user's street address.
     */

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * <p>
     * Updates the user's street address.
     * </p>
     * 
     * @return Updates the user's street address.
     */

    public String getStreet() {
        return this.street;
    }

    /**
     * <p>
     * Updates the user's street address.
     * </p>
     * 
     * @param street
     *        Updates the user's street address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withStreet(String street) {
        setStreet(street);
        return this;
    }

    /**
     * <p>
     * Updates the user's job title.
     * </p>
     * 
     * @param jobTitle
     *        Updates the user's job title.
     */

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * <p>
     * Updates the user's job title.
     * </p>
     * 
     * @return Updates the user's job title.
     */

    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * <p>
     * Updates the user's job title.
     * </p>
     * 
     * @param jobTitle
     *        Updates the user's job title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withJobTitle(String jobTitle) {
        setJobTitle(jobTitle);
        return this;
    }

    /**
     * <p>
     * Updates the user's city.
     * </p>
     * 
     * @param city
     *        Updates the user's city.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * Updates the user's city.
     * </p>
     * 
     * @return Updates the user's city.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * Updates the user's city.
     * </p>
     * 
     * @param city
     *        Updates the user's city.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * Updates the user's company.
     * </p>
     * 
     * @param company
     *        Updates the user's company.
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * Updates the user's company.
     * </p>
     * 
     * @return Updates the user's company.
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * <p>
     * Updates the user's company.
     * </p>
     * 
     * @param company
     *        Updates the user's company.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * <p>
     * Updates the user's zipcode.
     * </p>
     * 
     * @param zipCode
     *        Updates the user's zipcode.
     */

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * Updates the user's zipcode.
     * </p>
     * 
     * @return Updates the user's zipcode.
     */

    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * <p>
     * Updates the user's zipcode.
     * </p>
     * 
     * @param zipCode
     *        Updates the user's zipcode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withZipCode(String zipCode) {
        setZipCode(zipCode);
        return this;
    }

    /**
     * <p>
     * Updates the user's department.
     * </p>
     * 
     * @param department
     *        Updates the user's department.
     */

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * <p>
     * Updates the user's department.
     * </p>
     * 
     * @return Updates the user's department.
     */

    public String getDepartment() {
        return this.department;
    }

    /**
     * <p>
     * Updates the user's department.
     * </p>
     * 
     * @param department
     *        Updates the user's department.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withDepartment(String department) {
        setDepartment(department);
        return this;
    }

    /**
     * <p>
     * Updates the user's country.
     * </p>
     * 
     * @param country
     *        Updates the user's country.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * Updates the user's country.
     * </p>
     * 
     * @return Updates the user's country.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * Updates the user's country.
     * </p>
     * 
     * @param country
     *        Updates the user's country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * Updates the user's office.
     * </p>
     * 
     * @param office
     *        Updates the user's office.
     */

    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * <p>
     * Updates the user's office.
     * </p>
     * 
     * @return Updates the user's office.
     */

    public String getOffice() {
        return this.office;
    }

    /**
     * <p>
     * Updates the user's office.
     * </p>
     * 
     * @param office
     *        Updates the user's office.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withOffice(String office) {
        setOffice(office);
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getHiddenFromGlobalAddressList() != null)
            sb.append("HiddenFromGlobalAddressList: ").append(getHiddenFromGlobalAddressList()).append(",");
        if (getInitials() != null)
            sb.append("Initials: ").append("***Sensitive Data Redacted***").append(",");
        if (getTelephone() != null)
            sb.append("Telephone: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreet() != null)
            sb.append("Street: ").append("***Sensitive Data Redacted***").append(",");
        if (getJobTitle() != null)
            sb.append("JobTitle: ").append("***Sensitive Data Redacted***").append(",");
        if (getCity() != null)
            sb.append("City: ").append("***Sensitive Data Redacted***").append(",");
        if (getCompany() != null)
            sb.append("Company: ").append("***Sensitive Data Redacted***").append(",");
        if (getZipCode() != null)
            sb.append("ZipCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getDepartment() != null)
            sb.append("Department: ").append("***Sensitive Data Redacted***").append(",");
        if (getCountry() != null)
            sb.append("Country: ").append("***Sensitive Data Redacted***").append(",");
        if (getOffice() != null)
            sb.append("Office: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getHiddenFromGlobalAddressList() == null ^ this.getHiddenFromGlobalAddressList() == null)
            return false;
        if (other.getHiddenFromGlobalAddressList() != null && other.getHiddenFromGlobalAddressList().equals(this.getHiddenFromGlobalAddressList()) == false)
            return false;
        if (other.getInitials() == null ^ this.getInitials() == null)
            return false;
        if (other.getInitials() != null && other.getInitials().equals(this.getInitials()) == false)
            return false;
        if (other.getTelephone() == null ^ this.getTelephone() == null)
            return false;
        if (other.getTelephone() != null && other.getTelephone().equals(this.getTelephone()) == false)
            return false;
        if (other.getStreet() == null ^ this.getStreet() == null)
            return false;
        if (other.getStreet() != null && other.getStreet().equals(this.getStreet()) == false)
            return false;
        if (other.getJobTitle() == null ^ this.getJobTitle() == null)
            return false;
        if (other.getJobTitle() != null && other.getJobTitle().equals(this.getJobTitle()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getZipCode() == null ^ this.getZipCode() == null)
            return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false)
            return false;
        if (other.getDepartment() == null ^ this.getDepartment() == null)
            return false;
        if (other.getDepartment() != null && other.getDepartment().equals(this.getDepartment()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getOffice() == null ^ this.getOffice() == null)
            return false;
        if (other.getOffice() != null && other.getOffice().equals(this.getOffice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getHiddenFromGlobalAddressList() == null) ? 0 : getHiddenFromGlobalAddressList().hashCode());
        hashCode = prime * hashCode + ((getInitials() == null) ? 0 : getInitials().hashCode());
        hashCode = prime * hashCode + ((getTelephone() == null) ? 0 : getTelephone().hashCode());
        hashCode = prime * hashCode + ((getStreet() == null) ? 0 : getStreet().hashCode());
        hashCode = prime * hashCode + ((getJobTitle() == null) ? 0 : getJobTitle().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        hashCode = prime * hashCode + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getOffice() == null) ? 0 : getOffice().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
