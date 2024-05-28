/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateCollaboration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCollaborationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     */
    private String collaborationIdentifier;
    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the collaboration.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     * 
     * @param collaborationIdentifier
     *        The identifier for the collaboration.
     */

    public void setCollaborationIdentifier(String collaborationIdentifier) {
        this.collaborationIdentifier = collaborationIdentifier;
    }

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     * 
     * @return The identifier for the collaboration.
     */

    public String getCollaborationIdentifier() {
        return this.collaborationIdentifier;
    }

    /**
     * <p>
     * The identifier for the collaboration.
     * </p>
     * 
     * @param collaborationIdentifier
     *        The identifier for the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCollaborationRequest withCollaborationIdentifier(String collaborationIdentifier) {
        setCollaborationIdentifier(collaborationIdentifier);
        return this;
    }

    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     * 
     * @param name
     *        A human-readable identifier provided by the collaboration owner. Display names are not unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     * 
     * @return A human-readable identifier provided by the collaboration owner. Display names are not unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * </p>
     * 
     * @param name
     *        A human-readable identifier provided by the collaboration owner. Display names are not unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCollaborationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the collaboration.
     * </p>
     * 
     * @param description
     *        A description of the collaboration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the collaboration.
     * </p>
     * 
     * @return A description of the collaboration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the collaboration.
     * </p>
     * 
     * @param description
     *        A description of the collaboration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCollaborationRequest withDescription(String description) {
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
        if (getCollaborationIdentifier() != null)
            sb.append("CollaborationIdentifier: ").append(getCollaborationIdentifier()).append(",");
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

        if (obj instanceof UpdateCollaborationRequest == false)
            return false;
        UpdateCollaborationRequest other = (UpdateCollaborationRequest) obj;
        if (other.getCollaborationIdentifier() == null ^ this.getCollaborationIdentifier() == null)
            return false;
        if (other.getCollaborationIdentifier() != null && other.getCollaborationIdentifier().equals(this.getCollaborationIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getCollaborationIdentifier() == null) ? 0 : getCollaborationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCollaborationRequest clone() {
        return (UpdateCollaborationRequest) super.clone();
    }

}
