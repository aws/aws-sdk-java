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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A description of the import source that you provide at the start of an import job. This value is set to either
 * <code>Body</code> or <code>S3Uri</code>, depending on how the <code>StartAssetBundleImportJobRequest</code> is
 * configured.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportSourceDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportSourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the import job.
     * This URL is valid for five minutes after issuance. Call <code>DescribeAssetBundleExportJob</code> again for a
     * fresh URL if needed. The downloaded asset bundle is a <code>.qs</code> zip file.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The Amazon S3 URI that you provided at the start of the import job.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the import job.
     * This URL is valid for five minutes after issuance. Call <code>DescribeAssetBundleExportJob</code> again for a
     * fresh URL if needed. The downloaded asset bundle is a <code>.qs</code> zip file.
     * </p>
     * 
     * @param body
     *        An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the
     *        import job. This URL is valid for five minutes after issuance. Call
     *        <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed. The downloaded asset bundle is
     *        a <code>.qs</code> zip file.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the import job.
     * This URL is valid for five minutes after issuance. Call <code>DescribeAssetBundleExportJob</code> again for a
     * fresh URL if needed. The downloaded asset bundle is a <code>.qs</code> zip file.
     * </p>
     * 
     * @return An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the
     *         import job. This URL is valid for five minutes after issuance. Call
     *         <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed. The downloaded asset bundle is
     *         a <code>.qs</code> zip file.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the import job.
     * This URL is valid for five minutes after issuance. Call <code>DescribeAssetBundleExportJob</code> again for a
     * fresh URL if needed. The downloaded asset bundle is a <code>.qs</code> zip file.
     * </p>
     * 
     * @param body
     *        An HTTPS download URL for the provided asset bundle that you optionally provided at the start of the
     *        import job. This URL is valid for five minutes after issuance. Call
     *        <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed. The downloaded asset bundle is
     *        a <code>.qs</code> zip file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportSourceDescription withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 URI that you provided at the start of the import job.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 URI that you provided at the start of the import job.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI that you provided at the start of the import job.
     * </p>
     * 
     * @return The Amazon S3 URI that you provided at the start of the import job.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI that you provided at the start of the import job.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 URI that you provided at the start of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportSourceDescription withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getBody() != null)
            sb.append("Body: ").append("***Sensitive Data Redacted***").append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportSourceDescription == false)
            return false;
        AssetBundleImportSourceDescription other = (AssetBundleImportSourceDescription) obj;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportSourceDescription clone() {
        try {
            return (AssetBundleImportSourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportSourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
