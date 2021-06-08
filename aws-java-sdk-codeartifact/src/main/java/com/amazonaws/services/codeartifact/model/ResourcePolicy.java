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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An AWS CodeArtifact resource policy that contains a resource ARN, document details, and a revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/ResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the resource associated with the resource policy
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The current revision of the resource policy.
     * </p>
     */
    private String revision;
    /**
     * <p>
     * The resource policy formatted in JSON.
     * </p>
     */
    private String document;

    /**
     * <p>
     * The ARN of the resource associated with the resource policy
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource associated with the resource policy
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource associated with the resource policy
     * </p>
     * 
     * @return The ARN of the resource associated with the resource policy
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the resource associated with the resource policy
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the resource associated with the resource policy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The current revision of the resource policy.
     * </p>
     * 
     * @param revision
     *        The current revision of the resource policy.
     */

    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The current revision of the resource policy.
     * </p>
     * 
     * @return The current revision of the resource policy.
     */

    public String getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The current revision of the resource policy.
     * </p>
     * 
     * @param revision
     *        The current revision of the resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withRevision(String revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The resource policy formatted in JSON.
     * </p>
     * 
     * @param document
     *        The resource policy formatted in JSON.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The resource policy formatted in JSON.
     * </p>
     * 
     * @return The resource policy formatted in JSON.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The resource policy formatted in JSON.
     * </p>
     * 
     * @param document
     *        The resource policy formatted in JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withDocument(String document) {
        setDocument(document);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePolicy == false)
            return false;
        ResourcePolicy other = (ResourcePolicy) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePolicy clone() {
        try {
            return (ResourcePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.ResourcePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
