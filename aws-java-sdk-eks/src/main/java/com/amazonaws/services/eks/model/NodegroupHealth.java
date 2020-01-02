/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the health status of the node group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/NodegroupHealth" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodegroupHealth implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Any issues that are associated with the node group.
     * </p>
     */
    private java.util.List<Issue> issues;

    /**
     * <p>
     * Any issues that are associated with the node group.
     * </p>
     * 
     * @return Any issues that are associated with the node group.
     */

    public java.util.List<Issue> getIssues() {
        return issues;
    }

    /**
     * <p>
     * Any issues that are associated with the node group.
     * </p>
     * 
     * @param issues
     *        Any issues that are associated with the node group.
     */

    public void setIssues(java.util.Collection<Issue> issues) {
        if (issues == null) {
            this.issues = null;
            return;
        }

        this.issues = new java.util.ArrayList<Issue>(issues);
    }

    /**
     * <p>
     * Any issues that are associated with the node group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIssues(java.util.Collection)} or {@link #withIssues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param issues
     *        Any issues that are associated with the node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupHealth withIssues(Issue... issues) {
        if (this.issues == null) {
            setIssues(new java.util.ArrayList<Issue>(issues.length));
        }
        for (Issue ele : issues) {
            this.issues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any issues that are associated with the node group.
     * </p>
     * 
     * @param issues
     *        Any issues that are associated with the node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupHealth withIssues(java.util.Collection<Issue> issues) {
        setIssues(issues);
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
        if (getIssues() != null)
            sb.append("Issues: ").append(getIssues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodegroupHealth == false)
            return false;
        NodegroupHealth other = (NodegroupHealth) obj;
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        return hashCode;
    }

    @Override
    public NodegroupHealth clone() {
        try {
            return (NodegroupHealth) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.NodegroupHealthMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
