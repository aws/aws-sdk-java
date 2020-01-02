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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information for pre-signed URLs. Valid when <code>protocols</code> contains HTTP.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsJobPresignedUrlConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds.
     * Pre-signed URLs are generated when a request for the job document is received.
     * </p>
     */
    private Long expiresInSec;

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds.
     * Pre-signed URLs are generated when a request for the job document is received.
     * </p>
     * 
     * @param expiresInSec
     *        How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800
     *        seconds. Pre-signed URLs are generated when a request for the job document is received.
     */

    public void setExpiresInSec(Long expiresInSec) {
        this.expiresInSec = expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds.
     * Pre-signed URLs are generated when a request for the job document is received.
     * </p>
     * 
     * @return How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800
     *         seconds. Pre-signed URLs are generated when a request for the job document is received.
     */

    public Long getExpiresInSec() {
        return this.expiresInSec;
    }

    /**
     * <p>
     * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800 seconds.
     * Pre-signed URLs are generated when a request for the job document is received.
     * </p>
     * 
     * @param expiresInSec
     *        How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 1800
     *        seconds. Pre-signed URLs are generated when a request for the job document is received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsJobPresignedUrlConfig withExpiresInSec(Long expiresInSec) {
        setExpiresInSec(expiresInSec);
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
        if (getExpiresInSec() != null)
            sb.append("ExpiresInSec: ").append(getExpiresInSec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsJobPresignedUrlConfig == false)
            return false;
        AwsJobPresignedUrlConfig other = (AwsJobPresignedUrlConfig) obj;
        if (other.getExpiresInSec() == null ^ this.getExpiresInSec() == null)
            return false;
        if (other.getExpiresInSec() != null && other.getExpiresInSec().equals(this.getExpiresInSec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiresInSec() == null) ? 0 : getExpiresInSec().hashCode());
        return hashCode;
    }

    @Override
    public AwsJobPresignedUrlConfig clone() {
        try {
            return (AwsJobPresignedUrlConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AwsJobPresignedUrlConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
