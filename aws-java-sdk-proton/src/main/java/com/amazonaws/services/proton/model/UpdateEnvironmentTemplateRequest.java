/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironmentTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the environment template update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the environment template to update as displayed in the developer interface.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The name of the environment template to update.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A description of the environment template update.
     * </p>
     * 
     * @param description
     *        A description of the environment template update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment template update.
     * </p>
     * 
     * @return A description of the environment template update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment template update.
     * </p>
     * 
     * @param description
     *        A description of the environment template update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the environment template to update as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The name of the environment template to update as displayed in the developer interface.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the environment template to update as displayed in the developer interface.
     * </p>
     * 
     * @return The name of the environment template to update as displayed in the developer interface.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the environment template to update as displayed in the developer interface.
     * </p>
     * 
     * @param displayName
     *        The name of the environment template to update as displayed in the developer interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentTemplateRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The name of the environment template to update.
     * </p>
     * 
     * @param name
     *        The name of the environment template to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment template to update.
     * </p>
     * 
     * @return The name of the environment template to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment template to update.
     * </p>
     * 
     * @param name
     *        The name of the environment template to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentTemplateRequest withName(String name) {
        setName(name);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentTemplateRequest == false)
            return false;
        UpdateEnvironmentTemplateRequest other = (UpdateEnvironmentTemplateRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentTemplateRequest clone() {
        return (UpdateEnvironmentTemplateRequest) super.clone();
    }

}
