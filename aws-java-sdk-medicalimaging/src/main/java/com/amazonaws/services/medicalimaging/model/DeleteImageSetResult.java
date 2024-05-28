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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/DeleteImageSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteImageSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The image set identifier.
     * </p>
     */
    private String imageSetId;
    /**
     * <p>
     * The image set state.
     * </p>
     */
    private String imageSetState;
    /**
     * <p>
     * The image set workflow status.
     * </p>
     */
    private String imageSetWorkflowStatus;

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImageSetResult withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     */

    public void setImageSetId(String imageSetId) {
        this.imageSetId = imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @return The image set identifier.
     */

    public String getImageSetId() {
        return this.imageSetId;
    }

    /**
     * <p>
     * The image set identifier.
     * </p>
     * 
     * @param imageSetId
     *        The image set identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteImageSetResult withImageSetId(String imageSetId) {
        setImageSetId(imageSetId);
        return this;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @param imageSetState
     *        The image set state.
     * @see ImageSetState
     */

    public void setImageSetState(String imageSetState) {
        this.imageSetState = imageSetState;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @return The image set state.
     * @see ImageSetState
     */

    public String getImageSetState() {
        return this.imageSetState;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @param imageSetState
     *        The image set state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public DeleteImageSetResult withImageSetState(String imageSetState) {
        setImageSetState(imageSetState);
        return this;
    }

    /**
     * <p>
     * The image set state.
     * </p>
     * 
     * @param imageSetState
     *        The image set state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetState
     */

    public DeleteImageSetResult withImageSetState(ImageSetState imageSetState) {
        this.imageSetState = imageSetState.toString();
        return this;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status.
     * @see ImageSetWorkflowStatus
     */

    public void setImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @return The image set workflow status.
     * @see ImageSetWorkflowStatus
     */

    public String getImageSetWorkflowStatus() {
        return this.imageSetWorkflowStatus;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public DeleteImageSetResult withImageSetWorkflowStatus(String imageSetWorkflowStatus) {
        setImageSetWorkflowStatus(imageSetWorkflowStatus);
        return this;
    }

    /**
     * <p>
     * The image set workflow status.
     * </p>
     * 
     * @param imageSetWorkflowStatus
     *        The image set workflow status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSetWorkflowStatus
     */

    public DeleteImageSetResult withImageSetWorkflowStatus(ImageSetWorkflowStatus imageSetWorkflowStatus) {
        this.imageSetWorkflowStatus = imageSetWorkflowStatus.toString();
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
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getImageSetId() != null)
            sb.append("ImageSetId: ").append(getImageSetId()).append(",");
        if (getImageSetState() != null)
            sb.append("ImageSetState: ").append(getImageSetState()).append(",");
        if (getImageSetWorkflowStatus() != null)
            sb.append("ImageSetWorkflowStatus: ").append(getImageSetWorkflowStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteImageSetResult == false)
            return false;
        DeleteImageSetResult other = (DeleteImageSetResult) obj;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getImageSetId() == null ^ this.getImageSetId() == null)
            return false;
        if (other.getImageSetId() != null && other.getImageSetId().equals(this.getImageSetId()) == false)
            return false;
        if (other.getImageSetState() == null ^ this.getImageSetState() == null)
            return false;
        if (other.getImageSetState() != null && other.getImageSetState().equals(this.getImageSetState()) == false)
            return false;
        if (other.getImageSetWorkflowStatus() == null ^ this.getImageSetWorkflowStatus() == null)
            return false;
        if (other.getImageSetWorkflowStatus() != null && other.getImageSetWorkflowStatus().equals(this.getImageSetWorkflowStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getImageSetId() == null) ? 0 : getImageSetId().hashCode());
        hashCode = prime * hashCode + ((getImageSetState() == null) ? 0 : getImageSetState().hashCode());
        hashCode = prime * hashCode + ((getImageSetWorkflowStatus() == null) ? 0 : getImageSetWorkflowStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteImageSetResult clone() {
        try {
            return (DeleteImageSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
