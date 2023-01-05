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
 * Details about the asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/AssetDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 object that is the asset.
     * </p>
     */
    private S3SnapshotAsset s3SnapshotAsset;
    /**
     * <p>
     * The Amazon Redshift datashare that is the asset.
     * </p>
     */
    private RedshiftDataShareAsset redshiftDataShareAsset;
    /**
     * <p>
     * Information about the API Gateway API asset.
     * </p>
     */
    private ApiGatewayApiAsset apiGatewayApiAsset;
    /**
     * <p>
     * The Amazon S3 data access that is the asset.
     * </p>
     */
    private S3DataAccessAsset s3DataAccessAsset;
    /**
     * <p>
     * The AWS Lake Formation data permission that is the asset.
     * </p>
     */
    private LakeFormationDataPermissionAsset lakeFormationDataPermissionAsset;

    /**
     * <p>
     * The Amazon S3 object that is the asset.
     * </p>
     * 
     * @param s3SnapshotAsset
     *        The Amazon S3 object that is the asset.
     */

    public void setS3SnapshotAsset(S3SnapshotAsset s3SnapshotAsset) {
        this.s3SnapshotAsset = s3SnapshotAsset;
    }

    /**
     * <p>
     * The Amazon S3 object that is the asset.
     * </p>
     * 
     * @return The Amazon S3 object that is the asset.
     */

    public S3SnapshotAsset getS3SnapshotAsset() {
        return this.s3SnapshotAsset;
    }

    /**
     * <p>
     * The Amazon S3 object that is the asset.
     * </p>
     * 
     * @param s3SnapshotAsset
     *        The Amazon S3 object that is the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDetails withS3SnapshotAsset(S3SnapshotAsset s3SnapshotAsset) {
        setS3SnapshotAsset(s3SnapshotAsset);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift datashare that is the asset.
     * </p>
     * 
     * @param redshiftDataShareAsset
     *        The Amazon Redshift datashare that is the asset.
     */

    public void setRedshiftDataShareAsset(RedshiftDataShareAsset redshiftDataShareAsset) {
        this.redshiftDataShareAsset = redshiftDataShareAsset;
    }

    /**
     * <p>
     * The Amazon Redshift datashare that is the asset.
     * </p>
     * 
     * @return The Amazon Redshift datashare that is the asset.
     */

    public RedshiftDataShareAsset getRedshiftDataShareAsset() {
        return this.redshiftDataShareAsset;
    }

    /**
     * <p>
     * The Amazon Redshift datashare that is the asset.
     * </p>
     * 
     * @param redshiftDataShareAsset
     *        The Amazon Redshift datashare that is the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDetails withRedshiftDataShareAsset(RedshiftDataShareAsset redshiftDataShareAsset) {
        setRedshiftDataShareAsset(redshiftDataShareAsset);
        return this;
    }

    /**
     * <p>
     * Information about the API Gateway API asset.
     * </p>
     * 
     * @param apiGatewayApiAsset
     *        Information about the API Gateway API asset.
     */

    public void setApiGatewayApiAsset(ApiGatewayApiAsset apiGatewayApiAsset) {
        this.apiGatewayApiAsset = apiGatewayApiAsset;
    }

    /**
     * <p>
     * Information about the API Gateway API asset.
     * </p>
     * 
     * @return Information about the API Gateway API asset.
     */

    public ApiGatewayApiAsset getApiGatewayApiAsset() {
        return this.apiGatewayApiAsset;
    }

    /**
     * <p>
     * Information about the API Gateway API asset.
     * </p>
     * 
     * @param apiGatewayApiAsset
     *        Information about the API Gateway API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDetails withApiGatewayApiAsset(ApiGatewayApiAsset apiGatewayApiAsset) {
        setApiGatewayApiAsset(apiGatewayApiAsset);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 data access that is the asset.
     * </p>
     * 
     * @param s3DataAccessAsset
     *        The Amazon S3 data access that is the asset.
     */

    public void setS3DataAccessAsset(S3DataAccessAsset s3DataAccessAsset) {
        this.s3DataAccessAsset = s3DataAccessAsset;
    }

    /**
     * <p>
     * The Amazon S3 data access that is the asset.
     * </p>
     * 
     * @return The Amazon S3 data access that is the asset.
     */

    public S3DataAccessAsset getS3DataAccessAsset() {
        return this.s3DataAccessAsset;
    }

    /**
     * <p>
     * The Amazon S3 data access that is the asset.
     * </p>
     * 
     * @param s3DataAccessAsset
     *        The Amazon S3 data access that is the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDetails withS3DataAccessAsset(S3DataAccessAsset s3DataAccessAsset) {
        setS3DataAccessAsset(s3DataAccessAsset);
        return this;
    }

    /**
     * <p>
     * The AWS Lake Formation data permission that is the asset.
     * </p>
     * 
     * @param lakeFormationDataPermissionAsset
     *        The AWS Lake Formation data permission that is the asset.
     */

    public void setLakeFormationDataPermissionAsset(LakeFormationDataPermissionAsset lakeFormationDataPermissionAsset) {
        this.lakeFormationDataPermissionAsset = lakeFormationDataPermissionAsset;
    }

    /**
     * <p>
     * The AWS Lake Formation data permission that is the asset.
     * </p>
     * 
     * @return The AWS Lake Formation data permission that is the asset.
     */

    public LakeFormationDataPermissionAsset getLakeFormationDataPermissionAsset() {
        return this.lakeFormationDataPermissionAsset;
    }

    /**
     * <p>
     * The AWS Lake Formation data permission that is the asset.
     * </p>
     * 
     * @param lakeFormationDataPermissionAsset
     *        The AWS Lake Formation data permission that is the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetDetails withLakeFormationDataPermissionAsset(LakeFormationDataPermissionAsset lakeFormationDataPermissionAsset) {
        setLakeFormationDataPermissionAsset(lakeFormationDataPermissionAsset);
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
        if (getS3SnapshotAsset() != null)
            sb.append("S3SnapshotAsset: ").append(getS3SnapshotAsset()).append(",");
        if (getRedshiftDataShareAsset() != null)
            sb.append("RedshiftDataShareAsset: ").append(getRedshiftDataShareAsset()).append(",");
        if (getApiGatewayApiAsset() != null)
            sb.append("ApiGatewayApiAsset: ").append(getApiGatewayApiAsset()).append(",");
        if (getS3DataAccessAsset() != null)
            sb.append("S3DataAccessAsset: ").append(getS3DataAccessAsset()).append(",");
        if (getLakeFormationDataPermissionAsset() != null)
            sb.append("LakeFormationDataPermissionAsset: ").append(getLakeFormationDataPermissionAsset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetDetails == false)
            return false;
        AssetDetails other = (AssetDetails) obj;
        if (other.getS3SnapshotAsset() == null ^ this.getS3SnapshotAsset() == null)
            return false;
        if (other.getS3SnapshotAsset() != null && other.getS3SnapshotAsset().equals(this.getS3SnapshotAsset()) == false)
            return false;
        if (other.getRedshiftDataShareAsset() == null ^ this.getRedshiftDataShareAsset() == null)
            return false;
        if (other.getRedshiftDataShareAsset() != null && other.getRedshiftDataShareAsset().equals(this.getRedshiftDataShareAsset()) == false)
            return false;
        if (other.getApiGatewayApiAsset() == null ^ this.getApiGatewayApiAsset() == null)
            return false;
        if (other.getApiGatewayApiAsset() != null && other.getApiGatewayApiAsset().equals(this.getApiGatewayApiAsset()) == false)
            return false;
        if (other.getS3DataAccessAsset() == null ^ this.getS3DataAccessAsset() == null)
            return false;
        if (other.getS3DataAccessAsset() != null && other.getS3DataAccessAsset().equals(this.getS3DataAccessAsset()) == false)
            return false;
        if (other.getLakeFormationDataPermissionAsset() == null ^ this.getLakeFormationDataPermissionAsset() == null)
            return false;
        if (other.getLakeFormationDataPermissionAsset() != null
                && other.getLakeFormationDataPermissionAsset().equals(this.getLakeFormationDataPermissionAsset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3SnapshotAsset() == null) ? 0 : getS3SnapshotAsset().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDataShareAsset() == null) ? 0 : getRedshiftDataShareAsset().hashCode());
        hashCode = prime * hashCode + ((getApiGatewayApiAsset() == null) ? 0 : getApiGatewayApiAsset().hashCode());
        hashCode = prime * hashCode + ((getS3DataAccessAsset() == null) ? 0 : getS3DataAccessAsset().hashCode());
        hashCode = prime * hashCode + ((getLakeFormationDataPermissionAsset() == null) ? 0 : getLakeFormationDataPermissionAsset().hashCode());
        return hashCode;
    }

    @Override
    public AssetDetails clone() {
        try {
            return (AssetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.AssetDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
