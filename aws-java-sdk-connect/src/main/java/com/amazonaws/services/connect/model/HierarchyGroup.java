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
 * A <code>HierarchyGroup</code> object that contains information about a hierarchy group in your Amazon Connect
 * instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HierarchyGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HierarchyGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the hierarchy group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hierarchy group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the hierarchy group in your instance.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier for the level in the hierarchy group.
     * </p>
     */
    private String levelId;
    /**
     * <p>
     * A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     * </p>
     */
    private HierarchyPath hierarchyPath;

    /**
     * <p>
     * The identifier for the hierarchy group.
     * </p>
     * 
     * @param id
     *        The identifier for the hierarchy group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the hierarchy group.
     * </p>
     * 
     * @return The identifier for the hierarchy group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the hierarchy group.
     * </p>
     * 
     * @param id
     *        The identifier for the hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hierarchy group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the hierarchy group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hierarchy group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the hierarchy group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the hierarchy group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the hierarchy group in your instance.
     * </p>
     * 
     * @param name
     *        The name of the hierarchy group in your instance.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the hierarchy group in your instance.
     * </p>
     * 
     * @return The name of the hierarchy group in your instance.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the hierarchy group in your instance.
     * </p>
     * 
     * @param name
     *        The name of the hierarchy group in your instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier for the level in the hierarchy group.
     * </p>
     * 
     * @param levelId
     *        The identifier for the level in the hierarchy group.
     */

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    /**
     * <p>
     * The identifier for the level in the hierarchy group.
     * </p>
     * 
     * @return The identifier for the level in the hierarchy group.
     */

    public String getLevelId() {
        return this.levelId;
    }

    /**
     * <p>
     * The identifier for the level in the hierarchy group.
     * </p>
     * 
     * @param levelId
     *        The identifier for the level in the hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroup withLevelId(String levelId) {
        setLevelId(levelId);
        return this;
    }

    /**
     * <p>
     * A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     * </p>
     * 
     * @param hierarchyPath
     *        A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     */

    public void setHierarchyPath(HierarchyPath hierarchyPath) {
        this.hierarchyPath = hierarchyPath;
    }

    /**
     * <p>
     * A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     * </p>
     * 
     * @return A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     */

    public HierarchyPath getHierarchyPath() {
        return this.hierarchyPath;
    }

    /**
     * <p>
     * A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     * </p>
     * 
     * @param hierarchyPath
     *        A <code>HierarchyPath</code> object that contains information about the levels in the hierarchy group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HierarchyGroup withHierarchyPath(HierarchyPath hierarchyPath) {
        setHierarchyPath(hierarchyPath);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLevelId() != null)
            sb.append("LevelId: ").append(getLevelId()).append(",");
        if (getHierarchyPath() != null)
            sb.append("HierarchyPath: ").append(getHierarchyPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HierarchyGroup == false)
            return false;
        HierarchyGroup other = (HierarchyGroup) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLevelId() == null ^ this.getLevelId() == null)
            return false;
        if (other.getLevelId() != null && other.getLevelId().equals(this.getLevelId()) == false)
            return false;
        if (other.getHierarchyPath() == null ^ this.getHierarchyPath() == null)
            return false;
        if (other.getHierarchyPath() != null && other.getHierarchyPath().equals(this.getHierarchyPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLevelId() == null) ? 0 : getLevelId().hashCode());
        hashCode = prime * hashCode + ((getHierarchyPath() == null) ? 0 : getHierarchyPath().hashCode());
        return hashCode;
    }

    @Override
    public HierarchyGroup clone() {
        try {
            return (HierarchyGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HierarchyGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
