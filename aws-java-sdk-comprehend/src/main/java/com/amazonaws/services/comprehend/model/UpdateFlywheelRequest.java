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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/UpdateFlywheel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlywheelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
     * </p>
     */
    private String flywheelArn;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     */
    private String activeModelArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     */
    private UpdateDataSecurityConfig dataSecurityConfig;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel to update.
     */

    public void setFlywheelArn(String flywheelArn) {
        this.flywheelArn = flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the flywheel to update.
     */

    public String getFlywheelArn() {
        return this.flywheelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the flywheel to update.
     * </p>
     * 
     * @param flywheelArn
     *        The Amazon Resource Number (ARN) of the flywheel to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlywheelRequest withFlywheelArn(String flywheelArn) {
        setFlywheelArn(flywheelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @param activeModelArn
     *        The Amazon Resource Number (ARN) of the active model version.
     */

    public void setActiveModelArn(String activeModelArn) {
        this.activeModelArn = activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the active model version.
     */

    public String getActiveModelArn() {
        return this.activeModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the active model version.
     * </p>
     * 
     * @param activeModelArn
     *        The Amazon Resource Number (ARN) of the active model version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlywheelRequest withActiveModelArn(String activeModelArn) {
        setActiveModelArn(activeModelArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the
     *        flywheel data.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the
     *         flywheel data.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel
     * data.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the
     *        flywheel data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlywheelRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     * 
     * @param dataSecurityConfig
     *        Flywheel data security configuration.
     */

    public void setDataSecurityConfig(UpdateDataSecurityConfig dataSecurityConfig) {
        this.dataSecurityConfig = dataSecurityConfig;
    }

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     * 
     * @return Flywheel data security configuration.
     */

    public UpdateDataSecurityConfig getDataSecurityConfig() {
        return this.dataSecurityConfig;
    }

    /**
     * <p>
     * Flywheel data security configuration.
     * </p>
     * 
     * @param dataSecurityConfig
     *        Flywheel data security configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlywheelRequest withDataSecurityConfig(UpdateDataSecurityConfig dataSecurityConfig) {
        setDataSecurityConfig(dataSecurityConfig);
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
        if (getFlywheelArn() != null)
            sb.append("FlywheelArn: ").append(getFlywheelArn()).append(",");
        if (getActiveModelArn() != null)
            sb.append("ActiveModelArn: ").append(getActiveModelArn()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getDataSecurityConfig() != null)
            sb.append("DataSecurityConfig: ").append(getDataSecurityConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlywheelRequest == false)
            return false;
        UpdateFlywheelRequest other = (UpdateFlywheelRequest) obj;
        if (other.getFlywheelArn() == null ^ this.getFlywheelArn() == null)
            return false;
        if (other.getFlywheelArn() != null && other.getFlywheelArn().equals(this.getFlywheelArn()) == false)
            return false;
        if (other.getActiveModelArn() == null ^ this.getActiveModelArn() == null)
            return false;
        if (other.getActiveModelArn() != null && other.getActiveModelArn().equals(this.getActiveModelArn()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getDataSecurityConfig() == null ^ this.getDataSecurityConfig() == null)
            return false;
        if (other.getDataSecurityConfig() != null && other.getDataSecurityConfig().equals(this.getDataSecurityConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlywheelArn() == null) ? 0 : getFlywheelArn().hashCode());
        hashCode = prime * hashCode + ((getActiveModelArn() == null) ? 0 : getActiveModelArn().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDataSecurityConfig() == null) ? 0 : getDataSecurityConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlywheelRequest clone() {
        return (UpdateFlywheelRequest) super.clone();
    }

}
