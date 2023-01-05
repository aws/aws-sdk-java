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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateCidrCollection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCidrCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about the CIDR collection.
     * </p>
     */
    private CidrCollection collection;
    /**
     * <p>
     * A unique URL that represents the location for the CIDR collection.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A complex type that contains information about the CIDR collection.
     * </p>
     * 
     * @param collection
     *        A complex type that contains information about the CIDR collection.
     */

    public void setCollection(CidrCollection collection) {
        this.collection = collection;
    }

    /**
     * <p>
     * A complex type that contains information about the CIDR collection.
     * </p>
     * 
     * @return A complex type that contains information about the CIDR collection.
     */

    public CidrCollection getCollection() {
        return this.collection;
    }

    /**
     * <p>
     * A complex type that contains information about the CIDR collection.
     * </p>
     * 
     * @param collection
     *        A complex type that contains information about the CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCidrCollectionResult withCollection(CidrCollection collection) {
        setCollection(collection);
        return this;
    }

    /**
     * <p>
     * A unique URL that represents the location for the CIDR collection.
     * </p>
     * 
     * @param location
     *        A unique URL that represents the location for the CIDR collection.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * A unique URL that represents the location for the CIDR collection.
     * </p>
     * 
     * @return A unique URL that represents the location for the CIDR collection.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * A unique URL that represents the location for the CIDR collection.
     * </p>
     * 
     * @param location
     *        A unique URL that represents the location for the CIDR collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCidrCollectionResult withLocation(String location) {
        setLocation(location);
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
        if (getCollection() != null)
            sb.append("Collection: ").append(getCollection()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCidrCollectionResult == false)
            return false;
        CreateCidrCollectionResult other = (CreateCidrCollectionResult) obj;
        if (other.getCollection() == null ^ this.getCollection() == null)
            return false;
        if (other.getCollection() != null && other.getCollection().equals(this.getCollection()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollection() == null) ? 0 : getCollection().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public CreateCidrCollectionResult clone() {
        try {
            return (CreateCidrCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
