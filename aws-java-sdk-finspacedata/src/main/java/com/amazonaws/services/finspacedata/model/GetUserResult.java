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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the user account that is retrieved.
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
     * The email address that is associated with the user.
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
     * </ul>
     * <ul>
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
     * Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain credentials
     * that can then be used to access other FinSpace Data API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any APIs.
     * </p>
     * </li>
     * </ul>
     */
    private String apiAccess;
    /**
     * <p>
     * The ARN identifier of an AWS user or role that is allowed to call the
     * <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace user.
     * This must be an IAM role within your FinSpace account.
     * </p>
     */
    private String apiAccessPrincipalArn;
    /**
     * <p>
     * The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     * milliseconds.
     * </p>
     */
    private Long createTime;
    /**
     * <p>
     * Describes the last time the user account was enabled. The value is determined as epoch time in milliseconds.
     * </p>
     */
    private Long lastEnabledTime;
    /**
     * <p>
     * Describes the last time the user account was disabled. The value is determined as epoch time in milliseconds.
     * </p>
     */
    private Long lastDisabledTime;
    /**
     * <p>
     * Describes the last time the user account was updated. The value is determined as epoch time in milliseconds.
     * </p>
     */
    private Long lastModifiedTime;
    /**
     * <p>
     * Describes the last time that the user logged into their account. The value is determined as epoch time in
     * milliseconds.
     * </p>
     */
    private Long lastLoginTime;

    /**
     * <p>
     * The unique identifier for the user account that is retrieved.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user account that is retrieved.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user account that is retrieved.
     * </p>
     * 
     * @return The unique identifier for the user account that is retrieved.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier for the user account that is retrieved.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user account that is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withUserId(String userId) {
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

    public GetUserResult withStatus(String status) {
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

    public GetUserResult withStatus(UserStatus status) {
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

    public GetUserResult withFirstName(String firstName) {
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

    public GetUserResult withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The email address that is associated with the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address that is associated with the user.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address that is associated with the user.
     * </p>
     * 
     * @return The email address that is associated with the user.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address that is associated with the user.
     * </p>
     * 
     * @param emailAddress
     *        The email address that is associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withEmailAddress(String emailAddress) {
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
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of user. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
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
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the type of user. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
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
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of user. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions
     *        by adding them to a permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public GetUserResult withType(String type) {
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
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions by
     * adding them to a permission group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Indicates the type of user. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code> – A user with permission to all the functionality and data in FinSpace.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APP_USER</code> – A user with specific permissions in FinSpace. The users are assigned permissions
     *        by adding them to a permission group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserType
     */

    public GetUserResult withType(UserType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain credentials
     * that can then be used to access other FinSpace Data API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any APIs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiAccess
     *        Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     *        credentials that can then be used to access other FinSpace Data API operations. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user has permissions to use the APIs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user does not have permissions to use any APIs.
     *        </p>
     *        </li>
     * @see ApiAccess
     */

    public void setApiAccess(String apiAccess) {
        this.apiAccess = apiAccess;
    }

    /**
     * <p>
     * Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain credentials
     * that can then be used to access other FinSpace Data API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any APIs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     *         credentials that can then be used to access other FinSpace Data API operations. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – The user has permissions to use the APIs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – The user does not have permissions to use any APIs.
     *         </p>
     *         </li>
     * @see ApiAccess
     */

    public String getApiAccess() {
        return this.apiAccess;
    }

    /**
     * <p>
     * Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain credentials
     * that can then be used to access other FinSpace Data API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any APIs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiAccess
     *        Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     *        credentials that can then be used to access other FinSpace Data API operations. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user has permissions to use the APIs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user does not have permissions to use any APIs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiAccess
     */

    public GetUserResult withApiAccess(String apiAccess) {
        setApiAccess(apiAccess);
        return this;
    }

    /**
     * <p>
     * Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain credentials
     * that can then be used to access other FinSpace Data API operations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – The user has permissions to use the APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – The user does not have permissions to use any APIs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param apiAccess
     *        Indicates whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     *        credentials that can then be used to access other FinSpace Data API operations. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – The user has permissions to use the APIs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – The user does not have permissions to use any APIs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApiAccess
     */

    public GetUserResult withApiAccess(ApiAccess apiAccess) {
        this.apiAccess = apiAccess.toString();
        return this;
    }

    /**
     * <p>
     * The ARN identifier of an AWS user or role that is allowed to call the
     * <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace user.
     * This must be an IAM role within your FinSpace account.
     * </p>
     * 
     * @param apiAccessPrincipalArn
     *        The ARN identifier of an AWS user or role that is allowed to call the
     *        <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace
     *        user. This must be an IAM role within your FinSpace account.
     */

    public void setApiAccessPrincipalArn(String apiAccessPrincipalArn) {
        this.apiAccessPrincipalArn = apiAccessPrincipalArn;
    }

    /**
     * <p>
     * The ARN identifier of an AWS user or role that is allowed to call the
     * <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace user.
     * This must be an IAM role within your FinSpace account.
     * </p>
     * 
     * @return The ARN identifier of an AWS user or role that is allowed to call the
     *         <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace
     *         user. This must be an IAM role within your FinSpace account.
     */

    public String getApiAccessPrincipalArn() {
        return this.apiAccessPrincipalArn;
    }

    /**
     * <p>
     * The ARN identifier of an AWS user or role that is allowed to call the
     * <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace user.
     * This must be an IAM role within your FinSpace account.
     * </p>
     * 
     * @param apiAccessPrincipalArn
     *        The ARN identifier of an AWS user or role that is allowed to call the
     *        <code>GetProgrammaticAccessCredentials</code> API to obtain a credentials token for a specific FinSpace
     *        user. This must be an IAM role within your FinSpace account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withApiAccessPrincipalArn(String apiAccessPrincipalArn) {
        setApiAccessPrincipalArn(apiAccessPrincipalArn);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     * milliseconds.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     * milliseconds.
     * </p>
     * 
     * @return The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     * milliseconds.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the user account was created in FinSpace. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withCreateTime(Long createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Describes the last time the user account was enabled. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastEnabledTime
     *        Describes the last time the user account was enabled. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setLastEnabledTime(Long lastEnabledTime) {
        this.lastEnabledTime = lastEnabledTime;
    }

    /**
     * <p>
     * Describes the last time the user account was enabled. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @return Describes the last time the user account was enabled. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getLastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * <p>
     * Describes the last time the user account was enabled. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastEnabledTime
     *        Describes the last time the user account was enabled. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withLastEnabledTime(Long lastEnabledTime) {
        setLastEnabledTime(lastEnabledTime);
        return this;
    }

    /**
     * <p>
     * Describes the last time the user account was disabled. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastDisabledTime
     *        Describes the last time the user account was disabled. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setLastDisabledTime(Long lastDisabledTime) {
        this.lastDisabledTime = lastDisabledTime;
    }

    /**
     * <p>
     * Describes the last time the user account was disabled. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @return Describes the last time the user account was disabled. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getLastDisabledTime() {
        return this.lastDisabledTime;
    }

    /**
     * <p>
     * Describes the last time the user account was disabled. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastDisabledTime
     *        Describes the last time the user account was disabled. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withLastDisabledTime(Long lastDisabledTime) {
        setLastDisabledTime(lastDisabledTime);
        return this;
    }

    /**
     * <p>
     * Describes the last time the user account was updated. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastModifiedTime
     *        Describes the last time the user account was updated. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Describes the last time the user account was updated. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @return Describes the last time the user account was updated. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Describes the last time the user account was updated. The value is determined as epoch time in milliseconds.
     * </p>
     * 
     * @param lastModifiedTime
     *        Describes the last time the user account was updated. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withLastModifiedTime(Long lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Describes the last time that the user logged into their account. The value is determined as epoch time in
     * milliseconds.
     * </p>
     * 
     * @param lastLoginTime
     *        Describes the last time that the user logged into their account. The value is determined as epoch time in
     *        milliseconds.
     */

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * <p>
     * Describes the last time that the user logged into their account. The value is determined as epoch time in
     * milliseconds.
     * </p>
     * 
     * @return Describes the last time that the user logged into their account. The value is determined as epoch time in
     *         milliseconds.
     */

    public Long getLastLoginTime() {
        return this.lastLoginTime;
    }

    /**
     * <p>
     * Describes the last time that the user logged into their account. The value is determined as epoch time in
     * milliseconds.
     * </p>
     * 
     * @param lastLoginTime
     *        Describes the last time that the user logged into their account. The value is determined as epoch time in
     *        milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUserResult withLastLoginTime(Long lastLoginTime) {
        setLastLoginTime(lastLoginTime);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastEnabledTime() != null)
            sb.append("LastEnabledTime: ").append(getLastEnabledTime()).append(",");
        if (getLastDisabledTime() != null)
            sb.append("LastDisabledTime: ").append(getLastDisabledTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastLoginTime() != null)
            sb.append("LastLoginTime: ").append(getLastLoginTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUserResult == false)
            return false;
        GetUserResult other = (GetUserResult) obj;
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
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastEnabledTime() == null ^ this.getLastEnabledTime() == null)
            return false;
        if (other.getLastEnabledTime() != null && other.getLastEnabledTime().equals(this.getLastEnabledTime()) == false)
            return false;
        if (other.getLastDisabledTime() == null ^ this.getLastDisabledTime() == null)
            return false;
        if (other.getLastDisabledTime() != null && other.getLastDisabledTime().equals(this.getLastDisabledTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastLoginTime() == null ^ this.getLastLoginTime() == null)
            return false;
        if (other.getLastLoginTime() != null && other.getLastLoginTime().equals(this.getLastLoginTime()) == false)
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
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastEnabledTime() == null) ? 0 : getLastEnabledTime().hashCode());
        hashCode = prime * hashCode + ((getLastDisabledTime() == null) ? 0 : getLastDisabledTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastLoginTime() == null) ? 0 : getLastLoginTime().hashCode());
        return hashCode;
    }

    @Override
    public GetUserResult clone() {
        try {
            return (GetUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
