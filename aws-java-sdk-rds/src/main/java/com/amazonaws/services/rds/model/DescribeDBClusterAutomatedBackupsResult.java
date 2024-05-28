/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBClusterAutomatedBackups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterAutomatedBackupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <code>DBClusterAutomatedBackup</code> backups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterAutomatedBackup> dBClusterAutomatedBackups;

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        The pagination token provided in the previous request. If this parameter is specified the response
     *        includes only records beyond the marker, up to <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     * 
     * @return The pagination token provided in the previous request. If this parameter is specified the response
     *         includes only records beyond the marker, up to <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token provided in the previous request. If this parameter is specified the response includes only
     * records beyond the marker, up to <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        The pagination token provided in the previous request. If this parameter is specified the response
     *        includes only records beyond the marker, up to <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <code>DBClusterAutomatedBackup</code> backups.
     * </p>
     * 
     * @return A list of <code>DBClusterAutomatedBackup</code> backups.
     */

    public java.util.List<DBClusterAutomatedBackup> getDBClusterAutomatedBackups() {
        if (dBClusterAutomatedBackups == null) {
            dBClusterAutomatedBackups = new com.amazonaws.internal.SdkInternalList<DBClusterAutomatedBackup>();
        }
        return dBClusterAutomatedBackups;
    }

    /**
     * <p>
     * A list of <code>DBClusterAutomatedBackup</code> backups.
     * </p>
     * 
     * @param dBClusterAutomatedBackups
     *        A list of <code>DBClusterAutomatedBackup</code> backups.
     */

    public void setDBClusterAutomatedBackups(java.util.Collection<DBClusterAutomatedBackup> dBClusterAutomatedBackups) {
        if (dBClusterAutomatedBackups == null) {
            this.dBClusterAutomatedBackups = null;
            return;
        }

        this.dBClusterAutomatedBackups = new com.amazonaws.internal.SdkInternalList<DBClusterAutomatedBackup>(dBClusterAutomatedBackups);
    }

    /**
     * <p>
     * A list of <code>DBClusterAutomatedBackup</code> backups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBClusterAutomatedBackups(java.util.Collection)} or
     * {@link #withDBClusterAutomatedBackups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBClusterAutomatedBackups
     *        A list of <code>DBClusterAutomatedBackup</code> backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsResult withDBClusterAutomatedBackups(DBClusterAutomatedBackup... dBClusterAutomatedBackups) {
        if (this.dBClusterAutomatedBackups == null) {
            setDBClusterAutomatedBackups(new com.amazonaws.internal.SdkInternalList<DBClusterAutomatedBackup>(dBClusterAutomatedBackups.length));
        }
        for (DBClusterAutomatedBackup ele : dBClusterAutomatedBackups) {
            this.dBClusterAutomatedBackups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>DBClusterAutomatedBackup</code> backups.
     * </p>
     * 
     * @param dBClusterAutomatedBackups
     *        A list of <code>DBClusterAutomatedBackup</code> backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBClusterAutomatedBackupsResult withDBClusterAutomatedBackups(java.util.Collection<DBClusterAutomatedBackup> dBClusterAutomatedBackups) {
        setDBClusterAutomatedBackups(dBClusterAutomatedBackups);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getDBClusterAutomatedBackups() != null)
            sb.append("DBClusterAutomatedBackups: ").append(getDBClusterAutomatedBackups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterAutomatedBackupsResult == false)
            return false;
        DescribeDBClusterAutomatedBackupsResult other = (DescribeDBClusterAutomatedBackupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBClusterAutomatedBackups() == null ^ this.getDBClusterAutomatedBackups() == null)
            return false;
        if (other.getDBClusterAutomatedBackups() != null && other.getDBClusterAutomatedBackups().equals(this.getDBClusterAutomatedBackups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBClusterAutomatedBackups() == null) ? 0 : getDBClusterAutomatedBackups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBClusterAutomatedBackupsResult clone() {
        try {
            return (DescribeDBClusterAutomatedBackupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
