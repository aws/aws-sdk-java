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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of <code>Domain</code> configuration settings to update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DomainSettingsForUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainSettingsForUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     * </p>
     */
    private RStudioServerProDomainSettingsForUpdate rStudioServerProDomainSettingsForUpdate;
    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     * <code>InService</code> or <code>Pending</code> state.
     * </p>
     */
    private String executionRoleIdentityConfig;
    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for communication
     * between Domain-level apps and user apps.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     * </p>
     * 
     * @param rStudioServerProDomainSettingsForUpdate
     *        A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     */

    public void setRStudioServerProDomainSettingsForUpdate(RStudioServerProDomainSettingsForUpdate rStudioServerProDomainSettingsForUpdate) {
        this.rStudioServerProDomainSettingsForUpdate = rStudioServerProDomainSettingsForUpdate;
    }

    /**
     * <p>
     * A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     * </p>
     * 
     * @return A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     */

    public RStudioServerProDomainSettingsForUpdate getRStudioServerProDomainSettingsForUpdate() {
        return this.rStudioServerProDomainSettingsForUpdate;
    }

    /**
     * <p>
     * A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     * </p>
     * 
     * @param rStudioServerProDomainSettingsForUpdate
     *        A collection of <code>RStudioServerPro</code> Domain-level app settings to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSettingsForUpdate withRStudioServerProDomainSettingsForUpdate(RStudioServerProDomainSettingsForUpdate rStudioServerProDomainSettingsForUpdate) {
        setRStudioServerProDomainSettingsForUpdate(rStudioServerProDomainSettingsForUpdate);
        return this;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     * <code>InService</code> or <code>Pending</code> state.
     * </p>
     * 
     * @param executionRoleIdentityConfig
     *        The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *        >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     *        <code>InService</code> or <code>Pending</code> state.
     * @see ExecutionRoleIdentityConfig
     */

    public void setExecutionRoleIdentityConfig(String executionRoleIdentityConfig) {
        this.executionRoleIdentityConfig = executionRoleIdentityConfig;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     * <code>InService</code> or <code>Pending</code> state.
     * </p>
     * 
     * @return The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *         >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     *         <code>InService</code> or <code>Pending</code> state.
     * @see ExecutionRoleIdentityConfig
     */

    public String getExecutionRoleIdentityConfig() {
        return this.executionRoleIdentityConfig;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     * <code>InService</code> or <code>Pending</code> state.
     * </p>
     * 
     * @param executionRoleIdentityConfig
     *        The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *        >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     *        <code>InService</code> or <code>Pending</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionRoleIdentityConfig
     */

    public DomainSettingsForUpdate withExecutionRoleIdentityConfig(String executionRoleIdentityConfig) {
        setExecutionRoleIdentityConfig(executionRoleIdentityConfig);
        return this;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     * <code>InService</code> or <code>Pending</code> state.
     * </p>
     * 
     * @param executionRoleIdentityConfig
     *        The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *        >sts:SourceIdentity key</a>. This configuration can only be modified if there are no apps in the
     *        <code>InService</code> or <code>Pending</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionRoleIdentityConfig
     */

    public DomainSettingsForUpdate withExecutionRoleIdentityConfig(ExecutionRoleIdentityConfig executionRoleIdentityConfig) {
        this.executionRoleIdentityConfig = executionRoleIdentityConfig.toString();
        return this;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for communication
     * between Domain-level apps and user apps.
     * </p>
     * 
     * @return The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for
     *         communication between Domain-level apps and user apps.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for communication
     * between Domain-level apps and user apps.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for
     *        communication between Domain-level apps and user apps.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for communication
     * between Domain-level apps and user apps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for
     *        communication between Domain-level apps and user apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSettingsForUpdate withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for communication
     * between Domain-level apps and user apps.
     * </p>
     * 
     * @param securityGroupIds
     *        The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for
     *        communication between Domain-level apps and user apps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSettingsForUpdate withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getRStudioServerProDomainSettingsForUpdate() != null)
            sb.append("RStudioServerProDomainSettingsForUpdate: ").append(getRStudioServerProDomainSettingsForUpdate()).append(",");
        if (getExecutionRoleIdentityConfig() != null)
            sb.append("ExecutionRoleIdentityConfig: ").append(getExecutionRoleIdentityConfig()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSettingsForUpdate == false)
            return false;
        DomainSettingsForUpdate other = (DomainSettingsForUpdate) obj;
        if (other.getRStudioServerProDomainSettingsForUpdate() == null ^ this.getRStudioServerProDomainSettingsForUpdate() == null)
            return false;
        if (other.getRStudioServerProDomainSettingsForUpdate() != null
                && other.getRStudioServerProDomainSettingsForUpdate().equals(this.getRStudioServerProDomainSettingsForUpdate()) == false)
            return false;
        if (other.getExecutionRoleIdentityConfig() == null ^ this.getExecutionRoleIdentityConfig() == null)
            return false;
        if (other.getExecutionRoleIdentityConfig() != null && other.getExecutionRoleIdentityConfig().equals(this.getExecutionRoleIdentityConfig()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRStudioServerProDomainSettingsForUpdate() == null) ? 0 : getRStudioServerProDomainSettingsForUpdate().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleIdentityConfig() == null) ? 0 : getExecutionRoleIdentityConfig().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public DomainSettingsForUpdate clone() {
        try {
            return (DomainSettingsForUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DomainSettingsForUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
