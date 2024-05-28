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
package com.amazonaws.services.codestarconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition for a repository with a sync configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-connections-2019-12-01/RepositorySyncDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositorySyncDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The branch specified for a repository sync definition.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The configuration file for a repository sync definition. This value comes from creating or updating the
     * <code>config-file</code> field of a <code>sync-configuration</code>.
     * </p>
     */
    private String directory;
    /**
     * <p>
     * The parent resource specified for a repository sync definition.
     * </p>
     */
    private String parent;
    /**
     * <p>
     * The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC, the parent
     * and target resource are the same.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The branch specified for a repository sync definition.
     * </p>
     * 
     * @param branch
     *        The branch specified for a repository sync definition.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The branch specified for a repository sync definition.
     * </p>
     * 
     * @return The branch specified for a repository sync definition.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The branch specified for a repository sync definition.
     * </p>
     * 
     * @param branch
     *        The branch specified for a repository sync definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The configuration file for a repository sync definition. This value comes from creating or updating the
     * <code>config-file</code> field of a <code>sync-configuration</code>.
     * </p>
     * 
     * @param directory
     *        The configuration file for a repository sync definition. This value comes from creating or updating the
     *        <code>config-file</code> field of a <code>sync-configuration</code>.
     */

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * <p>
     * The configuration file for a repository sync definition. This value comes from creating or updating the
     * <code>config-file</code> field of a <code>sync-configuration</code>.
     * </p>
     * 
     * @return The configuration file for a repository sync definition. This value comes from creating or updating the
     *         <code>config-file</code> field of a <code>sync-configuration</code>.
     */

    public String getDirectory() {
        return this.directory;
    }

    /**
     * <p>
     * The configuration file for a repository sync definition. This value comes from creating or updating the
     * <code>config-file</code> field of a <code>sync-configuration</code>.
     * </p>
     * 
     * @param directory
     *        The configuration file for a repository sync definition. This value comes from creating or updating the
     *        <code>config-file</code> field of a <code>sync-configuration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withDirectory(String directory) {
        setDirectory(directory);
        return this;
    }

    /**
     * <p>
     * The parent resource specified for a repository sync definition.
     * </p>
     * 
     * @param parent
     *        The parent resource specified for a repository sync definition.
     */

    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * <p>
     * The parent resource specified for a repository sync definition.
     * </p>
     * 
     * @return The parent resource specified for a repository sync definition.
     */

    public String getParent() {
        return this.parent;
    }

    /**
     * <p>
     * The parent resource specified for a repository sync definition.
     * </p>
     * 
     * @param parent
     *        The parent resource specified for a repository sync definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withParent(String parent) {
        setParent(parent);
        return this;
    }

    /**
     * <p>
     * The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC, the parent
     * and target resource are the same.
     * </p>
     * 
     * @param target
     *        The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC, the
     *        parent and target resource are the same.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC, the parent
     * and target resource are the same.
     * </p>
     * 
     * @return The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC,
     *         the parent and target resource are the same.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC, the parent
     * and target resource are the same.
     * </p>
     * 
     * @param target
     *        The target resource specified for a repository sync definition. In some cases, such as CFN_STACK_SYNC, the
     *        parent and target resource are the same.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withTarget(String target) {
        setTarget(target);
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
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getDirectory() != null)
            sb.append("Directory: ").append(getDirectory()).append(",");
        if (getParent() != null)
            sb.append("Parent: ").append(getParent()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositorySyncDefinition == false)
            return false;
        RepositorySyncDefinition other = (RepositorySyncDefinition) obj;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getDirectory() == null ^ this.getDirectory() == null)
            return false;
        if (other.getDirectory() != null && other.getDirectory().equals(this.getDirectory()) == false)
            return false;
        if (other.getParent() == null ^ this.getParent() == null)
            return false;
        if (other.getParent() != null && other.getParent().equals(this.getParent()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getDirectory() == null) ? 0 : getDirectory().hashCode());
        hashCode = prime * hashCode + ((getParent() == null) ? 0 : getParent().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public RepositorySyncDefinition clone() {
        try {
            return (RepositorySyncDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestarconnections.model.transform.RepositorySyncDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
