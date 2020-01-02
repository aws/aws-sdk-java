/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the placement group support of the instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PlacementGroupInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlacementGroupInfo implements Serializable, Cloneable {

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedStrategies;

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * 
     * @return A list of supported placement groups types.
     * @see PlacementGroupStrategy
     */

    public java.util.List<String> getSupportedStrategies() {
        if (supportedStrategies == null) {
            supportedStrategies = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedStrategies;
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * 
     * @param supportedStrategies
     *        A list of supported placement groups types.
     * @see PlacementGroupStrategy
     */

    public void setSupportedStrategies(java.util.Collection<String> supportedStrategies) {
        if (supportedStrategies == null) {
            this.supportedStrategies = null;
            return;
        }

        this.supportedStrategies = new com.amazonaws.internal.SdkInternalList<String>(supportedStrategies);
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedStrategies(java.util.Collection)} or {@link #withSupportedStrategies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedStrategies
     *        A list of supported placement groups types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupStrategy
     */

    public PlacementGroupInfo withSupportedStrategies(String... supportedStrategies) {
        if (this.supportedStrategies == null) {
            setSupportedStrategies(new com.amazonaws.internal.SdkInternalList<String>(supportedStrategies.length));
        }
        for (String ele : supportedStrategies) {
            this.supportedStrategies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * 
     * @param supportedStrategies
     *        A list of supported placement groups types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupStrategy
     */

    public PlacementGroupInfo withSupportedStrategies(java.util.Collection<String> supportedStrategies) {
        setSupportedStrategies(supportedStrategies);
        return this;
    }

    /**
     * <p>
     * A list of supported placement groups types.
     * </p>
     * 
     * @param supportedStrategies
     *        A list of supported placement groups types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlacementGroupStrategy
     */

    public PlacementGroupInfo withSupportedStrategies(PlacementGroupStrategy... supportedStrategies) {
        com.amazonaws.internal.SdkInternalList<String> supportedStrategiesCopy = new com.amazonaws.internal.SdkInternalList<String>(supportedStrategies.length);
        for (PlacementGroupStrategy value : supportedStrategies) {
            supportedStrategiesCopy.add(value.toString());
        }
        if (getSupportedStrategies() == null) {
            setSupportedStrategies(supportedStrategiesCopy);
        } else {
            getSupportedStrategies().addAll(supportedStrategiesCopy);
        }
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
        if (getSupportedStrategies() != null)
            sb.append("SupportedStrategies: ").append(getSupportedStrategies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlacementGroupInfo == false)
            return false;
        PlacementGroupInfo other = (PlacementGroupInfo) obj;
        if (other.getSupportedStrategies() == null ^ this.getSupportedStrategies() == null)
            return false;
        if (other.getSupportedStrategies() != null && other.getSupportedStrategies().equals(this.getSupportedStrategies()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportedStrategies() == null) ? 0 : getSupportedStrategies().hashCode());
        return hashCode;
    }

    @Override
    public PlacementGroupInfo clone() {
        try {
            return (PlacementGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
