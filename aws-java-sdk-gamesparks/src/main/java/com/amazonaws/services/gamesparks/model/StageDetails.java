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
 * Properties that provide details of a stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StageDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stage.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The timestamp of when the stage was created.
     * </p>
     */
    private java.util.Date created;
    /**
     * <p>
     * The description of the stage.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The game key associated with the stage.
     * </p>
     * <p>
     * The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     * </p>
     */
    private String gameKey;
    /**
     * <p>
     * The timestamp of when the stage was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The Amazon CloudWatch log group for game runtimes deployed to the stage.
     * </p>
     */
    private String logGroup;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The state of the stage.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags associated with the stage.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stage.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the stage.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stage.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stage.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stage.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the stage was created.
     * </p>
     * 
     * @param created
     *        The timestamp of when the stage was created.
     */

    public void setCreated(java.util.Date created) {
        this.created = created;
    }

    /**
     * <p>
     * The timestamp of when the stage was created.
     * </p>
     * 
     * @return The timestamp of when the stage was created.
     */

    public java.util.Date getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The timestamp of when the stage was created.
     * </p>
     * 
     * @param created
     *        The timestamp of when the stage was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withCreated(java.util.Date created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @param description
     *        The description of the stage.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @return The description of the stage.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the stage.
     * </p>
     * 
     * @param description
     *        The description of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The game key associated with the stage.
     * </p>
     * <p>
     * The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     * </p>
     * 
     * @param gameKey
     *        The game key associated with the stage.</p>
     *        <p>
     *        The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     */

    public void setGameKey(String gameKey) {
        this.gameKey = gameKey;
    }

    /**
     * <p>
     * The game key associated with the stage.
     * </p>
     * <p>
     * The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     * </p>
     * 
     * @return The game key associated with the stage.</p>
     *         <p>
     *         The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     */

    public String getGameKey() {
        return this.gameKey;
    }

    /**
     * <p>
     * The game key associated with the stage.
     * </p>
     * <p>
     * The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     * </p>
     * 
     * @param gameKey
     *        The game key associated with the stage.</p>
     *        <p>
     *        The game key is a unique identifier that the game client uses to connect to the GameSparks backend.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withGameKey(String gameKey) {
        setGameKey(gameKey);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the stage was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The timestamp of when the stage was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The timestamp of when the stage was last updated.
     * </p>
     * 
     * @return The timestamp of when the stage was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The timestamp of when the stage was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The timestamp of when the stage was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group for game runtimes deployed to the stage.
     * </p>
     * 
     * @param logGroup
     *        The Amazon CloudWatch log group for game runtimes deployed to the stage.
     */

    public void setLogGroup(String logGroup) {
        this.logGroup = logGroup;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group for game runtimes deployed to the stage.
     * </p>
     * 
     * @return The Amazon CloudWatch log group for game runtimes deployed to the stage.
     */

    public String getLogGroup() {
        return this.logGroup;
    }

    /**
     * <p>
     * The Amazon CloudWatch log group for game runtimes deployed to the stage.
     * </p>
     * 
     * @param logGroup
     *        The Amazon CloudWatch log group for game runtimes deployed to the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withLogGroup(String logGroup) {
        setLogGroup(logGroup);
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param name
     *        The name of the stage.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param name
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the role used to run the game runtimes deployed to the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @param state
     *        The state of the stage.
     * @see StageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @return The state of the stage.
     * @see StageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @param state
     *        The state of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageState
     */

    public StageDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the stage.
     * </p>
     * 
     * @param state
     *        The state of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StageState
     */

    public StageDetails withState(StageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags associated with the stage.
     * </p>
     * 
     * @return The tags associated with the stage.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the stage.
     * </p>
     * 
     * @param tags
     *        The tags associated with the stage.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the stage.
     * </p>
     * 
     * @param tags
     *        The tags associated with the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StageDetails#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StageDetails addTagsEntry(String key, String value) {
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

    public StageDetails clearTagsEntries() {
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
        if (getGameKey() != null)
            sb.append("GameKey: ").append(getGameKey()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getLogGroup() != null)
            sb.append("LogGroup: ").append(getLogGroup()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
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

        if (obj instanceof StageDetails == false)
            return false;
        StageDetails other = (StageDetails) obj;
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
        if (other.getGameKey() == null ^ this.getGameKey() == null)
            return false;
        if (other.getGameKey() != null && other.getGameKey().equals(this.getGameKey()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getLogGroup() == null ^ this.getLogGroup() == null)
            return false;
        if (other.getLogGroup() != null && other.getLogGroup().equals(this.getLogGroup()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
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
        hashCode = prime * hashCode + ((getGameKey() == null) ? 0 : getGameKey().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getLogGroup() == null) ? 0 : getLogGroup().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StageDetails clone() {
        try {
            return (StageDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.StageDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
