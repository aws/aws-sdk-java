/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyActivityStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyActivityStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only. You can
     * edit your audit policy only when the activity stream is unlocked or stopped.
     * </p>
     */
    private String auditPolicyState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     *        <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     *         <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     * <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the RDS for Oracle or Microsoft SQL Server DB instance. For example,
     *        <code>arn:aws:rds:us-east-1:12345667890:db:my-orcl-db</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyActivityStreamRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only. You can
     * edit your audit policy only when the activity stream is unlocked or stopped.
     * </p>
     * 
     * @param auditPolicyState
     *        The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only.
     *        You can edit your audit policy only when the activity stream is unlocked or stopped.
     * @see AuditPolicyState
     */

    public void setAuditPolicyState(String auditPolicyState) {
        this.auditPolicyState = auditPolicyState;
    }

    /**
     * <p>
     * The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only. You can
     * edit your audit policy only when the activity stream is unlocked or stopped.
     * </p>
     * 
     * @return The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only.
     *         You can edit your audit policy only when the activity stream is unlocked or stopped.
     * @see AuditPolicyState
     */

    public String getAuditPolicyState() {
        return this.auditPolicyState;
    }

    /**
     * <p>
     * The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only. You can
     * edit your audit policy only when the activity stream is unlocked or stopped.
     * </p>
     * 
     * @param auditPolicyState
     *        The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only.
     *        You can edit your audit policy only when the activity stream is unlocked or stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditPolicyState
     */

    public ModifyActivityStreamRequest withAuditPolicyState(String auditPolicyState) {
        setAuditPolicyState(auditPolicyState);
        return this;
    }

    /**
     * <p>
     * The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only. You can
     * edit your audit policy only when the activity stream is unlocked or stopped.
     * </p>
     * 
     * @param auditPolicyState
     *        The audit policy state. When a policy is unlocked, it is read/write. When it is locked, it is read-only.
     *        You can edit your audit policy only when the activity stream is unlocked or stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditPolicyState
     */

    public ModifyActivityStreamRequest withAuditPolicyState(AuditPolicyState auditPolicyState) {
        this.auditPolicyState = auditPolicyState.toString();
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getAuditPolicyState() != null)
            sb.append("AuditPolicyState: ").append(getAuditPolicyState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyActivityStreamRequest == false)
            return false;
        ModifyActivityStreamRequest other = (ModifyActivityStreamRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAuditPolicyState() == null ^ this.getAuditPolicyState() == null)
            return false;
        if (other.getAuditPolicyState() != null && other.getAuditPolicyState().equals(this.getAuditPolicyState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAuditPolicyState() == null) ? 0 : getAuditPolicyState().hashCode());
        return hashCode;
    }

    @Override
    public ModifyActivityStreamRequest clone() {
        return (ModifyActivityStreamRequest) super.clone();
    }

}
