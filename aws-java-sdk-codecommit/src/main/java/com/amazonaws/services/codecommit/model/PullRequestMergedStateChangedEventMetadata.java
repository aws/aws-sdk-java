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
 * Returns information about the change in the merge state for a pull request event.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/PullRequestMergedStateChangedEventMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PullRequestMergedStateChangedEventMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the branch that the pull request will be merged into.
     * </p>
     */
    private String destinationReference;
    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     */
    private MergeMetadata mergeMetadata;

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was created.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @return The name of the repository where the pull request was created.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository where the pull request was created.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository where the pull request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestMergedStateChangedEventMetadata withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the branch that the pull request will be merged into.
     * </p>
     * 
     * @param destinationReference
     *        The name of the branch that the pull request will be merged into.
     */

    public void setDestinationReference(String destinationReference) {
        this.destinationReference = destinationReference;
    }

    /**
     * <p>
     * The name of the branch that the pull request will be merged into.
     * </p>
     * 
     * @return The name of the branch that the pull request will be merged into.
     */

    public String getDestinationReference() {
        return this.destinationReference;
    }

    /**
     * <p>
     * The name of the branch that the pull request will be merged into.
     * </p>
     * 
     * @param destinationReference
     *        The name of the branch that the pull request will be merged into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestMergedStateChangedEventMetadata withDestinationReference(String destinationReference) {
        setDestinationReference(destinationReference);
        return this;
    }

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     * 
     * @param mergeMetadata
     *        Information about the merge state change event.
     */

    public void setMergeMetadata(MergeMetadata mergeMetadata) {
        this.mergeMetadata = mergeMetadata;
    }

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     * 
     * @return Information about the merge state change event.
     */

    public MergeMetadata getMergeMetadata() {
        return this.mergeMetadata;
    }

    /**
     * <p>
     * Information about the merge state change event.
     * </p>
     * 
     * @param mergeMetadata
     *        Information about the merge state change event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PullRequestMergedStateChangedEventMetadata withMergeMetadata(MergeMetadata mergeMetadata) {
        setMergeMetadata(mergeMetadata);
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
        if (getDestinationReference() != null)
            sb.append("DestinationReference: ").append(getDestinationReference()).append(",");
        if (getMergeMetadata() != null)
            sb.append("MergeMetadata: ").append(getMergeMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PullRequestMergedStateChangedEventMetadata == false)
            return false;
        PullRequestMergedStateChangedEventMetadata other = (PullRequestMergedStateChangedEventMetadata) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getDestinationReference() == null ^ this.getDestinationReference() == null)
            return false;
        if (other.getDestinationReference() != null && other.getDestinationReference().equals(this.getDestinationReference()) == false)
            return false;
        if (other.getMergeMetadata() == null ^ this.getMergeMetadata() == null)
            return false;
        if (other.getMergeMetadata() != null && other.getMergeMetadata().equals(this.getMergeMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getDestinationReference() == null) ? 0 : getDestinationReference().hashCode());
        hashCode = prime * hashCode + ((getMergeMetadata() == null) ? 0 : getMergeMetadata().hashCode());
        return hashCode;
    }

    @Override
    public PullRequestMergedStateChangedEventMetadata clone() {
        try {
            return (PullRequestMergedStateChangedEventMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.PullRequestMergedStateChangedEventMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
