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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Destination
 */
public class Destination implements Serializable, Cloneable {

    private String destinationName;

    private String targetArn;

    private String roleArn;

    private String accessPolicy;

    private String arn;

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long creationTime;

    /**
     * Returns the value of the DestinationName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The value of the DestinationName property for this object.
     */
    public String getDestinationName() {
        return destinationName;
    }
    
    /**
     * Sets the value of the DestinationName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName The new value for the DestinationName property for this object.
     */
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
    
    /**
     * Sets the value of the DestinationName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param destinationName The new value for the DestinationName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Destination withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }

    /**
     * Returns the value of the TargetArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the TargetArn property for this object.
     */
    public String getTargetArn() {
        return targetArn;
    }
    
    /**
     * Sets the value of the TargetArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn The new value for the TargetArn property for this object.
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }
    
    /**
     * Sets the value of the TargetArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param targetArn The new value for the TargetArn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Destination withTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }

    /**
     * Returns the value of the RoleArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the RoleArn property for this object.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * Sets the value of the RoleArn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The new value for the RoleArn property for this object.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * Sets the value of the RoleArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param roleArn The new value for the RoleArn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Destination withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * Returns the value of the AccessPolicy property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the AccessPolicy property for this object.
     */
    public String getAccessPolicy() {
        return accessPolicy;
    }
    
    /**
     * Sets the value of the AccessPolicy property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param accessPolicy The new value for the AccessPolicy property for this object.
     */
    public void setAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
    }
    
    /**
     * Sets the value of the AccessPolicy property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param accessPolicy The new value for the AccessPolicy property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Destination withAccessPolicy(String accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * Returns the value of the Arn property for this object.
     *
     * @return The value of the Arn property for this object.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     *
     * @param arn The new value for the Arn property for this object.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param arn The new value for the Arn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Destination withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public Long getCreationTime() {
        return creationTime;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     */
    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }
    
    /**
     * A point in time expressed as the number of milliseconds since Jan 1,
     * 1970 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param creationTime A point in time expressed as the number of milliseconds since Jan 1,
     *         1970 00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Destination withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
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
        if (getDestinationName() != null) sb.append("DestinationName: " + getDestinationName() + ",");
        if (getTargetArn() != null) sb.append("TargetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getAccessPolicy() != null) sb.append("AccessPolicy: " + getAccessPolicy() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getCreationTime() != null) sb.append("CreationTime: " + getCreationTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode()); 
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getAccessPolicy() == null) ? 0 : getAccessPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Destination == false) return false;
        Destination other = (Destination)obj;
        
        if (other.getDestinationName() == null ^ this.getDestinationName() == null) return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false) return false; 
        if (other.getTargetArn() == null ^ this.getTargetArn() == null) return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getAccessPolicy() == null ^ this.getAccessPolicy() == null) return false;
        if (other.getAccessPolicy() != null && other.getAccessPolicy().equals(this.getAccessPolicy()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getCreationTime() == null ^ this.getCreationTime() == null) return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false) return false; 
        return true;
    }
    
    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    