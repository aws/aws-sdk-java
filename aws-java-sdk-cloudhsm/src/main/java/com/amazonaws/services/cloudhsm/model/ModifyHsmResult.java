/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of the ModifyHsm action.
 * </p>
 */
public class ModifyHsmResult implements Serializable, Cloneable {

    /**
     * The ARN of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     */
    private String hsmArn;

    /**
     * The ARN of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the HSM.
     */
    public String getHsmArn() {
        return hsmArn;
    }
    
    /**
     * The ARN of the HSM.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM.
     */
    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }
    
    /**
     * The ARN of the HSM.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}<br/>
     *
     * @param hsmArn The ARN of the HSM.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyHsmResult withHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
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
        if (getHsmArn() != null) sb.append("HsmArn: " + getHsmArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyHsmResult == false) return false;
        ModifyHsmResult other = (ModifyHsmResult)obj;
        
        if (other.getHsmArn() == null ^ this.getHsmArn() == null) return false;
        if (other.getHsmArn() != null && other.getHsmArn().equals(this.getHsmArn()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyHsmResult clone() {
        try {
            return (ModifyHsmResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    