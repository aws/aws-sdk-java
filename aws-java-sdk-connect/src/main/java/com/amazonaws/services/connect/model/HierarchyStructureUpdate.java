/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the level hierarchy to update.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HierarchyStructureUpdate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchyStructureUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The update for level one.
     * </p>
     */
    private HierarchyLevelUpdate levelOne;
    /**
     * <p>
     * The update for level two.
     * </p>
     */
    private HierarchyLevelUpdate levelTwo;
    /**
     * <p>
     * The update for level three.
     * </p>
     */
    private HierarchyLevelUpdate levelThree;
    /**
     * <p>
     * The update for level four.
     * </p>
     */
    private HierarchyLevelUpdate levelFour;
    /**
     * <p>
     * The update for level five.
     * </p>
     */
    private HierarchyLevelUpdate levelFive;

    /**
     * <p>
     * The update for level one.
     * </p>
     * 
     * @param levelOne
     *        The update for level one.
     */

    public void setLevelOne(HierarchyLevelUpdate levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * <p>
     * The update for level one.
     * </p>
     * 
     * @return The update for level one.
     */

    public HierarchyLevelUpdate getLevelOne() {
        return this.levelOne;
    }

    /**
     * <p>
     * The update for level one.
     * </p>
     * 
     * @param levelOne
     *        The update for level one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructureUpdate withLevelOne(HierarchyLevelUpdate levelOne) {
        setLevelOne(levelOne);
        return this;
    }

    /**
     * <p>
     * The update for level two.
     * </p>
     * 
     * @param levelTwo
     *        The update for level two.
     */

    public void setLevelTwo(HierarchyLevelUpdate levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * <p>
     * The update for level two.
     * </p>
     * 
     * @return The update for level two.
     */

    public HierarchyLevelUpdate getLevelTwo() {
        return this.levelTwo;
    }

    /**
     * <p>
     * The update for level two.
     * </p>
     * 
     * @param levelTwo
     *        The update for level two.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructureUpdate withLevelTwo(HierarchyLevelUpdate levelTwo) {
        setLevelTwo(levelTwo);
        return this;
    }

    /**
     * <p>
     * The update for level three.
     * </p>
     * 
     * @param levelThree
     *        The update for level three.
     */

    public void setLevelThree(HierarchyLevelUpdate levelThree) {
        this.levelThree = levelThree;
    }

    /**
     * <p>
     * The update for level three.
     * </p>
     * 
     * @return The update for level three.
     */

    public HierarchyLevelUpdate getLevelThree() {
        return this.levelThree;
    }

    /**
     * <p>
     * The update for level three.
     * </p>
     * 
     * @param levelThree
     *        The update for level three.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructureUpdate withLevelThree(HierarchyLevelUpdate levelThree) {
        setLevelThree(levelThree);
        return this;
    }

    /**
     * <p>
     * The update for level four.
     * </p>
     * 
     * @param levelFour
     *        The update for level four.
     */

    public void setLevelFour(HierarchyLevelUpdate levelFour) {
        this.levelFour = levelFour;
    }

    /**
     * <p>
     * The update for level four.
     * </p>
     * 
     * @return The update for level four.
     */

    public HierarchyLevelUpdate getLevelFour() {
        return this.levelFour;
    }

    /**
     * <p>
     * The update for level four.
     * </p>
     * 
     * @param levelFour
     *        The update for level four.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructureUpdate withLevelFour(HierarchyLevelUpdate levelFour) {
        setLevelFour(levelFour);
        return this;
    }

    /**
     * <p>
     * The update for level five.
     * </p>
     * 
     * @param levelFive
     *        The update for level five.
     */

    public void setLevelFive(HierarchyLevelUpdate levelFive) {
        this.levelFive = levelFive;
    }

    /**
     * <p>
     * The update for level five.
     * </p>
     * 
     * @return The update for level five.
     */

    public HierarchyLevelUpdate getLevelFive() {
        return this.levelFive;
    }

    /**
     * <p>
     * The update for level five.
     * </p>
     * 
     * @param levelFive
     *        The update for level five.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructureUpdate withLevelFive(HierarchyLevelUpdate levelFive) {
        setLevelFive(levelFive);
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
        if (getLevelOne() != null)
            sb.append("LevelOne: ").append(getLevelOne()).append(",");
        if (getLevelTwo() != null)
            sb.append("LevelTwo: ").append(getLevelTwo()).append(",");
        if (getLevelThree() != null)
            sb.append("LevelThree: ").append(getLevelThree()).append(",");
        if (getLevelFour() != null)
            sb.append("LevelFour: ").append(getLevelFour()).append(",");
        if (getLevelFive() != null)
            sb.append("LevelFive: ").append(getLevelFive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyStructureUpdate == false)
            return false;
        HierarchyStructureUpdate other = (HierarchyStructureUpdate) obj;
        if (other.getLevelOne() == null ^ this.getLevelOne() == null)
            return false;
        if (other.getLevelOne() != null && other.getLevelOne().equals(this.getLevelOne()) == false)
            return false;
        if (other.getLevelTwo() == null ^ this.getLevelTwo() == null)
            return false;
        if (other.getLevelTwo() != null && other.getLevelTwo().equals(this.getLevelTwo()) == false)
            return false;
        if (other.getLevelThree() == null ^ this.getLevelThree() == null)
            return false;
        if (other.getLevelThree() != null && other.getLevelThree().equals(this.getLevelThree()) == false)
            return false;
        if (other.getLevelFour() == null ^ this.getLevelFour() == null)
            return false;
        if (other.getLevelFour() != null && other.getLevelFour().equals(this.getLevelFour()) == false)
            return false;
        if (other.getLevelFive() == null ^ this.getLevelFive() == null)
            return false;
        if (other.getLevelFive() != null && other.getLevelFive().equals(this.getLevelFive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLevelOne() == null) ? 0 : getLevelOne().hashCode());
        hashCode = prime * hashCode + ((getLevelTwo() == null) ? 0 : getLevelTwo().hashCode());
        hashCode = prime * hashCode + ((getLevelThree() == null) ? 0 : getLevelThree().hashCode());
        hashCode = prime * hashCode + ((getLevelFour() == null) ? 0 : getLevelFour().hashCode());
        hashCode = prime * hashCode + ((getLevelFive() == null) ? 0 : getLevelFive().hashCode());
        return hashCode;
    }

    @Override
    public HierarchyStructureUpdate clone() {
        try {
            return (HierarchyStructureUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HierarchyStructureUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
