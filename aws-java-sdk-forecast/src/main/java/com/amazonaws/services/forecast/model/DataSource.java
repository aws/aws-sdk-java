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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The source of your training data and credentials to access the data. This object is submitted in the
 * <a>CreateDatasetImportJob</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the
     * credentials to access the data.
     * </p>
     */
    private S3Config s3Config;

    /**
     * <p>
     * The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the
     * credentials to access the data.
     * </p>
     * 
     * @param s3Config
     *        The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the
     *        credentials to access the data.
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * <p>
     * The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the
     * credentials to access the data.
     * </p>
     * 
     * @return The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with
     *         the credentials to access the data.
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * <p>
     * The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the
     * credentials to access the data.
     * </p>
     * 
     * @param s3Config
     *        The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the
     *        credentials to access the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
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
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
