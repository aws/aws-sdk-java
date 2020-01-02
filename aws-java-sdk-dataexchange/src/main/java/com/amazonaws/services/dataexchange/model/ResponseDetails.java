/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for the response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ResponseDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for the export to signed URL response.
     * </p>
     */
    private ExportAssetToSignedUrlResponseDetails exportAssetToSignedUrl;
    /**
     * <p>
     * Details for the export to Amazon S3 response.
     * </p>
     */
    private ExportAssetsToS3ResponseDetails exportAssetsToS3;
    /**
     * <p>
     * Details for the import from signed URL response.
     * </p>
     */
    private ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrl;
    /**
     * <p>
     * Details for the import from Amazon S3 response.
     * </p>
     */
    private ImportAssetsFromS3ResponseDetails importAssetsFromS3;

    /**
     * <p>
     * Details for the export to signed URL response.
     * </p>
     * 
     * @param exportAssetToSignedUrl
     *        Details for the export to signed URL response.
     */

    public void setExportAssetToSignedUrl(ExportAssetToSignedUrlResponseDetails exportAssetToSignedUrl) {
        this.exportAssetToSignedUrl = exportAssetToSignedUrl;
    }

    /**
     * <p>
     * Details for the export to signed URL response.
     * </p>
     * 
     * @return Details for the export to signed URL response.
     */

    public ExportAssetToSignedUrlResponseDetails getExportAssetToSignedUrl() {
        return this.exportAssetToSignedUrl;
    }

    /**
     * <p>
     * Details for the export to signed URL response.
     * </p>
     * 
     * @param exportAssetToSignedUrl
     *        Details for the export to signed URL response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseDetails withExportAssetToSignedUrl(ExportAssetToSignedUrlResponseDetails exportAssetToSignedUrl) {
        setExportAssetToSignedUrl(exportAssetToSignedUrl);
        return this;
    }

    /**
     * <p>
     * Details for the export to Amazon S3 response.
     * </p>
     * 
     * @param exportAssetsToS3
     *        Details for the export to Amazon S3 response.
     */

    public void setExportAssetsToS3(ExportAssetsToS3ResponseDetails exportAssetsToS3) {
        this.exportAssetsToS3 = exportAssetsToS3;
    }

    /**
     * <p>
     * Details for the export to Amazon S3 response.
     * </p>
     * 
     * @return Details for the export to Amazon S3 response.
     */

    public ExportAssetsToS3ResponseDetails getExportAssetsToS3() {
        return this.exportAssetsToS3;
    }

    /**
     * <p>
     * Details for the export to Amazon S3 response.
     * </p>
     * 
     * @param exportAssetsToS3
     *        Details for the export to Amazon S3 response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseDetails withExportAssetsToS3(ExportAssetsToS3ResponseDetails exportAssetsToS3) {
        setExportAssetsToS3(exportAssetsToS3);
        return this;
    }

    /**
     * <p>
     * Details for the import from signed URL response.
     * </p>
     * 
     * @param importAssetFromSignedUrl
     *        Details for the import from signed URL response.
     */

    public void setImportAssetFromSignedUrl(ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrl) {
        this.importAssetFromSignedUrl = importAssetFromSignedUrl;
    }

    /**
     * <p>
     * Details for the import from signed URL response.
     * </p>
     * 
     * @return Details for the import from signed URL response.
     */

    public ImportAssetFromSignedUrlResponseDetails getImportAssetFromSignedUrl() {
        return this.importAssetFromSignedUrl;
    }

    /**
     * <p>
     * Details for the import from signed URL response.
     * </p>
     * 
     * @param importAssetFromSignedUrl
     *        Details for the import from signed URL response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseDetails withImportAssetFromSignedUrl(ImportAssetFromSignedUrlResponseDetails importAssetFromSignedUrl) {
        setImportAssetFromSignedUrl(importAssetFromSignedUrl);
        return this;
    }

    /**
     * <p>
     * Details for the import from Amazon S3 response.
     * </p>
     * 
     * @param importAssetsFromS3
     *        Details for the import from Amazon S3 response.
     */

    public void setImportAssetsFromS3(ImportAssetsFromS3ResponseDetails importAssetsFromS3) {
        this.importAssetsFromS3 = importAssetsFromS3;
    }

    /**
     * <p>
     * Details for the import from Amazon S3 response.
     * </p>
     * 
     * @return Details for the import from Amazon S3 response.
     */

    public ImportAssetsFromS3ResponseDetails getImportAssetsFromS3() {
        return this.importAssetsFromS3;
    }

    /**
     * <p>
     * Details for the import from Amazon S3 response.
     * </p>
     * 
     * @param importAssetsFromS3
     *        Details for the import from Amazon S3 response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseDetails withImportAssetsFromS3(ImportAssetsFromS3ResponseDetails importAssetsFromS3) {
        setImportAssetsFromS3(importAssetsFromS3);
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
        if (getExportAssetToSignedUrl() != null)
            sb.append("ExportAssetToSignedUrl: ").append(getExportAssetToSignedUrl()).append(",");
        if (getExportAssetsToS3() != null)
            sb.append("ExportAssetsToS3: ").append(getExportAssetsToS3()).append(",");
        if (getImportAssetFromSignedUrl() != null)
            sb.append("ImportAssetFromSignedUrl: ").append(getImportAssetFromSignedUrl()).append(",");
        if (getImportAssetsFromS3() != null)
            sb.append("ImportAssetsFromS3: ").append(getImportAssetsFromS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseDetails == false)
            return false;
        ResponseDetails other = (ResponseDetails) obj;
        if (other.getExportAssetToSignedUrl() == null ^ this.getExportAssetToSignedUrl() == null)
            return false;
        if (other.getExportAssetToSignedUrl() != null && other.getExportAssetToSignedUrl().equals(this.getExportAssetToSignedUrl()) == false)
            return false;
        if (other.getExportAssetsToS3() == null ^ this.getExportAssetsToS3() == null)
            return false;
        if (other.getExportAssetsToS3() != null && other.getExportAssetsToS3().equals(this.getExportAssetsToS3()) == false)
            return false;
        if (other.getImportAssetFromSignedUrl() == null ^ this.getImportAssetFromSignedUrl() == null)
            return false;
        if (other.getImportAssetFromSignedUrl() != null && other.getImportAssetFromSignedUrl().equals(this.getImportAssetFromSignedUrl()) == false)
            return false;
        if (other.getImportAssetsFromS3() == null ^ this.getImportAssetsFromS3() == null)
            return false;
        if (other.getImportAssetsFromS3() != null && other.getImportAssetsFromS3().equals(this.getImportAssetsFromS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportAssetToSignedUrl() == null) ? 0 : getExportAssetToSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getExportAssetsToS3() == null) ? 0 : getExportAssetsToS3().hashCode());
        hashCode = prime * hashCode + ((getImportAssetFromSignedUrl() == null) ? 0 : getImportAssetFromSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getImportAssetsFromS3() == null) ? 0 : getImportAssetsFromS3().hashCode());
        return hashCode;
    }

    @Override
    public ResponseDetails clone() {
        try {
            return (ResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ResponseDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
