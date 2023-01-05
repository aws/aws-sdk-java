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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single modification to the configuration section.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/SectionModification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SectionModification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operation to be performed on a configuration section.
     * </p>
     * <p>
     * Content can be added, deleted, or replaced within a section.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The path within the section content to be modified.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the section to be modified.
     * </p>
     */
    private String section;

    /**
     * <p>
     * The operation to be performed on a configuration section.
     * </p>
     * <p>
     * Content can be added, deleted, or replaced within a section.
     * </p>
     * 
     * @param operation
     *        The operation to be performed on a configuration section.</p>
     *        <p>
     *        Content can be added, deleted, or replaced within a section.
     * @see Operation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation to be performed on a configuration section.
     * </p>
     * <p>
     * Content can be added, deleted, or replaced within a section.
     * </p>
     * 
     * @return The operation to be performed on a configuration section.</p>
     *         <p>
     *         Content can be added, deleted, or replaced within a section.
     * @see Operation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation to be performed on a configuration section.
     * </p>
     * <p>
     * Content can be added, deleted, or replaced within a section.
     * </p>
     * 
     * @param operation
     *        The operation to be performed on a configuration section.</p>
     *        <p>
     *        Content can be added, deleted, or replaced within a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public SectionModification withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on a configuration section.
     * </p>
     * <p>
     * Content can be added, deleted, or replaced within a section.
     * </p>
     * 
     * @param operation
     *        The operation to be performed on a configuration section.</p>
     *        <p>
     *        Content can be added, deleted, or replaced within a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public SectionModification withOperation(Operation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The path within the section content to be modified.
     * </p>
     * 
     * @param path
     *        The path within the section content to be modified.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path within the section content to be modified.
     * </p>
     * 
     * @return The path within the section content to be modified.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path within the section content to be modified.
     * </p>
     * 
     * @param path
     *        The path within the section content to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionModification withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the section to be modified.
     * </p>
     * 
     * @param section
     *        The name of the section to be modified.
     */

    public void setSection(String section) {
        this.section = section;
    }

    /**
     * <p>
     * The name of the section to be modified.
     * </p>
     * 
     * @return The name of the section to be modified.
     */

    public String getSection() {
        return this.section;
    }

    /**
     * <p>
     * The name of the section to be modified.
     * </p>
     * 
     * @param section
     *        The name of the section to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SectionModification withSection(String section) {
        setSection(section);
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getSection() != null)
            sb.append("Section: ").append(getSection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SectionModification == false)
            return false;
        SectionModification other = (SectionModification) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getSection() == null ^ this.getSection() == null)
            return false;
        if (other.getSection() != null && other.getSection().equals(this.getSection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getSection() == null) ? 0 : getSection().hashCode());
        return hashCode;
    }

    @Override
    public SectionModification clone() {
        try {
            return (SectionModification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.SectionModificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
