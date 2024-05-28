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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The feature configurations of an embedded Amazon QuickSight console.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RegisteredUserConsoleFeatureConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserConsoleFeatureConfigurations implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state persistence configurations of an embedded Amazon QuickSight console.
     * </p>
     */
    private StatePersistenceConfigurations statePersistence;

    /**
     * <p>
     * The state persistence configurations of an embedded Amazon QuickSight console.
     * </p>
     * 
     * @param statePersistence
     *        The state persistence configurations of an embedded Amazon QuickSight console.
     */

    public void setStatePersistence(StatePersistenceConfigurations statePersistence) {
        this.statePersistence = statePersistence;
    }

    /**
     * <p>
     * The state persistence configurations of an embedded Amazon QuickSight console.
     * </p>
     * 
     * @return The state persistence configurations of an embedded Amazon QuickSight console.
     */

    public StatePersistenceConfigurations getStatePersistence() {
        return this.statePersistence;
    }

    /**
     * <p>
     * The state persistence configurations of an embedded Amazon QuickSight console.
     * </p>
     * 
     * @param statePersistence
     *        The state persistence configurations of an embedded Amazon QuickSight console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisteredUserConsoleFeatureConfigurations withStatePersistence(StatePersistenceConfigurations statePersistence) {
        setStatePersistence(statePersistence);
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
        if (getStatePersistence() != null)
            sb.append("StatePersistence: ").append(getStatePersistence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisteredUserConsoleFeatureConfigurations == false)
            return false;
        RegisteredUserConsoleFeatureConfigurations other = (RegisteredUserConsoleFeatureConfigurations) obj;
        if (other.getStatePersistence() == null ^ this.getStatePersistence() == null)
            return false;
        if (other.getStatePersistence() != null && other.getStatePersistence().equals(this.getStatePersistence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatePersistence() == null) ? 0 : getStatePersistence().hashCode());
        return hashCode;
    }

    @Override
    public RegisteredUserConsoleFeatureConfigurations clone() {
        try {
            return (RegisteredUserConsoleFeatureConfigurations) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RegisteredUserConsoleFeatureConfigurationsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
