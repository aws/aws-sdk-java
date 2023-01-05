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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the Amazon Inspector delegated administrator for your organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DelegatedAdmin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DelegatedAdmin implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The status of the Amazon Inspector delegated administrator.
     * </p>
     */
    private String relationshipStatus;

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the Amazon Inspector delegated administrator for your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DelegatedAdmin withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the Amazon Inspector delegated administrator.
     * @see RelationshipStatus
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @return The status of the Amazon Inspector delegated administrator.
     * @see RelationshipStatus
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The status of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the Amazon Inspector delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public DelegatedAdmin withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the Amazon Inspector delegated administrator.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationshipStatus
     */

    public DelegatedAdmin withRelationshipStatus(RelationshipStatus relationshipStatus) {
        this.relationshipStatus = relationshipStatus.toString();
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
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegatedAdmin == false)
            return false;
        DelegatedAdmin other = (DelegatedAdmin) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        return hashCode;
    }

    @Override
    public DelegatedAdmin clone() {
        try {
            return (DelegatedAdmin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.DelegatedAdminMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
