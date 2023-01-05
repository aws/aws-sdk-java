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
 * Specifies the audio input specifications.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AudioSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to application.
     * </p>
     */
    private Integer maxLengthMs;
    /**
     * <p>
     * Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     * </p>
     */
    private Integer endTimeoutMs;

    /**
     * <p>
     * Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to application.
     * </p>
     * 
     * @param maxLengthMs
     *        Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to
     *        application.
     */

    public void setMaxLengthMs(Integer maxLengthMs) {
        this.maxLengthMs = maxLengthMs;
    }

    /**
     * <p>
     * Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to application.
     * </p>
     * 
     * @return Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to
     *         application.
     */

    public Integer getMaxLengthMs() {
        return this.maxLengthMs;
    }

    /**
     * <p>
     * Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to application.
     * </p>
     * 
     * @param maxLengthMs
     *        Time for how long Amazon Lex waits before speech input is truncated and the speech is returned to
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSpecification withMaxLengthMs(Integer maxLengthMs) {
        setMaxLengthMs(maxLengthMs);
        return this;
    }

    /**
     * <p>
     * Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     * </p>
     * 
     * @param endTimeoutMs
     *        Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     */

    public void setEndTimeoutMs(Integer endTimeoutMs) {
        this.endTimeoutMs = endTimeoutMs;
    }

    /**
     * <p>
     * Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     * </p>
     * 
     * @return Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     */

    public Integer getEndTimeoutMs() {
        return this.endTimeoutMs;
    }

    /**
     * <p>
     * Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     * </p>
     * 
     * @param endTimeoutMs
     *        Time for which a bot waits after the customer stops speaking to assume the utterance is finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioSpecification withEndTimeoutMs(Integer endTimeoutMs) {
        setEndTimeoutMs(endTimeoutMs);
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
        if (getMaxLengthMs() != null)
            sb.append("MaxLengthMs: ").append(getMaxLengthMs()).append(",");
        if (getEndTimeoutMs() != null)
            sb.append("EndTimeoutMs: ").append(getEndTimeoutMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioSpecification == false)
            return false;
        AudioSpecification other = (AudioSpecification) obj;
        if (other.getMaxLengthMs() == null ^ this.getMaxLengthMs() == null)
            return false;
        if (other.getMaxLengthMs() != null && other.getMaxLengthMs().equals(this.getMaxLengthMs()) == false)
            return false;
        if (other.getEndTimeoutMs() == null ^ this.getEndTimeoutMs() == null)
            return false;
        if (other.getEndTimeoutMs() != null && other.getEndTimeoutMs().equals(this.getEndTimeoutMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxLengthMs() == null) ? 0 : getMaxLengthMs().hashCode());
        hashCode = prime * hashCode + ((getEndTimeoutMs() == null) ? 0 : getEndTimeoutMs().hashCode());
        return hashCode;
    }

    @Override
    public AudioSpecification clone() {
        try {
            return (AudioSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AudioSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
