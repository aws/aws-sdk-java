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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAccountSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight that you
     * subscribed to (Standard or Enterprise) and the notification email for the QuickSight subscription. The QuickSight
     * console, the QuickSight subscription is sometimes referred to as a QuickSight "account" even though it's
     * technically not an account by itself. Instead, it's a subscription to the QuickSight service for your AWS
     * account. The edition that you subscribe to applies to QuickSight in every AWS Region where you use it.
     * </p>
     */
    private AccountSettings accountSettings;
    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight that you
     * subscribed to (Standard or Enterprise) and the notification email for the QuickSight subscription. The QuickSight
     * console, the QuickSight subscription is sometimes referred to as a QuickSight "account" even though it's
     * technically not an account by itself. Instead, it's a subscription to the QuickSight service for your AWS
     * account. The edition that you subscribe to applies to QuickSight in every AWS Region where you use it.
     * </p>
     * 
     * @param accountSettings
     *        The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight
     *        that you subscribed to (Standard or Enterprise) and the notification email for the QuickSight
     *        subscription. The QuickSight console, the QuickSight subscription is sometimes referred to as a QuickSight
     *        "account" even though it's technically not an account by itself. Instead, it's a subscription to the
     *        QuickSight service for your AWS account. The edition that you subscribe to applies to QuickSight in every
     *        AWS Region where you use it.
     */

    public void setAccountSettings(AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
    }

    /**
     * <p>
     * The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight that you
     * subscribed to (Standard or Enterprise) and the notification email for the QuickSight subscription. The QuickSight
     * console, the QuickSight subscription is sometimes referred to as a QuickSight "account" even though it's
     * technically not an account by itself. Instead, it's a subscription to the QuickSight service for your AWS
     * account. The edition that you subscribe to applies to QuickSight in every AWS Region where you use it.
     * </p>
     * 
     * @return The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight
     *         that you subscribed to (Standard or Enterprise) and the notification email for the QuickSight
     *         subscription. The QuickSight console, the QuickSight subscription is sometimes referred to as a
     *         QuickSight "account" even though it's technically not an account by itself. Instead, it's a subscription
     *         to the QuickSight service for your AWS account. The edition that you subscribe to applies to QuickSight
     *         in every AWS Region where you use it.
     */

    public AccountSettings getAccountSettings() {
        return this.accountSettings;
    }

    /**
     * <p>
     * The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight that you
     * subscribed to (Standard or Enterprise) and the notification email for the QuickSight subscription. The QuickSight
     * console, the QuickSight subscription is sometimes referred to as a QuickSight "account" even though it's
     * technically not an account by itself. Instead, it's a subscription to the QuickSight service for your AWS
     * account. The edition that you subscribe to applies to QuickSight in every AWS Region where you use it.
     * </p>
     * 
     * @param accountSettings
     *        The QuickSight settings for this AWS account. This information includes the edition of Amazon QuickSight
     *        that you subscribed to (Standard or Enterprise) and the notification email for the QuickSight
     *        subscription. The QuickSight console, the QuickSight subscription is sometimes referred to as a QuickSight
     *        "account" even though it's technically not an account by itself. Instead, it's a subscription to the
     *        QuickSight service for your AWS account. The edition that you subscribe to applies to QuickSight in every
     *        AWS Region where you use it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountSettingsResult withAccountSettings(AccountSettings accountSettings) {
        setAccountSettings(accountSettings);
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @return The AWS request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The AWS request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAccountSettingsResult withRequestId(String requestId) {
        setRequestId(requestId);
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

    public DescribeAccountSettingsResult withStatus(Integer status) {
        setStatus(status);
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
        if (getAccountSettings() != null)
            sb.append("AccountSettings: ").append(getAccountSettings()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountSettingsResult == false)
            return false;
        DescribeAccountSettingsResult other = (DescribeAccountSettingsResult) obj;
        if (other.getAccountSettings() == null ^ this.getAccountSettings() == null)
            return false;
        if (other.getAccountSettings() != null && other.getAccountSettings().equals(this.getAccountSettings()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountSettings() == null) ? 0 : getAccountSettings().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountSettingsResult clone() {
        try {
            return (DescribeAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
