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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
 * <code>SourceCodeType</code> </a> that specifies a code diff between a source and destination branch in an associated
 * repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/BranchDiffSourceCodeType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BranchDiffSourceCodeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source branch for a diff in an associated repository.
     * </p>
     */
    private String sourceBranchName;
    /**
     * <p>
     * The destination branch for a diff in an associated repository.
     * </p>
     */
    private String destinationBranchName;

    /**
     * <p>
     * The source branch for a diff in an associated repository.
     * </p>
     * 
     * @param sourceBranchName
     *        The source branch for a diff in an associated repository.
     */

    public void setSourceBranchName(String sourceBranchName) {
        this.sourceBranchName = sourceBranchName;
    }

    /**
     * <p>
     * The source branch for a diff in an associated repository.
     * </p>
     * 
     * @return The source branch for a diff in an associated repository.
     */

    public String getSourceBranchName() {
        return this.sourceBranchName;
    }

    /**
     * <p>
     * The source branch for a diff in an associated repository.
     * </p>
     * 
     * @param sourceBranchName
     *        The source branch for a diff in an associated repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BranchDiffSourceCodeType withSourceBranchName(String sourceBranchName) {
        setSourceBranchName(sourceBranchName);
        return this;
    }

    /**
     * <p>
     * The destination branch for a diff in an associated repository.
     * </p>
     * 
     * @param destinationBranchName
     *        The destination branch for a diff in an associated repository.
     */

    public void setDestinationBranchName(String destinationBranchName) {
        this.destinationBranchName = destinationBranchName;
    }

    /**
     * <p>
     * The destination branch for a diff in an associated repository.
     * </p>
     * 
     * @return The destination branch for a diff in an associated repository.
     */

    public String getDestinationBranchName() {
        return this.destinationBranchName;
    }

    /**
     * <p>
     * The destination branch for a diff in an associated repository.
     * </p>
     * 
     * @param destinationBranchName
     *        The destination branch for a diff in an associated repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BranchDiffSourceCodeType withDestinationBranchName(String destinationBranchName) {
        setDestinationBranchName(destinationBranchName);
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
        if (getSourceBranchName() != null)
            sb.append("SourceBranchName: ").append(getSourceBranchName()).append(",");
        if (getDestinationBranchName() != null)
            sb.append("DestinationBranchName: ").append(getDestinationBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BranchDiffSourceCodeType == false)
            return false;
        BranchDiffSourceCodeType other = (BranchDiffSourceCodeType) obj;
        if (other.getSourceBranchName() == null ^ this.getSourceBranchName() == null)
            return false;
        if (other.getSourceBranchName() != null && other.getSourceBranchName().equals(this.getSourceBranchName()) == false)
            return false;
        if (other.getDestinationBranchName() == null ^ this.getDestinationBranchName() == null)
            return false;
        if (other.getDestinationBranchName() != null && other.getDestinationBranchName().equals(this.getDestinationBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceBranchName() == null) ? 0 : getSourceBranchName().hashCode());
        hashCode = prime * hashCode + ((getDestinationBranchName() == null) ? 0 : getDestinationBranchName().hashCode());
        return hashCode;
    }

    @Override
    public BranchDiffSourceCodeType clone() {
        try {
            return (BranchDiffSourceCodeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.BranchDiffSourceCodeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
