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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/DetectDocumentText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectDocumentTextRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract
     * operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
     * </p>
     */
    private Document document;

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract
     * operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
     * </p>
     * 
     * @param document
     *        The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon
     *        Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.</p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field.
     */

    public void setDocument(Document document) {
        this.document = document;
    }

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract
     * operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
     * </p>
     * 
     * @return The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon
     *         Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.</p>
     *         <p>
     *         If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes
     *         passed using the <code>Bytes</code> field.
     */

    public Document getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract
     * operations, you can't pass image bytes. The document must be an image in JPG or PNG format.
     * </p>
     * <p>
     * If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes passed using
     * the <code>Bytes</code> field.
     * </p>
     * 
     * @param document
     *        The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon
     *        Textract operations, you can't pass image bytes. The document must be an image in JPG or PNG format.</p>
     *        <p>
     *        If you are using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes
     *        passed using the <code>Bytes</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectDocumentTextRequest withDocument(Document document) {
        setDocument(document);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectDocumentTextRequest == false)
            return false;
        DetectDocumentTextRequest other = (DetectDocumentTextRequest) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public DetectDocumentTextRequest clone() {
        return (DetectDocumentTextRequest) super.clone();
    }

}
