/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/UpdateExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier Amazon Lex assigned to the export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The new password to use to encrypt the export zip archive.
     * </p>
     */
    private String filePassword;

    /**
     * <p>
     * The unique identifier Amazon Lex assigned to the export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier Amazon Lex assigned to the export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique identifier Amazon Lex assigned to the export.
     * </p>
     * 
     * @return The unique identifier Amazon Lex assigned to the export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique identifier Amazon Lex assigned to the export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier Amazon Lex assigned to the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExportRequest withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The new password to use to encrypt the export zip archive.
     * </p>
     * 
     * @param filePassword
     *        The new password to use to encrypt the export zip archive.
     */

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    /**
     * <p>
     * The new password to use to encrypt the export zip archive.
     * </p>
     * 
     * @return The new password to use to encrypt the export zip archive.
     */

    public String getFilePassword() {
        return this.filePassword;
    }

    /**
     * <p>
     * The new password to use to encrypt the export zip archive.
     * </p>
     * 
     * @param filePassword
     *        The new password to use to encrypt the export zip archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExportRequest withFilePassword(String filePassword) {
        setFilePassword(filePassword);
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
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId()).append(",");
        if (getFilePassword() != null)
            sb.append("FilePassword: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExportRequest == false)
            return false;
        UpdateExportRequest other = (UpdateExportRequest) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getFilePassword() == null ^ this.getFilePassword() == null)
            return false;
        if (other.getFilePassword() != null && other.getFilePassword().equals(this.getFilePassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getFilePassword() == null) ? 0 : getFilePassword().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExportRequest clone() {
        return (UpdateExportRequest) super.clone();
    }

}
