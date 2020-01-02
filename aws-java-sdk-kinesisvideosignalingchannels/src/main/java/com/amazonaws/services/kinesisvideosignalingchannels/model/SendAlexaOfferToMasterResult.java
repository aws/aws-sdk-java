/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideosignalingchannels.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-video-signaling-2019-12-04/SendAlexaOfferToMaster"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendAlexaOfferToMasterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     */
    private String answer;

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * 
     * @param answer
     *        The base64-encoded SDP answer content.
     */

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * 
     * @return The base64-encoded SDP answer content.
     */

    public String getAnswer() {
        return this.answer;
    }

    /**
     * <p>
     * The base64-encoded SDP answer content.
     * </p>
     * 
     * @param answer
     *        The base64-encoded SDP answer content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendAlexaOfferToMasterResult withAnswer(String answer) {
        setAnswer(answer);
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
        if (getAnswer() != null)
            sb.append("Answer: ").append(getAnswer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendAlexaOfferToMasterResult == false)
            return false;
        SendAlexaOfferToMasterResult other = (SendAlexaOfferToMasterResult) obj;
        if (other.getAnswer() == null ^ this.getAnswer() == null)
            return false;
        if (other.getAnswer() != null && other.getAnswer().equals(this.getAnswer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        return hashCode;
    }

    @Override
    public SendAlexaOfferToMasterResult clone() {
        try {
            return (SendAlexaOfferToMasterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
