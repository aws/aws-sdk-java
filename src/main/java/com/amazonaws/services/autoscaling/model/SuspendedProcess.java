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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;


/**
 * <p>
 * An Auto Scaling process that has been suspended. For more information, see ProcessType.
 * </p>
 */
public class SuspendedProcess implements Serializable {

    /**
     * The name of the suspended process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String processName;

    /**
     * The reason that the process was suspended.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String suspensionReason;

    /**
     * The name of the suspended process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the suspended process.
     */
    public String getProcessName() {
        return processName;
    }
    
    /**
     * The name of the suspended process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param processName The name of the suspended process.
     */
    public void setProcessName(String processName) {
        this.processName = processName;
    }
    
    /**
     * The name of the suspended process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param processName The name of the suspended process.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SuspendedProcess withProcessName(String processName) {
        this.processName = processName;
        return this;
    }

    /**
     * The reason that the process was suspended.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The reason that the process was suspended.
     */
    public String getSuspensionReason() {
        return suspensionReason;
    }
    
    /**
     * The reason that the process was suspended.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param suspensionReason The reason that the process was suspended.
     */
    public void setSuspensionReason(String suspensionReason) {
        this.suspensionReason = suspensionReason;
    }
    
    /**
     * The reason that the process was suspended.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param suspensionReason The reason that the process was suspended.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SuspendedProcess withSuspensionReason(String suspensionReason) {
        this.suspensionReason = suspensionReason;
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
        if (getProcessName() != null) sb.append("ProcessName: " + getProcessName() + ",");
        if (getSuspensionReason() != null) sb.append("SuspensionReason: " + getSuspensionReason() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProcessName() == null) ? 0 : getProcessName().hashCode()); 
        hashCode = prime * hashCode + ((getSuspensionReason() == null) ? 0 : getSuspensionReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SuspendedProcess == false) return false;
        SuspendedProcess other = (SuspendedProcess)obj;
        
        if (other.getProcessName() == null ^ this.getProcessName() == null) return false;
        if (other.getProcessName() != null && other.getProcessName().equals(this.getProcessName()) == false) return false; 
        if (other.getSuspensionReason() == null ^ this.getSuspensionReason() == null) return false;
        if (other.getSuspensionReason() != null && other.getSuspensionReason().equals(this.getSuspensionReason()) == false) return false; 
        return true;
    }
    
}
    