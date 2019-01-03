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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a bot. .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/BotMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the bot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the bot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same.
     * </p>
     */
    private java.util.Date lastUpdatedDate;
    /**
     * <p>
     * The date that the bot was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param name
     *        The name of the bot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @return The name of the bot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bot.
     * </p>
     * 
     * @param name
     *        The name of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @return A description of the bot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the bot.
     * </p>
     * 
     * @param description
     *        A description of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * 
     * @param status
     *        The status of the bot.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * 
     * @return The status of the bot.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * 
     * @param status
     *        The status of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public BotMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * 
     * @param status
     *        The status of the bot.
     * @see Status
     */

    public void setStatus(Status status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the bot.
     * </p>
     * 
     * @param status
     *        The status of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public BotMetadata withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the bot was updated. When you create a bot, the creation date and last updated date are the
     *        same.
     */

    public void setLastUpdatedDate(java.util.Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same.
     * </p>
     * 
     * @return The date that the bot was updated. When you create a bot, the creation date and last updated date are the
     *         same.
     */

    public java.util.Date getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    /**
     * <p>
     * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same.
     * </p>
     * 
     * @param lastUpdatedDate
     *        The date that the bot was updated. When you create a bot, the creation date and last updated date are the
     *        same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMetadata withLastUpdatedDate(java.util.Date lastUpdatedDate) {
        setLastUpdatedDate(lastUpdatedDate);
        return this;
    }

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the bot was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     * 
     * @return The date that the bot was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date that the bot was created.
     * </p>
     * 
     * @param createdDate
     *        The date that the bot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMetadata withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     * </p>
     * 
     * @param version
     *        The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     * </p>
     * 
     * @return The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     * </p>
     * 
     * @param version
     *        The version of the bot. For a new bot, the version is always <code>$LATEST</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotMetadata withVersion(String version) {
        setVersion(version);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastUpdatedDate() != null)
            sb.append("LastUpdatedDate: ").append(getLastUpdatedDate()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotMetadata == false)
            return false;
        BotMetadata other = (BotMetadata) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastUpdatedDate() == null ^ this.getLastUpdatedDate() == null)
            return false;
        if (other.getLastUpdatedDate() != null && other.getLastUpdatedDate().equals(this.getLastUpdatedDate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDate() == null) ? 0 : getLastUpdatedDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public BotMetadata clone() {
        try {
            return (BotMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.BotMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
