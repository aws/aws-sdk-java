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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Detective administrator account for an organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/Administrator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Administrator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account identifier of the Detective administrator account for the organization.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     */
    private java.util.Date delegationTime;

    /**
     * <p>
     * The Amazon Web Services account identifier of the Detective administrator account for the organization.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account identifier of the Detective administrator account for the organization.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the Detective administrator account for the organization.
     * </p>
     * 
     * @return The Amazon Web Services account identifier of the Detective administrator account for the organization.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account identifier of the Detective administrator account for the organization.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account identifier of the Detective administrator account for the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Administrator withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the organization behavior graph.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     * 
     * @return The ARN of the organization behavior graph.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the organization behavior graph.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the organization behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Administrator withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param delegationTime
     *        The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public void setDelegationTime(java.util.Date delegationTime) {
        this.delegationTime = delegationTime;
    }

    /**
     * <p>
     * The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @return The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted
     *         string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     */

    public java.util.Date getDelegationTime() {
        return this.delegationTime;
    }

    /**
     * <p>
     * The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted string.
     * For example, <code>2021-08-18T16:35:56.284Z</code>.
     * </p>
     * 
     * @param delegationTime
     *        The date and time when the Detective administrator account was enabled. The value is an ISO8601 formatted
     *        string. For example, <code>2021-08-18T16:35:56.284Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Administrator withDelegationTime(java.util.Date delegationTime) {
        setDelegationTime(delegationTime);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getDelegationTime() != null)
            sb.append("DelegationTime: ").append(getDelegationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Administrator == false)
            return false;
        Administrator other = (Administrator) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getDelegationTime() == null ^ this.getDelegationTime() == null)
            return false;
        if (other.getDelegationTime() != null && other.getDelegationTime().equals(this.getDelegationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getDelegationTime() == null) ? 0 : getDelegationTime().hashCode());
        return hashCode;
    }

    @Override
    public Administrator clone() {
        try {
            return (Administrator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.AdministratorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
