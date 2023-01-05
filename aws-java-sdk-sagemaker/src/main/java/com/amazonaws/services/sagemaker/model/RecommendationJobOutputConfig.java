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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the output configuration for the compiled model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The SageMaker
     * execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Provides information about the output configuration for the compiled model.
     * </p>
     */
    private RecommendationJobCompiledOutputConfig compiledOutputConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The SageMaker
     * execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *        key that Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The
     *        SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.</p>
     *        <p>
     *        The <code>KmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about key identifiers, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *        (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The SageMaker
     * execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *         key that Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption.
     *         The SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.</p>
     *         <p>
     *         The <code>KmsKeyId</code> can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about key identifiers, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *         (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The SageMaker
     * execution role must have <code>kms:GenerateDataKey</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *        key that Amazon SageMaker uses to encrypt your output artifacts with Amazon S3 server-side encryption. The
     *        SageMaker execution role must have <code>kms:GenerateDataKey</code> permission.</p>
     *        <p>
     *        The <code>KmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about key identifiers, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *        (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobOutputConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Provides information about the output configuration for the compiled model.
     * </p>
     * 
     * @param compiledOutputConfig
     *        Provides information about the output configuration for the compiled model.
     */

    public void setCompiledOutputConfig(RecommendationJobCompiledOutputConfig compiledOutputConfig) {
        this.compiledOutputConfig = compiledOutputConfig;
    }

    /**
     * <p>
     * Provides information about the output configuration for the compiled model.
     * </p>
     * 
     * @return Provides information about the output configuration for the compiled model.
     */

    public RecommendationJobCompiledOutputConfig getCompiledOutputConfig() {
        return this.compiledOutputConfig;
    }

    /**
     * <p>
     * Provides information about the output configuration for the compiled model.
     * </p>
     * 
     * @param compiledOutputConfig
     *        Provides information about the output configuration for the compiled model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobOutputConfig withCompiledOutputConfig(RecommendationJobCompiledOutputConfig compiledOutputConfig) {
        setCompiledOutputConfig(compiledOutputConfig);
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
        if (getCompiledOutputConfig() != null)
            sb.append("CompiledOutputConfig: ").append(getCompiledOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobOutputConfig == false)
            return false;
        RecommendationJobOutputConfig other = (RecommendationJobOutputConfig) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCompiledOutputConfig() == null ^ this.getCompiledOutputConfig() == null)
            return false;
        if (other.getCompiledOutputConfig() != null && other.getCompiledOutputConfig().equals(this.getCompiledOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCompiledOutputConfig() == null) ? 0 : getCompiledOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobOutputConfig clone() {
        try {
            return (RecommendationJobOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
