/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/UpdateTestGridProject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTestGridProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ARN of the project to update.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * Human-readable name for the project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Human-readable description for the project.
     * </p>
     */
    private String description;

    /**
     * <p>
     * ARN of the project to update.
     * </p>
     * 
     * @param projectArn
     *        ARN of the project to update.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * ARN of the project to update.
     * </p>
     * 
     * @return ARN of the project to update.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * ARN of the project to update.
     * </p>
     * 
     * @param projectArn
     *        ARN of the project to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestGridProjectRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * Human-readable name for the project.
     * </p>
     * 
     * @param name
     *        Human-readable name for the project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Human-readable name for the project.
     * </p>
     * 
     * @return Human-readable name for the project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Human-readable name for the project.
     * </p>
     * 
     * @param name
     *        Human-readable name for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestGridProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Human-readable description for the project.
     * </p>
     * 
     * @param description
     *        Human-readable description for the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description for the project.
     * </p>
     * 
     * @return Human-readable description for the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description for the project.
     * </p>
     * 
     * @param description
     *        Human-readable description for the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTestGridProjectRequest withDescription(String description) {
        setDescription(description);
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
        if (getProjectArn() != null)
            sb.append("ProjectArn: ").append(getProjectArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTestGridProjectRequest == false)
            return false;
        UpdateTestGridProjectRequest other = (UpdateTestGridProjectRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTestGridProjectRequest clone() {
        return (UpdateTestGridProjectRequest) super.clone();
    }

}
