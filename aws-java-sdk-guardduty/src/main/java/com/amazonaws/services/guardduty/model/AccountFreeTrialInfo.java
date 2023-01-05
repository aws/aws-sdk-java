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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details of the GuardDuty member account that uses a free trial service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AccountFreeTrialInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountFreeTrialInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account identifier of the GuardDuty member account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Describes the data source enabled for the GuardDuty member account.
     * </p>
     */
    private DataSourcesFreeTrial dataSources;

    /**
     * <p>
     * The account identifier of the GuardDuty member account.
     * </p>
     * 
     * @param accountId
     *        The account identifier of the GuardDuty member account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account identifier of the GuardDuty member account.
     * </p>
     * 
     * @return The account identifier of the GuardDuty member account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account identifier of the GuardDuty member account.
     * </p>
     * 
     * @param accountId
     *        The account identifier of the GuardDuty member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFreeTrialInfo withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Describes the data source enabled for the GuardDuty member account.
     * </p>
     * 
     * @param dataSources
     *        Describes the data source enabled for the GuardDuty member account.
     */

    public void setDataSources(DataSourcesFreeTrial dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes the data source enabled for the GuardDuty member account.
     * </p>
     * 
     * @return Describes the data source enabled for the GuardDuty member account.
     */

    public DataSourcesFreeTrial getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes the data source enabled for the GuardDuty member account.
     * </p>
     * 
     * @param dataSources
     *        Describes the data source enabled for the GuardDuty member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountFreeTrialInfo withDataSources(DataSourcesFreeTrial dataSources) {
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

        if (obj instanceof AccountFreeTrialInfo == false)
            return false;
        AccountFreeTrialInfo other = (AccountFreeTrialInfo) obj;
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
    public AccountFreeTrialInfo clone() {
        try {
            return (AccountFreeTrialInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.AccountFreeTrialInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
