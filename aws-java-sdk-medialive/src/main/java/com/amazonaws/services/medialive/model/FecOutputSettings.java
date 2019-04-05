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
 * Fec Output Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/FecOutputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FecOutputSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream packets
     * per column error correction packet. Must be between 4 and 20, inclusive.
     */
    private Integer columnDepth;
    /** Enables column only or column and row based FEC */
    private String includeFec;
    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20, inclusive. If
     * only Column FEC is used, then larger values increase robustness. If Row FEC is used, then this is the number of
     * transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if
     * includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
     */
    private Integer rowLength;

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream packets
     * per column error correction packet. Must be between 4 and 20, inclusive.
     * 
     * @param columnDepth
     *        Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream
     *        packets per column error correction packet. Must be between 4 and 20, inclusive.
     */

    public void setColumnDepth(Integer columnDepth) {
        this.columnDepth = columnDepth;
    }

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream packets
     * per column error correction packet. Must be between 4 and 20, inclusive.
     * 
     * @return Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream
     *         packets per column error correction packet. Must be between 4 and 20, inclusive.
     */

    public Integer getColumnDepth() {
        return this.columnDepth;
    }

    /**
     * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream packets
     * per column error correction packet. Must be between 4 and 20, inclusive.
     * 
     * @param columnDepth
     *        Parameter D from SMPTE 2022-1. The height of the FEC protection matrix. The number of transport stream
     *        packets per column error correction packet. Must be between 4 and 20, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FecOutputSettings withColumnDepth(Integer columnDepth) {
        setColumnDepth(columnDepth);
        return this;
    }

    /**
     * Enables column only or column and row based FEC
     * 
     * @param includeFec
     *        Enables column only or column and row based FEC
     * @see FecOutputIncludeFec
     */

    public void setIncludeFec(String includeFec) {
        this.includeFec = includeFec;
    }

    /**
     * Enables column only or column and row based FEC
     * 
     * @return Enables column only or column and row based FEC
     * @see FecOutputIncludeFec
     */

    public String getIncludeFec() {
        return this.includeFec;
    }

    /**
     * Enables column only or column and row based FEC
     * 
     * @param includeFec
     *        Enables column only or column and row based FEC
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FecOutputIncludeFec
     */

    public FecOutputSettings withIncludeFec(String includeFec) {
        setIncludeFec(includeFec);
        return this;
    }

    /**
     * Enables column only or column and row based FEC
     * 
     * @param includeFec
     *        Enables column only or column and row based FEC
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FecOutputIncludeFec
     */

    public FecOutputSettings withIncludeFec(FecOutputIncludeFec includeFec) {
        this.includeFec = includeFec.toString();
        return this;
    }

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20, inclusive. If
     * only Column FEC is used, then larger values increase robustness. If Row FEC is used, then this is the number of
     * transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if
     * includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
     * 
     * @param rowLength
     *        Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20,
     *        inclusive. If only Column FEC is used, then larger values increase robustness. If Row FEC is used, then
     *        this is the number of transport stream packets per row error correction packet, and the value must be
     *        between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1
     *        to 20, inclusive.
     */

    public void setRowLength(Integer rowLength) {
        this.rowLength = rowLength;
    }

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20, inclusive. If
     * only Column FEC is used, then larger values increase robustness. If Row FEC is used, then this is the number of
     * transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if
     * includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
     * 
     * @return Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20,
     *         inclusive. If only Column FEC is used, then larger values increase robustness. If Row FEC is used, then
     *         this is the number of transport stream packets per row error correction packet, and the value must be
     *         between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1
     *         to 20, inclusive.
     */

    public Integer getRowLength() {
        return this.rowLength;
    }

    /**
     * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20, inclusive. If
     * only Column FEC is used, then larger values increase robustness. If Row FEC is used, then this is the number of
     * transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if
     * includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
     * 
     * @param rowLength
     *        Parameter L from SMPTE 2022-1. The width of the FEC protection matrix. Must be between 1 and 20,
     *        inclusive. If only Column FEC is used, then larger values increase robustness. If Row FEC is used, then
     *        this is the number of transport stream packets per row error correction packet, and the value must be
     *        between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1
     *        to 20, inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FecOutputSettings withRowLength(Integer rowLength) {
        setRowLength(rowLength);
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
        if (getColumnDepth() != null)
            sb.append("ColumnDepth: ").append(getColumnDepth()).append(",");
        if (getIncludeFec() != null)
            sb.append("IncludeFec: ").append(getIncludeFec()).append(",");
        if (getRowLength() != null)
            sb.append("RowLength: ").append(getRowLength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FecOutputSettings == false)
            return false;
        FecOutputSettings other = (FecOutputSettings) obj;
        if (other.getColumnDepth() == null ^ this.getColumnDepth() == null)
            return false;
        if (other.getColumnDepth() != null && other.getColumnDepth().equals(this.getColumnDepth()) == false)
            return false;
        if (other.getIncludeFec() == null ^ this.getIncludeFec() == null)
            return false;
        if (other.getIncludeFec() != null && other.getIncludeFec().equals(this.getIncludeFec()) == false)
            return false;
        if (other.getRowLength() == null ^ this.getRowLength() == null)
            return false;
        if (other.getRowLength() != null && other.getRowLength().equals(this.getRowLength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumnDepth() == null) ? 0 : getColumnDepth().hashCode());
        hashCode = prime * hashCode + ((getIncludeFec() == null) ? 0 : getIncludeFec().hashCode());
        hashCode = prime * hashCode + ((getRowLength() == null) ? 0 : getRowLength().hashCode());
        return hashCode;
    }

    @Override
    public FecOutputSettings clone() {
        try {
            return (FecOutputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.FecOutputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
