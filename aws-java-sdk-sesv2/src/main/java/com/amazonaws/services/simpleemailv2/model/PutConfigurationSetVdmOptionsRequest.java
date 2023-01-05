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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to add specific VDM settings to a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/PutConfigurationSetVdmOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutConfigurationSetVdmOptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The VDM options to apply to the configuration set.
     * </p>
     */
    private VdmOptions vdmOptions;

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @return The name of the configuration set.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetVdmOptionsRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The VDM options to apply to the configuration set.
     * </p>
     * 
     * @param vdmOptions
     *        The VDM options to apply to the configuration set.
     */

    public void setVdmOptions(VdmOptions vdmOptions) {
        this.vdmOptions = vdmOptions;
    }

    /**
     * <p>
     * The VDM options to apply to the configuration set.
     * </p>
     * 
     * @return The VDM options to apply to the configuration set.
     */

    public VdmOptions getVdmOptions() {
        return this.vdmOptions;
    }

    /**
     * <p>
     * The VDM options to apply to the configuration set.
     * </p>
     * 
     * @param vdmOptions
     *        The VDM options to apply to the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutConfigurationSetVdmOptionsRequest withVdmOptions(VdmOptions vdmOptions) {
        setVdmOptions(vdmOptions);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getVdmOptions() != null)
            sb.append("VdmOptions: ").append(getVdmOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutConfigurationSetVdmOptionsRequest == false)
            return false;
        PutConfigurationSetVdmOptionsRequest other = (PutConfigurationSetVdmOptionsRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getVdmOptions() == null ^ this.getVdmOptions() == null)
            return false;
        if (other.getVdmOptions() != null && other.getVdmOptions().equals(this.getVdmOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getVdmOptions() == null) ? 0 : getVdmOptions().hashCode());
        return hashCode;
    }

    @Override
    public PutConfigurationSetVdmOptionsRequest clone() {
        return (PutConfigurationSetVdmOptionsRequest) super.clone();
    }

}
