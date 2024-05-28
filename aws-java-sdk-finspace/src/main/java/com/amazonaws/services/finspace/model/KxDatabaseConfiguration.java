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
 * The configuration of data that is available for querying from this database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxDatabaseConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxDatabaseConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the kdb database. When this parameter is specified in the structure, S3 with the whole database is
     * included by default.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Configuration details for the disk cache used to increase performance reading from a kdb database mounted to the
     * cluster.
     * </p>
     */
    private java.util.List<KxDatabaseCacheConfiguration> cacheConfigurations;
    /**
     * <p>
     * A unique identifier of the changeset that is associated with the cluster.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     */
    private String dataviewName;
    /**
     * <p>
     * The configuration of the dataview to be used with specified cluster.
     * </p>
     */
    private KxDataviewConfiguration dataviewConfiguration;

    /**
     * <p>
     * The name of the kdb database. When this parameter is specified in the structure, S3 with the whole database is
     * included by default.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database. When this parameter is specified in the structure, S3 with the whole
     *        database is included by default.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the kdb database. When this parameter is specified in the structure, S3 with the whole database is
     * included by default.
     * </p>
     * 
     * @return The name of the kdb database. When this parameter is specified in the structure, S3 with the whole
     *         database is included by default.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the kdb database. When this parameter is specified in the structure, S3 with the whole database is
     * included by default.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database. When this parameter is specified in the structure, S3 with the whole
     *        database is included by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseConfiguration withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Configuration details for the disk cache used to increase performance reading from a kdb database mounted to the
     * cluster.
     * </p>
     * 
     * @return Configuration details for the disk cache used to increase performance reading from a kdb database mounted
     *         to the cluster.
     */

    public java.util.List<KxDatabaseCacheConfiguration> getCacheConfigurations() {
        return cacheConfigurations;
    }

    /**
     * <p>
     * Configuration details for the disk cache used to increase performance reading from a kdb database mounted to the
     * cluster.
     * </p>
     * 
     * @param cacheConfigurations
     *        Configuration details for the disk cache used to increase performance reading from a kdb database mounted
     *        to the cluster.
     */

    public void setCacheConfigurations(java.util.Collection<KxDatabaseCacheConfiguration> cacheConfigurations) {
        if (cacheConfigurations == null) {
            this.cacheConfigurations = null;
            return;
        }

        this.cacheConfigurations = new java.util.ArrayList<KxDatabaseCacheConfiguration>(cacheConfigurations);
    }

    /**
     * <p>
     * Configuration details for the disk cache used to increase performance reading from a kdb database mounted to the
     * cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheConfigurations(java.util.Collection)} or {@link #withCacheConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cacheConfigurations
     *        Configuration details for the disk cache used to increase performance reading from a kdb database mounted
     *        to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseConfiguration withCacheConfigurations(KxDatabaseCacheConfiguration... cacheConfigurations) {
        if (this.cacheConfigurations == null) {
            setCacheConfigurations(new java.util.ArrayList<KxDatabaseCacheConfiguration>(cacheConfigurations.length));
        }
        for (KxDatabaseCacheConfiguration ele : cacheConfigurations) {
            this.cacheConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration details for the disk cache used to increase performance reading from a kdb database mounted to the
     * cluster.
     * </p>
     * 
     * @param cacheConfigurations
     *        Configuration details for the disk cache used to increase performance reading from a kdb database mounted
     *        to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseConfiguration withCacheConfigurations(java.util.Collection<KxDatabaseCacheConfiguration> cacheConfigurations) {
        setCacheConfigurations(cacheConfigurations);
        return this;
    }

    /**
     * <p>
     * A unique identifier of the changeset that is associated with the cluster.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier of the changeset that is associated with the cluster.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * A unique identifier of the changeset that is associated with the cluster.
     * </p>
     * 
     * @return A unique identifier of the changeset that is associated with the cluster.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * A unique identifier of the changeset that is associated with the cluster.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier of the changeset that is associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseConfiguration withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     * 
     * @param dataviewName
     *        The name of the dataview to be used for caching historical data on disk.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     * 
     * @return The name of the dataview to be used for caching historical data on disk.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * The name of the dataview to be used for caching historical data on disk.
     * </p>
     * 
     * @param dataviewName
     *        The name of the dataview to be used for caching historical data on disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseConfiguration withDataviewName(String dataviewName) {
        setDataviewName(dataviewName);
        return this;
    }

    /**
     * <p>
     * The configuration of the dataview to be used with specified cluster.
     * </p>
     * 
     * @param dataviewConfiguration
     *        The configuration of the dataview to be used with specified cluster.
     */

    public void setDataviewConfiguration(KxDataviewConfiguration dataviewConfiguration) {
        this.dataviewConfiguration = dataviewConfiguration;
    }

    /**
     * <p>
     * The configuration of the dataview to be used with specified cluster.
     * </p>
     * 
     * @return The configuration of the dataview to be used with specified cluster.
     */

    public KxDataviewConfiguration getDataviewConfiguration() {
        return this.dataviewConfiguration;
    }

    /**
     * <p>
     * The configuration of the dataview to be used with specified cluster.
     * </p>
     * 
     * @param dataviewConfiguration
     *        The configuration of the dataview to be used with specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxDatabaseConfiguration withDataviewConfiguration(KxDataviewConfiguration dataviewConfiguration) {
        setDataviewConfiguration(dataviewConfiguration);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getCacheConfigurations() != null)
            sb.append("CacheConfigurations: ").append(getCacheConfigurations()).append(",");
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getDataviewName() != null)
            sb.append("DataviewName: ").append(getDataviewName()).append(",");
        if (getDataviewConfiguration() != null)
            sb.append("DataviewConfiguration: ").append(getDataviewConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxDatabaseConfiguration == false)
            return false;
        KxDatabaseConfiguration other = (KxDatabaseConfiguration) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getCacheConfigurations() == null ^ this.getCacheConfigurations() == null)
            return false;
        if (other.getCacheConfigurations() != null && other.getCacheConfigurations().equals(this.getCacheConfigurations()) == false)
            return false;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getDataviewName() == null ^ this.getDataviewName() == null)
            return false;
        if (other.getDataviewName() != null && other.getDataviewName().equals(this.getDataviewName()) == false)
            return false;
        if (other.getDataviewConfiguration() == null ^ this.getDataviewConfiguration() == null)
            return false;
        if (other.getDataviewConfiguration() != null && other.getDataviewConfiguration().equals(this.getDataviewConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getCacheConfigurations() == null) ? 0 : getCacheConfigurations().hashCode());
        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getDataviewName() == null) ? 0 : getDataviewName().hashCode());
        hashCode = prime * hashCode + ((getDataviewConfiguration() == null) ? 0 : getDataviewConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public KxDatabaseConfiguration clone() {
        try {
            return (KxDatabaseConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxDatabaseConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
