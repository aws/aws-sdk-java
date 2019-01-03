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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a get repository triggers operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetRepositoryTriggers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositoryTriggersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     */
    private java.util.List<RepositoryTrigger> triggers;

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     * 
     * @param configurationId
     *        The system-generated unique ID for the trigger.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     * 
     * @return The system-generated unique ID for the trigger.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the trigger.
     * </p>
     * 
     * @param configurationId
     *        The system-generated unique ID for the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryTriggersResult withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     * 
     * @return The JSON block of configuration information for each trigger.
     */

    public java.util.List<RepositoryTrigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     * 
     * @param triggers
     *        The JSON block of configuration information for each trigger.
     */

    public void setTriggers(java.util.Collection<RepositoryTrigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<RepositoryTrigger>(triggers);
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggers(java.util.Collection)} or {@link #withTriggers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param triggers
     *        The JSON block of configuration information for each trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryTriggersResult withTriggers(RepositoryTrigger... triggers) {
        if (this.triggers == null) {
            setTriggers(new java.util.ArrayList<RepositoryTrigger>(triggers.length));
        }
        for (RepositoryTrigger ele : triggers) {
            this.triggers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The JSON block of configuration information for each trigger.
     * </p>
     * 
     * @param triggers
     *        The JSON block of configuration information for each trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryTriggersResult withTriggers(java.util.Collection<RepositoryTrigger> triggers) {
        setTriggers(triggers);
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
        if (getTriggers() != null)
            sb.append("Triggers: ").append(getTriggers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositoryTriggersResult == false)
            return false;
        GetRepositoryTriggersResult other = (GetRepositoryTriggersResult) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositoryTriggersResult clone() {
        try {
            return (GetRepositoryTriggersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
