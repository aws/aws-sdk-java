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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The parent object reference.
     * </p>
     */
    private ObjectReference parentReference;
    /**
     * <p>
     * The child object reference to be attached to the object.
     * </p>
     */
    private ObjectReference childReference;
    /**
     * <p>
     * The link name with which the child object is attached to the parent.
     * </p>
     */
    private String linkName;

    /**
     * <p>
     * Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For
     *        more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For
     *         more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For more
     * information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        Amazon Resource Name (ARN) that is associated with the <a>Directory</a> where both objects reside. For
     *        more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachObjectRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The parent object reference.
     * </p>
     * 
     * @param parentReference
     *        The parent object reference.
     */

    public void setParentReference(ObjectReference parentReference) {
        this.parentReference = parentReference;
    }

    /**
     * <p>
     * The parent object reference.
     * </p>
     * 
     * @return The parent object reference.
     */

    public ObjectReference getParentReference() {
        return this.parentReference;
    }

    /**
     * <p>
     * The parent object reference.
     * </p>
     * 
     * @param parentReference
     *        The parent object reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachObjectRequest withParentReference(ObjectReference parentReference) {
        setParentReference(parentReference);
        return this;
    }

    /**
     * <p>
     * The child object reference to be attached to the object.
     * </p>
     * 
     * @param childReference
     *        The child object reference to be attached to the object.
     */

    public void setChildReference(ObjectReference childReference) {
        this.childReference = childReference;
    }

    /**
     * <p>
     * The child object reference to be attached to the object.
     * </p>
     * 
     * @return The child object reference to be attached to the object.
     */

    public ObjectReference getChildReference() {
        return this.childReference;
    }

    /**
     * <p>
     * The child object reference to be attached to the object.
     * </p>
     * 
     * @param childReference
     *        The child object reference to be attached to the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachObjectRequest withChildReference(ObjectReference childReference) {
        setChildReference(childReference);
        return this;
    }

    /**
     * <p>
     * The link name with which the child object is attached to the parent.
     * </p>
     * 
     * @param linkName
     *        The link name with which the child object is attached to the parent.
     */

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    /**
     * <p>
     * The link name with which the child object is attached to the parent.
     * </p>
     * 
     * @return The link name with which the child object is attached to the parent.
     */

    public String getLinkName() {
        return this.linkName;
    }

    /**
     * <p>
     * The link name with which the child object is attached to the parent.
     * </p>
     * 
     * @param linkName
     *        The link name with which the child object is attached to the parent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachObjectRequest withLinkName(String linkName) {
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
        if (getChildReference() != null)
            sb.append("ChildReference: ").append(getChildReference()).append(",");
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

        if (obj instanceof AttachObjectRequest == false)
            return false;
        AttachObjectRequest other = (AttachObjectRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getParentReference() == null ^ this.getParentReference() == null)
            return false;
        if (other.getParentReference() != null && other.getParentReference().equals(this.getParentReference()) == false)
            return false;
        if (other.getChildReference() == null ^ this.getChildReference() == null)
            return false;
        if (other.getChildReference() != null && other.getChildReference().equals(this.getChildReference()) == false)
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
        hashCode = prime * hashCode + ((getChildReference() == null) ? 0 : getChildReference().hashCode());
        hashCode = prime * hashCode + ((getLinkName() == null) ? 0 : getLinkName().hashCode());
        return hashCode;
    }

    @Override
    public AttachObjectRequest clone() {
        return (AttachObjectRequest) super.clone();
    }

}
