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
 * A <code>HierarchyPath</code> object that contains information about the levels of the hierarchy group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HierarchyPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchyPath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     */
    private HierarchyGroupSummary levelOne;
    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     */
    private HierarchyGroupSummary levelTwo;
    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     */
    private HierarchyGroupSummary levelThree;
    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     */
    private HierarchyGroupSummary levelFour;
    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     */
    private HierarchyGroupSummary levelFive;

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelOne
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     */

    public void setLevelOne(HierarchyGroupSummary levelOne) {
        this.levelOne = levelOne;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @return A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *         group, including ARN, Id, and Name.
     */

    public HierarchyGroupSummary getLevelOne() {
        return this.levelOne;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelOne
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyPath withLevelOne(HierarchyGroupSummary levelOne) {
        setLevelOne(levelOne);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelTwo
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     */

    public void setLevelTwo(HierarchyGroupSummary levelTwo) {
        this.levelTwo = levelTwo;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @return A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *         group, including ARN, Id, and Name.
     */

    public HierarchyGroupSummary getLevelTwo() {
        return this.levelTwo;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelTwo
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyPath withLevelTwo(HierarchyGroupSummary levelTwo) {
        setLevelTwo(levelTwo);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelThree
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     */

    public void setLevelThree(HierarchyGroupSummary levelThree) {
        this.levelThree = levelThree;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @return A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *         group, including ARN, Id, and Name.
     */

    public HierarchyGroupSummary getLevelThree() {
        return this.levelThree;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelThree
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyPath withLevelThree(HierarchyGroupSummary levelThree) {
        setLevelThree(levelThree);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelFour
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     */

    public void setLevelFour(HierarchyGroupSummary levelFour) {
        this.levelFour = levelFour;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @return A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *         group, including ARN, Id, and Name.
     */

    public HierarchyGroupSummary getLevelFour() {
        return this.levelFour;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelFour
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyPath withLevelFour(HierarchyGroupSummary levelFour) {
        setLevelFour(levelFour);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelFive
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     */

    public void setLevelFive(HierarchyGroupSummary levelFive) {
        this.levelFive = levelFive;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @return A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *         group, including ARN, Id, and Name.
     */

    public HierarchyGroupSummary getLevelFive() {
        return this.levelFive;
    }

    /**
     * <p>
     * A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy group,
     * including ARN, Id, and Name.
     * </p>
     * 
     * @param levelFive
     *        A <code>HierarchyGroupSummary</code> object that contains information about the level of the hierarchy
     *        group, including ARN, Id, and Name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyPath withLevelFive(HierarchyGroupSummary levelFive) {
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

        if (obj instanceof HierarchyPath == false)
            return false;
        HierarchyPath other = (HierarchyPath) obj;
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
    public HierarchyPath clone() {
        try {
            return (HierarchyPath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HierarchyPathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
