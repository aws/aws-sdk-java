/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to create an application.
 * </p>
 */
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Describes the application.
     * </p>
     */
    private String description;

    /**
     * Default constructor for CreateApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateApplicationRequest() {
    }

    /**
     * Constructs a new CreateApplicationRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application.</p>
     *        <p>
     *        Constraint: This name must be unique within your account. If the specified name already exists, the action
     *        returns an <code>InvalidParameterValue</code> error.
     */
    public CreateApplicationRequest(String applicationName) {
        setApplicationName(applicationName);
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.</p>
     *        <p>
     *        Constraint: This name must be unique within your account. If the specified name already exists, the action
     *        returns an <code>InvalidParameterValue</code> error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application.</p>
     *         <p>
     *         Constraint: This name must be unique within your account. If the specified name already exists, the
     *         action returns an <code>InvalidParameterValue</code> error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Constraint: This name must be unique within your account. If the specified name already exists, the action
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application.</p>
     *        <p>
     *        Constraint: This name must be unique within your account. If the specified name already exists, the action
     *        returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param description
     *        Describes the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @return Describes the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the application.
     * </p>
     * 
     * @param description
     *        Describes the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }
}
