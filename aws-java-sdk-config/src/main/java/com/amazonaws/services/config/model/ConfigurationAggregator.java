/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about the configuration aggregator, including information about source accounts, regions, and metadata of
 * the aggregator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConfigurationAggregator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationAggregator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregator.
     * </p>
     */
    private String configurationAggregatorArn;
    /**
     * <p>
     * Provides a list of source accounts and regions to be aggregated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountAggregationSource> accountAggregationSources;
    /**
     * <p>
     * Provides an organization and list of regions to be aggregated.
     * </p>
     */
    private OrganizationAggregationSource organizationAggregationSource;
    /**
     * <p>
     * The time stamp when the configuration aggregator was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time of the last update.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The name of the aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the aggregator.
     * </p>
     * 
     * @return The name of the aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregator.
     * </p>
     * 
     * @param configurationAggregatorArn
     *        The Amazon Resource Name (ARN) of the aggregator.
     */

    public void setConfigurationAggregatorArn(String configurationAggregatorArn) {
        this.configurationAggregatorArn = configurationAggregatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the aggregator.
     */

    public String getConfigurationAggregatorArn() {
        return this.configurationAggregatorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregator.
     * </p>
     * 
     * @param configurationAggregatorArn
     *        The Amazon Resource Name (ARN) of the aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withConfigurationAggregatorArn(String configurationAggregatorArn) {
        setConfigurationAggregatorArn(configurationAggregatorArn);
        return this;
    }

    /**
     * <p>
     * Provides a list of source accounts and regions to be aggregated.
     * </p>
     * 
     * @return Provides a list of source accounts and regions to be aggregated.
     */

    public java.util.List<AccountAggregationSource> getAccountAggregationSources() {
        if (accountAggregationSources == null) {
            accountAggregationSources = new com.amazonaws.internal.SdkInternalList<AccountAggregationSource>();
        }
        return accountAggregationSources;
    }

    /**
     * <p>
     * Provides a list of source accounts and regions to be aggregated.
     * </p>
     * 
     * @param accountAggregationSources
     *        Provides a list of source accounts and regions to be aggregated.
     */

    public void setAccountAggregationSources(java.util.Collection<AccountAggregationSource> accountAggregationSources) {
        if (accountAggregationSources == null) {
            this.accountAggregationSources = null;
            return;
        }

        this.accountAggregationSources = new com.amazonaws.internal.SdkInternalList<AccountAggregationSource>(accountAggregationSources);
    }

    /**
     * <p>
     * Provides a list of source accounts and regions to be aggregated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountAggregationSources(java.util.Collection)} or
     * {@link #withAccountAggregationSources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accountAggregationSources
     *        Provides a list of source accounts and regions to be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withAccountAggregationSources(AccountAggregationSource... accountAggregationSources) {
        if (this.accountAggregationSources == null) {
            setAccountAggregationSources(new com.amazonaws.internal.SdkInternalList<AccountAggregationSource>(accountAggregationSources.length));
        }
        for (AccountAggregationSource ele : accountAggregationSources) {
            this.accountAggregationSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of source accounts and regions to be aggregated.
     * </p>
     * 
     * @param accountAggregationSources
     *        Provides a list of source accounts and regions to be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withAccountAggregationSources(java.util.Collection<AccountAggregationSource> accountAggregationSources) {
        setAccountAggregationSources(accountAggregationSources);
        return this;
    }

    /**
     * <p>
     * Provides an organization and list of regions to be aggregated.
     * </p>
     * 
     * @param organizationAggregationSource
     *        Provides an organization and list of regions to be aggregated.
     */

    public void setOrganizationAggregationSource(OrganizationAggregationSource organizationAggregationSource) {
        this.organizationAggregationSource = organizationAggregationSource;
    }

    /**
     * <p>
     * Provides an organization and list of regions to be aggregated.
     * </p>
     * 
     * @return Provides an organization and list of regions to be aggregated.
     */

    public OrganizationAggregationSource getOrganizationAggregationSource() {
        return this.organizationAggregationSource;
    }

    /**
     * <p>
     * Provides an organization and list of regions to be aggregated.
     * </p>
     * 
     * @param organizationAggregationSource
     *        Provides an organization and list of regions to be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withOrganizationAggregationSource(OrganizationAggregationSource organizationAggregationSource) {
        setOrganizationAggregationSource(organizationAggregationSource);
        return this;
    }

    /**
     * <p>
     * The time stamp when the configuration aggregator was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp when the configuration aggregator was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp when the configuration aggregator was created.
     * </p>
     * 
     * @return The time stamp when the configuration aggregator was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp when the configuration aggregator was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp when the configuration aggregator was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time of the last update.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time of the last update.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time of the last update.
     * </p>
     * 
     * @return The time of the last update.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time of the last update.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time of the last update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurationAggregator withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getConfigurationAggregatorName() != null)
            sb.append("ConfigurationAggregatorName: ").append(getConfigurationAggregatorName()).append(",");
        if (getConfigurationAggregatorArn() != null)
            sb.append("ConfigurationAggregatorArn: ").append(getConfigurationAggregatorArn()).append(",");
        if (getAccountAggregationSources() != null)
            sb.append("AccountAggregationSources: ").append(getAccountAggregationSources()).append(",");
        if (getOrganizationAggregationSource() != null)
            sb.append("OrganizationAggregationSource: ").append(getOrganizationAggregationSource()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationAggregator == false)
            return false;
        ConfigurationAggregator other = (ConfigurationAggregator) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
            return false;
        if (other.getConfigurationAggregatorArn() == null ^ this.getConfigurationAggregatorArn() == null)
            return false;
        if (other.getConfigurationAggregatorArn() != null && other.getConfigurationAggregatorArn().equals(this.getConfigurationAggregatorArn()) == false)
            return false;
        if (other.getAccountAggregationSources() == null ^ this.getAccountAggregationSources() == null)
            return false;
        if (other.getAccountAggregationSources() != null && other.getAccountAggregationSources().equals(this.getAccountAggregationSources()) == false)
            return false;
        if (other.getOrganizationAggregationSource() == null ^ this.getOrganizationAggregationSource() == null)
            return false;
        if (other.getOrganizationAggregationSource() != null
                && other.getOrganizationAggregationSource().equals(this.getOrganizationAggregationSource()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getConfigurationAggregatorArn() == null) ? 0 : getConfigurationAggregatorArn().hashCode());
        hashCode = prime * hashCode + ((getAccountAggregationSources() == null) ? 0 : getAccountAggregationSources().hashCode());
        hashCode = prime * hashCode + ((getOrganizationAggregationSource() == null) ? 0 : getOrganizationAggregationSource().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurationAggregator clone() {
        try {
            return (ConfigurationAggregator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConfigurationAggregatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
