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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Option details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/Option" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Option implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the option.
     * </p>
     */
    private String optionName;
    /**
     * <p>
     * The description of the option.
     * </p>
     */
    private String optionDescription;
    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     */
    private Boolean persistent;
    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     */
    private Boolean permanent;
    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The version of the option.
     * </p>
     */
    private String optionVersion;
    /**
     * <p>
     * The option settings for this option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionSetting> optionSettings;
    /**
     * <p>
     * If the option requires access to a port, then this DB security group allows access to the port.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership> dBSecurityGroupMemberships;
    /**
     * <p>
     * If the option requires access to a port, then this VPC security group allows access to the port.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership> vpcSecurityGroupMemberships;

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param optionName
     *        The name of the option.
     */

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @return The name of the option.
     */

    public String getOptionName() {
        return this.optionName;
    }

    /**
     * <p>
     * The name of the option.
     * </p>
     * 
     * @param optionName
     *        The name of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withOptionName(String optionName) {
        setOptionName(optionName);
        return this;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @param optionDescription
     *        The description of the option.
     */

    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @return The description of the option.
     */

    public String getOptionDescription() {
        return this.optionDescription;
    }

    /**
     * <p>
     * The description of the option.
     * </p>
     * 
     * @param optionDescription
     *        The description of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withOptionDescription(String optionDescription) {
        setOptionDescription(optionDescription);
        return this;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     * 
     * @param persistent
     *        Indicate if this option is persistent.
     */

    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     * 
     * @return Indicate if this option is persistent.
     */

    public Boolean getPersistent() {
        return this.persistent;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     * 
     * @param persistent
     *        Indicate if this option is persistent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withPersistent(Boolean persistent) {
        setPersistent(persistent);
        return this;
    }

    /**
     * <p>
     * Indicate if this option is persistent.
     * </p>
     * 
     * @return Indicate if this option is persistent.
     */

    public Boolean isPersistent() {
        return this.persistent;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     * 
     * @param permanent
     *        Indicate if this option is permanent.
     */

    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     * 
     * @return Indicate if this option is permanent.
     */

    public Boolean getPermanent() {
        return this.permanent;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     * 
     * @param permanent
     *        Indicate if this option is permanent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withPermanent(Boolean permanent) {
        setPermanent(permanent);
        return this;
    }

    /**
     * <p>
     * Indicate if this option is permanent.
     * </p>
     * 
     * @return Indicate if this option is permanent.
     */

    public Boolean isPermanent() {
        return this.permanent;
    }

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     * 
     * @param port
     *        If required, the port configured for this option to use.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     * 
     * @return If required, the port configured for this option to use.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * If required, the port configured for this option to use.
     * </p>
     * 
     * @param port
     *        If required, the port configured for this option to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * 
     * @param optionVersion
     *        The version of the option.
     */

    public void setOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * 
     * @return The version of the option.
     */

    public String getOptionVersion() {
        return this.optionVersion;
    }

    /**
     * <p>
     * The version of the option.
     * </p>
     * 
     * @param optionVersion
     *        The version of the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withOptionVersion(String optionVersion) {
        setOptionVersion(optionVersion);
        return this;
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     * 
     * @return The option settings for this option.
     */

    public java.util.List<OptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<OptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     * 
     * @param optionSettings
     *        The option settings for this option.
     */

    public void setOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new com.amazonaws.internal.SdkInternalList<OptionSetting>(optionSettings);
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        The option settings for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withOptionSettings(OptionSetting... optionSettings) {
        if (this.optionSettings == null) {
            setOptionSettings(new com.amazonaws.internal.SdkInternalList<OptionSetting>(optionSettings.length));
        }
        for (OptionSetting ele : optionSettings) {
            this.optionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The option settings for this option.
     * </p>
     * 
     * @param optionSettings
     *        The option settings for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group allows access to the port.
     * </p>
     * 
     * @return If the option requires access to a port, then this DB security group allows access to the port.
     */

    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroupMemberships() {
        if (dBSecurityGroupMemberships == null) {
            dBSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership>();
        }
        return dBSecurityGroupMemberships;
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group allows access to the port.
     * </p>
     * 
     * @param dBSecurityGroupMemberships
     *        If the option requires access to a port, then this DB security group allows access to the port.
     */

    public void setDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        this.dBSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership>(dBSecurityGroupMemberships);
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group allows access to the port.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroupMemberships(java.util.Collection)} or
     * {@link #withDBSecurityGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroupMemberships
     *        If the option requires access to a port, then this DB security group allows access to the port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withDBSecurityGroupMemberships(DBSecurityGroupMembership... dBSecurityGroupMemberships) {
        if (this.dBSecurityGroupMemberships == null) {
            setDBSecurityGroupMemberships(new com.amazonaws.internal.SdkInternalList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.length));
        }
        for (DBSecurityGroupMembership ele : dBSecurityGroupMemberships) {
            this.dBSecurityGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this DB security group allows access to the port.
     * </p>
     * 
     * @param dBSecurityGroupMemberships
     *        If the option requires access to a port, then this DB security group allows access to the port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        setDBSecurityGroupMemberships(dBSecurityGroupMemberships);
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group allows access to the port.
     * </p>
     * 
     * @return If the option requires access to a port, then this VPC security group allows access to the port.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroupMemberships() {
        if (vpcSecurityGroupMemberships == null) {
            vpcSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroupMemberships;
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group allows access to the port.
     * </p>
     * 
     * @param vpcSecurityGroupMemberships
     *        If the option requires access to a port, then this VPC security group allows access to the port.
     */

    public void setVpcSecurityGroupMemberships(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }

        this.vpcSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships);
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group allows access to the port.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupMemberships(java.util.Collection)} or
     * {@link #withVpcSecurityGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupMemberships
     *        If the option requires access to a port, then this VPC security group allows access to the port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withVpcSecurityGroupMemberships(VpcSecurityGroupMembership... vpcSecurityGroupMemberships) {
        if (this.vpcSecurityGroupMemberships == null) {
            setVpcSecurityGroupMemberships(new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.length));
        }
        for (VpcSecurityGroupMembership ele : vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the option requires access to a port, then this VPC security group allows access to the port.
     * </p>
     * 
     * @param vpcSecurityGroupMemberships
     *        If the option requires access to a port, then this VPC security group allows access to the port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Option withVpcSecurityGroupMemberships(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        setVpcSecurityGroupMemberships(vpcSecurityGroupMemberships);
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
        if (getOptionName() != null)
            sb.append("OptionName: ").append(getOptionName()).append(",");
        if (getOptionDescription() != null)
            sb.append("OptionDescription: ").append(getOptionDescription()).append(",");
        if (getPersistent() != null)
            sb.append("Persistent: ").append(getPersistent()).append(",");
        if (getPermanent() != null)
            sb.append("Permanent: ").append(getPermanent()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getOptionVersion() != null)
            sb.append("OptionVersion: ").append(getOptionVersion()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings()).append(",");
        if (getDBSecurityGroupMemberships() != null)
            sb.append("DBSecurityGroupMemberships: ").append(getDBSecurityGroupMemberships()).append(",");
        if (getVpcSecurityGroupMemberships() != null)
            sb.append("VpcSecurityGroupMemberships: ").append(getVpcSecurityGroupMemberships());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Option == false)
            return false;
        Option other = (Option) obj;
        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        if (other.getOptionDescription() == null ^ this.getOptionDescription() == null)
            return false;
        if (other.getOptionDescription() != null && other.getOptionDescription().equals(this.getOptionDescription()) == false)
            return false;
        if (other.getPersistent() == null ^ this.getPersistent() == null)
            return false;
        if (other.getPersistent() != null && other.getPersistent().equals(this.getPersistent()) == false)
            return false;
        if (other.getPermanent() == null ^ this.getPermanent() == null)
            return false;
        if (other.getPermanent() != null && other.getPermanent().equals(this.getPermanent()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getOptionVersion() == null ^ this.getOptionVersion() == null)
            return false;
        if (other.getOptionVersion() != null && other.getOptionVersion().equals(this.getOptionVersion()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getDBSecurityGroupMemberships() == null ^ this.getDBSecurityGroupMemberships() == null)
            return false;
        if (other.getDBSecurityGroupMemberships() != null && other.getDBSecurityGroupMemberships().equals(this.getDBSecurityGroupMemberships()) == false)
            return false;
        if (other.getVpcSecurityGroupMemberships() == null ^ this.getVpcSecurityGroupMemberships() == null)
            return false;
        if (other.getVpcSecurityGroupMemberships() != null && other.getVpcSecurityGroupMemberships().equals(this.getVpcSecurityGroupMemberships()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode + ((getOptionDescription() == null) ? 0 : getOptionDescription().hashCode());
        hashCode = prime * hashCode + ((getPersistent() == null) ? 0 : getPersistent().hashCode());
        hashCode = prime * hashCode + ((getPermanent() == null) ? 0 : getPermanent().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getOptionVersion() == null) ? 0 : getOptionVersion().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupMemberships() == null) ? 0 : getVpcSecurityGroupMemberships().hashCode());
        return hashCode;
    }

    @Override
    public Option clone() {
        try {
            return (Option) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
