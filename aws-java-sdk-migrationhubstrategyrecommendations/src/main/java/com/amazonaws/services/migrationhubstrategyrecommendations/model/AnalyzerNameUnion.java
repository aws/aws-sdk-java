/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The combination of the existing analyzers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/AnalyzerNameUnion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzerNameUnion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The binary analyzer names.
     * </p>
     */
    private String binaryAnalyzerName;
    /**
     * <p>
     * The assessment analyzer names.
     * </p>
     */
    private String runTimeAnalyzerName;
    /**
     * <p>
     * The source code analyzer names.
     * </p>
     */
    private String sourceCodeAnalyzerName;

    /**
     * <p>
     * The binary analyzer names.
     * </p>
     * 
     * @param binaryAnalyzerName
     *        The binary analyzer names.
     * @see BinaryAnalyzerName
     */

    public void setBinaryAnalyzerName(String binaryAnalyzerName) {
        this.binaryAnalyzerName = binaryAnalyzerName;
    }

    /**
     * <p>
     * The binary analyzer names.
     * </p>
     * 
     * @return The binary analyzer names.
     * @see BinaryAnalyzerName
     */

    public String getBinaryAnalyzerName() {
        return this.binaryAnalyzerName;
    }

    /**
     * <p>
     * The binary analyzer names.
     * </p>
     * 
     * @param binaryAnalyzerName
     *        The binary analyzer names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BinaryAnalyzerName
     */

    public AnalyzerNameUnion withBinaryAnalyzerName(String binaryAnalyzerName) {
        setBinaryAnalyzerName(binaryAnalyzerName);
        return this;
    }

    /**
     * <p>
     * The binary analyzer names.
     * </p>
     * 
     * @param binaryAnalyzerName
     *        The binary analyzer names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BinaryAnalyzerName
     */

    public AnalyzerNameUnion withBinaryAnalyzerName(BinaryAnalyzerName binaryAnalyzerName) {
        this.binaryAnalyzerName = binaryAnalyzerName.toString();
        return this;
    }

    /**
     * <p>
     * The assessment analyzer names.
     * </p>
     * 
     * @param runTimeAnalyzerName
     *        The assessment analyzer names.
     * @see RunTimeAnalyzerName
     */

    public void setRunTimeAnalyzerName(String runTimeAnalyzerName) {
        this.runTimeAnalyzerName = runTimeAnalyzerName;
    }

    /**
     * <p>
     * The assessment analyzer names.
     * </p>
     * 
     * @return The assessment analyzer names.
     * @see RunTimeAnalyzerName
     */

    public String getRunTimeAnalyzerName() {
        return this.runTimeAnalyzerName;
    }

    /**
     * <p>
     * The assessment analyzer names.
     * </p>
     * 
     * @param runTimeAnalyzerName
     *        The assessment analyzer names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunTimeAnalyzerName
     */

    public AnalyzerNameUnion withRunTimeAnalyzerName(String runTimeAnalyzerName) {
        setRunTimeAnalyzerName(runTimeAnalyzerName);
        return this;
    }

    /**
     * <p>
     * The assessment analyzer names.
     * </p>
     * 
     * @param runTimeAnalyzerName
     *        The assessment analyzer names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunTimeAnalyzerName
     */

    public AnalyzerNameUnion withRunTimeAnalyzerName(RunTimeAnalyzerName runTimeAnalyzerName) {
        this.runTimeAnalyzerName = runTimeAnalyzerName.toString();
        return this;
    }

    /**
     * <p>
     * The source code analyzer names.
     * </p>
     * 
     * @param sourceCodeAnalyzerName
     *        The source code analyzer names.
     * @see SourceCodeAnalyzerName
     */

    public void setSourceCodeAnalyzerName(String sourceCodeAnalyzerName) {
        this.sourceCodeAnalyzerName = sourceCodeAnalyzerName;
    }

    /**
     * <p>
     * The source code analyzer names.
     * </p>
     * 
     * @return The source code analyzer names.
     * @see SourceCodeAnalyzerName
     */

    public String getSourceCodeAnalyzerName() {
        return this.sourceCodeAnalyzerName;
    }

    /**
     * <p>
     * The source code analyzer names.
     * </p>
     * 
     * @param sourceCodeAnalyzerName
     *        The source code analyzer names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceCodeAnalyzerName
     */

    public AnalyzerNameUnion withSourceCodeAnalyzerName(String sourceCodeAnalyzerName) {
        setSourceCodeAnalyzerName(sourceCodeAnalyzerName);
        return this;
    }

    /**
     * <p>
     * The source code analyzer names.
     * </p>
     * 
     * @param sourceCodeAnalyzerName
     *        The source code analyzer names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceCodeAnalyzerName
     */

    public AnalyzerNameUnion withSourceCodeAnalyzerName(SourceCodeAnalyzerName sourceCodeAnalyzerName) {
        this.sourceCodeAnalyzerName = sourceCodeAnalyzerName.toString();
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
        if (getBinaryAnalyzerName() != null)
            sb.append("BinaryAnalyzerName: ").append(getBinaryAnalyzerName()).append(",");
        if (getRunTimeAnalyzerName() != null)
            sb.append("RunTimeAnalyzerName: ").append(getRunTimeAnalyzerName()).append(",");
        if (getSourceCodeAnalyzerName() != null)
            sb.append("SourceCodeAnalyzerName: ").append(getSourceCodeAnalyzerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzerNameUnion == false)
            return false;
        AnalyzerNameUnion other = (AnalyzerNameUnion) obj;
        if (other.getBinaryAnalyzerName() == null ^ this.getBinaryAnalyzerName() == null)
            return false;
        if (other.getBinaryAnalyzerName() != null && other.getBinaryAnalyzerName().equals(this.getBinaryAnalyzerName()) == false)
            return false;
        if (other.getRunTimeAnalyzerName() == null ^ this.getRunTimeAnalyzerName() == null)
            return false;
        if (other.getRunTimeAnalyzerName() != null && other.getRunTimeAnalyzerName().equals(this.getRunTimeAnalyzerName()) == false)
            return false;
        if (other.getSourceCodeAnalyzerName() == null ^ this.getSourceCodeAnalyzerName() == null)
            return false;
        if (other.getSourceCodeAnalyzerName() != null && other.getSourceCodeAnalyzerName().equals(this.getSourceCodeAnalyzerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBinaryAnalyzerName() == null) ? 0 : getBinaryAnalyzerName().hashCode());
        hashCode = prime * hashCode + ((getRunTimeAnalyzerName() == null) ? 0 : getRunTimeAnalyzerName().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeAnalyzerName() == null) ? 0 : getSourceCodeAnalyzerName().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzerNameUnion clone() {
        try {
            return (AnalyzerNameUnion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.AnalyzerNameUnionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
