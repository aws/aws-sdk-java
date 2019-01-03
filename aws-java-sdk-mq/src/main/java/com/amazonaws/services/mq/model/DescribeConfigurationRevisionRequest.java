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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/DescribeConfigurationRevision" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID that Amazon MQ generates for the configuration. */
    private String configurationId;
    /** The revision of the configuration. */
    private String configurationRevision;

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

    public DescribeConfigurationRevisionRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * The revision of the configuration.
     * 
     * @param configurationRevision
     *        The revision of the configuration.
     */

    public void setConfigurationRevision(String configurationRevision) {
        this.configurationRevision = configurationRevision;
    }

    /**
     * The revision of the configuration.
     * 
     * @return The revision of the configuration.
     */

    public String getConfigurationRevision() {
        return this.configurationRevision;
    }

    /**
     * The revision of the configuration.
     * 
     * @param configurationRevision
     *        The revision of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConfigurationRevisionRequest withConfigurationRevision(String configurationRevision) {
        setConfigurationRevision(configurationRevision);
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
        if (getConfigurationRevision() != null)
            sb.append("ConfigurationRevision: ").append(getConfigurationRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConfigurationRevisionRequest == false)
            return false;
        DescribeConfigurationRevisionRequest other = (DescribeConfigurationRevisionRequest) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        if (other.getConfigurationRevision() == null ^ this.getConfigurationRevision() == null)
            return false;
        if (other.getConfigurationRevision() != null && other.getConfigurationRevision().equals(this.getConfigurationRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getConfigurationRevision() == null) ? 0 : getConfigurationRevision().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConfigurationRevisionRequest clone() {
        return (DescribeConfigurationRevisionRequest) super.clone();
    }

}
