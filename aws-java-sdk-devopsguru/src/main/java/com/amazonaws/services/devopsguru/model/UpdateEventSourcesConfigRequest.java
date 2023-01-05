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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/UpdateEventSourcesConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventSourcesConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS
     * Service.
     * </p>
     */
    private EventSourcesConfig eventSources;

    /**
     * <p>
     * Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS
     * Service.
     * </p>
     * 
     * @param eventSources
     *        Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with
     *        another AWS Service.
     */

    public void setEventSources(EventSourcesConfig eventSources) {
        this.eventSources = eventSources;
    }

    /**
     * <p>
     * Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS
     * Service.
     * </p>
     * 
     * @return Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with
     *         another AWS Service.
     */

    public EventSourcesConfig getEventSources() {
        return this.eventSources;
    }

    /**
     * <p>
     * Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS
     * Service.
     * </p>
     * 
     * @param eventSources
     *        Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with
     *        another AWS Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventSourcesConfigRequest withEventSources(EventSourcesConfig eventSources) {
        setEventSources(eventSources);
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
        if (getEventSources() != null)
            sb.append("EventSources: ").append(getEventSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventSourcesConfigRequest == false)
            return false;
        UpdateEventSourcesConfigRequest other = (UpdateEventSourcesConfigRequest) obj;
        if (other.getEventSources() == null ^ this.getEventSources() == null)
            return false;
        if (other.getEventSources() != null && other.getEventSources().equals(this.getEventSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSources() == null) ? 0 : getEventSources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventSourcesConfigRequest clone() {
        return (UpdateEventSourcesConfigRequest) super.clone();
    }

}
