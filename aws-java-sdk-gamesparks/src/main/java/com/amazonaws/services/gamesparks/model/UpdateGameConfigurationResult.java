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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGameConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the game configuration.
     * </p>
     */
    private GameConfigurationDetails gameConfiguration;

    /**
     * <p>
     * Details about the game configuration.
     * </p>
     * 
     * @param gameConfiguration
     *        Details about the game configuration.
     */

    public void setGameConfiguration(GameConfigurationDetails gameConfiguration) {
        this.gameConfiguration = gameConfiguration;
    }

    /**
     * <p>
     * Details about the game configuration.
     * </p>
     * 
     * @return Details about the game configuration.
     */

    public GameConfigurationDetails getGameConfiguration() {
        return this.gameConfiguration;
    }

    /**
     * <p>
     * Details about the game configuration.
     * </p>
     * 
     * @param gameConfiguration
     *        Details about the game configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameConfigurationResult withGameConfiguration(GameConfigurationDetails gameConfiguration) {
        setGameConfiguration(gameConfiguration);
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
        if (getGameConfiguration() != null)
            sb.append("GameConfiguration: ").append(getGameConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGameConfigurationResult == false)
            return false;
        UpdateGameConfigurationResult other = (UpdateGameConfigurationResult) obj;
        if (other.getGameConfiguration() == null ^ this.getGameConfiguration() == null)
            return false;
        if (other.getGameConfiguration() != null && other.getGameConfiguration().equals(this.getGameConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameConfiguration() == null) ? 0 : getGameConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGameConfigurationResult clone() {
        try {
            return (UpdateGameConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
