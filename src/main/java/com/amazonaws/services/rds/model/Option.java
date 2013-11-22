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
 * Option details.
 * </p>
 */
public class Option implements Serializable {

    /**
     * The name of the option.
     */
    private String optionName;

    /**
     * The description of the option.
     */
    private String optionDescription;

    /**
     * Indicate if this option is persistent.
     */
    private Boolean persistent;

    /**
     * Indicate if this option is permanent.
     */
    private Boolean permanent;

    /**
     * If required, the port configured for this option to use.
     */
    private Integer port;

    /**
     * The option settings for this option.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting> optionSettings;

    /**
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership> dBSecurityGroupMemberships;

    /**
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupMemberships;

    /**
     * The name of the option.
     *
     * @return The name of the option.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * The name of the option.
     *
     * @param optionName The name of the option.
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * The name of the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName The name of the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * The description of the option.
     *
     * @return The description of the option.
     */
    public String getOptionDescription() {
        return optionDescription;
    }
    
    /**
     * The description of the option.
     *
     * @param optionDescription The description of the option.
     */
    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }
    
    /**
     * The description of the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionDescription The description of the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
        return this;
    }

    /**
     * Indicate if this option is persistent.
     *
     * @return Indicate if this option is persistent.
     */
    public Boolean isPersistent() {
        return persistent;
    }
    
    /**
     * Indicate if this option is persistent.
     *
     * @param persistent Indicate if this option is persistent.
     */
    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }
    
    /**
     * Indicate if this option is persistent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param persistent Indicate if this option is persistent.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withPersistent(Boolean persistent) {
        this.persistent = persistent;
        return this;
    }

    /**
     * Indicate if this option is persistent.
     *
     * @return Indicate if this option is persistent.
     */
    public Boolean getPersistent() {
        return persistent;
    }

    /**
     * Indicate if this option is permanent.
     *
     * @return Indicate if this option is permanent.
     */
    public Boolean isPermanent() {
        return permanent;
    }
    
    /**
     * Indicate if this option is permanent.
     *
     * @param permanent Indicate if this option is permanent.
     */
    public void setPermanent(Boolean permanent) {
        this.permanent = permanent;
    }
    
    /**
     * Indicate if this option is permanent.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param permanent Indicate if this option is permanent.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withPermanent(Boolean permanent) {
        this.permanent = permanent;
        return this;
    }

    /**
     * Indicate if this option is permanent.
     *
     * @return Indicate if this option is permanent.
     */
    public Boolean getPermanent() {
        return permanent;
    }

    /**
     * If required, the port configured for this option to use.
     *
     * @return If required, the port configured for this option to use.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * If required, the port configured for this option to use.
     *
     * @param port If required, the port configured for this option to use.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * If required, the port configured for this option to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port If required, the port configured for this option to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The option settings for this option.
     *
     * @return The option settings for this option.
     */
    public java.util.List<OptionSetting> getOptionSettings() {
        if (optionSettings == null) {
              optionSettings = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSetting>();
              optionSettings.setAutoConstruct(true);
        }
        return optionSettings;
    }
    
    /**
     * The option settings for this option.
     *
     * @param optionSettings The option settings for this option.
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
     * The option settings for this option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings The option settings for this option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withOptionSettings(OptionSetting... optionSettings) {
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<OptionSetting>(optionSettings.length));
        for (OptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * The option settings for this option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings The option settings for this option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withOptionSettings(java.util.Collection<OptionSetting> optionSettings) {
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
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     *
     * @return If the option requires access to a port, then this DB security group
     *         allows access to the port.
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroupMemberships() {
        if (dBSecurityGroupMemberships == null) {
              dBSecurityGroupMemberships = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership>();
              dBSecurityGroupMemberships.setAutoConstruct(true);
        }
        return dBSecurityGroupMemberships;
    }
    
    /**
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     *
     * @param dBSecurityGroupMemberships If the option requires access to a port, then this DB security group
     *         allows access to the port.
     */
    public void setDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership> dBSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership>(dBSecurityGroupMemberships.size());
        dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
        this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
    }
    
    /**
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships If the option requires access to a port, then this DB security group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withDBSecurityGroupMemberships(DBSecurityGroupMembership... dBSecurityGroupMemberships) {
        if (getDBSecurityGroupMemberships() == null) setDBSecurityGroupMemberships(new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.length));
        for (DBSecurityGroupMembership value : dBSecurityGroupMemberships) {
            getDBSecurityGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * If the option requires access to a port, then this DB security group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships If the option requires access to a port, then this DB security group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership> dBSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership>(dBSecurityGroupMemberships.size());
            dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
            this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
        }

        return this;
    }

    /**
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     *
     * @return If the option requires access to a port, then this VPC security group
     *         allows access to the port.
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroupMemberships() {
        if (vpcSecurityGroupMemberships == null) {
              vpcSecurityGroupMemberships = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>();
              vpcSecurityGroupMemberships.setAutoConstruct(true);
        }
        return vpcSecurityGroupMemberships;
    }
    
    /**
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     *
     * @param vpcSecurityGroupMemberships If the option requires access to a port, then this VPC security group
     *         allows access to the port.
     */
    public void setVpcSecurityGroupMemberships(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.size());
        vpcSecurityGroupMembershipsCopy.addAll(vpcSecurityGroupMemberships);
        this.vpcSecurityGroupMemberships = vpcSecurityGroupMembershipsCopy;
    }
    
    /**
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupMemberships If the option requires access to a port, then this VPC security group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withVpcSecurityGroupMemberships(VpcSecurityGroupMembership... vpcSecurityGroupMemberships) {
        if (getVpcSecurityGroupMemberships() == null) setVpcSecurityGroupMemberships(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.length));
        for (VpcSecurityGroupMembership value : vpcSecurityGroupMemberships) {
            getVpcSecurityGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * If the option requires access to a port, then this VPC security group
     * allows access to the port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupMemberships If the option requires access to a port, then this VPC security group
     *         allows access to the port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Option withVpcSecurityGroupMemberships(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroupMemberships) {
        if (vpcSecurityGroupMemberships == null) {
            this.vpcSecurityGroupMemberships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>(vpcSecurityGroupMemberships.size());
            vpcSecurityGroupMembershipsCopy.addAll(vpcSecurityGroupMemberships);
            this.vpcSecurityGroupMemberships = vpcSecurityGroupMembershipsCopy;
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
        if (getOptionDescription() != null) sb.append("OptionDescription: " + getOptionDescription() + ",");
        if (isPersistent() != null) sb.append("Persistent: " + isPersistent() + ",");
        if (isPermanent() != null) sb.append("Permanent: " + isPermanent() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getOptionSettings() != null) sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getDBSecurityGroupMemberships() != null) sb.append("DBSecurityGroupMemberships: " + getDBSecurityGroupMemberships() + ",");
        if (getVpcSecurityGroupMemberships() != null) sb.append("VpcSecurityGroupMemberships: " + getVpcSecurityGroupMemberships() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode()); 
        hashCode = prime * hashCode + ((getOptionDescription() == null) ? 0 : getOptionDescription().hashCode()); 
        hashCode = prime * hashCode + ((isPersistent() == null) ? 0 : isPersistent().hashCode()); 
        hashCode = prime * hashCode + ((isPermanent() == null) ? 0 : isPermanent().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupMemberships() == null) ? 0 : getVpcSecurityGroupMemberships().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Option == false) return false;
        Option other = (Option)obj;
        
        if (other.getOptionName() == null ^ this.getOptionName() == null) return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false) return false; 
        if (other.getOptionDescription() == null ^ this.getOptionDescription() == null) return false;
        if (other.getOptionDescription() != null && other.getOptionDescription().equals(this.getOptionDescription()) == false) return false; 
        if (other.isPersistent() == null ^ this.isPersistent() == null) return false;
        if (other.isPersistent() != null && other.isPersistent().equals(this.isPersistent()) == false) return false; 
        if (other.isPermanent() == null ^ this.isPermanent() == null) return false;
        if (other.isPermanent() != null && other.isPermanent().equals(this.isPermanent()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null) return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false) return false; 
        if (other.getDBSecurityGroupMemberships() == null ^ this.getDBSecurityGroupMemberships() == null) return false;
        if (other.getDBSecurityGroupMemberships() != null && other.getDBSecurityGroupMemberships().equals(this.getDBSecurityGroupMemberships()) == false) return false; 
        if (other.getVpcSecurityGroupMemberships() == null ^ this.getVpcSecurityGroupMemberships() == null) return false;
        if (other.getVpcSecurityGroupMemberships() != null && other.getVpcSecurityGroupMemberships().equals(this.getVpcSecurityGroupMemberships()) == false) return false; 
        return true;
    }
    
}
    