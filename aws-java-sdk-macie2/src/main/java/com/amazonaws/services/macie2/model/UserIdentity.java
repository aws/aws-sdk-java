/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the type and other characteristics of an entity that performed an action on an affected
 * resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UserIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation
     * of the Security Token Service (STS) API, the identifiers, session context, and other details about the identity.
     * </p>
     */
    private AssumedRole assumedRole;
    /**
     * <p>
     * If the action was performed using the credentials for another Amazon Web Services account, the details of that
     * account.
     * </p>
     */
    private AwsAccount awsAccount;
    /**
     * <p>
     * If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the name of
     * the service.
     * </p>
     */
    private AwsService awsService;
    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the GetFederationToken
     * operation of the Security Token Service (STS) API, the identifiers, session context, and other details about the
     * identity.
     * </p>
     */
    private FederatedUser federatedUser;
    /**
     * <p>
     * If the action was performed using the credentials for an Identity and Access Management (IAM) user, the name and
     * other details about the user.
     * </p>
     */
    private IamUser iamUser;
    /**
     * <p>
     * If the action was performed using the credentials for your Amazon Web Services account, the details of your
     * account.
     * </p>
     */
    private UserIdentityRoot root;
    /**
     * <p>
     * The type of entity that performed the action.
     * </p>
     */
    private String type;

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation
     * of the Security Token Service (STS) API, the identifiers, session context, and other details about the identity.
     * </p>
     * 
     * @param assumedRole
     *        If the action was performed with temporary security credentials that were obtained using the AssumeRole
     *        operation of the Security Token Service (STS) API, the identifiers, session context, and other details
     *        about the identity.
     */

    public void setAssumedRole(AssumedRole assumedRole) {
        this.assumedRole = assumedRole;
    }

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation
     * of the Security Token Service (STS) API, the identifiers, session context, and other details about the identity.
     * </p>
     * 
     * @return If the action was performed with temporary security credentials that were obtained using the AssumeRole
     *         operation of the Security Token Service (STS) API, the identifiers, session context, and other details
     *         about the identity.
     */

    public AssumedRole getAssumedRole() {
        return this.assumedRole;
    }

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the AssumeRole operation
     * of the Security Token Service (STS) API, the identifiers, session context, and other details about the identity.
     * </p>
     * 
     * @param assumedRole
     *        If the action was performed with temporary security credentials that were obtained using the AssumeRole
     *        operation of the Security Token Service (STS) API, the identifiers, session context, and other details
     *        about the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentity withAssumedRole(AssumedRole assumedRole) {
        setAssumedRole(assumedRole);
        return this;
    }

    /**
     * <p>
     * If the action was performed using the credentials for another Amazon Web Services account, the details of that
     * account.
     * </p>
     * 
     * @param awsAccount
     *        If the action was performed using the credentials for another Amazon Web Services account, the details of
     *        that account.
     */

    public void setAwsAccount(AwsAccount awsAccount) {
        this.awsAccount = awsAccount;
    }

    /**
     * <p>
     * If the action was performed using the credentials for another Amazon Web Services account, the details of that
     * account.
     * </p>
     * 
     * @return If the action was performed using the credentials for another Amazon Web Services account, the details of
     *         that account.
     */

    public AwsAccount getAwsAccount() {
        return this.awsAccount;
    }

    /**
     * <p>
     * If the action was performed using the credentials for another Amazon Web Services account, the details of that
     * account.
     * </p>
     * 
     * @param awsAccount
     *        If the action was performed using the credentials for another Amazon Web Services account, the details of
     *        that account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentity withAwsAccount(AwsAccount awsAccount) {
        setAwsAccount(awsAccount);
        return this;
    }

    /**
     * <p>
     * If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the name of
     * the service.
     * </p>
     * 
     * @param awsService
     *        If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the
     *        name of the service.
     */

    public void setAwsService(AwsService awsService) {
        this.awsService = awsService;
    }

    /**
     * <p>
     * If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the name of
     * the service.
     * </p>
     * 
     * @return If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the
     *         name of the service.
     */

    public AwsService getAwsService() {
        return this.awsService;
    }

    /**
     * <p>
     * If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the name of
     * the service.
     * </p>
     * 
     * @param awsService
     *        If the action was performed by an Amazon Web Services account that belongs to an Amazon Web Service, the
     *        name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentity withAwsService(AwsService awsService) {
        setAwsService(awsService);
        return this;
    }

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the GetFederationToken
     * operation of the Security Token Service (STS) API, the identifiers, session context, and other details about the
     * identity.
     * </p>
     * 
     * @param federatedUser
     *        If the action was performed with temporary security credentials that were obtained using the
     *        GetFederationToken operation of the Security Token Service (STS) API, the identifiers, session context,
     *        and other details about the identity.
     */

    public void setFederatedUser(FederatedUser federatedUser) {
        this.federatedUser = federatedUser;
    }

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the GetFederationToken
     * operation of the Security Token Service (STS) API, the identifiers, session context, and other details about the
     * identity.
     * </p>
     * 
     * @return If the action was performed with temporary security credentials that were obtained using the
     *         GetFederationToken operation of the Security Token Service (STS) API, the identifiers, session context,
     *         and other details about the identity.
     */

    public FederatedUser getFederatedUser() {
        return this.federatedUser;
    }

    /**
     * <p>
     * If the action was performed with temporary security credentials that were obtained using the GetFederationToken
     * operation of the Security Token Service (STS) API, the identifiers, session context, and other details about the
     * identity.
     * </p>
     * 
     * @param federatedUser
     *        If the action was performed with temporary security credentials that were obtained using the
     *        GetFederationToken operation of the Security Token Service (STS) API, the identifiers, session context,
     *        and other details about the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentity withFederatedUser(FederatedUser federatedUser) {
        setFederatedUser(federatedUser);
        return this;
    }

    /**
     * <p>
     * If the action was performed using the credentials for an Identity and Access Management (IAM) user, the name and
     * other details about the user.
     * </p>
     * 
     * @param iamUser
     *        If the action was performed using the credentials for an Identity and Access Management (IAM) user, the
     *        name and other details about the user.
     */

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    /**
     * <p>
     * If the action was performed using the credentials for an Identity and Access Management (IAM) user, the name and
     * other details about the user.
     * </p>
     * 
     * @return If the action was performed using the credentials for an Identity and Access Management (IAM) user, the
     *         name and other details about the user.
     */

    public IamUser getIamUser() {
        return this.iamUser;
    }

    /**
     * <p>
     * If the action was performed using the credentials for an Identity and Access Management (IAM) user, the name and
     * other details about the user.
     * </p>
     * 
     * @param iamUser
     *        If the action was performed using the credentials for an Identity and Access Management (IAM) user, the
     *        name and other details about the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentity withIamUser(IamUser iamUser) {
        setIamUser(iamUser);
        return this;
    }

    /**
     * <p>
     * If the action was performed using the credentials for your Amazon Web Services account, the details of your
     * account.
     * </p>
     * 
     * @param root
     *        If the action was performed using the credentials for your Amazon Web Services account, the details of
     *        your account.
     */

    public void setRoot(UserIdentityRoot root) {
        this.root = root;
    }

    /**
     * <p>
     * If the action was performed using the credentials for your Amazon Web Services account, the details of your
     * account.
     * </p>
     * 
     * @return If the action was performed using the credentials for your Amazon Web Services account, the details of
     *         your account.
     */

    public UserIdentityRoot getRoot() {
        return this.root;
    }

    /**
     * <p>
     * If the action was performed using the credentials for your Amazon Web Services account, the details of your
     * account.
     * </p>
     * 
     * @param root
     *        If the action was performed using the credentials for your Amazon Web Services account, the details of
     *        your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentity withRoot(UserIdentityRoot root) {
        setRoot(root);
        return this;
    }

    /**
     * <p>
     * The type of entity that performed the action.
     * </p>
     * 
     * @param type
     *        The type of entity that performed the action.
     * @see UserIdentityType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of entity that performed the action.
     * </p>
     * 
     * @return The type of entity that performed the action.
     * @see UserIdentityType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of entity that performed the action.
     * </p>
     * 
     * @param type
     *        The type of entity that performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserIdentityType
     */

    public UserIdentity withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of entity that performed the action.
     * </p>
     * 
     * @param type
     *        The type of entity that performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserIdentityType
     */

    public UserIdentity withType(UserIdentityType type) {
        this.type = type.toString();
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
        if (getAssumedRole() != null)
            sb.append("AssumedRole: ").append(getAssumedRole()).append(",");
        if (getAwsAccount() != null)
            sb.append("AwsAccount: ").append(getAwsAccount()).append(",");
        if (getAwsService() != null)
            sb.append("AwsService: ").append(getAwsService()).append(",");
        if (getFederatedUser() != null)
            sb.append("FederatedUser: ").append(getFederatedUser()).append(",");
        if (getIamUser() != null)
            sb.append("IamUser: ").append(getIamUser()).append(",");
        if (getRoot() != null)
            sb.append("Root: ").append(getRoot()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdentity == false)
            return false;
        UserIdentity other = (UserIdentity) obj;
        if (other.getAssumedRole() == null ^ this.getAssumedRole() == null)
            return false;
        if (other.getAssumedRole() != null && other.getAssumedRole().equals(this.getAssumedRole()) == false)
            return false;
        if (other.getAwsAccount() == null ^ this.getAwsAccount() == null)
            return false;
        if (other.getAwsAccount() != null && other.getAwsAccount().equals(this.getAwsAccount()) == false)
            return false;
        if (other.getAwsService() == null ^ this.getAwsService() == null)
            return false;
        if (other.getAwsService() != null && other.getAwsService().equals(this.getAwsService()) == false)
            return false;
        if (other.getFederatedUser() == null ^ this.getFederatedUser() == null)
            return false;
        if (other.getFederatedUser() != null && other.getFederatedUser().equals(this.getFederatedUser()) == false)
            return false;
        if (other.getIamUser() == null ^ this.getIamUser() == null)
            return false;
        if (other.getIamUser() != null && other.getIamUser().equals(this.getIamUser()) == false)
            return false;
        if (other.getRoot() == null ^ this.getRoot() == null)
            return false;
        if (other.getRoot() != null && other.getRoot().equals(this.getRoot()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssumedRole() == null) ? 0 : getAssumedRole().hashCode());
        hashCode = prime * hashCode + ((getAwsAccount() == null) ? 0 : getAwsAccount().hashCode());
        hashCode = prime * hashCode + ((getAwsService() == null) ? 0 : getAwsService().hashCode());
        hashCode = prime * hashCode + ((getFederatedUser() == null) ? 0 : getFederatedUser().hashCode());
        hashCode = prime * hashCode + ((getIamUser() == null) ? 0 : getIamUser().hashCode());
        hashCode = prime * hashCode + ((getRoot() == null) ? 0 : getRoot().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UserIdentity clone() {
        try {
            return (UserIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UserIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
