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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about sensitive data that was detected by managed data identifiers and produced a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/DefaultDetection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the type of data that was detected.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     * 
     * @return The total number of occurrences of the type of data that was detected.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of occurrences of the type of data that was detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of the type of data that was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultDetection withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     * </p>
     * 
     * @param type
     *        The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     * </p>
     * 
     * @return The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     * </p>
     * 
     * @param type
     *        The type of data that was detected. For example, AWS_CREDENTIALS, PHONE_NUMBER, or ADDRESS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultDetection withType(String type) {
        setType(type);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultDetection == false)
            return false;
        DefaultDetection other = (DefaultDetection) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public DefaultDetection clone() {
        try {
            return (DefaultDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.DefaultDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
