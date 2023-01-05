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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The maintenance options of your instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateInstanceMaintenanceOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateInstanceMaintenanceOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     */
    private String autoRecovery;

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @param autoRecovery
     *        Disables the automatic recovery behavior of your instance or sets it to default.
     * @see LaunchTemplateAutoRecoveryState
     */

    public void setAutoRecovery(String autoRecovery) {
        this.autoRecovery = autoRecovery;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @return Disables the automatic recovery behavior of your instance or sets it to default.
     * @see LaunchTemplateAutoRecoveryState
     */

    public String getAutoRecovery() {
        return this.autoRecovery;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @param autoRecovery
     *        Disables the automatic recovery behavior of your instance or sets it to default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateAutoRecoveryState
     */

    public LaunchTemplateInstanceMaintenanceOptions withAutoRecovery(String autoRecovery) {
        setAutoRecovery(autoRecovery);
        return this;
    }

    /**
     * <p>
     * Disables the automatic recovery behavior of your instance or sets it to default.
     * </p>
     * 
     * @param autoRecovery
     *        Disables the automatic recovery behavior of your instance or sets it to default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchTemplateAutoRecoveryState
     */

    public LaunchTemplateInstanceMaintenanceOptions withAutoRecovery(LaunchTemplateAutoRecoveryState autoRecovery) {
        this.autoRecovery = autoRecovery.toString();
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
        if (getAutoRecovery() != null)
            sb.append("AutoRecovery: ").append(getAutoRecovery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateInstanceMaintenanceOptions == false)
            return false;
        LaunchTemplateInstanceMaintenanceOptions other = (LaunchTemplateInstanceMaintenanceOptions) obj;
        if (other.getAutoRecovery() == null ^ this.getAutoRecovery() == null)
            return false;
        if (other.getAutoRecovery() != null && other.getAutoRecovery().equals(this.getAutoRecovery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoRecovery() == null) ? 0 : getAutoRecovery().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateInstanceMaintenanceOptions clone() {
        try {
            return (LaunchTemplateInstanceMaintenanceOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
