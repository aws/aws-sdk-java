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
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/DetachObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetachObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The parent reference from which the object with the specified link name is detached.
     * </p>
     */
    private ObjectReference parentReference;
    /**
     * <p>
     * The link name associated with the object that needs to be detached.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For more
     *        information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For
     *         more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where objects reside. For more
     *        information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachObjectRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The parent reference from which the object with the specified link name is detached.
     * </p>
     * 
     * @param parentReference
     *        The parent reference from which the object with the specified link name is detached.
     */

    public void setParentReference(ObjectReference parentReference) {
        this.parentReference = parentReference;
    }

    /**
     * <p>
     * The parent reference from which the object with the specified link name is detached.
     * </p>
     * 
     * @return The parent reference from which the object with the specified link name is detached.
     */

    public ObjectReference getParentReference() {
        return this.parentReference;
    }

    /**
     * <p>
     * The parent reference from which the object with the specified link name is detached.
     * </p>
     * 
     * @param parentReference
     *        The parent reference from which the object with the specified link name is detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachObjectRequest withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The link name associated with the object that needs to be detached.
     * </p>
     * 
     * @param linkName
     *        The link name associated with the object that needs to be detached.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The link name associated with the object that needs to be detached.
     * </p>
     * 
     * @return The link name associated with the object that needs to be detached.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The link name associated with the object that needs to be detached.
     * </p>
     * 
     * @param linkName
     *        The link name associated with the object that needs to be detached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetachObjectRequest withLinkName(String linkName) {
        setLinkName(linkName);
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
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn()).append(",");
        if (getParentReference() != null)
            sb.append("ParentReference: ").append(getParentReference()).append(",");
        if (getLinkName() != null)
            sb.append("LinkName: ").append(getLinkName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachObjectRequest == false)
            return false;
        DetachObjectRequest other = (DetachObjectRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getParentReference() == null ^ this.getParentReference() == null)
            return false;
        if (other.getParentReference() != null && other.getParentReference().equals(this.getParentReference()) == false)
            return false;
        if (other.getLinkName() == null ^ this.getLinkName() == null)
            return false;
        if (other.getLinkName() != null && other.getLinkName().equals(this.getLinkName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getParentReference() == null) ? 0 : getParentReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public DetachObjectRequest clone() {
        return (DetachObjectRequest) super.clone();
    }

}
