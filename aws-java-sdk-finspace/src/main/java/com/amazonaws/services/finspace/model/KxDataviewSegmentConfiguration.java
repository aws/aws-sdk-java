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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration that contains the database path of the data that you want to place on each selected volume. Each
 * segment must have a unique database path for each volume. If you do not explicitly specify any database path for a
 * volume, they are accessible from the cluster through the default S3/object store segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDataviewSegmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDataviewSegmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database path of the data that you want to place on each selected volume for the segment. Each segment must
     * have a unique database path for each volume.
     * </p>
     */
    private java.util.List<String> dbPaths;
    /**
     * <p>
     * The name of the volume where you want to add data.
     * </p>
     */
    private String volumeName;
    /**
     * <p>
     * Enables on-demand caching on the selected database path when a particular file or a column of the database is
     * accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the filesystem as
     * needed. When it is set to <b>False</b>, everything is cached. The default value is <b>False</b>.
     * </p>
     */
    private Boolean onDemand;

    /**
     * <p>
     * The database path of the data that you want to place on each selected volume for the segment. Each segment must
     * have a unique database path for each volume.
     * </p>
     * 
     * @return The database path of the data that you want to place on each selected volume for the segment. Each
     *         segment must have a unique database path for each volume.
     */

    public java.util.List<String> getDbPaths() {
        return dbPaths;
    }

    /**
     * <p>
     * The database path of the data that you want to place on each selected volume for the segment. Each segment must
     * have a unique database path for each volume.
     * </p>
     * 
     * @param dbPaths
     *        The database path of the data that you want to place on each selected volume for the segment. Each segment
     *        must have a unique database path for each volume.
     */

    public void setDbPaths(java.util.Collection<String> dbPaths) {
        if (dbPaths == null) {
            this.dbPaths = null;
            return;
        }

        this.dbPaths = new java.util.ArrayList<String>(dbPaths);
    }

    /**
     * <p>
     * The database path of the data that you want to place on each selected volume for the segment. Each segment must
     * have a unique database path for each volume.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbPaths(java.util.Collection)} or {@link #withDbPaths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param dbPaths
     *        The database path of the data that you want to place on each selected volume for the segment. Each segment
     *        must have a unique database path for each volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewSegmentConfiguration withDbPaths(String... dbPaths) {
        if (this.dbPaths == null) {
            setDbPaths(new java.util.ArrayList<String>(dbPaths.length));
        }
        for (String ele : dbPaths) {
            this.dbPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The database path of the data that you want to place on each selected volume for the segment. Each segment must
     * have a unique database path for each volume.
     * </p>
     * 
     * @param dbPaths
     *        The database path of the data that you want to place on each selected volume for the segment. Each segment
     *        must have a unique database path for each volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewSegmentConfiguration withDbPaths(java.util.Collection<String> dbPaths) {
        setDbPaths(dbPaths);
        return this;
    }

    /**
     * <p>
     * The name of the volume where you want to add data.
     * </p>
     * 
     * @param volumeName
     *        The name of the volume where you want to add data.
     */

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <p>
     * The name of the volume where you want to add data.
     * </p>
     * 
     * @return The name of the volume where you want to add data.
     */

    public String getVolumeName() {
        return this.volumeName;
    }

    /**
     * <p>
     * The name of the volume where you want to add data.
     * </p>
     * 
     * @param volumeName
     *        The name of the volume where you want to add data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewSegmentConfiguration withVolumeName(String volumeName) {
        setVolumeName(volumeName);
        return this;
    }

    /**
     * <p>
     * Enables on-demand caching on the selected database path when a particular file or a column of the database is
     * accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the filesystem as
     * needed. When it is set to <b>False</b>, everything is cached. The default value is <b>False</b>.
     * </p>
     * 
     * @param onDemand
     *        Enables on-demand caching on the selected database path when a particular file or a column of the database
     *        is accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the
     *        filesystem as needed. When it is set to <b>False</b>, everything is cached. The default value is
     *        <b>False</b>.
     */

    public void setOnDemand(Boolean onDemand) {
        this.onDemand = onDemand;
    }

    /**
     * <p>
     * Enables on-demand caching on the selected database path when a particular file or a column of the database is
     * accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the filesystem as
     * needed. When it is set to <b>False</b>, everything is cached. The default value is <b>False</b>.
     * </p>
     * 
     * @return Enables on-demand caching on the selected database path when a particular file or a column of the
     *         database is accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files
     *         on the filesystem as needed. When it is set to <b>False</b>, everything is cached. The default value is
     *         <b>False</b>.
     */

    public Boolean getOnDemand() {
        return this.onDemand;
    }

    /**
     * <p>
     * Enables on-demand caching on the selected database path when a particular file or a column of the database is
     * accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the filesystem as
     * needed. When it is set to <b>False</b>, everything is cached. The default value is <b>False</b>.
     * </p>
     * 
     * @param onDemand
     *        Enables on-demand caching on the selected database path when a particular file or a column of the database
     *        is accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the
     *        filesystem as needed. When it is set to <b>False</b>, everything is cached. The default value is
     *        <b>False</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDataviewSegmentConfiguration withOnDemand(Boolean onDemand) {
        setOnDemand(onDemand);
        return this;
    }

    /**
     * <p>
     * Enables on-demand caching on the selected database path when a particular file or a column of the database is
     * accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files on the filesystem as
     * needed. When it is set to <b>False</b>, everything is cached. The default value is <b>False</b>.
     * </p>
     * 
     * @return Enables on-demand caching on the selected database path when a particular file or a column of the
     *         database is accessed. When on demand caching is <b>True</b>, dataviews perform minimal loading of files
     *         on the filesystem as needed. When it is set to <b>False</b>, everything is cached. The default value is
     *         <b>False</b>.
     */

    public Boolean isOnDemand() {
        return this.onDemand;
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
        if (getDbPaths() != null)
            sb.append("DbPaths: ").append(getDbPaths()).append(",");
        if (getVolumeName() != null)
            sb.append("VolumeName: ").append(getVolumeName()).append(",");
        if (getOnDemand() != null)
            sb.append("OnDemand: ").append(getOnDemand());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDataviewSegmentConfiguration == false)
            return false;
        KxDataviewSegmentConfiguration other = (KxDataviewSegmentConfiguration) obj;
        if (other.getDbPaths() == null ^ this.getDbPaths() == null)
            return false;
        if (other.getDbPaths() != null && other.getDbPaths().equals(this.getDbPaths()) == false)
            return false;
        if (other.getVolumeName() == null ^ this.getVolumeName() == null)
            return false;
        if (other.getVolumeName() != null && other.getVolumeName().equals(this.getVolumeName()) == false)
            return false;
        if (other.getOnDemand() == null ^ this.getOnDemand() == null)
            return false;
        if (other.getOnDemand() != null && other.getOnDemand().equals(this.getOnDemand()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDbPaths() == null) ? 0 : getDbPaths().hashCode());
        hashCode = prime * hashCode + ((getVolumeName() == null) ? 0 : getVolumeName().hashCode());
        hashCode = prime * hashCode + ((getOnDemand() == null) ? 0 : getOnDemand().hashCode());
        return hashCode;
    }

    @Override
    public KxDataviewSegmentConfiguration clone() {
        try {
            return (KxDataviewSegmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDataviewSegmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
