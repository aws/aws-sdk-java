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
 * The settings for a custom message activity. This type of activity calls an AWS Lambda function or web hook that sends
 * messages to participants.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CustomMessageActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomMessageActivity implements Serializable, Cloneable, StructuredPojo {

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
     * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can
     * associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     */
    private java.util.List<String> endpointTypes;
    /**
     * <p>
     * Specifies the message data included in a custom channel message that's sent to participants in a journey.
     * </p>
     */
    private JourneyCustomMessage messageConfig;
    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda function or
     * web hook.
     * </p>
     */
    private String nextActivity;
    /**
     * <p>
     * The name of the custom message template to use for the message. If specified, this value must match the name of
     * an existing message template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     */
    private String templateVersion;

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

    public CustomMessageActivity withDeliveryUri(String deliveryUri) {
        setDeliveryUri(deliveryUri);
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can
     * associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @return The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you
     *         can associate with an endpoint by using the ChannelType property of an endpoint.
     * @see EndpointTypesElement
     */

    public java.util.List<String> getEndpointTypes() {
        return endpointTypes;
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can
     * associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you
     *        can associate with an endpoint by using the ChannelType property of an endpoint.
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
     * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can
     * associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointTypes(java.util.Collection)} or {@link #withEndpointTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you
     *        can associate with an endpoint by using the ChannelType property of an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointTypesElement
     */

    public CustomMessageActivity withEndpointTypes(String... endpointTypes) {
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
     * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can
     * associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you
     *        can associate with an endpoint by using the ChannelType property of an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointTypesElement
     */

    public CustomMessageActivity withEndpointTypes(java.util.Collection<String> endpointTypes) {
        setEndpointTypes(endpointTypes);
        return this;
    }

    /**
     * <p>
     * The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you can
     * associate with an endpoint by using the ChannelType property of an endpoint.
     * </p>
     * 
     * @param endpointTypes
     *        The types of endpoints to send the custom message to. Each valid value maps to a type of channel that you
     *        can associate with an endpoint by using the ChannelType property of an endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointTypesElement
     */

    public CustomMessageActivity withEndpointTypes(EndpointTypesElement... endpointTypes) {
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
     * <p>
     * Specifies the message data included in a custom channel message that's sent to participants in a journey.
     * </p>
     * 
     * @param messageConfig
     *        Specifies the message data included in a custom channel message that's sent to participants in a journey.
     */

    public void setMessageConfig(JourneyCustomMessage messageConfig) {
        this.messageConfig = messageConfig;
    }

    /**
     * <p>
     * Specifies the message data included in a custom channel message that's sent to participants in a journey.
     * </p>
     * 
     * @return Specifies the message data included in a custom channel message that's sent to participants in a journey.
     */

    public JourneyCustomMessage getMessageConfig() {
        return this.messageConfig;
    }

    /**
     * <p>
     * Specifies the message data included in a custom channel message that's sent to participants in a journey.
     * </p>
     * 
     * @param messageConfig
     *        Specifies the message data included in a custom channel message that's sent to participants in a journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomMessageActivity withMessageConfig(JourneyCustomMessage messageConfig) {
        setMessageConfig(messageConfig);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda function or
     * web hook.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda
     *        function or web hook.
     */

    public void setNextActivity(String nextActivity) {
        this.nextActivity = nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda function or
     * web hook.
     * </p>
     * 
     * @return The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda
     *         function or web hook.
     */

    public String getNextActivity() {
        return this.nextActivity;
    }

    /**
     * <p>
     * The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda function or
     * web hook.
     * </p>
     * 
     * @param nextActivity
     *        The unique identifier for the next activity to perform, after Amazon Pinpoint calls the AWS Lambda
     *        function or web hook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomMessageActivity withNextActivity(String nextActivity) {
        setNextActivity(nextActivity);
        return this;
    }

    /**
     * <p>
     * The name of the custom message template to use for the message. If specified, this value must match the name of
     * an existing message template.
     * </p>
     * 
     * @param templateName
     *        The name of the custom message template to use for the message. If specified, this value must match the
     *        name of an existing message template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the custom message template to use for the message. If specified, this value must match the name of
     * an existing message template.
     * </p>
     * 
     * @return The name of the custom message template to use for the message. If specified, this value must match the
     *         name of an existing message template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the custom message template to use for the message. If specified, this value must match the name of
     * an existing message template.
     * </p>
     * 
     * @param templateName
     *        The name of the custom message template to use for the message. If specified, this value must match the
     *        name of an existing message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomMessageActivity withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @param templateVersion
     *        The unique identifier for the version of the message template to use for the message. If specified, this
     *        value must match the identifier for an existing template version. To retrieve a list of versions and
     *        version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *        template. The <i>active version</i> is typically the version of a template that's been most recently
     *        reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *        template.
     */

    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @return The unique identifier for the version of the message template to use for the message. If specified, this
     *         value must match the identifier for an existing template version. To retrieve a list of versions and
     *         version identifiers for a template, use the <link
     *         linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *         <p>
     *         If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *         template. The <i>active version</i> is typically the version of a template that's been most recently
     *         reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *         template.
     */

    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template to use for the message. If specified, this value
     * must match the identifier for an existing template version. To retrieve a list of versions and version
     * identifiers for a template, use the <link linkend="templates-template-name-template-type-versions">Template
     * Versions</link> resource.
     * </p>
     * <p>
     * If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the template.
     * The <i>active version</i> is typically the version of a template that's been most recently reviewed and approved
     * for use, depending on your workflow. It isn't necessarily the latest version of a template.
     * </p>
     * 
     * @param templateVersion
     *        The unique identifier for the version of the message template to use for the message. If specified, this
     *        value must match the identifier for an existing template version. To retrieve a list of versions and
     *        version identifiers for a template, use the <link
     *        linkend="templates-template-name-template-type-versions">Template Versions</link> resource.</p>
     *        <p>
     *        If you don't specify a value for this property, Amazon Pinpoint uses the <i>active version</i> of the
     *        template. The <i>active version</i> is typically the version of a template that's been most recently
     *        reviewed and approved for use, depending on your workflow. It isn't necessarily the latest version of a
     *        template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomMessageActivity withTemplateVersion(String templateVersion) {
        setTemplateVersion(templateVersion);
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
            sb.append("EndpointTypes: ").append(getEndpointTypes()).append(",");
        if (getMessageConfig() != null)
            sb.append("MessageConfig: ").append(getMessageConfig()).append(",");
        if (getNextActivity() != null)
            sb.append("NextActivity: ").append(getNextActivity()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateVersion() != null)
            sb.append("TemplateVersion: ").append(getTemplateVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomMessageActivity == false)
            return false;
        CustomMessageActivity other = (CustomMessageActivity) obj;
        if (other.getDeliveryUri() == null ^ this.getDeliveryUri() == null)
            return false;
        if (other.getDeliveryUri() != null && other.getDeliveryUri().equals(this.getDeliveryUri()) == false)
            return false;
        if (other.getEndpointTypes() == null ^ this.getEndpointTypes() == null)
            return false;
        if (other.getEndpointTypes() != null && other.getEndpointTypes().equals(this.getEndpointTypes()) == false)
            return false;
        if (other.getMessageConfig() == null ^ this.getMessageConfig() == null)
            return false;
        if (other.getMessageConfig() != null && other.getMessageConfig().equals(this.getMessageConfig()) == false)
            return false;
        if (other.getNextActivity() == null ^ this.getNextActivity() == null)
            return false;
        if (other.getNextActivity() != null && other.getNextActivity().equals(this.getNextActivity()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryUri() == null) ? 0 : getDeliveryUri().hashCode());
        hashCode = prime * hashCode + ((getEndpointTypes() == null) ? 0 : getEndpointTypes().hashCode());
        hashCode = prime * hashCode + ((getMessageConfig() == null) ? 0 : getMessageConfig().hashCode());
        hashCode = prime * hashCode + ((getNextActivity() == null) ? 0 : getNextActivity().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public CustomMessageActivity clone() {
        try {
            return (CustomMessageActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CustomMessageActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
