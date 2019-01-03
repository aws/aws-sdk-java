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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes supported operating systems in AWS OpsWorks Stacks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/OperatingSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperatingSystem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OperatingSystemConfigurationManager> configurationManagers;
    /**
     * <p>
     * A short name for the operating system manufacturer.
     * </p>
     */
    private String reportedName;
    /**
     * <p>
     * The version of the operating system, including the release and edition, if applicable.
     * </p>
     */
    private String reportedVersion;
    /**
     * <p>
     * Indicates that an operating system is not supported for new instances.
     * </p>
     */
    private Boolean supported;

    /**
     * <p>
     * The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     * 
     * @param name
     *        The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     * 
     * @return The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     * 
     * @param name
     *        The name of the operating system, such as <code>Amazon Linux 2017.09</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     * 
     * @param id
     *        The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     * 
     * @return The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     * </p>
     * 
     * @param id
     *        The ID of a supported operating system, such as <code>Amazon Linux 2017.09</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     * </p>
     * 
     * @param type
     *        The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     * </p>
     * 
     * @return The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     * </p>
     * 
     * @param type
     *        The type of a supported operating system, either <code>Linux</code> or <code>Windows</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * </p>
     * 
     * @return Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     */

    public java.util.List<OperatingSystemConfigurationManager> getConfigurationManagers() {
        if (configurationManagers == null) {
            configurationManagers = new com.amazonaws.internal.SdkInternalList<OperatingSystemConfigurationManager>();
        }
        return configurationManagers;
    }

    /**
     * <p>
     * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * </p>
     * 
     * @param configurationManagers
     *        Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     */

    public void setConfigurationManagers(java.util.Collection<OperatingSystemConfigurationManager> configurationManagers) {
        if (configurationManagers == null) {
            this.configurationManagers = null;
            return;
        }

        this.configurationManagers = new com.amazonaws.internal.SdkInternalList<OperatingSystemConfigurationManager>(configurationManagers);
    }

    /**
     * <p>
     * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationManagers(java.util.Collection)} or
     * {@link #withConfigurationManagers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationManagers
     *        Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withConfigurationManagers(OperatingSystemConfigurationManager... configurationManagers) {
        if (this.configurationManagers == null) {
            setConfigurationManagers(new com.amazonaws.internal.SdkInternalList<OperatingSystemConfigurationManager>(configurationManagers.length));
        }
        for (OperatingSystemConfigurationManager ele : configurationManagers) {
            this.configurationManagers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * </p>
     * 
     * @param configurationManagers
     *        Supported configuration manager name and versions for an AWS OpsWorks Stacks operating system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withConfigurationManagers(java.util.Collection<OperatingSystemConfigurationManager> configurationManagers) {
        setConfigurationManagers(configurationManagers);
        return this;
    }

    /**
     * <p>
     * A short name for the operating system manufacturer.
     * </p>
     * 
     * @param reportedName
     *        A short name for the operating system manufacturer.
     */

    public void setReportedName(String reportedName) {
        this.reportedName = reportedName;
    }

    /**
     * <p>
     * A short name for the operating system manufacturer.
     * </p>
     * 
     * @return A short name for the operating system manufacturer.
     */

    public String getReportedName() {
        return this.reportedName;
    }

    /**
     * <p>
     * A short name for the operating system manufacturer.
     * </p>
     * 
     * @param reportedName
     *        A short name for the operating system manufacturer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withReportedName(String reportedName) {
        setReportedName(reportedName);
        return this;
    }

    /**
     * <p>
     * The version of the operating system, including the release and edition, if applicable.
     * </p>
     * 
     * @param reportedVersion
     *        The version of the operating system, including the release and edition, if applicable.
     */

    public void setReportedVersion(String reportedVersion) {
        this.reportedVersion = reportedVersion;
    }

    /**
     * <p>
     * The version of the operating system, including the release and edition, if applicable.
     * </p>
     * 
     * @return The version of the operating system, including the release and edition, if applicable.
     */

    public String getReportedVersion() {
        return this.reportedVersion;
    }

    /**
     * <p>
     * The version of the operating system, including the release and edition, if applicable.
     * </p>
     * 
     * @param reportedVersion
     *        The version of the operating system, including the release and edition, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withReportedVersion(String reportedVersion) {
        setReportedVersion(reportedVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that an operating system is not supported for new instances.
     * </p>
     * 
     * @param supported
     *        Indicates that an operating system is not supported for new instances.
     */

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    /**
     * <p>
     * Indicates that an operating system is not supported for new instances.
     * </p>
     * 
     * @return Indicates that an operating system is not supported for new instances.
     */

    public Boolean getSupported() {
        return this.supported;
    }

    /**
     * <p>
     * Indicates that an operating system is not supported for new instances.
     * </p>
     * 
     * @param supported
     *        Indicates that an operating system is not supported for new instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OperatingSystem withSupported(Boolean supported) {
        setSupported(supported);
        return this;
    }

    /**
     * <p>
     * Indicates that an operating system is not supported for new instances.
     * </p>
     * 
     * @return Indicates that an operating system is not supported for new instances.
     */

    public Boolean isSupported() {
        return this.supported;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfigurationManagers() != null)
            sb.append("ConfigurationManagers: ").append(getConfigurationManagers()).append(",");
        if (getReportedName() != null)
            sb.append("ReportedName: ").append(getReportedName()).append(",");
        if (getReportedVersion() != null)
            sb.append("ReportedVersion: ").append(getReportedVersion()).append(",");
        if (getSupported() != null)
            sb.append("Supported: ").append(getSupported());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OperatingSystem == false)
            return false;
        OperatingSystem other = (OperatingSystem) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfigurationManagers() == null ^ this.getConfigurationManagers() == null)
            return false;
        if (other.getConfigurationManagers() != null && other.getConfigurationManagers().equals(this.getConfigurationManagers()) == false)
            return false;
        if (other.getReportedName() == null ^ this.getReportedName() == null)
            return false;
        if (other.getReportedName() != null && other.getReportedName().equals(this.getReportedName()) == false)
            return false;
        if (other.getReportedVersion() == null ^ this.getReportedVersion() == null)
            return false;
        if (other.getReportedVersion() != null && other.getReportedVersion().equals(this.getReportedVersion()) == false)
            return false;
        if (other.getSupported() == null ^ this.getSupported() == null)
            return false;
        if (other.getSupported() != null && other.getSupported().equals(this.getSupported()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfigurationManagers() == null) ? 0 : getConfigurationManagers().hashCode());
        hashCode = prime * hashCode + ((getReportedName() == null) ? 0 : getReportedName().hashCode());
        hashCode = prime * hashCode + ((getReportedVersion() == null) ? 0 : getReportedVersion().hashCode());
        hashCode = prime * hashCode + ((getSupported() == null) ? 0 : getSupported().hashCode());
        return hashCode;
    }

    @Override
    public OperatingSystem clone() {
        try {
            return (OperatingSystem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.OperatingSystemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
