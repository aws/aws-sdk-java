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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure used in response to request to delete a project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/DeleteProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteProjectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Resources which were deleted.
     * </p>
     */
    private java.util.List<Resource> deletedResources;
    /**
     * <p>
     * Resources which were not deleted, due to a risk of losing potentially important data or files.
     * </p>
     */
    private java.util.List<Resource> orphanedResources;

    /**
     * <p>
     * Resources which were deleted.
     * </p>
     * 
     * @return Resources which were deleted.
     */

    public java.util.List<Resource> getDeletedResources() {
        return deletedResources;
    }

    /**
     * <p>
     * Resources which were deleted.
     * </p>
     * 
     * @param deletedResources
     *        Resources which were deleted.
     */

    public void setDeletedResources(java.util.Collection<Resource> deletedResources) {
        if (deletedResources == null) {
            this.deletedResources = null;
            return;
        }

        this.deletedResources = new java.util.ArrayList<Resource>(deletedResources);
    }

    /**
     * <p>
     * Resources which were deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletedResources(java.util.Collection)} or {@link #withDeletedResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deletedResources
     *        Resources which were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectResult withDeletedResources(Resource... deletedResources) {
        if (this.deletedResources == null) {
            setDeletedResources(new java.util.ArrayList<Resource>(deletedResources.length));
        }
        for (Resource ele : deletedResources) {
            this.deletedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Resources which were deleted.
     * </p>
     * 
     * @param deletedResources
     *        Resources which were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectResult withDeletedResources(java.util.Collection<Resource> deletedResources) {
        setDeletedResources(deletedResources);
        return this;
    }

    /**
     * <p>
     * Resources which were not deleted, due to a risk of losing potentially important data or files.
     * </p>
     * 
     * @return Resources which were not deleted, due to a risk of losing potentially important data or files.
     */

    public java.util.List<Resource> getOrphanedResources() {
        return orphanedResources;
    }

    /**
     * <p>
     * Resources which were not deleted, due to a risk of losing potentially important data or files.
     * </p>
     * 
     * @param orphanedResources
     *        Resources which were not deleted, due to a risk of losing potentially important data or files.
     */

    public void setOrphanedResources(java.util.Collection<Resource> orphanedResources) {
        if (orphanedResources == null) {
            this.orphanedResources = null;
            return;
        }

        this.orphanedResources = new java.util.ArrayList<Resource>(orphanedResources);
    }

    /**
     * <p>
     * Resources which were not deleted, due to a risk of losing potentially important data or files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrphanedResources(java.util.Collection)} or {@link #withOrphanedResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param orphanedResources
     *        Resources which were not deleted, due to a risk of losing potentially important data or files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectResult withOrphanedResources(Resource... orphanedResources) {
        if (this.orphanedResources == null) {
            setOrphanedResources(new java.util.ArrayList<Resource>(orphanedResources.length));
        }
        for (Resource ele : orphanedResources) {
            this.orphanedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Resources which were not deleted, due to a risk of losing potentially important data or files.
     * </p>
     * 
     * @param orphanedResources
     *        Resources which were not deleted, due to a risk of losing potentially important data or files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteProjectResult withOrphanedResources(java.util.Collection<Resource> orphanedResources) {
        setOrphanedResources(orphanedResources);
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
        if (getDeletedResources() != null)
            sb.append("DeletedResources: ").append(getDeletedResources()).append(",");
        if (getOrphanedResources() != null)
            sb.append("OrphanedResources: ").append(getOrphanedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteProjectResult == false)
            return false;
        DeleteProjectResult other = (DeleteProjectResult) obj;
        if (other.getDeletedResources() == null ^ this.getDeletedResources() == null)
            return false;
        if (other.getDeletedResources() != null && other.getDeletedResources().equals(this.getDeletedResources()) == false)
            return false;
        if (other.getOrphanedResources() == null ^ this.getOrphanedResources() == null)
            return false;
        if (other.getOrphanedResources() != null && other.getOrphanedResources().equals(this.getOrphanedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletedResources() == null) ? 0 : getDeletedResources().hashCode());
        hashCode = prime * hashCode + ((getOrphanedResources() == null) ? 0 : getOrphanedResources().hashCode());
        return hashCode;
    }

    @Override
    public DeleteProjectResult clone() {
        try {
            return (DeleteProjectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
