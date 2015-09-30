/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetTemplateSummaryResult implements Serializable, Cloneable {

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
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     */
    private String capabilitiesReason;

    /**
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>. Use the following syntax to
     * describe template resource types: <code>AWS::*</code> (for all AWS
     * resources), <code>Custom::*</code> (for all custom resources),
     * <code>Custom::<i>logical_ID</i></code> (for a specific custom
     * resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     * of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     * a specific AWS resource).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypes;

    /**
     * The AWS template format version, which identifies the capabilities of
     * the template.
     */
    private String version;

    /**
     * The value that is defined for the <code>Metadata</code> property of
     * the template.
     */
    private String metadata;

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
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or {@link
     * #withParameters(java.util.Collection)} if you want to override the
     * existing values.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCapabilities(java.util.Collection)} or {@link
     * #withCapabilities(java.util.Collection)} if you want to override the
     * existing values.
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
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     *
     * @return The list of resources that generated the values in the
     *         <code>Capabilities</code> response element.
     */
    public String getCapabilitiesReason() {
        return capabilitiesReason;
    }
    
    /**
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     *
     * @param capabilitiesReason The list of resources that generated the values in the
     *         <code>Capabilities</code> response element.
     */
    public void setCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
    }
    
    /**
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capabilitiesReason The list of resources that generated the values in the
     *         <code>Capabilities</code> response element.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
        return this;
    }

    /**
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>. Use the following syntax to
     * describe template resource types: <code>AWS::*</code> (for all AWS
     * resources), <code>Custom::*</code> (for all custom resources),
     * <code>Custom::<i>logical_ID</i></code> (for a specific custom
     * resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     * of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     * a specific AWS resource).
     *
     * @return A list of all the template resource types that are defined in the
     *         template, such as <code>AWS::EC2::Instance</code>,
     *         <code>AWS::Dynamo::Table</code>, and
     *         <code>Custom::MyCustomInstance</code>. Use the following syntax to
     *         describe template resource types: <code>AWS::*</code> (for all AWS
     *         resources), <code>Custom::*</code> (for all custom resources),
     *         <code>Custom::<i>logical_ID</i></code> (for a specific custom
     *         resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     *         of a particular AWS service), and
     *         <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     *         a specific AWS resource).
     */
    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
              resourceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceTypes.setAutoConstruct(true);
        }
        return resourceTypes;
    }
    
    /**
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>. Use the following syntax to
     * describe template resource types: <code>AWS::*</code> (for all AWS
     * resources), <code>Custom::*</code> (for all custom resources),
     * <code>Custom::<i>logical_ID</i></code> (for a specific custom
     * resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     * of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     * a specific AWS resource).
     *
     * @param resourceTypes A list of all the template resource types that are defined in the
     *         template, such as <code>AWS::EC2::Instance</code>,
     *         <code>AWS::Dynamo::Table</code>, and
     *         <code>Custom::MyCustomInstance</code>. Use the following syntax to
     *         describe template resource types: <code>AWS::*</code> (for all AWS
     *         resources), <code>Custom::*</code> (for all custom resources),
     *         <code>Custom::<i>logical_ID</i></code> (for a specific custom
     *         resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     *         of a particular AWS service), and
     *         <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     *         a specific AWS resource).
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceTypes.size());
        resourceTypesCopy.addAll(resourceTypes);
        this.resourceTypes = resourceTypesCopy;
    }
    
    /**
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>. Use the following syntax to
     * describe template resource types: <code>AWS::*</code> (for all AWS
     * resources), <code>Custom::*</code> (for all custom resources),
     * <code>Custom::<i>logical_ID</i></code> (for a specific custom
     * resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     * of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     * a specific AWS resource).
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceTypes(java.util.Collection)} or {@link
     * #withResourceTypes(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTypes A list of all the template resource types that are defined in the
     *         template, such as <code>AWS::EC2::Instance</code>,
     *         <code>AWS::Dynamo::Table</code>, and
     *         <code>Custom::MyCustomInstance</code>. Use the following syntax to
     *         describe template resource types: <code>AWS::*</code> (for all AWS
     *         resources), <code>Custom::*</code> (for all custom resources),
     *         <code>Custom::<i>logical_ID</i></code> (for a specific custom
     *         resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     *         of a particular AWS service), and
     *         <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     *         a specific AWS resource).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        for (String value : resourceTypes) {
            getResourceTypes().add(value);
        }
        return this;
    }
    
    /**
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>. Use the following syntax to
     * describe template resource types: <code>AWS::*</code> (for all AWS
     * resources), <code>Custom::*</code> (for all custom resources),
     * <code>Custom::<i>logical_ID</i></code> (for a specific custom
     * resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     * of a particular AWS service), and
     * <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     * a specific AWS resource).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTypes A list of all the template resource types that are defined in the
     *         template, such as <code>AWS::EC2::Instance</code>,
     *         <code>AWS::Dynamo::Table</code>, and
     *         <code>Custom::MyCustomInstance</code>. Use the following syntax to
     *         describe template resource types: <code>AWS::*</code> (for all AWS
     *         resources), <code>Custom::*</code> (for all custom resources),
     *         <code>Custom::<i>logical_ID</i></code> (for a specific custom
     *         resource), <code>AWS::<i>service_name</i>::*</code> (for all resources
     *         of a particular AWS service), and
     *         <code>AWS::<i>service_name</i>::<i>resource_logical_ID</i></code> (for
     *         a specific AWS resource).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceTypes.size());
            resourceTypesCopy.addAll(resourceTypes);
            this.resourceTypes = resourceTypesCopy;
        }

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
     * The value that is defined for the <code>Metadata</code> property of
     * the template.
     *
     * @return The value that is defined for the <code>Metadata</code> property of
     *         the template.
     */
    public String getMetadata() {
        return metadata;
    }
    
    /**
     * The value that is defined for the <code>Metadata</code> property of
     * the template.
     *
     * @param metadata The value that is defined for the <code>Metadata</code> property of
     *         the template.
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
    
    /**
     * The value that is defined for the <code>Metadata</code> property of
     * the template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata The value that is defined for the <code>Metadata</code> property of
     *         the template.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetTemplateSummaryResult withMetadata(String metadata) {
        this.metadata = metadata;
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
        if (getResourceTypes() != null) sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getMetadata() != null) sb.append("Metadata: " + getMetadata() );
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
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode()); 
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
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null) return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getMetadata() == null ^ this.getMetadata() == null) return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false) return false; 
        return true;
    }
    
    @Override
    public GetTemplateSummaryResult clone() {
        try {
            return (GetTemplateSummaryResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    