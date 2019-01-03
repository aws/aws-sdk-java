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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/AttachToIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachToIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where the object and index exist.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     */
    private ObjectReference indexReference;
    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     */
    private ObjectReference targetReference;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where the object and index exist.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) of the directory where the object and index exist.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where the object and index exist.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the directory where the object and index exist.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the directory where the object and index exist.
     * </p>
     * 
     * @param directoryArn
     *        The Amazon Resource Name (ARN) of the directory where the object and index exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachToIndexRequest withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     * 
     * @param indexReference
     *        A reference to the index that you are attaching the object to.
     */

    public void setIndexReference(ObjectReference indexReference) {
        this.indexReference = indexReference;
    }

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     * 
     * @return A reference to the index that you are attaching the object to.
     */

    public ObjectReference getIndexReference() {
        return this.indexReference;
    }

    /**
     * <p>
     * A reference to the index that you are attaching the object to.
     * </p>
     * 
     * @param indexReference
     *        A reference to the index that you are attaching the object to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachToIndexRequest withIndexReference(ObjectReference indexReference) {
        setIndexReference(indexReference);
        return this;
    }

    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     * 
     * @param targetReference
     *        A reference to the object that you are attaching to the index.
     */

    public void setTargetReference(ObjectReference targetReference) {
        this.targetReference = targetReference;
    }

    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     * 
     * @return A reference to the object that you are attaching to the index.
     */

    public ObjectReference getTargetReference() {
        return this.targetReference;
    }

    /**
     * <p>
     * A reference to the object that you are attaching to the index.
     * </p>
     * 
     * @param targetReference
     *        A reference to the object that you are attaching to the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachToIndexRequest withTargetReference(ObjectReference targetReference) {
        setTargetReference(targetReference);
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
        if (getIndexReference() != null)
            sb.append("IndexReference: ").append(getIndexReference()).append(",");
        if (getTargetReference() != null)
            sb.append("TargetReference: ").append(getTargetReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachToIndexRequest == false)
            return false;
        AttachToIndexRequest other = (AttachToIndexRequest) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getIndexReference() == null ^ this.getIndexReference() == null)
            return false;
        if (other.getIndexReference() != null && other.getIndexReference().equals(this.getIndexReference()) == false)
            return false;
        if (other.getTargetReference() == null ^ this.getTargetReference() == null)
            return false;
        if (other.getTargetReference() != null && other.getTargetReference().equals(this.getTargetReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getIndexReference() == null) ? 0 : getIndexReference().hashCode());
        hashCode = prime * hashCode + ((getTargetReference() == null) ? 0 : getTargetReference().hashCode());
        return hashCode;
    }

    @Override
    public AttachToIndexRequest clone() {
        return (AttachToIndexRequest) super.clone();
    }

}
