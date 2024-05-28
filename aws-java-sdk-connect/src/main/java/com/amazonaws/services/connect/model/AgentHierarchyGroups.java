/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that defines search criteria for contacts using agent hierarchy group levels. For more information about
 * agent hierarchies, see <a href="https://docs.aws.amazon.com/connect/latest/adminguide/agent-hierarchy.html">Set Up
 * Agent Hierarchies</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AgentHierarchyGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentHierarchyGroups implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifiers for level 1 hierarchy groups.
     * </p>
     */
    private java.util.List<String> l1Ids;
    /**
     * <p>
     * The identifiers for level 2 hierarchy groups.
     * </p>
     */
    private java.util.List<String> l2Ids;
    /**
     * <p>
     * The identifiers for level 3 hierarchy groups.
     * </p>
     */
    private java.util.List<String> l3Ids;
    /**
     * <p>
     * The identifiers for level 4 hierarchy groups.
     * </p>
     */
    private java.util.List<String> l4Ids;
    /**
     * <p>
     * The identifiers for level 5 hierarchy groups.
     * </p>
     */
    private java.util.List<String> l5Ids;

    /**
     * <p>
     * The identifiers for level 1 hierarchy groups.
     * </p>
     * 
     * @return The identifiers for level 1 hierarchy groups.
     */

    public java.util.List<String> getL1Ids() {
        return l1Ids;
    }

    /**
     * <p>
     * The identifiers for level 1 hierarchy groups.
     * </p>
     * 
     * @param l1Ids
     *        The identifiers for level 1 hierarchy groups.
     */

    public void setL1Ids(java.util.Collection<String> l1Ids) {
        if (l1Ids == null) {
            this.l1Ids = null;
            return;
        }

        this.l1Ids = new java.util.ArrayList<String>(l1Ids);
    }

    /**
     * <p>
     * The identifiers for level 1 hierarchy groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL1Ids(java.util.Collection)} or {@link #withL1Ids(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param l1Ids
     *        The identifiers for level 1 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL1Ids(String... l1Ids) {
        if (this.l1Ids == null) {
            setL1Ids(new java.util.ArrayList<String>(l1Ids.length));
        }
        for (String ele : l1Ids) {
            this.l1Ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers for level 1 hierarchy groups.
     * </p>
     * 
     * @param l1Ids
     *        The identifiers for level 1 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL1Ids(java.util.Collection<String> l1Ids) {
        setL1Ids(l1Ids);
        return this;
    }

    /**
     * <p>
     * The identifiers for level 2 hierarchy groups.
     * </p>
     * 
     * @return The identifiers for level 2 hierarchy groups.
     */

    public java.util.List<String> getL2Ids() {
        return l2Ids;
    }

    /**
     * <p>
     * The identifiers for level 2 hierarchy groups.
     * </p>
     * 
     * @param l2Ids
     *        The identifiers for level 2 hierarchy groups.
     */

    public void setL2Ids(java.util.Collection<String> l2Ids) {
        if (l2Ids == null) {
            this.l2Ids = null;
            return;
        }

        this.l2Ids = new java.util.ArrayList<String>(l2Ids);
    }

    /**
     * <p>
     * The identifiers for level 2 hierarchy groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL2Ids(java.util.Collection)} or {@link #withL2Ids(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param l2Ids
     *        The identifiers for level 2 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL2Ids(String... l2Ids) {
        if (this.l2Ids == null) {
            setL2Ids(new java.util.ArrayList<String>(l2Ids.length));
        }
        for (String ele : l2Ids) {
            this.l2Ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers for level 2 hierarchy groups.
     * </p>
     * 
     * @param l2Ids
     *        The identifiers for level 2 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL2Ids(java.util.Collection<String> l2Ids) {
        setL2Ids(l2Ids);
        return this;
    }

    /**
     * <p>
     * The identifiers for level 3 hierarchy groups.
     * </p>
     * 
     * @return The identifiers for level 3 hierarchy groups.
     */

    public java.util.List<String> getL3Ids() {
        return l3Ids;
    }

    /**
     * <p>
     * The identifiers for level 3 hierarchy groups.
     * </p>
     * 
     * @param l3Ids
     *        The identifiers for level 3 hierarchy groups.
     */

    public void setL3Ids(java.util.Collection<String> l3Ids) {
        if (l3Ids == null) {
            this.l3Ids = null;
            return;
        }

        this.l3Ids = new java.util.ArrayList<String>(l3Ids);
    }

    /**
     * <p>
     * The identifiers for level 3 hierarchy groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL3Ids(java.util.Collection)} or {@link #withL3Ids(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param l3Ids
     *        The identifiers for level 3 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL3Ids(String... l3Ids) {
        if (this.l3Ids == null) {
            setL3Ids(new java.util.ArrayList<String>(l3Ids.length));
        }
        for (String ele : l3Ids) {
            this.l3Ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers for level 3 hierarchy groups.
     * </p>
     * 
     * @param l3Ids
     *        The identifiers for level 3 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL3Ids(java.util.Collection<String> l3Ids) {
        setL3Ids(l3Ids);
        return this;
    }

    /**
     * <p>
     * The identifiers for level 4 hierarchy groups.
     * </p>
     * 
     * @return The identifiers for level 4 hierarchy groups.
     */

    public java.util.List<String> getL4Ids() {
        return l4Ids;
    }

    /**
     * <p>
     * The identifiers for level 4 hierarchy groups.
     * </p>
     * 
     * @param l4Ids
     *        The identifiers for level 4 hierarchy groups.
     */

    public void setL4Ids(java.util.Collection<String> l4Ids) {
        if (l4Ids == null) {
            this.l4Ids = null;
            return;
        }

        this.l4Ids = new java.util.ArrayList<String>(l4Ids);
    }

    /**
     * <p>
     * The identifiers for level 4 hierarchy groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL4Ids(java.util.Collection)} or {@link #withL4Ids(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param l4Ids
     *        The identifiers for level 4 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL4Ids(String... l4Ids) {
        if (this.l4Ids == null) {
            setL4Ids(new java.util.ArrayList<String>(l4Ids.length));
        }
        for (String ele : l4Ids) {
            this.l4Ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers for level 4 hierarchy groups.
     * </p>
     * 
     * @param l4Ids
     *        The identifiers for level 4 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL4Ids(java.util.Collection<String> l4Ids) {
        setL4Ids(l4Ids);
        return this;
    }

    /**
     * <p>
     * The identifiers for level 5 hierarchy groups.
     * </p>
     * 
     * @return The identifiers for level 5 hierarchy groups.
     */

    public java.util.List<String> getL5Ids() {
        return l5Ids;
    }

    /**
     * <p>
     * The identifiers for level 5 hierarchy groups.
     * </p>
     * 
     * @param l5Ids
     *        The identifiers for level 5 hierarchy groups.
     */

    public void setL5Ids(java.util.Collection<String> l5Ids) {
        if (l5Ids == null) {
            this.l5Ids = null;
            return;
        }

        this.l5Ids = new java.util.ArrayList<String>(l5Ids);
    }

    /**
     * <p>
     * The identifiers for level 5 hierarchy groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setL5Ids(java.util.Collection)} or {@link #withL5Ids(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param l5Ids
     *        The identifiers for level 5 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL5Ids(String... l5Ids) {
        if (this.l5Ids == null) {
            setL5Ids(new java.util.ArrayList<String>(l5Ids.length));
        }
        for (String ele : l5Ids) {
            this.l5Ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers for level 5 hierarchy groups.
     * </p>
     * 
     * @param l5Ids
     *        The identifiers for level 5 hierarchy groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentHierarchyGroups withL5Ids(java.util.Collection<String> l5Ids) {
        setL5Ids(l5Ids);
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
        if (getL1Ids() != null)
            sb.append("L1Ids: ").append(getL1Ids()).append(",");
        if (getL2Ids() != null)
            sb.append("L2Ids: ").append(getL2Ids()).append(",");
        if (getL3Ids() != null)
            sb.append("L3Ids: ").append(getL3Ids()).append(",");
        if (getL4Ids() != null)
            sb.append("L4Ids: ").append(getL4Ids()).append(",");
        if (getL5Ids() != null)
            sb.append("L5Ids: ").append(getL5Ids());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentHierarchyGroups == false)
            return false;
        AgentHierarchyGroups other = (AgentHierarchyGroups) obj;
        if (other.getL1Ids() == null ^ this.getL1Ids() == null)
            return false;
        if (other.getL1Ids() != null && other.getL1Ids().equals(this.getL1Ids()) == false)
            return false;
        if (other.getL2Ids() == null ^ this.getL2Ids() == null)
            return false;
        if (other.getL2Ids() != null && other.getL2Ids().equals(this.getL2Ids()) == false)
            return false;
        if (other.getL3Ids() == null ^ this.getL3Ids() == null)
            return false;
        if (other.getL3Ids() != null && other.getL3Ids().equals(this.getL3Ids()) == false)
            return false;
        if (other.getL4Ids() == null ^ this.getL4Ids() == null)
            return false;
        if (other.getL4Ids() != null && other.getL4Ids().equals(this.getL4Ids()) == false)
            return false;
        if (other.getL5Ids() == null ^ this.getL5Ids() == null)
            return false;
        if (other.getL5Ids() != null && other.getL5Ids().equals(this.getL5Ids()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getL1Ids() == null) ? 0 : getL1Ids().hashCode());
        hashCode = prime * hashCode + ((getL2Ids() == null) ? 0 : getL2Ids().hashCode());
        hashCode = prime * hashCode + ((getL3Ids() == null) ? 0 : getL3Ids().hashCode());
        hashCode = prime * hashCode + ((getL4Ids() == null) ? 0 : getL4Ids().hashCode());
        hashCode = prime * hashCode + ((getL5Ids() == null) ? 0 : getL5Ids().hashCode());
        return hashCode;
    }

    @Override
    public AgentHierarchyGroups clone() {
        try {
            return (AgentHierarchyGroups) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AgentHierarchyGroupsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
