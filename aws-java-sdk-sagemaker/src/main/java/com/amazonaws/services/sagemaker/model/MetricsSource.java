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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MetricsSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricsSource implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String contentType;
    /** <p/> */
    private String contentDigest;
    /** <p/> */
    private String s3Uri;

    /**
     * <p/>
     * 
     * @param contentType
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p/>
     * 
     * @param contentType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSource withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param contentDigest
     */

    public void setContentDigest(String contentDigest) {
        this.contentDigest = contentDigest;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getContentDigest() {
        return this.contentDigest;
    }

    /**
     * <p/>
     * 
     * @param contentDigest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSource withContentDigest(String contentDigest) {
        setContentDigest(contentDigest);
        return this;
    }

    /**
     * <p/>
     * 
     * @param s3Uri
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p/>
     * 
     * @param s3Uri
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricsSource withS3Uri(String s3Uri) {
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getContentDigest() != null)
            sb.append("ContentDigest: ").append(getContentDigest()).append(",");
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

        if (obj instanceof MetricsSource == false)
            return false;
        MetricsSource other = (MetricsSource) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getContentDigest() == null ^ this.getContentDigest() == null)
            return false;
        if (other.getContentDigest() != null && other.getContentDigest().equals(this.getContentDigest()) == false)
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

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getContentDigest() == null) ? 0 : getContentDigest().hashCode());
        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public MetricsSource clone() {
        try {
            return (MetricsSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MetricsSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
