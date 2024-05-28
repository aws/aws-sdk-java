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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the coverage statistic for the additional configuration of the feature.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationFeatureStatisticsAdditionalConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationFeatureStatisticsAdditionalConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the additional configuration within a feature.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Total number of accounts that have enabled the additional configuration.
     * </p>
     */
    private Integer enabledAccountsCount;

    /**
     * <p>
     * Name of the additional configuration within a feature.
     * </p>
     * 
     * @param name
     *        Name of the additional configuration within a feature.
     * @see OrgFeatureAdditionalConfiguration
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the additional configuration within a feature.
     * </p>
     * 
     * @return Name of the additional configuration within a feature.
     * @see OrgFeatureAdditionalConfiguration
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the additional configuration within a feature.
     * </p>
     * 
     * @param name
     *        Name of the additional configuration within a feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public OrganizationFeatureStatisticsAdditionalConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Name of the additional configuration within a feature.
     * </p>
     * 
     * @param name
     *        Name of the additional configuration within a feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public OrganizationFeatureStatisticsAdditionalConfiguration withName(OrgFeatureAdditionalConfiguration name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Total number of accounts that have enabled the additional configuration.
     * </p>
     * 
     * @param enabledAccountsCount
     *        Total number of accounts that have enabled the additional configuration.
     */

    public void setEnabledAccountsCount(Integer enabledAccountsCount) {
        this.enabledAccountsCount = enabledAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts that have enabled the additional configuration.
     * </p>
     * 
     * @return Total number of accounts that have enabled the additional configuration.
     */

    public Integer getEnabledAccountsCount() {
        return this.enabledAccountsCount;
    }

    /**
     * <p>
     * Total number of accounts that have enabled the additional configuration.
     * </p>
     * 
     * @param enabledAccountsCount
     *        Total number of accounts that have enabled the additional configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationFeatureStatisticsAdditionalConfiguration withEnabledAccountsCount(Integer enabledAccountsCount) {
        setEnabledAccountsCount(enabledAccountsCount);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEnabledAccountsCount() != null)
            sb.append("EnabledAccountsCount: ").append(getEnabledAccountsCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationFeatureStatisticsAdditionalConfiguration == false)
            return false;
        OrganizationFeatureStatisticsAdditionalConfiguration other = (OrganizationFeatureStatisticsAdditionalConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnabledAccountsCount() == null ^ this.getEnabledAccountsCount() == null)
            return false;
        if (other.getEnabledAccountsCount() != null && other.getEnabledAccountsCount().equals(this.getEnabledAccountsCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnabledAccountsCount() == null) ? 0 : getEnabledAccountsCount().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationFeatureStatisticsAdditionalConfiguration clone() {
        try {
            return (OrganizationFeatureStatisticsAdditionalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationFeatureStatisticsAdditionalConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
