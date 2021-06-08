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
 * Contains information about the criteria used to query usage statistics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UsageCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account IDs to aggregate usage statistics from.
     * </p>
     */
    private java.util.List<String> accountIds;
    /**
     * <p>
     * The data sources to aggregate usage statistics from.
     * </p>
     */
    private java.util.List<String> dataSources;
    /**
     * <p>
     * The resources to aggregate usage statistics from. Only accepts exact resource names.
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * The account IDs to aggregate usage statistics from.
     * </p>
     * 
     * @return The account IDs to aggregate usage statistics from.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The account IDs to aggregate usage statistics from.
     * </p>
     * 
     * @param accountIds
     *        The account IDs to aggregate usage statistics from.
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
     * The account IDs to aggregate usage statistics from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The account IDs to aggregate usage statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageCriteria withAccountIds(String... accountIds) {
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
     * The account IDs to aggregate usage statistics from.
     * </p>
     * 
     * @param accountIds
     *        The account IDs to aggregate usage statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageCriteria withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * The data sources to aggregate usage statistics from.
     * </p>
     * 
     * @return The data sources to aggregate usage statistics from.
     * @see DataSource
     */

    public java.util.List<String> getDataSources() {
        return dataSources;
    }

    /**
     * <p>
     * The data sources to aggregate usage statistics from.
     * </p>
     * 
     * @param dataSources
     *        The data sources to aggregate usage statistics from.
     * @see DataSource
     */

    public void setDataSources(java.util.Collection<String> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }

        this.dataSources = new java.util.ArrayList<String>(dataSources);
    }

    /**
     * <p>
     * The data sources to aggregate usage statistics from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSources(java.util.Collection)} or {@link #withDataSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataSources
     *        The data sources to aggregate usage statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public UsageCriteria withDataSources(String... dataSources) {
        if (this.dataSources == null) {
            setDataSources(new java.util.ArrayList<String>(dataSources.length));
        }
        for (String ele : dataSources) {
            this.dataSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data sources to aggregate usage statistics from.
     * </p>
     * 
     * @param dataSources
     *        The data sources to aggregate usage statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public UsageCriteria withDataSources(java.util.Collection<String> dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * The data sources to aggregate usage statistics from.
     * </p>
     * 
     * @param dataSources
     *        The data sources to aggregate usage statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSource
     */

    public UsageCriteria withDataSources(DataSource... dataSources) {
        java.util.ArrayList<String> dataSourcesCopy = new java.util.ArrayList<String>(dataSources.length);
        for (DataSource value : dataSources) {
            dataSourcesCopy.add(value.toString());
        }
        if (getDataSources() == null) {
            setDataSources(dataSourcesCopy);
        } else {
            getDataSources().addAll(dataSourcesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The resources to aggregate usage statistics from. Only accepts exact resource names.
     * </p>
     * 
     * @return The resources to aggregate usage statistics from. Only accepts exact resource names.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The resources to aggregate usage statistics from. Only accepts exact resource names.
     * </p>
     * 
     * @param resources
     *        The resources to aggregate usage statistics from. Only accepts exact resource names.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The resources to aggregate usage statistics from. Only accepts exact resource names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        The resources to aggregate usage statistics from. Only accepts exact resource names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageCriteria withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources to aggregate usage statistics from. Only accepts exact resource names.
     * </p>
     * 
     * @param resources
     *        The resources to aggregate usage statistics from. Only accepts exact resource names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageCriteria withResources(java.util.Collection<String> resources) {
        setResources(resources);
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
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageCriteria == false)
            return false;
        UsageCriteria other = (UsageCriteria) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public UsageCriteria clone() {
        try {
            return (UsageCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.UsageCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
