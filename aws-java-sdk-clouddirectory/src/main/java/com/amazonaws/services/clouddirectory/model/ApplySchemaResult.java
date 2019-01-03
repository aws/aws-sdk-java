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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2017-01-11/ApplySchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplySchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use this ARN to
     * describe the schema information applied on this directory. For more information, see <a>arns</a>.
     * </p>
     */
    private String appliedSchemaArn;
    /**
     * <p>
     * The ARN that is associated with the <a>Directory</a>. For more information, see <a>arns</a>.
     * </p>
     */
    private String directoryArn;

    /**
     * <p>
     * The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use this ARN to
     * describe the schema information applied on this directory. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param appliedSchemaArn
     *        The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use this
     *        ARN to describe the schema information applied on this directory. For more information, see <a>arns</a>.
     */

    public void setAppliedSchemaArn(String appliedSchemaArn) {
        this.appliedSchemaArn = appliedSchemaArn;
    }

    /**
     * <p>
     * The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use this ARN to
     * describe the schema information applied on this directory. For more information, see <a>arns</a>.
     * </p>
     * 
     * @return The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use
     *         this ARN to describe the schema information applied on this directory. For more information, see
     *         <a>arns</a>.
     */

    public String getAppliedSchemaArn() {
        return this.appliedSchemaArn;
    }

    /**
     * <p>
     * The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use this ARN to
     * describe the schema information applied on this directory. For more information, see <a>arns</a>.
     * </p>
     * 
     * @param appliedSchemaArn
     *        The applied schema ARN that is associated with the copied schema in the <a>Directory</a>. You can use this
     *        ARN to describe the schema information applied on this directory. For more information, see <a>arns</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplySchemaResult withAppliedSchemaArn(String appliedSchemaArn) {
        setAppliedSchemaArn(appliedSchemaArn);
        return this;
    }

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

    public ApplySchemaResult withDirectoryArn(String directoryArn) {
        setDirectoryArn(directoryArn);
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
        if (getAppliedSchemaArn() != null)
            sb.append("AppliedSchemaArn: ").append(getAppliedSchemaArn()).append(",");
        if (getDirectoryArn() != null)
            sb.append("DirectoryArn: ").append(getDirectoryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplySchemaResult == false)
            return false;
        ApplySchemaResult other = (ApplySchemaResult) obj;
        if (other.getAppliedSchemaArn() == null ^ this.getAppliedSchemaArn() == null)
            return false;
        if (other.getAppliedSchemaArn() != null && other.getAppliedSchemaArn().equals(this.getAppliedSchemaArn()) == false)
            return false;
        if (other.getDirectoryArn() == null ^ this.getDirectoryArn() == null)
            return false;
        if (other.getDirectoryArn() != null && other.getDirectoryArn().equals(this.getDirectoryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppliedSchemaArn() == null) ? 0 : getAppliedSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDirectoryArn() == null) ? 0 : getDirectoryArn().hashCode());
        return hashCode;
    }

    @Override
    public ApplySchemaResult clone() {
        try {
            return (ApplySchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
