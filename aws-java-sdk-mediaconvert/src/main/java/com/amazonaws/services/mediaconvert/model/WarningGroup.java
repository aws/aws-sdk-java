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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Contains any warning codes and their count for the job.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/WarningGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WarningGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * Warning code that identifies a specific warning in the job. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     */
    private Integer code;
    /** The number of times this warning occurred in the job. */
    private Integer count;

    /**
     * Warning code that identifies a specific warning in the job. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     * 
     * @param code
     *        Warning code that identifies a specific warning in the job. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     */

    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Warning code that identifies a specific warning in the job. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     * 
     * @return Warning code that identifies a specific warning in the job. For more information, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     */

    public Integer getCode() {
        return this.code;
    }

    /**
     * Warning code that identifies a specific warning in the job. For more information, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     * 
     * @param code
     *        Warning code that identifies a specific warning in the job. For more information, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/warning_codes.html
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningGroup withCode(Integer code) {
        setCode(code);
        return this;
    }

    /**
     * The number of times this warning occurred in the job.
     * 
     * @param count
     *        The number of times this warning occurred in the job.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The number of times this warning occurred in the job.
     * 
     * @return The number of times this warning occurred in the job.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * The number of times this warning occurred in the job.
     * 
     * @param count
     *        The number of times this warning occurred in the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WarningGroup withCount(Integer count) {
        setCount(count);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarningGroup == false)
            return false;
        WarningGroup other = (WarningGroup) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public WarningGroup clone() {
        try {
            return (WarningGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.WarningGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
