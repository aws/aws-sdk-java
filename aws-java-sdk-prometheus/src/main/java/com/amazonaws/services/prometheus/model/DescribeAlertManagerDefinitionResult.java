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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a DescribeAlertManagerDefinition operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeAlertManagerDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlertManagerDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The properties of the selected workspace's alert manager definition.
     * </p>
     */
    private AlertManagerDefinitionDescription alertManagerDefinition;

    /**
     * <p>
     * The properties of the selected workspace's alert manager definition.
     * </p>
     * 
     * @param alertManagerDefinition
     *        The properties of the selected workspace's alert manager definition.
     */

    public void setAlertManagerDefinition(AlertManagerDefinitionDescription alertManagerDefinition) {
        this.alertManagerDefinition = alertManagerDefinition;
    }

    /**
     * <p>
     * The properties of the selected workspace's alert manager definition.
     * </p>
     * 
     * @return The properties of the selected workspace's alert manager definition.
     */

    public AlertManagerDefinitionDescription getAlertManagerDefinition() {
        return this.alertManagerDefinition;
    }

    /**
     * <p>
     * The properties of the selected workspace's alert manager definition.
     * </p>
     * 
     * @param alertManagerDefinition
     *        The properties of the selected workspace's alert manager definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlertManagerDefinitionResult withAlertManagerDefinition(AlertManagerDefinitionDescription alertManagerDefinition) {
        setAlertManagerDefinition(alertManagerDefinition);
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
        if (getAlertManagerDefinition() != null)
            sb.append("AlertManagerDefinition: ").append(getAlertManagerDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlertManagerDefinitionResult == false)
            return false;
        DescribeAlertManagerDefinitionResult other = (DescribeAlertManagerDefinitionResult) obj;
        if (other.getAlertManagerDefinition() == null ^ this.getAlertManagerDefinition() == null)
            return false;
        if (other.getAlertManagerDefinition() != null && other.getAlertManagerDefinition().equals(this.getAlertManagerDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlertManagerDefinition() == null) ? 0 : getAlertManagerDefinition().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlertManagerDefinitionResult clone() {
        try {
            return (DescribeAlertManagerDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
