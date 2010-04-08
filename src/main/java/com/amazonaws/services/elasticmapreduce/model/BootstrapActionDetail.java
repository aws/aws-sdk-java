/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Bootstrap Action Detail
 */
public class BootstrapActionDetail {

    private BootstrapActionConfig bootstrapActionConfig;

    /**
     * Returns the value of the BootstrapActionConfig property for this
     * object.
     *
     * @return The value of the BootstrapActionConfig property for this object.
     */
    public BootstrapActionConfig getBootstrapActionConfig() {
        return bootstrapActionConfig;
    }
    
    /**
     * Sets the value of the BootstrapActionConfig property for this object.
     *
     * @param bootstrapActionConfig The new value for the BootstrapActionConfig property for this object.
     */
    public void setBootstrapActionConfig(BootstrapActionConfig bootstrapActionConfig) {
        this.bootstrapActionConfig = bootstrapActionConfig;
    }
    
    /**
     * Sets the value of the BootstrapActionConfig property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActionConfig The new value for the BootstrapActionConfig property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BootstrapActionDetail withBootstrapActionConfig(BootstrapActionConfig bootstrapActionConfig) {
        this.bootstrapActionConfig = bootstrapActionConfig;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("BootstrapActionConfig: " + bootstrapActionConfig + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    