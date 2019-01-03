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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes details about the application code for a Java-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CodeContentDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeContentDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text-format code
     * </p>
     */
    private String textContent;
    /**
     * <p>
     * The checksum that can be used to validate zip-format code.
     * </p>
     */
    private String codeMD5;
    /**
     * <p>
     * The size in bytes of the application code. Can be used to validate zip-format code.
     * </p>
     */
    private Long codeSize;
    /**
     * <p>
     * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon
     * S3.
     * </p>
     */
    private S3ApplicationCodeLocationDescription s3ApplicationCodeLocationDescription;

    /**
     * <p>
     * The text-format code
     * </p>
     * 
     * @param textContent
     *        The text-format code
     */

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    /**
     * <p>
     * The text-format code
     * </p>
     * 
     * @return The text-format code
     */

    public String getTextContent() {
        return this.textContent;
    }

    /**
     * <p>
     * The text-format code
     * </p>
     * 
     * @param textContent
     *        The text-format code
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentDescription withTextContent(String textContent) {
        setTextContent(textContent);
        return this;
    }

    /**
     * <p>
     * The checksum that can be used to validate zip-format code.
     * </p>
     * 
     * @param codeMD5
     *        The checksum that can be used to validate zip-format code.
     */

    public void setCodeMD5(String codeMD5) {
        this.codeMD5 = codeMD5;
    }

    /**
     * <p>
     * The checksum that can be used to validate zip-format code.
     * </p>
     * 
     * @return The checksum that can be used to validate zip-format code.
     */

    public String getCodeMD5() {
        return this.codeMD5;
    }

    /**
     * <p>
     * The checksum that can be used to validate zip-format code.
     * </p>
     * 
     * @param codeMD5
     *        The checksum that can be used to validate zip-format code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentDescription withCodeMD5(String codeMD5) {
        setCodeMD5(codeMD5);
        return this;
    }

    /**
     * <p>
     * The size in bytes of the application code. Can be used to validate zip-format code.
     * </p>
     * 
     * @param codeSize
     *        The size in bytes of the application code. Can be used to validate zip-format code.
     */

    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }

    /**
     * <p>
     * The size in bytes of the application code. Can be used to validate zip-format code.
     * </p>
     * 
     * @return The size in bytes of the application code. Can be used to validate zip-format code.
     */

    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * <p>
     * The size in bytes of the application code. Can be used to validate zip-format code.
     * </p>
     * 
     * @param codeSize
     *        The size in bytes of the application code. Can be used to validate zip-format code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentDescription withCodeSize(Long codeSize) {
        setCodeSize(codeSize);
        return this;
    }

    /**
     * <p>
     * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon
     * S3.
     * </p>
     * 
     * @param s3ApplicationCodeLocationDescription
     *        The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in
     *        Amazon S3.
     */

    public void setS3ApplicationCodeLocationDescription(S3ApplicationCodeLocationDescription s3ApplicationCodeLocationDescription) {
        this.s3ApplicationCodeLocationDescription = s3ApplicationCodeLocationDescription;
    }

    /**
     * <p>
     * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon
     * S3.
     * </p>
     * 
     * @return The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in
     *         Amazon S3.
     */

    public S3ApplicationCodeLocationDescription getS3ApplicationCodeLocationDescription() {
        return this.s3ApplicationCodeLocationDescription;
    }

    /**
     * <p>
     * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon
     * S3.
     * </p>
     * 
     * @param s3ApplicationCodeLocationDescription
     *        The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in
     *        Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeContentDescription withS3ApplicationCodeLocationDescription(S3ApplicationCodeLocationDescription s3ApplicationCodeLocationDescription) {
        setS3ApplicationCodeLocationDescription(s3ApplicationCodeLocationDescription);
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
        if (getTextContent() != null)
            sb.append("TextContent: ").append(getTextContent()).append(",");
        if (getCodeMD5() != null)
            sb.append("CodeMD5: ").append(getCodeMD5()).append(",");
        if (getCodeSize() != null)
            sb.append("CodeSize: ").append(getCodeSize()).append(",");
        if (getS3ApplicationCodeLocationDescription() != null)
            sb.append("S3ApplicationCodeLocationDescription: ").append(getS3ApplicationCodeLocationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeContentDescription == false)
            return false;
        CodeContentDescription other = (CodeContentDescription) obj;
        if (other.getTextContent() == null ^ this.getTextContent() == null)
            return false;
        if (other.getTextContent() != null && other.getTextContent().equals(this.getTextContent()) == false)
            return false;
        if (other.getCodeMD5() == null ^ this.getCodeMD5() == null)
            return false;
        if (other.getCodeMD5() != null && other.getCodeMD5().equals(this.getCodeMD5()) == false)
            return false;
        if (other.getCodeSize() == null ^ this.getCodeSize() == null)
            return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false)
            return false;
        if (other.getS3ApplicationCodeLocationDescription() == null ^ this.getS3ApplicationCodeLocationDescription() == null)
            return false;
        if (other.getS3ApplicationCodeLocationDescription() != null
                && other.getS3ApplicationCodeLocationDescription().equals(this.getS3ApplicationCodeLocationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextContent() == null) ? 0 : getTextContent().hashCode());
        hashCode = prime * hashCode + ((getCodeMD5() == null) ? 0 : getCodeMD5().hashCode());
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode());
        hashCode = prime * hashCode + ((getS3ApplicationCodeLocationDescription() == null) ? 0 : getS3ApplicationCodeLocationDescription().hashCode());
        return hashCode;
    }

    @Override
    public CodeContentDescription clone() {
        try {
            return (CodeContentDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.CodeContentDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
