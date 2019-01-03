/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The environment configuration of the function.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/FunctionConfigurationEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfigurationEnvironment implements Serializable, Cloneable, StructuredPojo {

    /**
     * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs
     * to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass
     * container.
     */
    private Boolean accessSysfs;
    /** Configuration related to executing the Lambda function */
    private FunctionExecutionConfig execution;
    /**
     * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda
     * function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a
     * Greengrass container.
     */
    private java.util.List<ResourceAccessPolicy> resourceAccessPolicies;
    /** Environment variables for the Lambda function's configuration. */
    private java.util.Map<String, String> variables;

    /**
     * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs
     * to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass
     * container.
     * 
     * @param accessSysfs
     *        If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda
     *        function needs to read device information from /sys. This setting applies only when you run the Lambda
     *        function in a Greengrass container.
     */

    public void setAccessSysfs(Boolean accessSysfs) {
        this.accessSysfs = accessSysfs;
    }

    /**
     * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs
     * to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass
     * container.
     * 
     * @return If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda
     *         function needs to read device information from /sys. This setting applies only when you run the Lambda
     *         function in a Greengrass container.
     */

    public Boolean getAccessSysfs() {
        return this.accessSysfs;
    }

    /**
     * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs
     * to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass
     * container.
     * 
     * @param accessSysfs
     *        If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda
     *        function needs to read device information from /sys. This setting applies only when you run the Lambda
     *        function in a Greengrass container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withAccessSysfs(Boolean accessSysfs) {
        setAccessSysfs(accessSysfs);
        return this;
    }

    /**
     * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs
     * to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass
     * container.
     * 
     * @return If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda
     *         function needs to read device information from /sys. This setting applies only when you run the Lambda
     *         function in a Greengrass container.
     */

    public Boolean isAccessSysfs() {
        return this.accessSysfs;
    }

    /**
     * Configuration related to executing the Lambda function
     * 
     * @param execution
     *        Configuration related to executing the Lambda function
     */

    public void setExecution(FunctionExecutionConfig execution) {
        this.execution = execution;
    }

    /**
     * Configuration related to executing the Lambda function
     * 
     * @return Configuration related to executing the Lambda function
     */

    public FunctionExecutionConfig getExecution() {
        return this.execution;
    }

    /**
     * Configuration related to executing the Lambda function
     * 
     * @param execution
     *        Configuration related to executing the Lambda function
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withExecution(FunctionExecutionConfig execution) {
        setExecution(execution);
        return this;
    }

    /**
     * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda
     * function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a
     * Greengrass container.
     * 
     * @return A list of the resources, with their permissions, to which the Lambda function will be granted access. A
     *         Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda
     *         function in a Greengrass container.
     */

    public java.util.List<ResourceAccessPolicy> getResourceAccessPolicies() {
        return resourceAccessPolicies;
    }

    /**
     * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda
     * function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a
     * Greengrass container.
     * 
     * @param resourceAccessPolicies
     *        A list of the resources, with their permissions, to which the Lambda function will be granted access. A
     *        Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda
     *        function in a Greengrass container.
     */

    public void setResourceAccessPolicies(java.util.Collection<ResourceAccessPolicy> resourceAccessPolicies) {
        if (resourceAccessPolicies == null) {
            this.resourceAccessPolicies = null;
            return;
        }

        this.resourceAccessPolicies = new java.util.ArrayList<ResourceAccessPolicy>(resourceAccessPolicies);
    }

    /**
     * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda
     * function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a
     * Greengrass container.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceAccessPolicies(java.util.Collection)} or
     * {@link #withResourceAccessPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceAccessPolicies
     *        A list of the resources, with their permissions, to which the Lambda function will be granted access. A
     *        Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda
     *        function in a Greengrass container.
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
     * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda
     * function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a
     * Greengrass container.
     * 
     * @param resourceAccessPolicies
     *        A list of the resources, with their permissions, to which the Lambda function will be granted access. A
     *        Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda
     *        function in a Greengrass container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfigurationEnvironment withResourceAccessPolicies(java.util.Collection<ResourceAccessPolicy> resourceAccessPolicies) {
        setResourceAccessPolicies(resourceAccessPolicies);
        return this;
    }

    /**
     * Environment variables for the Lambda function's configuration.
     * 
     * @return Environment variables for the Lambda function's configuration.
     */

    public java.util.Map<String, String> getVariables() {
        return variables;
    }

    /**
     * Environment variables for the Lambda function's configuration.
     * 
     * @param variables
     *        Environment variables for the Lambda function's configuration.
     */

    public void setVariables(java.util.Map<String, String> variables) {
        this.variables = variables;
    }

    /**
     * Environment variables for the Lambda function's configuration.
     * 
     * @param variables
     *        Environment variables for the Lambda function's configuration.
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
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
        if (getExecution() != null)
            sb.append("Execution: ").append(getExecution()).append(",");
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
        if (other.getExecution() == null ^ this.getExecution() == null)
            return false;
        if (other.getExecution() != null && other.getExecution().equals(this.getExecution()) == false)
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
        hashCode = prime * hashCode + ((getExecution() == null) ? 0 : getExecution().hashCode());
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
