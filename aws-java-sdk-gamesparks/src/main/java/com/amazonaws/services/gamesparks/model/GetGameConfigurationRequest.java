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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGameConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGameConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String gameName;
    /**
     * <p>
     * The list of sections to return.
     * </p>
     */
    private java.util.List<String> sections;

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

    public GetGameConfigurationRequest withGameName(String gameName) {
        setGameName(gameName);
        return this;
    }

    /**
     * <p>
     * The list of sections to return.
     * </p>
     * 
     * @return The list of sections to return.
     */

    public java.util.List<String> getSections() {
        return sections;
    }

    /**
     * <p>
     * The list of sections to return.
     * </p>
     * 
     * @param sections
     *        The list of sections to return.
     */

    public void setSections(java.util.Collection<String> sections) {
        if (sections == null) {
            this.sections = null;
            return;
        }

        this.sections = new java.util.ArrayList<String>(sections);
    }

    /**
     * <p>
     * The list of sections to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSections(java.util.Collection)} or {@link #withSections(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sections
     *        The list of sections to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGameConfigurationRequest withSections(String... sections) {
        if (this.sections == null) {
            setSections(new java.util.ArrayList<String>(sections.length));
        }
        for (String ele : sections) {
            this.sections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of sections to return.
     * </p>
     * 
     * @param sections
     *        The list of sections to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGameConfigurationRequest withSections(java.util.Collection<String> sections) {
        setSections(sections);
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

        if (obj instanceof GetGameConfigurationRequest == false)
            return false;
        GetGameConfigurationRequest other = (GetGameConfigurationRequest) obj;
        if (other.getGameName() == null ^ this.getGameName() == null)
            return false;
        if (other.getGameName() != null && other.getGameName().equals(this.getGameName()) == false)
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

        hashCode = prime * hashCode + ((getGameName() == null) ? 0 : getGameName().hashCode());
        hashCode = prime * hashCode + ((getSections() == null) ? 0 : getSections().hashCode());
        return hashCode;
    }

    @Override
    public GetGameConfigurationRequest clone() {
        return (GetGameConfigurationRequest) super.clone();
    }

}
