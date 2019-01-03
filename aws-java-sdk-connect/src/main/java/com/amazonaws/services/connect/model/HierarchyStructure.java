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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>HierarchyStructure</code> object that contains information about the hierarchy group structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HierarchyStructure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchyStructure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     */
    private HierarchyLevel levelOne;
    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     */
    private HierarchyLevel levelTwo;
    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     */
    private HierarchyLevel levelThree;
    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     */
    private HierarchyLevel levelFour;
    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     */
    private HierarchyLevel levelFive;

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelOne
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public void setLevelOne(HierarchyLevel levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @return A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public HierarchyLevel getLevelOne() {
        return this.levelOne;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelOne
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructure withLevelOne(HierarchyLevel levelOne) {
        setLevelOne(levelOne);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelTwo
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public void setLevelTwo(HierarchyLevel levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @return A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public HierarchyLevel getLevelTwo() {
        return this.levelTwo;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelTwo
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructure withLevelTwo(HierarchyLevel levelTwo) {
        setLevelTwo(levelTwo);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelThree
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public void setLevelThree(HierarchyLevel levelThree) {
        this.levelThree = levelThree;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @return A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public HierarchyLevel getLevelThree() {
        return this.levelThree;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelThree
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructure withLevelThree(HierarchyLevel levelThree) {
        setLevelThree(levelThree);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelFour
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public void setLevelFour(HierarchyLevel levelFour) {
        this.levelFour = levelFour;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @return A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public HierarchyLevel getLevelFour() {
        return this.levelFour;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelFour
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructure withLevelFour(HierarchyLevel levelFour) {
        setLevelFour(levelFour);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelFive
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public void setLevelFive(HierarchyLevel levelFive) {
        this.levelFive = levelFive;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @return A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     */

    public HierarchyLevel getLevelFive() {
        return this.levelFive;
    }

    /**
     * <p>
     * A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * </p>
     * 
     * @param levelFive
     *        A <code>HierarchyLevel</code> object that contains information about the hierarchy group level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyStructure withLevelFive(HierarchyLevel levelFive) {
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

        if (obj instanceof HierarchyStructure == false)
            return false;
        HierarchyStructure other = (HierarchyStructure) obj;
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
    public HierarchyStructure clone() {
        try {
            return (HierarchyStructure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HierarchyStructureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
