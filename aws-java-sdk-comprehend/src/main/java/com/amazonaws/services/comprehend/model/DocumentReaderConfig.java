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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides configuration parameters to override the default actions for extracting text from PDF documents and image
 * files.
 * </p>
 * <p>
 * By default, Amazon Comprehend performs the following actions to extract text from files, based on the input file
 * type:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Word files</b> - Amazon Comprehend parser extracts the text.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Digital PDF files</b> - Amazon Comprehend parser extracts the text.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Image files and scanned PDF files</b> - Amazon Comprehend uses the Amazon Textract <code>DetectDocumentText</code>
 * API to extract the text.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <code>DocumentReaderConfig</code> does not apply to plain text files or Word files.
 * </p>
 * <p>
 * For image files and PDF documents, you can override these default actions using the fields listed below. For more
 * information, see <a href="https://docs.aws.amazon.com/comprehend/latest/dg/detecting-cer.html#detecting-cer-pdf">
 * Setting text extraction options</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentReaderConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentReaderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files
     * and image files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     * <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code> API
     * operation.
     * </p>
     * </li>
     * </ul>
     */
    private String documentReadAction;
    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by DocumentReadAction
     * for all PDF files, including digital PDF files.
     * </p>
     * </li>
     * </ul>
     */
    private String documentReadMode;
    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as
     * the read action, you must specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> featureTypes;

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files
     * and image files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     * <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code> API
     * operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadAction
     *        This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF
     *        files and image files. Enter one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     *        <code>DetectDocumentText</code> API operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the
     *        <code>AnalyzeDocument</code> API operation.
     *        </p>
     *        </li>
     * @see DocumentReadAction
     */

    public void setDocumentReadAction(String documentReadAction) {
        this.documentReadAction = documentReadAction;
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files
     * and image files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     * <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code> API
     * operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF
     *         files and image files. Enter one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     *         <code>DetectDocumentText</code> API operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the
     *         <code>AnalyzeDocument</code> API operation.
     *         </p>
     *         </li>
     * @see DocumentReadAction
     */

    public String getDocumentReadAction() {
        return this.documentReadAction;
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files
     * and image files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     * <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code> API
     * operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadAction
     *        This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF
     *        files and image files. Enter one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     *        <code>DetectDocumentText</code> API operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the
     *        <code>AnalyzeDocument</code> API operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadAction
     */

    public DocumentReaderConfig withDocumentReadAction(String documentReadAction) {
        setDocumentReadAction(documentReadAction);
        return this;
    }

    /**
     * <p>
     * This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF files
     * and image files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     * <code>DetectDocumentText</code> API operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the <code>AnalyzeDocument</code> API
     * operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadAction
     *        This field defines the Amazon Textract API operation that Amazon Comprehend uses to extract text from PDF
     *        files and image files. Enter one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_DETECT_DOCUMENT_TEXT</code> - The Amazon Comprehend service uses the
     *        <code>DetectDocumentText</code> API operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> - The Amazon Comprehend service uses the
     *        <code>AnalyzeDocument</code> API operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadAction
     */

    public DocumentReaderConfig withDocumentReadAction(DocumentReadAction documentReadAction) {
        this.documentReadAction = documentReadAction.toString();
        return this;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by DocumentReadAction
     * for all PDF files, including digital PDF files.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadMode
     *        Determines the text extraction actions for PDF files. Enter one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by
     *        DocumentReadAction for all PDF files, including digital PDF files.
     *        </p>
     *        </li>
     * @see DocumentReadMode
     */

    public void setDocumentReadMode(String documentReadMode) {
        this.documentReadMode = documentReadMode;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by DocumentReadAction
     * for all PDF files, including digital PDF files.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Determines the text extraction actions for PDF files. Enter one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by
     *         DocumentReadAction for all PDF files, including digital PDF files.
     *         </p>
     *         </li>
     * @see DocumentReadMode
     */

    public String getDocumentReadMode() {
        return this.documentReadMode;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by DocumentReadAction
     * for all PDF files, including digital PDF files.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadMode
     *        Determines the text extraction actions for PDF files. Enter one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by
     *        DocumentReadAction for all PDF files, including digital PDF files.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadMode
     */

    public DocumentReaderConfig withDocumentReadMode(String documentReadMode) {
        setDocumentReadMode(documentReadMode);
        return this;
    }

    /**
     * <p>
     * Determines the text extraction actions for PDF files. Enter one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by DocumentReadAction
     * for all PDF files, including digital PDF files.
     * </p>
     * </li>
     * </ul>
     * 
     * @param documentReadMode
     *        Determines the text extraction actions for PDF files. Enter one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SERVICE_DEFAULT</code> - use the Amazon Comprehend service defaults for PDF files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DOCUMENT_READ_ACTION</code> - Amazon Comprehend uses the Textract API specified by
     *        DocumentReadAction for all PDF files, including digital PDF files.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadMode
     */

    public DocumentReaderConfig withDocumentReadMode(DocumentReadMode documentReadMode) {
        this.documentReadMode = documentReadMode.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as
     * the read action, you must specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of Amazon Textract features to apply. If you chose
     *         <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must specify one or both of the following
     *         values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORMS</code> - Returns information and the data from any forms that are detected in the input
     *         document.
     *         </p>
     *         </li>
     * @see DocumentReadFeatureTypes
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as
     * the read action, you must specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureTypes
     *        Specifies the type of Amazon Textract features to apply. If you chose
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must specify one or both of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORMS</code> - Returns information and the data from any forms that are detected in the input
     *        document.
     *        </p>
     *        </li>
     * @see DocumentReadFeatureTypes
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
     * Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as
     * the read action, you must specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        Specifies the type of Amazon Textract features to apply. If you chose
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must specify one or both of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORMS</code> - Returns information and the data from any forms that are detected in the input
     *        document.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadFeatureTypes
     */

    public DocumentReaderConfig withFeatureTypes(String... featureTypes) {
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
     * Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as
     * the read action, you must specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureTypes
     *        Specifies the type of Amazon Textract features to apply. If you chose
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must specify one or both of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORMS</code> - Returns information and the data from any forms that are detected in the input
     *        document.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadFeatureTypes
     */

    public DocumentReaderConfig withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * Specifies the type of Amazon Textract features to apply. If you chose <code>TEXTRACT_ANALYZE_DOCUMENT</code> as
     * the read action, you must specify one or both of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORMS</code> - Returns information and the data from any forms that are detected in the input document.
     * </p>
     * </li>
     * </ul>
     * 
     * @param featureTypes
     *        Specifies the type of Amazon Textract features to apply. If you chose
     *        <code>TEXTRACT_ANALYZE_DOCUMENT</code> as the read action, you must specify one or both of the following
     *        values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TABLES</code> - Returns information about any tables that are detected in the input document.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORMS</code> - Returns information and the data from any forms that are detected in the input
     *        document.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DocumentReadFeatureTypes
     */

    public DocumentReaderConfig withFeatureTypes(DocumentReadFeatureTypes... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (DocumentReadFeatureTypes value : featureTypes) {
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
        if (getDocumentReadAction() != null)
            sb.append("DocumentReadAction: ").append(getDocumentReadAction()).append(",");
        if (getDocumentReadMode() != null)
            sb.append("DocumentReadMode: ").append(getDocumentReadMode()).append(",");
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

        if (obj instanceof DocumentReaderConfig == false)
            return false;
        DocumentReaderConfig other = (DocumentReaderConfig) obj;
        if (other.getDocumentReadAction() == null ^ this.getDocumentReadAction() == null)
            return false;
        if (other.getDocumentReadAction() != null && other.getDocumentReadAction().equals(this.getDocumentReadAction()) == false)
            return false;
        if (other.getDocumentReadMode() == null ^ this.getDocumentReadMode() == null)
            return false;
        if (other.getDocumentReadMode() != null && other.getDocumentReadMode().equals(this.getDocumentReadMode()) == false)
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

        hashCode = prime * hashCode + ((getDocumentReadAction() == null) ? 0 : getDocumentReadAction().hashCode());
        hashCode = prime * hashCode + ((getDocumentReadMode() == null) ? 0 : getDocumentReadMode().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        return hashCode;
    }

    @Override
    public DocumentReaderConfig clone() {
        try {
            return (DocumentReaderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentReaderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
