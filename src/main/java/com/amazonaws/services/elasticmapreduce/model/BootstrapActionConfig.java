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
 * Bootstrap Action Config
 */
public class BootstrapActionConfig {

    private String name;

    private ScriptBootstrapActionConfig scriptBootstrapAction;

    /**
     * Returns the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BootstrapActionConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the ScriptBootstrapAction property for this
     * object.
     *
     * @return The value of the ScriptBootstrapAction property for this object.
     */
    public ScriptBootstrapActionConfig getScriptBootstrapAction() {
        return scriptBootstrapAction;
    }
    
    /**
     * Sets the value of the ScriptBootstrapAction property for this object.
     *
     * @param scriptBootstrapAction The new value for the ScriptBootstrapAction property for this object.
     */
    public void setScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
    }
    
    /**
     * Sets the value of the ScriptBootstrapAction property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scriptBootstrapAction The new value for the ScriptBootstrapAction property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BootstrapActionConfig withScriptBootstrapAction(ScriptBootstrapActionConfig scriptBootstrapAction) {
        this.scriptBootstrapAction = scriptBootstrapAction;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Name: " + name + ", ");
        sb.append("ScriptBootstrapAction: " + scriptBootstrapAction + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    