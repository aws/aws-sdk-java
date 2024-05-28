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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestParsing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestParsingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the location of
     * the input file.
     * </p>
     */
    private S3Location inputFile;
    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     */
    private EdiType ediType;

    /**
     * <p>
     * Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the location of
     * the input file.
     * </p>
     * 
     * @param inputFile
     *        Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the
     *        location of the input file.
     */

    public void setInputFile(S3Location inputFile) {
        this.inputFile = inputFile;
    }

    /**
     * <p>
     * Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the location of
     * the input file.
     * </p>
     * 
     * @return Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the
     *         location of the input file.
     */

    public S3Location getInputFile() {
        return this.inputFile;
    }

    /**
     * <p>
     * Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the location of
     * the input file.
     * </p>
     * 
     * @param inputFile
     *        Specifies an <code>S3Location</code> object, which contains the Amazon S3 bucket and prefix for the
     *        location of the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestParsingRequest withInputFile(S3Location inputFile) {
        setInputFile(inputFile);
        return this;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @see FileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @return Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *         <code>XML</code>.
     * @see FileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public TestParsingRequest withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     * 
     * @param fileFormat
     *        Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     *        <code>XML</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileFormat
     */

    public TestParsingRequest withFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param ediType
     *        Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public void setEdiType(EdiType ediType) {
        this.ediType = ediType;
    }

    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @return Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *         supported. X12 is a set of standards and corresponding messages that define specific business documents.
     */

    public EdiType getEdiType() {
        return this.ediType;
    }

    /**
     * <p>
     * Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     * supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * </p>
     * 
     * @param ediType
     *        Specifies the details for the EDI standard that is being used for the transformer. Currently, only X12 is
     *        supported. X12 is a set of standards and corresponding messages that define specific business documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestParsingRequest withEdiType(EdiType ediType) {
        setEdiType(ediType);
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
        if (getInputFile() != null)
            sb.append("InputFile: ").append(getInputFile()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getEdiType() != null)
            sb.append("EdiType: ").append(getEdiType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestParsingRequest == false)
            return false;
        TestParsingRequest other = (TestParsingRequest) obj;
        if (other.getInputFile() == null ^ this.getInputFile() == null)
            return false;
        if (other.getInputFile() != null && other.getInputFile().equals(this.getInputFile()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        if (other.getEdiType() == null ^ this.getEdiType() == null)
            return false;
        if (other.getEdiType() != null && other.getEdiType().equals(this.getEdiType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputFile() == null) ? 0 : getInputFile().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getEdiType() == null) ? 0 : getEdiType().hashCode());
        return hashCode;
    }

    @Override
    public TestParsingRequest clone() {
        return (TestParsingRequest) super.clone();
    }

}
