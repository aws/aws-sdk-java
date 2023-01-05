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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A repository sync definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/RepositorySyncDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositorySyncDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The repository branch.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The directory in the repository.
     * </p>
     */
    private String directory;
    /**
     * <p>
     * The resource that is synced from.
     * </p>
     */
    private String parent;
    /**
     * <p>
     * The resource that is synced to.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @param branch
     *        The repository branch.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @return The repository branch.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The repository branch.
     * </p>
     * 
     * @param branch
     *        The repository branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The directory in the repository.
     * </p>
     * 
     * @param directory
     *        The directory in the repository.
     */

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * <p>
     * The directory in the repository.
     * </p>
     * 
     * @return The directory in the repository.
     */

    public String getDirectory() {
        return this.directory;
    }

    /**
     * <p>
     * The directory in the repository.
     * </p>
     * 
     * @param directory
     *        The directory in the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withDirectory(String directory) {
        setDirectory(directory);
        return this;
    }

    /**
     * <p>
     * The resource that is synced from.
     * </p>
     * 
     * @param parent
     *        The resource that is synced from.
     */

    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * <p>
     * The resource that is synced from.
     * </p>
     * 
     * @return The resource that is synced from.
     */

    public String getParent() {
        return this.parent;
    }

    /**
     * <p>
     * The resource that is synced from.
     * </p>
     * 
     * @param parent
     *        The resource that is synced from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositorySyncDefinition withParent(String parent) {
        setParent(parent);
        return this;
    }

    /**
     * <p>
     * The resource that is synced to.
     * </p>
     * 
     * @param target
     *        The resource that is synced to.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The resource that is synced to.
     * </p>
     * 
     * @return The resource that is synced to.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The resource that is synced to.
     * </p>
     * 
     * @param target
     *        The resource that is synced to.
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
        com.amazonaws.services.proton.model.transform.RepositorySyncDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
