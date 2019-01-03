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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An ARN of the AWS cloud resource target receiving the migration (e.g., AMI, EC2 instance, RDS instance, etc.).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/CreatedArtifact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatedArtifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description that can be free-form text to record additional detail about the artifact for clarity or for later
     * reference.
     * </p>
     */
    private String description;

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * 
     * @param name
     *        An ARN that uniquely identifies the result of a migration task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * 
     * @return An ARN that uniquely identifies the result of a migration task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An ARN that uniquely identifies the result of a migration task.
     * </p>
     * 
     * @param name
     *        An ARN that uniquely identifies the result of a migration task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatedArtifact withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail about the artifact for clarity or for later
     * reference.
     * </p>
     * 
     * @param description
     *        A description that can be free-form text to record additional detail about the artifact for clarity or for
     *        later reference.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail about the artifact for clarity or for later
     * reference.
     * </p>
     * 
     * @return A description that can be free-form text to record additional detail about the artifact for clarity or
     *         for later reference.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description that can be free-form text to record additional detail about the artifact for clarity or for later
     * reference.
     * </p>
     * 
     * @param description
     *        A description that can be free-form text to record additional detail about the artifact for clarity or for
     *        later reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatedArtifact withDescription(String description) {
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

        if (obj instanceof CreatedArtifact == false)
            return false;
        CreatedArtifact other = (CreatedArtifact) obj;
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreatedArtifact clone() {
        try {
            return (CreatedArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhub.model.transform.CreatedArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
