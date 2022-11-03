/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountSubscriptionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your Amazon QuickSight account name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The edition of Amazon QuickSight that your account is using.
     * </p>
     * </li>
     * <li>
     * <p>
     * The notification email address that is associated with the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The authentication type of the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The status of the Amazon QuickSight account's subscription.
     * </p>
     * </li>
     * </ul>
     */
    private AccountInfo accountInfo;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A structure that contains the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your Amazon QuickSight account name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The edition of Amazon QuickSight that your account is using.
     * </p>
     * </li>
     * <li>
     * <p>
     * The notification email address that is associated with the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The authentication type of the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The status of the Amazon QuickSight account's subscription.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountInfo
     *        A structure that contains the following elements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Your Amazon QuickSight account name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The edition of Amazon QuickSight that your account is using.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The notification email address that is associated with the Amazon QuickSight account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The authentication type of the Amazon QuickSight account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The status of the Amazon QuickSight account's subscription.
     *        </p>
     *        </li>
     */

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    /**
     * <p>
     * A structure that contains the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your Amazon QuickSight account name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The edition of Amazon QuickSight that your account is using.
     * </p>
     * </li>
     * <li>
     * <p>
     * The notification email address that is associated with the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The authentication type of the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The status of the Amazon QuickSight account's subscription.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A structure that contains the following elements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Your Amazon QuickSight account name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The edition of Amazon QuickSight that your account is using.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The notification email address that is associated with the Amazon QuickSight account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The authentication type of the Amazon QuickSight account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The status of the Amazon QuickSight account's subscription.
     *         </p>
     *         </li>
     */

    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /**
     * <p>
     * A structure that contains the following elements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Your Amazon QuickSight account name.
     * </p>
     * </li>
     * <li>
     * <p>
     * The edition of Amazon QuickSight that your account is using.
     * </p>
     * </li>
     * <li>
     * <p>
     * The notification email address that is associated with the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The authentication type of the Amazon QuickSight account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The status of the Amazon QuickSight account's subscription.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountInfo
     *        A structure that contains the following elements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Your Amazon QuickSight account name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The edition of Amazon QuickSight that your account is using.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The notification email address that is associated with the Amazon QuickSight account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The authentication type of the Amazon QuickSight account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The status of the Amazon QuickSight account's subscription.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountSubscriptionResult withAccountInfo(AccountInfo accountInfo) {
        setAccountInfo(accountInfo);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountSubscriptionResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountSubscriptionResult withRequestId(String requestId) {
        setRequestId(requestId);
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
        if (getAccountInfo() != null)
            sb.append("AccountInfo: ").append(getAccountInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountSubscriptionResult == false)
            return false;
        DescribeAccountSubscriptionResult other = (DescribeAccountSubscriptionResult) obj;
        if (other.getAccountInfo() == null ^ this.getAccountInfo() == null)
            return false;
        if (other.getAccountInfo() != null && other.getAccountInfo().equals(this.getAccountInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountInfo() == null) ? 0 : getAccountInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountSubscriptionResult clone() {
        try {
            return (DescribeAccountSubscriptionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
