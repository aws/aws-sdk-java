/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;


/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class UpdateChapCredentialsResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the target. This is the same target
     * specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     */
    private String targetARN;

    /**
     * The iSCSI initiator that connects to the target. This is the same
     * initiator name specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     */
    private String initiatorName;

    /**
     * The Amazon Resource Name (ARN) of the target. This is the same target
     * specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @return The Amazon Resource Name (ARN) of the target. This is the same target
     *         specified in the request.
     */
    public String getTargetARN() {
        return targetARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the target. This is the same target
     * specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN The Amazon Resource Name (ARN) of the target. This is the same target
     *         specified in the request.
     */
    public void setTargetARN(String targetARN) {
        this.targetARN = targetARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the target. This is the same target
     * specified in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 800<br/>
     *
     * @param targetARN The Amazon Resource Name (ARN) of the target. This is the same target
     *         specified in the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateChapCredentialsResult withTargetARN(String targetARN) {
        this.targetARN = targetARN;
        return this;
    }

    /**
     * The iSCSI initiator that connects to the target. This is the same
     * initiator name specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @return The iSCSI initiator that connects to the target. This is the same
     *         initiator name specified in the request.
     */
    public String getInitiatorName() {
        return initiatorName;
    }
    
    /**
     * The iSCSI initiator that connects to the target. This is the same
     * initiator name specified in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName The iSCSI initiator that connects to the target. This is the same
     *         initiator name specified in the request.
     */
    public void setInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
    }
    
    /**
     * The iSCSI initiator that connects to the target. This is the same
     * initiator name specified in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[0-9a-z:.-]+<br/>
     *
     * @param initiatorName The iSCSI initiator that connects to the target. This is the same
     *         initiator name specified in the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateChapCredentialsResult withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
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
        if (getTargetARN() != null) sb.append("TargetARN: " + getTargetARN() + ",");
        if (getInitiatorName() != null) sb.append("InitiatorName: " + getInitiatorName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTargetARN() == null) ? 0 : getTargetARN().hashCode()); 
        hashCode = prime * hashCode + ((getInitiatorName() == null) ? 0 : getInitiatorName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateChapCredentialsResult == false) return false;
        UpdateChapCredentialsResult other = (UpdateChapCredentialsResult)obj;
        
        if (other.getTargetARN() == null ^ this.getTargetARN() == null) return false;
        if (other.getTargetARN() != null && other.getTargetARN().equals(this.getTargetARN()) == false) return false; 
        if (other.getInitiatorName() == null ^ this.getInitiatorName() == null) return false;
        if (other.getInitiatorName() != null && other.getInitiatorName().equals(this.getInitiatorName()) == false) return false; 
        return true;
    }
    
}
    