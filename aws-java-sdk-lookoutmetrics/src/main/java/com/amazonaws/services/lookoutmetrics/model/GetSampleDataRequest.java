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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetSampleData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSampleDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A datasource bucket in Amazon S3.
     * </p>
     */
    private SampleDataS3SourceConfig s3SourceConfig;

    /**
     * <p>
     * A datasource bucket in Amazon S3.
     * </p>
     * 
     * @param s3SourceConfig
     *        A datasource bucket in Amazon S3.
     */

    public void setS3SourceConfig(SampleDataS3SourceConfig s3SourceConfig) {
        this.s3SourceConfig = s3SourceConfig;
    }

    /**
     * <p>
     * A datasource bucket in Amazon S3.
     * </p>
     * 
     * @return A datasource bucket in Amazon S3.
     */

    public SampleDataS3SourceConfig getS3SourceConfig() {
        return this.s3SourceConfig;
    }

    /**
     * <p>
     * A datasource bucket in Amazon S3.
     * </p>
     * 
     * @param s3SourceConfig
     *        A datasource bucket in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSampleDataRequest withS3SourceConfig(SampleDataS3SourceConfig s3SourceConfig) {
        setS3SourceConfig(s3SourceConfig);
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
        if (getS3SourceConfig() != null)
            sb.append("S3SourceConfig: ").append(getS3SourceConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSampleDataRequest == false)
            return false;
        GetSampleDataRequest other = (GetSampleDataRequest) obj;
        if (other.getS3SourceConfig() == null ^ this.getS3SourceConfig() == null)
            return false;
        if (other.getS3SourceConfig() != null && other.getS3SourceConfig().equals(this.getS3SourceConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3SourceConfig() == null) ? 0 : getS3SourceConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetSampleDataRequest clone() {
        return (GetSampleDataRequest) super.clone();
    }

}
