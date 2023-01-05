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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Application preferences that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ApplicationPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationPreferences implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Application preferences that you specify to prefer managed environment.
     * </p>
     */
    private ManagementPreference managementPreference;

    /**
     * <p>
     * Application preferences that you specify to prefer managed environment.
     * </p>
     * 
     * @param managementPreference
     *        Application preferences that you specify to prefer managed environment.
     */

    public void setManagementPreference(ManagementPreference managementPreference) {
        this.managementPreference = managementPreference;
    }

    /**
     * <p>
     * Application preferences that you specify to prefer managed environment.
     * </p>
     * 
     * @return Application preferences that you specify to prefer managed environment.
     */

    public ManagementPreference getManagementPreference() {
        return this.managementPreference;
    }

    /**
     * <p>
     * Application preferences that you specify to prefer managed environment.
     * </p>
     * 
     * @param managementPreference
     *        Application preferences that you specify to prefer managed environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationPreferences withManagementPreference(ManagementPreference managementPreference) {
        setManagementPreference(managementPreference);
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
        if (getManagementPreference() != null)
            sb.append("ManagementPreference: ").append(getManagementPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationPreferences == false)
            return false;
        ApplicationPreferences other = (ApplicationPreferences) obj;
        if (other.getManagementPreference() == null ^ this.getManagementPreference() == null)
            return false;
        if (other.getManagementPreference() != null && other.getManagementPreference().equals(this.getManagementPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagementPreference() == null) ? 0 : getManagementPreference().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationPreferences clone() {
        try {
            return (ApplicationPreferences) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ApplicationPreferencesMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
