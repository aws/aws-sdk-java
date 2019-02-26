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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeAutoScalingNotificationTypes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAutoScalingNotificationTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The notification types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> autoScalingNotificationTypes;

    /**
     * <p>
     * The notification types.
     * </p>
     * 
     * @return The notification types.
     */

    public java.util.List<String> getAutoScalingNotificationTypes() {
        if (autoScalingNotificationTypes == null) {
            autoScalingNotificationTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return autoScalingNotificationTypes;
    }

    /**
     * <p>
     * The notification types.
     * </p>
     * 
     * @param autoScalingNotificationTypes
     *        The notification types.
     */

    public void setAutoScalingNotificationTypes(java.util.Collection<String> autoScalingNotificationTypes) {
        if (autoScalingNotificationTypes == null) {
            this.autoScalingNotificationTypes = null;
            return;
        }

        this.autoScalingNotificationTypes = new com.amazonaws.internal.SdkInternalList<String>(autoScalingNotificationTypes);
    }

    /**
     * <p>
     * The notification types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingNotificationTypes(java.util.Collection)} or
     * {@link #withAutoScalingNotificationTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param autoScalingNotificationTypes
     *        The notification types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(String... autoScalingNotificationTypes) {
        if (this.autoScalingNotificationTypes == null) {
            setAutoScalingNotificationTypes(new com.amazonaws.internal.SdkInternalList<String>(autoScalingNotificationTypes.length));
        }
        for (String ele : autoScalingNotificationTypes) {
            this.autoScalingNotificationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The notification types.
     * </p>
     * 
     * @param autoScalingNotificationTypes
     *        The notification types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAutoScalingNotificationTypesResult withAutoScalingNotificationTypes(java.util.Collection<String> autoScalingNotificationTypes) {
        setAutoScalingNotificationTypes(autoScalingNotificationTypes);
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
        if (getAutoScalingNotificationTypes() != null)
            sb.append("AutoScalingNotificationTypes: ").append(getAutoScalingNotificationTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAutoScalingNotificationTypesResult == false)
            return false;
        DescribeAutoScalingNotificationTypesResult other = (DescribeAutoScalingNotificationTypesResult) obj;
        if (other.getAutoScalingNotificationTypes() == null ^ this.getAutoScalingNotificationTypes() == null)
            return false;
        if (other.getAutoScalingNotificationTypes() != null && other.getAutoScalingNotificationTypes().equals(this.getAutoScalingNotificationTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingNotificationTypes() == null) ? 0 : getAutoScalingNotificationTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoScalingNotificationTypesResult clone() {
        try {
            return (DescribeAutoScalingNotificationTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
