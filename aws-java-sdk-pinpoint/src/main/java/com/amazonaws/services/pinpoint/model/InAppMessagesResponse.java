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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Get in-app messages response object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessagesResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessagesResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of targeted in-app message campaigns.
     * </p>
     */
    private java.util.List<InAppMessageCampaign> inAppMessageCampaigns;

    /**
     * <p>
     * List of targeted in-app message campaigns.
     * </p>
     * 
     * @return List of targeted in-app message campaigns.
     */

    public java.util.List<InAppMessageCampaign> getInAppMessageCampaigns() {
        return inAppMessageCampaigns;
    }

    /**
     * <p>
     * List of targeted in-app message campaigns.
     * </p>
     * 
     * @param inAppMessageCampaigns
     *        List of targeted in-app message campaigns.
     */

    public void setInAppMessageCampaigns(java.util.Collection<InAppMessageCampaign> inAppMessageCampaigns) {
        if (inAppMessageCampaigns == null) {
            this.inAppMessageCampaigns = null;
            return;
        }

        this.inAppMessageCampaigns = new java.util.ArrayList<InAppMessageCampaign>(inAppMessageCampaigns);
    }

    /**
     * <p>
     * List of targeted in-app message campaigns.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInAppMessageCampaigns(java.util.Collection)} or
     * {@link #withInAppMessageCampaigns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inAppMessageCampaigns
     *        List of targeted in-app message campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessagesResponse withInAppMessageCampaigns(InAppMessageCampaign... inAppMessageCampaigns) {
        if (this.inAppMessageCampaigns == null) {
            setInAppMessageCampaigns(new java.util.ArrayList<InAppMessageCampaign>(inAppMessageCampaigns.length));
        }
        for (InAppMessageCampaign ele : inAppMessageCampaigns) {
            this.inAppMessageCampaigns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of targeted in-app message campaigns.
     * </p>
     * 
     * @param inAppMessageCampaigns
     *        List of targeted in-app message campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessagesResponse withInAppMessageCampaigns(java.util.Collection<InAppMessageCampaign> inAppMessageCampaigns) {
        setInAppMessageCampaigns(inAppMessageCampaigns);
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
        if (getInAppMessageCampaigns() != null)
            sb.append("InAppMessageCampaigns: ").append(getInAppMessageCampaigns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InAppMessagesResponse == false)
            return false;
        InAppMessagesResponse other = (InAppMessagesResponse) obj;
        if (other.getInAppMessageCampaigns() == null ^ this.getInAppMessageCampaigns() == null)
            return false;
        if (other.getInAppMessageCampaigns() != null && other.getInAppMessageCampaigns().equals(this.getInAppMessageCampaigns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInAppMessageCampaigns() == null) ? 0 : getInAppMessageCampaigns().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessagesResponse clone() {
        try {
            return (InAppMessagesResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessagesResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
