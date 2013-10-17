/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * A list of all available options
 * </p>
 */
public class OptionConfiguration implements Serializable {

    /**
     * The configuration of options to include in a group.
     */
    private String optionName;

    /**
     * The optional port for the option.
     */
    private Integer port;

    /**
     * A list of DBSecurityGroupMemebrship name strings used for this option.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupMemberships;

    /**
     * A list of VpcSecurityGroupMemebrship name strings used for this
     * option.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupMemberships;

    /**
     * The option settings to include in an option group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting> optionSettings;

    /**
     * The configuration of options to include in a group.
     *
     * @return The configuration of options to include in a group.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * The configuration of options to include in a group.
     *
     * @param optionName The configuration of options to include in a group.
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * The configuration of options to include in a group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName The configuration of options to include in a group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * The optional port for the option.
     *
     * @return The optional port for the option.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The optional port for the option.
     *
     * @param port The optional port for the option.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The optional port for the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The optional port for the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * A list of DBSecurityGroupMemebrship name strings used for this option.
     *
     * @return A list of DBSecurityGroupMemebrship name strings used for this option.
     */
    public java.util.List<String> getDBSecurityGroupMemberships() {
        if (dBSecurityGroupMemberships == null) {
              dBSecurityGroupMemberships = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dBSecurityGroupMemberships.setAutoConstruct(true);
        }
        return dBSecurityGroupMemberships;
    }
    
    /**
     * A list of DBSecurityGroupMemebrship name strings used for this option.
     *
     * @param dBSecurityGroupMemberships A list of DBSecurityGroupMemebrship name strings used for this option.
     */
    public void setDBSecurityGroupMemberships(java.util.Collection<String> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroupMemberships.size());
        dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
        this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
    }
    
    /**
     * A list of DBSecurityGroupMemebrship name strings used for this option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships A list of DBSecurityGroupMemebrship name strings used for this option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withDBSecurityGroupMemberships(String... dBSecurityGroupMemberships) {
        if (getDBSecurityGroupMemberships() == null) setDBSecurityGroupMemberships(new java.util.ArrayList<String>(dBSecurityGroupMemberships.length));
        for (String value : dBSecurityGroupMemberships) {
            getDBSecurityGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * A list of DBSecurityGroupMemebrship name strings used for this option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships A list of DBSecurityGroupMemebrship name strings used for this option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withDBSecurityGroupMemberships(java.util.Collection<String> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroupMemberships.size());
            dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
            this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
        }

        return this;
    }

    /**
     * A list of VpcSecurityGroupMemebrship name strings used for this
     * option.
     *
     * @return A list of VpcSecurityGroupMemebrship name strings used for this
     *         option.
     */
    public java.util.List<String> getVpcSecurityGroupMemberships() {
        if (vpcSecurityGroupMemberships == null) {
              vpcSecurityGroupMemberships = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupMemberships.setAutoConstruct(true);
        }
        return vpcSecurityGroupMemberships;
    }
    
    /**
     * A list of VpcSecurityGroupMemebrship name strings used for this
     * option.
     *
     * @param vpcSecurityGroupMemberships A list of VpcSecurityGroupMemebrship name strings used for this
     *         option.
     */
    public void setVpcSecurityGroupMemberships(java.util.Collection<String> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupMemberships.size());
        vpcSecurityGroupMembershipsCopy.addAll(vpcSecurityGroupMemberships);
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMembershipsCopy;
    }
    
    /**
     * A list of VpcSecurityGroupMemebrship name strings used for this
     * option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupMemberships A list of VpcSecurityGroupMemebrship name strings used for this
     *         option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withVpcSecurityGroupMemberships(String... vpcSecurityGroupMemberships) {
        if (getVpcSecurityGroupMemberships() == null) setVpcSecurityGroupMemberships(new java.util.ArrayList<String>(vpcSecurityGroupMemberships.length));
        for (String value : vpcSecurityGroupMemberships) {
            getVpcSecurityGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * A list of VpcSecurityGroupMemebrship name strings used for this
     * option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupMemberships A list of VpcSecurityGroupMemebrship name strings used for this
     *         option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withVpcSecurityGroupMemberships(java.util.Collection<String> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupMemberships.size());
            vpcSecurityGroupMembershipsCopy.addAll(vpcSecurityGroupMemberships);
            this.vpcSecurityGroupMemberships = vpcSecurityGroupMembershipsCopy;
        }

        return this;
    }

    /**
     * The option settings to include in an option group.
     *
     * @return The option settings to include in an option group.
     */
    public java.util.List<OptionSetting> getOptionSettings() {
        if (optionSettings == null) {
              optionSettings = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting>();
              optionSettings.setAutoConstruct(true);
        }
        return optionSettings;
    }
    
    /**
     * The option settings to include in an option group.
     *
     * @param optionSettings The option settings to include in an option group.
     */
    public void setOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting> optionSettingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting>(optionSettings.size());
        optionSettingsCopy.addAll(optionSettings);
        this.optionSettings = optionSettingsCopy;
    }
    
    /**
     * The option settings to include in an option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings The option settings to include in an option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withOptionSettings(OptionSetting... optionSettings) {
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<OptionSetting>(optionSettings.length));
        for (OptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * The option settings to include in an option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings The option settings to include in an option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionConfiguration withOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting> optionSettingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting>(optionSettings.size());
            optionSettingsCopy.addAll(optionSettings);
            this.optionSettings = optionSettingsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOptionName() != null) sb.append("OptionName: " + getOptionName() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getDBSecurityGroupMemberships() != null) sb.append("DBSecurityGroupMemberships: " + getDBSecurityGroupMemberships() + ",");
        if (getVpcSecurityGroupMemberships() != null) sb.append("VpcSecurityGroupMemberships: " + getVpcSecurityGroupMemberships() + ",");
        if (getOptionSettings() != null) sb.append("OptionSettings: " + getOptionSettings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupMemberships() == null) ? 0 : getVpcSecurityGroupMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OptionConfiguration == false) return false;
        OptionConfiguration other = (OptionConfiguration)obj;
        
        if (other.getOptionName() == null ^ this.getOptionName() == null) return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getDBSecurityGroupMemberships() == null ^ this.getDBSecurityGroupMemberships() == null) return false;
        if (other.getDBSecurityGroupMemberships() != null && other.getDBSecurityGroupMemberships().equals(this.getDBSecurityGroupMemberships()) == false) return false; 
        if (other.getVpcSecurityGroupMemberships() == null ^ this.getVpcSecurityGroupMemberships() == null) return false;
        if (other.getVpcSecurityGroupMemberships() != null && other.getVpcSecurityGroupMemberships().equals(this.getVpcSecurityGroupMemberships()) == false) return false; 
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null) return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false) return false; 
        return true;
    }
    
}
    