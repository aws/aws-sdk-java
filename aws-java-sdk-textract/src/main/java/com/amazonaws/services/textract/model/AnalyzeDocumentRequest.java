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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/AnalyzeDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzeDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     * detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * </p>
     */
    private java.util.List<String> featureTypes;

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

    public AnalyzeDocumentRequest withDocument(Document document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     * detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * </p>
     * 
     * @return A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *         detected in the input document. Add FORMS to return detected fields and the associated text. To perform
     *         both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     * detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        detected in the input document. Add FORMS to return detected fields and the associated text. To perform
     *        both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * @see FeatureType
     */

    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     * detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        detected in the input document. Add FORMS to return detected fields and the associated text. To perform
     *        both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AnalyzeDocumentRequest withFeatureTypes(String... featureTypes) {
        if (this.featureTypes == null) {
            setFeatureTypes(new java.util.ArrayList<String>(featureTypes.length));
        }
        for (String ele : featureTypes) {
            this.featureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     * detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        detected in the input document. Add FORMS to return detected fields and the associated text. To perform
     *        both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AnalyzeDocumentRequest withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     * detected in the input document. Add FORMS to return detected fields and the associated text. To perform both
     * types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * </p>
     * 
     * @param featureTypes
     *        A list of the types of analysis to perform. Add TABLES to the list to return information about the tables
     *        detected in the input document. Add FORMS to return detected fields and the associated text. To perform
     *        both types of analysis, add TABLES and FORMS to <code>FeatureTypes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public AnalyzeDocumentRequest withFeatureTypes(FeatureType... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (FeatureType value : featureTypes) {
            featureTypesCopy.add(value.toString());
        }
        if (getFeatureTypes() == null) {
            setFeatureTypes(featureTypesCopy);
        } else {
            getFeatureTypes().addAll(featureTypesCopy);
        }
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
            sb.append("Document: ").append(getDocument()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyzeDocumentRequest == false)
            return false;
        AnalyzeDocumentRequest other = (AnalyzeDocumentRequest) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public AnalyzeDocumentRequest clone() {
        return (AnalyzeDocumentRequest) super.clone();
    }

}
