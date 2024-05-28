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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes a recommendation of a target engine.
 * </p>
 * <p>
 * A <i>recommendation</i> is a set of possible Amazon Web Services target engines that you can choose to migrate your
 * source on-premises database. In this set, Fleet Advisor suggests a single target engine as the right sized migration
 * destination. To determine this rightsized migration destination, Fleet Advisor uses the inventory metadata and
 * metrics from data collector. You can use recommendations before the start of migration to save costs and reduce
 * risks.
 * </p>
 * <p>
 * With recommendations, you can explore different target options and compare metrics, so you can make an informed
 * decision when you choose the migration target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Recommendation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommendation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the source database for which Fleet Advisor provided this recommendation.
     * </p>
     */
    private String databaseId;
    /**
     * <p>
     * The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     * <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     * <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The date when Fleet Advisor created the target engine recommendation.
     * </p>
     */
    private String createdDate;
    /**
     * <p>
     * The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     * <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates that this target is the rightsized migration destination.
     * </p>
     */
    private Boolean preferred;
    /**
     * <p>
     * The settings in JSON format for the preferred target engine parameters. These parameters include capacity,
     * resource utilization, and the usage type (production, development, or testing).
     * </p>
     */
    private RecommendationSettings settings;
    /**
     * <p>
     * The recommendation of a target engine for the specified source database.
     * </p>
     */
    private RecommendationData data;

    /**
     * <p>
     * The identifier of the source database for which Fleet Advisor provided this recommendation.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database for which Fleet Advisor provided this recommendation.
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p>
     * The identifier of the source database for which Fleet Advisor provided this recommendation.
     * </p>
     * 
     * @return The identifier of the source database for which Fleet Advisor provided this recommendation.
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p>
     * The identifier of the source database for which Fleet Advisor provided this recommendation.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database for which Fleet Advisor provided this recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p>
     * The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     * <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     * <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     * 
     * @param engineName
     *        The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     *        <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     *        <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     * <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     * <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     * 
     * @return The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     *         <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     *         <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     * <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     * <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     * 
     * @param engineName
     *        The name of the target engine. Valid values include <code>"rds-aurora-mysql"</code>,
     *        <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>, <code>"rds-oracle"</code>,
     *        <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The date when Fleet Advisor created the target engine recommendation.
     * </p>
     * 
     * @param createdDate
     *        The date when Fleet Advisor created the target engine recommendation.
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when Fleet Advisor created the target engine recommendation.
     * </p>
     * 
     * @return The date when Fleet Advisor created the target engine recommendation.
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when Fleet Advisor created the target engine recommendation.
     * </p>
     * 
     * @param createdDate
     *        The date when Fleet Advisor created the target engine recommendation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     * <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     * </p>
     * 
     * @param status
     *        The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     *        <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     * <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     * </p>
     * 
     * @return The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     *         <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     * <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     * </p>
     * 
     * @param status
     *        The status of the target engine recommendation. Valid values include <code>"alternate"</code>,
     *        <code>"in-progress"</code>, <code>"not-viable"</code>, and <code>"recommended"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates that this target is the rightsized migration destination.
     * </p>
     * 
     * @param preferred
     *        Indicates that this target is the rightsized migration destination.
     */

    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    /**
     * <p>
     * Indicates that this target is the rightsized migration destination.
     * </p>
     * 
     * @return Indicates that this target is the rightsized migration destination.
     */

    public Boolean getPreferred() {
        return this.preferred;
    }

    /**
     * <p>
     * Indicates that this target is the rightsized migration destination.
     * </p>
     * 
     * @param preferred
     *        Indicates that this target is the rightsized migration destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withPreferred(Boolean preferred) {
        setPreferred(preferred);
        return this;
    }

    /**
     * <p>
     * Indicates that this target is the rightsized migration destination.
     * </p>
     * 
     * @return Indicates that this target is the rightsized migration destination.
     */

    public Boolean isPreferred() {
        return this.preferred;
    }

    /**
     * <p>
     * The settings in JSON format for the preferred target engine parameters. These parameters include capacity,
     * resource utilization, and the usage type (production, development, or testing).
     * </p>
     * 
     * @param settings
     *        The settings in JSON format for the preferred target engine parameters. These parameters include capacity,
     *        resource utilization, and the usage type (production, development, or testing).
     */

    public void setSettings(RecommendationSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * The settings in JSON format for the preferred target engine parameters. These parameters include capacity,
     * resource utilization, and the usage type (production, development, or testing).
     * </p>
     * 
     * @return The settings in JSON format for the preferred target engine parameters. These parameters include
     *         capacity, resource utilization, and the usage type (production, development, or testing).
     */

    public RecommendationSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * The settings in JSON format for the preferred target engine parameters. These parameters include capacity,
     * resource utilization, and the usage type (production, development, or testing).
     * </p>
     * 
     * @param settings
     *        The settings in JSON format for the preferred target engine parameters. These parameters include capacity,
     *        resource utilization, and the usage type (production, development, or testing).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withSettings(RecommendationSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The recommendation of a target engine for the specified source database.
     * </p>
     * 
     * @param data
     *        The recommendation of a target engine for the specified source database.
     */

    public void setData(RecommendationData data) {
        this.data = data;
    }

    /**
     * <p>
     * The recommendation of a target engine for the specified source database.
     * </p>
     * 
     * @return The recommendation of a target engine for the specified source database.
     */

    public RecommendationData getData() {
        return this.data;
    }

    /**
     * <p>
     * The recommendation of a target engine for the specified source database.
     * </p>
     * 
     * @param data
     *        The recommendation of a target engine for the specified source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommendation withData(RecommendationData data) {
        setData(data);
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
        if (getDatabaseId() != null)
            sb.append("DatabaseId: ").append(getDatabaseId()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPreferred() != null)
            sb.append("Preferred: ").append(getPreferred()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommendation == false)
            return false;
        Recommendation other = (Recommendation) obj;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPreferred() == null ^ this.getPreferred() == null)
            return false;
        if (other.getPreferred() != null && other.getPreferred().equals(this.getPreferred()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPreferred() == null) ? 0 : getPreferred().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public Recommendation clone() {
        try {
            return (Recommendation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RecommendationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
