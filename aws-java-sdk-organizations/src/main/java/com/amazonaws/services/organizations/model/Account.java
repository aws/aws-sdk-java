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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an AWS account that is a member of an organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/Account" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Account implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters that
     * represents a standard Internet email address.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     */
    private String joinedMethod;
    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     */
    private java.util.Date joinedTimestamp;

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @return The unique identifier (ID) of the account.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *         12 digits.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier (ID) of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly 12
     * digits.
     * </p>
     * 
     * @param id
     *        The unique identifier (ID) of the account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an account ID string requires exactly
     *        12 digits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the account.</p>
     *         <p>
     *         For more information about ARNs in Organizations, see <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *         >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the account.
     * </p>
     * <p>
     * For more information about ARNs in Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns">ARN
     * Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the account.</p>
     *        <p>
     *        For more information about ARNs in Organizations, see <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_permissions.html#orgs-permissions-arns"
     *        >ARN Formats Supported by Organizations</a> in the <i>AWS Organizations User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters that
     * represents a standard Internet email address.
     * </p>
     * 
     * @param email
     *        The email address associated with the AWS account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters that represents a standard Internet email address.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters that
     * represents a standard Internet email address.
     * </p>
     * 
     * @return The email address associated with the AWS account.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *         characters that represents a standard Internet email address.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address associated with the AWS account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of characters that
     * represents a standard Internet email address.
     * </p>
     * 
     * @param email
     *        The email address associated with the AWS account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for this parameter is a string of
     *        characters that represents a standard Internet email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @return The friendly name of the account.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter
     *         is a string of any of the characters in the ASCII character range.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name of the account.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is a
     * string of any of the characters in the ASCII character range.
     * </p>
     * 
     * @param name
     *        The friendly name of the account.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is used to validate this parameter is
     *        a string of any of the characters in the ASCII character range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the account in the organization.
     * @see AccountStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * 
     * @return The status of the account in the organization.
     * @see AccountStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountStatus
     */

    public Account withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the account in the organization.
     * @see AccountStatus
     */

    public void setStatus(AccountStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the account in the organization.
     * </p>
     * 
     * @param status
     *        The status of the account in the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountStatus
     */

    public Account withStatus(AccountStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the account joined the organization.
     * @see AccountJoinedMethod
     */

    public void setJoinedMethod(String joinedMethod) {
        this.joinedMethod = joinedMethod;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * 
     * @return The method by which the account joined the organization.
     * @see AccountJoinedMethod
     */

    public String getJoinedMethod() {
        return this.joinedMethod;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the account joined the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountJoinedMethod
     */

    public Account withJoinedMethod(String joinedMethod) {
        setJoinedMethod(joinedMethod);
        return this;
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the account joined the organization.
     * @see AccountJoinedMethod
     */

    public void setJoinedMethod(AccountJoinedMethod joinedMethod) {
        withJoinedMethod(joinedMethod);
    }

    /**
     * <p>
     * The method by which the account joined the organization.
     * </p>
     * 
     * @param joinedMethod
     *        The method by which the account joined the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountJoinedMethod
     */

    public Account withJoinedMethod(AccountJoinedMethod joinedMethod) {
        this.joinedMethod = joinedMethod.toString();
        return this;
    }

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     * 
     * @param joinedTimestamp
     *        The date the account became a part of the organization.
     */

    public void setJoinedTimestamp(java.util.Date joinedTimestamp) {
        this.joinedTimestamp = joinedTimestamp;
    }

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     * 
     * @return The date the account became a part of the organization.
     */

    public java.util.Date getJoinedTimestamp() {
        return this.joinedTimestamp;
    }

    /**
     * <p>
     * The date the account became a part of the organization.
     * </p>
     * 
     * @param joinedTimestamp
     *        The date the account became a part of the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Account withJoinedTimestamp(java.util.Date joinedTimestamp) {
        setJoinedTimestamp(joinedTimestamp);
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
            sb.append("JoinedTimestamp: ").append(getJoinedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Account == false)
            return false;
        Account other = (Account) obj;
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
        return hashCode;
    }

    @Override
    public Account clone() {
        try {
            return (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.AccountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
