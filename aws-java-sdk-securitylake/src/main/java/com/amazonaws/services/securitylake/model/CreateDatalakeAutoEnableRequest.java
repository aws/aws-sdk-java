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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateDatalakeAutoEnable"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDatalakeAutoEnableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enable Security Lake with the specified configuration settings to begin collecting security data for new accounts
     * in your organization.
     * </p>
     */
    private java.util.List<AutoEnableNewRegionConfiguration> configurationForNewAccounts;

    /**
     * <p>
     * Enable Security Lake with the specified configuration settings to begin collecting security data for new accounts
     * in your organization.
     * </p>
     * 
     * @return Enable Security Lake with the specified configuration settings to begin collecting security data for new
     *         accounts in your organization.
     */

    public java.util.List<AutoEnableNewRegionConfiguration> getConfigurationForNewAccounts() {
        return configurationForNewAccounts;
    }

    /**
     * <p>
     * Enable Security Lake with the specified configuration settings to begin collecting security data for new accounts
     * in your organization.
     * </p>
     * 
     * @param configurationForNewAccounts
     *        Enable Security Lake with the specified configuration settings to begin collecting security data for new
     *        accounts in your organization.
     */

    public void setConfigurationForNewAccounts(java.util.Collection<AutoEnableNewRegionConfiguration> configurationForNewAccounts) {
        if (configurationForNewAccounts == null) {
            this.configurationForNewAccounts = null;
            return;
        }

        this.configurationForNewAccounts = new java.util.ArrayList<AutoEnableNewRegionConfiguration>(configurationForNewAccounts);
    }

    /**
     * <p>
     * Enable Security Lake with the specified configuration settings to begin collecting security data for new accounts
     * in your organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationForNewAccounts(java.util.Collection)} or
     * {@link #withConfigurationForNewAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationForNewAccounts
     *        Enable Security Lake with the specified configuration settings to begin collecting security data for new
     *        accounts in your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeAutoEnableRequest withConfigurationForNewAccounts(AutoEnableNewRegionConfiguration... configurationForNewAccounts) {
        if (this.configurationForNewAccounts == null) {
            setConfigurationForNewAccounts(new java.util.ArrayList<AutoEnableNewRegionConfiguration>(configurationForNewAccounts.length));
        }
        for (AutoEnableNewRegionConfiguration ele : configurationForNewAccounts) {
            this.configurationForNewAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enable Security Lake with the specified configuration settings to begin collecting security data for new accounts
     * in your organization.
     * </p>
     * 
     * @param configurationForNewAccounts
     *        Enable Security Lake with the specified configuration settings to begin collecting security data for new
     *        accounts in your organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDatalakeAutoEnableRequest withConfigurationForNewAccounts(java.util.Collection<AutoEnableNewRegionConfiguration> configurationForNewAccounts) {
        setConfigurationForNewAccounts(configurationForNewAccounts);
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
        if (getConfigurationForNewAccounts() != null)
            sb.append("ConfigurationForNewAccounts: ").append(getConfigurationForNewAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDatalakeAutoEnableRequest == false)
            return false;
        CreateDatalakeAutoEnableRequest other = (CreateDatalakeAutoEnableRequest) obj;
        if (other.getConfigurationForNewAccounts() == null ^ this.getConfigurationForNewAccounts() == null)
            return false;
        if (other.getConfigurationForNewAccounts() != null && other.getConfigurationForNewAccounts().equals(this.getConfigurationForNewAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationForNewAccounts() == null) ? 0 : getConfigurationForNewAccounts().hashCode());
        return hashCode;
    }

    @Override
    public CreateDatalakeAutoEnableRequest clone() {
        return (CreateDatalakeAutoEnableRequest) super.clone();
    }

}
