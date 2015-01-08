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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * 
 */
public class Failure implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the failed resource.
     */
    private String arn;

    /**
     * The reason for the failure.
     */
    private String reason;

    /**
     * The Amazon Resource Name (ARN) of the failed resource.
     *
     * @return The Amazon Resource Name (ARN) of the failed resource.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the failed resource.
     *
     * @param arn The Amazon Resource Name (ARN) of the failed resource.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the failed resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The Amazon Resource Name (ARN) of the failed resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Failure withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The reason for the failure.
     *
     * @return The reason for the failure.
     */
    public String getReason() {
        return reason;
    }
    
    /**
     * The reason for the failure.
     *
     * @param reason The reason for the failure.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }
    
    /**
     * The reason for the failure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reason The reason for the failure.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Failure withReason(String reason) {
        this.reason = reason;
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
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getReason() != null) sb.append("Reason: " + getReason() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Failure == false) return false;
        Failure other = (Failure)obj;
        
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getReason() == null ^ this.getReason() == null) return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false) return false; 
        return true;
    }
    
}
    