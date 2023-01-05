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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The structure of a user account associated with a permission group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UserByPermissionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserByPermissionGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The current status of the user account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> – The user account creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user account is created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user account is currently inactive.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The first name of the user.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the user.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The email address of the user. The email address serves as a unique identifier for each user and cannot be
     * changed after it's created.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * Indicates the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Indicates whether the user can access FinSpace API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the API operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any API operations.
     * </p>
     * </li>
     * </ul>
     */
    private String apiAccess;
    /**
     * <p>
     * The IAM ARN identifier that is attached to FinSpace API calls.
     * </p>
     */
    private String apiAccessPrincipalArn;
    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     */
    private String membershipStatus;

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * 
     * @return The unique identifier for the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier for the user.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserByPermissionGroup withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The current status of the user account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> – The user account creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user account is created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user account is currently inactive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the user account. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> – The user account creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user account is created and is currently active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user account is currently inactive.
     *        </p>
     *        </li>
     * @see UserStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the user account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> – The user account creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user account is created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user account is currently inactive.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the user account. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATING</code> – The user account creation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – The user account is created and is currently active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – The user account is currently inactive.
     *         </p>
     *         </li>
     * @see UserStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the user account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> – The user account creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user account is created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user account is currently inactive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the user account. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> – The user account creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user account is created and is currently active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user account is currently inactive.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatus
     */

    public UserByPermissionGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the user account.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATING</code> – The user account creation is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user account is created and is currently active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user account is currently inactive.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current status of the user account. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATING</code> – The user account creation is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user account is created and is currently active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user account is currently inactive.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatus
     */

    public UserByPermissionGroup withStatus(UserStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @param firstName
     *        The first name of the user.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @return The first name of the user.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @param firstName
     *        The first name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserByPermissionGroup withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @param lastName
     *        The last name of the user.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @return The last name of the user.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @param lastName
     *        The last name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserByPermissionGroup withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The email address of the user. The email address serves as a unique identifier for each user and cannot be
     * changed after it's created.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the user. The email address serves as a unique identifier for each user and cannot be
     *        changed after it's created.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address of the user. The email address serves as a unique identifier for each user and cannot be
     * changed after it's created.
     * </p>
     * 
     * @return The email address of the user. The email address serves as a unique identifier for each user and cannot
     *         be changed after it's created.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address of the user. The email address serves as a unique identifier for each user and cannot be
     * changed after it's created.
     * </p>
     * 
     * @param emailAddress
     *        The email address of the user. The email address serves as a unique identifier for each user and cannot be
     *        changed after it's created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserByPermissionGroup withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * Indicates the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of user.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions
     *        by adding them to a permission group.
     *        </p>
     *        </li>
     * @see UserType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Indicates the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the type of user.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions
     *         by adding them to a permission group.
     *         </p>
     *         </li>
     * @see UserType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Indicates the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of user.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions
     *        by adding them to a permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public UserByPermissionGroup withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Indicates the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of user.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions
     *        by adding them to a permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public UserByPermissionGroup withType(UserType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can access FinSpace API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the API operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any API operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiAccess
     *        Indicates whether the user can access FinSpace API operations.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user has permissions to use the API operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user does not have permissions to use any API operations.
     *        </p>
     *        </li>
     * @see ApiAccess
     */

    public void setApiAccess(String apiAccess) {
        this.apiAccess = apiAccess;
    }

    /**
     * <p>
     * Indicates whether the user can access FinSpace API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the API operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any API operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the user can access FinSpace API operations.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – The user has permissions to use the API operations.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – The user does not have permissions to use any API operations.
     *         </p>
     *         </li>
     * @see ApiAccess
     */

    public String getApiAccess() {
        return this.apiAccess;
    }

    /**
     * <p>
     * Indicates whether the user can access FinSpace API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the API operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any API operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiAccess
     *        Indicates whether the user can access FinSpace API operations.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user has permissions to use the API operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user does not have permissions to use any API operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiAccess
     */

    public UserByPermissionGroup withApiAccess(String apiAccess) {
        setApiAccess(apiAccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can access FinSpace API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the API operations.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any API operations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiAccess
     *        Indicates whether the user can access FinSpace API operations.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user has permissions to use the API operations.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user does not have permissions to use any API operations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiAccess
     */

    public UserByPermissionGroup withApiAccess(ApiAccess apiAccess) {
        this.apiAccess = apiAccess.toString();
        return this;
    }

    /**
     * <p>
     * The IAM ARN identifier that is attached to FinSpace API calls.
     * </p>
     * 
     * @param apiAccessPrincipalArn
     *        The IAM ARN identifier that is attached to FinSpace API calls.
     */

    public void setApiAccessPrincipalArn(String apiAccessPrincipalArn) {
        this.apiAccessPrincipalArn = apiAccessPrincipalArn;
    }

    /**
     * <p>
     * The IAM ARN identifier that is attached to FinSpace API calls.
     * </p>
     * 
     * @return The IAM ARN identifier that is attached to FinSpace API calls.
     */

    public String getApiAccessPrincipalArn() {
        return this.apiAccessPrincipalArn;
    }

    /**
     * <p>
     * The IAM ARN identifier that is attached to FinSpace API calls.
     * </p>
     * 
     * @param apiAccessPrincipalArn
     *        The IAM ARN identifier that is attached to FinSpace API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserByPermissionGroup withApiAccessPrincipalArn(String apiAccessPrincipalArn) {
        setApiAccessPrincipalArn(apiAccessPrincipalArn);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @see PermissionGroupMembershipStatus
     */

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of the user account within a permission group.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *         </p>
     *         </li>
     * @see PermissionGroupMembershipStatus
     */

    public String getMembershipStatus() {
        return this.membershipStatus;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroupMembershipStatus
     */

    public UserByPermissionGroup withMembershipStatus(String membershipStatus) {
        setMembershipStatus(membershipStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of the user account within a permission group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param membershipStatus
     *        Indicates the status of the user account within a permission group.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ADDITION_IN_PROGRESS</code> – The user account is currently being added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ADDITION_SUCCESS</code> – The user account is successfully added to the permission group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REMOVAL_IN_PROGRESS</code> – The user is currently being removed from the permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionGroupMembershipStatus
     */

    public UserByPermissionGroup withMembershipStatus(PermissionGroupMembershipStatus membershipStatus) {
        this.membershipStatus = membershipStatus.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getApiAccess() != null)
            sb.append("ApiAccess: ").append(getApiAccess()).append(",");
        if (getApiAccessPrincipalArn() != null)
            sb.append("ApiAccessPrincipalArn: ").append(getApiAccessPrincipalArn()).append(",");
        if (getMembershipStatus() != null)
            sb.append("MembershipStatus: ").append(getMembershipStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserByPermissionGroup == false)
            return false;
        UserByPermissionGroup other = (UserByPermissionGroup) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getApiAccess() == null ^ this.getApiAccess() == null)
            return false;
        if (other.getApiAccess() != null && other.getApiAccess().equals(this.getApiAccess()) == false)
            return false;
        if (other.getApiAccessPrincipalArn() == null ^ this.getApiAccessPrincipalArn() == null)
            return false;
        if (other.getApiAccessPrincipalArn() != null && other.getApiAccessPrincipalArn().equals(this.getApiAccessPrincipalArn()) == false)
            return false;
        if (other.getMembershipStatus() == null ^ this.getMembershipStatus() == null)
            return false;
        if (other.getMembershipStatus() != null && other.getMembershipStatus().equals(this.getMembershipStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getApiAccess() == null) ? 0 : getApiAccess().hashCode());
        hashCode = prime * hashCode + ((getApiAccessPrincipalArn() == null) ? 0 : getApiAccessPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getMembershipStatus() == null) ? 0 : getMembershipStatus().hashCode());
        return hashCode;
    }

    @Override
    public UserByPermissionGroup clone() {
        try {
            return (UserByPermissionGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.UserByPermissionGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
