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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this optional parameter to constrain access to an Amazon S3 resource based on the IP address using supported IAM
 * global condition keys. The Amazon S3 resource is accessed in the worker portal using a Amazon S3 presigned URL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/WorkerAccessConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerAccessConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines any Amazon S3 resource constraints.
     * </p>
     */
    private S3Presign s3Presign;

    /**
     * <p>
     * Defines any Amazon S3 resource constraints.
     * </p>
     * 
     * @param s3Presign
     *        Defines any Amazon S3 resource constraints.
     */

    public void setS3Presign(S3Presign s3Presign) {
        this.s3Presign = s3Presign;
    }

    /**
     * <p>
     * Defines any Amazon S3 resource constraints.
     * </p>
     * 
     * @return Defines any Amazon S3 resource constraints.
     */

    public S3Presign getS3Presign() {
        return this.s3Presign;
    }

    /**
     * <p>
     * Defines any Amazon S3 resource constraints.
     * </p>
     * 
     * @param s3Presign
     *        Defines any Amazon S3 resource constraints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerAccessConfiguration withS3Presign(S3Presign s3Presign) {
        setS3Presign(s3Presign);
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
        if (getS3Presign() != null)
            sb.append("S3Presign: ").append(getS3Presign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerAccessConfiguration == false)
            return false;
        WorkerAccessConfiguration other = (WorkerAccessConfiguration) obj;
        if (other.getS3Presign() == null ^ this.getS3Presign() == null)
            return false;
        if (other.getS3Presign() != null && other.getS3Presign().equals(this.getS3Presign()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Presign() == null) ? 0 : getS3Presign().hashCode());
        return hashCode;
    }

    @Override
    public WorkerAccessConfiguration clone() {
        try {
            return (WorkerAccessConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.WorkerAccessConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
