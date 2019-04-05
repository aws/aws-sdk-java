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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a key range. For export jobs, a <code>S3Resource</code> object can have an optional <code>KeyRange</code>
 * value. The length of the range is defined at job creation, and has either an inclusive <code>BeginMarker</code>, an
 * inclusive <code>EndMarker</code>, or both. Ranges are UTF-8 binary sorted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/KeyRange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyRange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     */
    private String beginMarker;
    /**
     * <p>
     * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     */
    private String endMarker;

    /**
     * <p>
     * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     * 
     * @param beginMarker
     *        The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     */

    public void setBeginMarker(String beginMarker) {
        this.beginMarker = beginMarker;
    }

    /**
     * <p>
     * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     * 
     * @return The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary
     *         sorted.
     */

    public String getBeginMarker() {
        return this.beginMarker;
    }

    /**
     * <p>
     * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     * 
     * @param beginMarker
     *        The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyRange withBeginMarker(String beginMarker) {
        setBeginMarker(beginMarker);
        return this;
    }

    /**
     * <p>
     * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     * 
     * @param endMarker
     *        The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     */

    public void setEndMarker(String endMarker) {
        this.endMarker = endMarker;
    }

    /**
     * <p>
     * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     * 
     * @return The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     */

    public String getEndMarker() {
        return this.endMarker;
    }

    /**
     * <p>
     * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * </p>
     * 
     * @param endMarker
     *        The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyRange withEndMarker(String endMarker) {
        setEndMarker(endMarker);
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
        if (getBeginMarker() != null)
            sb.append("BeginMarker: ").append(getBeginMarker()).append(",");
        if (getEndMarker() != null)
            sb.append("EndMarker: ").append(getEndMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyRange == false)
            return false;
        KeyRange other = (KeyRange) obj;
        if (other.getBeginMarker() == null ^ this.getBeginMarker() == null)
            return false;
        if (other.getBeginMarker() != null && other.getBeginMarker().equals(this.getBeginMarker()) == false)
            return false;
        if (other.getEndMarker() == null ^ this.getEndMarker() == null)
            return false;
        if (other.getEndMarker() != null && other.getEndMarker().equals(this.getEndMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginMarker() == null) ? 0 : getBeginMarker().hashCode());
        hashCode = prime * hashCode + ((getEndMarker() == null) ? 0 : getEndMarker().hashCode());
        return hashCode;
    }

    @Override
    public KeyRange clone() {
        try {
            return (KeyRange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.KeyRangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
