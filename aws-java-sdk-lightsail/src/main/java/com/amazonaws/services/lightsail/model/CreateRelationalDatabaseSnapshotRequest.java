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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateRelationalDatabaseSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRelationalDatabaseSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database on which to base your new snapshot.
     * </p>
     */
    private String relationalDatabaseName;
    /**
     * <p>
     * The name for your new database snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     */
    private String relationalDatabaseSnapshotName;
    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the database on which to base your new snapshot.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of the database on which to base your new snapshot.
     */

    public void setRelationalDatabaseName(String relationalDatabaseName) {
        this.relationalDatabaseName = relationalDatabaseName;
    }

    /**
     * <p>
     * The name of the database on which to base your new snapshot.
     * </p>
     * 
     * @return The name of the database on which to base your new snapshot.
     */

    public String getRelationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    /**
     * <p>
     * The name of the database on which to base your new snapshot.
     * </p>
     * 
     * @param relationalDatabaseName
     *        The name of the database on which to base your new snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseSnapshotRequest withRelationalDatabaseName(String relationalDatabaseName) {
        setRelationalDatabaseName(relationalDatabaseName);
        return this;
    }

    /**
     * <p>
     * The name for your new database snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name for your new database snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     */

    public void setRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        this.relationalDatabaseSnapshotName = relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name for your new database snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for your new database snapshot.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first and last character must be a letter or number.
     *         </p>
     *         </li>
     */

    public String getRelationalDatabaseSnapshotName() {
        return this.relationalDatabaseSnapshotName;
    }

    /**
     * <p>
     * The name for your new database snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 2 to 255 alphanumeric characters, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first and last character must be a letter or number.
     * </p>
     * </li>
     * </ul>
     * 
     * @param relationalDatabaseSnapshotName
     *        The name for your new database snapshot.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 2 to 255 alphanumeric characters, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first and last character must be a letter or number.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseSnapshotRequest withRelationalDatabaseSnapshotName(String relationalDatabaseSnapshotName) {
        setRelationalDatabaseSnapshotName(relationalDatabaseSnapshotName);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @return The tag keys and optional values to add to the resource during create.</p>
     *         <p>
     *         To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values to add to the resource during create.
     * </p>
     * <p>
     * To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values to add to the resource during create.</p>
     *        <p>
     *        To tag a resource after it has been created, see the <code>tag resource</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRelationalDatabaseSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getRelationalDatabaseName() != null)
            sb.append("RelationalDatabaseName: ").append(getRelationalDatabaseName()).append(",");
        if (getRelationalDatabaseSnapshotName() != null)
            sb.append("RelationalDatabaseSnapshotName: ").append(getRelationalDatabaseSnapshotName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRelationalDatabaseSnapshotRequest == false)
            return false;
        CreateRelationalDatabaseSnapshotRequest other = (CreateRelationalDatabaseSnapshotRequest) obj;
        if (other.getRelationalDatabaseName() == null ^ this.getRelationalDatabaseName() == null)
            return false;
        if (other.getRelationalDatabaseName() != null && other.getRelationalDatabaseName().equals(this.getRelationalDatabaseName()) == false)
            return false;
        if (other.getRelationalDatabaseSnapshotName() == null ^ this.getRelationalDatabaseSnapshotName() == null)
            return false;
        if (other.getRelationalDatabaseSnapshotName() != null
                && other.getRelationalDatabaseSnapshotName().equals(this.getRelationalDatabaseSnapshotName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalDatabaseName() == null) ? 0 : getRelationalDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseSnapshotName() == null) ? 0 : getRelationalDatabaseSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRelationalDatabaseSnapshotRequest clone() {
        return (CreateRelationalDatabaseSnapshotRequest) super.clone();
    }

}
