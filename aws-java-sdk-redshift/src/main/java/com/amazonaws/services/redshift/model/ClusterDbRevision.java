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
 * Describes a <code>ClusterDbRevision</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterDbRevision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterDbRevision implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     */
    private String currentDatabaseRevision;
    /**
     * <p>
     * The date on which the database revision was released.
     * </p>
     */
    private java.util.Date databaseRevisionReleaseDate;
    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a cluster
     * can be updated to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RevisionTarget> revisionTargets;

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @return The unique identifier of the cluster.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterDbRevision withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     * 
     * @param currentDatabaseRevision
     *        A string representing the current cluster version.
     */

    public void setCurrentDatabaseRevision(String currentDatabaseRevision) {
        this.currentDatabaseRevision = currentDatabaseRevision;
    }

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     * 
     * @return A string representing the current cluster version.
     */

    public String getCurrentDatabaseRevision() {
        return this.currentDatabaseRevision;
    }

    /**
     * <p>
     * A string representing the current cluster version.
     * </p>
     * 
     * @param currentDatabaseRevision
     *        A string representing the current cluster version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterDbRevision withCurrentDatabaseRevision(String currentDatabaseRevision) {
        setCurrentDatabaseRevision(currentDatabaseRevision);
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

    public ClusterDbRevision withDatabaseRevisionReleaseDate(java.util.Date databaseRevisionReleaseDate) {
        setDatabaseRevisionReleaseDate(databaseRevisionReleaseDate);
        return this;
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a cluster
     * can be updated to.
     * </p>
     * 
     * @return A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a
     *         cluster can be updated to.
     */

    public java.util.List<RevisionTarget> getRevisionTargets() {
        if (revisionTargets == null) {
            revisionTargets = new com.amazonaws.internal.SdkInternalList<RevisionTarget>();
        }
        return revisionTargets;
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a cluster
     * can be updated to.
     * </p>
     * 
     * @param revisionTargets
     *        A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a
     *        cluster can be updated to.
     */

    public void setRevisionTargets(java.util.Collection<RevisionTarget> revisionTargets) {
        if (revisionTargets == null) {
            this.revisionTargets = null;
            return;
        }

        this.revisionTargets = new com.amazonaws.internal.SdkInternalList<RevisionTarget>(revisionTargets);
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a cluster
     * can be updated to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRevisionTargets(java.util.Collection)} or {@link #withRevisionTargets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param revisionTargets
     *        A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a
     *        cluster can be updated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterDbRevision withRevisionTargets(RevisionTarget... revisionTargets) {
        if (this.revisionTargets == null) {
            setRevisionTargets(new com.amazonaws.internal.SdkInternalList<RevisionTarget>(revisionTargets.length));
        }
        for (RevisionTarget ele : revisionTargets) {
            this.revisionTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a cluster
     * can be updated to.
     * </p>
     * 
     * @param revisionTargets
     *        A list of <code>RevisionTarget</code> objects, where each object describes the database revision that a
     *        cluster can be updated to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterDbRevision withRevisionTargets(java.util.Collection<RevisionTarget> revisionTargets) {
        setRevisionTargets(revisionTargets);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getCurrentDatabaseRevision() != null)
            sb.append("CurrentDatabaseRevision: ").append(getCurrentDatabaseRevision()).append(",");
        if (getDatabaseRevisionReleaseDate() != null)
            sb.append("DatabaseRevisionReleaseDate: ").append(getDatabaseRevisionReleaseDate()).append(",");
        if (getRevisionTargets() != null)
            sb.append("RevisionTargets: ").append(getRevisionTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterDbRevision == false)
            return false;
        ClusterDbRevision other = (ClusterDbRevision) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getCurrentDatabaseRevision() == null ^ this.getCurrentDatabaseRevision() == null)
            return false;
        if (other.getCurrentDatabaseRevision() != null && other.getCurrentDatabaseRevision().equals(this.getCurrentDatabaseRevision()) == false)
            return false;
        if (other.getDatabaseRevisionReleaseDate() == null ^ this.getDatabaseRevisionReleaseDate() == null)
            return false;
        if (other.getDatabaseRevisionReleaseDate() != null && other.getDatabaseRevisionReleaseDate().equals(this.getDatabaseRevisionReleaseDate()) == false)
            return false;
        if (other.getRevisionTargets() == null ^ this.getRevisionTargets() == null)
            return false;
        if (other.getRevisionTargets() != null && other.getRevisionTargets().equals(this.getRevisionTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCurrentDatabaseRevision() == null) ? 0 : getCurrentDatabaseRevision().hashCode());
        hashCode = prime * hashCode + ((getDatabaseRevisionReleaseDate() == null) ? 0 : getDatabaseRevisionReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getRevisionTargets() == null) ? 0 : getRevisionTargets().hashCode());
        return hashCode;
    }

    @Override
    public ClusterDbRevision clone() {
        try {
            return (ClusterDbRevision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
