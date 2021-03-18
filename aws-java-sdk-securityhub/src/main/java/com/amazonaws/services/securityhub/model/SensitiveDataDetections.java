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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The list of detected instances of sensitive data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SensitiveDataDetections"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensitiveDataDetections implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * The type of sensitive data that was detected. For example, the type might indicate that the data is an email
     * address.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     */
    private Occurrences occurrences;

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of sensitive data that were detected.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     * 
     * @return The total number of occurrences of sensitive data that were detected.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * The total number of occurrences of sensitive data that were detected.
     * </p>
     * 
     * @param count
     *        The total number of occurrences of sensitive data that were detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataDetections withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The type of sensitive data that was detected. For example, the type might indicate that the data is an email
     * address.
     * </p>
     * 
     * @param type
     *        The type of sensitive data that was detected. For example, the type might indicate that the data is an
     *        email address.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of sensitive data that was detected. For example, the type might indicate that the data is an email
     * address.
     * </p>
     * 
     * @return The type of sensitive data that was detected. For example, the type might indicate that the data is an
     *         email address.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of sensitive data that was detected. For example, the type might indicate that the data is an email
     * address.
     * </p>
     * 
     * @param type
     *        The type of sensitive data that was detected. For example, the type might indicate that the data is an
     *        email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataDetections withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     * 
     * @param occurrences
     *        Details about the sensitive data that was detected.
     */

    public void setOccurrences(Occurrences occurrences) {
        this.occurrences = occurrences;
    }

    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     * 
     * @return Details about the sensitive data that was detected.
     */

    public Occurrences getOccurrences() {
        return this.occurrences;
    }

    /**
     * <p>
     * Details about the sensitive data that was detected.
     * </p>
     * 
     * @param occurrences
     *        Details about the sensitive data that was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SensitiveDataDetections withOccurrences(Occurrences occurrences) {
        setOccurrences(occurrences);
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
            sb.append("Type: ").append(getType()).append(",");
        if (getOccurrences() != null)
            sb.append("Occurrences: ").append(getOccurrences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SensitiveDataDetections == false)
            return false;
        SensitiveDataDetections other = (SensitiveDataDetections) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getOccurrences() == null ^ this.getOccurrences() == null)
            return false;
        if (other.getOccurrences() != null && other.getOccurrences().equals(this.getOccurrences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getOccurrences() == null) ? 0 : getOccurrences().hashCode());
        return hashCode;
    }

    @Override
    public SensitiveDataDetections clone() {
        try {
            return (SensitiveDataDetections) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SensitiveDataDetectionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
