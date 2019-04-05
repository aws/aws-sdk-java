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
 * Information about a source file that is part of changes made in a commit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/SourceFileSpecifier" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceFileSpecifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     */
    private Boolean isMove;

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path to the file, including the name of the file.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * 
     * @return The full path to the file, including the name of the file.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The full path to the file, including the name of the file.
     * </p>
     * 
     * @param filePath
     *        The full path to the file, including the name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFileSpecifier withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     * 
     * @param isMove
     *        Whether to remove the source file from the parent commit.
     */

    public void setIsMove(Boolean isMove) {
        this.isMove = isMove;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     * 
     * @return Whether to remove the source file from the parent commit.
     */

    public Boolean getIsMove() {
        return this.isMove;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     * 
     * @param isMove
     *        Whether to remove the source file from the parent commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceFileSpecifier withIsMove(Boolean isMove) {
        setIsMove(isMove);
        return this;
    }

    /**
     * <p>
     * Whether to remove the source file from the parent commit.
     * </p>
     * 
     * @return Whether to remove the source file from the parent commit.
     */

    public Boolean isMove() {
        return this.isMove;
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
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getIsMove() != null)
            sb.append("IsMove: ").append(getIsMove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceFileSpecifier == false)
            return false;
        SourceFileSpecifier other = (SourceFileSpecifier) obj;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getIsMove() == null ^ this.getIsMove() == null)
            return false;
        if (other.getIsMove() != null && other.getIsMove().equals(this.getIsMove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getIsMove() == null) ? 0 : getIsMove().hashCode());
        return hashCode;
    }

    @Override
    public SourceFileSpecifier clone() {
        try {
            return (SourceFileSpecifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.SourceFileSpecifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
