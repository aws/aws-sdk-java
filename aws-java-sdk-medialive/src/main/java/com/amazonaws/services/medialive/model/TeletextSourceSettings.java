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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Teletext Source Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TeletextSourceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TeletextSourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to
     * 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
     */
    private String pageNumber;

    /**
     * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to
     * 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
     * 
     * @param pageNumber
     *        Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100
     *        (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x"
     *        prefix.
     */

    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to
     * 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
     * 
     * @return Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100
     *         (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x"
     *         prefix.
     */

    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to
     * 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
     * 
     * @param pageNumber
     *        Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100
     *        (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x"
     *        prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeletextSourceSettings withPageNumber(String pageNumber) {
        setPageNumber(pageNumber);
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
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TeletextSourceSettings == false)
            return false;
        TeletextSourceSettings other = (TeletextSourceSettings) obj;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public TeletextSourceSettings clone() {
        try {
            return (TeletextSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.TeletextSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
