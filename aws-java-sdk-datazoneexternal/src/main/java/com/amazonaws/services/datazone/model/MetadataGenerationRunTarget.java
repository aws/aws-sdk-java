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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The asset for which metadata was generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/MetadataGenerationRunTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataGenerationRunTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the metadata generation run's target.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The revision of the asset for which metadata was generated.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The type of the asset for which metadata was generated.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the metadata generation run's target.
     * </p>
     * 
     * @param identifier
     *        The ID of the metadata generation run's target.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The ID of the metadata generation run's target.
     * </p>
     * 
     * @return The ID of the metadata generation run's target.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The ID of the metadata generation run's target.
     * </p>
     * 
     * @param identifier
     *        The ID of the metadata generation run's target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataGenerationRunTarget withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The revision of the asset for which metadata was generated.
     * </p>
     * 
     * @param revision
     *        The revision of the asset for which metadata was generated.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the asset for which metadata was generated.
     * </p>
     * 
     * @return The revision of the asset for which metadata was generated.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the asset for which metadata was generated.
     * </p>
     * 
     * @param revision
     *        The revision of the asset for which metadata was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataGenerationRunTarget withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which metadata was generated.
     * </p>
     * 
     * @param type
     *        The type of the asset for which metadata was generated.
     * @see MetadataGenerationTargetType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the asset for which metadata was generated.
     * </p>
     * 
     * @return The type of the asset for which metadata was generated.
     * @see MetadataGenerationTargetType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the asset for which metadata was generated.
     * </p>
     * 
     * @param type
     *        The type of the asset for which metadata was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationTargetType
     */

    public MetadataGenerationRunTarget withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which metadata was generated.
     * </p>
     * 
     * @param type
     *        The type of the asset for which metadata was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataGenerationTargetType
     */

    public MetadataGenerationRunTarget withType(MetadataGenerationTargetType type) {
        this.type = type.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataGenerationRunTarget == false)
            return false;
        MetadataGenerationRunTarget other = (MetadataGenerationRunTarget) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MetadataGenerationRunTarget clone() {
        try {
            return (MetadataGenerationRunTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.MetadataGenerationRunTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
