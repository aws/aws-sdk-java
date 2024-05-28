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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about when an on-call shift begins and ends.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/CoverageTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about when the on-call rotation shift begins.
     * </p>
     */
    private HandOffTime start;
    /**
     * <p>
     * Information about when the on-call rotation shift ends.
     * </p>
     */
    private HandOffTime end;

    /**
     * <p>
     * Information about when the on-call rotation shift begins.
     * </p>
     * 
     * @param start
     *        Information about when the on-call rotation shift begins.
     */

    public void setStart(HandOffTime start) {
        this.start = start;
    }

    /**
     * <p>
     * Information about when the on-call rotation shift begins.
     * </p>
     * 
     * @return Information about when the on-call rotation shift begins.
     */

    public HandOffTime getStart() {
        return this.start;
    }

    /**
     * <p>
     * Information about when the on-call rotation shift begins.
     * </p>
     * 
     * @param start
     *        Information about when the on-call rotation shift begins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageTime withStart(HandOffTime start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * Information about when the on-call rotation shift ends.
     * </p>
     * 
     * @param end
     *        Information about when the on-call rotation shift ends.
     */

    public void setEnd(HandOffTime end) {
        this.end = end;
    }

    /**
     * <p>
     * Information about when the on-call rotation shift ends.
     * </p>
     * 
     * @return Information about when the on-call rotation shift ends.
     */

    public HandOffTime getEnd() {
        return this.end;
    }

    /**
     * <p>
     * Information about when the on-call rotation shift ends.
     * </p>
     * 
     * @param end
     *        Information about when the on-call rotation shift ends.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageTime withEnd(HandOffTime end) {
        setEnd(end);
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
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageTime == false)
            return false;
        CoverageTime other = (CoverageTime) obj;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        return hashCode;
    }

    @Override
    public CoverageTime clone() {
        try {
            return (CoverageTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.CoverageTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
