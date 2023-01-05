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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/PutOptedOutNumber"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutOptedOutNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The OptOutListName or OptOutListArn to add the phone number to.
     * </p>
     */
    private String optOutListName;
    /**
     * <p>
     * The phone number to add to the OptOutList in E.164 format.
     * </p>
     */
    private String optedOutNumber;

    /**
     * <p>
     * The OptOutListName or OptOutListArn to add the phone number to.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutListName or OptOutListArn to add the phone number to.
     */

    public void setOptOutListName(String optOutListName) {
        this.optOutListName = optOutListName;
    }

    /**
     * <p>
     * The OptOutListName or OptOutListArn to add the phone number to.
     * </p>
     * 
     * @return The OptOutListName or OptOutListArn to add the phone number to.
     */

    public String getOptOutListName() {
        return this.optOutListName;
    }

    /**
     * <p>
     * The OptOutListName or OptOutListArn to add the phone number to.
     * </p>
     * 
     * @param optOutListName
     *        The OptOutListName or OptOutListArn to add the phone number to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberRequest withOptOutListName(String optOutListName) {
        setOptOutListName(optOutListName);
        return this;
    }

    /**
     * <p>
     * The phone number to add to the OptOutList in E.164 format.
     * </p>
     * 
     * @param optedOutNumber
     *        The phone number to add to the OptOutList in E.164 format.
     */

    public void setOptedOutNumber(String optedOutNumber) {
        this.optedOutNumber = optedOutNumber;
    }

    /**
     * <p>
     * The phone number to add to the OptOutList in E.164 format.
     * </p>
     * 
     * @return The phone number to add to the OptOutList in E.164 format.
     */

    public String getOptedOutNumber() {
        return this.optedOutNumber;
    }

    /**
     * <p>
     * The phone number to add to the OptOutList in E.164 format.
     * </p>
     * 
     * @param optedOutNumber
     *        The phone number to add to the OptOutList in E.164 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutOptedOutNumberRequest withOptedOutNumber(String optedOutNumber) {
        setOptedOutNumber(optedOutNumber);
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
        if (getOptOutListName() != null)
            sb.append("OptOutListName: ").append(getOptOutListName()).append(",");
        if (getOptedOutNumber() != null)
            sb.append("OptedOutNumber: ").append(getOptedOutNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutOptedOutNumberRequest == false)
            return false;
        PutOptedOutNumberRequest other = (PutOptedOutNumberRequest) obj;
        if (other.getOptOutListName() == null ^ this.getOptOutListName() == null)
            return false;
        if (other.getOptOutListName() != null && other.getOptOutListName().equals(this.getOptOutListName()) == false)
            return false;
        if (other.getOptedOutNumber() == null ^ this.getOptedOutNumber() == null)
            return false;
        if (other.getOptedOutNumber() != null && other.getOptedOutNumber().equals(this.getOptedOutNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptOutListName() == null) ? 0 : getOptOutListName().hashCode());
        hashCode = prime * hashCode + ((getOptedOutNumber() == null) ? 0 : getOptedOutNumber().hashCode());
        return hashCode;
    }

    @Override
    public PutOptedOutNumberRequest clone() {
        return (PutOptedOutNumberRequest) super.clone();
    }

}
