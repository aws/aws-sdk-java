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
package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * The group of AWS resource types that AWS Config records when starting
 * the configuration recorder.
 * </p>
 * <p>
 * <b>recordingGroup</b> can have one and only one parameter. Choose
 * either <b>allSupported</b> or <b>resourceTypes</b> .
 * </p>
 */
public class RecordingGroup implements Serializable, Cloneable {

    /**
     * Records all supported resource types in the recording group. For a
     * list of supported resource types, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * resource types</a>. If you specify <b>allSupported</b>, you cannot
     * enumerate a list of <b>resourceTypes</b>.
     */
    private Boolean allSupported;

    /**
     * A comma-separated list of strings representing valid AWS resource
     * types (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     * valid if you have chosen not to select <b>allSupported</b>. For a list
     * of valid <b>resourceTypes</b> values, see the <b>resourceType
     * Value</b> column in the following topic: <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * AWS Resource Types</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypes;

    /**
     * Records all supported resource types in the recording group. For a
     * list of supported resource types, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * resource types</a>. If you specify <b>allSupported</b>, you cannot
     * enumerate a list of <b>resourceTypes</b>.
     *
     * @return Records all supported resource types in the recording group. For a
     *         list of supported resource types, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         resource types</a>. If you specify <b>allSupported</b>, you cannot
     *         enumerate a list of <b>resourceTypes</b>.
     */
    public Boolean isAllSupported() {
        return allSupported;
    }
    
    /**
     * Records all supported resource types in the recording group. For a
     * list of supported resource types, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * resource types</a>. If you specify <b>allSupported</b>, you cannot
     * enumerate a list of <b>resourceTypes</b>.
     *
     * @param allSupported Records all supported resource types in the recording group. For a
     *         list of supported resource types, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         resource types</a>. If you specify <b>allSupported</b>, you cannot
     *         enumerate a list of <b>resourceTypes</b>.
     */
    public void setAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
    }
    
    /**
     * Records all supported resource types in the recording group. For a
     * list of supported resource types, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * resource types</a>. If you specify <b>allSupported</b>, you cannot
     * enumerate a list of <b>resourceTypes</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allSupported Records all supported resource types in the recording group. For a
     *         list of supported resource types, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         resource types</a>. If you specify <b>allSupported</b>, you cannot
     *         enumerate a list of <b>resourceTypes</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordingGroup withAllSupported(Boolean allSupported) {
        this.allSupported = allSupported;
        return this;
    }

    /**
     * Records all supported resource types in the recording group. For a
     * list of supported resource types, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * resource types</a>. If you specify <b>allSupported</b>, you cannot
     * enumerate a list of <b>resourceTypes</b>.
     *
     * @return Records all supported resource types in the recording group. For a
     *         list of supported resource types, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         resource types</a>. If you specify <b>allSupported</b>, you cannot
     *         enumerate a list of <b>resourceTypes</b>.
     */
    public Boolean getAllSupported() {
        return allSupported;
    }

    /**
     * A comma-separated list of strings representing valid AWS resource
     * types (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     * valid if you have chosen not to select <b>allSupported</b>. For a list
     * of valid <b>resourceTypes</b> values, see the <b>resourceType
     * Value</b> column in the following topic: <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * AWS Resource Types</a>.
     *
     * @return A comma-separated list of strings representing valid AWS resource
     *         types (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *         valid if you have chosen not to select <b>allSupported</b>. For a list
     *         of valid <b>resourceTypes</b> values, see the <b>resourceType
     *         Value</b> column in the following topic: <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         AWS Resource Types</a>.
     */
    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
              resourceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceTypes.setAutoConstruct(true);
        }
        return resourceTypes;
    }
    
    /**
     * A comma-separated list of strings representing valid AWS resource
     * types (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     * valid if you have chosen not to select <b>allSupported</b>. For a list
     * of valid <b>resourceTypes</b> values, see the <b>resourceType
     * Value</b> column in the following topic: <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * AWS Resource Types</a>.
     *
     * @param resourceTypes A comma-separated list of strings representing valid AWS resource
     *         types (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *         valid if you have chosen not to select <b>allSupported</b>. For a list
     *         of valid <b>resourceTypes</b> values, see the <b>resourceType
     *         Value</b> column in the following topic: <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         AWS Resource Types</a>.
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
     * A comma-separated list of strings representing valid AWS resource
     * types (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     * valid if you have chosen not to select <b>allSupported</b>. For a list
     * of valid <b>resourceTypes</b> values, see the <b>resourceType
     * Value</b> column in the following topic: <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * AWS Resource Types</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceTypes(java.util.Collection)} or {@link
     * #withResourceTypes(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTypes A comma-separated list of strings representing valid AWS resource
     *         types (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *         valid if you have chosen not to select <b>allSupported</b>. For a list
     *         of valid <b>resourceTypes</b> values, see the <b>resourceType
     *         Value</b> column in the following topic: <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         AWS Resource Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordingGroup withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        for (String value : resourceTypes) {
            getResourceTypes().add(value);
        }
        return this;
    }
    
    /**
     * A comma-separated list of strings representing valid AWS resource
     * types (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     * valid if you have chosen not to select <b>allSupported</b>. For a list
     * of valid <b>resourceTypes</b> values, see the <b>resourceType
     * Value</b> column in the following topic: <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * AWS Resource Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTypes A comma-separated list of strings representing valid AWS resource
     *         types (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *         valid if you have chosen not to select <b>allSupported</b>. For a list
     *         of valid <b>resourceTypes</b> values, see the <b>resourceType
     *         Value</b> column in the following topic: <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         AWS Resource Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordingGroup withResourceTypes(java.util.Collection<String> resourceTypes) {
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
     * A comma-separated list of strings representing valid AWS resource
     * types (for example, <code>AWS::EC2::Instance</code> or
     * <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     * valid if you have chosen not to select <b>allSupported</b>. For a list
     * of valid <b>resourceTypes</b> values, see the <b>resourceType
     * Value</b> column in the following topic: <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     * AWS Resource Types</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTypes A comma-separated list of strings representing valid AWS resource
     *         types (for example, <code>AWS::EC2::Instance</code> or
     *         <code>AWS::CloudTrail::Trail</code>). <b>resourceTypes</b> is only
     *         valid if you have chosen not to select <b>allSupported</b>. For a list
     *         of valid <b>resourceTypes</b> values, see the <b>resourceType
     *         Value</b> column in the following topic: <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/resource-config-reference.html#supported-resources">Supported
     *         AWS Resource Types</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RecordingGroup withResourceTypes(ResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ResourceType member : resourceTypes) {
            resourceTypesCopy.add(member.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
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
        if (isAllSupported() != null) sb.append("AllSupported: " + isAllSupported() + ",");
        if (getResourceTypes() != null) sb.append("ResourceTypes: " + getResourceTypes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isAllSupported() == null) ? 0 : isAllSupported().hashCode()); 
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RecordingGroup == false) return false;
        RecordingGroup other = (RecordingGroup)obj;
        
        if (other.isAllSupported() == null ^ this.isAllSupported() == null) return false;
        if (other.isAllSupported() != null && other.isAllSupported().equals(this.isAllSupported()) == false) return false; 
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null) return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false) return false; 
        return true;
    }
    
    @Override
    public RecordingGroup clone() {
        try {
            return (RecordingGroup) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    