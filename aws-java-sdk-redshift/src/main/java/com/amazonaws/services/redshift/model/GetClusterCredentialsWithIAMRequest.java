/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/GetClusterCredentialsWithIAM"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetClusterCredentialsWithIAMRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database for which you are requesting credentials. If the database name is specified, the IAM
     * policy must allow access to the resource <code>dbname</code> for the specified database name. If the database
     * name is not specified, access to all databases is allowed.
     * </p>
     */
    private String dbName;
    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which you are requesting credentials.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Range: 900-3600. Default: 900.
     * </p>
     */
    private Integer durationSeconds;

    /**
     * <p>
     * The name of the database for which you are requesting credentials. If the database name is specified, the IAM
     * policy must allow access to the resource <code>dbname</code> for the specified database name. If the database
     * name is not specified, access to all databases is allowed.
     * </p>
     * 
     * @param dbName
     *        The name of the database for which you are requesting credentials. If the database name is specified, the
     *        IAM policy must allow access to the resource <code>dbname</code> for the specified database name. If the
     *        database name is not specified, access to all databases is allowed.
     */

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * <p>
     * The name of the database for which you are requesting credentials. If the database name is specified, the IAM
     * policy must allow access to the resource <code>dbname</code> for the specified database name. If the database
     * name is not specified, access to all databases is allowed.
     * </p>
     * 
     * @return The name of the database for which you are requesting credentials. If the database name is specified, the
     *         IAM policy must allow access to the resource <code>dbname</code> for the specified database name. If the
     *         database name is not specified, access to all databases is allowed.
     */

    public String getDbName() {
        return this.dbName;
    }

    /**
     * <p>
     * The name of the database for which you are requesting credentials. If the database name is specified, the IAM
     * policy must allow access to the resource <code>dbname</code> for the specified database name. If the database
     * name is not specified, access to all databases is allowed.
     * </p>
     * 
     * @param dbName
     *        The name of the database for which you are requesting credentials. If the database name is specified, the
     *        IAM policy must allow access to the resource <code>dbname</code> for the specified database name. If the
     *        database name is not specified, access to all databases is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMRequest withDbName(String dbName) {
        setDbName(dbName);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which you are requesting credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster that contains the database for which you are requesting credentials.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which you are requesting credentials.
     * </p>
     * 
     * @return The unique identifier of the cluster that contains the database for which you are requesting credentials.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the cluster that contains the database for which you are requesting credentials.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the cluster that contains the database for which you are requesting credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Range: 900-3600. Default: 900.
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds until the returned temporary password expires.</p>
     *        <p>
     *        Range: 900-3600. Default: 900.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Range: 900-3600. Default: 900.
     * </p>
     * 
     * @return The number of seconds until the returned temporary password expires.</p>
     *         <p>
     *         Range: 900-3600. Default: 900.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The number of seconds until the returned temporary password expires.
     * </p>
     * <p>
     * Range: 900-3600. Default: 900.
     * </p>
     * 
     * @param durationSeconds
     *        The number of seconds until the returned temporary password expires.</p>
     *        <p>
     *        Range: 900-3600. Default: 900.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetClusterCredentialsWithIAMRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
        if (getDbName() != null)
            sb.append("DbName: ").append(getDbName()).append(",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClusterCredentialsWithIAMRequest == false)
            return false;
        GetClusterCredentialsWithIAMRequest other = (GetClusterCredentialsWithIAMRequest) obj;
        if (other.getDbName() == null ^ this.getDbName() == null)
            return false;
        if (other.getDbName() != null && other.getDbName().equals(this.getDbName()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbName() == null) ? 0 : getDbName().hashCode());
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public GetClusterCredentialsWithIAMRequest clone() {
        return (GetClusterCredentialsWithIAMRequest) super.clone();
    }

}
