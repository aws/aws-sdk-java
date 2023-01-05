/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DocumentType {

    NATIVE_PDF("NATIVE_PDF"),
    SCANNED_PDF("SCANNED_PDF"),
    MS_WORD("MS_WORD"),
    IMAGE("IMAGE"),
    PLAIN_TEXT("PLAIN_TEXT"),
    TEXTRACT_DETECT_DOCUMENT_TEXT_JSON("TEXTRACT_DETECT_DOCUMENT_TEXT_JSON"),
    TEXTRACT_ANALYZE_DOCUMENT_JSON("TEXTRACT_ANALYZE_DOCUMENT_JSON");

    private String value;

    private DocumentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DocumentType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DocumentType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DocumentType enumEntry : DocumentType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
