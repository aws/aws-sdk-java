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
 * <p>
 * 
 * </p>
 */
public class OptionGroup {

    /**
     * Specifies the name of the option group.
     */
    private String optionGroupName;

    private String optionGroupDescription;

    /**
     * Engine name that this option group can be applied to.
     */
    private String engineName;

    /**
     * Indicates the major engine version associated with this option group.
     */
    private String majorEngineVersion;

    private java.util.List<Option> options;

    /**
     * Specifies the name of the option group.
     *
     * @return Specifies the name of the option group.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Specifies the name of the option group.
     *
     * @param optionGroupName Specifies the name of the option group.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Specifies the name of the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName Specifies the name of the option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroup withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }
    
    
    /**
     * Returns the value of the OptionGroupDescription property for this
     * object.
     *
     * @return The value of the OptionGroupDescription property for this object.
     */
    public String getOptionGroupDescription() {
        return optionGroupDescription;
    }
    
    /**
     * Sets the value of the OptionGroupDescription property for this object.
     *
     * @param optionGroupDescription The new value for the OptionGroupDescription property for this object.
     */
    public void setOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }
    
    /**
     * Sets the value of the OptionGroupDescription property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupDescription The new value for the OptionGroupDescription property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroup withOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
        return this;
    }
    
    
    /**
     * Engine name that this option group can be applied to.
     *
     * @return Engine name that this option group can be applied to.
     */
    public String getEngineName() {
        return engineName;
    }
    
    /**
     * Engine name that this option group can be applied to.
     *
     * @param engineName Engine name that this option group can be applied to.
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
    
    /**
     * Engine name that this option group can be applied to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineName Engine name that this option group can be applied to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroup withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    
    
    /**
     * Indicates the major engine version associated with this option group.
     *
     * @return Indicates the major engine version associated with this option group.
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }
    
    /**
     * Indicates the major engine version associated with this option group.
     *
     * @param majorEngineVersion Indicates the major engine version associated with this option group.
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }
    
    /**
     * Indicates the major engine version associated with this option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param majorEngineVersion Indicates the major engine version associated with this option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroup withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }
    
    
    /**
     * Returns the value of the Options property for this object.
     *
     * @return The value of the Options property for this object.
     */
    public java.util.List<Option> getOptions() {
        
        if (options == null) {
            options = new java.util.ArrayList<Option>();
        }
        return options;
    }
    
    /**
     * Sets the value of the Options property for this object.
     *
     * @param options The new value for the Options property for this object.
     */
    public void setOptions(java.util.Collection<Option> options) {
        if (options == null) {
            this.options = null;
            return;
        }

        java.util.List<Option> optionsCopy = new java.util.ArrayList<Option>(options.size());
        optionsCopy.addAll(options);
        this.options = optionsCopy;
    }
    
    /**
     * Sets the value of the Options property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The new value for the Options property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroup withOptions(Option... options) {
        if (getOptions() == null) setOptions(new java.util.ArrayList<Option>(options.length));
        for (Option value : options) {
            getOptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Options property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The new value for the Options property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroup withOptions(java.util.Collection<Option> options) {
        if (options == null) {
            this.options = null;
        } else {
            java.util.List<Option> optionsCopy = new java.util.ArrayList<Option>(options.size());
            optionsCopy.addAll(options);
            this.options = optionsCopy;
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
        if (optionGroupName != null) sb.append("OptionGroupName: " + optionGroupName + ", ");
        if (optionGroupDescription != null) sb.append("OptionGroupDescription: " + optionGroupDescription + ", ");
        if (engineName != null) sb.append("EngineName: " + engineName + ", ");
        if (majorEngineVersion != null) sb.append("MajorEngineVersion: " + majorEngineVersion + ", ");
        if (options != null) sb.append("Options: " + options + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupDescription() == null) ? 0 : getOptionGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode()); 
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof OptionGroup == false) return false;
        OptionGroup other = (OptionGroup)obj;
        
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getOptionGroupDescription() == null ^ this.getOptionGroupDescription() == null) return false;
        if (other.getOptionGroupDescription() != null && other.getOptionGroupDescription().equals(this.getOptionGroupDescription()) == false) return false; 
        if (other.getEngineName() == null ^ this.getEngineName() == null) return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false) return false; 
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null) return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false) return false; 
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        return true;
    }
    
}
    