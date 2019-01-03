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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about a target for a pull request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/Target" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Target implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     */
    private String sourceReference;
    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     */
    private String destinationReference;

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @return The name of the repository that contains the pull request.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the pull request.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     * 
     * @param sourceReference
     *        The branch of the repository that contains the changes for the pull request. Also known as the source
     *        branch.
     */

    public void setSourceReference(String sourceReference) {
        this.sourceReference = sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     * 
     * @return The branch of the repository that contains the changes for the pull request. Also known as the source
     *         branch.
     */

    public String getSourceReference() {
        return this.sourceReference;
    }

    /**
     * <p>
     * The branch of the repository that contains the changes for the pull request. Also known as the source branch.
     * </p>
     * 
     * @param sourceReference
     *        The branch of the repository that contains the changes for the pull request. Also known as the source
     *        branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withSourceReference(String sourceReference) {
        setSourceReference(sourceReference);
        return this;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     * 
     * @param destinationReference
     *        The branch of the repository where the pull request changes will be merged into. Also known as the
     *        destination branch.
     */

    public void setDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     * 
     * @return The branch of the repository where the pull request changes will be merged into. Also known as the
     *         destination branch.
     */

    public String getDestinationReference() {
        return this.destinationReference;
    }

    /**
     * <p>
     * The branch of the repository where the pull request changes will be merged into. Also known as the destination
     * branch.
     * </p>
     * 
     * @param destinationReference
     *        The branch of the repository where the pull request changes will be merged into. Also known as the
     *        destination branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Target withDestinationReference(String destinationReference) {
        setDestinationReference(destinationReference);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getSourceReference() != null)
            sb.append("SourceReference: ").append(getSourceReference()).append(",");
        if (getDestinationReference() != null)
            sb.append("DestinationReference: ").append(getDestinationReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Target == false)
            return false;
        Target other = (Target) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getSourceReference() == null ^ this.getSourceReference() == null)
            return false;
        if (other.getSourceReference() != null && other.getSourceReference().equals(this.getSourceReference()) == false)
            return false;
        if (other.getDestinationReference() == null ^ this.getDestinationReference() == null)
            return false;
        if (other.getDestinationReference() != null && other.getDestinationReference().equals(this.getDestinationReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getSourceReference() == null) ? 0 : getSourceReference().hashCode());
        hashCode = prime * hashCode + ((getDestinationReference() == null) ? 0 : getDestinationReference().hashCode());
        return hashCode;
    }

    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.TargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
