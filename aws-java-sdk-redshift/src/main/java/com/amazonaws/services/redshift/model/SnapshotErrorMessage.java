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
 * Describes the errors returned by a snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/SnapshotErrorMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotErrorMessage implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     */
    private String snapshotClusterIdentifier;
    /**
     * <p>
     * The failure code for the error.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The text message describing the error.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     * 
     * @param snapshotIdentifier
     *        A unique identifier for the snapshot returning the error.
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     * 
     * @return A unique identifier for the snapshot returning the error.
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot returning the error.
     * </p>
     * 
     * @param snapshotIdentifier
     *        A unique identifier for the snapshot returning the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotErrorMessage withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        A unique identifier for the cluster.
     */

    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * 
     * @return A unique identifier for the cluster.
     */

    public String getSnapshotClusterIdentifier() {
        return this.snapshotClusterIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the cluster.
     * </p>
     * 
     * @param snapshotClusterIdentifier
     *        A unique identifier for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotErrorMessage withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        setSnapshotClusterIdentifier(snapshotClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The failure code for the error.
     * </p>
     * 
     * @param failureCode
     *        The failure code for the error.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code for the error.
     * </p>
     * 
     * @return The failure code for the error.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code for the error.
     * </p>
     * 
     * @param failureCode
     *        The failure code for the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotErrorMessage withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The text message describing the error.
     * </p>
     * 
     * @param failureReason
     *        The text message describing the error.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The text message describing the error.
     * </p>
     * 
     * @return The text message describing the error.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The text message describing the error.
     * </p>
     * 
     * @param failureReason
     *        The text message describing the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnapshotErrorMessage withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getSnapshotClusterIdentifier() != null)
            sb.append("SnapshotClusterIdentifier: ").append(getSnapshotClusterIdentifier()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapshotErrorMessage == false)
            return false;
        SnapshotErrorMessage other = (SnapshotErrorMessage) obj;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getSnapshotClusterIdentifier() == null ^ this.getSnapshotClusterIdentifier() == null)
            return false;
        if (other.getSnapshotClusterIdentifier() != null && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public SnapshotErrorMessage clone() {
        try {
            return (SnapshotErrorMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
