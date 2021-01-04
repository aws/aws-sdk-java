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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/StartMonitoringMember" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMonitoringMemberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The account ID of the member account to try to enable.
     * </p>
     * <p>
     * The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @return The ARN of the behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMonitoringMemberRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The account ID of the member account to try to enable.
     * </p>
     * <p>
     * The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * 
     * @param accountId
     *        The account ID of the member account to try to enable.</p>
     *        <p>
     *        The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the member account to try to enable.
     * </p>
     * <p>
     * The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * 
     * @return The account ID of the member account to try to enable.</p>
     *         <p>
     *         The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the member account to try to enable.
     * </p>
     * <p>
     * The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     * </p>
     * 
     * @param accountId
     *        The account ID of the member account to try to enable.</p>
     *        <p>
     *        The account must be an invited member account with a status of <code>ACCEPTED_BUT_DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMonitoringMemberRequest withAccountId(String accountId) {
        setAccountId(accountId);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMonitoringMemberRequest == false)
            return false;
        StartMonitoringMemberRequest other = (StartMonitoringMemberRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public StartMonitoringMemberRequest clone() {
        return (StartMonitoringMemberRequest) super.clone();
    }

}
