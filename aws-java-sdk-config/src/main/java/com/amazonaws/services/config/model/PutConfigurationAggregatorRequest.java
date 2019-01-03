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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationAggregator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationAggregatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     */
    private String configurationAggregatorName;
    /**
     * <p>
     * A list of AccountAggregationSource object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountAggregationSource> accountAggregationSources;
    /**
     * <p>
     * An OrganizationAggregationSource object.
     * </p>
     */
    private OrganizationAggregationSource organizationAggregationSource;

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     */

    public void setConfigurationAggregatorName(String configurationAggregatorName) {
        this.configurationAggregatorName = configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @return The name of the configuration aggregator.
     */

    public String getConfigurationAggregatorName() {
        return this.configurationAggregatorName;
    }

    /**
     * <p>
     * The name of the configuration aggregator.
     * </p>
     * 
     * @param configurationAggregatorName
     *        The name of the configuration aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationAggregatorRequest withConfigurationAggregatorName(String configurationAggregatorName) {
        setConfigurationAggregatorName(configurationAggregatorName);
        return this;
    }

    /**
     * <p>
     * A list of AccountAggregationSource object.
     * </p>
     * 
     * @return A list of AccountAggregationSource object.
     */

    public java.util.List<AccountAggregationSource> getAccountAggregationSources() {
        if (accountAggregationSources == null) {
            accountAggregationSources = new com.amazonaws.internal.SdkInternalList<AccountAggregationSource>();
        }
        return accountAggregationSources;
    }

    /**
     * <p>
     * A list of AccountAggregationSource object.
     * </p>
     * 
     * @param accountAggregationSources
     *        A list of AccountAggregationSource object.
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
     * A list of AccountAggregationSource object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountAggregationSources(java.util.Collection)} or
     * {@link #withAccountAggregationSources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accountAggregationSources
     *        A list of AccountAggregationSource object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationAggregatorRequest withAccountAggregationSources(AccountAggregationSource... accountAggregationSources) {
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
     * A list of AccountAggregationSource object.
     * </p>
     * 
     * @param accountAggregationSources
     *        A list of AccountAggregationSource object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationAggregatorRequest withAccountAggregationSources(java.util.Collection<AccountAggregationSource> accountAggregationSources) {
        setAccountAggregationSources(accountAggregationSources);
        return this;
    }

    /**
     * <p>
     * An OrganizationAggregationSource object.
     * </p>
     * 
     * @param organizationAggregationSource
     *        An OrganizationAggregationSource object.
     */

    public void setOrganizationAggregationSource(OrganizationAggregationSource organizationAggregationSource) {
        this.organizationAggregationSource = organizationAggregationSource;
    }

    /**
     * <p>
     * An OrganizationAggregationSource object.
     * </p>
     * 
     * @return An OrganizationAggregationSource object.
     */

    public OrganizationAggregationSource getOrganizationAggregationSource() {
        return this.organizationAggregationSource;
    }

    /**
     * <p>
     * An OrganizationAggregationSource object.
     * </p>
     * 
     * @param organizationAggregationSource
     *        An OrganizationAggregationSource object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationAggregatorRequest withOrganizationAggregationSource(OrganizationAggregationSource organizationAggregationSource) {
        setOrganizationAggregationSource(organizationAggregationSource);
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
        if (getAccountAggregationSources() != null)
            sb.append("AccountAggregationSources: ").append(getAccountAggregationSources()).append(",");
        if (getOrganizationAggregationSource() != null)
            sb.append("OrganizationAggregationSource: ").append(getOrganizationAggregationSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationAggregatorRequest == false)
            return false;
        PutConfigurationAggregatorRequest other = (PutConfigurationAggregatorRequest) obj;
        if (other.getConfigurationAggregatorName() == null ^ this.getConfigurationAggregatorName() == null)
            return false;
        if (other.getConfigurationAggregatorName() != null && other.getConfigurationAggregatorName().equals(this.getConfigurationAggregatorName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationAggregatorName() == null) ? 0 : getConfigurationAggregatorName().hashCode());
        hashCode = prime * hashCode + ((getAccountAggregationSources() == null) ? 0 : getAccountAggregationSources().hashCode());
        hashCode = prime * hashCode + ((getOrganizationAggregationSource() == null) ? 0 : getOrganizationAggregationSource().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationAggregatorRequest clone() {
        return (PutConfigurationAggregatorRequest) super.clone();
    }

}
