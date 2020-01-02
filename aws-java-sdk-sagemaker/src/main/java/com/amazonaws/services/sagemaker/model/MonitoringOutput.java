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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output object for a monitoring job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     * </p>
     */
    private MonitoringS3Output s3Output;

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     * </p>
     * 
     * @param s3Output
     *        The Amazon S3 storage location where the results of a monitoring job are saved.
     */

    public void setS3Output(MonitoringS3Output s3Output) {
        this.s3Output = s3Output;
    }

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     * </p>
     * 
     * @return The Amazon S3 storage location where the results of a monitoring job are saved.
     */

    public MonitoringS3Output getS3Output() {
        return this.s3Output;
    }

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are saved.
     * </p>
     * 
     * @param s3Output
     *        The Amazon S3 storage location where the results of a monitoring job are saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringOutput withS3Output(MonitoringS3Output s3Output) {
        setS3Output(s3Output);
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
        if (getS3Output() != null)
            sb.append("S3Output: ").append(getS3Output());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringOutput == false)
            return false;
        MonitoringOutput other = (MonitoringOutput) obj;
        if (other.getS3Output() == null ^ this.getS3Output() == null)
            return false;
        if (other.getS3Output() != null && other.getS3Output().equals(this.getS3Output()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Output() == null) ? 0 : getS3Output().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringOutput clone() {
        try {
            return (MonitoringOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
