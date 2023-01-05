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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an inventory database instance for a Fleet Advisor collector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DatabaseInstanceSoftwareDetailsResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseInstanceSoftwareDetailsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example
     * <code>Microsoft SQL Server</code>.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The database engine version of a database in a Fleet Advisor collector inventory, for example <code>2019</code>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The database engine edition of a database in a Fleet Advisor collector inventory, for example
     * <code>Express</code>.
     * </p>
     */
    private String engineEdition;
    /**
     * <p>
     * The service pack level of the database.
     * </p>
     */
    private String servicePack;
    /**
     * <p>
     * The support level of the database, for example <code>Mainstream support</code>.
     * </p>
     */
    private String supportLevel;
    /**
     * <p>
     * The operating system architecture of the database.
     * </p>
     */
    private Integer osArchitecture;
    /**
     * <p>
     * Information about the database engine software, for example
     * <code>Mainstream support ends on November 14th, 2024</code>.
     * </p>
     */
    private String tooltip;

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example
     * <code>Microsoft SQL Server</code>.
     * </p>
     * 
     * @param engine
     *        The database engine of a database in a Fleet Advisor collector inventory, for example
     *        <code>Microsoft SQL Server</code>.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example
     * <code>Microsoft SQL Server</code>.
     * </p>
     * 
     * @return The database engine of a database in a Fleet Advisor collector inventory, for example
     *         <code>Microsoft SQL Server</code>.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine of a database in a Fleet Advisor collector inventory, for example
     * <code>Microsoft SQL Server</code>.
     * </p>
     * 
     * @param engine
     *        The database engine of a database in a Fleet Advisor collector inventory, for example
     *        <code>Microsoft SQL Server</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The database engine version of a database in a Fleet Advisor collector inventory, for example <code>2019</code>.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version of a database in a Fleet Advisor collector inventory, for example
     *        <code>2019</code>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version of a database in a Fleet Advisor collector inventory, for example <code>2019</code>.
     * </p>
     * 
     * @return The database engine version of a database in a Fleet Advisor collector inventory, for example
     *         <code>2019</code>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version of a database in a Fleet Advisor collector inventory, for example <code>2019</code>.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version of a database in a Fleet Advisor collector inventory, for example
     *        <code>2019</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The database engine edition of a database in a Fleet Advisor collector inventory, for example
     * <code>Express</code>.
     * </p>
     * 
     * @param engineEdition
     *        The database engine edition of a database in a Fleet Advisor collector inventory, for example
     *        <code>Express</code>.
     */

    public void setEngineEdition(String engineEdition) {
        this.engineEdition = engineEdition;
    }

    /**
     * <p>
     * The database engine edition of a database in a Fleet Advisor collector inventory, for example
     * <code>Express</code>.
     * </p>
     * 
     * @return The database engine edition of a database in a Fleet Advisor collector inventory, for example
     *         <code>Express</code>.
     */

    public String getEngineEdition() {
        return this.engineEdition;
    }

    /**
     * <p>
     * The database engine edition of a database in a Fleet Advisor collector inventory, for example
     * <code>Express</code>.
     * </p>
     * 
     * @param engineEdition
     *        The database engine edition of a database in a Fleet Advisor collector inventory, for example
     *        <code>Express</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withEngineEdition(String engineEdition) {
        setEngineEdition(engineEdition);
        return this;
    }

    /**
     * <p>
     * The service pack level of the database.
     * </p>
     * 
     * @param servicePack
     *        The service pack level of the database.
     */

    public void setServicePack(String servicePack) {
        this.servicePack = servicePack;
    }

    /**
     * <p>
     * The service pack level of the database.
     * </p>
     * 
     * @return The service pack level of the database.
     */

    public String getServicePack() {
        return this.servicePack;
    }

    /**
     * <p>
     * The service pack level of the database.
     * </p>
     * 
     * @param servicePack
     *        The service pack level of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withServicePack(String servicePack) {
        setServicePack(servicePack);
        return this;
    }

    /**
     * <p>
     * The support level of the database, for example <code>Mainstream support</code>.
     * </p>
     * 
     * @param supportLevel
     *        The support level of the database, for example <code>Mainstream support</code>.
     */

    public void setSupportLevel(String supportLevel) {
        this.supportLevel = supportLevel;
    }

    /**
     * <p>
     * The support level of the database, for example <code>Mainstream support</code>.
     * </p>
     * 
     * @return The support level of the database, for example <code>Mainstream support</code>.
     */

    public String getSupportLevel() {
        return this.supportLevel;
    }

    /**
     * <p>
     * The support level of the database, for example <code>Mainstream support</code>.
     * </p>
     * 
     * @param supportLevel
     *        The support level of the database, for example <code>Mainstream support</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withSupportLevel(String supportLevel) {
        setSupportLevel(supportLevel);
        return this;
    }

    /**
     * <p>
     * The operating system architecture of the database.
     * </p>
     * 
     * @param osArchitecture
     *        The operating system architecture of the database.
     */

    public void setOsArchitecture(Integer osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    /**
     * <p>
     * The operating system architecture of the database.
     * </p>
     * 
     * @return The operating system architecture of the database.
     */

    public Integer getOsArchitecture() {
        return this.osArchitecture;
    }

    /**
     * <p>
     * The operating system architecture of the database.
     * </p>
     * 
     * @param osArchitecture
     *        The operating system architecture of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withOsArchitecture(Integer osArchitecture) {
        setOsArchitecture(osArchitecture);
        return this;
    }

    /**
     * <p>
     * Information about the database engine software, for example
     * <code>Mainstream support ends on November 14th, 2024</code>.
     * </p>
     * 
     * @param tooltip
     *        Information about the database engine software, for example
     *        <code>Mainstream support ends on November 14th, 2024</code>.
     */

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * <p>
     * Information about the database engine software, for example
     * <code>Mainstream support ends on November 14th, 2024</code>.
     * </p>
     * 
     * @return Information about the database engine software, for example
     *         <code>Mainstream support ends on November 14th, 2024</code>.
     */

    public String getTooltip() {
        return this.tooltip;
    }

    /**
     * <p>
     * Information about the database engine software, for example
     * <code>Mainstream support ends on November 14th, 2024</code>.
     * </p>
     * 
     * @param tooltip
     *        Information about the database engine software, for example
     *        <code>Mainstream support ends on November 14th, 2024</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatabaseInstanceSoftwareDetailsResponse withTooltip(String tooltip) {
        setTooltip(tooltip);
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineEdition() != null)
            sb.append("EngineEdition: ").append(getEngineEdition()).append(",");
        if (getServicePack() != null)
            sb.append("ServicePack: ").append(getServicePack()).append(",");
        if (getSupportLevel() != null)
            sb.append("SupportLevel: ").append(getSupportLevel()).append(",");
        if (getOsArchitecture() != null)
            sb.append("OsArchitecture: ").append(getOsArchitecture()).append(",");
        if (getTooltip() != null)
            sb.append("Tooltip: ").append(getTooltip());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatabaseInstanceSoftwareDetailsResponse == false)
            return false;
        DatabaseInstanceSoftwareDetailsResponse other = (DatabaseInstanceSoftwareDetailsResponse) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineEdition() == null ^ this.getEngineEdition() == null)
            return false;
        if (other.getEngineEdition() != null && other.getEngineEdition().equals(this.getEngineEdition()) == false)
            return false;
        if (other.getServicePack() == null ^ this.getServicePack() == null)
            return false;
        if (other.getServicePack() != null && other.getServicePack().equals(this.getServicePack()) == false)
            return false;
        if (other.getSupportLevel() == null ^ this.getSupportLevel() == null)
            return false;
        if (other.getSupportLevel() != null && other.getSupportLevel().equals(this.getSupportLevel()) == false)
            return false;
        if (other.getOsArchitecture() == null ^ this.getOsArchitecture() == null)
            return false;
        if (other.getOsArchitecture() != null && other.getOsArchitecture().equals(this.getOsArchitecture()) == false)
            return false;
        if (other.getTooltip() == null ^ this.getTooltip() == null)
            return false;
        if (other.getTooltip() != null && other.getTooltip().equals(this.getTooltip()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineEdition() == null) ? 0 : getEngineEdition().hashCode());
        hashCode = prime * hashCode + ((getServicePack() == null) ? 0 : getServicePack().hashCode());
        hashCode = prime * hashCode + ((getSupportLevel() == null) ? 0 : getSupportLevel().hashCode());
        hashCode = prime * hashCode + ((getOsArchitecture() == null) ? 0 : getOsArchitecture().hashCode());
        hashCode = prime * hashCode + ((getTooltip() == null) ? 0 : getTooltip().hashCode());
        return hashCode;
    }

    @Override
    public DatabaseInstanceSoftwareDetailsResponse clone() {
        try {
            return (DatabaseInstanceSoftwareDetailsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DatabaseInstanceSoftwareDetailsResponseMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
