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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the number of open reactive insights, the number of open proactive insights, and the number of metrics
 * analyzed in your Amazon Web Services account. Use these numbers to gauge the health of operations in your Amazon Web
 * Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/AccountHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account, including the number of open
     * proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     * </p>
     */
    private AccountInsightHealth insight;

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountHealth withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account, including the number of open
     * proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     * </p>
     * 
     * @param insight
     *        Information about the health of the Amazon Web Services resources in your account, including the number of
     *        open proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     */

    public void setInsight(AccountInsightHealth insight) {
        this.insight = insight;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account, including the number of open
     * proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     * </p>
     * 
     * @return Information about the health of the Amazon Web Services resources in your account, including the number
     *         of open proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     */

    public AccountInsightHealth getInsight() {
        return this.insight;
    }

    /**
     * <p>
     * Information about the health of the Amazon Web Services resources in your account, including the number of open
     * proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     * </p>
     * 
     * @param insight
     *        Information about the health of the Amazon Web Services resources in your account, including the number of
     *        open proactive, open reactive insights, and the Mean Time to Recover (MTTR) of closed insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountHealth withInsight(AccountInsightHealth insight) {
        setInsight(insight);
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
        if (getInsight() != null)
            sb.append("Insight: ").append(getInsight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountHealth == false)
            return false;
        AccountHealth other = (AccountHealth) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getInsight() == null ^ this.getInsight() == null)
            return false;
        if (other.getInsight() != null && other.getInsight().equals(this.getInsight()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getInsight() == null) ? 0 : getInsight().hashCode());
        return hashCode;
    }

    @Override
    public AccountHealth clone() {
        try {
            return (AccountHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.AccountHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
