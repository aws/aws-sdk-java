/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DisassociateProtectConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateProtectConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration set.
     * </p>
     */
    private String configurationSetArn;
    /**
     * <p>
     * The name of the ConfigurationSet.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     */
    private String protectConfigurationArn;
    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     */
    private String protectConfigurationId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration set.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) of the configuration set.
     */

    public void setConfigurationSetArn(String configurationSetArn) {
        this.configurationSetArn = configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the configuration set.
     */

    public String getConfigurationSetArn() {
        return this.configurationSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the configuration set.
     * </p>
     * 
     * @param configurationSetArn
     *        The Amazon Resource Name (ARN) of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProtectConfigurationResult withConfigurationSetArn(String configurationSetArn) {
        setConfigurationSetArn(configurationSetArn);
        return this;
    }

    /**
     * <p>
     * The name of the ConfigurationSet.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the ConfigurationSet.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the ConfigurationSet.
     * </p>
     * 
     * @return The name of the ConfigurationSet.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the ConfigurationSet.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the ConfigurationSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProtectConfigurationResult withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @param protectConfigurationArn
     *        The Amazon Resource Name (ARN) of the protect configuration.
     */

    public void setProtectConfigurationArn(String protectConfigurationArn) {
        this.protectConfigurationArn = protectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the protect configuration.
     */

    public String getProtectConfigurationArn() {
        return this.protectConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the protect configuration.
     * </p>
     * 
     * @param protectConfigurationArn
     *        The Amazon Resource Name (ARN) of the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProtectConfigurationResult withProtectConfigurationArn(String protectConfigurationArn) {
        setProtectConfigurationArn(protectConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     */

    public void setProtectConfigurationId(String protectConfigurationId) {
        this.protectConfigurationId = protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @return The unique identifier for the protect configuration.
     */

    public String getProtectConfigurationId() {
        return this.protectConfigurationId;
    }

    /**
     * <p>
     * The unique identifier for the protect configuration.
     * </p>
     * 
     * @param protectConfigurationId
     *        The unique identifier for the protect configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateProtectConfigurationResult withProtectConfigurationId(String protectConfigurationId) {
        setProtectConfigurationId(protectConfigurationId);
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
        if (getConfigurationSetArn() != null)
            sb.append("ConfigurationSetArn: ").append(getConfigurationSetArn()).append(",");
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getProtectConfigurationArn() != null)
            sb.append("ProtectConfigurationArn: ").append(getProtectConfigurationArn()).append(",");
        if (getProtectConfigurationId() != null)
            sb.append("ProtectConfigurationId: ").append(getProtectConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateProtectConfigurationResult == false)
            return false;
        DisassociateProtectConfigurationResult other = (DisassociateProtectConfigurationResult) obj;
        if (other.getConfigurationSetArn() == null ^ this.getConfigurationSetArn() == null)
            return false;
        if (other.getConfigurationSetArn() != null && other.getConfigurationSetArn().equals(this.getConfigurationSetArn()) == false)
            return false;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getProtectConfigurationArn() == null ^ this.getProtectConfigurationArn() == null)
            return false;
        if (other.getProtectConfigurationArn() != null && other.getProtectConfigurationArn().equals(this.getProtectConfigurationArn()) == false)
            return false;
        if (other.getProtectConfigurationId() == null ^ this.getProtectConfigurationId() == null)
            return false;
        if (other.getProtectConfigurationId() != null && other.getProtectConfigurationId().equals(this.getProtectConfigurationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetArn() == null) ? 0 : getConfigurationSetArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationArn() == null) ? 0 : getProtectConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getProtectConfigurationId() == null) ? 0 : getProtectConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateProtectConfigurationResult clone() {
        try {
            return (DisassociateProtectConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
