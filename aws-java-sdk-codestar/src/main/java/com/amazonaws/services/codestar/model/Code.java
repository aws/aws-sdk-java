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
 * Location and destination information about the source code files provided with the project request. The source code
 * is uploaded to the new project source repository after project creation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/Code" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Code implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the
     * files during project creation.
     * </p>
     */
    private CodeSource source;
    /**
     * <p>
     * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar
     * provisions the new repository, the source code files provided with the project request are placed in the
     * repository.
     * </p>
     */
    private CodeDestination destination;

    /**
     * <p>
     * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the
     * files during project creation.
     * </p>
     * 
     * @param source
     *        The location where the source code files provided with the project request are stored. AWS CodeStar
     *        retrieves the files during project creation.
     */

    public void setSource(CodeSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the
     * files during project creation.
     * </p>
     * 
     * @return The location where the source code files provided with the project request are stored. AWS CodeStar
     *         retrieves the files during project creation.
     */

    public CodeSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The location where the source code files provided with the project request are stored. AWS CodeStar retrieves the
     * files during project creation.
     * </p>
     * 
     * @param source
     *        The location where the source code files provided with the project request are stored. AWS CodeStar
     *        retrieves the files during project creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Code withSource(CodeSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar
     * provisions the new repository, the source code files provided with the project request are placed in the
     * repository.
     * </p>
     * 
     * @param destination
     *        The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS
     *        CodeStar provisions the new repository, the source code files provided with the project request are placed
     *        in the repository.
     */

    public void setDestination(CodeDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar
     * provisions the new repository, the source code files provided with the project request are placed in the
     * repository.
     * </p>
     * 
     * @return The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS
     *         CodeStar provisions the new repository, the source code files provided with the project request are
     *         placed in the repository.
     */

    public CodeDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar
     * provisions the new repository, the source code files provided with the project request are placed in the
     * repository.
     * </p>
     * 
     * @param destination
     *        The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS
     *        CodeStar provisions the new repository, the source code files provided with the project request are placed
     *        in the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Code withDestination(CodeDestination destination) {
        setDestination(destination);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Code == false)
            return false;
        Code other = (Code) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public Code clone() {
        try {
            return (Code) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.CodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
