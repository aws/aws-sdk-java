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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the delegated administrator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/DelegatedAdministrator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelegatedAdministrator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of the delegated administrator's account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The email address that is associated with the delegated administrator's AWS account.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The friendly name of the delegated administrator's account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the delegated administrator's account in the organization.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The method by which the delegated administrator's account joined the organization.
     * </p>
     */
    private String joinedMethod;
    /**
     * <p>
     * The date when the delegated administrator's account became a part of the organization.
     * </p>
     */
    private java.util.Date joinedTimestamp;
    /**
     * <p>
     * The date when the account was made a delegated administrator.
     * </p>
     */
    private java.util.Date delegationEnabledDate;

    /**
     * <p>
     * The unique identifier (ID) of the delegated administrator's account.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the delegated administrator's account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the delegated administrator's account.
     * </p>
     * 
     * @return The unique identifier (ID) of the delegated administrator's account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the delegated administrator's account.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the delegated administrator's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdministrator withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the delegated administrator's account.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the delegated administrator's account.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delegated administrator's account.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the delegated administrator's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdministrator withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The email address that is associated with the delegated administrator's AWS account.
     * </p>
     * 
     * @param email
     *        The email address that is associated with the delegated administrator's AWS account.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address that is associated with the delegated administrator's AWS account.
     * </p>
     * 
     * @return The email address that is associated with the delegated administrator's AWS account.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address that is associated with the delegated administrator's AWS account.
     * </p>
     * 
     * @param email
     *        The email address that is associated with the delegated administrator's AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdministrator withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The friendly name of the delegated administrator's account.
     * </p>
     * 
     * @param name
     *        The friendly name of the delegated administrator's account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the delegated administrator's account.
     * </p>
     * 
     * @return The friendly name of the delegated administrator's account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the delegated administrator's account.
     * </p>
     * 
     * @param name
     *        The friendly name of the delegated administrator's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdministrator withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the delegated administrator's account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the delegated administrator's account in the organization.
     * @see AccountStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the delegated administrator's account in the organization.
     * </p>
     * 
     * @return The status of the delegated administrator's account in the organization.
     * @see AccountStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the delegated administrator's account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the delegated administrator's account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountStatus
     */

    public DelegatedAdministrator withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the delegated administrator's account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the delegated administrator's account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountStatus
     */

    public DelegatedAdministrator withStatus(AccountStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The method by which the delegated administrator's account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the delegated administrator's account joined the organization.
     * @see AccountJoinedMethod
     */

    public void setJoinedMethod(String joinedMethod) {
        this.joinedMethod = joinedMethod;
    }

    /**
     * <p>
     * The method by which the delegated administrator's account joined the organization.
     * </p>
     * 
     * @return The method by which the delegated administrator's account joined the organization.
     * @see AccountJoinedMethod
     */

    public String getJoinedMethod() {
        return this.joinedMethod;
    }

    /**
     * <p>
     * The method by which the delegated administrator's account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the delegated administrator's account joined the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountJoinedMethod
     */

    public DelegatedAdministrator withJoinedMethod(String joinedMethod) {
        setJoinedMethod(joinedMethod);
        return this;
    }

    /**
     * <p>
     * The method by which the delegated administrator's account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the delegated administrator's account joined the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountJoinedMethod
     */

    public DelegatedAdministrator withJoinedMethod(AccountJoinedMethod joinedMethod) {
        this.joinedMethod = joinedMethod.toString();
        return this;
    }

    /**
     * <p>
     * The date when the delegated administrator's account became a part of the organization.
     * </p>
     * 
     * @param joinedTimestamp
     *        The date when the delegated administrator's account became a part of the organization.
     */

    public void setJoinedTimestamp(java.util.Date joinedTimestamp) {
        this.joinedTimestamp = joinedTimestamp;
    }

    /**
     * <p>
     * The date when the delegated administrator's account became a part of the organization.
     * </p>
     * 
     * @return The date when the delegated administrator's account became a part of the organization.
     */

    public java.util.Date getJoinedTimestamp() {
        return this.joinedTimestamp;
    }

    /**
     * <p>
     * The date when the delegated administrator's account became a part of the organization.
     * </p>
     * 
     * @param joinedTimestamp
     *        The date when the delegated administrator's account became a part of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdministrator withJoinedTimestamp(java.util.Date joinedTimestamp) {
        setJoinedTimestamp(joinedTimestamp);
        return this;
    }

    /**
     * <p>
     * The date when the account was made a delegated administrator.
     * </p>
     * 
     * @param delegationEnabledDate
     *        The date when the account was made a delegated administrator.
     */

    public void setDelegationEnabledDate(java.util.Date delegationEnabledDate) {
        this.delegationEnabledDate = delegationEnabledDate;
    }

    /**
     * <p>
     * The date when the account was made a delegated administrator.
     * </p>
     * 
     * @return The date when the account was made a delegated administrator.
     */

    public java.util.Date getDelegationEnabledDate() {
        return this.delegationEnabledDate;
    }

    /**
     * <p>
     * The date when the account was made a delegated administrator.
     * </p>
     * 
     * @param delegationEnabledDate
     *        The date when the account was made a delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdministrator withDelegationEnabledDate(java.util.Date delegationEnabledDate) {
        setDelegationEnabledDate(delegationEnabledDate);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getJoinedMethod() != null)
            sb.append("JoinedMethod: ").append(getJoinedMethod()).append(",");
        if (getJoinedTimestamp() != null)
            sb.append("JoinedTimestamp: ").append(getJoinedTimestamp()).append(",");
        if (getDelegationEnabledDate() != null)
            sb.append("DelegationEnabledDate: ").append(getDelegationEnabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegatedAdministrator == false)
            return false;
        DelegatedAdministrator other = (DelegatedAdministrator) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getJoinedMethod() == null ^ this.getJoinedMethod() == null)
            return false;
        if (other.getJoinedMethod() != null && other.getJoinedMethod().equals(this.getJoinedMethod()) == false)
            return false;
        if (other.getJoinedTimestamp() == null ^ this.getJoinedTimestamp() == null)
            return false;
        if (other.getJoinedTimestamp() != null && other.getJoinedTimestamp().equals(this.getJoinedTimestamp()) == false)
            return false;
        if (other.getDelegationEnabledDate() == null ^ this.getDelegationEnabledDate() == null)
            return false;
        if (other.getDelegationEnabledDate() != null && other.getDelegationEnabledDate().equals(this.getDelegationEnabledDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getJoinedMethod() == null) ? 0 : getJoinedMethod().hashCode());
        hashCode = prime * hashCode + ((getJoinedTimestamp() == null) ? 0 : getJoinedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDelegationEnabledDate() == null) ? 0 : getDelegationEnabledDate().hashCode());
        return hashCode;
    }

    @Override
    public DelegatedAdministrator clone() {
        try {
            return (DelegatedAdministrator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.DelegatedAdministratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
