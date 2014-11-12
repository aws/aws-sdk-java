/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a stop deployment operation.
 * </p>
 */
public class StopDeploymentResult implements Serializable {

    /**
     * The status of the stop deployment operation: <ul> <li>Pending: The
     * stop operation is pending.</li> <li>Succeeded: The stop operation
     * succeeded.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Succeeded
     */
    private String status;

    /**
     * An accompanying status message.
     */
    private String statusMessage;

    /**
     * The status of the stop deployment operation: <ul> <li>Pending: The
     * stop operation is pending.</li> <li>Succeeded: The stop operation
     * succeeded.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Succeeded
     *
     * @return The status of the stop deployment operation: <ul> <li>Pending: The
     *         stop operation is pending.</li> <li>Succeeded: The stop operation
     *         succeeded.</li> </ul>
     *
     * @see StopStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the stop deployment operation: <ul> <li>Pending: The
     * stop operation is pending.</li> <li>Succeeded: The stop operation
     * succeeded.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Succeeded
     *
     * @param status The status of the stop deployment operation: <ul> <li>Pending: The
     *         stop operation is pending.</li> <li>Succeeded: The stop operation
     *         succeeded.</li> </ul>
     *
     * @see StopStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the stop deployment operation: <ul> <li>Pending: The
     * stop operation is pending.</li> <li>Succeeded: The stop operation
     * succeeded.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Succeeded
     *
     * @param status The status of the stop deployment operation: <ul> <li>Pending: The
     *         stop operation is pending.</li> <li>Succeeded: The stop operation
     *         succeeded.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StopStatus
     */
    public StopDeploymentResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the stop deployment operation: <ul> <li>Pending: The
     * stop operation is pending.</li> <li>Succeeded: The stop operation
     * succeeded.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Succeeded
     *
     * @param status The status of the stop deployment operation: <ul> <li>Pending: The
     *         stop operation is pending.</li> <li>Succeeded: The stop operation
     *         succeeded.</li> </ul>
     *
     * @see StopStatus
     */
    public void setStatus(StopStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the stop deployment operation: <ul> <li>Pending: The
     * stop operation is pending.</li> <li>Succeeded: The stop operation
     * succeeded.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Succeeded
     *
     * @param status The status of the stop deployment operation: <ul> <li>Pending: The
     *         stop operation is pending.</li> <li>Succeeded: The stop operation
     *         succeeded.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StopStatus
     */
    public StopDeploymentResult withStatus(StopStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * An accompanying status message.
     *
     * @return An accompanying status message.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * An accompanying status message.
     *
     * @param statusMessage An accompanying status message.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * An accompanying status message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage An accompanying status message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StopDeploymentResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StopDeploymentResult == false) return false;
        StopDeploymentResult other = (StopDeploymentResult)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        return true;
    }
    
}
    