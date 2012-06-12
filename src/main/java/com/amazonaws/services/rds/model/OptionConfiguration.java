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
 * Option Configuration
 */
public class OptionConfiguration {

    private String optionName;

    private Integer port;

    private java.util.List<String> dBSecurityGroupMemberships;

    /**
     * Returns the value of the OptionName property for this object.
     *
     * @return The value of the OptionName property for this object.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * Sets the value of the OptionName property for this object.
     *
     * @param optionName The new value for the OptionName property for this object.
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * Sets the value of the OptionName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName The new value for the OptionName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionConfiguration withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }
    
    
    /**
     * Returns the value of the Port property for this object.
     *
     * @return The value of the Port property for this object.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Sets the value of the Port property for this object.
     *
     * @param port The new value for the Port property for this object.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Sets the value of the Port property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The new value for the Port property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    
    /**
     * Returns the value of the DBSecurityGroupMemberships property for this
     * object.
     *
     * @return The value of the DBSecurityGroupMemberships property for this object.
     */
    public java.util.List<String> getDBSecurityGroupMemberships() {
        
        if (dBSecurityGroupMemberships == null) {
            dBSecurityGroupMemberships = new java.util.ArrayList<String>();
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
    public void setDBSecurityGroupMemberships(java.util.Collection<String> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
            return;
        }

        java.util.List<String> dBSecurityGroupMembershipsCopy = new java.util.ArrayList<String>(dBSecurityGroupMemberships.size());
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
    public OptionConfiguration withDBSecurityGroupMemberships(String... dBSecurityGroupMemberships) {
        if (getDBSecurityGroupMemberships() == null) setDBSecurityGroupMemberships(new java.util.ArrayList<String>(dBSecurityGroupMemberships.length));
        for (String value : dBSecurityGroupMemberships) {
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
    public OptionConfiguration withDBSecurityGroupMemberships(java.util.Collection<String> dBSecurityGroupMemberships) {
        if (dBSecurityGroupMemberships == null) {
            this.dBSecurityGroupMemberships = null;
        } else {
            java.util.List<String> dBSecurityGroupMembershipsCopy = new java.util.ArrayList<String>(dBSecurityGroupMemberships.size());
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
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroupMemberships() == null) ? 0 : getDBSecurityGroupMemberships().hashCode()); 
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
        return true;
    }
    
}
    