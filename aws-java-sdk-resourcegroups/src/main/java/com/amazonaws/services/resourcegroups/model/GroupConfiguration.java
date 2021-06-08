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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A service configuration associated with a resource group. The configuration options are determined by the AWS service
 * that defines the <code>Type</code>, and specifies which resources can be included in the group. You can add a service
 * configuration when you create the group by using <a>CreateGroup</a>, or later by using the
 * <a>PutGroupConfiguration</a> operation. For details about group service configuration syntax, see <a
 * href="https://docs.aws.amazon.com/ARG/latest/APIReference/about-slg.html">Service configurations for resource
 * groups</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GroupConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration currently associated with the group and in effect.
     * </p>
     */
    private java.util.List<GroupConfigurationItem> configuration;
    /**
     * <p>
     * If present, the new configuration that is in the process of being applied to the group.
     * </p>
     */
    private java.util.List<GroupConfigurationItem> proposedConfiguration;
    /**
     * <p>
     * The current status of an attempt to update the group configuration.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If present, the reason why a request to update the group configuration failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The configuration currently associated with the group and in effect.
     * </p>
     * 
     * @return The configuration currently associated with the group and in effect.
     */

    public java.util.List<GroupConfigurationItem> getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The configuration currently associated with the group and in effect.
     * </p>
     * 
     * @param configuration
     *        The configuration currently associated with the group and in effect.
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
     * The configuration currently associated with the group and in effect.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfiguration(java.util.Collection)} or {@link #withConfiguration(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configuration
     *        The configuration currently associated with the group and in effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfiguration withConfiguration(GroupConfigurationItem... configuration) {
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
     * The configuration currently associated with the group and in effect.
     * </p>
     * 
     * @param configuration
     *        The configuration currently associated with the group and in effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfiguration withConfiguration(java.util.Collection<GroupConfigurationItem> configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * If present, the new configuration that is in the process of being applied to the group.
     * </p>
     * 
     * @return If present, the new configuration that is in the process of being applied to the group.
     */

    public java.util.List<GroupConfigurationItem> getProposedConfiguration() {
        return proposedConfiguration;
    }

    /**
     * <p>
     * If present, the new configuration that is in the process of being applied to the group.
     * </p>
     * 
     * @param proposedConfiguration
     *        If present, the new configuration that is in the process of being applied to the group.
     */

    public void setProposedConfiguration(java.util.Collection<GroupConfigurationItem> proposedConfiguration) {
        if (proposedConfiguration == null) {
            this.proposedConfiguration = null;
            return;
        }

        this.proposedConfiguration = new java.util.ArrayList<GroupConfigurationItem>(proposedConfiguration);
    }

    /**
     * <p>
     * If present, the new configuration that is in the process of being applied to the group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProposedConfiguration(java.util.Collection)} or
     * {@link #withProposedConfiguration(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param proposedConfiguration
     *        If present, the new configuration that is in the process of being applied to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfiguration withProposedConfiguration(GroupConfigurationItem... proposedConfiguration) {
        if (this.proposedConfiguration == null) {
            setProposedConfiguration(new java.util.ArrayList<GroupConfigurationItem>(proposedConfiguration.length));
        }
        for (GroupConfigurationItem ele : proposedConfiguration) {
            this.proposedConfiguration.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If present, the new configuration that is in the process of being applied to the group.
     * </p>
     * 
     * @param proposedConfiguration
     *        If present, the new configuration that is in the process of being applied to the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfiguration withProposedConfiguration(java.util.Collection<GroupConfigurationItem> proposedConfiguration) {
        setProposedConfiguration(proposedConfiguration);
        return this;
    }

    /**
     * <p>
     * The current status of an attempt to update the group configuration.
     * </p>
     * 
     * @param status
     *        The current status of an attempt to update the group configuration.
     * @see GroupConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of an attempt to update the group configuration.
     * </p>
     * 
     * @return The current status of an attempt to update the group configuration.
     * @see GroupConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of an attempt to update the group configuration.
     * </p>
     * 
     * @param status
     *        The current status of an attempt to update the group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupConfigurationStatus
     */

    public GroupConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of an attempt to update the group configuration.
     * </p>
     * 
     * @param status
     *        The current status of an attempt to update the group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GroupConfigurationStatus
     */

    public GroupConfiguration withStatus(GroupConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If present, the reason why a request to update the group configuration failed.
     * </p>
     * 
     * @param failureReason
     *        If present, the reason why a request to update the group configuration failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If present, the reason why a request to update the group configuration failed.
     * </p>
     * 
     * @return If present, the reason why a request to update the group configuration failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If present, the reason why a request to update the group configuration failed.
     * </p>
     * 
     * @param failureReason
     *        If present, the reason why a request to update the group configuration failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupConfiguration withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getProposedConfiguration() != null)
            sb.append("ProposedConfiguration: ").append(getProposedConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupConfiguration == false)
            return false;
        GroupConfiguration other = (GroupConfiguration) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getProposedConfiguration() == null ^ this.getProposedConfiguration() == null)
            return false;
        if (other.getProposedConfiguration() != null && other.getProposedConfiguration().equals(this.getProposedConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProposedConfiguration() == null) ? 0 : getProposedConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public GroupConfiguration clone() {
        try {
            return (GroupConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resourcegroups.model.transform.GroupConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
