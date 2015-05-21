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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A specification identifying an individual configuration option.
 * </p>
 */
public class OptionSpecification implements Serializable, Cloneable {

    /**
     * A unique resource name for a time-based scaling configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceName;

    /**
     * A unique namespace identifying the option's associated AWS resource.
     */
    private String namespace;

    /**
     * The name of the configuration option.
     */
    private String optionName;

    /**
     * Default constructor for a new OptionSpecification object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public OptionSpecification() {}
    
    /**
     * A unique resource name for a time-based scaling configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return A unique resource name for a time-based scaling configuration option.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * A unique resource name for a time-based scaling configuration option.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceName A unique resource name for a time-based scaling configuration option.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * A unique resource name for a time-based scaling configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceName A unique resource name for a time-based scaling configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public OptionSpecification withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * A unique namespace identifying the option's associated AWS resource.
     *
     * @return A unique namespace identifying the option's associated AWS resource.
     */
    public String getNamespace() {
        return namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     *
     * @param namespace A unique namespace identifying the option's associated AWS resource.
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    /**
     * A unique namespace identifying the option's associated AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param namespace A unique namespace identifying the option's associated AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public OptionSpecification withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * The name of the configuration option.
     *
     * @return The name of the configuration option.
     */
    public String getOptionName() {
        return optionName;
    }
    
    /**
     * The name of the configuration option.
     *
     * @param optionName The name of the configuration option.
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }
    
    /**
     * The name of the configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionName The name of the configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public OptionSpecification withOptionName(String optionName) {
        this.optionName = optionName;
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
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getNamespace() != null) sb.append("Namespace: " + getNamespace() + ",");
        if (getOptionName() != null) sb.append("OptionName: " + getOptionName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode()); 
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof OptionSpecification == false) return false;
        OptionSpecification other = (OptionSpecification)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false; 
        if (other.getOptionName() == null ^ this.getOptionName() == null) return false;
        if (other.getOptionName() != null && other.getOptionName().equals(this.getOptionName()) == false) return false; 
        return true;
    }
    
    @Override
    public OptionSpecification clone() {
        try {
            return (OptionSpecification) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    