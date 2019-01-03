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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about a current revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/CurrentRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentRevision implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The revision ID of the current version of an artifact.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The change identifier for the current revision.
     * </p>
     */
    private String changeIdentifier;
    /**
     * <p>
     * The date and time when the most recent revision of the artifact was created, in timestamp format.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The summary of the most recent revision of the artifact.
     * </p>
     */
    private String revisionSummary;

    /**
     * <p>
     * The revision ID of the current version of an artifact.
     * </p>
     * 
     * @param revision
     *        The revision ID of the current version of an artifact.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision ID of the current version of an artifact.
     * </p>
     * 
     * @return The revision ID of the current version of an artifact.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision ID of the current version of an artifact.
     * </p>
     * 
     * @param revision
     *        The revision ID of the current version of an artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentRevision withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The change identifier for the current revision.
     * </p>
     * 
     * @param changeIdentifier
     *        The change identifier for the current revision.
     */

    public void setChangeIdentifier(String changeIdentifier) {
        this.changeIdentifier = changeIdentifier;
    }

    /**
     * <p>
     * The change identifier for the current revision.
     * </p>
     * 
     * @return The change identifier for the current revision.
     */

    public String getChangeIdentifier() {
        return this.changeIdentifier;
    }

    /**
     * <p>
     * The change identifier for the current revision.
     * </p>
     * 
     * @param changeIdentifier
     *        The change identifier for the current revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentRevision withChangeIdentifier(String changeIdentifier) {
        setChangeIdentifier(changeIdentifier);
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent revision of the artifact was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time when the most recent revision of the artifact was created, in timestamp format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time when the most recent revision of the artifact was created, in timestamp format.
     * </p>
     * 
     * @return The date and time when the most recent revision of the artifact was created, in timestamp format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time when the most recent revision of the artifact was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time when the most recent revision of the artifact was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentRevision withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The summary of the most recent revision of the artifact.
     * </p>
     * 
     * @param revisionSummary
     *        The summary of the most recent revision of the artifact.
     */

    public void setRevisionSummary(String revisionSummary) {
        this.revisionSummary = revisionSummary;
    }

    /**
     * <p>
     * The summary of the most recent revision of the artifact.
     * </p>
     * 
     * @return The summary of the most recent revision of the artifact.
     */

    public String getRevisionSummary() {
        return this.revisionSummary;
    }

    /**
     * <p>
     * The summary of the most recent revision of the artifact.
     * </p>
     * 
     * @param revisionSummary
     *        The summary of the most recent revision of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentRevision withRevisionSummary(String revisionSummary) {
        setRevisionSummary(revisionSummary);
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
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getChangeIdentifier() != null)
            sb.append("ChangeIdentifier: ").append(getChangeIdentifier()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getRevisionSummary() != null)
            sb.append("RevisionSummary: ").append(getRevisionSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentRevision == false)
            return false;
        CurrentRevision other = (CurrentRevision) obj;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getChangeIdentifier() == null ^ this.getChangeIdentifier() == null)
            return false;
        if (other.getChangeIdentifier() != null && other.getChangeIdentifier().equals(this.getChangeIdentifier()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getRevisionSummary() == null ^ this.getRevisionSummary() == null)
            return false;
        if (other.getRevisionSummary() != null && other.getRevisionSummary().equals(this.getRevisionSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getChangeIdentifier() == null) ? 0 : getChangeIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getRevisionSummary() == null) ? 0 : getRevisionSummary().hashCode());
        return hashCode;
    }

    @Override
    public CurrentRevision clone() {
        try {
            return (CurrentRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.CurrentRevisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
