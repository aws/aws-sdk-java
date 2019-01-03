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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about a stage and its definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/StageDeclaration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private java.util.List<BlockerDeclaration> blockers;
    /**
     * <p>
     * The actions included in a stage.
     * </p>
     */
    private java.util.List<ActionDeclaration> actions;

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

    public StageDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public java.util.List<BlockerDeclaration> getBlockers() {
        return blockers;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param blockers
     *        Reserved for future use.
     */

    public void setBlockers(java.util.Collection<BlockerDeclaration> blockers) {
        if (blockers == null) {
            this.blockers = null;
            return;
        }

        this.blockers = new java.util.ArrayList<BlockerDeclaration>(blockers);
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockers(java.util.Collection)} or {@link #withBlockers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param blockers
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeclaration withBlockers(BlockerDeclaration... blockers) {
        if (this.blockers == null) {
            setBlockers(new java.util.ArrayList<BlockerDeclaration>(blockers.length));
        }
        for (BlockerDeclaration ele : blockers) {
            this.blockers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param blockers
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeclaration withBlockers(java.util.Collection<BlockerDeclaration> blockers) {
        setBlockers(blockers);
        return this;
    }

    /**
     * <p>
     * The actions included in a stage.
     * </p>
     * 
     * @return The actions included in a stage.
     */

    public java.util.List<ActionDeclaration> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions included in a stage.
     * </p>
     * 
     * @param actions
     *        The actions included in a stage.
     */

    public void setActions(java.util.Collection<ActionDeclaration> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<ActionDeclaration>(actions);
    }

    /**
     * <p>
     * The actions included in a stage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions included in a stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeclaration withActions(ActionDeclaration... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<ActionDeclaration>(actions.length));
        }
        for (ActionDeclaration ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions included in a stage.
     * </p>
     * 
     * @param actions
     *        The actions included in a stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeclaration withActions(java.util.Collection<ActionDeclaration> actions) {
        setActions(actions);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getBlockers() != null)
            sb.append("Blockers: ").append(getBlockers()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageDeclaration == false)
            return false;
        StageDeclaration other = (StageDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getBlockers() == null ^ this.getBlockers() == null)
            return false;
        if (other.getBlockers() != null && other.getBlockers().equals(this.getBlockers()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getBlockers() == null) ? 0 : getBlockers().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public StageDeclaration clone() {
        try {
            return (StageDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.StageDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
