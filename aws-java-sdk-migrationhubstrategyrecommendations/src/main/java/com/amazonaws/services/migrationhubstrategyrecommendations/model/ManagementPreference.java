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
 * Preferences for migrating an application to AWS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ManagementPreference"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagementPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates interest in solutions that are managed by AWS.
     * </p>
     */
    private AwsManagedResources awsManagedResources;
    /**
     * <p>
     * No specific preference.
     * </p>
     */
    private NoManagementPreference noPreference;
    /**
     * <p>
     * Indicates interest in managing your own resources on AWS.
     * </p>
     */
    private SelfManageResources selfManageResources;

    /**
     * <p>
     * Indicates interest in solutions that are managed by AWS.
     * </p>
     * 
     * @param awsManagedResources
     *        Indicates interest in solutions that are managed by AWS.
     */

    public void setAwsManagedResources(AwsManagedResources awsManagedResources) {
        this.awsManagedResources = awsManagedResources;
    }

    /**
     * <p>
     * Indicates interest in solutions that are managed by AWS.
     * </p>
     * 
     * @return Indicates interest in solutions that are managed by AWS.
     */

    public AwsManagedResources getAwsManagedResources() {
        return this.awsManagedResources;
    }

    /**
     * <p>
     * Indicates interest in solutions that are managed by AWS.
     * </p>
     * 
     * @param awsManagedResources
     *        Indicates interest in solutions that are managed by AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagementPreference withAwsManagedResources(AwsManagedResources awsManagedResources) {
        setAwsManagedResources(awsManagedResources);
        return this;
    }

    /**
     * <p>
     * No specific preference.
     * </p>
     * 
     * @param noPreference
     *        No specific preference.
     */

    public void setNoPreference(NoManagementPreference noPreference) {
        this.noPreference = noPreference;
    }

    /**
     * <p>
     * No specific preference.
     * </p>
     * 
     * @return No specific preference.
     */

    public NoManagementPreference getNoPreference() {
        return this.noPreference;
    }

    /**
     * <p>
     * No specific preference.
     * </p>
     * 
     * @param noPreference
     *        No specific preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagementPreference withNoPreference(NoManagementPreference noPreference) {
        setNoPreference(noPreference);
        return this;
    }

    /**
     * <p>
     * Indicates interest in managing your own resources on AWS.
     * </p>
     * 
     * @param selfManageResources
     *        Indicates interest in managing your own resources on AWS.
     */

    public void setSelfManageResources(SelfManageResources selfManageResources) {
        this.selfManageResources = selfManageResources;
    }

    /**
     * <p>
     * Indicates interest in managing your own resources on AWS.
     * </p>
     * 
     * @return Indicates interest in managing your own resources on AWS.
     */

    public SelfManageResources getSelfManageResources() {
        return this.selfManageResources;
    }

    /**
     * <p>
     * Indicates interest in managing your own resources on AWS.
     * </p>
     * 
     * @param selfManageResources
     *        Indicates interest in managing your own resources on AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ManagementPreference withSelfManageResources(SelfManageResources selfManageResources) {
        setSelfManageResources(selfManageResources);
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
        if (getAwsManagedResources() != null)
            sb.append("AwsManagedResources: ").append(getAwsManagedResources()).append(",");
        if (getNoPreference() != null)
            sb.append("NoPreference: ").append(getNoPreference()).append(",");
        if (getSelfManageResources() != null)
            sb.append("SelfManageResources: ").append(getSelfManageResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagementPreference == false)
            return false;
        ManagementPreference other = (ManagementPreference) obj;
        if (other.getAwsManagedResources() == null ^ this.getAwsManagedResources() == null)
            return false;
        if (other.getAwsManagedResources() != null && other.getAwsManagedResources().equals(this.getAwsManagedResources()) == false)
            return false;
        if (other.getNoPreference() == null ^ this.getNoPreference() == null)
            return false;
        if (other.getNoPreference() != null && other.getNoPreference().equals(this.getNoPreference()) == false)
            return false;
        if (other.getSelfManageResources() == null ^ this.getSelfManageResources() == null)
            return false;
        if (other.getSelfManageResources() != null && other.getSelfManageResources().equals(this.getSelfManageResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsManagedResources() == null) ? 0 : getAwsManagedResources().hashCode());
        hashCode = prime * hashCode + ((getNoPreference() == null) ? 0 : getNoPreference().hashCode());
        hashCode = prime * hashCode + ((getSelfManageResources() == null) ? 0 : getSelfManageResources().hashCode());
        return hashCode;
    }

    @Override
    public ManagementPreference clone() {
        try {
            return (ManagementPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubstrategyrecommendations.model.transform.ManagementPreferenceMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
