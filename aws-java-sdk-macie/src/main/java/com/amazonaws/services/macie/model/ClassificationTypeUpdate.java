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
package com.amazonaws.services.macie.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The classification type that Amazon Macie applies to the associated S3 resources. At least one of the classification
 * types (oneTime or continuous) must be specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie-2017-12-19/ClassificationTypeUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClassificationTypeUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified S3 bucket.
     * </p>
     */
    private String oneTime;
    /**
     * <p>
     * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     * performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * </p>
     */
    private String continuous;

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified S3 bucket.
     * </p>
     * 
     * @param oneTime
     *        A one-time classification of all of the existing objects in a specified S3 bucket.
     * @see S3OneTimeClassificationType
     */

    public void setOneTime(String oneTime) {
        this.oneTime = oneTime;
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified S3 bucket.
     * </p>
     * 
     * @return A one-time classification of all of the existing objects in a specified S3 bucket.
     * @see S3OneTimeClassificationType
     */

    public String getOneTime() {
        return this.oneTime;
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified S3 bucket.
     * </p>
     * 
     * @param oneTime
     *        A one-time classification of all of the existing objects in a specified S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3OneTimeClassificationType
     */

    public ClassificationTypeUpdate withOneTime(String oneTime) {
        setOneTime(oneTime);
        return this;
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified S3 bucket.
     * </p>
     * 
     * @param oneTime
     *        A one-time classification of all of the existing objects in a specified S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3OneTimeClassificationType
     */

    public ClassificationTypeUpdate withOneTime(S3OneTimeClassificationType oneTime) {
        this.oneTime = oneTime.toString();
        return this;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     * performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * </p>
     * 
     * @param continuous
     *        A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     *        performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * @see S3ContinuousClassificationType
     */

    public void setContinuous(String continuous) {
        this.continuous = continuous;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     * performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * </p>
     * 
     * @return A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     *         performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * @see S3ContinuousClassificationType
     */

    public String getContinuous() {
        return this.continuous;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     * performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * </p>
     * 
     * @param continuous
     *        A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     *        performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ContinuousClassificationType
     */

    public ClassificationTypeUpdate withContinuous(String continuous) {
        setContinuous(continuous);
        return this;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     * performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * </p>
     * 
     * @param continuous
     *        A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins
     *        performing continuous classification after a bucket is successfully associated with Amazon Macie.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ContinuousClassificationType
     */

    public ClassificationTypeUpdate withContinuous(S3ContinuousClassificationType continuous) {
        this.continuous = continuous.toString();
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
        if (getOneTime() != null)
            sb.append("OneTime: ").append(getOneTime()).append(",");
        if (getContinuous() != null)
            sb.append("Continuous: ").append(getContinuous());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationTypeUpdate == false)
            return false;
        ClassificationTypeUpdate other = (ClassificationTypeUpdate) obj;
        if (other.getOneTime() == null ^ this.getOneTime() == null)
            return false;
        if (other.getOneTime() != null && other.getOneTime().equals(this.getOneTime()) == false)
            return false;
        if (other.getContinuous() == null ^ this.getContinuous() == null)
            return false;
        if (other.getContinuous() != null && other.getContinuous().equals(this.getContinuous()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOneTime() == null) ? 0 : getOneTime().hashCode());
        hashCode = prime * hashCode + ((getContinuous() == null) ? 0 : getContinuous().hashCode());
        return hashCode;
    }

    @Override
    public ClassificationTypeUpdate clone() {
        try {
            return (ClassificationTypeUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie.model.transform.ClassificationTypeUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
