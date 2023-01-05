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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGameConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String gameName;
    /**
     * <p>
     * The list of modifications to make.
     * </p>
     */
    private java.util.List<SectionModification> modifications;

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

    public UpdateGameConfigurationRequest withGameName(String gameName) {
        setGameName(gameName);
        return this;
    }

    /**
     * <p>
     * The list of modifications to make.
     * </p>
     * 
     * @return The list of modifications to make.
     */

    public java.util.List<SectionModification> getModifications() {
        return modifications;
    }

    /**
     * <p>
     * The list of modifications to make.
     * </p>
     * 
     * @param modifications
     *        The list of modifications to make.
     */

    public void setModifications(java.util.Collection<SectionModification> modifications) {
        if (modifications == null) {
            this.modifications = null;
            return;
        }

        this.modifications = new java.util.ArrayList<SectionModification>(modifications);
    }

    /**
     * <p>
     * The list of modifications to make.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModifications(java.util.Collection)} or {@link #withModifications(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modifications
     *        The list of modifications to make.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameConfigurationRequest withModifications(SectionModification... modifications) {
        if (this.modifications == null) {
            setModifications(new java.util.ArrayList<SectionModification>(modifications.length));
        }
        for (SectionModification ele : modifications) {
            this.modifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of modifications to make.
     * </p>
     * 
     * @param modifications
     *        The list of modifications to make.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameConfigurationRequest withModifications(java.util.Collection<SectionModification> modifications) {
        setModifications(modifications);
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
        if (getGameName() != null)
            sb.append("GameName: ").append(getGameName()).append(",");
        if (getModifications() != null)
            sb.append("Modifications: ").append(getModifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGameConfigurationRequest == false)
            return false;
        UpdateGameConfigurationRequest other = (UpdateGameConfigurationRequest) obj;
        if (other.getGameName() == null ^ this.getGameName() == null)
            return false;
        if (other.getGameName() != null && other.getGameName().equals(this.getGameName()) == false)
            return false;
        if (other.getModifications() == null ^ this.getModifications() == null)
            return false;
        if (other.getModifications() != null && other.getModifications().equals(this.getModifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameName() == null) ? 0 : getGameName().hashCode());
        hashCode = prime * hashCode + ((getModifications() == null) ? 0 : getModifications().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGameConfigurationRequest clone() {
        return (UpdateGameConfigurationRequest) super.clone();
    }

}
