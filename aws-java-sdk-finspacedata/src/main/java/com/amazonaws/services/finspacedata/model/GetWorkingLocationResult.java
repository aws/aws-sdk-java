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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkingLocationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the Amazon S3 URI for the working location.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * Returns the Amazon S3 Path for the working location.
     * </p>
     */
    private String s3Path;
    /**
     * <p>
     * Returns the Amazon S3 bucket name for the working location.
     * </p>
     */
    private String s3Bucket;

    /**
     * <p>
     * Returns the Amazon S3 URI for the working location.
     * </p>
     * 
     * @param s3Uri
     *        Returns the Amazon S3 URI for the working location.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * Returns the Amazon S3 URI for the working location.
     * </p>
     * 
     * @return Returns the Amazon S3 URI for the working location.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * Returns the Amazon S3 URI for the working location.
     * </p>
     * 
     * @param s3Uri
     *        Returns the Amazon S3 URI for the working location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkingLocationResult withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * Returns the Amazon S3 Path for the working location.
     * </p>
     * 
     * @param s3Path
     *        Returns the Amazon S3 Path for the working location.
     */

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * Returns the Amazon S3 Path for the working location.
     * </p>
     * 
     * @return Returns the Amazon S3 Path for the working location.
     */

    public String getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * Returns the Amazon S3 Path for the working location.
     * </p>
     * 
     * @param s3Path
     *        Returns the Amazon S3 Path for the working location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkingLocationResult withS3Path(String s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * Returns the Amazon S3 bucket name for the working location.
     * </p>
     * 
     * @param s3Bucket
     *        Returns the Amazon S3 bucket name for the working location.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * Returns the Amazon S3 bucket name for the working location.
     * </p>
     * 
     * @return Returns the Amazon S3 bucket name for the working location.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * Returns the Amazon S3 bucket name for the working location.
     * </p>
     * 
     * @param s3Bucket
     *        Returns the Amazon S3 bucket name for the working location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkingLocationResult withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
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
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkingLocationResult == false)
            return false;
        GetWorkingLocationResult other = (GetWorkingLocationResult) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkingLocationResult clone() {
        try {
            return (GetWorkingLocationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
