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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/RequestDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     */
    private ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl;
    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     */
    private ExportAssetsToS3RequestDetails exportAssetsToS3;
    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     */
    private ExportRevisionsToS3RequestDetails exportRevisionsToS3;
    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     */
    private ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl;
    /**
     * <p>
     * Details about the import asset from API Gateway API request.
     * </p>
     */
    private ImportAssetsFromS3RequestDetails importAssetsFromS3;
    /**
     * <p>
     * Details from an import from Amazon Redshift datashare request.
     * </p>
     */
    private ImportAssetsFromRedshiftDataSharesRequestDetails importAssetsFromRedshiftDataShares;
    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     */
    private ImportAssetFromApiGatewayApiRequestDetails importAssetFromApiGatewayApi;
    /**
     * <p>
     * Details of the request to create S3 data access from the Amazon S3 bucket.
     * </p>
     */
    private CreateS3DataAccessFromS3BucketRequestDetails createS3DataAccessFromS3Bucket;
    /**
     * <p>
     * Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     * </p>
     */
    private ImportAssetsFromLakeFormationTagPolicyRequestDetails importAssetsFromLakeFormationTagPolicy;

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     * 
     * @param exportAssetToSignedUrl
     *        Details about the export to signed URL request.
     */

    public void setExportAssetToSignedUrl(ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl) {
        this.exportAssetToSignedUrl = exportAssetToSignedUrl;
    }

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     * 
     * @return Details about the export to signed URL request.
     */

    public ExportAssetToSignedUrlRequestDetails getExportAssetToSignedUrl() {
        return this.exportAssetToSignedUrl;
    }

    /**
     * <p>
     * Details about the export to signed URL request.
     * </p>
     * 
     * @param exportAssetToSignedUrl
     *        Details about the export to signed URL request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withExportAssetToSignedUrl(ExportAssetToSignedUrlRequestDetails exportAssetToSignedUrl) {
        setExportAssetToSignedUrl(exportAssetToSignedUrl);
        return this;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * 
     * @param exportAssetsToS3
     *        Details about the export to Amazon S3 request.
     */

    public void setExportAssetsToS3(ExportAssetsToS3RequestDetails exportAssetsToS3) {
        this.exportAssetsToS3 = exportAssetsToS3;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * 
     * @return Details about the export to Amazon S3 request.
     */

    public ExportAssetsToS3RequestDetails getExportAssetsToS3() {
        return this.exportAssetsToS3;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * 
     * @param exportAssetsToS3
     *        Details about the export to Amazon S3 request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withExportAssetsToS3(ExportAssetsToS3RequestDetails exportAssetsToS3) {
        setExportAssetsToS3(exportAssetsToS3);
        return this;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * 
     * @param exportRevisionsToS3
     *        Details about the export to Amazon S3 request.
     */

    public void setExportRevisionsToS3(ExportRevisionsToS3RequestDetails exportRevisionsToS3) {
        this.exportRevisionsToS3 = exportRevisionsToS3;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * 
     * @return Details about the export to Amazon S3 request.
     */

    public ExportRevisionsToS3RequestDetails getExportRevisionsToS3() {
        return this.exportRevisionsToS3;
    }

    /**
     * <p>
     * Details about the export to Amazon S3 request.
     * </p>
     * 
     * @param exportRevisionsToS3
     *        Details about the export to Amazon S3 request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withExportRevisionsToS3(ExportRevisionsToS3RequestDetails exportRevisionsToS3) {
        setExportRevisionsToS3(exportRevisionsToS3);
        return this;
    }

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     * 
     * @param importAssetFromSignedUrl
     *        Details about the import from Amazon S3 request.
     */

    public void setImportAssetFromSignedUrl(ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl) {
        this.importAssetFromSignedUrl = importAssetFromSignedUrl;
    }

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     * 
     * @return Details about the import from Amazon S3 request.
     */

    public ImportAssetFromSignedUrlRequestDetails getImportAssetFromSignedUrl() {
        return this.importAssetFromSignedUrl;
    }

    /**
     * <p>
     * Details about the import from Amazon S3 request.
     * </p>
     * 
     * @param importAssetFromSignedUrl
     *        Details about the import from Amazon S3 request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withImportAssetFromSignedUrl(ImportAssetFromSignedUrlRequestDetails importAssetFromSignedUrl) {
        setImportAssetFromSignedUrl(importAssetFromSignedUrl);
        return this;
    }

    /**
     * <p>
     * Details about the import asset from API Gateway API request.
     * </p>
     * 
     * @param importAssetsFromS3
     *        Details about the import asset from API Gateway API request.
     */

    public void setImportAssetsFromS3(ImportAssetsFromS3RequestDetails importAssetsFromS3) {
        this.importAssetsFromS3 = importAssetsFromS3;
    }

    /**
     * <p>
     * Details about the import asset from API Gateway API request.
     * </p>
     * 
     * @return Details about the import asset from API Gateway API request.
     */

    public ImportAssetsFromS3RequestDetails getImportAssetsFromS3() {
        return this.importAssetsFromS3;
    }

    /**
     * <p>
     * Details about the import asset from API Gateway API request.
     * </p>
     * 
     * @param importAssetsFromS3
     *        Details about the import asset from API Gateway API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withImportAssetsFromS3(ImportAssetsFromS3RequestDetails importAssetsFromS3) {
        setImportAssetsFromS3(importAssetsFromS3);
        return this;
    }

    /**
     * <p>
     * Details from an import from Amazon Redshift datashare request.
     * </p>
     * 
     * @param importAssetsFromRedshiftDataShares
     *        Details from an import from Amazon Redshift datashare request.
     */

    public void setImportAssetsFromRedshiftDataShares(ImportAssetsFromRedshiftDataSharesRequestDetails importAssetsFromRedshiftDataShares) {
        this.importAssetsFromRedshiftDataShares = importAssetsFromRedshiftDataShares;
    }

    /**
     * <p>
     * Details from an import from Amazon Redshift datashare request.
     * </p>
     * 
     * @return Details from an import from Amazon Redshift datashare request.
     */

    public ImportAssetsFromRedshiftDataSharesRequestDetails getImportAssetsFromRedshiftDataShares() {
        return this.importAssetsFromRedshiftDataShares;
    }

    /**
     * <p>
     * Details from an import from Amazon Redshift datashare request.
     * </p>
     * 
     * @param importAssetsFromRedshiftDataShares
     *        Details from an import from Amazon Redshift datashare request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withImportAssetsFromRedshiftDataShares(ImportAssetsFromRedshiftDataSharesRequestDetails importAssetsFromRedshiftDataShares) {
        setImportAssetsFromRedshiftDataShares(importAssetsFromRedshiftDataShares);
        return this;
    }

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     * 
     * @param importAssetFromApiGatewayApi
     *        Details about the import from signed URL request.
     */

    public void setImportAssetFromApiGatewayApi(ImportAssetFromApiGatewayApiRequestDetails importAssetFromApiGatewayApi) {
        this.importAssetFromApiGatewayApi = importAssetFromApiGatewayApi;
    }

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     * 
     * @return Details about the import from signed URL request.
     */

    public ImportAssetFromApiGatewayApiRequestDetails getImportAssetFromApiGatewayApi() {
        return this.importAssetFromApiGatewayApi;
    }

    /**
     * <p>
     * Details about the import from signed URL request.
     * </p>
     * 
     * @param importAssetFromApiGatewayApi
     *        Details about the import from signed URL request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withImportAssetFromApiGatewayApi(ImportAssetFromApiGatewayApiRequestDetails importAssetFromApiGatewayApi) {
        setImportAssetFromApiGatewayApi(importAssetFromApiGatewayApi);
        return this;
    }

    /**
     * <p>
     * Details of the request to create S3 data access from the Amazon S3 bucket.
     * </p>
     * 
     * @param createS3DataAccessFromS3Bucket
     *        Details of the request to create S3 data access from the Amazon S3 bucket.
     */

    public void setCreateS3DataAccessFromS3Bucket(CreateS3DataAccessFromS3BucketRequestDetails createS3DataAccessFromS3Bucket) {
        this.createS3DataAccessFromS3Bucket = createS3DataAccessFromS3Bucket;
    }

    /**
     * <p>
     * Details of the request to create S3 data access from the Amazon S3 bucket.
     * </p>
     * 
     * @return Details of the request to create S3 data access from the Amazon S3 bucket.
     */

    public CreateS3DataAccessFromS3BucketRequestDetails getCreateS3DataAccessFromS3Bucket() {
        return this.createS3DataAccessFromS3Bucket;
    }

    /**
     * <p>
     * Details of the request to create S3 data access from the Amazon S3 bucket.
     * </p>
     * 
     * @param createS3DataAccessFromS3Bucket
     *        Details of the request to create S3 data access from the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withCreateS3DataAccessFromS3Bucket(CreateS3DataAccessFromS3BucketRequestDetails createS3DataAccessFromS3Bucket) {
        setCreateS3DataAccessFromS3Bucket(createS3DataAccessFromS3Bucket);
        return this;
    }

    /**
     * <p>
     * Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     * </p>
     * 
     * @param importAssetsFromLakeFormationTagPolicy
     *        Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     */

    public void setImportAssetsFromLakeFormationTagPolicy(ImportAssetsFromLakeFormationTagPolicyRequestDetails importAssetsFromLakeFormationTagPolicy) {
        this.importAssetsFromLakeFormationTagPolicy = importAssetsFromLakeFormationTagPolicy;
    }

    /**
     * <p>
     * Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     * </p>
     * 
     * @return Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     */

    public ImportAssetsFromLakeFormationTagPolicyRequestDetails getImportAssetsFromLakeFormationTagPolicy() {
        return this.importAssetsFromLakeFormationTagPolicy;
    }

    /**
     * <p>
     * Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     * </p>
     * 
     * @param importAssetsFromLakeFormationTagPolicy
     *        Request details for the ImportAssetsFromLakeFormationTagPolicy job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestDetails withImportAssetsFromLakeFormationTagPolicy(ImportAssetsFromLakeFormationTagPolicyRequestDetails importAssetsFromLakeFormationTagPolicy) {
        setImportAssetsFromLakeFormationTagPolicy(importAssetsFromLakeFormationTagPolicy);
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
        if (getExportRevisionsToS3() != null)
            sb.append("ExportRevisionsToS3: ").append(getExportRevisionsToS3()).append(",");
        if (getImportAssetFromSignedUrl() != null)
            sb.append("ImportAssetFromSignedUrl: ").append(getImportAssetFromSignedUrl()).append(",");
        if (getImportAssetsFromS3() != null)
            sb.append("ImportAssetsFromS3: ").append(getImportAssetsFromS3()).append(",");
        if (getImportAssetsFromRedshiftDataShares() != null)
            sb.append("ImportAssetsFromRedshiftDataShares: ").append(getImportAssetsFromRedshiftDataShares()).append(",");
        if (getImportAssetFromApiGatewayApi() != null)
            sb.append("ImportAssetFromApiGatewayApi: ").append(getImportAssetFromApiGatewayApi()).append(",");
        if (getCreateS3DataAccessFromS3Bucket() != null)
            sb.append("CreateS3DataAccessFromS3Bucket: ").append(getCreateS3DataAccessFromS3Bucket()).append(",");
        if (getImportAssetsFromLakeFormationTagPolicy() != null)
            sb.append("ImportAssetsFromLakeFormationTagPolicy: ").append(getImportAssetsFromLakeFormationTagPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestDetails == false)
            return false;
        RequestDetails other = (RequestDetails) obj;
        if (other.getExportAssetToSignedUrl() == null ^ this.getExportAssetToSignedUrl() == null)
            return false;
        if (other.getExportAssetToSignedUrl() != null && other.getExportAssetToSignedUrl().equals(this.getExportAssetToSignedUrl()) == false)
            return false;
        if (other.getExportAssetsToS3() == null ^ this.getExportAssetsToS3() == null)
            return false;
        if (other.getExportAssetsToS3() != null && other.getExportAssetsToS3().equals(this.getExportAssetsToS3()) == false)
            return false;
        if (other.getExportRevisionsToS3() == null ^ this.getExportRevisionsToS3() == null)
            return false;
        if (other.getExportRevisionsToS3() != null && other.getExportRevisionsToS3().equals(this.getExportRevisionsToS3()) == false)
            return false;
        if (other.getImportAssetFromSignedUrl() == null ^ this.getImportAssetFromSignedUrl() == null)
            return false;
        if (other.getImportAssetFromSignedUrl() != null && other.getImportAssetFromSignedUrl().equals(this.getImportAssetFromSignedUrl()) == false)
            return false;
        if (other.getImportAssetsFromS3() == null ^ this.getImportAssetsFromS3() == null)
            return false;
        if (other.getImportAssetsFromS3() != null && other.getImportAssetsFromS3().equals(this.getImportAssetsFromS3()) == false)
            return false;
        if (other.getImportAssetsFromRedshiftDataShares() == null ^ this.getImportAssetsFromRedshiftDataShares() == null)
            return false;
        if (other.getImportAssetsFromRedshiftDataShares() != null
                && other.getImportAssetsFromRedshiftDataShares().equals(this.getImportAssetsFromRedshiftDataShares()) == false)
            return false;
        if (other.getImportAssetFromApiGatewayApi() == null ^ this.getImportAssetFromApiGatewayApi() == null)
            return false;
        if (other.getImportAssetFromApiGatewayApi() != null && other.getImportAssetFromApiGatewayApi().equals(this.getImportAssetFromApiGatewayApi()) == false)
            return false;
        if (other.getCreateS3DataAccessFromS3Bucket() == null ^ this.getCreateS3DataAccessFromS3Bucket() == null)
            return false;
        if (other.getCreateS3DataAccessFromS3Bucket() != null
                && other.getCreateS3DataAccessFromS3Bucket().equals(this.getCreateS3DataAccessFromS3Bucket()) == false)
            return false;
        if (other.getImportAssetsFromLakeFormationTagPolicy() == null ^ this.getImportAssetsFromLakeFormationTagPolicy() == null)
            return false;
        if (other.getImportAssetsFromLakeFormationTagPolicy() != null
                && other.getImportAssetsFromLakeFormationTagPolicy().equals(this.getImportAssetsFromLakeFormationTagPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportAssetToSignedUrl() == null) ? 0 : getExportAssetToSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getExportAssetsToS3() == null) ? 0 : getExportAssetsToS3().hashCode());
        hashCode = prime * hashCode + ((getExportRevisionsToS3() == null) ? 0 : getExportRevisionsToS3().hashCode());
        hashCode = prime * hashCode + ((getImportAssetFromSignedUrl() == null) ? 0 : getImportAssetFromSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getImportAssetsFromS3() == null) ? 0 : getImportAssetsFromS3().hashCode());
        hashCode = prime * hashCode + ((getImportAssetsFromRedshiftDataShares() == null) ? 0 : getImportAssetsFromRedshiftDataShares().hashCode());
        hashCode = prime * hashCode + ((getImportAssetFromApiGatewayApi() == null) ? 0 : getImportAssetFromApiGatewayApi().hashCode());
        hashCode = prime * hashCode + ((getCreateS3DataAccessFromS3Bucket() == null) ? 0 : getCreateS3DataAccessFromS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getImportAssetsFromLakeFormationTagPolicy() == null) ? 0 : getImportAssetsFromLakeFormationTagPolicy().hashCode());
        return hashCode;
    }

    @Override
    public RequestDetails clone() {
        try {
            return (RequestDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.RequestDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
