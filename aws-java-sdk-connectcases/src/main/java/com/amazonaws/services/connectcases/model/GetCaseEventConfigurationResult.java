/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseEventConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCaseEventConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration to enable EventBridge case event delivery and determine what data is delivered.
     * </p>
     */
    private EventBridgeConfiguration eventBridge;

    /**
     * <p>
     * Configuration to enable EventBridge case event delivery and determine what data is delivered.
     * </p>
     * 
     * @param eventBridge
     *        Configuration to enable EventBridge case event delivery and determine what data is delivered.
     */

    public void setEventBridge(EventBridgeConfiguration eventBridge) {
        this.eventBridge = eventBridge;
    }

    /**
     * <p>
     * Configuration to enable EventBridge case event delivery and determine what data is delivered.
     * </p>
     * 
     * @return Configuration to enable EventBridge case event delivery and determine what data is delivered.
     */

    public EventBridgeConfiguration getEventBridge() {
        return this.eventBridge;
    }

    /**
     * <p>
     * Configuration to enable EventBridge case event delivery and determine what data is delivered.
     * </p>
     * 
     * @param eventBridge
     *        Configuration to enable EventBridge case event delivery and determine what data is delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseEventConfigurationResult withEventBridge(EventBridgeConfiguration eventBridge) {
        setEventBridge(eventBridge);
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
        if (getEventBridge() != null)
            sb.append("EventBridge: ").append(getEventBridge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCaseEventConfigurationResult == false)
            return false;
        GetCaseEventConfigurationResult other = (GetCaseEventConfigurationResult) obj;
        if (other.getEventBridge() == null ^ this.getEventBridge() == null)
            return false;
        if (other.getEventBridge() != null && other.getEventBridge().equals(this.getEventBridge()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventBridge() == null) ? 0 : getEventBridge().hashCode());
        return hashCode;
    }

    @Override
    public GetCaseEventConfigurationResult clone() {
        try {
            return (GetCaseEventConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
