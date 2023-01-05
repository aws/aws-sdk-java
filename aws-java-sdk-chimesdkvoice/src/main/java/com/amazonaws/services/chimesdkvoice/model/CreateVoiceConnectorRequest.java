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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/CreateVoiceConnector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVoiceConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String name;

    private String awsRegion;

    private Boolean requireEncryption;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceConnectorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param awsRegion
     * @see VoiceConnectorAwsRegion
     */

    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    /**
     * @return
     * @see VoiceConnectorAwsRegion
     */

    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * @param awsRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public CreateVoiceConnectorRequest withAwsRegion(String awsRegion) {
        setAwsRegion(awsRegion);
        return this;
    }

    /**
     * @param awsRegion
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceConnectorAwsRegion
     */

    public CreateVoiceConnectorRequest withAwsRegion(VoiceConnectorAwsRegion awsRegion) {
        this.awsRegion = awsRegion.toString();
        return this;
    }

    /**
     * @param requireEncryption
     */

    public void setRequireEncryption(Boolean requireEncryption) {
        this.requireEncryption = requireEncryption;
    }

    /**
     * @return
     */

    public Boolean getRequireEncryption() {
        return this.requireEncryption;
    }

    /**
     * @param requireEncryption
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVoiceConnectorRequest withRequireEncryption(Boolean requireEncryption) {
        setRequireEncryption(requireEncryption);
        return this;
    }

    /**
     * @return
     */

    public Boolean isRequireEncryption() {
        return this.requireEncryption;
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
        if (getAwsRegion() != null)
            sb.append("AwsRegion: ").append(getAwsRegion()).append(",");
        if (getRequireEncryption() != null)
            sb.append("RequireEncryption: ").append(getRequireEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVoiceConnectorRequest == false)
            return false;
        CreateVoiceConnectorRequest other = (CreateVoiceConnectorRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAwsRegion() == null ^ this.getAwsRegion() == null)
            return false;
        if (other.getAwsRegion() != null && other.getAwsRegion().equals(this.getAwsRegion()) == false)
            return false;
        if (other.getRequireEncryption() == null ^ this.getRequireEncryption() == null)
            return false;
        if (other.getRequireEncryption() != null && other.getRequireEncryption().equals(this.getRequireEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAwsRegion() == null) ? 0 : getAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getRequireEncryption() == null) ? 0 : getRequireEncryption().hashCode());
        return hashCode;
    }

    @Override
    public CreateVoiceConnectorRequest clone() {
        return (CreateVoiceConnectorRequest) super.clone();
    }

}
