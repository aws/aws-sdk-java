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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createOptionGroup(CreateOptionGroupRequest) CreateOptionGroup operation}.
 * <p>
 * Creates a new Option Group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createOptionGroup(CreateOptionGroupRequest)
 */
public class CreateOptionGroupRequest extends AmazonWebServiceRequest {

    /**
     * Specifies the name of the option group to be created. <p> Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>myOptiongroup</code>
     */
    private String optionGroupName;

    /**
     * Specifies the name of the engine that this option group should be
     * associated with.
     */
    private String engineName;

    /**
     * Specifies the major version of the engine that this option group
     * should be associated with.
     */
    private String majorEngineVersion;

    /**
     * The description of the option group.
     */
    private String optionGroupDescription;

    /**
     * Specifies the name of the option group to be created. <p> Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>myOptiongroup</code>
     *
     * @return Specifies the name of the option group to be created. <p> Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>myOptiongroup</code>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Specifies the name of the option group to be created. <p> Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>myOptiongroup</code>
     *
     * @param optionGroupName Specifies the name of the option group to be created. <p> Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>myOptiongroup</code>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Specifies the name of the option group to be created. <p> Constraints:
     * <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>myOptiongroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName Specifies the name of the option group to be created. <p> Constraints:
     *         <ul> <li>Must be 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>myOptiongroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOptionGroupRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }
    
    
    /**
     * Specifies the name of the engine that this option group should be
     * associated with.
     *
     * @return Specifies the name of the engine that this option group should be
     *         associated with.
     */
    public String getEngineName() {
        return engineName;
    }
    
    /**
     * Specifies the name of the engine that this option group should be
     * associated with.
     *
     * @param engineName Specifies the name of the engine that this option group should be
     *         associated with.
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
    
    /**
     * Specifies the name of the engine that this option group should be
     * associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineName Specifies the name of the engine that this option group should be
     *         associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOptionGroupRequest withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    
    
    /**
     * Specifies the major version of the engine that this option group
     * should be associated with.
     *
     * @return Specifies the major version of the engine that this option group
     *         should be associated with.
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }
    
    /**
     * Specifies the major version of the engine that this option group
     * should be associated with.
     *
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     *         should be associated with.
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }
    
    /**
     * Specifies the major version of the engine that this option group
     * should be associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     *         should be associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOptionGroupRequest withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }
    
    
    /**
     * The description of the option group.
     *
     * @return The description of the option group.
     */
    public String getOptionGroupDescription() {
        return optionGroupDescription;
    }
    
    /**
     * The description of the option group.
     *
     * @param optionGroupDescription The description of the option group.
     */
    public void setOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
    }
    
    /**
     * The description of the option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupDescription The description of the option group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateOptionGroupRequest withOptionGroupDescription(String optionGroupDescription) {
        this.optionGroupDescription = optionGroupDescription;
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
        if (engineName != null) sb.append("EngineName: " + engineName + ", ");
        if (majorEngineVersion != null) sb.append("MajorEngineVersion: " + majorEngineVersion + ", ");
        if (optionGroupDescription != null) sb.append("OptionGroupDescription: " + optionGroupDescription + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode()); 
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupDescription() == null) ? 0 : getOptionGroupDescription().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateOptionGroupRequest == false) return false;
        CreateOptionGroupRequest other = (CreateOptionGroupRequest)obj;
        
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getEngineName() == null ^ this.getEngineName() == null) return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false) return false; 
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null) return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false) return false; 
        if (other.getOptionGroupDescription() == null ^ this.getOptionGroupDescription() == null) return false;
        if (other.getOptionGroupDescription() != null && other.getOptionGroupDescription().equals(this.getOptionGroupDescription()) == false) return false; 
        return true;
    }
    
}
    