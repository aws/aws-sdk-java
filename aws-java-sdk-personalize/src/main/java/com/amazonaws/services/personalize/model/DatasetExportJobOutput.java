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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output configuration parameters of a dataset export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DatasetExportJobOutput" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetExportJobOutput implements Serializable, Cloneable, StructuredPojo {

    private S3DataConfig s3DataDestination;

    /**
     * @param s3DataDestination
     */

    public void setS3DataDestination(S3DataConfig s3DataDestination) {
        this.s3DataDestination = s3DataDestination;
    }

    /**
     * @return
     */

    public S3DataConfig getS3DataDestination() {
        return this.s3DataDestination;
    }

    /**
     * @param s3DataDestination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetExportJobOutput withS3DataDestination(S3DataConfig s3DataDestination) {
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

        if (obj instanceof DatasetExportJobOutput == false)
            return false;
        DatasetExportJobOutput other = (DatasetExportJobOutput) obj;
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
    public DatasetExportJobOutput clone() {
        try {
            return (DatasetExportJobOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.DatasetExportJobOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
