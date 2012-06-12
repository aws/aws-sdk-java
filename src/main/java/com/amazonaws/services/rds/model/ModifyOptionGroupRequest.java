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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyOptionGroup(ModifyOptionGroupRequest) ModifyOptionGroup operation}.
 * <p>
 * Modifies an existing Option Group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyOptionGroup(ModifyOptionGroupRequest)
 */
public class ModifyOptionGroupRequest extends AmazonWebServiceRequest {

    /**
     * The name of the option group to be modified.
     */
    private String optionGroupName;

    /**
     * Options in this list are added to the Option Group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     */
    private java.util.List<OptionConfiguration> optionsToInclude;

    /**
     * Options in this list are removed from the Option Group.
     */
    private java.util.List<String> optionsToRemove;

    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * Option Group.
     */
    private Boolean applyImmediately;

    /**
     * The name of the option group to be modified.
     *
     * @return The name of the option group to be modified.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group to be modified.
     *
     * @param optionGroupName The name of the option group to be modified.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group to be modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group to be modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyOptionGroupRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }
    
    
    /**
     * Options in this list are added to the Option Group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     *
     * @return Options in this list are added to the Option Group or, if already
     *         present, the specified configuration is used to update the existing
     *         configuration.
     */
    public java.util.List<OptionConfiguration> getOptionsToInclude() {
        
        if (optionsToInclude == null) {
            optionsToInclude = new java.util.ArrayList<OptionConfiguration>();
        }
        return optionsToInclude;
    }
    
    /**
     * Options in this list are added to the Option Group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     *
     * @param optionsToInclude Options in this list are added to the Option Group or, if already
     *         present, the specified configuration is used to update the existing
     *         configuration.
     */
    public void setOptionsToInclude(java.util.Collection<OptionConfiguration> optionsToInclude) {
        if (optionsToInclude == null) {
            this.optionsToInclude = null;
            return;
        }

        java.util.List<OptionConfiguration> optionsToIncludeCopy = new java.util.ArrayList<OptionConfiguration>(optionsToInclude.size());
        optionsToIncludeCopy.addAll(optionsToInclude);
        this.optionsToInclude = optionsToIncludeCopy;
    }
    
    /**
     * Options in this list are added to the Option Group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToInclude Options in this list are added to the Option Group or, if already
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
     * Options in this list are added to the Option Group or, if already
     * present, the specified configuration is used to update the existing
     * configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToInclude Options in this list are added to the Option Group or, if already
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
            java.util.List<OptionConfiguration> optionsToIncludeCopy = new java.util.ArrayList<OptionConfiguration>(optionsToInclude.size());
            optionsToIncludeCopy.addAll(optionsToInclude);
            this.optionsToInclude = optionsToIncludeCopy;
        }

        return this;
    }
    
    /**
     * Options in this list are removed from the Option Group.
     *
     * @return Options in this list are removed from the Option Group.
     */
    public java.util.List<String> getOptionsToRemove() {
        
        if (optionsToRemove == null) {
            optionsToRemove = new java.util.ArrayList<String>();
        }
        return optionsToRemove;
    }
    
    /**
     * Options in this list are removed from the Option Group.
     *
     * @param optionsToRemove Options in this list are removed from the Option Group.
     */
    public void setOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }

        java.util.List<String> optionsToRemoveCopy = new java.util.ArrayList<String>(optionsToRemove.size());
        optionsToRemoveCopy.addAll(optionsToRemove);
        this.optionsToRemove = optionsToRemoveCopy;
    }
    
    /**
     * Options in this list are removed from the Option Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove Options in this list are removed from the Option Group.
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
     * Options in this list are removed from the Option Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove Options in this list are removed from the Option Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyOptionGroupRequest withOptionsToRemove(java.util.Collection<String> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
        } else {
            java.util.List<String> optionsToRemoveCopy = new java.util.ArrayList<String>(optionsToRemove.size());
            optionsToRemoveCopy.addAll(optionsToRemove);
            this.optionsToRemove = optionsToRemoveCopy;
        }

        return this;
    }
    
    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * Option Group.
     *
     * @return Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         Option Group.
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * Option Group.
     *
     * @param applyImmediately Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         Option Group.
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * Indicates whether the changes should be applied immediately, or during
     * the next maintenance window for each instance associated with the
     * Option Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         Option Group.
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
     * Option Group.
     *
     * @return Indicates whether the changes should be applied immediately, or during
     *         the next maintenance window for each instance associated with the
     *         Option Group.
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
        if (optionGroupName != null) sb.append("OptionGroupName: " + optionGroupName + ", ");
        if (optionsToInclude != null) sb.append("OptionsToInclude: " + optionsToInclude + ", ");
        if (optionsToRemove != null) sb.append("OptionsToRemove: " + optionsToRemove + ", ");
        if (applyImmediately != null) sb.append("ApplyImmediately: " + applyImmediately + ", ");
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
    