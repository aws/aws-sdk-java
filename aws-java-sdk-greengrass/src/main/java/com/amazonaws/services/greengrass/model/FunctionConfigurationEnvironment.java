/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Environment of the function configuration
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionConfigurationEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfigurationEnvironment implements Serializable, Cloneable, StructuredPojo {

    /** Flag to allow lambda access sys filesystem. */
    private Boolean accessSysfs;
    /** Policies for the function to access resources. */
    private java.util.List<ResourceAccessPolicy> resourceAccessPolicies;
    /** Environment variables for the lambda function. */
    private java.util.Map<String, String> variables;

    /**
     * Flag to allow lambda access sys filesystem.
     * 
     * @param accessSysfs
     *        Flag to allow lambda access sys filesystem.
     */

    public void setAccessSysfs(Boolean accessSysfs) {
        this.accessSysfs = accessSysfs;
    }

    /**
     * Flag to allow lambda access sys filesystem.
     * 
     * @return Flag to allow lambda access sys filesystem.
     */

    public Boolean getAccessSysfs() {
        return this.accessSysfs;
    }

    /**
     * Flag to allow lambda access sys filesystem.
     * 
     * @param accessSysfs
     *        Flag to allow lambda access sys filesystem.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withAccessSysfs(Boolean accessSysfs) {
        setAccessSysfs(accessSysfs);
        return this;
    }

    /**
     * Flag to allow lambda access sys filesystem.
     * 
     * @return Flag to allow lambda access sys filesystem.
     */

    public Boolean isAccessSysfs() {
        return this.accessSysfs;
    }

    /**
     * Policies for the function to access resources.
     * 
     * @return Policies for the function to access resources.
     */

    public java.util.List<ResourceAccessPolicy> getResourceAccessPolicies() {
        return resourceAccessPolicies;
    }

    /**
     * Policies for the function to access resources.
     * 
     * @param resourceAccessPolicies
     *        Policies for the function to access resources.
     */

    public void setResourceAccessPolicies(java.util.Collection<ResourceAccessPolicy> resourceAccessPolicies) {
        if (resourceAccessPolicies == null) {
            this.resourceAccessPolicies = null;
            return;
        }

        this.resourceAccessPolicies = new java.util.ArrayList<ResourceAccessPolicy>(resourceAccessPolicies);
    }

    /**
     * Policies for the function to access resources.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceAccessPolicies(java.util.Collection)} or
     * {@link #withResourceAccessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceAccessPolicies
     *        Policies for the function to access resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withResourceAccessPolicies(ResourceAccessPolicy... resourceAccessPolicies) {
        if (this.resourceAccessPolicies == null) {
            setResourceAccessPolicies(new java.util.ArrayList<ResourceAccessPolicy>(resourceAccessPolicies.length));
        }
        for (ResourceAccessPolicy ele : resourceAccessPolicies) {
            this.resourceAccessPolicies.add(ele);
        }
        return this;
    }

    /**
     * Policies for the function to access resources.
     * 
     * @param resourceAccessPolicies
     *        Policies for the function to access resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withResourceAccessPolicies(java.util.Collection<ResourceAccessPolicy> resourceAccessPolicies) {
        setResourceAccessPolicies(resourceAccessPolicies);
        return this;
    }

    /**
     * Environment variables for the lambda function.
     * 
     * @return Environment variables for the lambda function.
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * Environment variables for the lambda function.
     * 
     * @param variables
     *        Environment variables for the lambda function.
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * Environment variables for the lambda function.
     * 
     * @param variables
     *        Environment variables for the lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withVariables(java.util.Map<String, String> variables) {
        setVariables(variables);
        return this;
    }

    public FunctionConfigurationEnvironment addVariablesEntry(String key, String value) {
        if (null == this.variables) {
            this.variables = new java.util.HashMap<String, String>();
        }
        if (this.variables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.variables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Variables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment clearVariablesEntries() {
        this.variables = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccessSysfs() != null)
            sb.append("AccessSysfs: ").append(getAccessSysfs()).append(",");
        if (getResourceAccessPolicies() != null)
            sb.append("ResourceAccessPolicies: ").append(getResourceAccessPolicies()).append(",");
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FunctionConfigurationEnvironment == false)
            return false;
        FunctionConfigurationEnvironment other = (FunctionConfigurationEnvironment) obj;
        if (other.getAccessSysfs() == null ^ this.getAccessSysfs() == null)
            return false;
        if (other.getAccessSysfs() != null && other.getAccessSysfs().equals(this.getAccessSysfs()) == false)
            return false;
        if (other.getResourceAccessPolicies() == null ^ this.getResourceAccessPolicies() == null)
            return false;
        if (other.getResourceAccessPolicies() != null && other.getResourceAccessPolicies().equals(this.getResourceAccessPolicies()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessSysfs() == null) ? 0 : getAccessSysfs().hashCode());
        hashCode = prime * hashCode + ((getResourceAccessPolicies() == null) ? 0 : getResourceAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        return hashCode;
    }

    @Override
    public FunctionConfigurationEnvironment clone() {
        try {
            return (FunctionConfigurationEnvironment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.FunctionConfigurationEnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
