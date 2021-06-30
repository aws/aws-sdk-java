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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents additional options for correct interpretation of datetime parameters used in the Amazon S3 path of a
 * dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DatetimeOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatetimeOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should use
     * only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should be escaped
     * with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     * </p>
     */
    private String format;
    /**
     * <p>
     * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be used if
     * Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     * </p>
     */
    private String timezoneOffset;
    /**
     * <p>
     * Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     * </p>
     */
    private String localeCode;

    /**
     * <p>
     * Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should use
     * only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should be escaped
     * with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     * </p>
     * 
     * @param format
     *        Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should
     *        use only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should
     *        be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should use
     * only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should be escaped
     * with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     * </p>
     * 
     * @return Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should
     *         use only supported datetime specifiers and separation characters, all literal a-z or A-Z characters
     *         should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should use
     * only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should be escaped
     * with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     * </p>
     * 
     * @param format
     *        Required option, that defines the datetime format used for a date parameter in the Amazon S3 path. Should
     *        use only supported datetime specifiers and separation characters, all literal a-z or A-Z characters should
     *        be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatetimeOptions withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be used if
     * Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     * </p>
     * 
     * @param timezoneOffset
     *        Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be
     *        used if Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     */

    public void setTimezoneOffset(String timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    /**
     * <p>
     * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be used if
     * Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     * </p>
     * 
     * @return Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be
     *         used if Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     */

    public String getTimezoneOffset() {
        return this.timezoneOffset;
    }

    /**
     * <p>
     * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be used if
     * Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     * </p>
     * 
     * @param timezoneOffset
     *        Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path. Shouldn't be
     *        used if Format for this parameter includes timezone fields. If no offset specified, UTC is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatetimeOptions withTimezoneOffset(String timezoneOffset) {
        setTimezoneOffset(timezoneOffset);
        return this;
    }

    /**
     * <p>
     * Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     * </p>
     * 
     * @param localeCode
     *        Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     */

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    /**
     * <p>
     * Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     * </p>
     * 
     * @return Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     */

    public String getLocaleCode() {
        return this.localeCode;
    }

    /**
     * <p>
     * Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     * </p>
     * 
     * @param localeCode
     *        Optional value for a non-US locale code, needed for correct interpretation of some date formats.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatetimeOptions withLocaleCode(String localeCode) {
        setLocaleCode(localeCode);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getTimezoneOffset() != null)
            sb.append("TimezoneOffset: ").append(getTimezoneOffset()).append(",");
        if (getLocaleCode() != null)
            sb.append("LocaleCode: ").append(getLocaleCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatetimeOptions == false)
            return false;
        DatetimeOptions other = (DatetimeOptions) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getTimezoneOffset() == null ^ this.getTimezoneOffset() == null)
            return false;
        if (other.getTimezoneOffset() != null && other.getTimezoneOffset().equals(this.getTimezoneOffset()) == false)
            return false;
        if (other.getLocaleCode() == null ^ this.getLocaleCode() == null)
            return false;
        if (other.getLocaleCode() != null && other.getLocaleCode().equals(this.getLocaleCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getTimezoneOffset() == null) ? 0 : getTimezoneOffset().hashCode());
        hashCode = prime * hashCode + ((getLocaleCode() == null) ? 0 : getLocaleCode().hashCode());
        return hashCode;
    }

    @Override
    public DatetimeOptions clone() {
        try {
            return (DatetimeOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.DatetimeOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
