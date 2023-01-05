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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateStage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A client-defined token. With an active client token in the request, this action is idempotent.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the stage.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String gameName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or the
     * default role that GameSparks created.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The list of tags to apply to the stage.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A client-defined token. With an active client token in the request, this action is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A client-defined token. With an active client token in the request, this action is idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A client-defined token. With an active client token in the request, this action is idempotent.
     * </p>
     * 
     * @return A client-defined token. With an active client token in the request, this action is idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A client-defined token. With an active client token in the request, this action is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A client-defined token. With an active client token in the request, this action is idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public CreateStageRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param gameName
     *        The name of the game.
     */

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @return The name of the game.
     */

    public String getGameName() {
        return this.gameName;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param gameName
     *        The name of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withGameName(String gameName) {
        setGameName(gameName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or the
     * default role that GameSparks created.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or
     *        the default role that GameSparks created.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or the
     * default role that GameSparks created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or
     *         the default role that GameSparks created.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or the
     * default role that GameSparks created.
     * </p>
     * 
     * @param role
     *        The Amazon Resource Name (ARN) of the role to run the game with. This role can be a game-defined role or
     *        the default role that GameSparks created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The list of tags to apply to the stage.
     * </p>
     * 
     * @return The list of tags to apply to the stage.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags to apply to the stage.
     * </p>
     * 
     * @param tags
     *        The list of tags to apply to the stage.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tags to apply to the stage.
     * </p>
     * 
     * @param tags
     *        The list of tags to apply to the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateStageRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateStageRequest addTagsEntry(String key, String value) {
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

    public CreateStageRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGameName() != null)
            sb.append("GameName: ").append(getGameName()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName()).append(",");
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

        if (obj instanceof CreateStageRequest == false)
            return false;
        CreateStageRequest other = (CreateStageRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGameName() == null ^ this.getGameName() == null)
            return false;
        if (other.getGameName() != null && other.getGameName().equals(this.getGameName()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGameName() == null) ? 0 : getGameName().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStageRequest clone() {
        return (CreateStageRequest) super.clone();
    }

}
