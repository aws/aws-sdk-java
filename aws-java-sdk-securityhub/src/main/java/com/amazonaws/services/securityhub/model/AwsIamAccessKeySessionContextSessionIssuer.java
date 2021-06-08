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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the entity that created the session.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsIamAccessKeySessionContextSessionIssuer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamAccessKeySessionContextSessionIssuer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of principal (user, role, or group) that created the session.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The principal ID of the principal (user, role, or group) that created the session.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * The ARN of the session.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The identifier of the AWS account that created the session.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The name of the principal that created the session.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The type of principal (user, role, or group) that created the session.
     * </p>
     * 
     * @param type
     *        The type of principal (user, role, or group) that created the session.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of principal (user, role, or group) that created the session.
     * </p>
     * 
     * @return The type of principal (user, role, or group) that created the session.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of principal (user, role, or group) that created the session.
     * </p>
     * 
     * @param type
     *        The type of principal (user, role, or group) that created the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextSessionIssuer withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The principal ID of the principal (user, role, or group) that created the session.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the principal (user, role, or group) that created the session.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * The principal ID of the principal (user, role, or group) that created the session.
     * </p>
     * 
     * @return The principal ID of the principal (user, role, or group) that created the session.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * The principal ID of the principal (user, role, or group) that created the session.
     * </p>
     * 
     * @param principalId
     *        The principal ID of the principal (user, role, or group) that created the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextSessionIssuer withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * The ARN of the session.
     * </p>
     * 
     * @param arn
     *        The ARN of the session.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the session.
     * </p>
     * 
     * @return The ARN of the session.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the session.
     * </p>
     * 
     * @param arn
     *        The ARN of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextSessionIssuer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS account that created the session.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account that created the session.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that created the session.
     * </p>
     * 
     * @return The identifier of the AWS account that created the session.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The identifier of the AWS account that created the session.
     * </p>
     * 
     * @param accountId
     *        The identifier of the AWS account that created the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextSessionIssuer withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The name of the principal that created the session.
     * </p>
     * 
     * @param userName
     *        The name of the principal that created the session.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the principal that created the session.
     * </p>
     * 
     * @return The name of the principal that created the session.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the principal that created the session.
     * </p>
     * 
     * @param userName
     *        The name of the principal that created the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIamAccessKeySessionContextSessionIssuer withUserName(String userName) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
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

        if (obj instanceof AwsIamAccessKeySessionContextSessionIssuer == false)
            return false;
        AwsIamAccessKeySessionContextSessionIssuer other = (AwsIamAccessKeySessionContextSessionIssuer) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public AwsIamAccessKeySessionContextSessionIssuer clone() {
        try {
            return (AwsIamAccessKeySessionContextSessionIssuer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsIamAccessKeySessionContextSessionIssuerMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
