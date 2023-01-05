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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutOptedOutNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOptedOutNumberResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The OptOutListArn that the phone number was removed from.
     * </p>
     */
    private String optOutListArn;
    /**
     * <p>
     * The OptOutListName that the phone number was removed from.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * The phone number that was added to the OptOutList.
     * </p>
     */
    private String optedOutNumber;
    /**
     * <p>
     * The time that the phone number was added to the OptOutList, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     */
    private java.util.Date optedOutTimestamp;
    /**
     * <p>
     * This is true if it was the end user who requested their phone number be removed.
     * </p>
     */
    private Boolean endUserOptedOut;

    /**
     * <p>
     * The OptOutListArn that the phone number was removed from.
     * </p>
     * 
     * @param optOutListArn
     *        The OptOutListArn that the phone number was removed from.
     */

    public void setOptOutListArn(String optOutListArn) {
        this.optOutListArn = optOutListArn;
    }

    /**
     * <p>
     * The OptOutListArn that the phone number was removed from.
     * </p>
     * 
     * @return The OptOutListArn that the phone number was removed from.
     */

    public String getOptOutListArn() {
        return this.optOutListArn;
    }

    /**
     * <p>
     * The OptOutListArn that the phone number was removed from.
     * </p>
     * 
     * @param optOutListArn
     *        The OptOutListArn that the phone number was removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberResult withOptOutListArn(String optOutListArn) {
        setOptOutListArn(optOutListArn);
        return this;
    }

    /**
     * <p>
     * The OptOutListName that the phone number was removed from.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutListName that the phone number was removed from.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The OptOutListName that the phone number was removed from.
     * </p>
     * 
     * @return The OptOutListName that the phone number was removed from.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The OptOutListName that the phone number was removed from.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutListName that the phone number was removed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberResult withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * The phone number that was added to the OptOutList.
     * </p>
     * 
     * @param optedOutNumber
     *        The phone number that was added to the OptOutList.
     */

    public void setOptedOutNumber(String optedOutNumber) {
        this.optedOutNumber = optedOutNumber;
    }

    /**
     * <p>
     * The phone number that was added to the OptOutList.
     * </p>
     * 
     * @return The phone number that was added to the OptOutList.
     */

    public String getOptedOutNumber() {
        return this.optedOutNumber;
    }

    /**
     * <p>
     * The phone number that was added to the OptOutList.
     * </p>
     * 
     * @param optedOutNumber
     *        The phone number that was added to the OptOutList.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberResult withOptedOutNumber(String optedOutNumber) {
        setOptedOutNumber(optedOutNumber);
        return this;
    }

    /**
     * <p>
     * The time that the phone number was added to the OptOutList, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param optedOutTimestamp
     *        The time that the phone number was added to the OptOutList, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public void setOptedOutTimestamp(java.util.Date optedOutTimestamp) {
        this.optedOutTimestamp = optedOutTimestamp;
    }

    /**
     * <p>
     * The time that the phone number was added to the OptOutList, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @return The time that the phone number was added to the OptOutList, in <a
     *         href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     */

    public java.util.Date getOptedOutTimestamp() {
        return this.optedOutTimestamp;
    }

    /**
     * <p>
     * The time that the phone number was added to the OptOutList, in <a href="https://www.epochconverter.com/">UNIX
     * epoch time</a> format.
     * </p>
     * 
     * @param optedOutTimestamp
     *        The time that the phone number was added to the OptOutList, in <a
     *        href="https://www.epochconverter.com/">UNIX epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberResult withOptedOutTimestamp(java.util.Date optedOutTimestamp) {
        setOptedOutTimestamp(optedOutTimestamp);
        return this;
    }

    /**
     * <p>
     * This is true if it was the end user who requested their phone number be removed.
     * </p>
     * 
     * @param endUserOptedOut
     *        This is true if it was the end user who requested their phone number be removed.
     */

    public void setEndUserOptedOut(Boolean endUserOptedOut) {
        this.endUserOptedOut = endUserOptedOut;
    }

    /**
     * <p>
     * This is true if it was the end user who requested their phone number be removed.
     * </p>
     * 
     * @return This is true if it was the end user who requested their phone number be removed.
     */

    public Boolean getEndUserOptedOut() {
        return this.endUserOptedOut;
    }

    /**
     * <p>
     * This is true if it was the end user who requested their phone number be removed.
     * </p>
     * 
     * @param endUserOptedOut
     *        This is true if it was the end user who requested their phone number be removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberResult withEndUserOptedOut(Boolean endUserOptedOut) {
        setEndUserOptedOut(endUserOptedOut);
        return this;
    }

    /**
     * <p>
     * This is true if it was the end user who requested their phone number be removed.
     * </p>
     * 
     * @return This is true if it was the end user who requested their phone number be removed.
     */

    public Boolean isEndUserOptedOut() {
        return this.endUserOptedOut;
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
        if (getOptOutListArn() != null)
            sb.append("OptOutListArn: ").append(getOptOutListArn()).append(",");
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getOptedOutNumber() != null)
            sb.append("OptedOutNumber: ").append(getOptedOutNumber()).append(",");
        if (getOptedOutTimestamp() != null)
            sb.append("OptedOutTimestamp: ").append(getOptedOutTimestamp()).append(",");
        if (getEndUserOptedOut() != null)
            sb.append("EndUserOptedOut: ").append(getEndUserOptedOut());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOptedOutNumberResult == false)
            return false;
        PutOptedOutNumberResult other = (PutOptedOutNumberResult) obj;
        if (other.getOptOutListArn() == null ^ this.getOptOutListArn() == null)
            return false;
        if (other.getOptOutListArn() != null && other.getOptOutListArn().equals(this.getOptOutListArn()) == false)
            return false;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getOptedOutNumber() == null ^ this.getOptedOutNumber() == null)
            return false;
        if (other.getOptedOutNumber() != null && other.getOptedOutNumber().equals(this.getOptedOutNumber()) == false)
            return false;
        if (other.getOptedOutTimestamp() == null ^ this.getOptedOutTimestamp() == null)
            return false;
        if (other.getOptedOutTimestamp() != null && other.getOptedOutTimestamp().equals(this.getOptedOutTimestamp()) == false)
            return false;
        if (other.getEndUserOptedOut() == null ^ this.getEndUserOptedOut() == null)
            return false;
        if (other.getEndUserOptedOut() != null && other.getEndUserOptedOut().equals(this.getEndUserOptedOut()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptOutListArn() == null) ? 0 : getOptOutListArn().hashCode());
        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getOptedOutNumber() == null) ? 0 : getOptedOutNumber().hashCode());
        hashCode = prime * hashCode + ((getOptedOutTimestamp() == null) ? 0 : getOptedOutTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndUserOptedOut() == null) ? 0 : getEndUserOptedOut().hashCode());
        return hashCode;
    }

    @Override
    public PutOptedOutNumberResult clone() {
        try {
            return (PutOptedOutNumberResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
