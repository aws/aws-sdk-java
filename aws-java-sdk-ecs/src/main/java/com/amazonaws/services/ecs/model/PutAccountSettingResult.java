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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAccountSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountSettingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current account setting for a resource.
     * </p>
     */
    private Setting setting;

    /**
     * <p>
     * The current account setting for a resource.
     * </p>
     * 
     * @param setting
     *        The current account setting for a resource.
     */

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    /**
     * <p>
     * The current account setting for a resource.
     * </p>
     * 
     * @return The current account setting for a resource.
     */

    public Setting getSetting() {
        return this.setting;
    }

    /**
     * <p>
     * The current account setting for a resource.
     * </p>
     * 
     * @param setting
     *        The current account setting for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountSettingResult withSetting(Setting setting) {
        setSetting(setting);
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
        if (getSetting() != null)
            sb.append("Setting: ").append(getSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountSettingResult == false)
            return false;
        PutAccountSettingResult other = (PutAccountSettingResult) obj;
        if (other.getSetting() == null ^ this.getSetting() == null)
            return false;
        if (other.getSetting() != null && other.getSetting().equals(this.getSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSetting() == null) ? 0 : getSetting().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountSettingResult clone() {
        try {
            return (PutAccountSettingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
