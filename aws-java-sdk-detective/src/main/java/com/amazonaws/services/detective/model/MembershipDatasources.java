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
 * Details on data source packages for members of the behavior graph.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/MembershipDatasources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipDatasources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account identifier of the Amazon Web Services account.
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
     * Details on when a data source package was added to a behavior graph.
     * </p>
     */
    private java.util.Map<String, java.util.Map<String, TimestampForCollection>> datasourcePackageIngestHistory;

    /**
     * <p>
     * The account identifier of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The account identifier of the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account identifier of the Amazon Web Services account.
     * </p>
     * 
     * @return The account identifier of the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account identifier of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The account identifier of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipDatasources withAccountId(String accountId) {
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

    public MembershipDatasources withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * Details on when a data source package was added to a behavior graph.
     * </p>
     * 
     * @return Details on when a data source package was added to a behavior graph.
     */

    public java.util.Map<String, java.util.Map<String, TimestampForCollection>> getDatasourcePackageIngestHistory() {
        return datasourcePackageIngestHistory;
    }

    /**
     * <p>
     * Details on when a data source package was added to a behavior graph.
     * </p>
     * 
     * @param datasourcePackageIngestHistory
     *        Details on when a data source package was added to a behavior graph.
     */

    public void setDatasourcePackageIngestHistory(java.util.Map<String, java.util.Map<String, TimestampForCollection>> datasourcePackageIngestHistory) {
        this.datasourcePackageIngestHistory = datasourcePackageIngestHistory;
    }

    /**
     * <p>
     * Details on when a data source package was added to a behavior graph.
     * </p>
     * 
     * @param datasourcePackageIngestHistory
     *        Details on when a data source package was added to a behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipDatasources withDatasourcePackageIngestHistory(
            java.util.Map<String, java.util.Map<String, TimestampForCollection>> datasourcePackageIngestHistory) {
        setDatasourcePackageIngestHistory(datasourcePackageIngestHistory);
        return this;
    }

    /**
     * Add a single DatasourcePackageIngestHistory entry
     *
     * @see MembershipDatasources#withDatasourcePackageIngestHistory
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MembershipDatasources addDatasourcePackageIngestHistoryEntry(String key, java.util.Map<String, TimestampForCollection> value) {
        if (null == this.datasourcePackageIngestHistory) {
            this.datasourcePackageIngestHistory = new java.util.HashMap<String, java.util.Map<String, TimestampForCollection>>();
        }
        if (this.datasourcePackageIngestHistory.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.datasourcePackageIngestHistory.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DatasourcePackageIngestHistory.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MembershipDatasources clearDatasourcePackageIngestHistoryEntries() {
        this.datasourcePackageIngestHistory = null;
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
        if (getDatasourcePackageIngestHistory() != null)
            sb.append("DatasourcePackageIngestHistory: ").append(getDatasourcePackageIngestHistory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MembershipDatasources == false)
            return false;
        MembershipDatasources other = (MembershipDatasources) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getDatasourcePackageIngestHistory() == null ^ this.getDatasourcePackageIngestHistory() == null)
            return false;
        if (other.getDatasourcePackageIngestHistory() != null
                && other.getDatasourcePackageIngestHistory().equals(this.getDatasourcePackageIngestHistory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getDatasourcePackageIngestHistory() == null) ? 0 : getDatasourcePackageIngestHistory().hashCode());
        return hashCode;
    }

    @Override
    public MembershipDatasources clone() {
        try {
            return (MembershipDatasources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.MembershipDatasourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
