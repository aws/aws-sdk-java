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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The name for the user.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The email of the user.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The display name of the user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to WorkMail).
     * </p>
     */
    private String state;
    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * </p>
     */
    private String userRole;
    /**
     * <p>
     * The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date enabledDate;
    /**
     * <p>
     * The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date disabledDate;
    /**
     * <p>
     * The date when the mailbox was created for the user.
     * </p>
     */
    private java.util.Date mailboxProvisionedDate;
    /**
     * <p>
     * The date when the mailbox was removed for the user.
     * </p>
     */
    private java.util.Date mailboxDeprovisionedDate;
    /**
     * <p>
     * First name of the user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * Last name of the user.
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
     * Initials of the user.
     * </p>
     */
    private String initials;
    /**
     * <p>
     * User's contact number.
     * </p>
     */
    private String telephone;
    /**
     * <p>
     * Street where the user is located.
     * </p>
     */
    private String street;
    /**
     * <p>
     * Job title of the user.
     * </p>
     */
    private String jobTitle;
    /**
     * <p>
     * City where the user is located.
     * </p>
     */
    private String city;
    /**
     * <p>
     * Company of the user.
     * </p>
     */
    private String company;
    /**
     * <p>
     * Zip code of the user.
     * </p>
     */
    private String zipCode;
    /**
     * <p>
     * Department of the user.
     * </p>
     */
    private String department;
    /**
     * <p>
     * Country where the user is located.
     * </p>
     */
    private String country;
    /**
     * <p>
     * Office where the user is located.
     * </p>
     */
    private String office;

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * 
     * @param userId
     *        The identifier for the described user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * 
     * @return The identifier for the described user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for the described user.
     * </p>
     * 
     * @param userId
     *        The identifier for the described user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * 
     * @param name
     *        The name for the user.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * 
     * @return The name for the user.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the user.
     * </p>
     * 
     * @param name
     *        The name for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * 
     * @param email
     *        The email of the user.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * 
     * @return The email of the user.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email of the user.
     * </p>
     * 
     * @param email
     *        The email of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @return The display name of the user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to WorkMail).
     * </p>
     * 
     * @param state
     *        The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to
     *        WorkMail).
     * @see EntityState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to WorkMail).
     * </p>
     * 
     * @return The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to
     *         WorkMail).
     * @see EntityState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to WorkMail).
     * </p>
     * 
     * @param state
     *        The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to
     *        WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeUserResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to WorkMail).
     * </p>
     * 
     * @param state
     *        The state of a user: enabled (registered to WorkMail) or disabled (deregistered or never registered to
     *        WorkMail).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EntityState
     */

    public DescribeUserResult withState(EntityState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * </p>
     * 
     * @param userRole
     *        In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *        imported into WorkMail as users. Because different WorkMail organizations rely on different directory
     *        types, administrators can distinguish between an unregistered user (account is disabled and has a user
     *        role) and the directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * @see UserRole
     */

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * </p>
     * 
     * @return In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *         imported into WorkMail as users. Because different WorkMail organizations rely on different directory
     *         types, administrators can distinguish between an unregistered user (account is disabled and has a user
     *         role) and the directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * @see UserRole
     */

    public String getUserRole() {
        return this.userRole;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * </p>
     * 
     * @param userRole
     *        In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *        imported into WorkMail as users. Because different WorkMail organizations rely on different directory
     *        types, administrators can distinguish between an unregistered user (account is disabled and has a user
     *        role) and the directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public DescribeUserResult withUserRole(String userRole) {
        setUserRole(userRole);
        return this;
    }

    /**
     * <p>
     * In certain cases, other entities are modeled as users. If interoperability is enabled, resources are imported
     * into WorkMail as users. Because different WorkMail organizations rely on different directory types,
     * administrators can distinguish between an unregistered user (account is disabled and has a user role) and the
     * directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * </p>
     * 
     * @param userRole
     *        In certain cases, other entities are modeled as users. If interoperability is enabled, resources are
     *        imported into WorkMail as users. Because different WorkMail organizations rely on different directory
     *        types, administrators can distinguish between an unregistered user (account is disabled and has a user
     *        role) and the directory administrators. The values are USER, RESOURCE, SYSTEM_USER, and REMOTE_USER.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserRole
     */

    public DescribeUserResult withUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
        return this;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     */

    public void setEnabledDate(java.util.Date enabledDate) {
        this.enabledDate = enabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     */

    public java.util.Date getEnabledDate() {
        return this.enabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     * </p>
     * 
     * @param enabledDate
     *        The date and time at which the user was enabled for WorkMailusage, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withEnabledDate(java.util.Date enabledDate) {
        setEnabledDate(enabledDate);
        return this;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     */

    public void setDisabledDate(java.util.Date disabledDate) {
        this.disabledDate = disabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     */

    public java.util.Date getDisabledDate() {
        return this.disabledDate;
    }

    /**
     * <p>
     * The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     * </p>
     * 
     * @param disabledDate
     *        The date and time at which the user was disabled for WorkMail usage, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withDisabledDate(java.util.Date disabledDate) {
        setDisabledDate(disabledDate);
        return this;
    }

    /**
     * <p>
     * The date when the mailbox was created for the user.
     * </p>
     * 
     * @param mailboxProvisionedDate
     *        The date when the mailbox was created for the user.
     */

    public void setMailboxProvisionedDate(java.util.Date mailboxProvisionedDate) {
        this.mailboxProvisionedDate = mailboxProvisionedDate;
    }

    /**
     * <p>
     * The date when the mailbox was created for the user.
     * </p>
     * 
     * @return The date when the mailbox was created for the user.
     */

    public java.util.Date getMailboxProvisionedDate() {
        return this.mailboxProvisionedDate;
    }

    /**
     * <p>
     * The date when the mailbox was created for the user.
     * </p>
     * 
     * @param mailboxProvisionedDate
     *        The date when the mailbox was created for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withMailboxProvisionedDate(java.util.Date mailboxProvisionedDate) {
        setMailboxProvisionedDate(mailboxProvisionedDate);
        return this;
    }

    /**
     * <p>
     * The date when the mailbox was removed for the user.
     * </p>
     * 
     * @param mailboxDeprovisionedDate
     *        The date when the mailbox was removed for the user.
     */

    public void setMailboxDeprovisionedDate(java.util.Date mailboxDeprovisionedDate) {
        this.mailboxDeprovisionedDate = mailboxDeprovisionedDate;
    }

    /**
     * <p>
     * The date when the mailbox was removed for the user.
     * </p>
     * 
     * @return The date when the mailbox was removed for the user.
     */

    public java.util.Date getMailboxDeprovisionedDate() {
        return this.mailboxDeprovisionedDate;
    }

    /**
     * <p>
     * The date when the mailbox was removed for the user.
     * </p>
     * 
     * @param mailboxDeprovisionedDate
     *        The date when the mailbox was removed for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withMailboxDeprovisionedDate(java.util.Date mailboxDeprovisionedDate) {
        setMailboxDeprovisionedDate(mailboxDeprovisionedDate);
        return this;
    }

    /**
     * <p>
     * First name of the user.
     * </p>
     * 
     * @param firstName
     *        First name of the user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * First name of the user.
     * </p>
     * 
     * @return First name of the user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * First name of the user.
     * </p>
     * 
     * @param firstName
     *        First name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * Last name of the user.
     * </p>
     * 
     * @param lastName
     *        Last name of the user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * Last name of the user.
     * </p>
     * 
     * @return Last name of the user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * Last name of the user.
     * </p>
     * 
     * @param lastName
     *        Last name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withLastName(String lastName) {
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

    public DescribeUserResult withHiddenFromGlobalAddressList(Boolean hiddenFromGlobalAddressList) {
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
     * Initials of the user.
     * </p>
     * 
     * @param initials
     *        Initials of the user.
     */

    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * <p>
     * Initials of the user.
     * </p>
     * 
     * @return Initials of the user.
     */

    public String getInitials() {
        return this.initials;
    }

    /**
     * <p>
     * Initials of the user.
     * </p>
     * 
     * @param initials
     *        Initials of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withInitials(String initials) {
        setInitials(initials);
        return this;
    }

    /**
     * <p>
     * User's contact number.
     * </p>
     * 
     * @param telephone
     *        User's contact number.
     */

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * <p>
     * User's contact number.
     * </p>
     * 
     * @return User's contact number.
     */

    public String getTelephone() {
        return this.telephone;
    }

    /**
     * <p>
     * User's contact number.
     * </p>
     * 
     * @param telephone
     *        User's contact number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withTelephone(String telephone) {
        setTelephone(telephone);
        return this;
    }

    /**
     * <p>
     * Street where the user is located.
     * </p>
     * 
     * @param street
     *        Street where the user is located.
     */

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * <p>
     * Street where the user is located.
     * </p>
     * 
     * @return Street where the user is located.
     */

    public String getStreet() {
        return this.street;
    }

    /**
     * <p>
     * Street where the user is located.
     * </p>
     * 
     * @param street
     *        Street where the user is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withStreet(String street) {
        setStreet(street);
        return this;
    }

    /**
     * <p>
     * Job title of the user.
     * </p>
     * 
     * @param jobTitle
     *        Job title of the user.
     */

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * <p>
     * Job title of the user.
     * </p>
     * 
     * @return Job title of the user.
     */

    public String getJobTitle() {
        return this.jobTitle;
    }

    /**
     * <p>
     * Job title of the user.
     * </p>
     * 
     * @param jobTitle
     *        Job title of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withJobTitle(String jobTitle) {
        setJobTitle(jobTitle);
        return this;
    }

    /**
     * <p>
     * City where the user is located.
     * </p>
     * 
     * @param city
     *        City where the user is located.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * City where the user is located.
     * </p>
     * 
     * @return City where the user is located.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * City where the user is located.
     * </p>
     * 
     * @param city
     *        City where the user is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * Company of the user.
     * </p>
     * 
     * @param company
     *        Company of the user.
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * Company of the user.
     * </p>
     * 
     * @return Company of the user.
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * <p>
     * Company of the user.
     * </p>
     * 
     * @param company
     *        Company of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * <p>
     * Zip code of the user.
     * </p>
     * 
     * @param zipCode
     *        Zip code of the user.
     */

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * Zip code of the user.
     * </p>
     * 
     * @return Zip code of the user.
     */

    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * <p>
     * Zip code of the user.
     * </p>
     * 
     * @param zipCode
     *        Zip code of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withZipCode(String zipCode) {
        setZipCode(zipCode);
        return this;
    }

    /**
     * <p>
     * Department of the user.
     * </p>
     * 
     * @param department
     *        Department of the user.
     */

    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * <p>
     * Department of the user.
     * </p>
     * 
     * @return Department of the user.
     */

    public String getDepartment() {
        return this.department;
    }

    /**
     * <p>
     * Department of the user.
     * </p>
     * 
     * @param department
     *        Department of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withDepartment(String department) {
        setDepartment(department);
        return this;
    }

    /**
     * <p>
     * Country where the user is located.
     * </p>
     * 
     * @param country
     *        Country where the user is located.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * Country where the user is located.
     * </p>
     * 
     * @return Country where the user is located.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * Country where the user is located.
     * </p>
     * 
     * @param country
     *        Country where the user is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * Office where the user is located.
     * </p>
     * 
     * @param office
     *        Office where the user is located.
     */

    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * <p>
     * Office where the user is located.
     * </p>
     * 
     * @return Office where the user is located.
     */

    public String getOffice() {
        return this.office;
    }

    /**
     * <p>
     * Office where the user is located.
     * </p>
     * 
     * @param office
     *        Office where the user is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUserResult withOffice(String office) {
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUserRole() != null)
            sb.append("UserRole: ").append(getUserRole()).append(",");
        if (getEnabledDate() != null)
            sb.append("EnabledDate: ").append(getEnabledDate()).append(",");
        if (getDisabledDate() != null)
            sb.append("DisabledDate: ").append(getDisabledDate()).append(",");
        if (getMailboxProvisionedDate() != null)
            sb.append("MailboxProvisionedDate: ").append(getMailboxProvisionedDate()).append(",");
        if (getMailboxDeprovisionedDate() != null)
            sb.append("MailboxDeprovisionedDate: ").append(getMailboxDeprovisionedDate()).append(",");
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

        if (obj instanceof DescribeUserResult == false)
            return false;
        DescribeUserResult other = (DescribeUserResult) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
            return false;
        if (other.getEnabledDate() == null ^ this.getEnabledDate() == null)
            return false;
        if (other.getEnabledDate() != null && other.getEnabledDate().equals(this.getEnabledDate()) == false)
            return false;
        if (other.getDisabledDate() == null ^ this.getDisabledDate() == null)
            return false;
        if (other.getDisabledDate() != null && other.getDisabledDate().equals(this.getDisabledDate()) == false)
            return false;
        if (other.getMailboxProvisionedDate() == null ^ this.getMailboxProvisionedDate() == null)
            return false;
        if (other.getMailboxProvisionedDate() != null && other.getMailboxProvisionedDate().equals(this.getMailboxProvisionedDate()) == false)
            return false;
        if (other.getMailboxDeprovisionedDate() == null ^ this.getMailboxDeprovisionedDate() == null)
            return false;
        if (other.getMailboxDeprovisionedDate() != null && other.getMailboxDeprovisionedDate().equals(this.getMailboxDeprovisionedDate()) == false)
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

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        hashCode = prime * hashCode + ((getEnabledDate() == null) ? 0 : getEnabledDate().hashCode());
        hashCode = prime * hashCode + ((getDisabledDate() == null) ? 0 : getDisabledDate().hashCode());
        hashCode = prime * hashCode + ((getMailboxProvisionedDate() == null) ? 0 : getMailboxProvisionedDate().hashCode());
        hashCode = prime * hashCode + ((getMailboxDeprovisionedDate() == null) ? 0 : getMailboxDeprovisionedDate().hashCode());
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
    public DescribeUserResult clone() {
        try {
            return (DescribeUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
