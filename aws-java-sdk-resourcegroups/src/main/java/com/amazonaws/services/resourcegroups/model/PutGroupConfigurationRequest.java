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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/PutGroupConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGroupConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ARN of the resource group with the configuration that you want to update.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The new configuration to associate with the specified group. A configuration associates the resource group with
     * an AWS service and specifies how the service can interact with the resources in the group. A configuration is an
     * array of <a>GroupConfigurationItem</a> elements.
     * </p>
     * <p>
     * For information about the syntax of a service configuration, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     */
    private java.util.List<GroupConfigurationItem> configuration;

    /**
     * <p>
     * The name or ARN of the resource group with the configuration that you want to update.
     * </p>
     * 
     * @param group
     *        The name or ARN of the resource group with the configuration that you want to update.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name or ARN of the resource group with the configuration that you want to update.
     * </p>
     * 
     * @return The name or ARN of the resource group with the configuration that you want to update.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name or ARN of the resource group with the configuration that you want to update.
     * </p>
     * 
     * @param group
     *        The name or ARN of the resource group with the configuration that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupConfigurationRequest withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The new configuration to associate with the specified group. A configuration associates the resource group with
     * an AWS service and specifies how the service can interact with the resources in the group. A configuration is an
     * array of <a>GroupConfigurationItem</a> elements.
     * </p>
     * <p>
     * For information about the syntax of a service configuration, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * 
     * @return The new configuration to associate with the specified group. A configuration associates the resource
     *         group with an AWS service and specifies how the service can interact with the resources in the group. A
     *         configuration is an array of <a>GroupConfigurationItem</a> elements.</p>
     *         <p>
     *         For information about the syntax of a service configuration, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *         resource groups</a>.
     *         </p>
     *         <note>
     *         <p>
     *         A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *         both.
     *         </p>
     */

    public java.util.List<GroupConfigurationItem> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The new configuration to associate with the specified group. A configuration associates the resource group with
     * an AWS service and specifies how the service can interact with the resources in the group. A configuration is an
     * array of <a>GroupConfigurationItem</a> elements.
     * </p>
     * <p>
     * For information about the syntax of a service configuration, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * 
     * @param configuration
     *        The new configuration to associate with the specified group. A configuration associates the resource group
     *        with an AWS service and specifies how the service can interact with the resources in the group. A
     *        configuration is an array of <a>GroupConfigurationItem</a> elements.</p>
     *        <p>
     *        For information about the syntax of a service configuration, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *        resource groups</a>.
     *        </p>
     *        <note>
     *        <p>
     *        A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *        both.
     *        </p>
     */

    public void setConfiguration(java.util.Collection<GroupConfigurationItem> configuration) {
        if (configuration == null) {
            this.configuration = null;
            return;
        }

        this.configuration = new java.util.ArrayList<GroupConfigurationItem>(configuration);
    }

    /**
     * <p>
     * The new configuration to associate with the specified group. A configuration associates the resource group with
     * an AWS service and specifies how the service can interact with the resources in the group. A configuration is an
     * array of <a>GroupConfigurationItem</a> elements.
     * </p>
     * <p>
     * For information about the syntax of a service configuration, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfiguration(java.util.Collection)} or {@link #withConfiguration(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configuration
     *        The new configuration to associate with the specified group. A configuration associates the resource group
     *        with an AWS service and specifies how the service can interact with the resources in the group. A
     *        configuration is an array of <a>GroupConfigurationItem</a> elements.</p>
     *        <p>
     *        For information about the syntax of a service configuration, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *        resource groups</a>.
     *        </p>
     *        <note>
     *        <p>
     *        A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *        both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupConfigurationRequest withConfiguration(GroupConfigurationItem... configuration) {
        if (this.configuration == null) {
            setConfiguration(new java.util.ArrayList<GroupConfigurationItem>(configuration.length));
        }
        for (GroupConfigurationItem ele : configuration) {
            this.configuration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new configuration to associate with the specified group. A configuration associates the resource group with
     * an AWS service and specifies how the service can interact with the resources in the group. A configuration is an
     * array of <a>GroupConfigurationItem</a> elements.
     * </p>
     * <p>
     * For information about the syntax of a service configuration, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
     * groups</a>.
     * </p>
     * <note>
     * <p>
     * A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not both.
     * </p>
     * </note>
     * 
     * @param configuration
     *        The new configuration to associate with the specified group. A configuration associates the resource group
     *        with an AWS service and specifies how the service can interact with the resources in the group. A
     *        configuration is an array of <a>GroupConfigurationItem</a> elements.</p>
     *        <p>
     *        For information about the syntax of a service configuration, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for
     *        resource groups</a>.
     *        </p>
     *        <note>
     *        <p>
     *        A resource group can contain either a <code>Configuration</code> or a <code>ResourceQuery</code>, but not
     *        both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGroupConfigurationRequest withConfiguration(java.util.Collection<GroupConfigurationItem> configuration) {
        setConfiguration(configuration);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutGroupConfigurationRequest == false)
            return false;
        PutGroupConfigurationRequest other = (PutGroupConfigurationRequest) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PutGroupConfigurationRequest clone() {
        return (PutGroupConfigurationRequest) super.clone();
    }

}
