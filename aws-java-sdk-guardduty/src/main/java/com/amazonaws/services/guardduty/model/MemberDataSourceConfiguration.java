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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on which data sources are enabled for a member account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/MemberDataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberDataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID for the member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Contains information on the status of data sources for the account.
     * </p>
     */
    private DataSourceConfigurationsResult dataSources;

    /**
     * <p>
     * The account ID for the member account.
     * </p>
     * 
     * @param accountId
     *        The account ID for the member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID for the member account.
     * </p>
     * 
     * @return The account ID for the member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID for the member account.
     * </p>
     * 
     * @param accountId
     *        The account ID for the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDataSourceConfiguration withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Contains information on the status of data sources for the account.
     * </p>
     * 
     * @param dataSources
     *        Contains information on the status of data sources for the account.
     */

    public void setDataSources(DataSourceConfigurationsResult dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Contains information on the status of data sources for the account.
     * </p>
     * 
     * @return Contains information on the status of data sources for the account.
     */

    public DataSourceConfigurationsResult getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Contains information on the status of data sources for the account.
     * </p>
     * 
     * @param dataSources
     *        Contains information on the status of data sources for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberDataSourceConfiguration withDataSources(DataSourceConfigurationsResult dataSources) {
        setDataSources(dataSources);
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
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberDataSourceConfiguration == false)
            return false;
        MemberDataSourceConfiguration other = (MemberDataSourceConfiguration) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        return hashCode;
    }

    @Override
    public MemberDataSourceConfiguration clone() {
        try {
            return (MemberDataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.MemberDataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
