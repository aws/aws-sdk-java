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
 * <p>
 * The <code>ulimit</code> settings to pass to the container.
 * </p>
 */
public class Ulimit implements Serializable, Cloneable {

    /**
     * The <code>type</code> of the <code>ulimit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     */
    private String name;

    /**
     * The soft limit for the ulimit type.
     */
    private Integer softLimit;

    /**
     * The hard limit for the ulimit type.
     */
    private Integer hardLimit;

    /**
     * The <code>type</code> of the <code>ulimit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @return The <code>type</code> of the <code>ulimit</code>.
     *
     * @see UlimitName
     */
    public String getName() {
        return name;
    }
    
    /**
     * The <code>type</code> of the <code>ulimit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name The <code>type</code> of the <code>ulimit</code>.
     *
     * @see UlimitName
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The <code>type</code> of the <code>ulimit</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name The <code>type</code> of the <code>ulimit</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UlimitName
     */
    public Ulimit withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The <code>type</code> of the <code>ulimit</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name The <code>type</code> of the <code>ulimit</code>.
     *
     * @see UlimitName
     */
    public void setName(UlimitName name) {
        this.name = name.toString();
    }
    
    /**
     * The <code>type</code> of the <code>ulimit</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>core, cpu, data, fsize, locks, memlock, msgqueue, nice, nofile, nproc, rss, rtprio, rttime, sigpending, stack
     *
     * @param name The <code>type</code> of the <code>ulimit</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UlimitName
     */
    public Ulimit withName(UlimitName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * The soft limit for the ulimit type.
     *
     * @return The soft limit for the ulimit type.
     */
    public Integer getSoftLimit() {
        return softLimit;
    }
    
    /**
     * The soft limit for the ulimit type.
     *
     * @param softLimit The soft limit for the ulimit type.
     */
    public void setSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
    }
    
    /**
     * The soft limit for the ulimit type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param softLimit The soft limit for the ulimit type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ulimit withSoftLimit(Integer softLimit) {
        this.softLimit = softLimit;
        return this;
    }

    /**
     * The hard limit for the ulimit type.
     *
     * @return The hard limit for the ulimit type.
     */
    public Integer getHardLimit() {
        return hardLimit;
    }
    
    /**
     * The hard limit for the ulimit type.
     *
     * @param hardLimit The hard limit for the ulimit type.
     */
    public void setHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
    }
    
    /**
     * The hard limit for the ulimit type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hardLimit The hard limit for the ulimit type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Ulimit withHardLimit(Integer hardLimit) {
        this.hardLimit = hardLimit;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getSoftLimit() != null) sb.append("SoftLimit: " + getSoftLimit() + ",");
        if (getHardLimit() != null) sb.append("HardLimit: " + getHardLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getSoftLimit() == null) ? 0 : getSoftLimit().hashCode()); 
        hashCode = prime * hashCode + ((getHardLimit() == null) ? 0 : getHardLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Ulimit == false) return false;
        Ulimit other = (Ulimit)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getSoftLimit() == null ^ this.getSoftLimit() == null) return false;
        if (other.getSoftLimit() != null && other.getSoftLimit().equals(this.getSoftLimit()) == false) return false; 
        if (other.getHardLimit() == null ^ this.getHardLimit() == null) return false;
        if (other.getHardLimit() != null && other.getHardLimit().equals(this.getHardLimit()) == false) return false; 
        return true;
    }
    
    @Override
    public Ulimit clone() {
        try {
            return (Ulimit) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    