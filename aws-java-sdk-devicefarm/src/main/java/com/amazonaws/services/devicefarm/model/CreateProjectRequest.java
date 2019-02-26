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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to the create project operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The project's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the specified
     * execution timeout value unless overridden when scheduling a run.
     * </p>
     */
    private Integer defaultJobTimeoutMinutes;

    /**
     * <p>
     * The project's name.
     * </p>
     * 
     * @param name
     *        The project's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The project's name.
     * </p>
     * 
     * @return The project's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The project's name.
     * </p>
     * 
     * @param name
     *        The project's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the specified
     * execution timeout value unless overridden when scheduling a run.
     * </p>
     * 
     * @param defaultJobTimeoutMinutes
     *        Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the
     *        specified execution timeout value unless overridden when scheduling a run.
     */

    public void setDefaultJobTimeoutMinutes(Integer defaultJobTimeoutMinutes) {
        this.defaultJobTimeoutMinutes = defaultJobTimeoutMinutes;
    }

    /**
     * <p>
     * Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the specified
     * execution timeout value unless overridden when scheduling a run.
     * </p>
     * 
     * @return Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the
     *         specified execution timeout value unless overridden when scheduling a run.
     */

    public Integer getDefaultJobTimeoutMinutes() {
        return this.defaultJobTimeoutMinutes;
    }

    /**
     * <p>
     * Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the specified
     * execution timeout value unless overridden when scheduling a run.
     * </p>
     * 
     * @param defaultJobTimeoutMinutes
     *        Sets the execution timeout value (in minutes) for a project. All test runs in this project will use the
     *        specified execution timeout value unless overridden when scheduling a run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProjectRequest withDefaultJobTimeoutMinutes(Integer defaultJobTimeoutMinutes) {
        setDefaultJobTimeoutMinutes(defaultJobTimeoutMinutes);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDefaultJobTimeoutMinutes() != null)
            sb.append("DefaultJobTimeoutMinutes: ").append(getDefaultJobTimeoutMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProjectRequest == false)
            return false;
        CreateProjectRequest other = (CreateProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDefaultJobTimeoutMinutes() == null ^ this.getDefaultJobTimeoutMinutes() == null)
            return false;
        if (other.getDefaultJobTimeoutMinutes() != null && other.getDefaultJobTimeoutMinutes().equals(this.getDefaultJobTimeoutMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDefaultJobTimeoutMinutes() == null) ? 0 : getDefaultJobTimeoutMinutes().hashCode());
        return hashCode;
    }

    @Override
    public CreateProjectRequest clone() {
        return (CreateProjectRequest) super.clone();
    }

}
