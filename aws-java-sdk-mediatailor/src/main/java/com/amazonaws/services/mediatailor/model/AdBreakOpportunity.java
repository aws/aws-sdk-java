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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A location at which a zero-duration ad marker was detected in a VOD source manifest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/AdBreakOpportunity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdBreakOpportunity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     * </p>
     */
    private Long offsetMillis;

    /**
     * <p>
     * The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     * </p>
     * 
     * @param offsetMillis
     *        The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     */

    public void setOffsetMillis(Long offsetMillis) {
        this.offsetMillis = offsetMillis;
    }

    /**
     * <p>
     * The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     * </p>
     * 
     * @return The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     */

    public Long getOffsetMillis() {
        return this.offsetMillis;
    }

    /**
     * <p>
     * The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     * </p>
     * 
     * @param offsetMillis
     *        The offset in milliseconds from the start of the VOD source at which an ad marker was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdBreakOpportunity withOffsetMillis(Long offsetMillis) {
        setOffsetMillis(offsetMillis);
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
        if (getOffsetMillis() != null)
            sb.append("OffsetMillis: ").append(getOffsetMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdBreakOpportunity == false)
            return false;
        AdBreakOpportunity other = (AdBreakOpportunity) obj;
        if (other.getOffsetMillis() == null ^ this.getOffsetMillis() == null)
            return false;
        if (other.getOffsetMillis() != null && other.getOffsetMillis().equals(this.getOffsetMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOffsetMillis() == null) ? 0 : getOffsetMillis().hashCode());
        return hashCode;
    }

    @Override
    public AdBreakOpportunity clone() {
        try {
            return (AdBreakOpportunity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.AdBreakOpportunityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
