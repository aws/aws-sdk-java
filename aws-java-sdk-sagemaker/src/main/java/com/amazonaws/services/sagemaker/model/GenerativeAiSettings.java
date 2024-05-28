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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The generative AI settings for the SageMaker Canvas application.
 * </p>
 * <p>
 * Configure these settings for Canvas users starting chats with generative AI foundation models. For more information,
 * see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/canvas-fm-chat.html"> Use generative AI with foundation
 * models</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GenerativeAiSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerativeAiSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in Amazon
     * Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust relationship that
     * establishes <code>bedrock.amazonaws.com</code> as a service principal.
     * </p>
     */
    private String amazonBedrockRoleArn;

    /**
     * <p>
     * The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in Amazon
     * Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust relationship that
     * establishes <code>bedrock.amazonaws.com</code> as a service principal.
     * </p>
     * 
     * @param amazonBedrockRoleArn
     *        The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in
     *        Amazon Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust
     *        relationship that establishes <code>bedrock.amazonaws.com</code> as a service principal.
     */

    public void setAmazonBedrockRoleArn(String amazonBedrockRoleArn) {
        this.amazonBedrockRoleArn = amazonBedrockRoleArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in Amazon
     * Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust relationship that
     * establishes <code>bedrock.amazonaws.com</code> as a service principal.
     * </p>
     * 
     * @return The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in
     *         Amazon Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust
     *         relationship that establishes <code>bedrock.amazonaws.com</code> as a service principal.
     */

    public String getAmazonBedrockRoleArn() {
        return this.amazonBedrockRoleArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in Amazon
     * Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust relationship that
     * establishes <code>bedrock.amazonaws.com</code> as a service principal.
     * </p>
     * 
     * @param amazonBedrockRoleArn
     *        The ARN of an Amazon Web Services IAM role that allows fine-tuning of large language models (LLMs) in
     *        Amazon Bedrock. The IAM role should have Amazon S3 read and write permissions, as well as a trust
     *        relationship that establishes <code>bedrock.amazonaws.com</code> as a service principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerativeAiSettings withAmazonBedrockRoleArn(String amazonBedrockRoleArn) {
        setAmazonBedrockRoleArn(amazonBedrockRoleArn);
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
        if (getAmazonBedrockRoleArn() != null)
            sb.append("AmazonBedrockRoleArn: ").append(getAmazonBedrockRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerativeAiSettings == false)
            return false;
        GenerativeAiSettings other = (GenerativeAiSettings) obj;
        if (other.getAmazonBedrockRoleArn() == null ^ this.getAmazonBedrockRoleArn() == null)
            return false;
        if (other.getAmazonBedrockRoleArn() != null && other.getAmazonBedrockRoleArn().equals(this.getAmazonBedrockRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonBedrockRoleArn() == null) ? 0 : getAmazonBedrockRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public GenerativeAiSettings clone() {
        try {
            return (GenerativeAiSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.GenerativeAiSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
