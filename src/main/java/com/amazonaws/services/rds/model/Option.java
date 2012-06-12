/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Option
 */
public class Option {

    /**
     * The name of the option.
     */
    private String optionName;

    /**
     * The description of the option.
     */
    private String optionDescription;

    /**
     * If required, the port configured for this option to use.
     */
    private Integer port;

    private java.util.List<DBSecurityGroupMembership> dBSecurityGroupMemberships;

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
     * Returns the value of the DBSecurityGroupMemberships property for this
     * object.
     *
     * @return The value of the DBSecurityGroupMemberships property for this object.
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroupMemberships() {
        
        if (dBSecurityGroupMemberships == null) {
            dBSecurityGroupMemberships = new java.util.ArrayList<DBSecurityGroupMembership>();
        }
        return dBSecurityGroupMemberships;
    }
    
    /**
     * Sets the value of the DBSecurityGroupMemberships property for this
     * object.
     *
     * @param dBSecurityGroupMemberships The new value for the DBSecurityGroupMemberships property for this
     *         object.
     */
    public void setDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        java.util.List<DBSecurityGroupMembership> dBSecurityGroupMembershipsCopy = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.size());
        dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
        this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
    }
    
    /**
     * Sets the value of the DBSecurityGroupMemberships property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships The new value for the DBSecurityGroupMemberships property for this
     *         object.
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
     * Sets the value of the DBSecurityGroupMemberships property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroupMemberships The new value for the DBSecurityGroupMemberships property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Option withDBSecurityGroupMemberships(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
        } else {
            java.util.List<DBSecurityGroupMembership> dBSecurityGroupMembershipsCopy = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroupMemberships.size());
            dBSecurityGroupMembershipsCopy.addAll(dBSecurityGroupMemberships);
            this.dBSecurityGroupMemberships = dBSecurityGroupMembershipsCopy;
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
        if (optionName != null) sb.append("OptionName: " + optionName + ", ");
        if (optionDescription != null) sb.append("OptionDescription: " + optionDescription + ", ");
        if (port != null) sb.append("Port: " + port + ", ");
        if (dBSecurityGroupMemberships != null) sb.append("DBSecurityGroupMemberships: " + dBSecurityGroupMemberships + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode()); 
        hashCode = prime * hashCode + ((getOptionDescription() == null) ? 0 : getOptionDescription().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode()); 
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
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getDBSecurityGroupMemberships() == null ^ this.getDBSecurityGroupMemberships() == null) return false;
        if (other.getDBSecurityGroupMemberships() != null && other.getDBSecurityGroupMemberships().equals(this.getDBSecurityGroupMemberships()) == false) return false; 
        return true;
    }
    
}
    