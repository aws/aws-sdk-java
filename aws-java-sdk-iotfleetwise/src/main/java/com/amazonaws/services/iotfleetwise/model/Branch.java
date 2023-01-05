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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A group of signals that are defined in a hierarchical structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/Branch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Branch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     * <code>Vehicle.Body.Engine</code>.
     * </p>
     */
    private String fullyQualifiedName;
    /**
     * <p>
     * A brief description of the branch.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     * <code>Vehicle.Body.Engine</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     *        <code>Vehicle.Body.Engine</code>.
     */

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     * <code>Vehicle.Body.Engine</code>.
     * </p>
     * 
     * @return The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     *         <code>Vehicle.Body.Engine</code>.
     */

    public String getFullyQualifiedName() {
        return this.fullyQualifiedName;
    }

    /**
     * <p>
     * The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     * <code>Vehicle.Body.Engine</code>.
     * </p>
     * 
     * @param fullyQualifiedName
     *        The fully qualified name of the branch. For example, the fully qualified name of a branch might be
     *        <code>Vehicle.Body.Engine</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withFullyQualifiedName(String fullyQualifiedName) {
        setFullyQualifiedName(fullyQualifiedName);
        return this;
    }

    /**
     * <p>
     * A brief description of the branch.
     * </p>
     * 
     * @param description
     *        A brief description of the branch.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the branch.
     * </p>
     * 
     * @return A brief description of the branch.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the branch.
     * </p>
     * 
     * @param description
     *        A brief description of the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Branch withDescription(String description) {
        setDescription(description);
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
        if (getFullyQualifiedName() != null)
            sb.append("FullyQualifiedName: ").append(getFullyQualifiedName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Branch == false)
            return false;
        Branch other = (Branch) obj;
        if (other.getFullyQualifiedName() == null ^ this.getFullyQualifiedName() == null)
            return false;
        if (other.getFullyQualifiedName() != null && other.getFullyQualifiedName().equals(this.getFullyQualifiedName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFullyQualifiedName() == null) ? 0 : getFullyQualifiedName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public Branch clone() {
        try {
            return (Branch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.BranchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
