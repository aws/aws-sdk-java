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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyOptionGroup(ModifyOptionGroupRequest) ModifyOptionGroup operation}.
 * <p>
 * Modifies an existing option group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyOptionGroup(ModifyOptionGroupRequest)
 */
public class ModifyOptionGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the option group to be modified. <p> <!-- Note that
     * persistent options, such as the TDE_SQLServer option for Microsoft SQL
     * Server, cannot be removed from an option group while DB instances are
     * associated with the option group. --> Permanent options, such as the
     * TDE option for Oracle Advanced Security TDE, cannot be removed from an
     * option group, and that option group cannot be removed from a DB
     * instance once it is associated with a DB instance
     */
    private String optionGroupName;

    /**
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OptionConfiguration> optionsToInclude;

    /**
     * Options in this list are removed from the option group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> optionsToRemove;

    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * option group.
     */
    private Boolean applyImmediately;

    /**
     * The name of the option group to be modified. <p> <!-- Note that
     * persistent options, such as the TDE_SQLServer option for Microsoft SQL
     * Server, cannot be removed from an option group while DB instances are
     * associated with the option group. --> Permanent options, such as the
     * TDE option for Oracle Advanced Security TDE, cannot be removed from an
     * option group, and that option group cannot be removed from a DB
     * instance once it is associated with a DB instance
     *
     * @return The name of the option group to be modified. <p> <!-- Note that
     *         persistent options, such as the TDE_SQLServer option for Microsoft SQL
     *         Server, cannot be removed from an option group while DB instances are
     *         associated with the option group. --> Permanent options, such as the
     *         TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *         option group, and that option group cannot be removed from a DB
     *         instance once it is associated with a DB instance
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group to be modified. <p> <!-- Note that
     * persistent options, such as the TDE_SQLServer option for Microsoft SQL
     * Server, cannot be removed from an option group while DB instances are
     * associated with the option group. --> Permanent options, such as the
     * TDE option for Oracle Advanced Security TDE, cannot be removed from an
     * option group, and that option group cannot be removed from a DB
     * instance once it is associated with a DB instance
     *
     * @param optionGroupName The name of the option group to be modified. <p> <!-- Note that
     *         persistent options, such as the TDE_SQLServer option for Microsoft SQL
     *         Server, cannot be removed from an option group while DB instances are
     *         associated with the option group. --> Permanent options, such as the
     *         TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *         option group, and that option group cannot be removed from a DB
     *         instance once it is associated with a DB instance
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group to be modified. <p> <!-- Note that
     * persistent options, such as the TDE_SQLServer option for Microsoft SQL
     * Server, cannot be removed from an option group while DB instances are
     * associated with the option group. --> Permanent options, such as the
     * TDE option for Oracle Advanced Security TDE, cannot be removed from an
     * option group, and that option group cannot be removed from a DB
     * instance once it is associated with a DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group to be modified. <p> <!-- Note that
     *         persistent options, such as the TDE_SQLServer option for Microsoft SQL
     *         Server, cannot be removed from an option group while DB instances are
     *         associated with the option group. --> Permanent options, such as the
     *         TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *         option group, and that option group cannot be removed from a DB
     *         instance once it is associated with a DB instance
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyOptionGroupRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     *
     * @return Options in this list are added to the option group or, if already
     *         present, the specified configuration is used to update the existing
     *         configuration.
     */
    public java.util.List<OptionConfiguration> getOptionsToInclude() {
        if (optionsToInclude == null) {
              optionsToInclude = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionConfiguration>();
              optionsToInclude.setAutoConstruct(true);
        }
        return optionsToInclude;
    }
    
    /**
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     *
     * @param optionsToInclude Options in this list are added to the option group or, if already
     *         present, the specified configuration is used to update the existing
     *         configuration.
     */
    public void setOptionsToInclude(java.util.Collection<OptionConfiguration> optionsToInclude) {
        if (optionsToInclude == null) {
            this.optionsToInclude = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OptionConfiguration> optionsToIncludeCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionConfiguration>(optionsToInclude.size());
        optionsToIncludeCopy.addAll(optionsToInclude);
        this.optionsToInclude = optionsToIncludeCopy;
    }
    
    /**
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToInclude Options in this list are added to the option group or, if already
     *         present, the specified configuration is used to update the existing
     *         configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyOptionGroupRequest withOptionsToInclude(OptionConfiguration... optionsToInclude) {
        if (getOptionsToInclude() == null) setOptionsToInclude(new java.util.ArrayList<OptionConfiguration>(optionsToInclude.length));
        for (OptionConfiguration value : optionsToInclude) {
            getOptionsToInclude().add(value);
        }
        return this;
    }
    
    /**
     * Options in this list are added to the option group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToInclude Options in this list are added to the option group or, if already
     *         present, the specified configuration is used to update the existing
     *         configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyOptionGroupRequest withOptionsToInclude(java.util.Collection<OptionConfiguration> optionsToInclude) {
        if (optionsToInclude == null) {
            this.optionsToInclude = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OptionConfiguration> optionsToIncludeCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionConfiguration>(optionsToInclude.size());
            optionsToIncludeCopy.addAll(optionsToInclude);
            this.optionsToInclude = optionsToIncludeCopy;
        }

        return this;
    }

    /**
     * Options in this list are removed from the option group.
     *
     * @return Options in this list are removed from the option group.
     */
    public java.util.List<String> getOptionsToRemove() {
        if (optionsToRemove == null) {
              optionsToRemove = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              optionsToRemove.setAutoConstruct(true);
        }
        return optionsToRemove;
    }
    
    /**
     * Options in this list are removed from the option group.
     *
     * @param optionsToRemove Options in this list are removed from the option group.
     */
    public void setOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> optionsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(optionsToRemove.size());
        optionsToRemoveCopy.addAll(optionsToRemove);
        this.optionsToRemove = optionsToRemoveCopy;
    }
    
    /**
     * Options in this list are removed from the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove Options in this list are removed from the option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyOptionGroupRequest withOptionsToRemove(String... optionsToRemove) {
        if (getOptionsToRemove() == null) setOptionsToRemove(new java.util.ArrayList<String>(optionsToRemove.length));
        for (String value : optionsToRemove) {
            getOptionsToRemove().add(value);
        }
        return this;
    }
    
    /**
     * Options in this list are removed from the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove Options in this list are removed from the option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyOptionGroupRequest withOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> optionsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(optionsToRemove.size());
            optionsToRemoveCopy.addAll(optionsToRemove);
            this.optionsToRemove = optionsToRemoveCopy;
        }

        return this;
    }

    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * option group.
     *
     * @return Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         option group.
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * option group.
     *
     * @param applyImmediately Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         option group.
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ModifyOptionGroupRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * option group.
     *
     * @return Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         option group.
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
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
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getOptionsToInclude() != null) sb.append("OptionsToInclude: " + getOptionsToInclude() + ",");
        if (getOptionsToRemove() != null) sb.append("OptionsToRemove: " + getOptionsToRemove() + ",");
        if (isApplyImmediately() != null) sb.append("ApplyImmediately: " + isApplyImmediately() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getOptionsToInclude() == null) ? 0 : getOptionsToInclude().hashCode()); 
        hashCode = prime * hashCode + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyOptionGroupRequest == false) return false;
        ModifyOptionGroupRequest other = (ModifyOptionGroupRequest)obj;
        
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getOptionsToInclude() == null ^ this.getOptionsToInclude() == null) return false;
        if (other.getOptionsToInclude() != null && other.getOptionsToInclude().equals(this.getOptionsToInclude()) == false) return false; 
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null) return false;
        if (other.getOptionsToRemove() != null && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false) return false; 
        if (other.isApplyImmediately() == null ^ this.isApplyImmediately() == null) return false;
        if (other.isApplyImmediately() != null && other.isApplyImmediately().equals(this.isApplyImmediately()) == false) return false; 
        return true;
    }
    
}
    