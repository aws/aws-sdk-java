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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of resource
     * to export.
     * </p>
     */
    private ExportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The file format of the bot or bot locale definition files.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt the
     * archive to protect the data in transit between Amazon Lex and your local computer.
     * </p>
     */
    private String filePassword;

    /**
     * <p>
     * Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of resource
     * to export.
     * </p>
     * 
     * @param resourceSpecification
     *        Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of
     *        resource to export.
     */

    public void setResourceSpecification(ExportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of resource
     * to export.
     * </p>
     * 
     * @return Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of
     *         resource to export.
     */

    public ExportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of resource
     * to export.
     * </p>
     * 
     * @param resourceSpecification
     *        Specifies the type of resource to export, either a bot or a bot locale. You can only specify one type of
     *        resource to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportRequest withResourceSpecification(ExportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * <p>
     * The file format of the bot or bot locale definition files.
     * </p>
     * 
     * @param fileFormat
     *        The file format of the bot or bot locale definition files.
     * @see ImportExportFileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The file format of the bot or bot locale definition files.
     * </p>
     * 
     * @return The file format of the bot or bot locale definition files.
     * @see ImportExportFileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The file format of the bot or bot locale definition files.
     * </p>
     * 
     * @param fileFormat
     *        The file format of the bot or bot locale definition files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public CreateExportRequest withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The file format of the bot or bot locale definition files.
     * </p>
     * 
     * @param fileFormat
     *        The file format of the bot or bot locale definition files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public CreateExportRequest withFileFormat(ImportExportFileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt the
     * archive to protect the data in transit between Amazon Lex and your local computer.
     * </p>
     * 
     * @param filePassword
     *        An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt
     *        the archive to protect the data in transit between Amazon Lex and your local computer.
     */

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword;
    }

    /**
     * <p>
     * An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt the
     * archive to protect the data in transit between Amazon Lex and your local computer.
     * </p>
     * 
     * @return An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt
     *         the archive to protect the data in transit between Amazon Lex and your local computer.
     */

    public String getFilePassword() {
        return this.filePassword;
    }

    /**
     * <p>
     * An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt the
     * archive to protect the data in transit between Amazon Lex and your local computer.
     * </p>
     * 
     * @param filePassword
     *        An password to use to encrypt the exported archive. Using a password is optional, but you should encrypt
     *        the archive to protect the data in transit between Amazon Lex and your local computer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportRequest withFilePassword(String filePassword) {
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
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
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

        if (obj instanceof CreateExportRequest == false)
            return false;
        CreateExportRequest other = (CreateExportRequest) obj;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
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

        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getFilePassword() == null) ? 0 : getFilePassword().hashCode());
        return hashCode;
    }

    @Override
    public CreateExportRequest clone() {
        return (CreateExportRequest) super.clone();
    }

}
