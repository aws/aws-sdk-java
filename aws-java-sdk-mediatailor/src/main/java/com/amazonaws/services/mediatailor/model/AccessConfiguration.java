/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Access configuration parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AccessConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     * Accepted value: S3_SIGV4.
     * </p>
     * <p>
     * S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your source
     * location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4) authentication to
     * access the bucket where your source content is stored. Your MediaTailor source location baseURL must follow the
     * S3 virtual hosted-style request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     * </p>
     * <p>
     * Before you can use S3_SIGV4, you must meet these requirements:
     * </p>
     * <p>
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal access in
     * IAM. For information about configuring access in IAM, see Access management in the IAM User Guide.
     * </p>
     * <p>
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     * referenced by the VodSource packaging configurations.
     * </p>
     * <p>
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced by your
     * MediaTailor VodSource packaging configurations.
     * </p>
     */
    private String accessType;
    /**
     * <p>
     * AWS Secrets Manager access token configuration parameters.
     * </p>
     */
    private SecretsManagerAccessTokenConfiguration secretsManagerAccessTokenConfiguration;

    /**
     * <p>
     * The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     * Accepted value: S3_SIGV4.
     * </p>
     * <p>
     * S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your source
     * location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4) authentication to
     * access the bucket where your source content is stored. Your MediaTailor source location baseURL must follow the
     * S3 virtual hosted-style request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     * </p>
     * <p>
     * Before you can use S3_SIGV4, you must meet these requirements:
     * </p>
     * <p>
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal access in
     * IAM. For information about configuring access in IAM, see Access management in the IAM User Guide.
     * </p>
     * <p>
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     * referenced by the VodSource packaging configurations.
     * </p>
     * <p>
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced by your
     * MediaTailor VodSource packaging configurations.
     * </p>
     * 
     * @param accessType
     *        The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     *        Accepted value: S3_SIGV4.</p>
     *        <p>
     *        S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your
     *        source location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4)
     *        authentication to access the bucket where your source content is stored. Your MediaTailor source location
     *        baseURL must follow the S3 virtual hosted-style request URL format. For example,
     *        https://bucket-name.s3.Region.amazonaws.com/key-name.
     *        </p>
     *        <p>
     *        Before you can use S3_SIGV4, you must meet these requirements:
     *        </p>
     *        <p>
     *        • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal
     *        access in IAM. For information about configuring access in IAM, see Access management in the IAM User
     *        Guide.
     *        </p>
     *        <p>
     *        • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     *        referenced by the VodSource packaging configurations.
     *        </p>
     *        <p>
     *        • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced
     *        by your MediaTailor VodSource packaging configurations.
     * @see AccessType
     */

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    /**
     * <p>
     * The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     * Accepted value: S3_SIGV4.
     * </p>
     * <p>
     * S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your source
     * location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4) authentication to
     * access the bucket where your source content is stored. Your MediaTailor source location baseURL must follow the
     * S3 virtual hosted-style request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     * </p>
     * <p>
     * Before you can use S3_SIGV4, you must meet these requirements:
     * </p>
     * <p>
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal access in
     * IAM. For information about configuring access in IAM, see Access management in the IAM User Guide.
     * </p>
     * <p>
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     * referenced by the VodSource packaging configurations.
     * </p>
     * <p>
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced by your
     * MediaTailor VodSource packaging configurations.
     * </p>
     * 
     * @return The type of authentication used to access content from HttpConfiguration::BaseUrl on your source
     *         location. Accepted value: S3_SIGV4.</p>
     *         <p>
     *         S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your
     *         source location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4)
     *         authentication to access the bucket where your source content is stored. Your MediaTailor source location
     *         baseURL must follow the S3 virtual hosted-style request URL format. For example,
     *         https://bucket-name.s3.Region.amazonaws.com/key-name.
     *         </p>
     *         <p>
     *         Before you can use S3_SIGV4, you must meet these requirements:
     *         </p>
     *         <p>
     *         • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal
     *         access in IAM. For information about configuring access in IAM, see Access management in the IAM User
     *         Guide.
     *         </p>
     *         <p>
     *         • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     *         referenced by the VodSource packaging configurations.
     *         </p>
     *         <p>
     *         • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced
     *         by your MediaTailor VodSource packaging configurations.
     * @see AccessType
     */

    public String getAccessType() {
        return this.accessType;
    }

    /**
     * <p>
     * The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     * Accepted value: S3_SIGV4.
     * </p>
     * <p>
     * S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your source
     * location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4) authentication to
     * access the bucket where your source content is stored. Your MediaTailor source location baseURL must follow the
     * S3 virtual hosted-style request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     * </p>
     * <p>
     * Before you can use S3_SIGV4, you must meet these requirements:
     * </p>
     * <p>
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal access in
     * IAM. For information about configuring access in IAM, see Access management in the IAM User Guide.
     * </p>
     * <p>
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     * referenced by the VodSource packaging configurations.
     * </p>
     * <p>
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced by your
     * MediaTailor VodSource packaging configurations.
     * </p>
     * 
     * @param accessType
     *        The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     *        Accepted value: S3_SIGV4.</p>
     *        <p>
     *        S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your
     *        source location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4)
     *        authentication to access the bucket where your source content is stored. Your MediaTailor source location
     *        baseURL must follow the S3 virtual hosted-style request URL format. For example,
     *        https://bucket-name.s3.Region.amazonaws.com/key-name.
     *        </p>
     *        <p>
     *        Before you can use S3_SIGV4, you must meet these requirements:
     *        </p>
     *        <p>
     *        • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal
     *        access in IAM. For information about configuring access in IAM, see Access management in the IAM User
     *        Guide.
     *        </p>
     *        <p>
     *        • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     *        referenced by the VodSource packaging configurations.
     *        </p>
     *        <p>
     *        • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced
     *        by your MediaTailor VodSource packaging configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public AccessConfiguration withAccessType(String accessType) {
        setAccessType(accessType);
        return this;
    }

    /**
     * <p>
     * The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     * Accepted value: S3_SIGV4.
     * </p>
     * <p>
     * S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your source
     * location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4) authentication to
     * access the bucket where your source content is stored. Your MediaTailor source location baseURL must follow the
     * S3 virtual hosted-style request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     * </p>
     * <p>
     * Before you can use S3_SIGV4, you must meet these requirements:
     * </p>
     * <p>
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal access in
     * IAM. For information about configuring access in IAM, see Access management in the IAM User Guide.
     * </p>
     * <p>
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     * referenced by the VodSource packaging configurations.
     * </p>
     * <p>
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced by your
     * MediaTailor VodSource packaging configurations.
     * </p>
     * 
     * @param accessType
     *        The type of authentication used to access content from HttpConfiguration::BaseUrl on your source location.
     *        Accepted value: S3_SIGV4.</p>
     *        <p>
     *        S3_SIGV4 - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style access. If your
     *        source location base URL is an Amazon S3 bucket, MediaTailor can use AWS Signature Version 4 (SigV4)
     *        authentication to access the bucket where your source content is stored. Your MediaTailor source location
     *        baseURL must follow the S3 virtual hosted-style request URL format. For example,
     *        https://bucket-name.s3.Region.amazonaws.com/key-name.
     *        </p>
     *        <p>
     *        Before you can use S3_SIGV4, you must meet these requirements:
     *        </p>
     *        <p>
     *        • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com principal
     *        access in IAM. For information about configuring access in IAM, see Access management in the IAM User
     *        Guide.
     *        </p>
     *        <p>
     *        • The mediatailor.amazonaws.com service principal must have permissions to read all top level manifests
     *        referenced by the VodSource packaging configurations.
     *        </p>
     *        <p>
     *        • The caller of the API must have s3:GetObject IAM permissions to read all top level manifests referenced
     *        by your MediaTailor VodSource packaging configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessType
     */

    public AccessConfiguration withAccessType(AccessType accessType) {
        this.accessType = accessType.toString();
        return this;
    }

    /**
     * <p>
     * AWS Secrets Manager access token configuration parameters.
     * </p>
     * 
     * @param secretsManagerAccessTokenConfiguration
     *        AWS Secrets Manager access token configuration parameters.
     */

    public void setSecretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfiguration secretsManagerAccessTokenConfiguration) {
        this.secretsManagerAccessTokenConfiguration = secretsManagerAccessTokenConfiguration;
    }

    /**
     * <p>
     * AWS Secrets Manager access token configuration parameters.
     * </p>
     * 
     * @return AWS Secrets Manager access token configuration parameters.
     */

    public SecretsManagerAccessTokenConfiguration getSecretsManagerAccessTokenConfiguration() {
        return this.secretsManagerAccessTokenConfiguration;
    }

    /**
     * <p>
     * AWS Secrets Manager access token configuration parameters.
     * </p>
     * 
     * @param secretsManagerAccessTokenConfiguration
     *        AWS Secrets Manager access token configuration parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessConfiguration withSecretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfiguration secretsManagerAccessTokenConfiguration) {
        setSecretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration);
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
        if (getAccessType() != null)
            sb.append("AccessType: ").append(getAccessType()).append(",");
        if (getSecretsManagerAccessTokenConfiguration() != null)
            sb.append("SecretsManagerAccessTokenConfiguration: ").append(getSecretsManagerAccessTokenConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessConfiguration == false)
            return false;
        AccessConfiguration other = (AccessConfiguration) obj;
        if (other.getAccessType() == null ^ this.getAccessType() == null)
            return false;
        if (other.getAccessType() != null && other.getAccessType().equals(this.getAccessType()) == false)
            return false;
        if (other.getSecretsManagerAccessTokenConfiguration() == null ^ this.getSecretsManagerAccessTokenConfiguration() == null)
            return false;
        if (other.getSecretsManagerAccessTokenConfiguration() != null
                && other.getSecretsManagerAccessTokenConfiguration().equals(this.getSecretsManagerAccessTokenConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessType() == null) ? 0 : getAccessType().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessTokenConfiguration() == null) ? 0 : getSecretsManagerAccessTokenConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AccessConfiguration clone() {
        try {
            return (AccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
