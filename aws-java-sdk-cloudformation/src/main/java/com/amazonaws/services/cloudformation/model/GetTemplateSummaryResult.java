/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * <p>
 * The output for the GetTemplateSummary action.
 * </p>
 */
public class GetTemplateSummaryResult implements Serializable {

    /**
     * A list of parameter declarations that describe various properties for
     * each parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ParameterDeclaration> parameters;

    /**
     * The value that is defined in the <code>Description</code> property of
     * the template.
     */
    private String description;

    /**
     * The capabilities found within the template. Currently, AWS
     * CloudFormation supports only the CAPABILITY_IAM capability. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those
     * actions return an InsufficientCapabilities error.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilities;

    /**
     * The capabilities reason found within the template.
     */
    private String capabilitiesReason;

    /**
     * The AWS template format version, which identifies the capabilities of
     * the template.
     */
    private String version;

    /**
     * A list of parameter declarations that describe various properties for
     * each parameter.
     *
     * @return A list of parameter declarations that describe various properties for
     *         each parameter.
     */
    public java.util.List<ParameterDeclaration> getParameters() {
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterDeclaration>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * A list of parameter declarations that describe various properties for
     * each parameter.
     *
     * @param parameters A list of parameter declarations that describe various properties for
     *         each parameter.
     */
    public void setParameters(java.util.Collection<ParameterDeclaration> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ParameterDeclaration> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterDeclaration>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of parameter declarations that describe various properties for
     *         each parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withParameters(ParameterDeclaration... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<ParameterDeclaration>(parameters.length));
        for (ParameterDeclaration value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters A list of parameter declarations that describe various properties for
     *         each parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withParameters(java.util.Collection<ParameterDeclaration> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ParameterDeclaration> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ParameterDeclaration>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

        return this;
    }

    /**
     * The value that is defined in the <code>Description</code> property of
     * the template.
     *
     * @return The value that is defined in the <code>Description</code> property of
     *         the template.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The value that is defined in the <code>Description</code> property of
     * the template.
     *
     * @param description The value that is defined in the <code>Description</code> property of
     *         the template.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The value that is defined in the <code>Description</code> property of
     * the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The value that is defined in the <code>Description</code> property of
     *         the template.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The capabilities found within the template. Currently, AWS
     * CloudFormation supports only the CAPABILITY_IAM capability. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those
     * actions return an InsufficientCapabilities error.
     *
     * @return The capabilities found within the template. Currently, AWS
     *         CloudFormation supports only the CAPABILITY_IAM capability. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter when you use the <a>CreateStack</a> or
     *         <a>UpdateStack</a> actions with your template; otherwise, those
     *         actions return an InsufficientCapabilities error.
     */
    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
              capabilities = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              capabilities.setAutoConstruct(true);
        }
        return capabilities;
    }
    
    /**
     * The capabilities found within the template. Currently, AWS
     * CloudFormation supports only the CAPABILITY_IAM capability. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those
     * actions return an InsufficientCapabilities error.
     *
     * @param capabilities The capabilities found within the template. Currently, AWS
     *         CloudFormation supports only the CAPABILITY_IAM capability. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter when you use the <a>CreateStack</a> or
     *         <a>UpdateStack</a> actions with your template; otherwise, those
     *         actions return an InsufficientCapabilities error.
     */
    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(capabilities.size());
        capabilitiesCopy.addAll(capabilities);
        this.capabilities = capabilitiesCopy;
    }
    
    /**
     * The capabilities found within the template. Currently, AWS
     * CloudFormation supports only the CAPABILITY_IAM capability. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those
     * actions return an InsufficientCapabilities error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabilities found within the template. Currently, AWS
     *         CloudFormation supports only the CAPABILITY_IAM capability. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter when you use the <a>CreateStack</a> or
     *         <a>UpdateStack</a> actions with your template; otherwise, those
     *         actions return an InsufficientCapabilities error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withCapabilities(String... capabilities) {
        if (getCapabilities() == null) setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        for (String value : capabilities) {
            getCapabilities().add(value);
        }
        return this;
    }
    
    /**
     * The capabilities found within the template. Currently, AWS
     * CloudFormation supports only the CAPABILITY_IAM capability. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those
     * actions return an InsufficientCapabilities error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabilities found within the template. Currently, AWS
     *         CloudFormation supports only the CAPABILITY_IAM capability. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter when you use the <a>CreateStack</a> or
     *         <a>UpdateStack</a> actions with your template; otherwise, those
     *         actions return an InsufficientCapabilities error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> capabilitiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(capabilities.size());
            capabilitiesCopy.addAll(capabilities);
            this.capabilities = capabilitiesCopy;
        }

        return this;
    }

    /**
     * The capabilities found within the template. Currently, AWS
     * CloudFormation supports only the CAPABILITY_IAM capability. If your
     * template contains IAM resources, you must specify the CAPABILITY_IAM
     * value for this parameter when you use the <a>CreateStack</a> or
     * <a>UpdateStack</a> actions with your template; otherwise, those
     * actions return an InsufficientCapabilities error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilities The capabilities found within the template. Currently, AWS
     *         CloudFormation supports only the CAPABILITY_IAM capability. If your
     *         template contains IAM resources, you must specify the CAPABILITY_IAM
     *         value for this parameter when you use the <a>CreateStack</a> or
     *         <a>UpdateStack</a> actions with your template; otherwise, those
     *         actions return an InsufficientCapabilities error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withCapabilities(Capability... capabilities) {
        java.util.ArrayList<String> capabilitiesCopy = new java.util.ArrayList<String>(capabilities.length);
        for (Capability member : capabilities) {
            capabilitiesCopy.add(member.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
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
    public GetTemplateSummaryResult withCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
        return this;
    }

    /**
     * The AWS template format version, which identifies the capabilities of
     * the template.
     *
     * @return The AWS template format version, which identifies the capabilities of
     *         the template.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The AWS template format version, which identifies the capabilities of
     * the template.
     *
     * @param version The AWS template format version, which identifies the capabilities of
     *         the template.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The AWS template format version, which identifies the capabilities of
     * the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param version The AWS template format version, which identifies the capabilities of
     *         the template.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withVersion(String version) {
        this.version = version;
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
        if (getParameters() != null) sb.append("Parameters: " + getParameters() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCapabilities() != null) sb.append("Capabilities: " + getCapabilities() + ",");
        if (getCapabilitiesReason() != null) sb.append("CapabilitiesReason: " + getCapabilitiesReason() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() );
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTemplateSummaryResult == false) return false;
        GetTemplateSummaryResult other = (GetTemplateSummaryResult)obj;
        
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCapabilities() == null ^ this.getCapabilities() == null) return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false) return false; 
        if (other.getCapabilitiesReason() == null ^ this.getCapabilitiesReason() == null) return false;
        if (other.getCapabilitiesReason() != null && other.getCapabilitiesReason().equals(this.getCapabilitiesReason()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        return true;
    }
    
}
    