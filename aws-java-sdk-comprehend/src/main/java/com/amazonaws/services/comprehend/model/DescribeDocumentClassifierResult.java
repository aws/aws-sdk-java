/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DescribeDocumentClassifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDocumentClassifierResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains the properties associated with a document classifier.
     * </p>
     */
    private DocumentClassifierProperties documentClassifierProperties;

    /**
     * <p>
     * An object that contains the properties associated with a document classifier.
     * </p>
     * 
     * @param documentClassifierProperties
     *        An object that contains the properties associated with a document classifier.
     */

    public void setDocumentClassifierProperties(DocumentClassifierProperties documentClassifierProperties) {
        this.documentClassifierProperties = documentClassifierProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a document classifier.
     * </p>
     * 
     * @return An object that contains the properties associated with a document classifier.
     */

    public DocumentClassifierProperties getDocumentClassifierProperties() {
        return this.documentClassifierProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a document classifier.
     * </p>
     * 
     * @param documentClassifierProperties
     *        An object that contains the properties associated with a document classifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDocumentClassifierResult withDocumentClassifierProperties(DocumentClassifierProperties documentClassifierProperties) {
        setDocumentClassifierProperties(documentClassifierProperties);
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
        if (getDocumentClassifierProperties() != null)
            sb.append("DocumentClassifierProperties: ").append(getDocumentClassifierProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDocumentClassifierResult == false)
            return false;
        DescribeDocumentClassifierResult other = (DescribeDocumentClassifierResult) obj;
        if (other.getDocumentClassifierProperties() == null ^ this.getDocumentClassifierProperties() == null)
            return false;
        if (other.getDocumentClassifierProperties() != null && other.getDocumentClassifierProperties().equals(this.getDocumentClassifierProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentClassifierProperties() == null) ? 0 : getDocumentClassifierProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDocumentClassifierResult clone() {
        try {
            return (DescribeDocumentClassifierResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
