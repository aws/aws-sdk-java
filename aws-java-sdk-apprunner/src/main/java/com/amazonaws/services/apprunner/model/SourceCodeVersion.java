/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apprunner.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Identifies a version of code that AWS App Runner refers to within a source code repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/SourceCodeVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceCodeVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of version identifier.
     * </p>
     * <p>
     * For a git-based repository, branches represent versions.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A source code version.
     * </p>
     * <p>
     * For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to
     * the branch.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The type of version identifier.
     * </p>
     * <p>
     * For a git-based repository, branches represent versions.
     * </p>
     * 
     * @param type
     *        The type of version identifier.</p>
     *        <p>
     *        For a git-based repository, branches represent versions.
     * @see SourceCodeVersionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of version identifier.
     * </p>
     * <p>
     * For a git-based repository, branches represent versions.
     * </p>
     * 
     * @return The type of version identifier.</p>
     *         <p>
     *         For a git-based repository, branches represent versions.
     * @see SourceCodeVersionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of version identifier.
     * </p>
     * <p>
     * For a git-based repository, branches represent versions.
     * </p>
     * 
     * @param type
     *        The type of version identifier.</p>
     *        <p>
     *        For a git-based repository, branches represent versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceCodeVersionType
     */

    public SourceCodeVersion withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of version identifier.
     * </p>
     * <p>
     * For a git-based repository, branches represent versions.
     * </p>
     * 
     * @param type
     *        The type of version identifier.</p>
     *        <p>
     *        For a git-based repository, branches represent versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceCodeVersionType
     */

    public SourceCodeVersion withType(SourceCodeVersionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A source code version.
     * </p>
     * <p>
     * For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to
     * the branch.
     * </p>
     * 
     * @param value
     *        A source code version.</p>
     *        <p>
     *        For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent
     *        commit to the branch.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * A source code version.
     * </p>
     * <p>
     * For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to
     * the branch.
     * </p>
     * 
     * @return A source code version.</p>
     *         <p>
     *         For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent
     *         commit to the branch.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * A source code version.
     * </p>
     * <p>
     * For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent commit to
     * the branch.
     * </p>
     * 
     * @param value
     *        A source code version.</p>
     *        <p>
     *        For a git-based repository, a branch name maps to a specific version. App Runner uses the most recent
     *        commit to the branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceCodeVersion withValue(String value) {
        setValue(value);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceCodeVersion == false)
            return false;
        SourceCodeVersion other = (SourceCodeVersion) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SourceCodeVersion clone() {
        try {
            return (SourceCodeVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apprunner.model.transform.SourceCodeVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
