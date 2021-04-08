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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies S3 configuration information for the input data for the data ingestion job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/IngestionS3InputConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngestionS3InputConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket used for the input data for the data ingestion.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The prefix for the S3 location being used for the input data for the data ingestion.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The name of the S3 bucket used for the input data for the data ingestion.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket used for the input data for the data ingestion.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket used for the input data for the data ingestion.
     * </p>
     * 
     * @return The name of the S3 bucket used for the input data for the data ingestion.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket used for the input data for the data ingestion.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket used for the input data for the data ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionS3InputConfiguration withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The prefix for the S3 location being used for the input data for the data ingestion.
     * </p>
     * 
     * @param prefix
     *        The prefix for the S3 location being used for the input data for the data ingestion.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix for the S3 location being used for the input data for the data ingestion.
     * </p>
     * 
     * @return The prefix for the S3 location being used for the input data for the data ingestion.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The prefix for the S3 location being used for the input data for the data ingestion.
     * </p>
     * 
     * @param prefix
     *        The prefix for the S3 location being used for the input data for the data ingestion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngestionS3InputConfiguration withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngestionS3InputConfiguration == false)
            return false;
        IngestionS3InputConfiguration other = (IngestionS3InputConfiguration) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public IngestionS3InputConfiguration clone() {
        try {
            return (IngestionS3InputConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.IngestionS3InputConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
