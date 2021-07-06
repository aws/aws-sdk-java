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
 * Provides information about the source and type of temporary security credentials that were issued to an entity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SessionIssuer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionIssuer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser, or Role.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value is null if the credentials were
     * obtained from a root account that doesn't have an alias.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     *        credentials.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     *         credentials.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     * credentials.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that owns the entity that was used to get the
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionIssuer withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the
     *        credentials.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the
     *         credentials.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the credentials.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the source account, IAM user, or role that was used to get the
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionIssuer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the entity that was used to get the credentials.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     * 
     * @return The unique identifier for the entity that was used to get the credentials.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The unique identifier for the entity that was used to get the credentials.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the entity that was used to get the credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionIssuer withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser, or Role.
     * </p>
     * 
     * @param type
     *        The source of the temporary security credentials, such as Root, IAMUser, or Role.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser, or Role.
     * </p>
     * 
     * @return The source of the temporary security credentials, such as Root, IAMUser, or Role.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The source of the temporary security credentials, such as Root, IAMUser, or Role.
     * </p>
     * 
     * @param type
     *        The source of the temporary security credentials, such as Root, IAMUser, or Role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionIssuer withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value is null if the credentials were
     * obtained from a root account that doesn't have an alias.
     * </p>
     * 
     * @param userName
     *        The name or alias of the user or role that issued the session. This value is null if the credentials were
     *        obtained from a root account that doesn't have an alias.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value is null if the credentials were
     * obtained from a root account that doesn't have an alias.
     * </p>
     * 
     * @return The name or alias of the user or role that issued the session. This value is null if the credentials were
     *         obtained from a root account that doesn't have an alias.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name or alias of the user or role that issued the session. This value is null if the credentials were
     * obtained from a root account that doesn't have an alias.
     * </p>
     * 
     * @param userName
     *        The name or alias of the user or role that issued the session. This value is null if the credentials were
     *        obtained from a root account that doesn't have an alias.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionIssuer withUserName(String userName) {
        setUserName(userName);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionIssuer == false)
            return false;
        SessionIssuer other = (SessionIssuer) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public SessionIssuer clone() {
        try {
            return (SessionIssuer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.SessionIssuerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
