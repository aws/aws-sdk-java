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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the suppressed email address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/GetSuppressedDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSuppressedDestinationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about the suppressed email address.
     * </p>
     */
    private SuppressedDestination suppressedDestination;

    /**
     * <p>
     * An object containing information about the suppressed email address.
     * </p>
     * 
     * @param suppressedDestination
     *        An object containing information about the suppressed email address.
     */

    public void setSuppressedDestination(SuppressedDestination suppressedDestination) {
        this.suppressedDestination = suppressedDestination;
    }

    /**
     * <p>
     * An object containing information about the suppressed email address.
     * </p>
     * 
     * @return An object containing information about the suppressed email address.
     */

    public SuppressedDestination getSuppressedDestination() {
        return this.suppressedDestination;
    }

    /**
     * <p>
     * An object containing information about the suppressed email address.
     * </p>
     * 
     * @param suppressedDestination
     *        An object containing information about the suppressed email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSuppressedDestinationResult withSuppressedDestination(SuppressedDestination suppressedDestination) {
        setSuppressedDestination(suppressedDestination);
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
        if (getSuppressedDestination() != null)
            sb.append("SuppressedDestination: ").append(getSuppressedDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSuppressedDestinationResult == false)
            return false;
        GetSuppressedDestinationResult other = (GetSuppressedDestinationResult) obj;
        if (other.getSuppressedDestination() == null ^ this.getSuppressedDestination() == null)
            return false;
        if (other.getSuppressedDestination() != null && other.getSuppressedDestination().equals(this.getSuppressedDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuppressedDestination() == null) ? 0 : getSuppressedDestination().hashCode());
        return hashCode;
    }

    @Override
    public GetSuppressedDestinationResult clone() {
        try {
            return (GetSuppressedDestinationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
