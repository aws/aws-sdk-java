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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An augmented manifest file that provides training data for your custom model. An augmented manifest file is a labeled
 * dataset that is produced by Amazon SageMaker Ground Truth.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DatasetAugmentedManifestsListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetAugmentedManifestsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training documents. The number of attribute names that
     * you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained
     * labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the
     * job was created in Ground Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in
     * the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * </p>
     */
    private java.util.List<String> attributeNames;
    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented manifest file.
     * </p>
     */
    private String annotationDataS3Uri;
    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     * </p>
     */
    private String sourceDocumentsS3Uri;
    /**
     * <p>
     * The type of augmented manifest. If you don't specify, the default is PlainTextDocument.
     * </p>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in UTF-8.
     * </p>
     */
    private String documentType;

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training documents. The number of attribute names that
     * you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained
     * labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the
     * job was created in Ground Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in
     * the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * </p>
     * 
     * @return The JSON attribute that contains the annotations for your training documents. The number of attribute
     *         names that you specify depends on whether your augmented manifest file is the output of a single labeling
     *         job or a chained labeling job.</p>
     *         <p>
     *         If your file is the output of a single labeling job, specify the LabelAttributeName key that was used
     *         when the job was created in Ground Truth.
     *         </p>
     *         <p>
     *         If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more
     *         jobs in the chain. Each LabelAttributeName key provides the annotations from an individual job.
     */

    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training documents. The number of attribute names that
     * you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained
     * labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the
     * job was created in Ground Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in
     * the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * </p>
     * 
     * @param attributeNames
     *        The JSON attribute that contains the annotations for your training documents. The number of attribute
     *        names that you specify depends on whether your augmented manifest file is the output of a single labeling
     *        job or a chained labeling job.</p>
     *        <p>
     *        If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when
     *        the job was created in Ground Truth.
     *        </p>
     *        <p>
     *        If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more
     *        jobs in the chain. Each LabelAttributeName key provides the annotations from an individual job.
     */

    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training documents. The number of attribute names that
     * you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained
     * labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the
     * job was created in Ground Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in
     * the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeNames(java.util.Collection)} or {@link #withAttributeNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param attributeNames
     *        The JSON attribute that contains the annotations for your training documents. The number of attribute
     *        names that you specify depends on whether your augmented manifest file is the output of a single labeling
     *        job or a chained labeling job.</p>
     *        <p>
     *        If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when
     *        the job was created in Ground Truth.
     *        </p>
     *        <p>
     *        If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more
     *        jobs in the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAugmentedManifestsListItem withAttributeNames(String... attributeNames) {
        if (this.attributeNames == null) {
            setAttributeNames(new java.util.ArrayList<String>(attributeNames.length));
        }
        for (String ele : attributeNames) {
            this.attributeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training documents. The number of attribute names that
     * you specify depends on whether your augmented manifest file is the output of a single labeling job or a chained
     * labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when the
     * job was created in Ground Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more jobs in
     * the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * </p>
     * 
     * @param attributeNames
     *        The JSON attribute that contains the annotations for your training documents. The number of attribute
     *        names that you specify depends on whether your augmented manifest file is the output of a single labeling
     *        job or a chained labeling job.</p>
     *        <p>
     *        If your file is the output of a single labeling job, specify the LabelAttributeName key that was used when
     *        the job was created in Ground Truth.
     *        </p>
     *        <p>
     *        If your file is the output of a chained labeling job, specify the LabelAttributeName key for one or more
     *        jobs in the chain. Each LabelAttributeName key provides the annotations from an individual job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAugmentedManifestsListItem withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 location of the augmented manifest file.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * 
     * @return The Amazon S3 location of the augmented manifest file.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 location of the augmented manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAugmentedManifestsListItem withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented manifest file.
     * </p>
     * 
     * @param annotationDataS3Uri
     *        The S3 prefix to the annotation files that are referred in the augmented manifest file.
     */

    public void setAnnotationDataS3Uri(String annotationDataS3Uri) {
        this.annotationDataS3Uri = annotationDataS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented manifest file.
     * </p>
     * 
     * @return The S3 prefix to the annotation files that are referred in the augmented manifest file.
     */

    public String getAnnotationDataS3Uri() {
        return this.annotationDataS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented manifest file.
     * </p>
     * 
     * @param annotationDataS3Uri
     *        The S3 prefix to the annotation files that are referred in the augmented manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAugmentedManifestsListItem withAnnotationDataS3Uri(String annotationDataS3Uri) {
        setAnnotationDataS3Uri(annotationDataS3Uri);
        return this;
    }

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     * </p>
     * 
     * @param sourceDocumentsS3Uri
     *        The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     */

    public void setSourceDocumentsS3Uri(String sourceDocumentsS3Uri) {
        this.sourceDocumentsS3Uri = sourceDocumentsS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     * </p>
     * 
     * @return The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     */

    public String getSourceDocumentsS3Uri() {
        return this.sourceDocumentsS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     * </p>
     * 
     * @param sourceDocumentsS3Uri
     *        The S3 prefix to the source files (PDFs) that are referred to in the augmented manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetAugmentedManifestsListItem withSourceDocumentsS3Uri(String sourceDocumentsS3Uri) {
        setSourceDocumentsS3Uri(sourceDocumentsS3Uri);
        return this;
    }

    /**
     * <p>
     * The type of augmented manifest. If you don't specify, the default is PlainTextDocument.
     * </p>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in UTF-8.
     * </p>
     * 
     * @param documentType
     *        The type of augmented manifest. If you don't specify, the default is PlainTextDocument. </p>
     *        <p>
     *        <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in
     *        UTF-8.
     * @see AugmentedManifestsDocumentTypeFormat
     */

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of augmented manifest. If you don't specify, the default is PlainTextDocument.
     * </p>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in UTF-8.
     * </p>
     * 
     * @return The type of augmented manifest. If you don't specify, the default is PlainTextDocument. </p>
     *         <p>
     *         <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in
     *         UTF-8.
     * @see AugmentedManifestsDocumentTypeFormat
     */

    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * <p>
     * The type of augmented manifest. If you don't specify, the default is PlainTextDocument.
     * </p>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in UTF-8.
     * </p>
     * 
     * @param documentType
     *        The type of augmented manifest. If you don't specify, the default is PlainTextDocument. </p>
     *        <p>
     *        <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in
     *        UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AugmentedManifestsDocumentTypeFormat
     */

    public DatasetAugmentedManifestsListItem withDocumentType(String documentType) {
        setDocumentType(documentType);
        return this;
    }

    /**
     * <p>
     * The type of augmented manifest. If you don't specify, the default is PlainTextDocument.
     * </p>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in UTF-8.
     * </p>
     * 
     * @param documentType
     *        The type of augmented manifest. If you don't specify, the default is PlainTextDocument. </p>
     *        <p>
     *        <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any unicode text that is encoded in
     *        UTF-8.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AugmentedManifestsDocumentTypeFormat
     */

    public DatasetAugmentedManifestsListItem withDocumentType(AugmentedManifestsDocumentTypeFormat documentType) {
        this.documentType = documentType.toString();
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
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getAnnotationDataS3Uri() != null)
            sb.append("AnnotationDataS3Uri: ").append(getAnnotationDataS3Uri()).append(",");
        if (getSourceDocumentsS3Uri() != null)
            sb.append("SourceDocumentsS3Uri: ").append(getSourceDocumentsS3Uri()).append(",");
        if (getDocumentType() != null)
            sb.append("DocumentType: ").append(getDocumentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetAugmentedManifestsListItem == false)
            return false;
        DatasetAugmentedManifestsListItem other = (DatasetAugmentedManifestsListItem) obj;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getAnnotationDataS3Uri() == null ^ this.getAnnotationDataS3Uri() == null)
            return false;
        if (other.getAnnotationDataS3Uri() != null && other.getAnnotationDataS3Uri().equals(this.getAnnotationDataS3Uri()) == false)
            return false;
        if (other.getSourceDocumentsS3Uri() == null ^ this.getSourceDocumentsS3Uri() == null)
            return false;
        if (other.getSourceDocumentsS3Uri() != null && other.getSourceDocumentsS3Uri().equals(this.getSourceDocumentsS3Uri()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getAnnotationDataS3Uri() == null) ? 0 : getAnnotationDataS3Uri().hashCode());
        hashCode = prime * hashCode + ((getSourceDocumentsS3Uri() == null) ? 0 : getSourceDocumentsS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
        return hashCode;
    }

    @Override
    public DatasetAugmentedManifestsListItem clone() {
        try {
            return (DatasetAugmentedManifestsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DatasetAugmentedManifestsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
