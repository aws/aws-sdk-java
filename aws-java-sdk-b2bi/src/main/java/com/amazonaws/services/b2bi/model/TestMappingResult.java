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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/TestMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestMappingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     * </p>
     */
    private String mappedFileContent;

    /**
     * <p>
     * Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     * </p>
     * 
     * @param mappedFileContent
     *        Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     */

    public void setMappedFileContent(String mappedFileContent) {
        this.mappedFileContent = mappedFileContent;
    }

    /**
     * <p>
     * Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     * </p>
     * 
     * @return Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     */

    public String getMappedFileContent() {
        return this.mappedFileContent;
    }

    /**
     * <p>
     * Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     * </p>
     * 
     * @param mappedFileContent
     *        Returns a string for the mapping that can be used to identify the mapping. Similar to a fingerprint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestMappingResult withMappedFileContent(String mappedFileContent) {
        setMappedFileContent(mappedFileContent);
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
        if (getMappedFileContent() != null)
            sb.append("MappedFileContent: ").append(getMappedFileContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestMappingResult == false)
            return false;
        TestMappingResult other = (TestMappingResult) obj;
        if (other.getMappedFileContent() == null ^ this.getMappedFileContent() == null)
            return false;
        if (other.getMappedFileContent() != null && other.getMappedFileContent().equals(this.getMappedFileContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMappedFileContent() == null) ? 0 : getMappedFileContent().hashCode());
        return hashCode;
    }

    @Override
    public TestMappingResult clone() {
        try {
            return (TestMappingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
