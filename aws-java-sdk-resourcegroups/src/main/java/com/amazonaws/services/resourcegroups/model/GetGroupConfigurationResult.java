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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetGroupConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The service configuration associated with the specified group. For details about the service configuration
     * syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations
     * for resource groups</a>.
     * </p>
     */
    private GroupConfiguration groupConfiguration;

    /**
     * <p>
     * The service configuration associated with the specified group. For details about the service configuration
     * syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations
     * for resource groups</a>.
     * </p>
     * 
     * @param groupConfiguration
     *        The service configuration associated with the specified group. For details about the service configuration
     *        syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service
     *        configurations for resource groups</a>.
     */

    public void setGroupConfiguration(GroupConfiguration groupConfiguration) {
        this.groupConfiguration = groupConfiguration;
    }

    /**
     * <p>
     * The service configuration associated with the specified group. For details about the service configuration
     * syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations
     * for resource groups</a>.
     * </p>
     * 
     * @return The service configuration associated with the specified group. For details about the service
     *         configuration syntax, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *         resource groups</a>.
     */

    public GroupConfiguration getGroupConfiguration() {
        return this.groupConfiguration;
    }

    /**
     * <p>
     * The service configuration associated with the specified group. For details about the service configuration
     * syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations
     * for resource groups</a>.
     * </p>
     * 
     * @param groupConfiguration
     *        The service configuration associated with the specified group. For details about the service configuration
     *        syntax, see <a href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service
     *        configurations for resource groups</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupConfigurationResult withGroupConfiguration(GroupConfiguration groupConfiguration) {
        setGroupConfiguration(groupConfiguration);
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
        if (getGroupConfiguration() != null)
            sb.append("GroupConfiguration: ").append(getGroupConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupConfigurationResult == false)
            return false;
        GetGroupConfigurationResult other = (GetGroupConfigurationResult) obj;
        if (other.getGroupConfiguration() == null ^ this.getGroupConfiguration() == null)
            return false;
        if (other.getGroupConfiguration() != null && other.getGroupConfiguration().equals(this.getGroupConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupConfiguration() == null) ? 0 : getGroupConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupConfigurationResult clone() {
        try {
            return (GetGroupConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
