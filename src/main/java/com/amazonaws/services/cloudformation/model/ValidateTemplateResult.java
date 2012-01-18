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
package com.amazonaws.services.cloudformation.model;

/**
 * <p>
 * The output for ValidateTemplate action.
 * </p>
 */
public class ValidateTemplateResult {

    /**
     * A list of <code>TemplateParameter</code> structures.
     */
    private java.util.List<TemplateParameter> parameters;

    /**
     * The description found within the template.
     */
    private String description;

    /**
     * The capabitilites found within the template. Currently, CAPABILITY_IAM
     * is the only capability detected. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     */
    private java.util.List<String> capabilities;

    /**
     * The capabilities reason found within the template.
     */
    private String capabilitiesReason;

    /**
     * A list of <code>TemplateParameter</code> structures.
     *
     * @return A list of <code>TemplateParameter</code> structures.
     */
    public java.util.List<TemplateParameter> getParameters() {
        
        if (parameters == null) {
            parameters = new java.util.ArrayList<TemplateParameter>();
        }
        return parameters;
    }
    
    /**
     * A list of <code>TemplateParameter</code> structures.
     *
     * @param parameters A list of <code>TemplateParameter</code> structures.
     */
    public void setParameters(java.util.Collection<TemplateParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        java.util.List<TemplateParameter> parametersCopy = new java.util.ArrayList<TemplateParameter>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of <code>TemplateParameter</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>TemplateParameter</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateTemplateResult withParameters(TemplateParameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<TemplateParameter>(parameters.length));
        for (TemplateParameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>TemplateParameter</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of <code>TemplateParameter</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateTemplateResult withParameters(java.util.Collection<TemplateParameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            java.util.List<TemplateParameter> parametersCopy = new java.util.ArrayList<TemplateParameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

        return this;
    }
    
    /**
     * The description found within the template.
     *
     * @return The description found within the template.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description found within the template.
     *
     * @param description The description found within the template.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description found within the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description found within the template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateTemplateResult withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * The capabitilites found within the template. Currently, CAPABILITY_IAM
     * is the only capability detected. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     *
     * @return The capabitilites found within the template. Currently, CAPABILITY_IAM
     *         is the only capability detected. If your template contains IAM
     *         resources, you must specify the CAPABILITY_IAM value for this
     *         parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     *         actions with your template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     */
    public java.util.List<String> getCapabilities() {
        
        if (capabilities == null) {
            capabilities = new java.util.ArrayList<String>();
        }
        return capabilities;
    }
    
    /**
     * The capabitilites found within the template. Currently, CAPABILITY_IAM
     * is the only capability detected. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     *
     * @param capabilities The capabitilites found within the template. Currently, CAPABILITY_IAM
     *         is the only capability detected. If your template contains IAM
     *         resources, you must specify the CAPABILITY_IAM value for this
     *         parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     *         actions with your template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        java.util.List<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.size());
        capabilitiesCopy.addAll(capabilities);
        this.capabilities = capabilitiesCopy;
    }
    
    /**
     * The capabitilites found within the template. Currently, CAPABILITY_IAM
     * is the only capability detected. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabitilites found within the template. Currently, CAPABILITY_IAM
     *         is the only capability detected. If your template contains IAM
     *         resources, you must specify the CAPABILITY_IAM value for this
     *         parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     *         actions with your template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateTemplateResult withCapabilities(String... capabilities) {
        if (getCapabilities() == null) setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        for (String value : capabilities) {
            getCapabilities().add(value);
        }
        return this;
    }
    
    /**
     * The capabitilites found within the template. Currently, CAPABILITY_IAM
     * is the only capability detected. If your template contains IAM
     * resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabitilites found within the template. Currently, CAPABILITY_IAM
     *         is the only capability detected. If your template contains IAM
     *         resources, you must specify the CAPABILITY_IAM value for this
     *         parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     *         actions with your template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateTemplateResult withCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
        } else {
            java.util.List<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.size());
            capabilitiesCopy.addAll(capabilities);
            this.capabilities = capabilitiesCopy;
        }

        return this;
    }
    
    /**
     * The capabilities reason found within the template.
     *
     * @return The capabilities reason found within the template.
     */
    public String getCapabilitiesReason() {
        return capabilitiesReason;
    }
    
    /**
     * The capabilities reason found within the template.
     *
     * @param capabilitiesReason The capabilities reason found within the template.
     */
    public void setCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
    }
    
    /**
     * The capabilities reason found within the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilitiesReason The capabilities reason found within the template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ValidateTemplateResult withCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
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
        if (parameters != null) sb.append("Parameters: " + parameters + ", ");
        if (description != null) sb.append("Description: " + description + ", ");
        if (capabilities != null) sb.append("Capabilities: " + capabilities + ", ");
        if (capabilitiesReason != null) sb.append("CapabilitiesReason: " + capabilitiesReason + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode()); 
        hashCode = prime * hashCode + ((getCapabilitiesReason() == null) ? 0 : getCapabilitiesReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ValidateTemplateResult == false) return false;
        ValidateTemplateResult other = (ValidateTemplateResult)obj;
        
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCapabilities() == null ^ this.getCapabilities() == null) return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false) return false; 
        if (other.getCapabilitiesReason() == null ^ this.getCapabilitiesReason() == null) return false;
        if (other.getCapabilitiesReason() != null && other.getCapabilitiesReason().equals(this.getCapabilitiesReason()) == false) return false; 
        return true;
    }
    
}
    