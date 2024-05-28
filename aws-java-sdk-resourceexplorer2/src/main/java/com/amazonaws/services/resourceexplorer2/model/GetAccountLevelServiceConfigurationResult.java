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
package com.amazonaws.services.resourceexplorer2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/resource-explorer-2-2022-07-28/GetAccountLevelServiceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountLevelServiceConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Details about the organization, and whether configuration is <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     */
    private OrgConfiguration orgConfiguration;

    /**
     * <p>
     * Details about the organization, and whether configuration is <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param orgConfiguration
     *        Details about the organization, and whether configuration is <code>ENABLED</code> or <code>DISABLED</code>
     *        .
     */

    public void setOrgConfiguration(OrgConfiguration orgConfiguration) {
        this.orgConfiguration = orgConfiguration;
    }

    /**
     * <p>
     * Details about the organization, and whether configuration is <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @return Details about the organization, and whether configuration is <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     */

    public OrgConfiguration getOrgConfiguration() {
        return this.orgConfiguration;
    }

    /**
     * <p>
     * Details about the organization, and whether configuration is <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * 
     * @param orgConfiguration
     *        Details about the organization, and whether configuration is <code>ENABLED</code> or <code>DISABLED</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountLevelServiceConfigurationResult withOrgConfiguration(OrgConfiguration orgConfiguration) {
        setOrgConfiguration(orgConfiguration);
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
        if (getOrgConfiguration() != null)
            sb.append("OrgConfiguration: ").append(getOrgConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountLevelServiceConfigurationResult == false)
            return false;
        GetAccountLevelServiceConfigurationResult other = (GetAccountLevelServiceConfigurationResult) obj;
        if (other.getOrgConfiguration() == null ^ this.getOrgConfiguration() == null)
            return false;
        if (other.getOrgConfiguration() != null && other.getOrgConfiguration().equals(this.getOrgConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrgConfiguration() == null) ? 0 : getOrgConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountLevelServiceConfigurationResult clone() {
        try {
            return (GetAccountLevelServiceConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
