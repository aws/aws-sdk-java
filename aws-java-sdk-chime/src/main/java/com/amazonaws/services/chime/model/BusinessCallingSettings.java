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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Chime Business Calling settings for the administrator's AWS account. Includes any Amazon S3 buckets
 * designated for storing call detail records.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/BusinessCallingSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessCallingSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     */
    private String cdrBucket;

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     * 
     * @param cdrBucket
     *        The Amazon S3 bucket designated for call detail record storage.
     */

    public void setCdrBucket(String cdrBucket) {
        this.cdrBucket = cdrBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     * 
     * @return The Amazon S3 bucket designated for call detail record storage.
     */

    public String getCdrBucket() {
        return this.cdrBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket designated for call detail record storage.
     * </p>
     * 
     * @param cdrBucket
     *        The Amazon S3 bucket designated for call detail record storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessCallingSettings withCdrBucket(String cdrBucket) {
        setCdrBucket(cdrBucket);
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
        if (getCdrBucket() != null)
            sb.append("CdrBucket: ").append(getCdrBucket());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessCallingSettings == false)
            return false;
        BusinessCallingSettings other = (BusinessCallingSettings) obj;
        if (other.getCdrBucket() == null ^ this.getCdrBucket() == null)
            return false;
        if (other.getCdrBucket() != null && other.getCdrBucket().equals(this.getCdrBucket()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCdrBucket() == null) ? 0 : getCdrBucket().hashCode());
        return hashCode;
    }

    @Override
    public BusinessCallingSettings clone() {
        try {
            return (BusinessCallingSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.BusinessCallingSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
