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
package com.amazonaws.services.applicationcostprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSApplicationCostProfiler-2020-09-10/ImportApplicationUsage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportApplicationUsageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon S3 location to import application usage data from.
     * </p>
     */
    private SourceS3Location sourceS3Location;

    /**
     * <p>
     * Amazon S3 location to import application usage data from.
     * </p>
     * 
     * @param sourceS3Location
     *        Amazon S3 location to import application usage data from.
     */

    public void setSourceS3Location(SourceS3Location sourceS3Location) {
        this.sourceS3Location = sourceS3Location;
    }

    /**
     * <p>
     * Amazon S3 location to import application usage data from.
     * </p>
     * 
     * @return Amazon S3 location to import application usage data from.
     */

    public SourceS3Location getSourceS3Location() {
        return this.sourceS3Location;
    }

    /**
     * <p>
     * Amazon S3 location to import application usage data from.
     * </p>
     * 
     * @param sourceS3Location
     *        Amazon S3 location to import application usage data from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApplicationUsageRequest withSourceS3Location(SourceS3Location sourceS3Location) {
        setSourceS3Location(sourceS3Location);
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
        if (getSourceS3Location() != null)
            sb.append("SourceS3Location: ").append(getSourceS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportApplicationUsageRequest == false)
            return false;
        ImportApplicationUsageRequest other = (ImportApplicationUsageRequest) obj;
        if (other.getSourceS3Location() == null ^ this.getSourceS3Location() == null)
            return false;
        if (other.getSourceS3Location() != null && other.getSourceS3Location().equals(this.getSourceS3Location()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceS3Location() == null) ? 0 : getSourceS3Location().hashCode());
        return hashCode;
    }

    @Override
    public ImportApplicationUsageRequest clone() {
        return (ImportApplicationUsageRequest) super.clone();
    }

}
