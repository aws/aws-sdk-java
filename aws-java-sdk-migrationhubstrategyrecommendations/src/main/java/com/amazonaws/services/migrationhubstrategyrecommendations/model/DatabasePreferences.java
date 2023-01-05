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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Preferences on managing your databases on AWS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/DatabasePreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabasePreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * </p>
     */
    private String databaseManagementPreference;
    /**
     * <p>
     * Specifies your preferred migration path.
     * </p>
     */
    private DatabaseMigrationPreference databaseMigrationPreference;

    /**
     * <p>
     * Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * </p>
     * 
     * @param databaseManagementPreference
     *        Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * @see DatabaseManagementPreference
     */

    public void setDatabaseManagementPreference(String databaseManagementPreference) {
        this.databaseManagementPreference = databaseManagementPreference;
    }

    /**
     * <p>
     * Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * </p>
     * 
     * @return Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * @see DatabaseManagementPreference
     */

    public String getDatabaseManagementPreference() {
        return this.databaseManagementPreference;
    }

    /**
     * <p>
     * Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * </p>
     * 
     * @param databaseManagementPreference
     *        Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseManagementPreference
     */

    public DatabasePreferences withDatabaseManagementPreference(String databaseManagementPreference) {
        setDatabaseManagementPreference(databaseManagementPreference);
        return this;
    }

    /**
     * <p>
     * Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * </p>
     * 
     * @param databaseManagementPreference
     *        Specifies whether you're interested in self-managed databases or databases managed by AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatabaseManagementPreference
     */

    public DatabasePreferences withDatabaseManagementPreference(DatabaseManagementPreference databaseManagementPreference) {
        this.databaseManagementPreference = databaseManagementPreference.toString();
        return this;
    }

    /**
     * <p>
     * Specifies your preferred migration path.
     * </p>
     * 
     * @param databaseMigrationPreference
     *        Specifies your preferred migration path.
     */

    public void setDatabaseMigrationPreference(DatabaseMigrationPreference databaseMigrationPreference) {
        this.databaseMigrationPreference = databaseMigrationPreference;
    }

    /**
     * <p>
     * Specifies your preferred migration path.
     * </p>
     * 
     * @return Specifies your preferred migration path.
     */

    public DatabaseMigrationPreference getDatabaseMigrationPreference() {
        return this.databaseMigrationPreference;
    }

    /**
     * <p>
     * Specifies your preferred migration path.
     * </p>
     * 
     * @param databaseMigrationPreference
     *        Specifies your preferred migration path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabasePreferences withDatabaseMigrationPreference(DatabaseMigrationPreference databaseMigrationPreference) {
        setDatabaseMigrationPreference(databaseMigrationPreference);
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
        if (getDatabaseManagementPreference() != null)
            sb.append("DatabaseManagementPreference: ").append(getDatabaseManagementPreference()).append(",");
        if (getDatabaseMigrationPreference() != null)
            sb.append("DatabaseMigrationPreference: ").append(getDatabaseMigrationPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabasePreferences == false)
            return false;
        DatabasePreferences other = (DatabasePreferences) obj;
        if (other.getDatabaseManagementPreference() == null ^ this.getDatabaseManagementPreference() == null)
            return false;
        if (other.getDatabaseManagementPreference() != null && other.getDatabaseManagementPreference().equals(this.getDatabaseManagementPreference()) == false)
            return false;
        if (other.getDatabaseMigrationPreference() == null ^ this.getDatabaseMigrationPreference() == null)
            return false;
        if (other.getDatabaseMigrationPreference() != null && other.getDatabaseMigrationPreference().equals(this.getDatabaseMigrationPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseManagementPreference() == null) ? 0 : getDatabaseManagementPreference().hashCode());
        hashCode = prime * hashCode + ((getDatabaseMigrationPreference() == null) ? 0 : getDatabaseMigrationPreference().hashCode());
        return hashCode;
    }

    @Override
    public DatabasePreferences clone() {
        try {
            return (DatabasePreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.DatabasePreferencesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
