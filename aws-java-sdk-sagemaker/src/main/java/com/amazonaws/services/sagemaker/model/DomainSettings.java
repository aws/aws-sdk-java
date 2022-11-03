/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A collection of settings that apply to the <code>SageMaker Domain</code>. These settings are specified through the
 * <code>CreateDomain</code> API call.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DomainSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The security groups for the Amazon Virtual Private Cloud that the <code>Domain</code> uses for communication
     * between Domain-level apps and user apps.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     */
    private RStudioServerProDomainSettings rStudioServerProDomainSettings;
    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>.
     * </p>
     */
    private String executionRoleIdentityConfig;

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

    public DomainSettings withSecurityGroupIds(String... securityGroupIds) {
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

    public DomainSettings withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @param rStudioServerProDomainSettings
     *        A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     */

    public void setRStudioServerProDomainSettings(RStudioServerProDomainSettings rStudioServerProDomainSettings) {
        this.rStudioServerProDomainSettings = rStudioServerProDomainSettings;
    }

    /**
     * <p>
     * A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @return A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     */

    public RStudioServerProDomainSettings getRStudioServerProDomainSettings() {
        return this.rStudioServerProDomainSettings;
    }

    /**
     * <p>
     * A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @param rStudioServerProDomainSettings
     *        A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainSettings withRStudioServerProDomainSettings(RStudioServerProDomainSettings rStudioServerProDomainSettings) {
        setRStudioServerProDomainSettings(rStudioServerProDomainSettings);
        return this;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>.
     * </p>
     * 
     * @param executionRoleIdentityConfig
     *        The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *        >sts:SourceIdentity key</a>.
     * @see ExecutionRoleIdentityConfig
     */

    public void setExecutionRoleIdentityConfig(String executionRoleIdentityConfig) {
        this.executionRoleIdentityConfig = executionRoleIdentityConfig;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>.
     * </p>
     * 
     * @return The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *         >sts:SourceIdentity key</a>.
     * @see ExecutionRoleIdentityConfig
     */

    public String getExecutionRoleIdentityConfig() {
        return this.executionRoleIdentityConfig;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>.
     * </p>
     * 
     * @param executionRoleIdentityConfig
     *        The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *        >sts:SourceIdentity key</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionRoleIdentityConfig
     */

    public DomainSettings withExecutionRoleIdentityConfig(String executionRoleIdentityConfig) {
        setExecutionRoleIdentityConfig(executionRoleIdentityConfig);
        return this;
    }

    /**
     * <p>
     * The configuration for attaching a SageMaker user profile name to the execution role as a <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     * >sts:SourceIdentity key</a>.
     * </p>
     * 
     * @param executionRoleIdentityConfig
     *        The configuration for attaching a SageMaker user profile name to the execution role as a <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html"
     *        >sts:SourceIdentity key</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionRoleIdentityConfig
     */

    public DomainSettings withExecutionRoleIdentityConfig(ExecutionRoleIdentityConfig executionRoleIdentityConfig) {
        this.executionRoleIdentityConfig = executionRoleIdentityConfig.toString();
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getRStudioServerProDomainSettings() != null)
            sb.append("RStudioServerProDomainSettings: ").append(getRStudioServerProDomainSettings()).append(",");
        if (getExecutionRoleIdentityConfig() != null)
            sb.append("ExecutionRoleIdentityConfig: ").append(getExecutionRoleIdentityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSettings == false)
            return false;
        DomainSettings other = (DomainSettings) obj;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getRStudioServerProDomainSettings() == null ^ this.getRStudioServerProDomainSettings() == null)
            return false;
        if (other.getRStudioServerProDomainSettings() != null
                && other.getRStudioServerProDomainSettings().equals(this.getRStudioServerProDomainSettings()) == false)
            return false;
        if (other.getExecutionRoleIdentityConfig() == null ^ this.getExecutionRoleIdentityConfig() == null)
            return false;
        if (other.getExecutionRoleIdentityConfig() != null && other.getExecutionRoleIdentityConfig().equals(this.getExecutionRoleIdentityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRStudioServerProDomainSettings() == null) ? 0 : getRStudioServerProDomainSettings().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleIdentityConfig() == null) ? 0 : getExecutionRoleIdentityConfig().hashCode());
        return hashCode;
    }

    @Override
    public DomainSettings clone() {
        try {
            return (DomainSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DomainSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
