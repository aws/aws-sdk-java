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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetInstanceTpmEkPubRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceTpmEkPubRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<GetInstanceTpmEkPubRequest> {

    /**
     * <p>
     * The ID of the instance for which to get the public endorsement key.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The required public endorsement key type.
     * </p>
     */
    private String keyType;
    /**
     * <p>
     * The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     * compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with tpm2-tools. The
     * returned key is base64 encoded.
     * </p>
     */
    private String keyFormat;

    /**
     * <p>
     * The ID of the instance for which to get the public endorsement key.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance for which to get the public endorsement key.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance for which to get the public endorsement key.
     * </p>
     * 
     * @return The ID of the instance for which to get the public endorsement key.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance for which to get the public endorsement key.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance for which to get the public endorsement key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceTpmEkPubRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The required public endorsement key type.
     * </p>
     * 
     * @param keyType
     *        The required public endorsement key type.
     * @see EkPubKeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The required public endorsement key type.
     * </p>
     * 
     * @return The required public endorsement key type.
     * @see EkPubKeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The required public endorsement key type.
     * </p>
     * 
     * @param keyType
     *        The required public endorsement key type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyType
     */

    public GetInstanceTpmEkPubRequest withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * The required public endorsement key type.
     * </p>
     * 
     * @param keyType
     *        The required public endorsement key type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyType
     */

    public GetInstanceTpmEkPubRequest withKeyType(EkPubKeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    /**
     * <p>
     * The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     * compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with tpm2-tools. The
     * returned key is base64 encoded.
     * </p>
     * 
     * @param keyFormat
     *        The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     *        compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with
     *        tpm2-tools. The returned key is base64 encoded.
     * @see EkPubKeyFormat
     */

    public void setKeyFormat(String keyFormat) {
        this.keyFormat = keyFormat;
    }

    /**
     * <p>
     * The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     * compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with tpm2-tools. The
     * returned key is base64 encoded.
     * </p>
     * 
     * @return The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     *         compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with
     *         tpm2-tools. The returned key is base64 encoded.
     * @see EkPubKeyFormat
     */

    public String getKeyFormat() {
        return this.keyFormat;
    }

    /**
     * <p>
     * The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     * compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with tpm2-tools. The
     * returned key is base64 encoded.
     * </p>
     * 
     * @param keyFormat
     *        The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     *        compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with
     *        tpm2-tools. The returned key is base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyFormat
     */

    public GetInstanceTpmEkPubRequest withKeyFormat(String keyFormat) {
        setKeyFormat(keyFormat);
        return this;
    }

    /**
     * <p>
     * The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     * compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with tpm2-tools. The
     * returned key is base64 encoded.
     * </p>
     * 
     * @param keyFormat
     *        The required public endorsement key format. Specify <code>der</code> for a DER-encoded public key that is
     *        compatible with OpenSSL. Specify <code>tpmt</code> for a TPM 2.0 format that is compatible with
     *        tpm2-tools. The returned key is base64 encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EkPubKeyFormat
     */

    public GetInstanceTpmEkPubRequest withKeyFormat(EkPubKeyFormat keyFormat) {
        this.keyFormat = keyFormat.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetInstanceTpmEkPubRequest> getDryRunRequest() {
        Request<GetInstanceTpmEkPubRequest> request = new GetInstanceTpmEkPubRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType()).append(",");
        if (getKeyFormat() != null)
            sb.append("KeyFormat: ").append(getKeyFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceTpmEkPubRequest == false)
            return false;
        GetInstanceTpmEkPubRequest other = (GetInstanceTpmEkPubRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        if (other.getKeyFormat() == null ^ this.getKeyFormat() == null)
            return false;
        if (other.getKeyFormat() != null && other.getKeyFormat().equals(this.getKeyFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        hashCode = prime * hashCode + ((getKeyFormat() == null) ? 0 : getKeyFormat().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceTpmEkPubRequest clone() {
        return (GetInstanceTpmEkPubRequest) super.clone();
    }
}
