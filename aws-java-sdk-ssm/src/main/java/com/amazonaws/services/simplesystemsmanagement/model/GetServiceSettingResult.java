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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The query result body of the GetServiceSetting API action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetServiceSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceSettingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The query result of the current service setting.
     * </p>
     */
    private ServiceSetting serviceSetting;

    /**
     * <p>
     * The query result of the current service setting.
     * </p>
     * 
     * @param serviceSetting
     *        The query result of the current service setting.
     */

    public void setServiceSetting(ServiceSetting serviceSetting) {
        this.serviceSetting = serviceSetting;
    }

    /**
     * <p>
     * The query result of the current service setting.
     * </p>
     * 
     * @return The query result of the current service setting.
     */

    public ServiceSetting getServiceSetting() {
        return this.serviceSetting;
    }

    /**
     * <p>
     * The query result of the current service setting.
     * </p>
     * 
     * @param serviceSetting
     *        The query result of the current service setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingResult withServiceSetting(ServiceSetting serviceSetting) {
        setServiceSetting(serviceSetting);
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
        if (getServiceSetting() != null)
            sb.append("ServiceSetting: ").append(getServiceSetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceSettingResult == false)
            return false;
        GetServiceSettingResult other = (GetServiceSettingResult) obj;
        if (other.getServiceSetting() == null ^ this.getServiceSetting() == null)
            return false;
        if (other.getServiceSetting() != null && other.getServiceSetting().equals(this.getServiceSetting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceSetting() == null) ? 0 : getServiceSetting().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceSettingResult clone() {
        try {
            return (GetServiceSettingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
