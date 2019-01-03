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
 * Contains the result of a successful invocation of the <a>DescribeDBInstanceAutomatedBackups</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBInstanceAutomatedBackups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBInstanceAutomatedBackupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <a>DBInstanceAutomatedBackup</a> instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackup> dBInstanceAutomatedBackups;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBInstanceAutomatedBackupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>DBInstanceAutomatedBackup</a> instances.
     * </p>
     * 
     * @return A list of <a>DBInstanceAutomatedBackup</a> instances.
     */

    public java.util.List<DBInstanceAutomatedBackup> getDBInstanceAutomatedBackups() {
        if (dBInstanceAutomatedBackups == null) {
            dBInstanceAutomatedBackups = new com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackup>();
        }
        return dBInstanceAutomatedBackups;
    }

    /**
     * <p>
     * A list of <a>DBInstanceAutomatedBackup</a> instances.
     * </p>
     * 
     * @param dBInstanceAutomatedBackups
     *        A list of <a>DBInstanceAutomatedBackup</a> instances.
     */

    public void setDBInstanceAutomatedBackups(java.util.Collection<DBInstanceAutomatedBackup> dBInstanceAutomatedBackups) {
        if (dBInstanceAutomatedBackups == null) {
            this.dBInstanceAutomatedBackups = null;
            return;
        }

        this.dBInstanceAutomatedBackups = new com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackup>(dBInstanceAutomatedBackups);
    }

    /**
     * <p>
     * A list of <a>DBInstanceAutomatedBackup</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBInstanceAutomatedBackups(java.util.Collection)} or
     * {@link #withDBInstanceAutomatedBackups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dBInstanceAutomatedBackups
     *        A list of <a>DBInstanceAutomatedBackup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBInstanceAutomatedBackupsResult withDBInstanceAutomatedBackups(DBInstanceAutomatedBackup... dBInstanceAutomatedBackups) {
        if (this.dBInstanceAutomatedBackups == null) {
            setDBInstanceAutomatedBackups(new com.amazonaws.internal.SdkInternalList<DBInstanceAutomatedBackup>(dBInstanceAutomatedBackups.length));
        }
        for (DBInstanceAutomatedBackup ele : dBInstanceAutomatedBackups) {
            this.dBInstanceAutomatedBackups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>DBInstanceAutomatedBackup</a> instances.
     * </p>
     * 
     * @param dBInstanceAutomatedBackups
     *        A list of <a>DBInstanceAutomatedBackup</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBInstanceAutomatedBackupsResult withDBInstanceAutomatedBackups(java.util.Collection<DBInstanceAutomatedBackup> dBInstanceAutomatedBackups) {
        setDBInstanceAutomatedBackups(dBInstanceAutomatedBackups);
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
        if (getDBInstanceAutomatedBackups() != null)
            sb.append("DBInstanceAutomatedBackups: ").append(getDBInstanceAutomatedBackups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBInstanceAutomatedBackupsResult == false)
            return false;
        DescribeDBInstanceAutomatedBackupsResult other = (DescribeDBInstanceAutomatedBackupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getDBInstanceAutomatedBackups() == null ^ this.getDBInstanceAutomatedBackups() == null)
            return false;
        if (other.getDBInstanceAutomatedBackups() != null && other.getDBInstanceAutomatedBackups().equals(this.getDBInstanceAutomatedBackups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceAutomatedBackups() == null) ? 0 : getDBInstanceAutomatedBackups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBInstanceAutomatedBackupsResult clone() {
        try {
            return (DescribeDBInstanceAutomatedBackupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
