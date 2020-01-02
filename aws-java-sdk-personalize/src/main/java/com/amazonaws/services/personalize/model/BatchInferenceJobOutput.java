/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output configuration parameters of a batch inference job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/BatchInferenceJobOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchInferenceJobOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     * </p>
     */
    private S3DataConfig s3DataDestination;

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     * </p>
     * 
     * @param s3DataDestination
     *        Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     */

    public void setS3DataDestination(S3DataConfig s3DataDestination) {
        this.s3DataDestination = s3DataDestination;
    }

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     * </p>
     * 
     * @return Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     */

    public S3DataConfig getS3DataDestination() {
        return this.s3DataDestination;
    }

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     * </p>
     * 
     * @param s3DataDestination
     *        Information on the Amazon S3 bucket in which the batch inference job's output is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchInferenceJobOutput withS3DataDestination(S3DataConfig s3DataDestination) {
        setS3DataDestination(s3DataDestination);
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
        if (getS3DataDestination() != null)
            sb.append("S3DataDestination: ").append(getS3DataDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchInferenceJobOutput == false)
            return false;
        BatchInferenceJobOutput other = (BatchInferenceJobOutput) obj;
        if (other.getS3DataDestination() == null ^ this.getS3DataDestination() == null)
            return false;
        if (other.getS3DataDestination() != null && other.getS3DataDestination().equals(this.getS3DataDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataDestination() == null) ? 0 : getS3DataDestination().hashCode());
        return hashCode;
    }

    @Override
    public BatchInferenceJobOutput clone() {
        try {
            return (BatchInferenceJobOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.BatchInferenceJobOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
