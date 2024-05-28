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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for the
     * transform.
     * </p>
     */
    private String inputFileContent;
    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     */
    private String mappingTemplate;
    /**
     * <p>
     * Specifies that the currently supported file formats for EDI transformations are <code>JSON</code> and
     * <code>XML</code>.
     * </p>
     */
    private String fileFormat;

    /**
     * <p>
     * Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for the
     * transform.
     * </p>
     * 
     * @param inputFileContent
     *        Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for
     *        the transform.
     */

    public void setInputFileContent(String inputFileContent) {
        this.inputFileContent = inputFileContent;
    }

    /**
     * <p>
     * Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for the
     * transform.
     * </p>
     * 
     * @return Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for
     *         the transform.
     */

    public String getInputFileContent() {
        return this.inputFileContent;
    }

    /**
     * <p>
     * Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for the
     * transform.
     * </p>
     * 
     * @param inputFileContent
     *        Specify the contents of the EDI (electronic data interchange) XML or JSON file that is used as input for
     *        the transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMappingRequest withInputFileContent(String inputFileContent) {
        setInputFileContent(inputFileContent);
        return this;
    }

    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     * 
     * @param mappingTemplate
     *        Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     *        JSONata or XSLT.
     */

    public void setMappingTemplate(String mappingTemplate) {
        this.mappingTemplate = mappingTemplate;
    }

    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     * 
     * @return Specifies the mapping template for the transformer. This template is used to map the parsed EDI file
     *         using JSONata or XSLT.
     */

    public String getMappingTemplate() {
        return this.mappingTemplate;
    }

    /**
     * <p>
     * Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     * JSONata or XSLT.
     * </p>
     * 
     * @param mappingTemplate
     *        Specifies the mapping template for the transformer. This template is used to map the parsed EDI file using
     *        JSONata or XSLT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMappingRequest withMappingTemplate(String mappingTemplate) {
        setMappingTemplate(mappingTemplate);
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

    public TestMappingRequest withFileFormat(String fileFormat) {
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

    public TestMappingRequest withFileFormat(FileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
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
        if (getInputFileContent() != null)
            sb.append("InputFileContent: ").append(getInputFileContent()).append(",");
        if (getMappingTemplate() != null)
            sb.append("MappingTemplate: ").append(getMappingTemplate()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestMappingRequest == false)
            return false;
        TestMappingRequest other = (TestMappingRequest) obj;
        if (other.getInputFileContent() == null ^ this.getInputFileContent() == null)
            return false;
        if (other.getInputFileContent() != null && other.getInputFileContent().equals(this.getInputFileContent()) == false)
            return false;
        if (other.getMappingTemplate() == null ^ this.getMappingTemplate() == null)
            return false;
        if (other.getMappingTemplate() != null && other.getMappingTemplate().equals(this.getMappingTemplate()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputFileContent() == null) ? 0 : getInputFileContent().hashCode());
        hashCode = prime * hashCode + ((getMappingTemplate() == null) ? 0 : getMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        return hashCode;
    }

    @Override
    public TestMappingRequest clone() {
        return (TestMappingRequest) super.clone();
    }

}
