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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * Reports the configuration of a bootstrap action in a job flow.
 * </p>
 */
public class BootstrapActionDetail implements Serializable {

    /**
     * A description of the bootstrap action.
     */
    private BootstrapActionConfig bootstrapActionConfig;

    /**
     * Default constructor for a new BootstrapActionDetail object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BootstrapActionDetail() {}
    
    /**
     * Constructs a new BootstrapActionDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param bootstrapActionConfig A description of the bootstrap action.
     */
    public BootstrapActionDetail(BootstrapActionConfig bootstrapActionConfig) {
        setBootstrapActionConfig(bootstrapActionConfig);
    }

    /**
     * A description of the bootstrap action.
     *
     * @return A description of the bootstrap action.
     */
    public BootstrapActionConfig getBootstrapActionConfig() {
        return bootstrapActionConfig;
    }
    
    /**
     * A description of the bootstrap action.
     *
     * @param bootstrapActionConfig A description of the bootstrap action.
     */
    public void setBootstrapActionConfig(BootstrapActionConfig bootstrapActionConfig) {
        this.bootstrapActionConfig = bootstrapActionConfig;
    }
    
    /**
     * A description of the bootstrap action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActionConfig A description of the bootstrap action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BootstrapActionDetail withBootstrapActionConfig(BootstrapActionConfig bootstrapActionConfig) {
        this.bootstrapActionConfig = bootstrapActionConfig;
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
        if (getBootstrapActionConfig() != null) sb.append("BootstrapActionConfig: " + getBootstrapActionConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBootstrapActionConfig() == null) ? 0 : getBootstrapActionConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BootstrapActionDetail == false) return false;
        BootstrapActionDetail other = (BootstrapActionDetail)obj;
        
        if (other.getBootstrapActionConfig() == null ^ this.getBootstrapActionConfig() == null) return false;
        if (other.getBootstrapActionConfig() != null && other.getBootstrapActionConfig().equals(this.getBootstrapActionConfig()) == false) return false; 
        return true;
    }
    
}
    