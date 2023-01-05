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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The object that is specified in resource record set object when you are linking a resource record set to a CIDR
 * location.
 * </p>
 * <p>
 * A <code>LocationName</code> with an asterisk “*” can be used to create a default CIDR record.
 * <code>CollectionId</code> is still required for default record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CidrRoutingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CidrRoutingConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     */
    private String collectionId;
    /**
     * <p>
     * The CIDR collection location name.
     * </p>
     */
    private String locationName;

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     * 
     * @param collectionId
     *        The CIDR collection ID.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     * 
     * @return The CIDR collection ID.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The CIDR collection ID.
     * </p>
     * 
     * @param collectionId
     *        The CIDR collection ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrRoutingConfig withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * <p>
     * The CIDR collection location name.
     * </p>
     * 
     * @param locationName
     *        The CIDR collection location name.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The CIDR collection location name.
     * </p>
     * 
     * @return The CIDR collection location name.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The CIDR collection location name.
     * </p>
     * 
     * @param locationName
     *        The CIDR collection location name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CidrRoutingConfig withLocationName(String locationName) {
        setLocationName(locationName);
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
        if (getLocationName() != null)
            sb.append("LocationName: ").append(getLocationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CidrRoutingConfig == false)
            return false;
        CidrRoutingConfig other = (CidrRoutingConfig) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        return hashCode;
    }

    @Override
    public CidrRoutingConfig clone() {
        try {
            return (CidrRoutingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
