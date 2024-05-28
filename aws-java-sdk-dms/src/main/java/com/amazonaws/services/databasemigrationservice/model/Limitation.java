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
 * Provides information about the limitations of target Amazon Web Services engines.
 * </p>
 * <p>
 * Your source database might include features that the target Amazon Web Services engine doesn't support. Fleet Advisor
 * lists these features as limitations. You should consider these limitations during database migration. For each
 * limitation, Fleet Advisor recommends an action that you can take to address or avoid this limitation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Limitation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Limitation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     */
    private String databaseId;
    /**
     * <p>
     * The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid values
     * include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>,
     * <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The name of the limitation. Describes unsupported database features, migration action items, and other
     * limitations.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the limitation. Provides additional information about the limitation, and includes recommended
     * actions that you can take to address or avoid this limitation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The impact of the limitation. You can use this parameter to prioritize limitations that you want to address.
     * Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and <code>"Low"</code>.
     * </p>
     */
    private String impact;
    /**
     * <p>
     * The type of the limitation, such as action required, upgrade required, and limited feature.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database.
     */

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     * 
     * @return The identifier of the source database.
     */

    public String getDatabaseId() {
        return this.databaseId;
    }

    /**
     * <p>
     * The identifier of the source database.
     * </p>
     * 
     * @param databaseId
     *        The identifier of the source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limitation withDatabaseId(String databaseId) {
        setDatabaseId(databaseId);
        return this;
    }

    /**
     * <p>
     * The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid values
     * include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>,
     * <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     * 
     * @param engineName
     *        The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid
     *        values include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>,
     *        <code>"rds-mysql"</code>, <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and
     *        <code>"rds-postgresql"</code>.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid values
     * include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>,
     * <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     * 
     * @return The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid
     *         values include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>,
     *         <code>"rds-mysql"</code>, <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and
     *         <code>"rds-postgresql"</code>.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid values
     * include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>, <code>"rds-mysql"</code>,
     * <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and <code>"rds-postgresql"</code>.
     * </p>
     * 
     * @param engineName
     *        The name of the target engine that Fleet Advisor should use in the target engine recommendation. Valid
     *        values include <code>"rds-aurora-mysql"</code>, <code>"rds-aurora-postgresql"</code>,
     *        <code>"rds-mysql"</code>, <code>"rds-oracle"</code>, <code>"rds-sql-server"</code>, and
     *        <code>"rds-postgresql"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limitation withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The name of the limitation. Describes unsupported database features, migration action items, and other
     * limitations.
     * </p>
     * 
     * @param name
     *        The name of the limitation. Describes unsupported database features, migration action items, and other
     *        limitations.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the limitation. Describes unsupported database features, migration action items, and other
     * limitations.
     * </p>
     * 
     * @return The name of the limitation. Describes unsupported database features, migration action items, and other
     *         limitations.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the limitation. Describes unsupported database features, migration action items, and other
     * limitations.
     * </p>
     * 
     * @param name
     *        The name of the limitation. Describes unsupported database features, migration action items, and other
     *        limitations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limitation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the limitation. Provides additional information about the limitation, and includes recommended
     * actions that you can take to address or avoid this limitation.
     * </p>
     * 
     * @param description
     *        A description of the limitation. Provides additional information about the limitation, and includes
     *        recommended actions that you can take to address or avoid this limitation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the limitation. Provides additional information about the limitation, and includes recommended
     * actions that you can take to address or avoid this limitation.
     * </p>
     * 
     * @return A description of the limitation. Provides additional information about the limitation, and includes
     *         recommended actions that you can take to address or avoid this limitation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the limitation. Provides additional information about the limitation, and includes recommended
     * actions that you can take to address or avoid this limitation.
     * </p>
     * 
     * @param description
     *        A description of the limitation. Provides additional information about the limitation, and includes
     *        recommended actions that you can take to address or avoid this limitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limitation withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The impact of the limitation. You can use this parameter to prioritize limitations that you want to address.
     * Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and <code>"Low"</code>.
     * </p>
     * 
     * @param impact
     *        The impact of the limitation. You can use this parameter to prioritize limitations that you want to
     *        address. Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and
     *        <code>"Low"</code>.
     */

    public void setImpact(String impact) {
        this.impact = impact;
    }

    /**
     * <p>
     * The impact of the limitation. You can use this parameter to prioritize limitations that you want to address.
     * Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and <code>"Low"</code>.
     * </p>
     * 
     * @return The impact of the limitation. You can use this parameter to prioritize limitations that you want to
     *         address. Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and
     *         <code>"Low"</code>.
     */

    public String getImpact() {
        return this.impact;
    }

    /**
     * <p>
     * The impact of the limitation. You can use this parameter to prioritize limitations that you want to address.
     * Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and <code>"Low"</code>.
     * </p>
     * 
     * @param impact
     *        The impact of the limitation. You can use this parameter to prioritize limitations that you want to
     *        address. Valid values include <code>"Blocker"</code>, <code>"High"</code>, <code>"Medium"</code>, and
     *        <code>"Low"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limitation withImpact(String impact) {
        setImpact(impact);
        return this;
    }

    /**
     * <p>
     * The type of the limitation, such as action required, upgrade required, and limited feature.
     * </p>
     * 
     * @param type
     *        The type of the limitation, such as action required, upgrade required, and limited feature.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the limitation, such as action required, upgrade required, and limited feature.
     * </p>
     * 
     * @return The type of the limitation, such as action required, upgrade required, and limited feature.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the limitation, such as action required, upgrade required, and limited feature.
     * </p>
     * 
     * @param type
     *        The type of the limitation, such as action required, upgrade required, and limited feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Limitation withType(String type) {
        setType(type);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImpact() != null)
            sb.append("Impact: ").append(getImpact()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Limitation == false)
            return false;
        Limitation other = (Limitation) obj;
        if (other.getDatabaseId() == null ^ this.getDatabaseId() == null)
            return false;
        if (other.getDatabaseId() != null && other.getDatabaseId().equals(this.getDatabaseId()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImpact() == null ^ this.getImpact() == null)
            return false;
        if (other.getImpact() != null && other.getImpact().equals(this.getImpact()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseId() == null) ? 0 : getDatabaseId().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImpact() == null) ? 0 : getImpact().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Limitation clone() {
        try {
            return (Limitation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.LimitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
