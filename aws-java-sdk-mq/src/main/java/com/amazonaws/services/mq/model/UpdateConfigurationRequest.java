/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Updates the specified configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/UpdateConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID that Amazon MQ generates for the configuration. */
    private String configurationId;
    /** Required. The base64-encoded XML configuration. */
    private String data;
    /** The description of the configuration. */
    private String description;

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @return The unique ID that Amazon MQ generates for the configuration.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * The unique ID that Amazon MQ generates for the configuration.
     * 
     * @param configurationId
     *        The unique ID that Amazon MQ generates for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * Required. The base64-encoded XML configuration.
     * 
     * @param data
     *        Required. The base64-encoded XML configuration.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Required. The base64-encoded XML configuration.
     * 
     * @return Required. The base64-encoded XML configuration.
     */

    public String getData() {
        return this.data;
    }

    /**
     * Required. The base64-encoded XML configuration.
     * 
     * @param data
     *        Required. The base64-encoded XML configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationRequest withData(String data) {
        setData(data);
        return this;
    }

    /**
     * The description of the configuration.
     * 
     * @param description
     *        The description of the configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of the configuration.
     * 
     * @return The description of the configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * The description of the configuration.
     * 
     * @param description
     *        The description of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationRequest withDescription(String description) {
        setDescription(description);
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationRequest == false)
            return false;
        UpdateConfigurationRequest other = (UpdateConfigurationRequest) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationRequest clone() {
        return (UpdateConfigurationRequest) super.clone();
    }

}
