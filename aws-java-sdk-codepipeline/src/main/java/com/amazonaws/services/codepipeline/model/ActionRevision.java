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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about the version (or revision) of an action.
 * </p>
 */
public class ActionRevision implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the action.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The unique identifier of the change that set the state to this revision, for example a deployment ID or
     * timestamp.
     * </p>
     */
    private String revisionChangeId;
    /**
     * <p>
     * The date and time when the most recent version of the action was created, in timestamp format.
     * </p>
     */
    private java.util.Date created;

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the action.
     * </p>
     * 
     * @param revisionId
     *        The system-generated unique ID that identifies the revision number of the action.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the action.
     * </p>
     * 
     * @return The system-generated unique ID that identifies the revision number of the action.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The system-generated unique ID that identifies the revision number of the action.
     * </p>
     * 
     * @param revisionId
     *        The system-generated unique ID that identifies the revision number of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionRevision withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the change that set the state to this revision, for example a deployment ID or
     * timestamp.
     * </p>
     * 
     * @param revisionChangeId
     *        The unique identifier of the change that set the state to this revision, for example a deployment ID or
     *        timestamp.
     */

    public void setRevisionChangeId(String revisionChangeId) {
        this.revisionChangeId = revisionChangeId;
    }

    /**
     * <p>
     * The unique identifier of the change that set the state to this revision, for example a deployment ID or
     * timestamp.
     * </p>
     * 
     * @return The unique identifier of the change that set the state to this revision, for example a deployment ID or
     *         timestamp.
     */

    public String getRevisionChangeId() {
        return this.revisionChangeId;
    }

    /**
     * <p>
     * The unique identifier of the change that set the state to this revision, for example a deployment ID or
     * timestamp.
     * </p>
     * 
     * @param revisionChangeId
     *        The unique identifier of the change that set the state to this revision, for example a deployment ID or
     *        timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionRevision withRevisionChangeId(String revisionChangeId) {
        setRevisionChangeId(revisionChangeId);
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent version of the action was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time when the most recent version of the action was created, in timestamp format.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time when the most recent version of the action was created, in timestamp format.
     * </p>
     * 
     * @return The date and time when the most recent version of the action was created, in timestamp format.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time when the most recent version of the action was created, in timestamp format.
     * </p>
     * 
     * @param created
     *        The date and time when the most recent version of the action was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionRevision withCreated(java.util.Date created) {
        setCreated(created);
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
        if (getRevisionId() != null)
            sb.append("RevisionId: " + getRevisionId() + ",");
        if (getRevisionChangeId() != null)
            sb.append("RevisionChangeId: " + getRevisionChangeId() + ",");
        if (getCreated() != null)
            sb.append("Created: " + getCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionRevision == false)
            return false;
        ActionRevision other = (ActionRevision) obj;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getRevisionChangeId() == null ^ this.getRevisionChangeId() == null)
            return false;
        if (other.getRevisionChangeId() != null && other.getRevisionChangeId().equals(this.getRevisionChangeId()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getRevisionChangeId() == null) ? 0 : getRevisionChangeId().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        return hashCode;
    }

    @Override
    public ActionRevision clone() {
        try {
            return (ActionRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
