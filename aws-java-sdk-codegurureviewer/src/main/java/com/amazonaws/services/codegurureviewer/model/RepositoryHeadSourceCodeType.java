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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType"> <code>SourceCodeType</code>
 * </a> that specifies the tip of a branch in an associated repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RepositoryHeadSourceCodeType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryHeadSourceCodeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code> specifies the
     * tip of this branch.
     * </p>
     */
    private String branchName;

    /**
     * <p>
     * The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code> specifies the
     * tip of this branch.
     * </p>
     * 
     * @param branchName
     *        The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code>
     *        specifies the tip of this branch.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code> specifies the
     * tip of this branch.
     * </p>
     * 
     * @return The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code>
     *         specifies the tip of this branch.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code> specifies the
     * tip of this branch.
     * </p>
     * 
     * @param branchName
     *        The name of the branch in an associated repository. The <code>RepositoryHeadSourceCodeType</code>
     *        specifies the tip of this branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryHeadSourceCodeType withBranchName(String branchName) {
        setBranchName(branchName);
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
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryHeadSourceCodeType == false)
            return false;
        RepositoryHeadSourceCodeType other = (RepositoryHeadSourceCodeType) obj;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryHeadSourceCodeType clone() {
        try {
            return (RepositoryHeadSourceCodeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryHeadSourceCodeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
