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
 * Contains the result of GuardDuty usage. If a UsageStatisticType is provided the result for other types will be null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The usage statistic sum organized by account ID.
     * </p>
     */
    private java.util.List<UsageAccountResult> sumByAccount;
    /**
     * <p>
     * The usage statistic sum organized by on data source.
     * </p>
     */
    private java.util.List<UsageDataSourceResult> sumByDataSource;
    /**
     * <p>
     * The usage statistic sum organized by resource.
     * </p>
     */
    private java.util.List<UsageResourceResult> sumByResource;
    /**
     * <p>
     * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
     * </p>
     */
    private java.util.List<UsageResourceResult> topResources;

    /**
     * <p>
     * The usage statistic sum organized by account ID.
     * </p>
     * 
     * @return The usage statistic sum organized by account ID.
     */

    public java.util.List<UsageAccountResult> getSumByAccount() {
        return sumByAccount;
    }

    /**
     * <p>
     * The usage statistic sum organized by account ID.
     * </p>
     * 
     * @param sumByAccount
     *        The usage statistic sum organized by account ID.
     */

    public void setSumByAccount(java.util.Collection<UsageAccountResult> sumByAccount) {
        if (sumByAccount == null) {
            this.sumByAccount = null;
            return;
        }

        this.sumByAccount = new java.util.ArrayList<UsageAccountResult>(sumByAccount);
    }

    /**
     * <p>
     * The usage statistic sum organized by account ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSumByAccount(java.util.Collection)} or {@link #withSumByAccount(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sumByAccount
     *        The usage statistic sum organized by account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withSumByAccount(UsageAccountResult... sumByAccount) {
        if (this.sumByAccount == null) {
            setSumByAccount(new java.util.ArrayList<UsageAccountResult>(sumByAccount.length));
        }
        for (UsageAccountResult ele : sumByAccount) {
            this.sumByAccount.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The usage statistic sum organized by account ID.
     * </p>
     * 
     * @param sumByAccount
     *        The usage statistic sum organized by account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withSumByAccount(java.util.Collection<UsageAccountResult> sumByAccount) {
        setSumByAccount(sumByAccount);
        return this;
    }

    /**
     * <p>
     * The usage statistic sum organized by on data source.
     * </p>
     * 
     * @return The usage statistic sum organized by on data source.
     */

    public java.util.List<UsageDataSourceResult> getSumByDataSource() {
        return sumByDataSource;
    }

    /**
     * <p>
     * The usage statistic sum organized by on data source.
     * </p>
     * 
     * @param sumByDataSource
     *        The usage statistic sum organized by on data source.
     */

    public void setSumByDataSource(java.util.Collection<UsageDataSourceResult> sumByDataSource) {
        if (sumByDataSource == null) {
            this.sumByDataSource = null;
            return;
        }

        this.sumByDataSource = new java.util.ArrayList<UsageDataSourceResult>(sumByDataSource);
    }

    /**
     * <p>
     * The usage statistic sum organized by on data source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSumByDataSource(java.util.Collection)} or {@link #withSumByDataSource(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sumByDataSource
     *        The usage statistic sum organized by on data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withSumByDataSource(UsageDataSourceResult... sumByDataSource) {
        if (this.sumByDataSource == null) {
            setSumByDataSource(new java.util.ArrayList<UsageDataSourceResult>(sumByDataSource.length));
        }
        for (UsageDataSourceResult ele : sumByDataSource) {
            this.sumByDataSource.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The usage statistic sum organized by on data source.
     * </p>
     * 
     * @param sumByDataSource
     *        The usage statistic sum organized by on data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withSumByDataSource(java.util.Collection<UsageDataSourceResult> sumByDataSource) {
        setSumByDataSource(sumByDataSource);
        return this;
    }

    /**
     * <p>
     * The usage statistic sum organized by resource.
     * </p>
     * 
     * @return The usage statistic sum organized by resource.
     */

    public java.util.List<UsageResourceResult> getSumByResource() {
        return sumByResource;
    }

    /**
     * <p>
     * The usage statistic sum organized by resource.
     * </p>
     * 
     * @param sumByResource
     *        The usage statistic sum organized by resource.
     */

    public void setSumByResource(java.util.Collection<UsageResourceResult> sumByResource) {
        if (sumByResource == null) {
            this.sumByResource = null;
            return;
        }

        this.sumByResource = new java.util.ArrayList<UsageResourceResult>(sumByResource);
    }

    /**
     * <p>
     * The usage statistic sum organized by resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSumByResource(java.util.Collection)} or {@link #withSumByResource(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sumByResource
     *        The usage statistic sum organized by resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withSumByResource(UsageResourceResult... sumByResource) {
        if (this.sumByResource == null) {
            setSumByResource(new java.util.ArrayList<UsageResourceResult>(sumByResource.length));
        }
        for (UsageResourceResult ele : sumByResource) {
            this.sumByResource.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The usage statistic sum organized by resource.
     * </p>
     * 
     * @param sumByResource
     *        The usage statistic sum organized by resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withSumByResource(java.util.Collection<UsageResourceResult> sumByResource) {
        setSumByResource(sumByResource);
        return this;
    }

    /**
     * <p>
     * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
     * </p>
     * 
     * @return Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least
     *         expensive.
     */

    public java.util.List<UsageResourceResult> getTopResources() {
        return topResources;
    }

    /**
     * <p>
     * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
     * </p>
     * 
     * @param topResources
     *        Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least
     *        expensive.
     */

    public void setTopResources(java.util.Collection<UsageResourceResult> topResources) {
        if (topResources == null) {
            this.topResources = null;
            return;
        }

        this.topResources = new java.util.ArrayList<UsageResourceResult>(topResources);
    }

    /**
     * <p>
     * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTopResources(java.util.Collection)} or {@link #withTopResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param topResources
     *        Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least
     *        expensive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withTopResources(UsageResourceResult... topResources) {
        if (this.topResources == null) {
            setTopResources(new java.util.ArrayList<UsageResourceResult>(topResources.length));
        }
        for (UsageResourceResult ele : topResources) {
            this.topResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least expensive.
     * </p>
     * 
     * @param topResources
     *        Lists the top 50 resources that have generated the most GuardDuty usage, in order from most to least
     *        expensive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatistics withTopResources(java.util.Collection<UsageResourceResult> topResources) {
        setTopResources(topResources);
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
        if (getSumByAccount() != null)
            sb.append("SumByAccount: ").append(getSumByAccount()).append(",");
        if (getSumByDataSource() != null)
            sb.append("SumByDataSource: ").append(getSumByDataSource()).append(",");
        if (getSumByResource() != null)
            sb.append("SumByResource: ").append(getSumByResource()).append(",");
        if (getTopResources() != null)
            sb.append("TopResources: ").append(getTopResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageStatistics == false)
            return false;
        UsageStatistics other = (UsageStatistics) obj;
        if (other.getSumByAccount() == null ^ this.getSumByAccount() == null)
            return false;
        if (other.getSumByAccount() != null && other.getSumByAccount().equals(this.getSumByAccount()) == false)
            return false;
        if (other.getSumByDataSource() == null ^ this.getSumByDataSource() == null)
            return false;
        if (other.getSumByDataSource() != null && other.getSumByDataSource().equals(this.getSumByDataSource()) == false)
            return false;
        if (other.getSumByResource() == null ^ this.getSumByResource() == null)
            return false;
        if (other.getSumByResource() != null && other.getSumByResource().equals(this.getSumByResource()) == false)
            return false;
        if (other.getTopResources() == null ^ this.getTopResources() == null)
            return false;
        if (other.getTopResources() != null && other.getTopResources().equals(this.getTopResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSumByAccount() == null) ? 0 : getSumByAccount().hashCode());
        hashCode = prime * hashCode + ((getSumByDataSource() == null) ? 0 : getSumByDataSource().hashCode());
        hashCode = prime * hashCode + ((getSumByResource() == null) ? 0 : getSumByResource().hashCode());
        hashCode = prime * hashCode + ((getTopResources() == null) ? 0 : getTopResources().hashCode());
        return hashCode;
    }

    @Override
    public UsageStatistics clone() {
        try {
            return (UsageStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
