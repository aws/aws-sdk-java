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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateVoiceConnectorGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVoiceConnectorGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     */
    private java.util.List<VoiceConnectorItem> voiceConnectorItems;

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * 
     * @return The name of the Amazon Chime Voice Connector group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Amazon Chime Voice Connector group.
     * </p>
     * 
     * @param name
     *        The name of the Amazon Chime Voice Connector group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceConnectorGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     * 
     * @return The Amazon Chime Voice Connectors to route inbound calls to.
     */

    public java.util.List<VoiceConnectorItem> getVoiceConnectorItems() {
        return voiceConnectorItems;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     * 
     * @param voiceConnectorItems
     *        The Amazon Chime Voice Connectors to route inbound calls to.
     */

    public void setVoiceConnectorItems(java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        if (voiceConnectorItems == null) {
            this.voiceConnectorItems = null;
            return;
        }

        this.voiceConnectorItems = new java.util.ArrayList<VoiceConnectorItem>(voiceConnectorItems);
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVoiceConnectorItems(java.util.Collection)} or {@link #withVoiceConnectorItems(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param voiceConnectorItems
     *        The Amazon Chime Voice Connectors to route inbound calls to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceConnectorGroupRequest withVoiceConnectorItems(VoiceConnectorItem... voiceConnectorItems) {
        if (this.voiceConnectorItems == null) {
            setVoiceConnectorItems(new java.util.ArrayList<VoiceConnectorItem>(voiceConnectorItems.length));
        }
        for (VoiceConnectorItem ele : voiceConnectorItems) {
            this.voiceConnectorItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Chime Voice Connectors to route inbound calls to.
     * </p>
     * 
     * @param voiceConnectorItems
     *        The Amazon Chime Voice Connectors to route inbound calls to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceConnectorGroupRequest withVoiceConnectorItems(java.util.Collection<VoiceConnectorItem> voiceConnectorItems) {
        setVoiceConnectorItems(voiceConnectorItems);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVoiceConnectorItems() != null)
            sb.append("VoiceConnectorItems: ").append(getVoiceConnectorItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVoiceConnectorGroupRequest == false)
            return false;
        CreateVoiceConnectorGroupRequest other = (CreateVoiceConnectorGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVoiceConnectorItems() == null ^ this.getVoiceConnectorItems() == null)
            return false;
        if (other.getVoiceConnectorItems() != null && other.getVoiceConnectorItems().equals(this.getVoiceConnectorItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVoiceConnectorItems() == null) ? 0 : getVoiceConnectorItems().hashCode());
        return hashCode;
    }

    @Override
    public CreateVoiceConnectorGroupRequest clone() {
        return (CreateVoiceConnectorGroupRequest) super.clone();
    }

}
