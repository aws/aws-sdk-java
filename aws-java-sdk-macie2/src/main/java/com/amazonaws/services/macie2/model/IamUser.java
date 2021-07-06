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
 * Provides information about an Identity and Access Management (IAM) user who performed an action on an affected
 * resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/IamUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IamUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that's associated with the IAM user who performed the
     * action.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN contains
     * the name of the user who performed the action.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the IAM user who performed the action.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The user name of the IAM user who performed the action.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that's associated with the IAM user who performed the
     * action.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that's associated with the IAM user who
     *        performed the action.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that's associated with the IAM user who performed the
     * action.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account that's associated with the IAM user who
     *         performed the action.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account that's associated with the IAM user who performed the
     * action.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account that's associated with the IAM user who
     *        performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamUser withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN contains
     * the name of the user who performed the action.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN
     *        contains the name of the user who performed the action.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN contains
     * the name of the user who performed the action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN
     *         contains the name of the user who performed the action.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN contains
     * the name of the user who performed the action.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the principal that performed the action. The last section of the ARN
     *        contains the name of the user who performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamUser withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the IAM user who performed the action.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the IAM user who performed the action.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The unique identifier for the IAM user who performed the action.
     * </p>
     * 
     * @return The unique identifier for the IAM user who performed the action.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The unique identifier for the IAM user who performed the action.
     * </p>
     * 
     * @param principalId
     *        The unique identifier for the IAM user who performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamUser withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The user name of the IAM user who performed the action.
     * </p>
     * 
     * @param userName
     *        The user name of the IAM user who performed the action.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name of the IAM user who performed the action.
     * </p>
     * 
     * @return The user name of the IAM user who performed the action.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name of the IAM user who performed the action.
     * </p>
     * 
     * @param userName
     *        The user name of the IAM user who performed the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IamUser withUserName(String userName) {
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

        if (obj instanceof IamUser == false)
            return false;
        IamUser other = (IamUser) obj;
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
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public IamUser clone() {
        try {
            return (IamUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.IamUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
