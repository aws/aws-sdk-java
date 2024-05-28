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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 access metadata of the sequence store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/SequenceStoreS3Access" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SequenceStoreS3Access implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 URI of the sequence store.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * This is ARN of the access point associated with the S3 bucket storing read sets.
     * </p>
     */
    private String s3AccessPointArn;

    /**
     * <p>
     * The S3 URI of the sequence store.
     * </p>
     * 
     * @param s3Uri
     *        The S3 URI of the sequence store.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The S3 URI of the sequence store.
     * </p>
     * 
     * @return The S3 URI of the sequence store.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The S3 URI of the sequence store.
     * </p>
     * 
     * @param s3Uri
     *        The S3 URI of the sequence store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreS3Access withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * This is ARN of the access point associated with the S3 bucket storing read sets.
     * </p>
     * 
     * @param s3AccessPointArn
     *        This is ARN of the access point associated with the S3 bucket storing read sets.
     */

    public void setS3AccessPointArn(String s3AccessPointArn) {
        this.s3AccessPointArn = s3AccessPointArn;
    }

    /**
     * <p>
     * This is ARN of the access point associated with the S3 bucket storing read sets.
     * </p>
     * 
     * @return This is ARN of the access point associated with the S3 bucket storing read sets.
     */

    public String getS3AccessPointArn() {
        return this.s3AccessPointArn;
    }

    /**
     * <p>
     * This is ARN of the access point associated with the S3 bucket storing read sets.
     * </p>
     * 
     * @param s3AccessPointArn
     *        This is ARN of the access point associated with the S3 bucket storing read sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SequenceStoreS3Access withS3AccessPointArn(String s3AccessPointArn) {
        setS3AccessPointArn(s3AccessPointArn);
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
        if (getS3AccessPointArn() != null)
            sb.append("S3AccessPointArn: ").append(getS3AccessPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SequenceStoreS3Access == false)
            return false;
        SequenceStoreS3Access other = (SequenceStoreS3Access) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getS3AccessPointArn() == null ^ this.getS3AccessPointArn() == null)
            return false;
        if (other.getS3AccessPointArn() != null && other.getS3AccessPointArn().equals(this.getS3AccessPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getS3AccessPointArn() == null) ? 0 : getS3AccessPointArn().hashCode());
        return hashCode;
    }

    @Override
    public SequenceStoreS3Access clone() {
        try {
            return (SequenceStoreS3Access) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.SequenceStoreS3AccessMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
