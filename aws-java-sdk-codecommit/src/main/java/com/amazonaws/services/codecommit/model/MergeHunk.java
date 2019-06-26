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
 * Information about merge hunks in a merge or pull request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeHunk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeHunk implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file
     * or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid
     * values include true, false, and null. This will be true when the hunk represents a conflict and one or more files
     * contains a line conflict. File mode conflicts in a merge will not set this to be true.
     * </p>
     */
    private Boolean isConflict;
    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull request.
     * </p>
     */
    private MergeHunkDetail source;
    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull request.
     * </p>
     */
    private MergeHunkDetail destination;
    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     */
    private MergeHunkDetail base;

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file
     * or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid
     * values include true, false, and null. This will be true when the hunk represents a conflict and one or more files
     * contains a line conflict. File mode conflicts in a merge will not set this to be true.
     * </p>
     * 
     * @param isConflict
     *        A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the
     *        same file or the same lines in a file were modified in both the source and destination of a merge or pull
     *        request. Valid values include true, false, and null. This will be true when the hunk represents a conflict
     *        and one or more files contains a line conflict. File mode conflicts in a merge will not set this to be
     *        true.
     */

    public void setIsConflict(Boolean isConflict) {
        this.isConflict = isConflict;
    }

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file
     * or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid
     * values include true, false, and null. This will be true when the hunk represents a conflict and one or more files
     * contains a line conflict. File mode conflicts in a merge will not set this to be true.
     * </p>
     * 
     * @return A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the
     *         same file or the same lines in a file were modified in both the source and destination of a merge or pull
     *         request. Valid values include true, false, and null. This will be true when the hunk represents a
     *         conflict and one or more files contains a line conflict. File mode conflicts in a merge will not set this
     *         to be true.
     */

    public Boolean getIsConflict() {
        return this.isConflict;
    }

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file
     * or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid
     * values include true, false, and null. This will be true when the hunk represents a conflict and one or more files
     * contains a line conflict. File mode conflicts in a merge will not set this to be true.
     * </p>
     * 
     * @param isConflict
     *        A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the
     *        same file or the same lines in a file were modified in both the source and destination of a merge or pull
     *        request. Valid values include true, false, and null. This will be true when the hunk represents a conflict
     *        and one or more files contains a line conflict. File mode conflicts in a merge will not set this to be
     *        true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunk withIsConflict(Boolean isConflict) {
        setIsConflict(isConflict);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the same file
     * or the same lines in a file were modified in both the source and destination of a merge or pull request. Valid
     * values include true, false, and null. This will be true when the hunk represents a conflict and one or more files
     * contains a line conflict. File mode conflicts in a merge will not set this to be true.
     * </p>
     * 
     * @return A Boolean value indicating whether a combination of hunks contains a conflict. Conflicts occur when the
     *         same file or the same lines in a file were modified in both the source and destination of a merge or pull
     *         request. Valid values include true, false, and null. This will be true when the hunk represents a
     *         conflict and one or more files contains a line conflict. File mode conflicts in a merge will not set this
     *         to be true.
     */

    public Boolean isConflict() {
        return this.isConflict;
    }

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull request.
     * </p>
     * 
     * @param source
     *        Information about the merge hunk in the source of a merge or pull request.
     */

    public void setSource(MergeHunkDetail source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull request.
     * </p>
     * 
     * @return Information about the merge hunk in the source of a merge or pull request.
     */

    public MergeHunkDetail getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information about the merge hunk in the source of a merge or pull request.
     * </p>
     * 
     * @param source
     *        Information about the merge hunk in the source of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunk withSource(MergeHunkDetail source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull request.
     * </p>
     * 
     * @param destination
     *        Information about the merge hunk in the destination of a merge or pull request.
     */

    public void setDestination(MergeHunkDetail destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull request.
     * </p>
     * 
     * @return Information about the merge hunk in the destination of a merge or pull request.
     */

    public MergeHunkDetail getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * Information about the merge hunk in the destination of a merge or pull request.
     * </p>
     * 
     * @param destination
     *        Information about the merge hunk in the destination of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunk withDestination(MergeHunkDetail destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     * 
     * @param base
     *        Information about the merge hunk in the base of a merge or pull request.
     */

    public void setBase(MergeHunkDetail base) {
        this.base = base;
    }

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     * 
     * @return Information about the merge hunk in the base of a merge or pull request.
     */

    public MergeHunkDetail getBase() {
        return this.base;
    }

    /**
     * <p>
     * Information about the merge hunk in the base of a merge or pull request.
     * </p>
     * 
     * @param base
     *        Information about the merge hunk in the base of a merge or pull request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunk withBase(MergeHunkDetail base) {
        setBase(base);
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
        if (getIsConflict() != null)
            sb.append("IsConflict: ").append(getIsConflict()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getBase() != null)
            sb.append("Base: ").append(getBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeHunk == false)
            return false;
        MergeHunk other = (MergeHunk) obj;
        if (other.getIsConflict() == null ^ this.getIsConflict() == null)
            return false;
        if (other.getIsConflict() != null && other.getIsConflict().equals(this.getIsConflict()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsConflict() == null) ? 0 : getIsConflict().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        return hashCode;
    }

    @Override
    public MergeHunk clone() {
        try {
            return (MergeHunk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.MergeHunkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
