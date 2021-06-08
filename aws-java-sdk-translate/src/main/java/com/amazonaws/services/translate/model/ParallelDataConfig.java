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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the format and S3 location of the parallel data input file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ParallelDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same Region
     * as the API endpoint you are calling.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same Region
     * as the API endpoint you are calling.
     * </p>
     * 
     * @param s3Uri
     *        The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same
     *        Region as the API endpoint you are calling.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same Region
     * as the API endpoint you are calling.
     * </p>
     * 
     * @return The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the
     *         same Region as the API endpoint you are calling.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same Region
     * as the API endpoint you are calling.
     * </p>
     * 
     * @param s3Uri
     *        The URI of the Amazon S3 folder that contains the parallel data input file. The folder must be in the same
     *        Region as the API endpoint you are calling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * 
     * @param format
     *        The format of the parallel data input file.
     * @see ParallelDataFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * 
     * @return The format of the parallel data input file.
     * @see ParallelDataFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * 
     * @param format
     *        The format of the parallel data input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataFormat
     */

    public ParallelDataConfig withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * 
     * @param format
     *        The format of the parallel data input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataFormat
     */

    public ParallelDataConfig withFormat(ParallelDataFormat format) {
        this.format = format.toString();
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelDataConfig == false)
            return false;
        ParallelDataConfig other = (ParallelDataConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public ParallelDataConfig clone() {
        try {
            return (ParallelDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.ParallelDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
