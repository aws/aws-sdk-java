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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeMigrationProjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMigrationProjectsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A description of migration projects.
     * </p>
     */
    private java.util.List<MigrationProject> migrationProjects;

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @param marker
     *        Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.</p>
     *        <p>
     *        If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *        <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *        again using the returned token and keeping all other arguments unchanged.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @return Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *         parameter is specified, the response includes only records beyond the marker, up to the value specified
     *         by <code>MaxRecords</code>.</p>
     *         <p>
     *         If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *         <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *         again using the returned token and keeping all other arguments unchanged.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Specifies the unique pagination token that makes it possible to display the next page of results. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * <code>MaxRecords</code>.
     * </p>
     * <p>
     * If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     * <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call again
     * using the returned token and keeping all other arguments unchanged.
     * </p>
     * 
     * @param marker
     *        Specifies the unique pagination token that makes it possible to display the next page of results. If this
     *        parameter is specified, the response includes only records beyond the marker, up to the value specified by
     *        <code>MaxRecords</code>.</p>
     *        <p>
     *        If <code>Marker</code> is returned by a previous response, there are more results available. The value of
     *        <code>Marker</code> is a unique pagination token for each page. To retrieve the next page, make the call
     *        again using the returned token and keeping all other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMigrationProjectsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A description of migration projects.
     * </p>
     * 
     * @return A description of migration projects.
     */

    public java.util.List<MigrationProject> getMigrationProjects() {
        return migrationProjects;
    }

    /**
     * <p>
     * A description of migration projects.
     * </p>
     * 
     * @param migrationProjects
     *        A description of migration projects.
     */

    public void setMigrationProjects(java.util.Collection<MigrationProject> migrationProjects) {
        if (migrationProjects == null) {
            this.migrationProjects = null;
            return;
        }

        this.migrationProjects = new java.util.ArrayList<MigrationProject>(migrationProjects);
    }

    /**
     * <p>
     * A description of migration projects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMigrationProjects(java.util.Collection)} or {@link #withMigrationProjects(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param migrationProjects
     *        A description of migration projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMigrationProjectsResult withMigrationProjects(MigrationProject... migrationProjects) {
        if (this.migrationProjects == null) {
            setMigrationProjects(new java.util.ArrayList<MigrationProject>(migrationProjects.length));
        }
        for (MigrationProject ele : migrationProjects) {
            this.migrationProjects.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of migration projects.
     * </p>
     * 
     * @param migrationProjects
     *        A description of migration projects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMigrationProjectsResult withMigrationProjects(java.util.Collection<MigrationProject> migrationProjects) {
        setMigrationProjects(migrationProjects);
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
        if (getMigrationProjects() != null)
            sb.append("MigrationProjects: ").append(getMigrationProjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMigrationProjectsResult == false)
            return false;
        DescribeMigrationProjectsResult other = (DescribeMigrationProjectsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMigrationProjects() == null ^ this.getMigrationProjects() == null)
            return false;
        if (other.getMigrationProjects() != null && other.getMigrationProjects().equals(this.getMigrationProjects()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMigrationProjects() == null) ? 0 : getMigrationProjects().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMigrationProjectsResult clone() {
        try {
            return (DescribeMigrationProjectsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
