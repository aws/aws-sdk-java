/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/AugmentedManifestsListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AugmentedManifestsListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     */
    private String s3Uri;
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

    public AugmentedManifestsListItem withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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

    public AugmentedManifestsListItem withAttributeNames(String... attributeNames) {
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

    public AugmentedManifestsListItem withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: ").append(getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AugmentedManifestsListItem == false)
            return false;
        AugmentedManifestsListItem other = (AugmentedManifestsListItem) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public AugmentedManifestsListItem clone() {
        try {
            return (AugmentedManifestsListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.AugmentedManifestsListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
