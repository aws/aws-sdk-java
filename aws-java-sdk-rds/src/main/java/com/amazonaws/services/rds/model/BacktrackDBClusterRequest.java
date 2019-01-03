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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BacktrackDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BacktrackDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information
     * about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the nearest
     * possible consistent time for the DB cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     */
    private java.util.Date backtrackTo;
    /**
     * <p>
     * A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise, an
     * error occurs when binary logging is enabled.
     * </p>
     */
    private Boolean force;
    /**
     * <p>
     * If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value backtracks the
     * DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     * </p>
     */
    private Boolean useEarliestTimeOnPointInTimeUnavailable;

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase
     *        string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @return The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase
     *         string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster1</code>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster1</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster to be backtracked. This parameter is stored as a lowercase
     *        string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information
     * about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the nearest
     * possible consistent time for the DB cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     * 
     * @param backtrackTo
     *        The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more
     *        information about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p> <note>
     *        <p>
     *        If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the
     *        nearest possible consistent time for the DB cluster.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain a valid ISO 8601 timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't contain a timestamp set in the future.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2017-07-08T18:00Z</code>
     */

    public void setBacktrackTo(java.util.Date backtrackTo) {
        this.backtrackTo = backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information
     * about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the nearest
     * possible consistent time for the DB cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     * 
     * @return The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more
     *         information about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> </p> <note>
     *         <p>
     *         If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the
     *         nearest possible consistent time for the DB cluster.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain a valid ISO 8601 timestamp.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't contain a timestamp set in the future.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2017-07-08T18:00Z</code>
     */

    public java.util.Date getBacktrackTo() {
        return this.backtrackTo;
    }

    /**
     * <p>
     * The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more information
     * about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia page.</a>
     * </p>
     * <note>
     * <p>
     * If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the nearest
     * possible consistent time for the DB cluster.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain a valid ISO 8601 timestamp.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't contain a timestamp set in the future.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2017-07-08T18:00Z</code>
     * </p>
     * 
     * @param backtrackTo
     *        The timestamp of the time to backtrack the DB cluster to, specified in ISO 8601 format. For more
     *        information about ISO 8601, see the <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *        page.</a> </p> <note>
     *        <p>
     *        If the specified time is not a consistent time for the DB cluster, Aurora automatically chooses the
     *        nearest possible consistent time for the DB cluster.
     *        </p>
     *        </note>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain a valid ISO 8601 timestamp.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't contain a timestamp set in the future.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2017-07-08T18:00Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterRequest withBacktrackTo(java.util.Date backtrackTo) {
        setBacktrackTo(backtrackTo);
        return this;
    }

    /**
     * <p>
     * A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise, an
     * error occurs when binary logging is enabled.
     * </p>
     * 
     * @param force
     *        A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise,
     *        an error occurs when binary logging is enabled.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise, an
     * error occurs when binary logging is enabled.
     * </p>
     * 
     * @return A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise,
     *         an error occurs when binary logging is enabled.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise, an
     * error occurs when binary logging is enabled.
     * </p>
     * 
     * @param force
     *        A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise,
     *        an error occurs when binary logging is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise, an
     * error occurs when binary logging is enabled.
     * </p>
     * 
     * @return A value that, if specified, forces the DB cluster to backtrack when binary logging is enabled. Otherwise,
     *         an error occurs when binary logging is enabled.
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * <p>
     * If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value backtracks the
     * DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     * </p>
     * 
     * @param useEarliestTimeOnPointInTimeUnavailable
     *        If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value
     *        backtracks the DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     */

    public void setUseEarliestTimeOnPointInTimeUnavailable(Boolean useEarliestTimeOnPointInTimeUnavailable) {
        this.useEarliestTimeOnPointInTimeUnavailable = useEarliestTimeOnPointInTimeUnavailable;
    }

    /**
     * <p>
     * If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value backtracks the
     * DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     * </p>
     * 
     * @return If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value
     *         backtracks the DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     */

    public Boolean getUseEarliestTimeOnPointInTimeUnavailable() {
        return this.useEarliestTimeOnPointInTimeUnavailable;
    }

    /**
     * <p>
     * If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value backtracks the
     * DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     * </p>
     * 
     * @param useEarliestTimeOnPointInTimeUnavailable
     *        If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value
     *        backtracks the DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BacktrackDBClusterRequest withUseEarliestTimeOnPointInTimeUnavailable(Boolean useEarliestTimeOnPointInTimeUnavailable) {
        setUseEarliestTimeOnPointInTimeUnavailable(useEarliestTimeOnPointInTimeUnavailable);
        return this;
    }

    /**
     * <p>
     * If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value backtracks the
     * DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     * </p>
     * 
     * @return If <i>BacktrackTo</i> is set to a timestamp earlier than the earliest backtrack time, this value
     *         backtracks the DB cluster to the earliest possible backtrack time. Otherwise, an error occurs.
     */

    public Boolean isUseEarliestTimeOnPointInTimeUnavailable() {
        return this.useEarliestTimeOnPointInTimeUnavailable;
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
        if (getBacktrackTo() != null)
            sb.append("BacktrackTo: ").append(getBacktrackTo()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce()).append(",");
        if (getUseEarliestTimeOnPointInTimeUnavailable() != null)
            sb.append("UseEarliestTimeOnPointInTimeUnavailable: ").append(getUseEarliestTimeOnPointInTimeUnavailable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BacktrackDBClusterRequest == false)
            return false;
        BacktrackDBClusterRequest other = (BacktrackDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getBacktrackTo() == null ^ this.getBacktrackTo() == null)
            return false;
        if (other.getBacktrackTo() != null && other.getBacktrackTo().equals(this.getBacktrackTo()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        if (other.getUseEarliestTimeOnPointInTimeUnavailable() == null ^ this.getUseEarliestTimeOnPointInTimeUnavailable() == null)
            return false;
        if (other.getUseEarliestTimeOnPointInTimeUnavailable() != null
                && other.getUseEarliestTimeOnPointInTimeUnavailable().equals(this.getUseEarliestTimeOnPointInTimeUnavailable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBacktrackTo() == null) ? 0 : getBacktrackTo().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        hashCode = prime * hashCode + ((getUseEarliestTimeOnPointInTimeUnavailable() == null) ? 0 : getUseEarliestTimeOnPointInTimeUnavailable().hashCode());
        return hashCode;
    }

    @Override
    public BacktrackDBClusterRequest clone() {
        return (BacktrackDBClusterRequest) super.clone();
    }

}
