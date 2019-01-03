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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reserved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/QueryCompileErrorLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryCompileErrorLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Reserved.
     * </p>
     */
    private Integer startCharOffset;
    /**
     * <p>
     * Reserved.
     * </p>
     */
    private Integer endCharOffset;

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param startCharOffset
     *        Reserved.
     */

    public void setStartCharOffset(Integer startCharOffset) {
        this.startCharOffset = startCharOffset;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public Integer getStartCharOffset() {
        return this.startCharOffset;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param startCharOffset
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryCompileErrorLocation withStartCharOffset(Integer startCharOffset) {
        setStartCharOffset(startCharOffset);
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param endCharOffset
     *        Reserved.
     */

    public void setEndCharOffset(Integer endCharOffset) {
        this.endCharOffset = endCharOffset;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public Integer getEndCharOffset() {
        return this.endCharOffset;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param endCharOffset
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryCompileErrorLocation withEndCharOffset(Integer endCharOffset) {
        setEndCharOffset(endCharOffset);
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
        if (getStartCharOffset() != null)
            sb.append("StartCharOffset: ").append(getStartCharOffset()).append(",");
        if (getEndCharOffset() != null)
            sb.append("EndCharOffset: ").append(getEndCharOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryCompileErrorLocation == false)
            return false;
        QueryCompileErrorLocation other = (QueryCompileErrorLocation) obj;
        if (other.getStartCharOffset() == null ^ this.getStartCharOffset() == null)
            return false;
        if (other.getStartCharOffset() != null && other.getStartCharOffset().equals(this.getStartCharOffset()) == false)
            return false;
        if (other.getEndCharOffset() == null ^ this.getEndCharOffset() == null)
            return false;
        if (other.getEndCharOffset() != null && other.getEndCharOffset().equals(this.getEndCharOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartCharOffset() == null) ? 0 : getStartCharOffset().hashCode());
        hashCode = prime * hashCode + ((getEndCharOffset() == null) ? 0 : getEndCharOffset().hashCode());
        return hashCode;
    }

    @Override
    public QueryCompileErrorLocation clone() {
        try {
            return (QueryCompileErrorLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.QueryCompileErrorLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
