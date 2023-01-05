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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the user account to update.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The option to indicate the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     * The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     * credentials that can then be used to access other FinSpace Data API operations.
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
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The unique identifier for the user account to update.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user account to update.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique identifier for the user account to update.
     * </p>
     * 
     * @return The unique identifier for the user account to update.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique identifier for the user account to update.
     * </p>
     * 
     * @param userId
     *        The unique identifier for the user account to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The option to indicate the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     *        The option to indicate the type of user.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     * The option to indicate the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     * @return The option to indicate the type of user.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     * The option to indicate the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     *        The option to indicate the type of user.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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

    public UpdateUserRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The option to indicate the type of user.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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
     *        The option to indicate the type of user.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUPER_USER</code>– A user with permission to all the functionality and data in FinSpace.
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

    public UpdateUserRequest withType(UserType type) {
        this.type = type.toString();
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

    public UpdateUserRequest withFirstName(String firstName) {
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

    public UpdateUserRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     * credentials that can then be used to access other FinSpace Data API operations.
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
     *        The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to
     *        obtain credentials that can then be used to access other FinSpace Data API operations.</p>
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
     * The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     * credentials that can then be used to access other FinSpace Data API operations.
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
     * @return The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to
     *         obtain credentials that can then be used to access other FinSpace Data API operations.</p>
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
     * The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     * credentials that can then be used to access other FinSpace Data API operations.
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
     *        The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to
     *        obtain credentials that can then be used to access other FinSpace Data API operations.</p>
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

    public UpdateUserRequest withApiAccess(String apiAccess) {
        setApiAccess(apiAccess);
        return this;
    }

    /**
     * <p>
     * The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to obtain
     * credentials that can then be used to access other FinSpace Data API operations.
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
     *        The option to indicate whether the user can use the <code>GetProgrammaticAccessCredentials</code> API to
     *        obtain credentials that can then be used to access other FinSpace Data API operations.</p>
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

    public UpdateUserRequest withApiAccess(ApiAccess apiAccess) {
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

    public UpdateUserRequest withApiAccessPrincipalArn(String apiAccessPrincipalArn) {
        setApiAccessPrincipalArn(apiAccessPrincipalArn);
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getApiAccess() != null)
            sb.append("ApiAccess: ").append(getApiAccess()).append(",");
        if (getApiAccessPrincipalArn() != null)
            sb.append("ApiAccessPrincipalArn: ").append(getApiAccessPrincipalArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
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
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getApiAccess() == null ^ this.getApiAccess() == null)
            return false;
        if (other.getApiAccess() != null && other.getApiAccess().equals(this.getApiAccess()) == false)
            return false;
        if (other.getApiAccessPrincipalArn() == null ^ this.getApiAccessPrincipalArn() == null)
            return false;
        if (other.getApiAccessPrincipalArn() != null && other.getApiAccessPrincipalArn().equals(this.getApiAccessPrincipalArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getApiAccess() == null) ? 0 : getApiAccess().hashCode());
        hashCode = prime * hashCode + ((getApiAccessPrincipalArn() == null) ? 0 : getApiAccessPrincipalArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
