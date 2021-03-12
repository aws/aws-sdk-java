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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Splice insert message configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/SpliceInsertMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpliceInsertMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     */
    private Integer availNum;
    /**
     * <p>
     * This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     */
    private Integer availsExpected;
    /**
     * <p>
     * This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 1.
     * </p>
     */
    private Integer spliceEventId;
    /**
     * <p>
     * This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35 specification.
     * The default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     */
    private Integer uniqueProgramId;

    /**
     * <p>
     * This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @param availNum
     *        This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification.
     *        The default value is 0. Values must be between 0 and 256, inclusive.
     */

    public void setAvailNum(Integer availNum) {
        this.availNum = availNum;
    }

    /**
     * <p>
     * This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @return This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification.
     *         The default value is 0. Values must be between 0 and 256, inclusive.
     */

    public Integer getAvailNum() {
        return this.availNum;
    }

    /**
     * <p>
     * This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @param availNum
     *        This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification.
     *        The default value is 0. Values must be between 0 and 256, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpliceInsertMessage withAvailNum(Integer availNum) {
        setAvailNum(availNum);
        return this;
    }

    /**
     * <p>
     * This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @param availsExpected
     *        This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35
     *        specification. The default value is 0. Values must be between 0 and 256, inclusive.
     */

    public void setAvailsExpected(Integer availsExpected) {
        this.availsExpected = availsExpected;
    }

    /**
     * <p>
     * This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @return This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35
     *         specification. The default value is 0. Values must be between 0 and 256, inclusive.
     */

    public Integer getAvailsExpected() {
        return this.availsExpected;
    }

    /**
     * <p>
     * This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @param availsExpected
     *        This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35
     *        specification. The default value is 0. Values must be between 0 and 256, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpliceInsertMessage withAvailsExpected(Integer availsExpected) {
        setAvailsExpected(availsExpected);
        return this;
    }

    /**
     * <p>
     * This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 1.
     * </p>
     * 
     * @param spliceEventId
     *        This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35
     *        specification. The default value is 1.
     */

    public void setSpliceEventId(Integer spliceEventId) {
        this.spliceEventId = spliceEventId;
    }

    /**
     * <p>
     * This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 1.
     * </p>
     * 
     * @return This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35
     *         specification. The default value is 1.
     */

    public Integer getSpliceEventId() {
        return this.spliceEventId;
    }

    /**
     * <p>
     * This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35 specification. The
     * default value is 1.
     * </p>
     * 
     * @param spliceEventId
     *        This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35
     *        specification. The default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpliceInsertMessage withSpliceEventId(Integer spliceEventId) {
        setSpliceEventId(spliceEventId);
        return this;
    }

    /**
     * <p>
     * This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35 specification.
     * The default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @param uniqueProgramId
     *        This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35
     *        specification. The default value is 0. Values must be between 0 and 256, inclusive.
     */

    public void setUniqueProgramId(Integer uniqueProgramId) {
        this.uniqueProgramId = uniqueProgramId;
    }

    /**
     * <p>
     * This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35 specification.
     * The default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @return This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35
     *         specification. The default value is 0. Values must be between 0 and 256, inclusive.
     */

    public Integer getUniqueProgramId() {
        return this.uniqueProgramId;
    }

    /**
     * <p>
     * This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35 specification.
     * The default value is 0. Values must be between 0 and 256, inclusive.
     * </p>
     * 
     * @param uniqueProgramId
     *        This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35
     *        specification. The default value is 0. Values must be between 0 and 256, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpliceInsertMessage withUniqueProgramId(Integer uniqueProgramId) {
        setUniqueProgramId(uniqueProgramId);
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
        if (getAvailNum() != null)
            sb.append("AvailNum: ").append(getAvailNum()).append(",");
        if (getAvailsExpected() != null)
            sb.append("AvailsExpected: ").append(getAvailsExpected()).append(",");
        if (getSpliceEventId() != null)
            sb.append("SpliceEventId: ").append(getSpliceEventId()).append(",");
        if (getUniqueProgramId() != null)
            sb.append("UniqueProgramId: ").append(getUniqueProgramId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpliceInsertMessage == false)
            return false;
        SpliceInsertMessage other = (SpliceInsertMessage) obj;
        if (other.getAvailNum() == null ^ this.getAvailNum() == null)
            return false;
        if (other.getAvailNum() != null && other.getAvailNum().equals(this.getAvailNum()) == false)
            return false;
        if (other.getAvailsExpected() == null ^ this.getAvailsExpected() == null)
            return false;
        if (other.getAvailsExpected() != null && other.getAvailsExpected().equals(this.getAvailsExpected()) == false)
            return false;
        if (other.getSpliceEventId() == null ^ this.getSpliceEventId() == null)
            return false;
        if (other.getSpliceEventId() != null && other.getSpliceEventId().equals(this.getSpliceEventId()) == false)
            return false;
        if (other.getUniqueProgramId() == null ^ this.getUniqueProgramId() == null)
            return false;
        if (other.getUniqueProgramId() != null && other.getUniqueProgramId().equals(this.getUniqueProgramId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailNum() == null) ? 0 : getAvailNum().hashCode());
        hashCode = prime * hashCode + ((getAvailsExpected() == null) ? 0 : getAvailsExpected().hashCode());
        hashCode = prime * hashCode + ((getSpliceEventId() == null) ? 0 : getSpliceEventId().hashCode());
        hashCode = prime * hashCode + ((getUniqueProgramId() == null) ? 0 : getUniqueProgramId().hashCode());
        return hashCode;
    }

    @Override
    public SpliceInsertMessage clone() {
        try {
            return (SpliceInsertMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.SpliceInsertMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
