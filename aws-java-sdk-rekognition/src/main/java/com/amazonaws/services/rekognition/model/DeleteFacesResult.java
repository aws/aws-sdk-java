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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings (face IDs) of the faces that were deleted.
     * </p>
     */
    private java.util.List<String> deletedFaces;

    /**
     * <p>
     * An array of strings (face IDs) of the faces that were deleted.
     * </p>
     * 
     * @return An array of strings (face IDs) of the faces that were deleted.
     */

    public java.util.List<String> getDeletedFaces() {
        return deletedFaces;
    }

    /**
     * <p>
     * An array of strings (face IDs) of the faces that were deleted.
     * </p>
     * 
     * @param deletedFaces
     *        An array of strings (face IDs) of the faces that were deleted.
     */

    public void setDeletedFaces(java.util.Collection<String> deletedFaces) {
        if (deletedFaces == null) {
            this.deletedFaces = null;
            return;
        }

        this.deletedFaces = new java.util.ArrayList<String>(deletedFaces);
    }

    /**
     * <p>
     * An array of strings (face IDs) of the faces that were deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeletedFaces(java.util.Collection)} or {@link #withDeletedFaces(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deletedFaces
     *        An array of strings (face IDs) of the faces that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFacesResult withDeletedFaces(String... deletedFaces) {
        if (this.deletedFaces == null) {
            setDeletedFaces(new java.util.ArrayList<String>(deletedFaces.length));
        }
        for (String ele : deletedFaces) {
            this.deletedFaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings (face IDs) of the faces that were deleted.
     * </p>
     * 
     * @param deletedFaces
     *        An array of strings (face IDs) of the faces that were deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFacesResult withDeletedFaces(java.util.Collection<String> deletedFaces) {
        setDeletedFaces(deletedFaces);
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
        if (getDeletedFaces() != null)
            sb.append("DeletedFaces: ").append(getDeletedFaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFacesResult == false)
            return false;
        DeleteFacesResult other = (DeleteFacesResult) obj;
        if (other.getDeletedFaces() == null ^ this.getDeletedFaces() == null)
            return false;
        if (other.getDeletedFaces() != null && other.getDeletedFaces().equals(this.getDeletedFaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeletedFaces() == null) ? 0 : getDeletedFaces().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFacesResult clone() {
        try {
            return (DeleteFacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
