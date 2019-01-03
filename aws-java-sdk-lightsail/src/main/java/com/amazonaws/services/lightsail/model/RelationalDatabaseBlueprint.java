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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a database image, or blueprint. A blueprint describes the major engine version of a database.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RelationalDatabaseBlueprint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseBlueprint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     */
    private String blueprintId;
    /**
     * <p>
     * The database software of the database blueprint (for example, <code>MySQL</code>).
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     */
    private String engineDescription;
    /**
     * <p>
     * The description of the database engine version for the database blueprint.
     * </p>
     */
    private String engineVersionDescription;
    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for the database blueprint.
     * </p>
     */
    private Boolean isEngineDefault;

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     * 
     * @param blueprintId
     *        The ID for the database blueprint.
     */

    public void setBlueprintId(String blueprintId) {
        this.blueprintId = blueprintId;
    }

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     * 
     * @return The ID for the database blueprint.
     */

    public String getBlueprintId() {
        return this.blueprintId;
    }

    /**
     * <p>
     * The ID for the database blueprint.
     * </p>
     * 
     * @param blueprintId
     *        The ID for the database blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBlueprint withBlueprintId(String blueprintId) {
        setBlueprintId(blueprintId);
        return this;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example, <code>MySQL</code>).
     * </p>
     * 
     * @param engine
     *        The database software of the database blueprint (for example, <code>MySQL</code>).
     * @see RelationalDatabaseEngine
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example, <code>MySQL</code>).
     * </p>
     * 
     * @return The database software of the database blueprint (for example, <code>MySQL</code>).
     * @see RelationalDatabaseEngine
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example, <code>MySQL</code>).
     * </p>
     * 
     * @param engine
     *        The database software of the database blueprint (for example, <code>MySQL</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabaseEngine
     */

    public RelationalDatabaseBlueprint withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The database software of the database blueprint (for example, <code>MySQL</code>).
     * </p>
     * 
     * @param engine
     *        The database software of the database blueprint (for example, <code>MySQL</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelationalDatabaseEngine
     */

    public RelationalDatabaseBlueprint withEngine(RelationalDatabaseEngine engine) {
        this.engine = engine.toString();
        return this;
    }

    /**
     * <p>
     * The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @param engineVersion
     *        The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @return The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     * </p>
     * 
     * @param engineVersion
     *        The database engine version for the database blueprint (for example, <code>5.7.23</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBlueprint withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     * 
     * @param engineDescription
     *        The description of the database engine for the database blueprint.
     */

    public void setEngineDescription(String engineDescription) {
        this.engineDescription = engineDescription;
    }

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     * 
     * @return The description of the database engine for the database blueprint.
     */

    public String getEngineDescription() {
        return this.engineDescription;
    }

    /**
     * <p>
     * The description of the database engine for the database blueprint.
     * </p>
     * 
     * @param engineDescription
     *        The description of the database engine for the database blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBlueprint withEngineDescription(String engineDescription) {
        setEngineDescription(engineDescription);
        return this;
    }

    /**
     * <p>
     * The description of the database engine version for the database blueprint.
     * </p>
     * 
     * @param engineVersionDescription
     *        The description of the database engine version for the database blueprint.
     */

    public void setEngineVersionDescription(String engineVersionDescription) {
        this.engineVersionDescription = engineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version for the database blueprint.
     * </p>
     * 
     * @return The description of the database engine version for the database blueprint.
     */

    public String getEngineVersionDescription() {
        return this.engineVersionDescription;
    }

    /**
     * <p>
     * The description of the database engine version for the database blueprint.
     * </p>
     * 
     * @param engineVersionDescription
     *        The description of the database engine version for the database blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBlueprint withEngineVersionDescription(String engineVersionDescription) {
        setEngineVersionDescription(engineVersionDescription);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for the database blueprint.
     * </p>
     * 
     * @param isEngineDefault
     *        A Boolean value indicating whether the engine version is the default for the database blueprint.
     */

    public void setIsEngineDefault(Boolean isEngineDefault) {
        this.isEngineDefault = isEngineDefault;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for the database blueprint.
     * </p>
     * 
     * @return A Boolean value indicating whether the engine version is the default for the database blueprint.
     */

    public Boolean getIsEngineDefault() {
        return this.isEngineDefault;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for the database blueprint.
     * </p>
     * 
     * @param isEngineDefault
     *        A Boolean value indicating whether the engine version is the default for the database blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelationalDatabaseBlueprint withIsEngineDefault(Boolean isEngineDefault) {
        setIsEngineDefault(isEngineDefault);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the engine version is the default for the database blueprint.
     * </p>
     * 
     * @return A Boolean value indicating whether the engine version is the default for the database blueprint.
     */

    public Boolean isEngineDefault() {
        return this.isEngineDefault;
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
        if (getBlueprintId() != null)
            sb.append("BlueprintId: ").append(getBlueprintId()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEngineDescription() != null)
            sb.append("EngineDescription: ").append(getEngineDescription()).append(",");
        if (getEngineVersionDescription() != null)
            sb.append("EngineVersionDescription: ").append(getEngineVersionDescription()).append(",");
        if (getIsEngineDefault() != null)
            sb.append("IsEngineDefault: ").append(getIsEngineDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelationalDatabaseBlueprint == false)
            return false;
        RelationalDatabaseBlueprint other = (RelationalDatabaseBlueprint) obj;
        if (other.getBlueprintId() == null ^ this.getBlueprintId() == null)
            return false;
        if (other.getBlueprintId() != null && other.getBlueprintId().equals(this.getBlueprintId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEngineDescription() == null ^ this.getEngineDescription() == null)
            return false;
        if (other.getEngineDescription() != null && other.getEngineDescription().equals(this.getEngineDescription()) == false)
            return false;
        if (other.getEngineVersionDescription() == null ^ this.getEngineVersionDescription() == null)
            return false;
        if (other.getEngineVersionDescription() != null && other.getEngineVersionDescription().equals(this.getEngineVersionDescription()) == false)
            return false;
        if (other.getIsEngineDefault() == null ^ this.getIsEngineDefault() == null)
            return false;
        if (other.getIsEngineDefault() != null && other.getIsEngineDefault().equals(this.getIsEngineDefault()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueprintId() == null) ? 0 : getBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEngineDescription() == null) ? 0 : getEngineDescription().hashCode());
        hashCode = prime * hashCode + ((getEngineVersionDescription() == null) ? 0 : getEngineVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getIsEngineDefault() == null) ? 0 : getIsEngineDefault().hashCode());
        return hashCode;
    }

    @Override
    public RelationalDatabaseBlueprint clone() {
        try {
            return (RelationalDatabaseBlueprint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.RelationalDatabaseBlueprintMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
