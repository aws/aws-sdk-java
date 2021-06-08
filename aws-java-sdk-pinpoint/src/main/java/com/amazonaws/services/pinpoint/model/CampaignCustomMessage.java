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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the contents of a message that's sent through a custom channel to recipients of a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignCustomMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignCustomMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     * </p>
     */
    private String data;

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     * </p>
     * 
     * @param data
     *        The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     * </p>
     * 
     * @return The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     * </p>
     * 
     * @param data
     *        The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignCustomMessage withData(String data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: ").append(getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignCustomMessage == false)
            return false;
        CampaignCustomMessage other = (CampaignCustomMessage) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public CampaignCustomMessage clone() {
        try {
            return (CampaignCustomMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignCustomMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
