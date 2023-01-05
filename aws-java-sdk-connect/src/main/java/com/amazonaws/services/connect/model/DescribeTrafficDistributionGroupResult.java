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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DescribeTrafficDistributionGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrafficDistributionGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the traffic distribution group.
     * </p>
     */
    private TrafficDistributionGroup trafficDistributionGroup;

    /**
     * <p>
     * Information about the traffic distribution group.
     * </p>
     * 
     * @param trafficDistributionGroup
     *        Information about the traffic distribution group.
     */

    public void setTrafficDistributionGroup(TrafficDistributionGroup trafficDistributionGroup) {
        this.trafficDistributionGroup = trafficDistributionGroup;
    }

    /**
     * <p>
     * Information about the traffic distribution group.
     * </p>
     * 
     * @return Information about the traffic distribution group.
     */

    public TrafficDistributionGroup getTrafficDistributionGroup() {
        return this.trafficDistributionGroup;
    }

    /**
     * <p>
     * Information about the traffic distribution group.
     * </p>
     * 
     * @param trafficDistributionGroup
     *        Information about the traffic distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrafficDistributionGroupResult withTrafficDistributionGroup(TrafficDistributionGroup trafficDistributionGroup) {
        setTrafficDistributionGroup(trafficDistributionGroup);
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
        if (getTrafficDistributionGroup() != null)
            sb.append("TrafficDistributionGroup: ").append(getTrafficDistributionGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrafficDistributionGroupResult == false)
            return false;
        DescribeTrafficDistributionGroupResult other = (DescribeTrafficDistributionGroupResult) obj;
        if (other.getTrafficDistributionGroup() == null ^ this.getTrafficDistributionGroup() == null)
            return false;
        if (other.getTrafficDistributionGroup() != null && other.getTrafficDistributionGroup().equals(this.getTrafficDistributionGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficDistributionGroup() == null) ? 0 : getTrafficDistributionGroup().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrafficDistributionGroupResult clone() {
        try {
            return (DescribeTrafficDistributionGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
