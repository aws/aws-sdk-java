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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location of security vulnerabilities that Amazon CodeGuru Security detected in your code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/FilePath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilePath implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your code.
     * </p>
     */
    private java.util.List<CodeLine> codeSnippet;
    /**
     * <p>
     * The last line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     */
    private Integer endLine;
    /**
     * <p>
     * The name of the file.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path to the resource with the security vulnerability.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The first line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     */
    private Integer startLine;

    /**
     * <p>
     * A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your code.
     * </p>
     * 
     * @return A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your
     *         code.
     */

    public java.util.List<CodeLine> getCodeSnippet() {
        return codeSnippet;
    }

    /**
     * <p>
     * A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your code.
     * </p>
     * 
     * @param codeSnippet
     *        A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your
     *        code.
     */

    public void setCodeSnippet(java.util.Collection<CodeLine> codeSnippet) {
        if (codeSnippet == null) {
            this.codeSnippet = null;
            return;
        }

        this.codeSnippet = new java.util.ArrayList<CodeLine>(codeSnippet);
    }

    /**
     * <p>
     * A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your code.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeSnippet(java.util.Collection)} or {@link #withCodeSnippet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param codeSnippet
     *        A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your
     *        code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePath withCodeSnippet(CodeLine... codeSnippet) {
        if (this.codeSnippet == null) {
            setCodeSnippet(new java.util.ArrayList<CodeLine>(codeSnippet.length));
        }
        for (CodeLine ele : codeSnippet) {
            this.codeSnippet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your code.
     * </p>
     * 
     * @param codeSnippet
     *        A list of <code>CodeLine</code> objects that describe where the security vulnerability appears in your
     *        code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePath withCodeSnippet(java.util.Collection<CodeLine> codeSnippet) {
        setCodeSnippet(codeSnippet);
        return this;
    }

    /**
     * <p>
     * The last line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     * 
     * @param endLine
     *        The last line number of the code snippet where the security vulnerability appears in your code.
     */

    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * <p>
     * The last line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     * 
     * @return The last line number of the code snippet where the security vulnerability appears in your code.
     */

    public Integer getEndLine() {
        return this.endLine;
    }

    /**
     * <p>
     * The last line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     * 
     * @param endLine
     *        The last line number of the code snippet where the security vulnerability appears in your code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePath withEndLine(Integer endLine) {
        setEndLine(endLine);
        return this;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     * 
     * @param name
     *        The name of the file.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     * 
     * @return The name of the file.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     * 
     * @param name
     *        The name of the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePath withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path to the resource with the security vulnerability.
     * </p>
     * 
     * @param path
     *        The path to the resource with the security vulnerability.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the resource with the security vulnerability.
     * </p>
     * 
     * @return The path to the resource with the security vulnerability.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the resource with the security vulnerability.
     * </p>
     * 
     * @param path
     *        The path to the resource with the security vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePath withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The first line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     * 
     * @param startLine
     *        The first line number of the code snippet where the security vulnerability appears in your code.
     */

    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * <p>
     * The first line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     * 
     * @return The first line number of the code snippet where the security vulnerability appears in your code.
     */

    public Integer getStartLine() {
        return this.startLine;
    }

    /**
     * <p>
     * The first line number of the code snippet where the security vulnerability appears in your code.
     * </p>
     * 
     * @param startLine
     *        The first line number of the code snippet where the security vulnerability appears in your code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilePath withStartLine(Integer startLine) {
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
        if (getCodeSnippet() != null)
            sb.append("CodeSnippet: ").append(getCodeSnippet()).append(",");
        if (getEndLine() != null)
            sb.append("EndLine: ").append(getEndLine()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
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

        if (obj instanceof FilePath == false)
            return false;
        FilePath other = (FilePath) obj;
        if (other.getCodeSnippet() == null ^ this.getCodeSnippet() == null)
            return false;
        if (other.getCodeSnippet() != null && other.getCodeSnippet().equals(this.getCodeSnippet()) == false)
            return false;
        if (other.getEndLine() == null ^ this.getEndLine() == null)
            return false;
        if (other.getEndLine() != null && other.getEndLine().equals(this.getEndLine()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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

        hashCode = prime * hashCode + ((getCodeSnippet() == null) ? 0 : getCodeSnippet().hashCode());
        hashCode = prime * hashCode + ((getEndLine() == null) ? 0 : getEndLine().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getStartLine() == null) ? 0 : getStartLine().hashCode());
        return hashCode;
    }

    @Override
    public FilePath clone() {
        try {
            return (FilePath) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurusecurity.model.transform.FilePathMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
