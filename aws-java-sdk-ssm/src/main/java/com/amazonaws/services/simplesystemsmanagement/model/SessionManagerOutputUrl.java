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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved for future use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/SessionManagerOutputUrl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionManagerOutputUrl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String s3OutputUrl;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String cloudWatchOutputUrl;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param s3OutputUrl
     *        Reserved for future use.
     */

    public void setS3OutputUrl(String s3OutputUrl) {
        this.s3OutputUrl = s3OutputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getS3OutputUrl() {
        return this.s3OutputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param s3OutputUrl
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionManagerOutputUrl withS3OutputUrl(String s3OutputUrl) {
        setS3OutputUrl(s3OutputUrl);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param cloudWatchOutputUrl
     *        Reserved for future use.
     */

    public void setCloudWatchOutputUrl(String cloudWatchOutputUrl) {
        this.cloudWatchOutputUrl = cloudWatchOutputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getCloudWatchOutputUrl() {
        return this.cloudWatchOutputUrl;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param cloudWatchOutputUrl
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionManagerOutputUrl withCloudWatchOutputUrl(String cloudWatchOutputUrl) {
        setCloudWatchOutputUrl(cloudWatchOutputUrl);
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
        if (getS3OutputUrl() != null)
            sb.append("S3OutputUrl: ").append(getS3OutputUrl()).append(",");
        if (getCloudWatchOutputUrl() != null)
            sb.append("CloudWatchOutputUrl: ").append(getCloudWatchOutputUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionManagerOutputUrl == false)
            return false;
        SessionManagerOutputUrl other = (SessionManagerOutputUrl) obj;
        if (other.getS3OutputUrl() == null ^ this.getS3OutputUrl() == null)
            return false;
        if (other.getS3OutputUrl() != null && other.getS3OutputUrl().equals(this.getS3OutputUrl()) == false)
            return false;
        if (other.getCloudWatchOutputUrl() == null ^ this.getCloudWatchOutputUrl() == null)
            return false;
        if (other.getCloudWatchOutputUrl() != null && other.getCloudWatchOutputUrl().equals(this.getCloudWatchOutputUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputUrl() == null) ? 0 : getS3OutputUrl().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputUrl() == null) ? 0 : getCloudWatchOutputUrl().hashCode());
        return hashCode;
    }

    @Override
    public SessionManagerOutputUrl clone() {
        try {
            return (SessionManagerOutputUrl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.SessionManagerOutputUrlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
