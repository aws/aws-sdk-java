/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        java.util.List<TemplateParameter> parametersCopy = new java.util.ArrayList<TemplateParameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
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
        if (getParameters() == null) setParameters(new java.util.ArrayList<TemplateParameter>());
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
        java.util.List<TemplateParameter> parametersCopy = new java.util.ArrayList<TemplateParameter>();
        if (parameters != null) {
            parametersCopy.addAll(parameters);
        }
        this.parameters = parametersCopy;

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
        java.util.List<String> capabilitiesCopy = new java.util.ArrayList<String>();
        if (capabilities != null) {
            capabilitiesCopy.addAll(capabilities);
        }
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
        if (getCapabilities() == null) setCapabilities(new java.util.ArrayList<String>());
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
        java.util.List<String> capabilitiesCopy = new java.util.ArrayList<String>();
        if (capabilities != null) {
            capabilitiesCopy.addAll(capabilities);
        }
        this.capabilities = capabilitiesCopy;

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
        sb.append("Parameters: " + parameters + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("Capabilities: " + capabilities + ", ");
        sb.append("CapabilitiesReason: " + capabilitiesReason + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    