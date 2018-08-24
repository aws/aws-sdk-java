/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Section implements Serializable, Cloneable, StructuredPojo {

    private Long startTimestamp;

    private Long endTimestamp;

    /**
     * @param startTimestamp
     */

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * @return
     */

    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @param startTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Section withStartTimestamp(Long startTimestamp) {
        setStartTimestamp(startTimestamp);
        return this;
    }

    /**
     * @param endTimestamp
     */

    public void setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * @return
     */

    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @param endTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Section withEndTimestamp(Long endTimestamp) {
        setEndTimestamp(endTimestamp);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: ").append(getStartTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Section == false)
            return false;
        Section other = (Section) obj;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Section clone() {
        try {
            return (Section) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.SectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
