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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error corresponding to the calculation of a route between the <code>DeparturePosition</code> and
 * <code>DestinationPosition</code>.
 * </p>
 * <p>
 * The error code can be one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>RouteNotFound</code> - Unable to find a valid route with the given parameters.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>RouteTooLong</code> - Route calculation went beyond the maximum size of a route and was terminated before
 * completion.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>PositionsNotFound</code> - One or more of the input positions were not found on the route network.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>DestinationPositionNotFound</code> - The destination position was not found on the route network.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>DeparturePositionNotFound</code> - The departure position was not found on the route network.
 * </p>
 * </li>
 * </ul>
 * <ul>
 * <li>
 * <p>
 * <code>OtherValidationError</code> - The given inputs were not valid or a route was not found. More information is
 * given in the error <code>Message</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/RouteMatrixEntryError" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteMatrixEntryError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of error which occurred for the route calculation.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A message about the error that occurred for the route calculation.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The type of error which occurred for the route calculation.
     * </p>
     * 
     * @param code
     *        The type of error which occurred for the route calculation.
     * @see RouteMatrixErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The type of error which occurred for the route calculation.
     * </p>
     * 
     * @return The type of error which occurred for the route calculation.
     * @see RouteMatrixErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The type of error which occurred for the route calculation.
     * </p>
     * 
     * @param code
     *        The type of error which occurred for the route calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteMatrixErrorCode
     */

    public RouteMatrixEntryError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The type of error which occurred for the route calculation.
     * </p>
     * 
     * @param code
     *        The type of error which occurred for the route calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RouteMatrixErrorCode
     */

    public RouteMatrixEntryError withCode(RouteMatrixErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message about the error that occurred for the route calculation.
     * </p>
     * 
     * @param message
     *        A message about the error that occurred for the route calculation.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the error that occurred for the route calculation.
     * </p>
     * 
     * @return A message about the error that occurred for the route calculation.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the error that occurred for the route calculation.
     * </p>
     * 
     * @param message
     *        A message about the error that occurred for the route calculation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteMatrixEntryError withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteMatrixEntryError == false)
            return false;
        RouteMatrixEntryError other = (RouteMatrixEntryError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public RouteMatrixEntryError clone() {
        try {
            return (RouteMatrixEntryError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.RouteMatrixEntryErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
