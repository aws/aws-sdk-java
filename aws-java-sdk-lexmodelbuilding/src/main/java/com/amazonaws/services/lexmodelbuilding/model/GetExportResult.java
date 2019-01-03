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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The type of the exported resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The format of the exported data.
     * </p>
     */
    private String exportType;
    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     */
    private String exportStatus;
    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export the
     * resource.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive
     * that contains the exported resource in JSON format. The structure of the archive may change. Your code should not
     * rely on the archive structure.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * 
     * @param name
     *        The name of the bot being exported.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * 
     * @return The name of the bot being exported.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bot being exported.
     * </p>
     * 
     * @param name
     *        The name of the bot being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * 
     * @param version
     *        The version of the bot being exported.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * 
     * @return The version of the bot being exported.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the bot being exported.
     * </p>
     * 
     * @param version
     *        The version of the bot being exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the exported resource.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * 
     * @return The type of the exported resource.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the exported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetExportResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of the exported resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the exported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public GetExportResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @param exportType
     *        The format of the exported data.
     * @see ExportType
     */

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @return The format of the exported data.
     * @see ExportType
     */

    public String getExportType() {
        return this.exportType;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @param exportType
     *        The format of the exported data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportType
     */

    public GetExportResult withExportType(String exportType) {
        setExportType(exportType);
        return this;
    }

    /**
     * <p>
     * The format of the exported data.
     * </p>
     * 
     * @param exportType
     *        The format of the exported data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportType
     */

    public GetExportResult withExportType(ExportType exportType) {
        this.exportType = exportType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportStatus
     *        The status of the export. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The export is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The export is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The export could not be completed.
     *        </p>
     *        </li>
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the export. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - The export is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>READY</code> - The export is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The export could not be completed.
     *         </p>
     *         </li>
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportStatus
     *        The status of the export. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The export is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The export is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The export could not be completed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public GetExportResult withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the export.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The export is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>READY</code> - The export is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The export could not be completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportStatus
     *        The status of the export. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The export is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>READY</code> - The export is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The export could not be completed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public GetExportResult withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export the
     * resource.
     * </p>
     * 
     * @param failureReason
     *        If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export the
     *        resource.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export the
     * resource.
     * </p>
     * 
     * @return If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export
     *         the resource.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export the
     * resource.
     * </p>
     * 
     * @param failureReason
     *        If <code>status</code> is <code>FAILED</code>, Amazon Lex provides the reason that it failed to export the
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive
     * that contains the exported resource in JSON format. The structure of the archive may change. Your code should not
     * rely on the archive structure.
     * </p>
     * 
     * @param url
     *        An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP
     *        archive that contains the exported resource in JSON format. The structure of the archive may change. Your
     *        code should not rely on the archive structure.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive
     * that contains the exported resource in JSON format. The structure of the archive may change. Your code should not
     * rely on the archive structure.
     * </p>
     * 
     * @return An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP
     *         archive that contains the exported resource in JSON format. The structure of the archive may change. Your
     *         code should not rely on the archive structure.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive
     * that contains the exported resource in JSON format. The structure of the archive may change. Your code should not
     * rely on the archive structure.
     * </p>
     * 
     * @param url
     *        An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP
     *        archive that contains the exported resource in JSON format. The structure of the archive may change. Your
     *        code should not rely on the archive structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportResult withUrl(String url) {
        setUrl(url);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getExportType() != null)
            sb.append("ExportType: ").append(getExportType()).append(",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportResult == false)
            return false;
        GetExportResult other = (GetExportResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getExportType() == null ^ this.getExportType() == null)
            return false;
        if (other.getExportType() != null && other.getExportType().equals(this.getExportType()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getExportType() == null) ? 0 : getExportType().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetExportResult clone() {
        try {
            return (GetExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
