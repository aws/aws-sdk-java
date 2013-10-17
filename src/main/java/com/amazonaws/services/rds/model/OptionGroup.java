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
 * 
 * </p>
 */
public class OptionGroup implements Serializable {

    /**
     * Specifies the name of the option group.
     */
    private String optionGroupName;

    /**
     * Provides the description of the option group.
     */
    private String optionGroupDescription;

    /**
     * Engine name that this option group can be applied to.
     */
    private String engineName;

    /**
     * Indicates the major engine version associated with this option group.
     */
    private String majorEngineVersion;

    /**
     * Indicates what options are available in the option group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Option> options;

    /**
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value 'true' indicates the option group can be
     * applied to both VPC and non-VPC instances.
     */
    private Boolean allowsVpcAndNonVpcInstanceMemberships;

    /**
     * If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     * blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     * field is blank, then this option group can be applied to both VPC and
     * non-VPC instances. If this field contains a value, then this option
     * group can only be applied to instances that are in the VPC indicated
     * by this field.
     */
    private String vpcId;

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
     * Provides the description of the option group.
     *
     * @return Provides the description of the option group.
     */
    public String getOptionGroupDescription() {
        return optionGroupDescription;
    }
    
    /**
     * Provides the description of the option group.
     *
     * @param optionGroupDescription Provides the description of the option group.
     */
    public void setOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }
    
    /**
     * Provides the description of the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupDescription Provides the description of the option group.
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
     * Indicates what options are available in the option group.
     *
     * @return Indicates what options are available in the option group.
     */
    public java.util.List<Option> getOptions() {
        if (options == null) {
              options = new com.amazonaws.internal.ListWithAutoConstructFlag<Option>();
              options.setAutoConstruct(true);
        }
        return options;
    }
    
    /**
     * Indicates what options are available in the option group.
     *
     * @param options Indicates what options are available in the option group.
     */
    public void setOptions(java.util.Collection<Option> options) {
        if (options == null) {
            this.options = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Option> optionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Option>(options.size());
        optionsCopy.addAll(options);
        this.options = optionsCopy;
    }
    
    /**
     * Indicates what options are available in the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options Indicates what options are available in the option group.
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
     * Indicates what options are available in the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options Indicates what options are available in the option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroup withOptions(java.util.Collection<Option> options) {
        if (options == null) {
            this.options = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Option> optionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Option>(options.size());
            optionsCopy.addAll(options);
            this.options = optionsCopy;
        }

        return this;
    }

    /**
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value 'true' indicates the option group can be
     * applied to both VPC and non-VPC instances.
     *
     * @return Indicates whether this option group can be applied to both VPC and
     *         non-VPC instances. The value 'true' indicates the option group can be
     *         applied to both VPC and non-VPC instances.
     */
    public Boolean isAllowsVpcAndNonVpcInstanceMemberships() {
        return allowsVpcAndNonVpcInstanceMemberships;
    }
    
    /**
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value 'true' indicates the option group can be
     * applied to both VPC and non-VPC instances.
     *
     * @param allowsVpcAndNonVpcInstanceMemberships Indicates whether this option group can be applied to both VPC and
     *         non-VPC instances. The value 'true' indicates the option group can be
     *         applied to both VPC and non-VPC instances.
     */
    public void setAllowsVpcAndNonVpcInstanceMemberships(Boolean allowsVpcAndNonVpcInstanceMemberships) {
        this.allowsVpcAndNonVpcInstanceMemberships = allowsVpcAndNonVpcInstanceMemberships;
    }
    
    /**
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value 'true' indicates the option group can be
     * applied to both VPC and non-VPC instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowsVpcAndNonVpcInstanceMemberships Indicates whether this option group can be applied to both VPC and
     *         non-VPC instances. The value 'true' indicates the option group can be
     *         applied to both VPC and non-VPC instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroup withAllowsVpcAndNonVpcInstanceMemberships(Boolean allowsVpcAndNonVpcInstanceMemberships) {
        this.allowsVpcAndNonVpcInstanceMemberships = allowsVpcAndNonVpcInstanceMemberships;
        return this;
    }

    /**
     * Indicates whether this option group can be applied to both VPC and
     * non-VPC instances. The value 'true' indicates the option group can be
     * applied to both VPC and non-VPC instances.
     *
     * @return Indicates whether this option group can be applied to both VPC and
     *         non-VPC instances. The value 'true' indicates the option group can be
     *         applied to both VPC and non-VPC instances.
     */
    public Boolean getAllowsVpcAndNonVpcInstanceMemberships() {
        return allowsVpcAndNonVpcInstanceMemberships;
    }

    /**
     * If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     * blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     * field is blank, then this option group can be applied to both VPC and
     * non-VPC instances. If this field contains a value, then this option
     * group can only be applied to instances that are in the VPC indicated
     * by this field.
     *
     * @return If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     *         blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     *         field is blank, then this option group can be applied to both VPC and
     *         non-VPC instances. If this field contains a value, then this option
     *         group can only be applied to instances that are in the VPC indicated
     *         by this field.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     * blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     * field is blank, then this option group can be applied to both VPC and
     * non-VPC instances. If this field contains a value, then this option
     * group can only be applied to instances that are in the VPC indicated
     * by this field.
     *
     * @param vpcId If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     *         blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     *         field is blank, then this option group can be applied to both VPC and
     *         non-VPC instances. If this field contains a value, then this option
     *         group can only be applied to instances that are in the VPC indicated
     *         by this field.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     * blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     * field is blank, then this option group can be applied to both VPC and
     * non-VPC instances. If this field contains a value, then this option
     * group can only be applied to instances that are in the VPC indicated
     * by this field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId If AllowsVpcAndNonVpcInstanceMemberships is 'false', this field is
     *         blank. If AllowsVpcAndNonVpcInstanceMemberships is 'true' and this
     *         field is blank, then this option group can be applied to both VPC and
     *         non-VPC instances. If this field contains a value, then this option
     *         group can only be applied to instances that are in the VPC indicated
     *         by this field.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public OptionGroup withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getOptionGroupDescription() != null) sb.append("OptionGroupDescription: " + getOptionGroupDescription() + ",");
        if (getEngineName() != null) sb.append("EngineName: " + getEngineName() + ",");
        if (getMajorEngineVersion() != null) sb.append("MajorEngineVersion: " + getMajorEngineVersion() + ",");
        if (getOptions() != null) sb.append("Options: " + getOptions() + ",");
        if (isAllowsVpcAndNonVpcInstanceMemberships() != null) sb.append("AllowsVpcAndNonVpcInstanceMemberships: " + isAllowsVpcAndNonVpcInstanceMemberships() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() );
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
        hashCode = prime * hashCode + ((isAllowsVpcAndNonVpcInstanceMemberships() == null) ? 0 : isAllowsVpcAndNonVpcInstanceMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
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
        if (other.isAllowsVpcAndNonVpcInstanceMemberships() == null ^ this.isAllowsVpcAndNonVpcInstanceMemberships() == null) return false;
        if (other.isAllowsVpcAndNonVpcInstanceMemberships() != null && other.isAllowsVpcAndNonVpcInstanceMemberships().equals(this.isAllowsVpcAndNonVpcInstanceMemberships()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        return true;
    }
    
}
    