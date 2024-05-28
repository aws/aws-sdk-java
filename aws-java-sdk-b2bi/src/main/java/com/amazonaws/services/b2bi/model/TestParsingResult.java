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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestParsing" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestParsingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the contents of the input file being tested, parsed according to the specified EDI (electronic data
     * interchange) type.
     * </p>
     */
    private String parsedFileContent;

    /**
     * <p>
     * Returns the contents of the input file being tested, parsed according to the specified EDI (electronic data
     * interchange) type.
     * </p>
     * 
     * @param parsedFileContent
     *        Returns the contents of the input file being tested, parsed according to the specified EDI (electronic
     *        data interchange) type.
     */

    public void setParsedFileContent(String parsedFileContent) {
        this.parsedFileContent = parsedFileContent;
    }

    /**
     * <p>
     * Returns the contents of the input file being tested, parsed according to the specified EDI (electronic data
     * interchange) type.
     * </p>
     * 
     * @return Returns the contents of the input file being tested, parsed according to the specified EDI (electronic
     *         data interchange) type.
     */

    public String getParsedFileContent() {
        return this.parsedFileContent;
    }

    /**
     * <p>
     * Returns the contents of the input file being tested, parsed according to the specified EDI (electronic data
     * interchange) type.
     * </p>
     * 
     * @param parsedFileContent
     *        Returns the contents of the input file being tested, parsed according to the specified EDI (electronic
     *        data interchange) type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestParsingResult withParsedFileContent(String parsedFileContent) {
        setParsedFileContent(parsedFileContent);
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
        if (getParsedFileContent() != null)
            sb.append("ParsedFileContent: ").append(getParsedFileContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestParsingResult == false)
            return false;
        TestParsingResult other = (TestParsingResult) obj;
        if (other.getParsedFileContent() == null ^ this.getParsedFileContent() == null)
            return false;
        if (other.getParsedFileContent() != null && other.getParsedFileContent().equals(this.getParsedFileContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParsedFileContent() == null) ? 0 : getParsedFileContent().hashCode());
        return hashCode;
    }

    @Override
    public TestParsingResult clone() {
        try {
            return (TestParsingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
