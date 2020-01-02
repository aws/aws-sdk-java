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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateVoiceTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVoiceTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     */
    private String templateName;

    private VoiceTemplateRequest voiceTemplateRequest;

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @param templateName
     *        The name of the message template. A template name must start with an alphanumeric character and can
     *        contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *        hyphens (-). Template names are case sensitive.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @return The name of the message template. A template name must start with an alphanumeric character and can
     *         contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *         hyphens (-). Template names are case sensitive.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an alphanumeric character and can contain a
     * maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or hyphens (-).
     * Template names are case sensitive.
     * </p>
     * 
     * @param templateName
     *        The name of the message template. A template name must start with an alphanumeric character and can
     *        contain a maximum of 128 characters. The characters can be alphanumeric characters, underscores (_), or
     *        hyphens (-). Template names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * @param voiceTemplateRequest
     */

    public void setVoiceTemplateRequest(VoiceTemplateRequest voiceTemplateRequest) {
        this.voiceTemplateRequest = voiceTemplateRequest;
    }

    /**
     * @return
     */

    public VoiceTemplateRequest getVoiceTemplateRequest() {
        return this.voiceTemplateRequest;
    }

    /**
     * @param voiceTemplateRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceTemplateRequest withVoiceTemplateRequest(VoiceTemplateRequest voiceTemplateRequest) {
        setVoiceTemplateRequest(voiceTemplateRequest);
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
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getVoiceTemplateRequest() != null)
            sb.append("VoiceTemplateRequest: ").append(getVoiceTemplateRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVoiceTemplateRequest == false)
            return false;
        CreateVoiceTemplateRequest other = (CreateVoiceTemplateRequest) obj;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getVoiceTemplateRequest() == null ^ this.getVoiceTemplateRequest() == null)
            return false;
        if (other.getVoiceTemplateRequest() != null && other.getVoiceTemplateRequest().equals(this.getVoiceTemplateRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVoiceTemplateRequest() == null) ? 0 : getVoiceTemplateRequest().hashCode());
        return hashCode;
    }

    @Override
    public CreateVoiceTemplateRequest clone() {
        return (CreateVoiceTemplateRequest) super.clone();
    }

}
