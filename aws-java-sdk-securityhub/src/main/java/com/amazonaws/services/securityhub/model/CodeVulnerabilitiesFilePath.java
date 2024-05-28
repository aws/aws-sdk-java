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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about where a code vulnerability is located in your Lambda function.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CodeVulnerabilitiesFilePath"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeVulnerabilitiesFilePath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The line number of the last line of code in which the vulnerability is located.
     * </p>
     */
    private Integer endLine;
    /**
     * <p>
     * The name of the file in which the code vulnerability is located.
     * </p>
     */
    private String fileName;
    /**
     * <p>
     * The file path to the code in which the vulnerability is located.
     * </p>
     */
    private String filePath;
    /**
     * <p>
     * The line number of the first line of code in which the vulnerability is located.
     * </p>
     */
    private Integer startLine;

    /**
     * <p>
     * The line number of the last line of code in which the vulnerability is located.
     * </p>
     * 
     * @param endLine
     *        The line number of the last line of code in which the vulnerability is located.
     */

    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * <p>
     * The line number of the last line of code in which the vulnerability is located.
     * </p>
     * 
     * @return The line number of the last line of code in which the vulnerability is located.
     */

    public Integer getEndLine() {
        return this.endLine;
    }

    /**
     * <p>
     * The line number of the last line of code in which the vulnerability is located.
     * </p>
     * 
     * @param endLine
     *        The line number of the last line of code in which the vulnerability is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeVulnerabilitiesFilePath withEndLine(Integer endLine) {
        setEndLine(endLine);
        return this;
    }

    /**
     * <p>
     * The name of the file in which the code vulnerability is located.
     * </p>
     * 
     * @param fileName
     *        The name of the file in which the code vulnerability is located.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the file in which the code vulnerability is located.
     * </p>
     * 
     * @return The name of the file in which the code vulnerability is located.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The name of the file in which the code vulnerability is located.
     * </p>
     * 
     * @param fileName
     *        The name of the file in which the code vulnerability is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeVulnerabilitiesFilePath withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The file path to the code in which the vulnerability is located.
     * </p>
     * 
     * @param filePath
     *        The file path to the code in which the vulnerability is located.
     */

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * <p>
     * The file path to the code in which the vulnerability is located.
     * </p>
     * 
     * @return The file path to the code in which the vulnerability is located.
     */

    public String getFilePath() {
        return this.filePath;
    }

    /**
     * <p>
     * The file path to the code in which the vulnerability is located.
     * </p>
     * 
     * @param filePath
     *        The file path to the code in which the vulnerability is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeVulnerabilitiesFilePath withFilePath(String filePath) {
        setFilePath(filePath);
        return this;
    }

    /**
     * <p>
     * The line number of the first line of code in which the vulnerability is located.
     * </p>
     * 
     * @param startLine
     *        The line number of the first line of code in which the vulnerability is located.
     */

    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * <p>
     * The line number of the first line of code in which the vulnerability is located.
     * </p>
     * 
     * @return The line number of the first line of code in which the vulnerability is located.
     */

    public Integer getStartLine() {
        return this.startLine;
    }

    /**
     * <p>
     * The line number of the first line of code in which the vulnerability is located.
     * </p>
     * 
     * @param startLine
     *        The line number of the first line of code in which the vulnerability is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeVulnerabilitiesFilePath withStartLine(Integer startLine) {
        setStartLine(startLine);
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
        if (getEndLine() != null)
            sb.append("EndLine: ").append(getEndLine()).append(",");
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getFilePath() != null)
            sb.append("FilePath: ").append(getFilePath()).append(",");
        if (getStartLine() != null)
            sb.append("StartLine: ").append(getStartLine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeVulnerabilitiesFilePath == false)
            return false;
        CodeVulnerabilitiesFilePath other = (CodeVulnerabilitiesFilePath) obj;
        if (other.getEndLine() == null ^ this.getEndLine() == null)
            return false;
        if (other.getEndLine() != null && other.getEndLine().equals(this.getEndLine()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFilePath() == null ^ this.getFilePath() == null)
            return false;
        if (other.getFilePath() != null && other.getFilePath().equals(this.getFilePath()) == false)
            return false;
        if (other.getStartLine() == null ^ this.getStartLine() == null)
            return false;
        if (other.getStartLine() != null && other.getStartLine().equals(this.getStartLine()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndLine() == null) ? 0 : getEndLine().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        hashCode = prime * hashCode + ((getStartLine() == null) ? 0 : getStartLine().hashCode());
        return hashCode;
    }

    @Override
    public CodeVulnerabilitiesFilePath clone() {
        try {
            return (CodeVulnerabilitiesFilePath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.CodeVulnerabilitiesFilePathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
