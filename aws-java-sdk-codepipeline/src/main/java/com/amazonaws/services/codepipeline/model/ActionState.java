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
 * Represents information about the state of an action.
 * </p>
 */
public class ActionState implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String actionName;

    private ActionRevision currentRevision;

    private ActionExecution latestExecution;
    /**
     * <p>
     * A URL link for more information about the state of the action, such as a deployment group details page.
     * </p>
     */
    private String entityUrl;
    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     */
    private String revisionUrl;

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param actionName
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionState withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * @param currentRevision
     */

    public void setCurrentRevision(ActionRevision currentRevision) {
        this.currentRevision = currentRevision;
    }

    /**
     * @return
     */

    public ActionRevision getCurrentRevision() {
        return this.currentRevision;
    }

    /**
     * @param currentRevision
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionState withCurrentRevision(ActionRevision currentRevision) {
        setCurrentRevision(currentRevision);
        return this;
    }

    /**
     * @param latestExecution
     */

    public void setLatestExecution(ActionExecution latestExecution) {
        this.latestExecution = latestExecution;
    }

    /**
     * @return
     */

    public ActionExecution getLatestExecution() {
        return this.latestExecution;
    }

    /**
     * @param latestExecution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionState withLatestExecution(ActionExecution latestExecution) {
        setLatestExecution(latestExecution);
        return this;
    }

    /**
     * <p>
     * A URL link for more information about the state of the action, such as a deployment group details page.
     * </p>
     * 
     * @param entityUrl
     *        A URL link for more information about the state of the action, such as a deployment group details page.
     */

    public void setEntityUrl(String entityUrl) {
        this.entityUrl = entityUrl;
    }

    /**
     * <p>
     * A URL link for more information about the state of the action, such as a deployment group details page.
     * </p>
     * 
     * @return A URL link for more information about the state of the action, such as a deployment group details page.
     */

    public String getEntityUrl() {
        return this.entityUrl;
    }

    /**
     * <p>
     * A URL link for more information about the state of the action, such as a deployment group details page.
     * </p>
     * 
     * @param entityUrl
     *        A URL link for more information about the state of the action, such as a deployment group details page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionState withEntityUrl(String entityUrl) {
        setEntityUrl(entityUrl);
        return this;
    }

    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     * 
     * @param revisionUrl
     *        A URL link for more information about the revision, such as a commit details page.
     */

    public void setRevisionUrl(String revisionUrl) {
        this.revisionUrl = revisionUrl;
    }

    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     * 
     * @return A URL link for more information about the revision, such as a commit details page.
     */

    public String getRevisionUrl() {
        return this.revisionUrl;
    }

    /**
     * <p>
     * A URL link for more information about the revision, such as a commit details page.
     * </p>
     * 
     * @param revisionUrl
     *        A URL link for more information about the revision, such as a commit details page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionState withRevisionUrl(String revisionUrl) {
        setRevisionUrl(revisionUrl);
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
        if (getActionName() != null)
            sb.append("ActionName: " + getActionName() + ",");
        if (getCurrentRevision() != null)
            sb.append("CurrentRevision: " + getCurrentRevision() + ",");
        if (getLatestExecution() != null)
            sb.append("LatestExecution: " + getLatestExecution() + ",");
        if (getEntityUrl() != null)
            sb.append("EntityUrl: " + getEntityUrl() + ",");
        if (getRevisionUrl() != null)
            sb.append("RevisionUrl: " + getRevisionUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionState == false)
            return false;
        ActionState other = (ActionState) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getCurrentRevision() == null ^ this.getCurrentRevision() == null)
            return false;
        if (other.getCurrentRevision() != null && other.getCurrentRevision().equals(this.getCurrentRevision()) == false)
            return false;
        if (other.getLatestExecution() == null ^ this.getLatestExecution() == null)
            return false;
        if (other.getLatestExecution() != null && other.getLatestExecution().equals(this.getLatestExecution()) == false)
            return false;
        if (other.getEntityUrl() == null ^ this.getEntityUrl() == null)
            return false;
        if (other.getEntityUrl() != null && other.getEntityUrl().equals(this.getEntityUrl()) == false)
            return false;
        if (other.getRevisionUrl() == null ^ this.getRevisionUrl() == null)
            return false;
        if (other.getRevisionUrl() != null && other.getRevisionUrl().equals(this.getRevisionUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getCurrentRevision() == null) ? 0 : getCurrentRevision().hashCode());
        hashCode = prime * hashCode + ((getLatestExecution() == null) ? 0 : getLatestExecution().hashCode());
        hashCode = prime * hashCode + ((getEntityUrl() == null) ? 0 : getEntityUrl().hashCode());
        hashCode = prime * hashCode + ((getRevisionUrl() == null) ? 0 : getRevisionUrl().hashCode());
        return hashCode;
    }

    @Override
    public ActionState clone() {
        try {
            return (ActionState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
