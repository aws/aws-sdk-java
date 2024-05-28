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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates the method for setting up document ID. The supported methods are Firehose generated document ID and
 * OpenSearch Service generated document ID.
 * </p>
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/DocumentIdOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentIdOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each record
     * based on a unique internal identifier. The generated document ID is stable across multiple delivery attempts,
     * which helps prevent the same record from being indexed multiple times with different document IDs.
     * </p>
     * <p>
     * When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the requests
     * it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to generate document
     * IDs. In case of multiple delivery attempts, this may cause the same record to be indexed more than once with
     * different document IDs. This option enables write-heavy operations, such as the ingestion of logs and
     * observability data, to consume less resources in the Amazon OpenSearch Service domain, resulting in improved
     * performance.
     * </p>
     */
    private String defaultDocumentIdFormat;

    /**
     * <p>
     * When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each record
     * based on a unique internal identifier. The generated document ID is stable across multiple delivery attempts,
     * which helps prevent the same record from being indexed multiple times with different document IDs.
     * </p>
     * <p>
     * When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the requests
     * it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to generate document
     * IDs. In case of multiple delivery attempts, this may cause the same record to be indexed more than once with
     * different document IDs. This option enables write-heavy operations, such as the ingestion of logs and
     * observability data, to consume less resources in the Amazon OpenSearch Service domain, resulting in improved
     * performance.
     * </p>
     * 
     * @param defaultDocumentIdFormat
     *        When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each
     *        record based on a unique internal identifier. The generated document ID is stable across multiple delivery
     *        attempts, which helps prevent the same record from being indexed multiple times with different document
     *        IDs.</p>
     *        <p>
     *        When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the
     *        requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to
     *        generate document IDs. In case of multiple delivery attempts, this may cause the same record to be indexed
     *        more than once with different document IDs. This option enables write-heavy operations, such as the
     *        ingestion of logs and observability data, to consume less resources in the Amazon OpenSearch Service
     *        domain, resulting in improved performance.
     * @see DefaultDocumentIdFormat
     */

    public void setDefaultDocumentIdFormat(String defaultDocumentIdFormat) {
        this.defaultDocumentIdFormat = defaultDocumentIdFormat;
    }

    /**
     * <p>
     * When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each record
     * based on a unique internal identifier. The generated document ID is stable across multiple delivery attempts,
     * which helps prevent the same record from being indexed multiple times with different document IDs.
     * </p>
     * <p>
     * When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the requests
     * it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to generate document
     * IDs. In case of multiple delivery attempts, this may cause the same record to be indexed more than once with
     * different document IDs. This option enables write-heavy operations, such as the ingestion of logs and
     * observability data, to consume less resources in the Amazon OpenSearch Service domain, resulting in improved
     * performance.
     * </p>
     * 
     * @return When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each
     *         record based on a unique internal identifier. The generated document ID is stable across multiple
     *         delivery attempts, which helps prevent the same record from being indexed multiple times with different
     *         document IDs.</p>
     *         <p>
     *         When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the
     *         requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to
     *         generate document IDs. In case of multiple delivery attempts, this may cause the same record to be
     *         indexed more than once with different document IDs. This option enables write-heavy operations, such as
     *         the ingestion of logs and observability data, to consume less resources in the Amazon OpenSearch Service
     *         domain, resulting in improved performance.
     * @see DefaultDocumentIdFormat
     */

    public String getDefaultDocumentIdFormat() {
        return this.defaultDocumentIdFormat;
    }

    /**
     * <p>
     * When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each record
     * based on a unique internal identifier. The generated document ID is stable across multiple delivery attempts,
     * which helps prevent the same record from being indexed multiple times with different document IDs.
     * </p>
     * <p>
     * When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the requests
     * it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to generate document
     * IDs. In case of multiple delivery attempts, this may cause the same record to be indexed more than once with
     * different document IDs. This option enables write-heavy operations, such as the ingestion of logs and
     * observability data, to consume less resources in the Amazon OpenSearch Service domain, resulting in improved
     * performance.
     * </p>
     * 
     * @param defaultDocumentIdFormat
     *        When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each
     *        record based on a unique internal identifier. The generated document ID is stable across multiple delivery
     *        attempts, which helps prevent the same record from being indexed multiple times with different document
     *        IDs.</p>
     *        <p>
     *        When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the
     *        requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to
     *        generate document IDs. In case of multiple delivery attempts, this may cause the same record to be indexed
     *        more than once with different document IDs. This option enables write-heavy operations, such as the
     *        ingestion of logs and observability data, to consume less resources in the Amazon OpenSearch Service
     *        domain, resulting in improved performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultDocumentIdFormat
     */

    public DocumentIdOptions withDefaultDocumentIdFormat(String defaultDocumentIdFormat) {
        setDefaultDocumentIdFormat(defaultDocumentIdFormat);
        return this;
    }

    /**
     * <p>
     * When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each record
     * based on a unique internal identifier. The generated document ID is stable across multiple delivery attempts,
     * which helps prevent the same record from being indexed multiple times with different document IDs.
     * </p>
     * <p>
     * When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the requests
     * it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to generate document
     * IDs. In case of multiple delivery attempts, this may cause the same record to be indexed more than once with
     * different document IDs. This option enables write-heavy operations, such as the ingestion of logs and
     * observability data, to consume less resources in the Amazon OpenSearch Service domain, resulting in improved
     * performance.
     * </p>
     * 
     * @param defaultDocumentIdFormat
     *        When the <code>FIREHOSE_DEFAULT</code> option is chosen, Firehose generates a unique document ID for each
     *        record based on a unique internal identifier. The generated document ID is stable across multiple delivery
     *        attempts, which helps prevent the same record from being indexed multiple times with different document
     *        IDs.</p>
     *        <p>
     *        When the <code>NO_DOCUMENT_ID</code> option is chosen, Firehose does not include any document IDs in the
     *        requests it sends to the Amazon OpenSearch Service. This causes the Amazon OpenSearch Service domain to
     *        generate document IDs. In case of multiple delivery attempts, this may cause the same record to be indexed
     *        more than once with different document IDs. This option enables write-heavy operations, such as the
     *        ingestion of logs and observability data, to consume less resources in the Amazon OpenSearch Service
     *        domain, resulting in improved performance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultDocumentIdFormat
     */

    public DocumentIdOptions withDefaultDocumentIdFormat(DefaultDocumentIdFormat defaultDocumentIdFormat) {
        this.defaultDocumentIdFormat = defaultDocumentIdFormat.toString();
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
        if (getDefaultDocumentIdFormat() != null)
            sb.append("DefaultDocumentIdFormat: ").append(getDefaultDocumentIdFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentIdOptions == false)
            return false;
        DocumentIdOptions other = (DocumentIdOptions) obj;
        if (other.getDefaultDocumentIdFormat() == null ^ this.getDefaultDocumentIdFormat() == null)
            return false;
        if (other.getDefaultDocumentIdFormat() != null && other.getDefaultDocumentIdFormat().equals(this.getDefaultDocumentIdFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultDocumentIdFormat() == null) ? 0 : getDefaultDocumentIdFormat().hashCode());
        return hashCode;
    }

    @Override
    public DocumentIdOptions clone() {
        try {
            return (DocumentIdOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.DocumentIdOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
