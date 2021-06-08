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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object that contains the Amazon S3 object location and access role required to train and tune your custom
 * language model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/InputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language model.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language model.
     * </p>
     */
    private String tuningDataS3Uri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to access
     * your Amazon S3 buckets containing your media files or text data.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language model.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language
     *        model.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language model.
     * </p>
     * 
     * @return The Amazon S3 prefix you specify to access the plain text files that you use to train your custom
     *         language model.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language model.
     * </p>
     * 
     * @param s3Uri
     *        The Amazon S3 prefix you specify to access the plain text files that you use to train your custom language
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language model.
     * </p>
     * 
     * @param tuningDataS3Uri
     *        The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language
     *        model.
     */

    public void setTuningDataS3Uri(String tuningDataS3Uri) {
        this.tuningDataS3Uri = tuningDataS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language model.
     * </p>
     * 
     * @return The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language
     *         model.
     */

    public String getTuningDataS3Uri() {
        return this.tuningDataS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language model.
     * </p>
     * 
     * @param tuningDataS3Uri
     *        The Amazon S3 prefix you specify to access the plain text files that you use to tune your custom language
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withTuningDataS3Uri(String tuningDataS3Uri) {
        setTuningDataS3Uri(tuningDataS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to access
     * your Amazon S3 buckets containing your media files or text data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to
     *        access your Amazon S3 buckets containing your media files or text data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to access
     * your Amazon S3 buckets containing your media files or text data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to
     *         access your Amazon S3 buckets containing your media files or text data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to access
     * your Amazon S3 buckets containing your media files or text data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) that uniquely identifies the permissions you've given Amazon Transcribe to
     *        access your Amazon S3 buckets containing your media files or text data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getTuningDataS3Uri() != null)
            sb.append("TuningDataS3Uri: ").append(getTuningDataS3Uri()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getTuningDataS3Uri() == null ^ this.getTuningDataS3Uri() == null)
            return false;
        if (other.getTuningDataS3Uri() != null && other.getTuningDataS3Uri().equals(this.getTuningDataS3Uri()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getTuningDataS3Uri() == null) ? 0 : getTuningDataS3Uri().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public InputDataConfig clone() {
        try {
            return (InputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.InputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
