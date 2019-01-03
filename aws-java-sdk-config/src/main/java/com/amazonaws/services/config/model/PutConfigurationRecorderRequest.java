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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>PutConfigurationRecorder</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/PutConfigurationRecorder" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationRecorderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration recorder object that records each configuration change made to the resources.
     * </p>
     */
    private ConfigurationRecorder configurationRecorder;

    /**
     * <p>
     * The configuration recorder object that records each configuration change made to the resources.
     * </p>
     * 
     * @param configurationRecorder
     *        The configuration recorder object that records each configuration change made to the resources.
     */

    public void setConfigurationRecorder(ConfigurationRecorder configurationRecorder) {
        this.configurationRecorder = configurationRecorder;
    }

    /**
     * <p>
     * The configuration recorder object that records each configuration change made to the resources.
     * </p>
     * 
     * @return The configuration recorder object that records each configuration change made to the resources.
     */

    public ConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    /**
     * <p>
     * The configuration recorder object that records each configuration change made to the resources.
     * </p>
     * 
     * @param configurationRecorder
     *        The configuration recorder object that records each configuration change made to the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationRecorderRequest withConfigurationRecorder(ConfigurationRecorder configurationRecorder) {
        setConfigurationRecorder(configurationRecorder);
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
        if (getConfigurationRecorder() != null)
            sb.append("ConfigurationRecorder: ").append(getConfigurationRecorder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationRecorderRequest == false)
            return false;
        PutConfigurationRecorderRequest other = (PutConfigurationRecorderRequest) obj;
        if (other.getConfigurationRecorder() == null ^ this.getConfigurationRecorder() == null)
            return false;
        if (other.getConfigurationRecorder() != null && other.getConfigurationRecorder().equals(this.getConfigurationRecorder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationRecorder() == null) ? 0 : getConfigurationRecorder().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationRecorderRequest clone() {
        return (PutConfigurationRecorderRequest) super.clone();
    }

}
