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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGlueTableCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemporaryGlueTableCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The access key ID for the temporary credentials.
     * </p>
     */
    private String accessKeyId;
    /**
     * <p>
     * The secret key for the temporary credentials.
     * </p>
     */
    private String secretAccessKey;
    /**
     * <p>
     * The session token for the temporary credentials.
     * </p>
     */
    private String sessionToken;
    /**
     * <p>
     * The date and time when the temporary credentials expire.
     * </p>
     */
    private java.util.Date expiration;
    /**
     * <p>
     * The Amazon S3 path for the temporary credentials.
     * </p>
     */
    private java.util.List<String> vendedS3Path;

    /**
     * <p>
     * The access key ID for the temporary credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The access key ID for the temporary credentials.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The access key ID for the temporary credentials.
     * </p>
     * 
     * @return The access key ID for the temporary credentials.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The access key ID for the temporary credentials.
     * </p>
     * 
     * @param accessKeyId
     *        The access key ID for the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGlueTableCredentialsResult withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * <p>
     * The secret key for the temporary credentials.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret key for the temporary credentials.
     */

    public void setSecretAccessKey(String secretAccessKey) {
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * <p>
     * The secret key for the temporary credentials.
     * </p>
     * 
     * @return The secret key for the temporary credentials.
     */

    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    /**
     * <p>
     * The secret key for the temporary credentials.
     * </p>
     * 
     * @param secretAccessKey
     *        The secret key for the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGlueTableCredentialsResult withSecretAccessKey(String secretAccessKey) {
        setSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * <p>
     * The session token for the temporary credentials.
     * </p>
     * 
     * @param sessionToken
     *        The session token for the temporary credentials.
     */

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    /**
     * <p>
     * The session token for the temporary credentials.
     * </p>
     * 
     * @return The session token for the temporary credentials.
     */

    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * <p>
     * The session token for the temporary credentials.
     * </p>
     * 
     * @param sessionToken
     *        The session token for the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGlueTableCredentialsResult withSessionToken(String sessionToken) {
        setSessionToken(sessionToken);
        return this;
    }

    /**
     * <p>
     * The date and time when the temporary credentials expire.
     * </p>
     * 
     * @param expiration
     *        The date and time when the temporary credentials expire.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date and time when the temporary credentials expire.
     * </p>
     * 
     * @return The date and time when the temporary credentials expire.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date and time when the temporary credentials expire.
     * </p>
     * 
     * @param expiration
     *        The date and time when the temporary credentials expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGlueTableCredentialsResult withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path for the temporary credentials.
     * </p>
     * 
     * @return The Amazon S3 path for the temporary credentials.
     */

    public java.util.List<String> getVendedS3Path() {
        return vendedS3Path;
    }

    /**
     * <p>
     * The Amazon S3 path for the temporary credentials.
     * </p>
     * 
     * @param vendedS3Path
     *        The Amazon S3 path for the temporary credentials.
     */

    public void setVendedS3Path(java.util.Collection<String> vendedS3Path) {
        if (vendedS3Path == null) {
            this.vendedS3Path = null;
            return;
        }

        this.vendedS3Path = new java.util.ArrayList<String>(vendedS3Path);
    }

    /**
     * <p>
     * The Amazon S3 path for the temporary credentials.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVendedS3Path(java.util.Collection)} or {@link #withVendedS3Path(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vendedS3Path
     *        The Amazon S3 path for the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGlueTableCredentialsResult withVendedS3Path(String... vendedS3Path) {
        if (this.vendedS3Path == null) {
            setVendedS3Path(new java.util.ArrayList<String>(vendedS3Path.length));
        }
        for (String ele : vendedS3Path) {
            this.vendedS3Path.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path for the temporary credentials.
     * </p>
     * 
     * @param vendedS3Path
     *        The Amazon S3 path for the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGlueTableCredentialsResult withVendedS3Path(java.util.Collection<String> vendedS3Path) {
        setVendedS3Path(vendedS3Path);
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
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId()).append(",");
        if (getSecretAccessKey() != null)
            sb.append("SecretAccessKey: ").append(getSecretAccessKey()).append(",");
        if (getSessionToken() != null)
            sb.append("SessionToken: ").append(getSessionToken()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getVendedS3Path() != null)
            sb.append("VendedS3Path: ").append(getVendedS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTemporaryGlueTableCredentialsResult == false)
            return false;
        GetTemporaryGlueTableCredentialsResult other = (GetTemporaryGlueTableCredentialsResult) obj;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        if (other.getSecretAccessKey() == null ^ this.getSecretAccessKey() == null)
            return false;
        if (other.getSecretAccessKey() != null && other.getSecretAccessKey().equals(this.getSecretAccessKey()) == false)
            return false;
        if (other.getSessionToken() == null ^ this.getSessionToken() == null)
            return false;
        if (other.getSessionToken() != null && other.getSessionToken().equals(this.getSessionToken()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getVendedS3Path() == null ^ this.getVendedS3Path() == null)
            return false;
        if (other.getVendedS3Path() != null && other.getVendedS3Path().equals(this.getVendedS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretAccessKey() == null) ? 0 : getSecretAccessKey().hashCode());
        hashCode = prime * hashCode + ((getSessionToken() == null) ? 0 : getSessionToken().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getVendedS3Path() == null) ? 0 : getVendedS3Path().hashCode());
        return hashCode;
    }

    @Override
    public GetTemporaryGlueTableCredentialsResult clone() {
        try {
            return (GetTemporaryGlueTableCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
