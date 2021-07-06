/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In addition to your infrastruction configuration, these settings provide an extra layer of control over your build
 * instances. For instances where Image Builder installs the SSM agent, you can choose whether to keep it for the AMI
 * that you create. You can also specify commands to run on launch for all of your build instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/AdditionalInstanceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdditionalInstanceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains settings for the SSM agent on your build instance.
     * </p>
     */
    private SystemsManagerAgent systemsManagerAgent;
    /**
     * <p>
     * Use this property to provide commands or a command script to run when you launch your build instance.
     * </p>
     * <note>
     * <p>
     * The userDataOverride property replaces any commands that Image Builder might have added to ensure that SSM is
     * installed on your Linux build instance. If you override the user data, make sure that you add commands to install
     * SSM, if it is not pre-installed on your source image.
     * </p>
     * </note>
     */
    private String userDataOverride;

    /**
     * <p>
     * Contains settings for the SSM agent on your build instance.
     * </p>
     * 
     * @param systemsManagerAgent
     *        Contains settings for the SSM agent on your build instance.
     */

    public void setSystemsManagerAgent(SystemsManagerAgent systemsManagerAgent) {
        this.systemsManagerAgent = systemsManagerAgent;
    }

    /**
     * <p>
     * Contains settings for the SSM agent on your build instance.
     * </p>
     * 
     * @return Contains settings for the SSM agent on your build instance.
     */

    public SystemsManagerAgent getSystemsManagerAgent() {
        return this.systemsManagerAgent;
    }

    /**
     * <p>
     * Contains settings for the SSM agent on your build instance.
     * </p>
     * 
     * @param systemsManagerAgent
     *        Contains settings for the SSM agent on your build instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalInstanceConfiguration withSystemsManagerAgent(SystemsManagerAgent systemsManagerAgent) {
        setSystemsManagerAgent(systemsManagerAgent);
        return this;
    }

    /**
     * <p>
     * Use this property to provide commands or a command script to run when you launch your build instance.
     * </p>
     * <note>
     * <p>
     * The userDataOverride property replaces any commands that Image Builder might have added to ensure that SSM is
     * installed on your Linux build instance. If you override the user data, make sure that you add commands to install
     * SSM, if it is not pre-installed on your source image.
     * </p>
     * </note>
     * 
     * @param userDataOverride
     *        Use this property to provide commands or a command script to run when you launch your build instance.</p>
     *        <note>
     *        <p>
     *        The userDataOverride property replaces any commands that Image Builder might have added to ensure that SSM
     *        is installed on your Linux build instance. If you override the user data, make sure that you add commands
     *        to install SSM, if it is not pre-installed on your source image.
     *        </p>
     */

    public void setUserDataOverride(String userDataOverride) {
        this.userDataOverride = userDataOverride;
    }

    /**
     * <p>
     * Use this property to provide commands or a command script to run when you launch your build instance.
     * </p>
     * <note>
     * <p>
     * The userDataOverride property replaces any commands that Image Builder might have added to ensure that SSM is
     * installed on your Linux build instance. If you override the user data, make sure that you add commands to install
     * SSM, if it is not pre-installed on your source image.
     * </p>
     * </note>
     * 
     * @return Use this property to provide commands or a command script to run when you launch your build instance.</p>
     *         <note>
     *         <p>
     *         The userDataOverride property replaces any commands that Image Builder might have added to ensure that
     *         SSM is installed on your Linux build instance. If you override the user data, make sure that you add
     *         commands to install SSM, if it is not pre-installed on your source image.
     *         </p>
     */

    public String getUserDataOverride() {
        return this.userDataOverride;
    }

    /**
     * <p>
     * Use this property to provide commands or a command script to run when you launch your build instance.
     * </p>
     * <note>
     * <p>
     * The userDataOverride property replaces any commands that Image Builder might have added to ensure that SSM is
     * installed on your Linux build instance. If you override the user data, make sure that you add commands to install
     * SSM, if it is not pre-installed on your source image.
     * </p>
     * </note>
     * 
     * @param userDataOverride
     *        Use this property to provide commands or a command script to run when you launch your build instance.</p>
     *        <note>
     *        <p>
     *        The userDataOverride property replaces any commands that Image Builder might have added to ensure that SSM
     *        is installed on your Linux build instance. If you override the user data, make sure that you add commands
     *        to install SSM, if it is not pre-installed on your source image.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdditionalInstanceConfiguration withUserDataOverride(String userDataOverride) {
        setUserDataOverride(userDataOverride);
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
        if (getSystemsManagerAgent() != null)
            sb.append("SystemsManagerAgent: ").append(getSystemsManagerAgent()).append(",");
        if (getUserDataOverride() != null)
            sb.append("UserDataOverride: ").append(getUserDataOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdditionalInstanceConfiguration == false)
            return false;
        AdditionalInstanceConfiguration other = (AdditionalInstanceConfiguration) obj;
        if (other.getSystemsManagerAgent() == null ^ this.getSystemsManagerAgent() == null)
            return false;
        if (other.getSystemsManagerAgent() != null && other.getSystemsManagerAgent().equals(this.getSystemsManagerAgent()) == false)
            return false;
        if (other.getUserDataOverride() == null ^ this.getUserDataOverride() == null)
            return false;
        if (other.getUserDataOverride() != null && other.getUserDataOverride().equals(this.getUserDataOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSystemsManagerAgent() == null) ? 0 : getSystemsManagerAgent().hashCode());
        hashCode = prime * hashCode + ((getUserDataOverride() == null) ? 0 : getUserDataOverride().hashCode());
        return hashCode;
    }

    @Override
    public AdditionalInstanceConfiguration clone() {
        try {
            return (AdditionalInstanceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.AdditionalInstanceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
