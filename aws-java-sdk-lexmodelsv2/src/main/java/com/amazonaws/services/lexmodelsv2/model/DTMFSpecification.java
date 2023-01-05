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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the DTMF input specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DTMFSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DTMFSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of DTMF digits allowed in an utterance.
     * </p>
     */
    private Integer maxLength;
    /**
     * <p>
     * How long the bot should wait after the last DTMF character input before assuming that the input has concluded.
     * </p>
     */
    private Integer endTimeoutMs;
    /**
     * <p>
     * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     * </p>
     */
    private String deletionCharacter;
    /**
     * <p>
     * The DTMF character that immediately ends input. If the user does not press this character, the input ends after
     * the end timeout.
     * </p>
     */
    private String endCharacter;

    /**
     * <p>
     * The maximum number of DTMF digits allowed in an utterance.
     * </p>
     * 
     * @param maxLength
     *        The maximum number of DTMF digits allowed in an utterance.
     */

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * <p>
     * The maximum number of DTMF digits allowed in an utterance.
     * </p>
     * 
     * @return The maximum number of DTMF digits allowed in an utterance.
     */

    public Integer getMaxLength() {
        return this.maxLength;
    }

    /**
     * <p>
     * The maximum number of DTMF digits allowed in an utterance.
     * </p>
     * 
     * @param maxLength
     *        The maximum number of DTMF digits allowed in an utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DTMFSpecification withMaxLength(Integer maxLength) {
        setMaxLength(maxLength);
        return this;
    }

    /**
     * <p>
     * How long the bot should wait after the last DTMF character input before assuming that the input has concluded.
     * </p>
     * 
     * @param endTimeoutMs
     *        How long the bot should wait after the last DTMF character input before assuming that the input has
     *        concluded.
     */

    public void setEndTimeoutMs(Integer endTimeoutMs) {
        this.endTimeoutMs = endTimeoutMs;
    }

    /**
     * <p>
     * How long the bot should wait after the last DTMF character input before assuming that the input has concluded.
     * </p>
     * 
     * @return How long the bot should wait after the last DTMF character input before assuming that the input has
     *         concluded.
     */

    public Integer getEndTimeoutMs() {
        return this.endTimeoutMs;
    }

    /**
     * <p>
     * How long the bot should wait after the last DTMF character input before assuming that the input has concluded.
     * </p>
     * 
     * @param endTimeoutMs
     *        How long the bot should wait after the last DTMF character input before assuming that the input has
     *        concluded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DTMFSpecification withEndTimeoutMs(Integer endTimeoutMs) {
        setEndTimeoutMs(endTimeoutMs);
        return this;
    }

    /**
     * <p>
     * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     * </p>
     * 
     * @param deletionCharacter
     *        The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     */

    public void setDeletionCharacter(String deletionCharacter) {
        this.deletionCharacter = deletionCharacter;
    }

    /**
     * <p>
     * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     * </p>
     * 
     * @return The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     */

    public String getDeletionCharacter() {
        return this.deletionCharacter;
    }

    /**
     * <p>
     * The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     * </p>
     * 
     * @param deletionCharacter
     *        The DTMF character that clears the accumulated DTMF digits and immediately ends the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DTMFSpecification withDeletionCharacter(String deletionCharacter) {
        setDeletionCharacter(deletionCharacter);
        return this;
    }

    /**
     * <p>
     * The DTMF character that immediately ends input. If the user does not press this character, the input ends after
     * the end timeout.
     * </p>
     * 
     * @param endCharacter
     *        The DTMF character that immediately ends input. If the user does not press this character, the input ends
     *        after the end timeout.
     */

    public void setEndCharacter(String endCharacter) {
        this.endCharacter = endCharacter;
    }

    /**
     * <p>
     * The DTMF character that immediately ends input. If the user does not press this character, the input ends after
     * the end timeout.
     * </p>
     * 
     * @return The DTMF character that immediately ends input. If the user does not press this character, the input ends
     *         after the end timeout.
     */

    public String getEndCharacter() {
        return this.endCharacter;
    }

    /**
     * <p>
     * The DTMF character that immediately ends input. If the user does not press this character, the input ends after
     * the end timeout.
     * </p>
     * 
     * @param endCharacter
     *        The DTMF character that immediately ends input. If the user does not press this character, the input ends
     *        after the end timeout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DTMFSpecification withEndCharacter(String endCharacter) {
        setEndCharacter(endCharacter);
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
        if (getMaxLength() != null)
            sb.append("MaxLength: ").append(getMaxLength()).append(",");
        if (getEndTimeoutMs() != null)
            sb.append("EndTimeoutMs: ").append(getEndTimeoutMs()).append(",");
        if (getDeletionCharacter() != null)
            sb.append("DeletionCharacter: ").append(getDeletionCharacter()).append(",");
        if (getEndCharacter() != null)
            sb.append("EndCharacter: ").append(getEndCharacter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DTMFSpecification == false)
            return false;
        DTMFSpecification other = (DTMFSpecification) obj;
        if (other.getMaxLength() == null ^ this.getMaxLength() == null)
            return false;
        if (other.getMaxLength() != null && other.getMaxLength().equals(this.getMaxLength()) == false)
            return false;
        if (other.getEndTimeoutMs() == null ^ this.getEndTimeoutMs() == null)
            return false;
        if (other.getEndTimeoutMs() != null && other.getEndTimeoutMs().equals(this.getEndTimeoutMs()) == false)
            return false;
        if (other.getDeletionCharacter() == null ^ this.getDeletionCharacter() == null)
            return false;
        if (other.getDeletionCharacter() != null && other.getDeletionCharacter().equals(this.getDeletionCharacter()) == false)
            return false;
        if (other.getEndCharacter() == null ^ this.getEndCharacter() == null)
            return false;
        if (other.getEndCharacter() != null && other.getEndCharacter().equals(this.getEndCharacter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxLength() == null) ? 0 : getMaxLength().hashCode());
        hashCode = prime * hashCode + ((getEndTimeoutMs() == null) ? 0 : getEndTimeoutMs().hashCode());
        hashCode = prime * hashCode + ((getDeletionCharacter() == null) ? 0 : getDeletionCharacter().hashCode());
        hashCode = prime * hashCode + ((getEndCharacter() == null) ? 0 : getEndCharacter().hashCode());
        return hashCode;
    }

    @Override
    public DTMFSpecification clone() {
        try {
            return (DTMFSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.DTMFSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
