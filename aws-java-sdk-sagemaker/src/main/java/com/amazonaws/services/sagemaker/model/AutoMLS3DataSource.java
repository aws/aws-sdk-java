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
 * The Amazon S3 data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLS3DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLS3DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data type.
     * </p>
     */
    private String s3DataType;
    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     */
    private String s3Uri;

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param s3DataType
     *        The data type.
     * @see AutoMLS3DataType
     */

    public void setS3DataType(String s3DataType) {
        this.s3DataType = s3DataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @return The data type.
     * @see AutoMLS3DataType
     */

    public String getS3DataType() {
        return this.s3DataType;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param s3DataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLS3DataType
     */

    public AutoMLS3DataSource withS3DataType(String s3DataType) {
        setS3DataType(s3DataType);
        return this;
    }

    /**
     * <p>
     * The data type.
     * </p>
     * 
     * @param s3DataType
     *        The data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLS3DataType
     */

    public AutoMLS3DataSource withS3DataType(AutoMLS3DataType s3DataType) {
        this.s3DataType = s3DataType.toString();
        return this;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * 
     * @param s3Uri
     *        The URL to the Amazon S3 data source.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * 
     * @return The URL to the Amazon S3 data source.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * The URL to the Amazon S3 data source.
     * </p>
     * 
     * @param s3Uri
     *        The URL to the Amazon S3 data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLS3DataSource withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
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
        if (getS3DataType() != null)
            sb.append("S3DataType: ").append(getS3DataType()).append(",");
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLS3DataSource == false)
            return false;
        AutoMLS3DataSource other = (AutoMLS3DataSource) obj;
        if (other.getS3DataType() == null ^ this.getS3DataType() == null)
            return false;
        if (other.getS3DataType() != null && other.getS3DataType().equals(this.getS3DataType()) == false)
            return false;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataType() == null) ? 0 : getS3DataType().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLS3DataSource clone() {
        try {
            return (AutoMLS3DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLS3DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
