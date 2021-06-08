/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticinference.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elastic-inference-2017-07-25/DescribeAcceleratorOfferings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAcceleratorOfferingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings for. It can assume the following values:
     * region: will return the accelerator type offering at the regional level. availability-zone: will return the
     * accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type
     * offering at the availability zone level returning the availability zone id.
     * </p>
     */
    private String locationType;
    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings for. It can assume the following values:
     * region: will return the accelerator type offering at the regional level. availability-zone: will return the
     * accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type
     * offering at the availability zone level returning the availability zone id.
     * </p>
     * 
     * @param locationType
     *        The location type that you want to describe accelerator type offerings for. It can assume the following
     *        values: region: will return the accelerator type offering at the regional level. availability-zone: will
     *        return the accelerator type offering at the availability zone level. availability-zone-id: will return the
     *        accelerator type offering at the availability zone level returning the availability zone id.
     * @see LocationType
     */

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings for. It can assume the following values:
     * region: will return the accelerator type offering at the regional level. availability-zone: will return the
     * accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type
     * offering at the availability zone level returning the availability zone id.
     * </p>
     * 
     * @return The location type that you want to describe accelerator type offerings for. It can assume the following
     *         values: region: will return the accelerator type offering at the regional level. availability-zone: will
     *         return the accelerator type offering at the availability zone level. availability-zone-id: will return
     *         the accelerator type offering at the availability zone level returning the availability zone id.
     * @see LocationType
     */

    public String getLocationType() {
        return this.locationType;
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings for. It can assume the following values:
     * region: will return the accelerator type offering at the regional level. availability-zone: will return the
     * accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type
     * offering at the availability zone level returning the availability zone id.
     * </p>
     * 
     * @param locationType
     *        The location type that you want to describe accelerator type offerings for. It can assume the following
     *        values: region: will return the accelerator type offering at the regional level. availability-zone: will
     *        return the accelerator type offering at the availability zone level. availability-zone-id: will return the
     *        accelerator type offering at the availability zone level returning the availability zone id.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public DescribeAcceleratorOfferingsRequest withLocationType(String locationType) {
        setLocationType(locationType);
        return this;
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings for. It can assume the following values:
     * region: will return the accelerator type offering at the regional level. availability-zone: will return the
     * accelerator type offering at the availability zone level. availability-zone-id: will return the accelerator type
     * offering at the availability zone level returning the availability zone id.
     * </p>
     * 
     * @param locationType
     *        The location type that you want to describe accelerator type offerings for. It can assume the following
     *        values: region: will return the accelerator type offering at the regional level. availability-zone: will
     *        return the accelerator type offering at the availability zone level. availability-zone-id: will return the
     *        accelerator type offering at the availability zone level returning the availability zone id.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public DescribeAcceleratorOfferingsRequest withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
        return this;
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     * 
     * @return The list of accelerator types to describe.
     */

    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     * 
     * @param acceleratorTypes
     *        The list of accelerator types to describe.
     */

    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        The list of accelerator types to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorOfferingsRequest withAcceleratorTypes(String... acceleratorTypes) {
        if (this.acceleratorTypes == null) {
            setAcceleratorTypes(new java.util.ArrayList<String>(acceleratorTypes.length));
        }
        for (String ele : acceleratorTypes) {
            this.acceleratorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     * 
     * @param acceleratorTypes
     *        The list of accelerator types to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAcceleratorOfferingsRequest withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
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
        if (getLocationType() != null)
            sb.append("LocationType: ").append(getLocationType()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorOfferingsRequest == false)
            return false;
        DescribeAcceleratorOfferingsRequest other = (DescribeAcceleratorOfferingsRequest) obj;
        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAcceleratorOfferingsRequest clone() {
        return (DescribeAcceleratorOfferingsRequest) super.clone();
    }

}
