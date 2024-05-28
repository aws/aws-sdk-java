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
 * Contains details about the configuration of the knowledge store used for the <code>AMAZON.QnAIntent</code>. You must
 * have already created the knowledge store and indexed the documents within it.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DataSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains details about the configuration of the Amazon OpenSearch Service database used for the
     * <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     */
    private OpensearchConfiguration opensearchConfiguration;
    /**
     * <p>
     * Contains details about the configuration of the Amazon Kendra index used for the <code>AMAZON.QnAIntent</code>.
     * To create a Amazon Kendra index, follow the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     * </p>
     */
    private QnAKendraConfiguration kendraConfiguration;
    /**
     * <p>
     * Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     * <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge base</a>.
     * </p>
     */
    private BedrockKnowledgeStoreConfiguration bedrockKnowledgeStoreConfiguration;

    /**
     * <p>
     * Contains details about the configuration of the Amazon OpenSearch Service database used for the
     * <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param opensearchConfiguration
     *        Contains details about the configuration of the Amazon OpenSearch Service database used for the
     *        <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html"
     *        >Creating and managing Amazon OpenSearch Service domains</a>.
     */

    public void setOpensearchConfiguration(OpensearchConfiguration opensearchConfiguration) {
        this.opensearchConfiguration = opensearchConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon OpenSearch Service database used for the
     * <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @return Contains details about the configuration of the Amazon OpenSearch Service database used for the
     *         <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html"
     *         >Creating and managing Amazon OpenSearch Service domains</a>.
     */

    public OpensearchConfiguration getOpensearchConfiguration() {
        return this.opensearchConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon OpenSearch Service database used for the
     * <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html">Creating and
     * managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param opensearchConfiguration
     *        Contains details about the configuration of the Amazon OpenSearch Service database used for the
     *        <code>AMAZON.QnAIntent</code>. To create a domain, follow the steps at <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html"
     *        >Creating and managing Amazon OpenSearch Service domains</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withOpensearchConfiguration(OpensearchConfiguration opensearchConfiguration) {
        setOpensearchConfiguration(opensearchConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon Kendra index used for the <code>AMAZON.QnAIntent</code>.
     * To create a Amazon Kendra index, follow the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     * </p>
     * 
     * @param kendraConfiguration
     *        Contains details about the configuration of the Amazon Kendra index used for the
     *        <code>AMAZON.QnAIntent</code>. To create a Amazon Kendra index, follow the steps at <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     */

    public void setKendraConfiguration(QnAKendraConfiguration kendraConfiguration) {
        this.kendraConfiguration = kendraConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon Kendra index used for the <code>AMAZON.QnAIntent</code>.
     * To create a Amazon Kendra index, follow the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     * </p>
     * 
     * @return Contains details about the configuration of the Amazon Kendra index used for the
     *         <code>AMAZON.QnAIntent</code>. To create a Amazon Kendra index, follow the steps at <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     */

    public QnAKendraConfiguration getKendraConfiguration() {
        return this.kendraConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon Kendra index used for the <code>AMAZON.QnAIntent</code>.
     * To create a Amazon Kendra index, follow the steps at <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     * </p>
     * 
     * @param kendraConfiguration
     *        Contains details about the configuration of the Amazon Kendra index used for the
     *        <code>AMAZON.QnAIntent</code>. To create a Amazon Kendra index, follow the steps at <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/create-index.html">Creating an index</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withKendraConfiguration(QnAKendraConfiguration kendraConfiguration) {
        setKendraConfiguration(kendraConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     * <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge base</a>.
     * </p>
     * 
     * @param bedrockKnowledgeStoreConfiguration
     *        Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     *        <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge
     *        base</a>.
     */

    public void setBedrockKnowledgeStoreConfiguration(BedrockKnowledgeStoreConfiguration bedrockKnowledgeStoreConfiguration) {
        this.bedrockKnowledgeStoreConfiguration = bedrockKnowledgeStoreConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     * <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge base</a>.
     * </p>
     * 
     * @return Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     *         <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     *         href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge
     *         base</a>.
     */

    public BedrockKnowledgeStoreConfiguration getBedrockKnowledgeStoreConfiguration() {
        return this.bedrockKnowledgeStoreConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     * <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     * href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge base</a>.
     * </p>
     * 
     * @param bedrockKnowledgeStoreConfiguration
     *        Contains details about the configuration of the Amazon Bedrock knowledge base used for the
     *        <code>AMAZON.QnAIntent</code>. To set up a knowledge base, follow the steps at <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/knowledge-base.html">Building a knowledge
     *        base</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceConfiguration withBedrockKnowledgeStoreConfiguration(BedrockKnowledgeStoreConfiguration bedrockKnowledgeStoreConfiguration) {
        setBedrockKnowledgeStoreConfiguration(bedrockKnowledgeStoreConfiguration);
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
        if (getOpensearchConfiguration() != null)
            sb.append("OpensearchConfiguration: ").append(getOpensearchConfiguration()).append(",");
        if (getKendraConfiguration() != null)
            sb.append("KendraConfiguration: ").append(getKendraConfiguration()).append(",");
        if (getBedrockKnowledgeStoreConfiguration() != null)
            sb.append("BedrockKnowledgeStoreConfiguration: ").append(getBedrockKnowledgeStoreConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceConfiguration == false)
            return false;
        DataSourceConfiguration other = (DataSourceConfiguration) obj;
        if (other.getOpensearchConfiguration() == null ^ this.getOpensearchConfiguration() == null)
            return false;
        if (other.getOpensearchConfiguration() != null && other.getOpensearchConfiguration().equals(this.getOpensearchConfiguration()) == false)
            return false;
        if (other.getKendraConfiguration() == null ^ this.getKendraConfiguration() == null)
            return false;
        if (other.getKendraConfiguration() != null && other.getKendraConfiguration().equals(this.getKendraConfiguration()) == false)
            return false;
        if (other.getBedrockKnowledgeStoreConfiguration() == null ^ this.getBedrockKnowledgeStoreConfiguration() == null)
            return false;
        if (other.getBedrockKnowledgeStoreConfiguration() != null
                && other.getBedrockKnowledgeStoreConfiguration().equals(this.getBedrockKnowledgeStoreConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpensearchConfiguration() == null) ? 0 : getOpensearchConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKendraConfiguration() == null) ? 0 : getKendraConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBedrockKnowledgeStoreConfiguration() == null) ? 0 : getBedrockKnowledgeStoreConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceConfiguration clone() {
        try {
            return (DataSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DataSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
