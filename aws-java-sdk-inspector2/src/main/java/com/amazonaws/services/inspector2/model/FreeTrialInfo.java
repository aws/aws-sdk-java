/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the Amazon Inspector free trial for an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FreeTrialInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FreeTrialInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail ends for a given account.
     * </p>
     */
    private java.util.Date end;
    /**
     * <p>
     * The date and time that the Amazon Inspector free trail started for a given account.
     * </p>
     */
    private java.util.Date start;
    /**
     * <p>
     * The order to sort results by.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of scan covered by the Amazon Inspector free trail.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail ends for a given account.
     * </p>
     * 
     * @param end
     *        The date and time that the Amazon Inspector free trail ends for a given account.
     */

    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail ends for a given account.
     * </p>
     * 
     * @return The date and time that the Amazon Inspector free trail ends for a given account.
     */

    public java.util.Date getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail ends for a given account.
     * </p>
     * 
     * @param end
     *        The date and time that the Amazon Inspector free trail ends for a given account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialInfo withEnd(java.util.Date end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail started for a given account.
     * </p>
     * 
     * @param start
     *        The date and time that the Amazon Inspector free trail started for a given account.
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail started for a given account.
     * </p>
     * 
     * @return The date and time that the Amazon Inspector free trail started for a given account.
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The date and time that the Amazon Inspector free trail started for a given account.
     * </p>
     * 
     * @param start
     *        The date and time that the Amazon Inspector free trail started for a given account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FreeTrialInfo withStart(java.util.Date start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param status
     *        The order to sort results by.
     * @see FreeTrialStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @return The order to sort results by.
     * @see FreeTrialStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param status
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialStatus
     */

    public FreeTrialInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param status
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialStatus
     */

    public FreeTrialInfo withStatus(FreeTrialStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of scan covered by the Amazon Inspector free trail.
     * </p>
     * 
     * @param type
     *        The type of scan covered by the Amazon Inspector free trail.
     * @see FreeTrialType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of scan covered by the Amazon Inspector free trail.
     * </p>
     * 
     * @return The type of scan covered by the Amazon Inspector free trail.
     * @see FreeTrialType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of scan covered by the Amazon Inspector free trail.
     * </p>
     * 
     * @param type
     *        The type of scan covered by the Amazon Inspector free trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialType
     */

    public FreeTrialInfo withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of scan covered by the Amazon Inspector free trail.
     * </p>
     * 
     * @param type
     *        The type of scan covered by the Amazon Inspector free trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FreeTrialType
     */

    public FreeTrialInfo withType(FreeTrialType type) {
        this.type = type.toString();
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
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FreeTrialInfo == false)
            return false;
        FreeTrialInfo other = (FreeTrialInfo) obj;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public FreeTrialInfo clone() {
        try {
            return (FreeTrialInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FreeTrialInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
