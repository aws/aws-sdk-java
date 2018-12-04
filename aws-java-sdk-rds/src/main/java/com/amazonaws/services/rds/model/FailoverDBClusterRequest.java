/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class FailoverDBClusterRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        A DB cluster identifier to force a failover for. This parameter is
     *        not case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * 
     * @return A DB cluster identifier to force a failover for. This parameter
     *         is not case-sensitive. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * A DB cluster identifier to force a failover for. This parameter is not
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        A DB cluster identifier to force a failover for. This parameter is
     *        not case-sensitive. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *        <li>First character must be a letter</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public FailoverDBClusterRequest withDBClusterIdentifier(
            String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailoverDBClusterRequest == false)
            return false;
        FailoverDBClusterRequest other = (FailoverDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null
                ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(
                        this.getDBClusterIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterIdentifier() == null) ? 0
                        : getDBClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public FailoverDBClusterRequest clone() {
        return (FailoverDBClusterRequest) super.clone();
    }
}