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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFaceLivenessSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and reference
     * images.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A session settings object. It contains settings for the operation to be performed. For Face Liveness, it accepts
     * <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     * </p>
     */
    private CreateFaceLivenessSessionRequestSettings settings;
    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     * <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and reference
     * images.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and
     *        reference images.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and reference
     * images.
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and
     *         reference images.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and reference
     * images.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt audit images and
     *        reference images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaceLivenessSessionRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be performed. For Face Liveness, it accepts
     * <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     * </p>
     * 
     * @param settings
     *        A session settings object. It contains settings for the operation to be performed. For Face Liveness, it
     *        accepts <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     */

    public void setSettings(CreateFaceLivenessSessionRequestSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be performed. For Face Liveness, it accepts
     * <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     * </p>
     * 
     * @return A session settings object. It contains settings for the operation to be performed. For Face Liveness, it
     *         accepts <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     */

    public CreateFaceLivenessSessionRequestSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * A session settings object. It contains settings for the operation to be performed. For Face Liveness, it accepts
     * <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     * </p>
     * 
     * @param settings
     *        A session settings object. It contains settings for the operation to be performed. For Face Liveness, it
     *        accepts <code>OutputConfig</code> and <code>AuditImagesLimit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaceLivenessSessionRequest withSettings(CreateFaceLivenessSessionRequestSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     * <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     *        <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to
     *        avoid unintentionally creating the same session multiple times.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     * <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     * 
     * @return Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     *         <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to
     *         avoid unintentionally creating the same session multiple times.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     * <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to avoid
     * unintentionally creating the same session multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token is used to recognize the Face Liveness request. If the same token is used with multiple
     *        <code>CreateFaceLivenessSession</code> requests, the same session is returned. This token is employed to
     *        avoid unintentionally creating the same session multiple times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFaceLivenessSessionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFaceLivenessSessionRequest == false)
            return false;
        CreateFaceLivenessSessionRequest other = (CreateFaceLivenessSessionRequest) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateFaceLivenessSessionRequest clone() {
        return (CreateFaceLivenessSessionRequest) super.clone();
    }

}
