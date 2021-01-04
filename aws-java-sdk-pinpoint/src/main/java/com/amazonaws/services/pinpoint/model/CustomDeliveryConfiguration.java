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
 * Specifies the delivery configuration settings for sending a campaign or campaign treatment through a custom channel.
 * This object is required if you use the CampaignCustomMessage object to define the message to send for the campaign or
 * campaign treatment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CustomDeliveryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomDeliveryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or
     * treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a
     * full URL, including the HTTPS protocol.
     * </p>
     * </li>
     * </ul>
     */
    private String deliveryUri;
    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you
     * can associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     */
    private java.util.List<String> endpointTypes;

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or
     * treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a
     * full URL, including the HTTPS protocol.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryUri
     *        The destination to send the campaign or treatment to. This value can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the
     *        campaign or treatment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The URL for a web application or service that supports HTTPS and can receive the message. The URL has to
     *        be a full URL, including the HTTPS protocol.
     *        </p>
     *        </li>
     */

    public void setDeliveryUri(String deliveryUri) {
        this.deliveryUri = deliveryUri;
    }

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or
     * treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a
     * full URL, including the HTTPS protocol.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The destination to send the campaign or treatment to. This value can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the
     *         campaign or treatment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The URL for a web application or service that supports HTTPS and can receive the message. The URL has to
     *         be a full URL, including the HTTPS protocol.
     *         </p>
     *         </li>
     */

    public String getDeliveryUri() {
        return this.deliveryUri;
    }

    /**
     * <p>
     * The destination to send the campaign or treatment to. This value can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the campaign or
     * treatment.
     * </p>
     * </li>
     * <li>
     * <p>
     * The URL for a web application or service that supports HTTPS and can receive the message. The URL has to be a
     * full URL, including the HTTPS protocol.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryUri
     *        The destination to send the campaign or treatment to. This value can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The name or Amazon Resource Name (ARN) of an AWS Lambda function to invoke to handle delivery of the
     *        campaign or treatment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The URL for a web application or service that supports HTTPS and can receive the message. The URL has to
     *        be a full URL, including the HTTPS protocol.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomDeliveryConfiguration withDeliveryUri(String deliveryUri) {
        setDeliveryUri(deliveryUri);
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you
     * can associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @return The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel
     *         that you can associate with an endpoint by using the ChannelType property of an endpoint.
     * @see EndpointTypesElement
     */

    public java.util.List<String> getEndpointTypes() {
        return endpointTypes;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you
     * can associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel
     *        that you can associate with an endpoint by using the ChannelType property of an endpoint.
     * @see EndpointTypesElement
     */

    public void setEndpointTypes(java.util.Collection<String> endpointTypes) {
        if (endpointTypes == null) {
            this.endpointTypes = null;
            return;
        }

        this.endpointTypes = new java.util.ArrayList<String>(endpointTypes);
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you
     * can associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointTypes(java.util.Collection)} or {@link #withEndpointTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel
     *        that you can associate with an endpoint by using the ChannelType property of an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointTypesElement
     */

    public CustomDeliveryConfiguration withEndpointTypes(String... endpointTypes) {
        if (this.endpointTypes == null) {
            setEndpointTypes(new java.util.ArrayList<String>(endpointTypes.length));
        }
        for (String ele : endpointTypes) {
            this.endpointTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you
     * can associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel
     *        that you can associate with an endpoint by using the ChannelType property of an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointTypesElement
     */

    public CustomDeliveryConfiguration withEndpointTypes(java.util.Collection<String> endpointTypes) {
        setEndpointTypes(endpointTypes);
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel that you
     * can associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the campaign or treatment to. Each valid value maps to a type of channel
     *        that you can associate with an endpoint by using the ChannelType property of an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointTypesElement
     */

    public CustomDeliveryConfiguration withEndpointTypes(EndpointTypesElement... endpointTypes) {
        java.util.ArrayList<String> endpointTypesCopy = new java.util.ArrayList<String>(endpointTypes.length);
        for (EndpointTypesElement value : endpointTypes) {
            endpointTypesCopy.add(value.toString());
        }
        if (getEndpointTypes() == null) {
            setEndpointTypes(endpointTypesCopy);
        } else {
            getEndpointTypes().addAll(endpointTypesCopy);
        }
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
        if (getDeliveryUri() != null)
            sb.append("DeliveryUri: ").append(getDeliveryUri()).append(",");
        if (getEndpointTypes() != null)
            sb.append("EndpointTypes: ").append(getEndpointTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomDeliveryConfiguration == false)
            return false;
        CustomDeliveryConfiguration other = (CustomDeliveryConfiguration) obj;
        if (other.getDeliveryUri() == null ^ this.getDeliveryUri() == null)
            return false;
        if (other.getDeliveryUri() != null && other.getDeliveryUri().equals(this.getDeliveryUri()) == false)
            return false;
        if (other.getEndpointTypes() == null ^ this.getEndpointTypes() == null)
            return false;
        if (other.getEndpointTypes() != null && other.getEndpointTypes().equals(this.getEndpointTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryUri() == null) ? 0 : getDeliveryUri().hashCode());
        hashCode = prime * hashCode + ((getEndpointTypes() == null) ? 0 : getEndpointTypes().hashCode());
        return hashCode;
    }

    @Override
    public CustomDeliveryConfiguration clone() {
        try {
            return (CustomDeliveryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CustomDeliveryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
