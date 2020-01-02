/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteAutoSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAutoSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the source instance or disk from which to delete the automatic snapshot.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     * <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     * </p>
     */
    private String date;

    /**
     * <p>
     * The name of the source instance or disk from which to delete the automatic snapshot.
     * </p>
     * 
     * @param resourceName
     *        The name of the source instance or disk from which to delete the automatic snapshot.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which to delete the automatic snapshot.
     * </p>
     * 
     * @return The name of the source instance or disk from which to delete the automatic snapshot.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the source instance or disk from which to delete the automatic snapshot.
     * </p>
     * 
     * @param resourceName
     *        The name of the source instance or disk from which to delete the automatic snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAutoSnapshotRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     * <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     * </p>
     * 
     * @param date
     *        The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     *        <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     */

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     * <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     * </p>
     * 
     * @return The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     *         <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     */

    public String getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     * <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     * </p>
     * 
     * @param date
     *        The date of the automatic snapshot to delete in <code>YYYY-MM-DD</code> format. Use the
     *        <code>get auto snapshots</code> operation to get the available automatic snapshots for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAutoSnapshotRequest withDate(String date) {
        setDate(date);
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAutoSnapshotRequest == false)
            return false;
        DeleteAutoSnapshotRequest other = (DeleteAutoSnapshotRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAutoSnapshotRequest clone() {
        return (DeleteAutoSnapshotRequest) super.clone();
    }

}
