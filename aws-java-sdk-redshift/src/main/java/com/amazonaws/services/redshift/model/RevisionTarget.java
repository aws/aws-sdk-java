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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a <code>RevisionTarget</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/RevisionTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevisionTarget implements Serializable, Cloneable {

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You can use this value in
     * <a>ModifyClusterDbRevision</a>.
     * </p>
     */
    private String databaseRevision;
    /**
     * <p>
     * A string that describes the changes and features that will be applied to the cluster when it is updated to the
     * corresponding <a>ClusterDbRevision</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     */
    private java.util.Date databaseRevisionReleaseDate;

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You can use this value in
     * <a>ModifyClusterDbRevision</a>.
     * </p>
     * 
     * @param databaseRevision
     *        A unique string that identifies the version to update the cluster to. You can use this value in
     *        <a>ModifyClusterDbRevision</a>.
     */

    public void setDatabaseRevision(String databaseRevision) {
        this.databaseRevision = databaseRevision;
    }

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You can use this value in
     * <a>ModifyClusterDbRevision</a>.
     * </p>
     * 
     * @return A unique string that identifies the version to update the cluster to. You can use this value in
     *         <a>ModifyClusterDbRevision</a>.
     */

    public String getDatabaseRevision() {
        return this.databaseRevision;
    }

    /**
     * <p>
     * A unique string that identifies the version to update the cluster to. You can use this value in
     * <a>ModifyClusterDbRevision</a>.
     * </p>
     * 
     * @param databaseRevision
     *        A unique string that identifies the version to update the cluster to. You can use this value in
     *        <a>ModifyClusterDbRevision</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionTarget withDatabaseRevision(String databaseRevision) {
        setDatabaseRevision(databaseRevision);
        return this;
    }

    /**
     * <p>
     * A string that describes the changes and features that will be applied to the cluster when it is updated to the
     * corresponding <a>ClusterDbRevision</a>.
     * </p>
     * 
     * @param description
     *        A string that describes the changes and features that will be applied to the cluster when it is updated to
     *        the corresponding <a>ClusterDbRevision</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A string that describes the changes and features that will be applied to the cluster when it is updated to the
     * corresponding <a>ClusterDbRevision</a>.
     * </p>
     * 
     * @return A string that describes the changes and features that will be applied to the cluster when it is updated
     *         to the corresponding <a>ClusterDbRevision</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A string that describes the changes and features that will be applied to the cluster when it is updated to the
     * corresponding <a>ClusterDbRevision</a>.
     * </p>
     * 
     * @param description
     *        A string that describes the changes and features that will be applied to the cluster when it is updated to
     *        the corresponding <a>ClusterDbRevision</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionTarget withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     * 
     * @param databaseRevisionReleaseDate
     *        The date on which the database revision was released.
     */

    public void setDatabaseRevisionReleaseDate(java.util.Date databaseRevisionReleaseDate) {
        this.databaseRevisionReleaseDate = databaseRevisionReleaseDate;
    }

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     * 
     * @return The date on which the database revision was released.
     */

    public java.util.Date getDatabaseRevisionReleaseDate() {
        return this.databaseRevisionReleaseDate;
    }

    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     * 
     * @param databaseRevisionReleaseDate
     *        The date on which the database revision was released.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevisionTarget withDatabaseRevisionReleaseDate(java.util.Date databaseRevisionReleaseDate) {
        setDatabaseRevisionReleaseDate(databaseRevisionReleaseDate);
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
        if (getDatabaseRevision() != null)
            sb.append("DatabaseRevision: ").append(getDatabaseRevision()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDatabaseRevisionReleaseDate() != null)
            sb.append("DatabaseRevisionReleaseDate: ").append(getDatabaseRevisionReleaseDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionTarget == false)
            return false;
        RevisionTarget other = (RevisionTarget) obj;
        if (other.getDatabaseRevision() == null ^ this.getDatabaseRevision() == null)
            return false;
        if (other.getDatabaseRevision() != null && other.getDatabaseRevision().equals(this.getDatabaseRevision()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDatabaseRevisionReleaseDate() == null ^ this.getDatabaseRevisionReleaseDate() == null)
            return false;
        if (other.getDatabaseRevisionReleaseDate() != null && other.getDatabaseRevisionReleaseDate().equals(this.getDatabaseRevisionReleaseDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseRevision() == null) ? 0 : getDatabaseRevision().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDatabaseRevisionReleaseDate() == null) ? 0 : getDatabaseRevisionReleaseDate().hashCode());
        return hashCode;
    }

    @Override
    public RevisionTarget clone() {
        try {
            return (RevisionTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
