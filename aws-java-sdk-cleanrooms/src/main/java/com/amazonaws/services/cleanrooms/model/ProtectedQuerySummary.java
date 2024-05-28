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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The protected query summary for the objects listed by the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ProtectedQuerySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectedQuerySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the protected query.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ID for the membership that initiated the protected query.
     * </p>
     */
    private String membershipId;
    /**
     * <p>
     * The unique ARN for the membership that initiated the protected query.
     * </p>
     */
    private String membershipArn;
    /**
     * <p>
     * The time the protected query was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`, `FAILED`,
     * `SUCCESS`, `TIMED_OUT`.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique ID of the protected query.
     * </p>
     * 
     * @param id
     *        The unique ID of the protected query.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the protected query.
     * </p>
     * 
     * @return The unique ID of the protected query.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the protected query.
     * </p>
     * 
     * @param id
     *        The unique ID of the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ID for the membership that initiated the protected query.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the membership that initiated the protected query.
     */

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * <p>
     * The unique ID for the membership that initiated the protected query.
     * </p>
     * 
     * @return The unique ID for the membership that initiated the protected query.
     */

    public String getMembershipId() {
        return this.membershipId;
    }

    /**
     * <p>
     * The unique ID for the membership that initiated the protected query.
     * </p>
     * 
     * @param membershipId
     *        The unique ID for the membership that initiated the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySummary withMembershipId(String membershipId) {
        setMembershipId(membershipId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the membership that initiated the protected query.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the membership that initiated the protected query.
     */

    public void setMembershipArn(String membershipArn) {
        this.membershipArn = membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the membership that initiated the protected query.
     * </p>
     * 
     * @return The unique ARN for the membership that initiated the protected query.
     */

    public String getMembershipArn() {
        return this.membershipArn;
    }

    /**
     * <p>
     * The unique ARN for the membership that initiated the protected query.
     * </p>
     * 
     * @param membershipArn
     *        The unique ARN for the membership that initiated the protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySummary withMembershipArn(String membershipArn) {
        setMembershipArn(membershipArn);
        return this;
    }

    /**
     * <p>
     * The time the protected query was created.
     * </p>
     * 
     * @param createTime
     *        The time the protected query was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the protected query was created.
     * </p>
     * 
     * @return The time the protected query was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the protected query was created.
     * </p>
     * 
     * @param createTime
     *        The time the protected query was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectedQuerySummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`, `FAILED`,
     * `SUCCESS`, `TIMED_OUT`.
     * </p>
     * 
     * @param status
     *        The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`,
     *        `FAILED`, `SUCCESS`, `TIMED_OUT`.
     * @see ProtectedQueryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`, `FAILED`,
     * `SUCCESS`, `TIMED_OUT`.
     * </p>
     * 
     * @return The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`,
     *         `FAILED`, `SUCCESS`, `TIMED_OUT`.
     * @see ProtectedQueryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`, `FAILED`,
     * `SUCCESS`, `TIMED_OUT`.
     * </p>
     * 
     * @param status
     *        The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`,
     *        `FAILED`, `SUCCESS`, `TIMED_OUT`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryStatus
     */

    public ProtectedQuerySummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`, `FAILED`,
     * `SUCCESS`, `TIMED_OUT`.
     * </p>
     * 
     * @param status
     *        The status of the protected query. Value values are `SUBMITTED`, `STARTED`, `CANCELLED`, `CANCELLING`,
     *        `FAILED`, `SUCCESS`, `TIMED_OUT`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedQueryStatus
     */

    public ProtectedQuerySummary withStatus(ProtectedQueryStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMembershipId() != null)
            sb.append("MembershipId: ").append(getMembershipId()).append(",");
        if (getMembershipArn() != null)
            sb.append("MembershipArn: ").append(getMembershipArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
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

        if (obj instanceof ProtectedQuerySummary == false)
            return false;
        ProtectedQuerySummary other = (ProtectedQuerySummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMembershipId() == null ^ this.getMembershipId() == null)
            return false;
        if (other.getMembershipId() != null && other.getMembershipId().equals(this.getMembershipId()) == false)
            return false;
        if (other.getMembershipArn() == null ^ this.getMembershipArn() == null)
            return false;
        if (other.getMembershipArn() != null && other.getMembershipArn().equals(this.getMembershipArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMembershipId() == null) ? 0 : getMembershipId().hashCode());
        hashCode = prime * hashCode + ((getMembershipArn() == null) ? 0 : getMembershipArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ProtectedQuerySummary clone() {
        try {
            return (ProtectedQuerySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ProtectedQuerySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
