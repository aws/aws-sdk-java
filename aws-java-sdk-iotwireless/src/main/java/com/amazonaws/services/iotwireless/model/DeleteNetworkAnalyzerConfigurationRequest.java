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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/DeleteNetworkAnalyzerConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteNetworkAnalyzerConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String configurationName;

    /**
     * @param configurationName
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * @return
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * @param configurationName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteNetworkAnalyzerConfigurationRequest withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
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
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: ").append(getConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteNetworkAnalyzerConfigurationRequest == false)
            return false;
        DeleteNetworkAnalyzerConfigurationRequest other = (DeleteNetworkAnalyzerConfigurationRequest) obj;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteNetworkAnalyzerConfigurationRequest clone() {
        return (DeleteNetworkAnalyzerConfigurationRequest) super.clone();
    }

}
