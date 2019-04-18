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
 * A list of all available options
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/OptionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     */
    private String optionName;
    /**
     * <p>
     * The optional port for the option.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The version for the option.
     * </p>
     */
    private String optionVersion;
    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBSecurityGroupMemberships;
    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupMemberships;
    /**
     * <p>
     * The option settings to include in an option group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionSetting> optionSettings;

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     * 
     * @param optionName
     *        The configuration of options to include in a group.
     */

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     * 
     * @return The configuration of options to include in a group.
     */

    public String getOptionName() {
        return this.optionName;
    }

    /**
     * <p>
     * The configuration of options to include in a group.
     * </p>
     * 
     * @param optionName
     *        The configuration of options to include in a group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withOptionName(String optionName) {
        setOptionName(optionName);
        return this;
    }

    /**
     * <p>
     * The optional port for the option.
     * </p>
     * 
     * @param port
     *        The optional port for the option.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The optional port for the option.
     * </p>
     * 
     * @return The optional port for the option.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The optional port for the option.
     * </p>
     * 
     * @param port
     *        The optional port for the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The version for the option.
     * </p>
     * 
     * @param optionVersion
     *        The version for the option.
     */

    public void setOptionVersion(String optionVersion) {
        this.optionVersion = optionVersion;
    }

    /**
     * <p>
     * The version for the option.
     * </p>
     * 
     * @return The version for the option.
     */

    public String getOptionVersion() {
        return this.optionVersion;
    }

    /**
     * <p>
     * The version for the option.
     * </p>
     * 
     * @param optionVersion
     *        The version for the option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withOptionVersion(String optionVersion) {
        setOptionVersion(optionVersion);
        return this;
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     * 
     * @return A list of DBSecurityGroupMembership name strings used for this option.
     */

    public java.util.List<String> getDBSecurityGroupMemberships() {
        if (dBSecurityGroupMemberships == null) {
            dBSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBSecurityGroupMemberships;
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     * 
     * @param dBSecurityGroupMemberships
     *        A list of DBSecurityGroupMembership name strings used for this option.
     */

    public void setDBSecurityGroupMemberships(java.util.Collection<String> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        this.dBSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroupMemberships);
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroupMemberships(java.util.Collection)} or
     * {@link #withDBSecurityGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroupMemberships
     *        A list of DBSecurityGroupMembership name strings used for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withDBSecurityGroupMemberships(String... dBSecurityGroupMemberships) {
        if (this.dBSecurityGroupMemberships == null) {
            setDBSecurityGroupMemberships(new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroupMemberships.length));
        }
        for (String ele : dBSecurityGroupMemberships) {
            this.dBSecurityGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DBSecurityGroupMembership name strings used for this option.
     * </p>
     * 
     * @param dBSecurityGroupMemberships
     *        A list of DBSecurityGroupMembership name strings used for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withDBSecurityGroupMemberships(java.util.Collection<String> dBSecurityGroupMemberships) {
        setDBSecurityGroupMemberships(dBSecurityGroupMemberships);
        return this;
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     * 
     * @return A list of VpcSecurityGroupMembership name strings used for this option.
     */

    public java.util.List<String> getVpcSecurityGroupMemberships() {
        if (vpcSecurityGroupMemberships == null) {
            vpcSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupMemberships;
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     * 
     * @param vpcSecurityGroupMemberships
     *        A list of VpcSecurityGroupMembership name strings used for this option.
     */

    public void setVpcSecurityGroupMemberships(java.util.Collection<String> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }

        this.vpcSecurityGroupMemberships = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupMemberships);
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupMemberships(java.util.Collection)} or
     * {@link #withVpcSecurityGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupMemberships
     *        A list of VpcSecurityGroupMembership name strings used for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withVpcSecurityGroupMemberships(String... vpcSecurityGroupMemberships) {
        if (this.vpcSecurityGroupMemberships == null) {
            setVpcSecurityGroupMemberships(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupMemberships.length));
        }
        for (String ele : vpcSecurityGroupMemberships) {
            this.vpcSecurityGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VpcSecurityGroupMembership name strings used for this option.
     * </p>
     * 
     * @param vpcSecurityGroupMemberships
     *        A list of VpcSecurityGroupMembership name strings used for this option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withVpcSecurityGroupMemberships(java.util.Collection<String> vpcSecurityGroupMemberships) {
        setVpcSecurityGroupMemberships(vpcSecurityGroupMemberships);
        return this;
    }

    /**
     * <p>
     * The option settings to include in an option group.
     * </p>
     * 
     * @return The option settings to include in an option group.
     */

    public java.util.List<OptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<OptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * The option settings to include in an option group.
     * </p>
     * 
     * @param optionSettings
     *        The option settings to include in an option group.
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
     * The option settings to include in an option group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        The option settings to include in an option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withOptionSettings(OptionSetting... optionSettings) {
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
     * The option settings to include in an option group.
     * </p>
     * 
     * @param optionSettings
     *        The option settings to include in an option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OptionConfiguration withOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
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
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getOptionVersion() != null)
            sb.append("OptionVersion: ").append(getOptionVersion()).append(",");
        if (getDBSecurityGroupMemberships() != null)
            sb.append("DBSecurityGroupMemberships: ").append(getDBSecurityGroupMemberships()).append(",");
        if (getVpcSecurityGroupMemberships() != null)
            sb.append("VpcSecurityGroupMemberships: ").append(getVpcSecurityGroupMemberships()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OptionConfiguration == false)
            return false;
        OptionConfiguration other = (OptionConfiguration) obj;
        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getOptionVersion() == null ^ this.getOptionVersion() == null)
            return false;
        if (other.getOptionVersion() != null && other.getOptionVersion().equals(this.getOptionVersion()) == false)
            return false;
        if (other.getDBSecurityGroupMemberships() == null ^ this.getDBSecurityGroupMemberships() == null)
            return false;
        if (other.getDBSecurityGroupMemberships() != null && other.getDBSecurityGroupMemberships().equals(this.getDBSecurityGroupMemberships()) == false)
            return false;
        if (other.getVpcSecurityGroupMemberships() == null ^ this.getVpcSecurityGroupMemberships() == null)
            return false;
        if (other.getVpcSecurityGroupMemberships() != null && other.getVpcSecurityGroupMemberships().equals(this.getVpcSecurityGroupMemberships()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getOptionVersion() == null) ? 0 : getOptionVersion().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupMemberships() == null) ? 0 : getVpcSecurityGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public OptionConfiguration clone() {
        try {
            return (OptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
