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
 * Available option.
 * </p>
 */
public class OptionGroupOption {

    /**
     * The name of the option.
     */
    private String name;

    /**
     * The description of the option.
     */
    private String description;

    /**
     * Engine name that this option can be applied to.
     */
    private String engineName;

    /**
     * Indicates the major engine version that the option is available for.
     */
    private String majorEngineVersion;

    /**
     * The minimum required engine version for the option to be applied.
     */
    private String minimumRequiredMinorEngineVersion;

    /**
     * Specifies whether the option requires a port.
     */
    private Boolean portRequired;

    /**
     * If the option requires a port, specifies the default port for the
     * option.
     */
    private Integer defaultPort;

    /**
     * List of all options that are prerequisites for this option.
     */
    private java.util.List<String> optionsDependedOn;

    /**
     * The name of the option.
     *
     * @return The name of the option.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the option.
     *
     * @param name The name of the option.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The description of the option.
     *
     * @return The description of the option.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the option.
     *
     * @param description The description of the option.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Engine name that this option can be applied to.
     *
     * @return Engine name that this option can be applied to.
     */
    public String getEngineName() {
        return engineName;
    }
    
    /**
     * Engine name that this option can be applied to.
     *
     * @param engineName Engine name that this option can be applied to.
     */
    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }
    
    /**
     * Engine name that this option can be applied to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineName Engine name that this option can be applied to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }
    
    
    /**
     * Indicates the major engine version that the option is available for.
     *
     * @return Indicates the major engine version that the option is available for.
     */
    public String getMajorEngineVersion() {
        return majorEngineVersion;
    }
    
    /**
     * Indicates the major engine version that the option is available for.
     *
     * @param majorEngineVersion Indicates the major engine version that the option is available for.
     */
    public void setMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
    }
    
    /**
     * Indicates the major engine version that the option is available for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param majorEngineVersion Indicates the major engine version that the option is available for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withMajorEngineVersion(String majorEngineVersion) {
        this.majorEngineVersion = majorEngineVersion;
        return this;
    }
    
    
    /**
     * The minimum required engine version for the option to be applied.
     *
     * @return The minimum required engine version for the option to be applied.
     */
    public String getMinimumRequiredMinorEngineVersion() {
        return minimumRequiredMinorEngineVersion;
    }
    
    /**
     * The minimum required engine version for the option to be applied.
     *
     * @param minimumRequiredMinorEngineVersion The minimum required engine version for the option to be applied.
     */
    public void setMinimumRequiredMinorEngineVersion(String minimumRequiredMinorEngineVersion) {
        this.minimumRequiredMinorEngineVersion = minimumRequiredMinorEngineVersion;
    }
    
    /**
     * The minimum required engine version for the option to be applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minimumRequiredMinorEngineVersion The minimum required engine version for the option to be applied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withMinimumRequiredMinorEngineVersion(String minimumRequiredMinorEngineVersion) {
        this.minimumRequiredMinorEngineVersion = minimumRequiredMinorEngineVersion;
        return this;
    }
    
    
    /**
     * Specifies whether the option requires a port.
     *
     * @return Specifies whether the option requires a port.
     */
    public Boolean isPortRequired() {
        return portRequired;
    }
    
    /**
     * Specifies whether the option requires a port.
     *
     * @param portRequired Specifies whether the option requires a port.
     */
    public void setPortRequired(Boolean portRequired) {
        this.portRequired = portRequired;
    }
    
    /**
     * Specifies whether the option requires a port.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param portRequired Specifies whether the option requires a port.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withPortRequired(Boolean portRequired) {
        this.portRequired = portRequired;
        return this;
    }
    
    
    /**
     * Specifies whether the option requires a port.
     *
     * @return Specifies whether the option requires a port.
     */
    public Boolean getPortRequired() {
        return portRequired;
    }
    
    /**
     * If the option requires a port, specifies the default port for the
     * option.
     *
     * @return If the option requires a port, specifies the default port for the
     *         option.
     */
    public Integer getDefaultPort() {
        return defaultPort;
    }
    
    /**
     * If the option requires a port, specifies the default port for the
     * option.
     *
     * @param defaultPort If the option requires a port, specifies the default port for the
     *         option.
     */
    public void setDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
    }
    
    /**
     * If the option requires a port, specifies the default port for the
     * option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultPort If the option requires a port, specifies the default port for the
     *         option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withDefaultPort(Integer defaultPort) {
        this.defaultPort = defaultPort;
        return this;
    }
    
    
    /**
     * List of all options that are prerequisites for this option.
     *
     * @return List of all options that are prerequisites for this option.
     */
    public java.util.List<String> getOptionsDependedOn() {
        
        if (optionsDependedOn == null) {
            optionsDependedOn = new java.util.ArrayList<String>();
        }
        return optionsDependedOn;
    }
    
    /**
     * List of all options that are prerequisites for this option.
     *
     * @param optionsDependedOn List of all options that are prerequisites for this option.
     */
    public void setOptionsDependedOn(java.util.Collection<String> optionsDependedOn) {
        if (optionsDependedOn == null) {
            this.optionsDependedOn = null;
            return;
        }

        java.util.List<String> optionsDependedOnCopy = new java.util.ArrayList<String>(optionsDependedOn.size());
        optionsDependedOnCopy.addAll(optionsDependedOn);
        this.optionsDependedOn = optionsDependedOnCopy;
    }
    
    /**
     * List of all options that are prerequisites for this option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsDependedOn List of all options that are prerequisites for this option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withOptionsDependedOn(String... optionsDependedOn) {
        if (getOptionsDependedOn() == null) setOptionsDependedOn(new java.util.ArrayList<String>(optionsDependedOn.length));
        for (String value : optionsDependedOn) {
            getOptionsDependedOn().add(value);
        }
        return this;
    }
    
    /**
     * List of all options that are prerequisites for this option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsDependedOn List of all options that are prerequisites for this option.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public OptionGroupOption withOptionsDependedOn(java.util.Collection<String> optionsDependedOn) {
        if (optionsDependedOn == null) {
            this.optionsDependedOn = null;
        } else {
            java.util.List<String> optionsDependedOnCopy = new java.util.ArrayList<String>(optionsDependedOn.size());
            optionsDependedOnCopy.addAll(optionsDependedOn);
            this.optionsDependedOn = optionsDependedOnCopy;
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
        if (name != null) sb.append("Name: " + name + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        if (engineName != null) sb.append("EngineName: " + engineName + ", ");
        if (majorEngineVersion != null) sb.append("MajorEngineVersion: " + majorEngineVersion + ", ");
        if (minimumRequiredMinorEngineVersion != null) sb.append("MinimumRequiredMinorEngineVersion: " + minimumRequiredMinorEngineVersion + ", ");
        if (portRequired != null) sb.append("PortRequired: " + portRequired + ", ");
        if (defaultPort != null) sb.append("DefaultPort: " + defaultPort + ", ");
        if (optionsDependedOn != null) sb.append("OptionsDependedOn: " + optionsDependedOn + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode()); 
        hashCode = prime * hashCode + ((getMajorEngineVersion() == null) ? 0 : getMajorEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getMinimumRequiredMinorEngineVersion() == null) ? 0 : getMinimumRequiredMinorEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isPortRequired() == null) ? 0 : isPortRequired().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultPort() == null) ? 0 : getDefaultPort().hashCode()); 
        hashCode = prime * hashCode + ((getOptionsDependedOn() == null) ? 0 : getOptionsDependedOn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof OptionGroupOption == false) return false;
        OptionGroupOption other = (OptionGroupOption)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getEngineName() == null ^ this.getEngineName() == null) return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false) return false; 
        if (other.getMajorEngineVersion() == null ^ this.getMajorEngineVersion() == null) return false;
        if (other.getMajorEngineVersion() != null && other.getMajorEngineVersion().equals(this.getMajorEngineVersion()) == false) return false; 
        if (other.getMinimumRequiredMinorEngineVersion() == null ^ this.getMinimumRequiredMinorEngineVersion() == null) return false;
        if (other.getMinimumRequiredMinorEngineVersion() != null && other.getMinimumRequiredMinorEngineVersion().equals(this.getMinimumRequiredMinorEngineVersion()) == false) return false; 
        if (other.isPortRequired() == null ^ this.isPortRequired() == null) return false;
        if (other.isPortRequired() != null && other.isPortRequired().equals(this.isPortRequired()) == false) return false; 
        if (other.getDefaultPort() == null ^ this.getDefaultPort() == null) return false;
        if (other.getDefaultPort() != null && other.getDefaultPort().equals(this.getDefaultPort()) == false) return false; 
        if (other.getOptionsDependedOn() == null ^ this.getOptionsDependedOn() == null) return false;
        if (other.getOptionsDependedOn() != null && other.getOptionsDependedOn().equals(this.getOptionsDependedOn()) == false) return false; 
        return true;
    }
    
}
    