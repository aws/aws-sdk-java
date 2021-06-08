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
 * An occurrence of sensitive data in an Adobe Portable Document Format (PDF) file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Page" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Page implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The page number of the page that contains the sensitive data.
     * </p>
     */
    private Long pageNumber;
    /**
     * <p>
     * An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     * files include files such as HTML, XML, JSON, and TXT files.
     * </p>
     */
    private Range lineRange;
    /**
     * <p>
     * An occurrence of sensitive data detected in a binary text file.
     * </p>
     */
    private Range offsetRange;

    /**
     * <p>
     * The page number of the page that contains the sensitive data.
     * </p>
     * 
     * @param pageNumber
     *        The page number of the page that contains the sensitive data.
     */

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * The page number of the page that contains the sensitive data.
     * </p>
     * 
     * @return The page number of the page that contains the sensitive data.
     */

    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>
     * The page number of the page that contains the sensitive data.
     * </p>
     * 
     * @param pageNumber
     *        The page number of the page that contains the sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withPageNumber(Long pageNumber) {
        setPageNumber(pageNumber);
        return this;
    }

    /**
     * <p>
     * An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     * files include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * 
     * @param lineRange
     *        An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary
     *        text files include files such as HTML, XML, JSON, and TXT files.
     */

    public void setLineRange(Range lineRange) {
        this.lineRange = lineRange;
    }

    /**
     * <p>
     * An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     * files include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * 
     * @return An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary
     *         text files include files such as HTML, XML, JSON, and TXT files.
     */

    public Range getLineRange() {
        return this.lineRange;
    }

    /**
     * <p>
     * An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary text
     * files include files such as HTML, XML, JSON, and TXT files.
     * </p>
     * 
     * @param lineRange
     *        An occurrence of sensitive data detected in a non-binary text file or a Microsoft Word file. Non-binary
     *        text files include files such as HTML, XML, JSON, and TXT files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withLineRange(Range lineRange) {
        setLineRange(lineRange);
        return this;
    }

    /**
     * <p>
     * An occurrence of sensitive data detected in a binary text file.
     * </p>
     * 
     * @param offsetRange
     *        An occurrence of sensitive data detected in a binary text file.
     */

    public void setOffsetRange(Range offsetRange) {
        this.offsetRange = offsetRange;
    }

    /**
     * <p>
     * An occurrence of sensitive data detected in a binary text file.
     * </p>
     * 
     * @return An occurrence of sensitive data detected in a binary text file.
     */

    public Range getOffsetRange() {
        return this.offsetRange;
    }

    /**
     * <p>
     * An occurrence of sensitive data detected in a binary text file.
     * </p>
     * 
     * @param offsetRange
     *        An occurrence of sensitive data detected in a binary text file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Page withOffsetRange(Range offsetRange) {
        setOffsetRange(offsetRange);
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
            sb.append("PageNumber: ").append(getPageNumber()).append(",");
        if (getLineRange() != null)
            sb.append("LineRange: ").append(getLineRange()).append(",");
        if (getOffsetRange() != null)
            sb.append("OffsetRange: ").append(getOffsetRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Page == false)
            return false;
        Page other = (Page) obj;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        if (other.getLineRange() == null ^ this.getLineRange() == null)
            return false;
        if (other.getLineRange() != null && other.getLineRange().equals(this.getLineRange()) == false)
            return false;
        if (other.getOffsetRange() == null ^ this.getOffsetRange() == null)
            return false;
        if (other.getOffsetRange() != null && other.getOffsetRange().equals(this.getOffsetRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        hashCode = prime * hashCode + ((getLineRange() == null) ? 0 : getLineRange().hashCode());
        hashCode = prime * hashCode + ((getOffsetRange() == null) ? 0 : getOffsetRange().hashCode());
        return hashCode;
    }

    @Override
    public Page clone() {
        try {
            return (Page) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.PageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
