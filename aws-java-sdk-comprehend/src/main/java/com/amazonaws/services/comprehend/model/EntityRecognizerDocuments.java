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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the training documents submitted with an entity recognizer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EntityRecognizerDocuments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerDocuments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     * 
     * @param s3Uri
     *        Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The
     *        URI must be in the same region as the API endpoint that you are calling.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     * 
     * @return Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The
     *         URI must be in the same region as the API endpoint that you are calling.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must
     * be in the same region as the API endpoint that you are calling.
     * </p>
     * 
     * @param s3Uri
     *        Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The
     *        URI must be in the same region as the API endpoint that you are calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EntityRecognizerDocuments withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerDocuments == false)
            return false;
        EntityRecognizerDocuments other = (EntityRecognizerDocuments) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public EntityRecognizerDocuments clone() {
        try {
            return (EntityRecognizerDocuments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EntityRecognizerDocumentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
