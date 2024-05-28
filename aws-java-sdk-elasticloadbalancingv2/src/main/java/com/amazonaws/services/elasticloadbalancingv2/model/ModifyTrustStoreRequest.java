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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyTrustStore"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrustStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     */
    private String trustStoreArn;
    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     */
    private String caCertificatesBundleS3Bucket;
    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     */
    private String caCertificatesBundleS3Key;
    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     */
    private String caCertificatesBundleS3ObjectVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     */

    public void setTrustStoreArn(String trustStoreArn) {
        this.trustStoreArn = trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trust store.
     */

    public String getTrustStoreArn() {
        return this.trustStoreArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trust store.
     * </p>
     * 
     * @param trustStoreArn
     *        The Amazon Resource Name (ARN) of the trust store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrustStoreRequest withTrustStoreArn(String trustStoreArn) {
        setTrustStoreArn(trustStoreArn);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Bucket
     *        The Amazon S3 bucket for the ca certificates bundle.
     */

    public void setCaCertificatesBundleS3Bucket(String caCertificatesBundleS3Bucket) {
        this.caCertificatesBundleS3Bucket = caCertificatesBundleS3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     * 
     * @return The Amazon S3 bucket for the ca certificates bundle.
     */

    public String getCaCertificatesBundleS3Bucket() {
        return this.caCertificatesBundleS3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Bucket
     *        The Amazon S3 bucket for the ca certificates bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrustStoreRequest withCaCertificatesBundleS3Bucket(String caCertificatesBundleS3Bucket) {
        setCaCertificatesBundleS3Bucket(caCertificatesBundleS3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Key
     *        The Amazon S3 path for the ca certificates bundle.
     */

    public void setCaCertificatesBundleS3Key(String caCertificatesBundleS3Key) {
        this.caCertificatesBundleS3Key = caCertificatesBundleS3Key;
    }

    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     * 
     * @return The Amazon S3 path for the ca certificates bundle.
     */

    public String getCaCertificatesBundleS3Key() {
        return this.caCertificatesBundleS3Key;
    }

    /**
     * <p>
     * The Amazon S3 path for the ca certificates bundle.
     * </p>
     * 
     * @param caCertificatesBundleS3Key
     *        The Amazon S3 path for the ca certificates bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrustStoreRequest withCaCertificatesBundleS3Key(String caCertificatesBundleS3Key) {
        setCaCertificatesBundleS3Key(caCertificatesBundleS3Key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     * 
     * @param caCertificatesBundleS3ObjectVersion
     *        The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     */

    public void setCaCertificatesBundleS3ObjectVersion(String caCertificatesBundleS3ObjectVersion) {
        this.caCertificatesBundleS3ObjectVersion = caCertificatesBundleS3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     * 
     * @return The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     */

    public String getCaCertificatesBundleS3ObjectVersion() {
        return this.caCertificatesBundleS3ObjectVersion;
    }

    /**
     * <p>
     * The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * </p>
     * 
     * @param caCertificatesBundleS3ObjectVersion
     *        The Amazon S3 object version for the ca certificates bundle. If undefined the current version is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrustStoreRequest withCaCertificatesBundleS3ObjectVersion(String caCertificatesBundleS3ObjectVersion) {
        setCaCertificatesBundleS3ObjectVersion(caCertificatesBundleS3ObjectVersion);
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
        if (getTrustStoreArn() != null)
            sb.append("TrustStoreArn: ").append(getTrustStoreArn()).append(",");
        if (getCaCertificatesBundleS3Bucket() != null)
            sb.append("CaCertificatesBundleS3Bucket: ").append(getCaCertificatesBundleS3Bucket()).append(",");
        if (getCaCertificatesBundleS3Key() != null)
            sb.append("CaCertificatesBundleS3Key: ").append(getCaCertificatesBundleS3Key()).append(",");
        if (getCaCertificatesBundleS3ObjectVersion() != null)
            sb.append("CaCertificatesBundleS3ObjectVersion: ").append(getCaCertificatesBundleS3ObjectVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrustStoreRequest == false)
            return false;
        ModifyTrustStoreRequest other = (ModifyTrustStoreRequest) obj;
        if (other.getTrustStoreArn() == null ^ this.getTrustStoreArn() == null)
            return false;
        if (other.getTrustStoreArn() != null && other.getTrustStoreArn().equals(this.getTrustStoreArn()) == false)
            return false;
        if (other.getCaCertificatesBundleS3Bucket() == null ^ this.getCaCertificatesBundleS3Bucket() == null)
            return false;
        if (other.getCaCertificatesBundleS3Bucket() != null && other.getCaCertificatesBundleS3Bucket().equals(this.getCaCertificatesBundleS3Bucket()) == false)
            return false;
        if (other.getCaCertificatesBundleS3Key() == null ^ this.getCaCertificatesBundleS3Key() == null)
            return false;
        if (other.getCaCertificatesBundleS3Key() != null && other.getCaCertificatesBundleS3Key().equals(this.getCaCertificatesBundleS3Key()) == false)
            return false;
        if (other.getCaCertificatesBundleS3ObjectVersion() == null ^ this.getCaCertificatesBundleS3ObjectVersion() == null)
            return false;
        if (other.getCaCertificatesBundleS3ObjectVersion() != null
                && other.getCaCertificatesBundleS3ObjectVersion().equals(this.getCaCertificatesBundleS3ObjectVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrustStoreArn() == null) ? 0 : getTrustStoreArn().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatesBundleS3Bucket() == null) ? 0 : getCaCertificatesBundleS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatesBundleS3Key() == null) ? 0 : getCaCertificatesBundleS3Key().hashCode());
        hashCode = prime * hashCode + ((getCaCertificatesBundleS3ObjectVersion() == null) ? 0 : getCaCertificatesBundleS3ObjectVersion().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTrustStoreRequest clone() {
        return (ModifyTrustStoreRequest) super.clone();
    }

}
