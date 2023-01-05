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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The values for a manual Amazon RDS DB cluster snapshot attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/RdsDbClusterSnapshotAttributeValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsDbClusterSnapshotAttributeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the value
     * <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     * <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses the
     * existing shared <code>accountIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code> in
     * <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without any
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the value
     * <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     * <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses the
     * existing shared <code>accountIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code> in
     * <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without any
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the
     *         value <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied
     *         or restored by all Amazon Web Services accounts.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     *         <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses
     *         the existing shared <code>accountIds</code> for the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the access preview is for a new resource and you do not specify the specify the
     *         <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview
     *         considers the snapshot without any attributes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *         <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the value
     * <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     * <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses the
     * existing shared <code>accountIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code> in
     * <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without any
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountIds
     *        The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the
     *        value <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied
     *        or restored by all Amazon Web Services accounts.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     *        <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses
     *        the existing shared <code>accountIds</code> for the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code>
     *        in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without
     *        any attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *        <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     *        </p>
     *        </li>
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the value
     * <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     * <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses the
     * existing shared <code>accountIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code> in
     * <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without any
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the
     *        value <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied
     *        or restored by all Amazon Web Services accounts.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     *        <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses
     *        the existing shared <code>accountIds</code> for the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code>
     *        in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without
     *        any attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *        <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbClusterSnapshotAttributeValue withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the value
     * <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied or restored by
     * all Amazon Web Services accounts.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     * <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses the
     * existing shared <code>accountIds</code> for the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code> in
     * <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without any
     * attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     * <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param accountIds
     *        The Amazon Web Services account IDs that have access to the manual Amazon RDS DB cluster snapshot. If the
     *        value <code>all</code> is specified, then the Amazon RDS DB cluster snapshot is public and can be copied
     *        or restored by all Amazon Web Services accounts.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the configuration is for an existing Amazon RDS DB cluster snapshot and you do not specify the
     *        <code>accountIds</code> in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview uses
     *        the existing shared <code>accountIds</code> for the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the access preview is for a new resource and you do not specify the specify the <code>accountIds</code>
     *        in <code>RdsDbClusterSnapshotAttributeValue</code>, then the access preview considers the snapshot without
     *        any attributes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To propose deletion of existing shared <code>accountIds</code>, you can specify an empty list for
     *        <code>accountIds</code> in the <code>RdsDbClusterSnapshotAttributeValue</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsDbClusterSnapshotAttributeValue withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsDbClusterSnapshotAttributeValue == false)
            return false;
        RdsDbClusterSnapshotAttributeValue other = (RdsDbClusterSnapshotAttributeValue) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public RdsDbClusterSnapshotAttributeValue clone() {
        try {
            return (RdsDbClusterSnapshotAttributeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.RdsDbClusterSnapshotAttributeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
