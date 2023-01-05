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
 * Details about a game.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GameDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this game.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date when the game was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The description of the game.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Determines if the game can be deleted.
     * </p>
     */
    private Boolean enableTerminationProtection;
    /**
     * <p>
     * The date when the game was last modified.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the game.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags associated with the game.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this game.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of this game.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this game.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of this game.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of this game.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of this game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public GameDetails withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The description of the game.
     * </p>
     * 
     * @param description
     *        The description of the game.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the game.
     * </p>
     * 
     * @return The description of the game.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the game.
     * </p>
     * 
     * @param description
     *        The description of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Determines if the game can be deleted.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Determines if the game can be deleted.
     */

    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Determines if the game can be deleted.
     * </p>
     * 
     * @return Determines if the game can be deleted.
     */

    public Boolean getEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * Determines if the game can be deleted.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Determines if the game can be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails withEnableTerminationProtection(Boolean enableTerminationProtection) {
        setEnableTerminationProtection(enableTerminationProtection);
        return this;
    }

    /**
     * <p>
     * Determines if the game can be deleted.
     * </p>
     * 
     * @return Determines if the game can be deleted.
     */

    public Boolean isEnableTerminationProtection() {
        return this.enableTerminationProtection;
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

    public GameDetails withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param name
     *        The name of the game.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @return The name of the game.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param name
     *        The name of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the game.
     * </p>
     * 
     * @param state
     *        The state of the game.
     * @see GameState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the game.
     * </p>
     * 
     * @return The state of the game.
     * @see GameState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the game.
     * </p>
     * 
     * @param state
     *        The state of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameState
     */

    public GameDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the game.
     * </p>
     * 
     * @param state
     *        The state of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameState
     */

    public GameDetails withState(GameState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the game.
     * </p>
     * 
     * @return The tags associated with the game.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the game.
     * </p>
     * 
     * @param tags
     *        The tags associated with the game.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the game.
     * </p>
     * 
     * @param tags
     *        The tags associated with the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GameDetails#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameDetails clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: ").append(getEnableTerminationProtection()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameDetails == false)
            return false;
        GameDetails other = (GameDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnableTerminationProtection() == null ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null && other.getEnableTerminationProtection().equals(this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnableTerminationProtection() == null) ? 0 : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GameDetails clone() {
        try {
            return (GameDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.GameDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
