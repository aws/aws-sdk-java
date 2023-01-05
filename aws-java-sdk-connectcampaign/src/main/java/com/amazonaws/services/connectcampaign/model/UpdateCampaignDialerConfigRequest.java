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
package com.amazonaws.services.connectcampaign.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * UpdateCampaignDialerConfigRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcampaigns-2021-01-30/UpdateCampaignDialerConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCampaignDialerConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private DialerConfig dialerConfig;

    private String id;

    /**
     * @param dialerConfig
     */

    public void setDialerConfig(DialerConfig dialerConfig) {
        this.dialerConfig = dialerConfig;
    }

    /**
     * @return
     */

    public DialerConfig getDialerConfig() {
        return this.dialerConfig;
    }

    /**
     * @param dialerConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignDialerConfigRequest withDialerConfig(DialerConfig dialerConfig) {
        setDialerConfig(dialerConfig);
        return this;
    }

    /**
     * @param id
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */

    public String getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCampaignDialerConfigRequest withId(String id) {
        setId(id);
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
        if (getDialerConfig() != null)
            sb.append("DialerConfig: ").append(getDialerConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignDialerConfigRequest == false)
            return false;
        UpdateCampaignDialerConfigRequest other = (UpdateCampaignDialerConfigRequest) obj;
        if (other.getDialerConfig() == null ^ this.getDialerConfig() == null)
            return false;
        if (other.getDialerConfig() != null && other.getDialerConfig().equals(this.getDialerConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDialerConfig() == null) ? 0 : getDialerConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCampaignDialerConfigRequest clone() {
        return (UpdateCampaignDialerConfigRequest) super.clone();
    }

}
