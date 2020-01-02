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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/Repository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Repository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     */
    private CodeCommitRepository codeCommit;

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * 
     * @param codeCommit
     *        Information about an AWS CodeCommit repository.
     */

    public void setCodeCommit(CodeCommitRepository codeCommit) {
        this.codeCommit = codeCommit;
    }

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * 
     * @return Information about an AWS CodeCommit repository.
     */

    public CodeCommitRepository getCodeCommit() {
        return this.codeCommit;
    }

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * 
     * @param codeCommit
     *        Information about an AWS CodeCommit repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withCodeCommit(CodeCommitRepository codeCommit) {
        setCodeCommit(codeCommit);
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
        if (getCodeCommit() != null)
            sb.append("CodeCommit: ").append(getCodeCommit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Repository == false)
            return false;
        Repository other = (Repository) obj;
        if (other.getCodeCommit() == null ^ this.getCodeCommit() == null)
            return false;
        if (other.getCodeCommit() != null && other.getCodeCommit().equals(this.getCodeCommit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeCommit() == null) ? 0 : getCodeCommit().hashCode());
        return hashCode;
    }

    @Override
    public Repository clone() {
        try {
            return (Repository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
