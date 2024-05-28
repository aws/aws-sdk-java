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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the configuration of a Amazon Bedrock knowledge base.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BedrockKnowledgeStoreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BedrockKnowledgeStoreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the knowledge base used.
     * </p>
     */
    private String bedrockKnowledgeBaseArn;

    /**
     * <p>
     * The ARN of the knowledge base used.
     * </p>
     * 
     * @param bedrockKnowledgeBaseArn
     *        The ARN of the knowledge base used.
     */

    public void setBedrockKnowledgeBaseArn(String bedrockKnowledgeBaseArn) {
        this.bedrockKnowledgeBaseArn = bedrockKnowledgeBaseArn;
    }

    /**
     * <p>
     * The ARN of the knowledge base used.
     * </p>
     * 
     * @return The ARN of the knowledge base used.
     */

    public String getBedrockKnowledgeBaseArn() {
        return this.bedrockKnowledgeBaseArn;
    }

    /**
     * <p>
     * The ARN of the knowledge base used.
     * </p>
     * 
     * @param bedrockKnowledgeBaseArn
     *        The ARN of the knowledge base used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BedrockKnowledgeStoreConfiguration withBedrockKnowledgeBaseArn(String bedrockKnowledgeBaseArn) {
        setBedrockKnowledgeBaseArn(bedrockKnowledgeBaseArn);
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
        if (getBedrockKnowledgeBaseArn() != null)
            sb.append("BedrockKnowledgeBaseArn: ").append(getBedrockKnowledgeBaseArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BedrockKnowledgeStoreConfiguration == false)
            return false;
        BedrockKnowledgeStoreConfiguration other = (BedrockKnowledgeStoreConfiguration) obj;
        if (other.getBedrockKnowledgeBaseArn() == null ^ this.getBedrockKnowledgeBaseArn() == null)
            return false;
        if (other.getBedrockKnowledgeBaseArn() != null && other.getBedrockKnowledgeBaseArn().equals(this.getBedrockKnowledgeBaseArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBedrockKnowledgeBaseArn() == null) ? 0 : getBedrockKnowledgeBaseArn().hashCode());
        return hashCode;
    }

    @Override
    public BedrockKnowledgeStoreConfiguration clone() {
        try {
            return (BedrockKnowledgeStoreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BedrockKnowledgeStoreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
