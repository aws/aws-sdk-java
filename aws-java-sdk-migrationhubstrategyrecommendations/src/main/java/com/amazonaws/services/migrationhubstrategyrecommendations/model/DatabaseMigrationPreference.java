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
 * Preferences for migrating a database to AWS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/DatabaseMigrationPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseMigrationPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether you are interested in moving from one type of database to another. For example, from SQL Server
     * to Amazon Aurora MySQL-Compatible Edition.
     * </p>
     */
    private Heterogeneous heterogeneous;
    /**
     * <p>
     * Indicates whether you are interested in moving to the same type of database into AWS. For example, from SQL
     * Server in your environment to SQL Server on AWS.
     * </p>
     */
    private Homogeneous homogeneous;
    /**
     * <p>
     * Indicated that you do not prefer heterogeneous or homogeneous.
     * </p>
     */
    private NoDatabaseMigrationPreference noPreference;

    /**
     * <p>
     * Indicates whether you are interested in moving from one type of database to another. For example, from SQL Server
     * to Amazon Aurora MySQL-Compatible Edition.
     * </p>
     * 
     * @param heterogeneous
     *        Indicates whether you are interested in moving from one type of database to another. For example, from SQL
     *        Server to Amazon Aurora MySQL-Compatible Edition.
     */

    public void setHeterogeneous(Heterogeneous heterogeneous) {
        this.heterogeneous = heterogeneous;
    }

    /**
     * <p>
     * Indicates whether you are interested in moving from one type of database to another. For example, from SQL Server
     * to Amazon Aurora MySQL-Compatible Edition.
     * </p>
     * 
     * @return Indicates whether you are interested in moving from one type of database to another. For example, from
     *         SQL Server to Amazon Aurora MySQL-Compatible Edition.
     */

    public Heterogeneous getHeterogeneous() {
        return this.heterogeneous;
    }

    /**
     * <p>
     * Indicates whether you are interested in moving from one type of database to another. For example, from SQL Server
     * to Amazon Aurora MySQL-Compatible Edition.
     * </p>
     * 
     * @param heterogeneous
     *        Indicates whether you are interested in moving from one type of database to another. For example, from SQL
     *        Server to Amazon Aurora MySQL-Compatible Edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseMigrationPreference withHeterogeneous(Heterogeneous heterogeneous) {
        setHeterogeneous(heterogeneous);
        return this;
    }

    /**
     * <p>
     * Indicates whether you are interested in moving to the same type of database into AWS. For example, from SQL
     * Server in your environment to SQL Server on AWS.
     * </p>
     * 
     * @param homogeneous
     *        Indicates whether you are interested in moving to the same type of database into AWS. For example, from
     *        SQL Server in your environment to SQL Server on AWS.
     */

    public void setHomogeneous(Homogeneous homogeneous) {
        this.homogeneous = homogeneous;
    }

    /**
     * <p>
     * Indicates whether you are interested in moving to the same type of database into AWS. For example, from SQL
     * Server in your environment to SQL Server on AWS.
     * </p>
     * 
     * @return Indicates whether you are interested in moving to the same type of database into AWS. For example, from
     *         SQL Server in your environment to SQL Server on AWS.
     */

    public Homogeneous getHomogeneous() {
        return this.homogeneous;
    }

    /**
     * <p>
     * Indicates whether you are interested in moving to the same type of database into AWS. For example, from SQL
     * Server in your environment to SQL Server on AWS.
     * </p>
     * 
     * @param homogeneous
     *        Indicates whether you are interested in moving to the same type of database into AWS. For example, from
     *        SQL Server in your environment to SQL Server on AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseMigrationPreference withHomogeneous(Homogeneous homogeneous) {
        setHomogeneous(homogeneous);
        return this;
    }

    /**
     * <p>
     * Indicated that you do not prefer heterogeneous or homogeneous.
     * </p>
     * 
     * @param noPreference
     *        Indicated that you do not prefer heterogeneous or homogeneous.
     */

    public void setNoPreference(NoDatabaseMigrationPreference noPreference) {
        this.noPreference = noPreference;
    }

    /**
     * <p>
     * Indicated that you do not prefer heterogeneous or homogeneous.
     * </p>
     * 
     * @return Indicated that you do not prefer heterogeneous or homogeneous.
     */

    public NoDatabaseMigrationPreference getNoPreference() {
        return this.noPreference;
    }

    /**
     * <p>
     * Indicated that you do not prefer heterogeneous or homogeneous.
     * </p>
     * 
     * @param noPreference
     *        Indicated that you do not prefer heterogeneous or homogeneous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseMigrationPreference withNoPreference(NoDatabaseMigrationPreference noPreference) {
        setNoPreference(noPreference);
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
        if (getHeterogeneous() != null)
            sb.append("Heterogeneous: ").append(getHeterogeneous()).append(",");
        if (getHomogeneous() != null)
            sb.append("Homogeneous: ").append(getHomogeneous()).append(",");
        if (getNoPreference() != null)
            sb.append("NoPreference: ").append(getNoPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseMigrationPreference == false)
            return false;
        DatabaseMigrationPreference other = (DatabaseMigrationPreference) obj;
        if (other.getHeterogeneous() == null ^ this.getHeterogeneous() == null)
            return false;
        if (other.getHeterogeneous() != null && other.getHeterogeneous().equals(this.getHeterogeneous()) == false)
            return false;
        if (other.getHomogeneous() == null ^ this.getHomogeneous() == null)
            return false;
        if (other.getHomogeneous() != null && other.getHomogeneous().equals(this.getHomogeneous()) == false)
            return false;
        if (other.getNoPreference() == null ^ this.getNoPreference() == null)
            return false;
        if (other.getNoPreference() != null && other.getNoPreference().equals(this.getNoPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHeterogeneous() == null) ? 0 : getHeterogeneous().hashCode());
        hashCode = prime * hashCode + ((getHomogeneous() == null) ? 0 : getHomogeneous().hashCode());
        hashCode = prime * hashCode + ((getNoPreference() == null) ? 0 : getNoPreference().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseMigrationPreference clone() {
        try {
            return (DatabaseMigrationPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.DatabaseMigrationPreferenceMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
