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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the <a>DescribeDBClusterBacktracks</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BacktrackDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BacktrackDBClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     */
    private String backtrackIdentifier;
    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     */
    private java.util.Date backtrackTo;
    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     */
    private java.util.Date backtrackedFrom;
    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     */
    private java.util.Date backtrackRequestCreationTime;
    /**
     * <p>
     * The status of the backtrack. This property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB
     *        cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @return Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB
     *         cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains a user-supplied DB cluster identifier. This identifier is the unique key that identifies a DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterResult withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     * 
     * @param backtrackIdentifier
     *        Contains the backtrack identifier.
     */

    public void setBacktrackIdentifier(String backtrackIdentifier) {
        this.backtrackIdentifier = backtrackIdentifier;
    }

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     * 
     * @return Contains the backtrack identifier.
     */

    public String getBacktrackIdentifier() {
        return this.backtrackIdentifier;
    }

    /**
     * <p>
     * Contains the backtrack identifier.
     * </p>
     * 
     * @param backtrackIdentifier
     *        Contains the backtrack identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterResult withBacktrackIdentifier(String backtrackIdentifier) {
        setBacktrackIdentifier(backtrackIdentifier);
        return this;
    }

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     * 
     * @param backtrackTo
     *        The timestamp of the time to which the DB cluster was backtracked.
     */

    public void setBacktrackTo(java.util.Date backtrackTo) {
        this.backtrackTo = backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     * 
     * @return The timestamp of the time to which the DB cluster was backtracked.
     */

    public java.util.Date getBacktrackTo() {
        return this.backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to which the DB cluster was backtracked.
     * </p>
     * 
     * @param backtrackTo
     *        The timestamp of the time to which the DB cluster was backtracked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterResult withBacktrackTo(java.util.Date backtrackTo) {
        setBacktrackTo(backtrackTo);
        return this;
    }

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     * 
     * @param backtrackedFrom
     *        The timestamp of the time from which the DB cluster was backtracked.
     */

    public void setBacktrackedFrom(java.util.Date backtrackedFrom) {
        this.backtrackedFrom = backtrackedFrom;
    }

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     * 
     * @return The timestamp of the time from which the DB cluster was backtracked.
     */

    public java.util.Date getBacktrackedFrom() {
        return this.backtrackedFrom;
    }

    /**
     * <p>
     * The timestamp of the time from which the DB cluster was backtracked.
     * </p>
     * 
     * @param backtrackedFrom
     *        The timestamp of the time from which the DB cluster was backtracked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterResult withBacktrackedFrom(java.util.Date backtrackedFrom) {
        setBacktrackedFrom(backtrackedFrom);
        return this;
    }

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     * 
     * @param backtrackRequestCreationTime
     *        The timestamp of the time at which the backtrack was requested.
     */

    public void setBacktrackRequestCreationTime(java.util.Date backtrackRequestCreationTime) {
        this.backtrackRequestCreationTime = backtrackRequestCreationTime;
    }

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     * 
     * @return The timestamp of the time at which the backtrack was requested.
     */

    public java.util.Date getBacktrackRequestCreationTime() {
        return this.backtrackRequestCreationTime;
    }

    /**
     * <p>
     * The timestamp of the time at which the backtrack was requested.
     * </p>
     * 
     * @param backtrackRequestCreationTime
     *        The timestamp of the time at which the backtrack was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterResult withBacktrackRequestCreationTime(java.util.Date backtrackRequestCreationTime) {
        setBacktrackRequestCreationTime(backtrackRequestCreationTime);
        return this;
    }

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the backtrack. This property returns one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB
     *        cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB
     *        cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the backtrack. This property returns one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB
     *         cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB
     *         cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the backtrack. This property returns one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the backtrack. This property returns one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>applying</code> - The backtrack is currently being applied to or rolled back from the DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>completed</code> - The backtrack has successfully been applied to or rolled back from the DB
     *        cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code> - An error occurred while the backtrack was applied to or rolled back from the DB
     *        cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code> - The backtrack is currently pending application to or rollback from the DB cluster.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterResult withStatus(String status) {
        setStatus(status);
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getBacktrackIdentifier() != null)
            sb.append("BacktrackIdentifier: ").append(getBacktrackIdentifier()).append(",");
        if (getBacktrackTo() != null)
            sb.append("BacktrackTo: ").append(getBacktrackTo()).append(",");
        if (getBacktrackedFrom() != null)
            sb.append("BacktrackedFrom: ").append(getBacktrackedFrom()).append(",");
        if (getBacktrackRequestCreationTime() != null)
            sb.append("BacktrackRequestCreationTime: ").append(getBacktrackRequestCreationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BacktrackDBClusterResult == false)
            return false;
        BacktrackDBClusterResult other = (BacktrackDBClusterResult) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getBacktrackIdentifier() == null ^ this.getBacktrackIdentifier() == null)
            return false;
        if (other.getBacktrackIdentifier() != null && other.getBacktrackIdentifier().equals(this.getBacktrackIdentifier()) == false)
            return false;
        if (other.getBacktrackTo() == null ^ this.getBacktrackTo() == null)
            return false;
        if (other.getBacktrackTo() != null && other.getBacktrackTo().equals(this.getBacktrackTo()) == false)
            return false;
        if (other.getBacktrackedFrom() == null ^ this.getBacktrackedFrom() == null)
            return false;
        if (other.getBacktrackedFrom() != null && other.getBacktrackedFrom().equals(this.getBacktrackedFrom()) == false)
            return false;
        if (other.getBacktrackRequestCreationTime() == null ^ this.getBacktrackRequestCreationTime() == null)
            return false;
        if (other.getBacktrackRequestCreationTime() != null && other.getBacktrackRequestCreationTime().equals(this.getBacktrackRequestCreationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBacktrackIdentifier() == null) ? 0 : getBacktrackIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBacktrackTo() == null) ? 0 : getBacktrackTo().hashCode());
        hashCode = prime * hashCode + ((getBacktrackedFrom() == null) ? 0 : getBacktrackedFrom().hashCode());
        hashCode = prime * hashCode + ((getBacktrackRequestCreationTime() == null) ? 0 : getBacktrackRequestCreationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public BacktrackDBClusterResult clone() {
        try {
            return (BacktrackDBClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
