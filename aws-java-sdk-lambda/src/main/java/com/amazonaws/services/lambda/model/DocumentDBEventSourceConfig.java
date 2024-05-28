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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specific configuration settings for a DocumentDB event source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DocumentDBEventSourceConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentDBEventSourceConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database to consume within the DocumentDB cluster.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the collection to consume within the database. If you do not specify a collection, Lambda consumes
     * all collections.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * Determines what DocumentDB sends to your event stream during document update operations. If set to UpdateLookup,
     * DocumentDB sends a delta describing the changes, along with a copy of the entire document. Otherwise, DocumentDB
     * sends only a partial document that contains the changes.
     * </p>
     */
    private String fullDocument;

    /**
     * <p>
     * The name of the database to consume within the DocumentDB cluster.
     * </p>
     * 
     * @param databaseName
     *        The name of the database to consume within the DocumentDB cluster.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database to consume within the DocumentDB cluster.
     * </p>
     * 
     * @return The name of the database to consume within the DocumentDB cluster.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database to consume within the DocumentDB cluster.
     * </p>
     * 
     * @param databaseName
     *        The name of the database to consume within the DocumentDB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDBEventSourceConfig withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the collection to consume within the database. If you do not specify a collection, Lambda consumes
     * all collections.
     * </p>
     * 
     * @param collectionName
     *        The name of the collection to consume within the database. If you do not specify a collection, Lambda
     *        consumes all collections.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the collection to consume within the database. If you do not specify a collection, Lambda consumes
     * all collections.
     * </p>
     * 
     * @return The name of the collection to consume within the database. If you do not specify a collection, Lambda
     *         consumes all collections.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The name of the collection to consume within the database. If you do not specify a collection, Lambda consumes
     * all collections.
     * </p>
     * 
     * @param collectionName
     *        The name of the collection to consume within the database. If you do not specify a collection, Lambda
     *        consumes all collections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentDBEventSourceConfig withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * Determines what DocumentDB sends to your event stream during document update operations. If set to UpdateLookup,
     * DocumentDB sends a delta describing the changes, along with a copy of the entire document. Otherwise, DocumentDB
     * sends only a partial document that contains the changes.
     * </p>
     * 
     * @param fullDocument
     *        Determines what DocumentDB sends to your event stream during document update operations. If set to
     *        UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of the entire document.
     *        Otherwise, DocumentDB sends only a partial document that contains the changes.
     * @see FullDocument
     */

    public void setFullDocument(String fullDocument) {
        this.fullDocument = fullDocument;
    }

    /**
     * <p>
     * Determines what DocumentDB sends to your event stream during document update operations. If set to UpdateLookup,
     * DocumentDB sends a delta describing the changes, along with a copy of the entire document. Otherwise, DocumentDB
     * sends only a partial document that contains the changes.
     * </p>
     * 
     * @return Determines what DocumentDB sends to your event stream during document update operations. If set to
     *         UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of the entire document.
     *         Otherwise, DocumentDB sends only a partial document that contains the changes.
     * @see FullDocument
     */

    public String getFullDocument() {
        return this.fullDocument;
    }

    /**
     * <p>
     * Determines what DocumentDB sends to your event stream during document update operations. If set to UpdateLookup,
     * DocumentDB sends a delta describing the changes, along with a copy of the entire document. Otherwise, DocumentDB
     * sends only a partial document that contains the changes.
     * </p>
     * 
     * @param fullDocument
     *        Determines what DocumentDB sends to your event stream during document update operations. If set to
     *        UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of the entire document.
     *        Otherwise, DocumentDB sends only a partial document that contains the changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FullDocument
     */

    public DocumentDBEventSourceConfig withFullDocument(String fullDocument) {
        setFullDocument(fullDocument);
        return this;
    }

    /**
     * <p>
     * Determines what DocumentDB sends to your event stream during document update operations. If set to UpdateLookup,
     * DocumentDB sends a delta describing the changes, along with a copy of the entire document. Otherwise, DocumentDB
     * sends only a partial document that contains the changes.
     * </p>
     * 
     * @param fullDocument
     *        Determines what DocumentDB sends to your event stream during document update operations. If set to
     *        UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of the entire document.
     *        Otherwise, DocumentDB sends only a partial document that contains the changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FullDocument
     */

    public DocumentDBEventSourceConfig withFullDocument(FullDocument fullDocument) {
        this.fullDocument = fullDocument.toString();
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getFullDocument() != null)
            sb.append("FullDocument: ").append(getFullDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentDBEventSourceConfig == false)
            return false;
        DocumentDBEventSourceConfig other = (DocumentDBEventSourceConfig) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getFullDocument() == null ^ this.getFullDocument() == null)
            return false;
        if (other.getFullDocument() != null && other.getFullDocument().equals(this.getFullDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getFullDocument() == null) ? 0 : getFullDocument().hashCode());
        return hashCode;
    }

    @Override
    public DocumentDBEventSourceConfig clone() {
        try {
            return (DocumentDBEventSourceConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.DocumentDBEventSourceConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
