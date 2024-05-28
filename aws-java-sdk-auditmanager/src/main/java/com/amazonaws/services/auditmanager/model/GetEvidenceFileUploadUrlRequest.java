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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidenceFileUploadUrl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceFileUploadUrlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The file that you want to upload. For a list of supported file formats, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     */
    private String fileName;

    /**
     * <p>
     * The file that you want to upload. For a list of supported file formats, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     * 
     * @param fileName
     *        The file that you want to upload. For a list of supported file formats, see <a href=
     *        "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     *        >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The file that you want to upload. For a list of supported file formats, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     * 
     * @return The file that you want to upload. For a list of supported file formats, see <a href=
     *         "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     *         >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The file that you want to upload. For a list of supported file formats, see <a href=
     * "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     * >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     * </p>
     * 
     * @param fileName
     *        The file that you want to upload. For a list of supported file formats, see <a href=
     *        "https://docs.aws.amazon.com/audit-manager/latest/userguide/upload-evidence.html#supported-manual-evidence-files"
     *        >Supported file types for manual evidence</a> in the <i>Audit Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceFileUploadUrlRequest withFileName(String fileName) {
        setFileName(fileName);
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
        if (getFileName() != null)
            sb.append("FileName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvidenceFileUploadUrlRequest == false)
            return false;
        GetEvidenceFileUploadUrlRequest other = (GetEvidenceFileUploadUrlRequest) obj;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceFileUploadUrlRequest clone() {
        return (GetEvidenceFileUploadUrlRequest) super.clone();
    }

}
