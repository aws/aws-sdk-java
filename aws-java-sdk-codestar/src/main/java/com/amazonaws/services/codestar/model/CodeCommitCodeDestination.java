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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code files
 * provided with the project request will be uploaded after project creation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CodeCommitCodeDestination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeCommitCodeDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     * </p>
     * 
     * @param name
     *        The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     * </p>
     * 
     * @return The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     * </p>
     * 
     * @param name
     *        The name of the AWS CodeCommit repository to be created in AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeCommitCodeDestination withName(String name) {
        setName(name);
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
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeCommitCodeDestination == false)
            return false;
        CodeCommitCodeDestination other = (CodeCommitCodeDestination) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CodeCommitCodeDestination clone() {
        try {
            return (CodeCommitCodeDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.CodeCommitCodeDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
