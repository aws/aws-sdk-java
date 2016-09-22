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
 * Information about an application revision.
 * </p>
 */
public class RevisionInfo implements Serializable, Cloneable {

    private RevisionLocation revisionLocation;

    private GenericRevisionInfo genericRevisionInfo;

    /**
     * @param revisionLocation
     */

    public void setRevisionLocation(RevisionLocation revisionLocation) {
        this.revisionLocation = revisionLocation;
    }

    /**
     * @return
     */

    public RevisionLocation getRevisionLocation() {
        return this.revisionLocation;
    }

    /**
     * @param revisionLocation
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionInfo withRevisionLocation(RevisionLocation revisionLocation) {
        setRevisionLocation(revisionLocation);
        return this;
    }

    /**
     * @param genericRevisionInfo
     */

    public void setGenericRevisionInfo(GenericRevisionInfo genericRevisionInfo) {
        this.genericRevisionInfo = genericRevisionInfo;
    }

    /**
     * @return
     */

    public GenericRevisionInfo getGenericRevisionInfo() {
        return this.genericRevisionInfo;
    }

    /**
     * @param genericRevisionInfo
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionInfo withGenericRevisionInfo(GenericRevisionInfo genericRevisionInfo) {
        setGenericRevisionInfo(genericRevisionInfo);
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
        if (getRevisionLocation() != null)
            sb.append("RevisionLocation: " + getRevisionLocation() + ",");
        if (getGenericRevisionInfo() != null)
            sb.append("GenericRevisionInfo: " + getGenericRevisionInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionInfo == false)
            return false;
        RevisionInfo other = (RevisionInfo) obj;
        if (other.getRevisionLocation() == null ^ this.getRevisionLocation() == null)
            return false;
        if (other.getRevisionLocation() != null && other.getRevisionLocation().equals(this.getRevisionLocation()) == false)
            return false;
        if (other.getGenericRevisionInfo() == null ^ this.getGenericRevisionInfo() == null)
            return false;
        if (other.getGenericRevisionInfo() != null && other.getGenericRevisionInfo().equals(this.getGenericRevisionInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevisionLocation() == null) ? 0 : getRevisionLocation().hashCode());
        hashCode = prime * hashCode + ((getGenericRevisionInfo() == null) ? 0 : getGenericRevisionInfo().hashCode());
        return hashCode;
    }

    @Override
    public RevisionInfo clone() {
        try {
            return (RevisionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
