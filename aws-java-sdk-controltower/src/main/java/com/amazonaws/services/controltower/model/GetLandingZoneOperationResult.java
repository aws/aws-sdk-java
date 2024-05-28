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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/GetLandingZoneOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLandingZoneOperationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about a landing zone operation.
     * </p>
     */
    private LandingZoneOperationDetail operationDetails;

    /**
     * <p>
     * Details about a landing zone operation.
     * </p>
     * 
     * @param operationDetails
     *        Details about a landing zone operation.
     */

    public void setOperationDetails(LandingZoneOperationDetail operationDetails) {
        this.operationDetails = operationDetails;
    }

    /**
     * <p>
     * Details about a landing zone operation.
     * </p>
     * 
     * @return Details about a landing zone operation.
     */

    public LandingZoneOperationDetail getOperationDetails() {
        return this.operationDetails;
    }

    /**
     * <p>
     * Details about a landing zone operation.
     * </p>
     * 
     * @param operationDetails
     *        Details about a landing zone operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLandingZoneOperationResult withOperationDetails(LandingZoneOperationDetail operationDetails) {
        setOperationDetails(operationDetails);
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
        if (getOperationDetails() != null)
            sb.append("OperationDetails: ").append(getOperationDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLandingZoneOperationResult == false)
            return false;
        GetLandingZoneOperationResult other = (GetLandingZoneOperationResult) obj;
        if (other.getOperationDetails() == null ^ this.getOperationDetails() == null)
            return false;
        if (other.getOperationDetails() != null && other.getOperationDetails().equals(this.getOperationDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationDetails() == null) ? 0 : getOperationDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetLandingZoneOperationResult clone() {
        try {
            return (GetLandingZoneOperationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
