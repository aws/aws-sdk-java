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
package com.amazonaws.services.supplychain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request parameters for CreateBillOfMaterialsImportJob.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/CreateBillOfMaterialsImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBillOfMaterialsImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read the
     * file.
     * </p>
     */
    private String s3uri;
    /**
     * <p>
     * An idempotency token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @param instanceId
     *        The AWS Supply Chain instance identifier.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @return The AWS Supply Chain instance identifier.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @param instanceId
     *        The AWS Supply Chain instance identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillOfMaterialsImportJobRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read the
     * file.
     * </p>
     * 
     * @param s3uri
     *        The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read
     *        the file.
     */

    public void setS3uri(String s3uri) {
        this.s3uri = s3uri;
    }

    /**
     * <p>
     * The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read the
     * file.
     * </p>
     * 
     * @return The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read
     *         the file.
     */

    public String getS3uri() {
        return this.s3uri;
    }

    /**
     * <p>
     * The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read the
     * file.
     * </p>
     * 
     * @param s3uri
     *        The S3 URI of the CSV file to be imported. The bucket must grant permissions for AWS Supply Chain to read
     *        the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillOfMaterialsImportJobRequest withS3uri(String s3uri) {
        setS3uri(s3uri);
        return this;
    }

    /**
     * <p>
     * An idempotency token.
     * </p>
     * 
     * @param clientToken
     *        An idempotency token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * An idempotency token.
     * </p>
     * 
     * @return An idempotency token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * An idempotency token.
     * </p>
     * 
     * @param clientToken
     *        An idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBillOfMaterialsImportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getS3uri() != null)
            sb.append("S3uri: ").append(getS3uri()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBillOfMaterialsImportJobRequest == false)
            return false;
        CreateBillOfMaterialsImportJobRequest other = (CreateBillOfMaterialsImportJobRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getS3uri() == null ^ this.getS3uri() == null)
            return false;
        if (other.getS3uri() != null && other.getS3uri().equals(this.getS3uri()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getS3uri() == null) ? 0 : getS3uri().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateBillOfMaterialsImportJobRequest clone() {
        return (CreateBillOfMaterialsImportJobRequest) super.clone();
    }

}
