/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/CreateMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the behavior graph to invite the member accounts to contribute their data to.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * Customized message text to include in the invitation email message to the invited member accounts.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the
     * account list contains the account identifier and the AWS account root user email address.
     * </p>
     */
    private java.util.List<Account> accounts;

    /**
     * <p>
     * The ARN of the behavior graph to invite the member accounts to contribute their data to.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph to invite the member accounts to contribute their data to.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph to invite the member accounts to contribute their data to.
     * </p>
     * 
     * @return The ARN of the behavior graph to invite the member accounts to contribute their data to.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph to invite the member accounts to contribute their data to.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph to invite the member accounts to contribute their data to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * Customized message text to include in the invitation email message to the invited member accounts.
     * </p>
     * 
     * @param message
     *        Customized message text to include in the invitation email message to the invited member accounts.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Customized message text to include in the invitation email message to the invited member accounts.
     * </p>
     * 
     * @return Customized message text to include in the invitation email message to the invited member accounts.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Customized message text to include in the invitation email message to the invited member accounts.
     * </p>
     * 
     * @param message
     *        Customized message text to include in the invitation email message to the invited member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the
     * account list contains the account identifier and the AWS account root user email address.
     * </p>
     * 
     * @return The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited
     *         account, the account list contains the account identifier and the AWS account root user email address.
     */

    public java.util.List<Account> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the
     * account list contains the account identifier and the AWS account root user email address.
     * </p>
     * 
     * @param accounts
     *        The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited
     *        account, the account list contains the account identifier and the AWS account root user email address.
     */

    public void setAccounts(java.util.Collection<Account> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<Account>(accounts);
    }

    /**
     * <p>
     * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the
     * account list contains the account identifier and the AWS account root user email address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited
     *        account, the account list contains the account identifier and the AWS account root user email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withAccounts(Account... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<Account>(accounts.length));
        }
        for (Account ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the
     * account list contains the account identifier and the AWS account root user email address.
     * </p>
     * 
     * @param accounts
     *        The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited
     *        account, the account list contains the account identifier and the AWS account root user email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withAccounts(java.util.Collection<Account> accounts) {
        setAccounts(accounts);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembersRequest == false)
            return false;
        CreateMembersRequest other = (CreateMembersRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        return hashCode;
    }

    @Override
    public CreateMembersRequest clone() {
        return (CreateMembersRequest) super.clone();
    }

}
