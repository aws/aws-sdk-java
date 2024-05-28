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
 * The location of the training documents. This parameter is required in a request to create a semi-structured document
 * classification model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentClassifierDocuments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassifierDocuments implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 URI location of the training documents specified in the S3Uri CSV file.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required if you
     * do not specify a test CSV file.
     * </p>
     */
    private String testS3Uri;

    /**
     * <p>
     * The S3 URI location of the training documents specified in the S3Uri CSV file.
     * </p>
     * 
     * @param s3Uri
     *        The S3 URI location of the training documents specified in the S3Uri CSV file.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The S3 URI location of the training documents specified in the S3Uri CSV file.
     * </p>
     * 
     * @return The S3 URI location of the training documents specified in the S3Uri CSV file.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The S3 URI location of the training documents specified in the S3Uri CSV file.
     * </p>
     * 
     * @param s3Uri
     *        The S3 URI location of the training documents specified in the S3Uri CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierDocuments withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required if you
     * do not specify a test CSV file.
     * </p>
     * 
     * @param testS3Uri
     *        The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required
     *        if you do not specify a test CSV file.
     */

    public void setTestS3Uri(String testS3Uri) {
        this.testS3Uri = testS3Uri;
    }

    /**
     * <p>
     * The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required if you
     * do not specify a test CSV file.
     * </p>
     * 
     * @return The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required
     *         if you do not specify a test CSV file.
     */

    public String getTestS3Uri() {
        return this.testS3Uri;
    }

    /**
     * <p>
     * The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required if you
     * do not specify a test CSV file.
     * </p>
     * 
     * @param testS3Uri
     *        The S3 URI location of the test documents included in the TestS3Uri CSV file. This field is not required
     *        if you do not specify a test CSV file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierDocuments withTestS3Uri(String testS3Uri) {
        setTestS3Uri(testS3Uri);
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
        if (getTestS3Uri() != null)
            sb.append("TestS3Uri: ").append(getTestS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentClassifierDocuments == false)
            return false;
        DocumentClassifierDocuments other = (DocumentClassifierDocuments) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getTestS3Uri() == null ^ this.getTestS3Uri() == null)
            return false;
        if (other.getTestS3Uri() != null && other.getTestS3Uri().equals(this.getTestS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getTestS3Uri() == null) ? 0 : getTestS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public DocumentClassifierDocuments clone() {
        try {
            return (DocumentClassifierDocuments) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentClassifierDocumentsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
