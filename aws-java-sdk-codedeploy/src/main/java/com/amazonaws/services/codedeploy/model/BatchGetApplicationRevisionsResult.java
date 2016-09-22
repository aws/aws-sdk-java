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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a batch get application revisions operation.
 * </p>
 */
public class BatchGetApplicationRevisionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Information about errors that may have occurred during the API call.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Additional information about the revisions, including the type and location.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RevisionInfo> revisions;

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that corresponds to the revisions.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * 
     * @return The name of the application that corresponds to the revisions.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application that corresponds to the revisions.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that corresponds to the revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsResult withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Information about errors that may have occurred during the API call.
     * </p>
     * 
     * @param errorMessage
     *        Information about errors that may have occurred during the API call.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Information about errors that may have occurred during the API call.
     * </p>
     * 
     * @return Information about errors that may have occurred during the API call.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Information about errors that may have occurred during the API call.
     * </p>
     * 
     * @param errorMessage
     *        Information about errors that may have occurred during the API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and location.
     * </p>
     * 
     * @return Additional information about the revisions, including the type and location.
     */

    public java.util.List<RevisionInfo> getRevisions() {
        if (revisions == null) {
            revisions = new com.amazonaws.internal.SdkInternalList<RevisionInfo>();
        }
        return revisions;
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and location.
     * </p>
     * 
     * @param revisions
     *        Additional information about the revisions, including the type and location.
     */

    public void setRevisions(java.util.Collection<RevisionInfo> revisions) {
        if (revisions == null) {
            this.revisions = null;
            return;
        }

        this.revisions = new com.amazonaws.internal.SdkInternalList<RevisionInfo>(revisions);
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisions(java.util.Collection)} or {@link #withRevisions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param revisions
     *        Additional information about the revisions, including the type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsResult withRevisions(RevisionInfo... revisions) {
        if (this.revisions == null) {
            setRevisions(new com.amazonaws.internal.SdkInternalList<RevisionInfo>(revisions.length));
        }
        for (RevisionInfo ele : revisions) {
            this.revisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about the revisions, including the type and location.
     * </p>
     * 
     * @param revisions
     *        Additional information about the revisions, including the type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetApplicationRevisionsResult withRevisions(java.util.Collection<RevisionInfo> revisions) {
        setRevisions(revisions);
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
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getRevisions() != null)
            sb.append("Revisions: " + getRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetApplicationRevisionsResult == false)
            return false;
        BatchGetApplicationRevisionsResult other = (BatchGetApplicationRevisionsResult) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getRevisions() == null ^ this.getRevisions() == null)
            return false;
        if (other.getRevisions() != null && other.getRevisions().equals(this.getRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getRevisions() == null) ? 0 : getRevisions().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetApplicationRevisionsResult clone() {
        try {
            return (BatchGetApplicationRevisionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
