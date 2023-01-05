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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the game configuration.
 * </p>
 * <p>
 * The game configuration is organized into named sections, where the schema of each section is defined by an extension.
 * The schema for these sections can be retrieved using the <code>GetExtensionVersion</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GameConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date when the game was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The date when the game was last modified.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * Configuration data, organized by section name.
     * </p>
     */
    private java.util.Map<String, Section> sections;

    /**
     * <p>
     * The date when the game was created.
     * </p>
     * 
     * @param created
     *        The date when the game was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The date when the game was created.
     * </p>
     * 
     * @return The date when the game was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date when the game was created.
     * </p>
     * 
     * @param created
     *        The date when the game was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameConfigurationDetails withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The date when the game was last modified.
     * </p>
     * 
     * @param lastUpdated
     *        The date when the game was last modified.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The date when the game was last modified.
     * </p>
     * 
     * @return The date when the game was last modified.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The date when the game was last modified.
     * </p>
     * 
     * @param lastUpdated
     *        The date when the game was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameConfigurationDetails withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * Configuration data, organized by section name.
     * </p>
     * 
     * @return Configuration data, organized by section name.
     */

    public java.util.Map<String, Section> getSections() {
        return sections;
    }

    /**
     * <p>
     * Configuration data, organized by section name.
     * </p>
     * 
     * @param sections
     *        Configuration data, organized by section name.
     */

    public void setSections(java.util.Map<String, Section> sections) {
        this.sections = sections;
    }

    /**
     * <p>
     * Configuration data, organized by section name.
     * </p>
     * 
     * @param sections
     *        Configuration data, organized by section name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameConfigurationDetails withSections(java.util.Map<String, Section> sections) {
        setSections(sections);
        return this;
    }

    /**
     * Add a single Sections entry
     *
     * @see GameConfigurationDetails#withSections
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GameConfigurationDetails addSectionsEntry(String key, Section value) {
        if (null == this.sections) {
            this.sections = new java.util.HashMap<String, Section>();
        }
        if (this.sections.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sections.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Sections.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameConfigurationDetails clearSectionsEntries() {
        this.sections = null;
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
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getSections() != null)
            sb.append("Sections: ").append(getSections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameConfigurationDetails == false)
            return false;
        GameConfigurationDetails other = (GameConfigurationDetails) obj;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getSections() == null ^ this.getSections() == null)
            return false;
        if (other.getSections() != null && other.getSections().equals(this.getSections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getSections() == null) ? 0 : getSections().hashCode());
        return hashCode;
    }

    @Override
    public GameConfigurationDetails clone() {
        try {
            return (GameConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.GameConfigurationDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
