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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>ListDomainNames</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDomainNamesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Filters the output by domain engine type.
     * </p>
     */
    private String engineType;

    /**
     * <p>
     * Filters the output by domain engine type.
     * </p>
     * 
     * @param engineType
     *        Filters the output by domain engine type.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * Filters the output by domain engine type.
     * </p>
     * 
     * @return Filters the output by domain engine type.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * Filters the output by domain engine type.
     * </p>
     * 
     * @param engineType
     *        Filters the output by domain engine type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public ListDomainNamesRequest withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * Filters the output by domain engine type.
     * </p>
     * 
     * @param engineType
     *        Filters the output by domain engine type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public ListDomainNamesRequest withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
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
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDomainNamesRequest == false)
            return false;
        ListDomainNamesRequest other = (ListDomainNamesRequest) obj;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        return hashCode;
    }

    @Override
    public ListDomainNamesRequest clone() {
        return (ListDomainNamesRequest) super.clone();
    }

}
