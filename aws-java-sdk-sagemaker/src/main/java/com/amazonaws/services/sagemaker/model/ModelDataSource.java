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
 * Specifies the location of ML model data to deploy. If specified, you must specify one and only one of the available
 * data sources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the S3 location of ML model data to deploy.
     * </p>
     */
    private S3ModelDataSource s3DataSource;

    /**
     * <p>
     * Specifies the S3 location of ML model data to deploy.
     * </p>
     * 
     * @param s3DataSource
     *        Specifies the S3 location of ML model data to deploy.
     */

    public void setS3DataSource(S3ModelDataSource s3DataSource) {
        this.s3DataSource = s3DataSource;
    }

    /**
     * <p>
     * Specifies the S3 location of ML model data to deploy.
     * </p>
     * 
     * @return Specifies the S3 location of ML model data to deploy.
     */

    public S3ModelDataSource getS3DataSource() {
        return this.s3DataSource;
    }

    /**
     * <p>
     * Specifies the S3 location of ML model data to deploy.
     * </p>
     * 
     * @param s3DataSource
     *        Specifies the S3 location of ML model data to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDataSource withS3DataSource(S3ModelDataSource s3DataSource) {
        setS3DataSource(s3DataSource);
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
        if (getS3DataSource() != null)
            sb.append("S3DataSource: ").append(getS3DataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDataSource == false)
            return false;
        ModelDataSource other = (ModelDataSource) obj;
        if (other.getS3DataSource() == null ^ this.getS3DataSource() == null)
            return false;
        if (other.getS3DataSource() != null && other.getS3DataSource().equals(this.getS3DataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3DataSource() == null) ? 0 : getS3DataSource().hashCode());
        return hashCode;
    }

    @Override
    public ModelDataSource clone() {
        try {
            return (ModelDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
