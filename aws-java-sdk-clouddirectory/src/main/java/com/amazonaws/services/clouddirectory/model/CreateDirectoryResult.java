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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/CreateDirectory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDirectoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;
    /**
     * <p>
     * The name of the <a>Directory</a>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The root object node of the created directory.
     * </p>
     */
    private String objectIdentifier;
    /**
     * <p>
     * The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the directory, it
     * has its own ARN, which is referred to applied schema ARN. For more information, see <a>arns</a>.
     * </p>
     */
    private String appliedSchemaArn;

    /**
     * <p>
     * The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     */

    public void setDirectoryArn(String directoryArn) {
        this.directoryArn = directoryArn;
    }

    /**
     * <p>
     * The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     */

    public String getDirectoryArn() {
        return this.directoryArn;
    }

    /**
     * <p>
     * The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param directoryArn
     *        The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryResult withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Directory</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>Directory</a>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <a>Directory</a>.
     * </p>
     * 
     * @return The name of the <a>Directory</a>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <a>Directory</a>.
     * </p>
     * 
     * @param name
     *        The name of the <a>Directory</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The root object node of the created directory.
     * </p>
     * 
     * @param objectIdentifier
     *        The root object node of the created directory.
     */

    public void setObjectIdentifier(String objectIdentifier) {
        this.objectIdentifier = objectIdentifier;
    }

    /**
     * <p>
     * The root object node of the created directory.
     * </p>
     * 
     * @return The root object node of the created directory.
     */

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * <p>
     * The root object node of the created directory.
     * </p>
     * 
     * @param objectIdentifier
     *        The root object node of the created directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryResult withObjectIdentifier(String objectIdentifier) {
        setObjectIdentifier(objectIdentifier);
        return this;
    }

    /**
     * <p>
     * The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the directory, it
     * has its own ARN, which is referred to applied schema ARN. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param appliedSchemaArn
     *        The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the
     *        directory, it has its own ARN, which is referred to applied schema ARN. For more information, see
     *        <a>arns</a>.
     */

    public void setAppliedSchemaArn(String appliedSchemaArn) {
        this.appliedSchemaArn = appliedSchemaArn;
    }

    /**
     * <p>
     * The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the directory, it
     * has its own ARN, which is referred to applied schema ARN. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the
     *         directory, it has its own ARN, which is referred to applied schema ARN. For more information, see
     *         <a>arns</a>.
     */

    public String getAppliedSchemaArn() {
        return this.appliedSchemaArn;
    }

    /**
     * <p>
     * The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the directory, it
     * has its own ARN, which is referred to applied schema ARN. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param appliedSchemaArn
     *        The ARN of the published schema in the <a>Directory</a>. Once a published schema is copied into the
     *        directory, it has its own ARN, which is referred to applied schema ARN. For more information, see
     *        <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDirectoryResult withAppliedSchemaArn(String appliedSchemaArn) {
        setAppliedSchemaArn(appliedSchemaArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getObjectIdentifier() != null)
            sb.append("ObjectIdentifier: ").append(getObjectIdentifier()).append(",");
        if (getAppliedSchemaArn() != null)
            sb.append("AppliedSchemaArn: ").append(getAppliedSchemaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectoryResult == false)
            return false;
        CreateDirectoryResult other = (CreateDirectoryResult) obj;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getObjectIdentifier() == null ^ this.getObjectIdentifier() == null)
            return false;
        if (other.getObjectIdentifier() != null && other.getObjectIdentifier().equals(this.getObjectIdentifier()) == false)
            return false;
        if (other.getAppliedSchemaArn() == null ^ this.getAppliedSchemaArn() == null)
            return false;
        if (other.getAppliedSchemaArn() != null && other.getAppliedSchemaArn().equals(this.getAppliedSchemaArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getObjectIdentifier() == null) ? 0 : getObjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAppliedSchemaArn() == null) ? 0 : getAppliedSchemaArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateDirectoryResult clone() {
        try {
            return (CreateDirectoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
