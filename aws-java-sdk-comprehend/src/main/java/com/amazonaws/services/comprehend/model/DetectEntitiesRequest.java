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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectEntitiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use the
     * <code>Bytes</code> parameter.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend.
     * If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language
     * of your custom model, and it ignores any language code that you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide an
     * endpoint if you want to detect entities by using your own custom model instead of the default model that is used
     * by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any language
     * code that you provide in your request.
     * </p>
     * <p>
     * For information about endpoints, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * This field applies only when you use a custom entity recognition model that was trained with PDF annotations. For
     * other cases, enter your text input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in the
     * <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the <code>Entities</code>
     * field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services SDK to
     * detect entities, the SDK may encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For details, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     * analysis</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     * </p>
     */
    private java.nio.ByteBuffer bytes;
    /**
     * <p>
     * Provides configuration parameters to override the default actions for extracting text from PDF documents and
     * image files.
     * </p>
     */
    private DocumentReaderConfig documentReaderConfig;

    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use the
     * <code>Bytes</code> parameter.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use
     *        the <code>Bytes</code> parameter.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use the
     * <code>Bytes</code> parameter.
     * </p>
     * 
     * @return A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not
     *         use the <code>Bytes</code> parameter.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use the
     * <code>Bytes</code> parameter.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string. The maximum string size is 100 KB. If you enter text using this parameter, do not use
     *        the <code>Bytes</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend.
     * If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language
     * of your custom model, and it ignores any language code that you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify any of the primary languages supported by Amazon
     *        Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend
     *        uses the language of your custom model, and it ignores any language code that you specify here.</p>
     *        <p>
     *        All input documents must be in the same language.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend.
     * If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language
     * of your custom model, and it ignores any language code that you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * 
     * @return The language of the input documents. You can specify any of the primary languages supported by Amazon
     *         Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon
     *         Comprehend uses the language of your custom model, and it ignores any language code that you specify
     *         here.</p>
     *         <p>
     *         All input documents must be in the same language.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend.
     * If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language
     * of your custom model, and it ignores any language code that you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify any of the primary languages supported by Amazon
     *        Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend
     *        uses the language of your custom model, and it ignores any language code that you specify here.</p>
     *        <p>
     *        All input documents must be in the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DetectEntitiesRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary languages supported by Amazon Comprehend.
     * If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend uses the language
     * of your custom model, and it ignores any language code that you specify here.
     * </p>
     * <p>
     * All input documents must be in the same language.
     * </p>
     * 
     * @param languageCode
     *        The language of the input documents. You can specify any of the primary languages supported by Amazon
     *        Comprehend. If your request includes the endpoint for a custom entity recognition model, Amazon Comprehend
     *        uses the language of your custom model, and it ignores any language code that you specify here.</p>
     *        <p>
     *        All input documents must be in the same language.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DetectEntitiesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide an
     * endpoint if you want to detect entities by using your own custom model instead of the default model that is used
     * by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any language
     * code that you provide in your request.
     * </p>
     * <p>
     * For information about endpoints, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide
     *        an endpoint if you want to detect entities by using your own custom model instead of the default model
     *        that is used by Amazon Comprehend.</p>
     *        <p>
     *        If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any
     *        language code that you provide in your request.
     *        </p>
     *        <p>
     *        For information about endpoints, see <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide an
     * endpoint if you want to detect entities by using your own custom model instead of the default model that is used
     * by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any language
     * code that you provide in your request.
     * </p>
     * <p>
     * For information about endpoints, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     * </p>
     * 
     * @return The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model.
     *         Provide an endpoint if you want to detect entities by using your own custom model instead of the default
     *         model that is used by Amazon Comprehend.</p>
     *         <p>
     *         If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any
     *         language code that you provide in your request.
     *         </p>
     *         <p>
     *         For information about endpoints, see <a
     *         href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide an
     * endpoint if you want to detect entities by using your own custom model instead of the default model that is used
     * by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any language
     * code that you provide in your request.
     * </p>
     * <p>
     * For information about endpoints, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name of an endpoint that is associated with a custom entity recognition model. Provide
     *        an endpoint if you want to detect entities by using your own custom model instead of the default model
     *        that is used by Amazon Comprehend.</p>
     *        <p>
     *        If you specify an endpoint, Amazon Comprehend uses the language of your custom model, and it ignores any
     *        language code that you provide in your request.
     *        </p>
     *        <p>
     *        For information about endpoints, see <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html">Managing endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesRequest withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * This field applies only when you use a custom entity recognition model that was trained with PDF annotations. For
     * other cases, enter your text input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in the
     * <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the <code>Entities</code>
     * field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services SDK to
     * detect entities, the SDK may encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For details, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     * analysis</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param bytes
     *        This field applies only when you use a custom entity recognition model that was trained with PDF
     *        annotations. For other cases, enter your text input in the <code>Text</code> field.</p>
     *        <p>
     *        Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in
     *        the <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the
     *        <code>Entities</code> field in the response is identical).
     *        </p>
     *        <p>
     *        You can also use the <code>Bytes</code> parameter to input an Amazon Textract
     *        <code>DetectDocumentText</code> or <code>AnalyzeDocument</code> output file.
     *        </p>
     *        <p>
     *        Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services
     *        SDK to detect entities, the SDK may encode the document file bytes for you.
     *        </p>
     *        <p>
     *        The maximum length of this field depends on the input document type. For details, see <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     *        analysis</a> in the Comprehend Developer Guide.
     *        </p>
     *        <p>
     *        If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     */

    public void setBytes(java.nio.ByteBuffer bytes) {
        this.bytes = bytes;
    }

    /**
     * <p>
     * This field applies only when you use a custom entity recognition model that was trained with PDF annotations. For
     * other cases, enter your text input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in the
     * <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the <code>Entities</code>
     * field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services SDK to
     * detect entities, the SDK may encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For details, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     * analysis</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return This field applies only when you use a custom entity recognition model that was trained with PDF
     *         annotations. For other cases, enter your text input in the <code>Text</code> field.</p>
     *         <p>
     *         Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in
     *         the <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the
     *         <code>Entities</code> field in the response is identical).
     *         </p>
     *         <p>
     *         You can also use the <code>Bytes</code> parameter to input an Amazon Textract
     *         <code>DetectDocumentText</code> or <code>AnalyzeDocument</code> output file.
     *         </p>
     *         <p>
     *         Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web
     *         Services SDK to detect entities, the SDK may encode the document file bytes for you.
     *         </p>
     *         <p>
     *         The maximum length of this field depends on the input document type. For details, see <a
     *         href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     *         analysis</a> in the Comprehend Developer Guide.
     *         </p>
     *         <p>
     *         If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     */

    public java.nio.ByteBuffer getBytes() {
        return this.bytes;
    }

    /**
     * <p>
     * This field applies only when you use a custom entity recognition model that was trained with PDF annotations. For
     * other cases, enter your text input in the <code>Text</code> field.
     * </p>
     * <p>
     * Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in the
     * <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the <code>Entities</code>
     * field in the response is identical).
     * </p>
     * <p>
     * You can also use the <code>Bytes</code> parameter to input an Amazon Textract <code>DetectDocumentText</code> or
     * <code>AnalyzeDocument</code> output file.
     * </p>
     * <p>
     * Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services SDK to
     * detect entities, the SDK may encode the document file bytes for you.
     * </p>
     * <p>
     * The maximum length of this field depends on the input document type. For details, see <a
     * href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     * analysis</a> in the Comprehend Developer Guide.
     * </p>
     * <p>
     * If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param bytes
     *        This field applies only when you use a custom entity recognition model that was trained with PDF
     *        annotations. For other cases, enter your text input in the <code>Text</code> field.</p>
     *        <p>
     *        Use the <code>Bytes</code> parameter to input a text, PDF, Word or image file. Using a plain-text file in
     *        the <code>Bytes</code> parameter is equivelent to using the <code>Text</code> parameter (the
     *        <code>Entities</code> field in the response is identical).
     *        </p>
     *        <p>
     *        You can also use the <code>Bytes</code> parameter to input an Amazon Textract
     *        <code>DetectDocumentText</code> or <code>AnalyzeDocument</code> output file.
     *        </p>
     *        <p>
     *        Provide the input document as a sequence of base64-encoded bytes. If your code uses an Amazon Web Services
     *        SDK to detect entities, the SDK may encode the document file bytes for you.
     *        </p>
     *        <p>
     *        The maximum length of this field depends on the input document type. For details, see <a
     *        href="https://docs.aws.amazon.com/comprehend/latest/dg/idp-inputs-sync.html"> Inputs for real-time custom
     *        analysis</a> in the Comprehend Developer Guide.
     *        </p>
     *        <p>
     *        If you use the <code>Bytes</code> parameter, do not use the <code>Text</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesRequest withBytes(java.nio.ByteBuffer bytes) {
        setBytes(bytes);
        return this;
    }

    /**
     * <p>
     * Provides configuration parameters to override the default actions for extracting text from PDF documents and
     * image files.
     * </p>
     * 
     * @param documentReaderConfig
     *        Provides configuration parameters to override the default actions for extracting text from PDF documents
     *        and image files.
     */

    public void setDocumentReaderConfig(DocumentReaderConfig documentReaderConfig) {
        this.documentReaderConfig = documentReaderConfig;
    }

    /**
     * <p>
     * Provides configuration parameters to override the default actions for extracting text from PDF documents and
     * image files.
     * </p>
     * 
     * @return Provides configuration parameters to override the default actions for extracting text from PDF documents
     *         and image files.
     */

    public DocumentReaderConfig getDocumentReaderConfig() {
        return this.documentReaderConfig;
    }

    /**
     * <p>
     * Provides configuration parameters to override the default actions for extracting text from PDF documents and
     * image files.
     * </p>
     * 
     * @param documentReaderConfig
     *        Provides configuration parameters to override the default actions for extracting text from PDF documents
     *        and image files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectEntitiesRequest withDocumentReaderConfig(DocumentReaderConfig documentReaderConfig) {
        setDocumentReaderConfig(documentReaderConfig);
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
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***").append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getBytes() != null)
            sb.append("Bytes: ").append(getBytes()).append(",");
        if (getDocumentReaderConfig() != null)
            sb.append("DocumentReaderConfig: ").append(getDocumentReaderConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectEntitiesRequest == false)
            return false;
        DetectEntitiesRequest other = (DetectEntitiesRequest) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getBytes() == null ^ this.getBytes() == null)
            return false;
        if (other.getBytes() != null && other.getBytes().equals(this.getBytes()) == false)
            return false;
        if (other.getDocumentReaderConfig() == null ^ this.getDocumentReaderConfig() == null)
            return false;
        if (other.getDocumentReaderConfig() != null && other.getDocumentReaderConfig().equals(this.getDocumentReaderConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getBytes() == null) ? 0 : getBytes().hashCode());
        hashCode = prime * hashCode + ((getDocumentReaderConfig() == null) ? 0 : getDocumentReaderConfig().hashCode());
        return hashCode;
    }

    @Override
    public DetectEntitiesRequest clone() {
        return (DetectEntitiesRequest) super.clone();
    }

}
