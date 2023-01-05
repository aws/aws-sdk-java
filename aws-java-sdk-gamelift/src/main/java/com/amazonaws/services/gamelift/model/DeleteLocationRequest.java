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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The location name of the custom location to be deleted.
     * </p>
     */
    private String locationName;

    /**
     * <p>
     * The location name of the custom location to be deleted.
     * </p>
     * 
     * @param locationName
     *        The location name of the custom location to be deleted.
     */

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The location name of the custom location to be deleted.
     * </p>
     * 
     * @return The location name of the custom location to be deleted.
     */

    public String getLocationName() {
        return this.locationName;
    }

    /**
     * <p>
     * The location name of the custom location to be deleted.
     * </p>
     * 
     * @param locationName
     *        The location name of the custom location to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLocationRequest withLocationName(String locationName) {
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

        if (obj instanceof DeleteLocationRequest == false)
            return false;
        DeleteLocationRequest other = (DeleteLocationRequest) obj;
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

        hashCode = prime * hashCode + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLocationRequest clone() {
        return (DeleteLocationRequest) super.clone();
    }

}
