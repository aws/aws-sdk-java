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
 * Hadoop Jar Step Config
 */
public class HadoopJarStepConfig {

    private java.util.List<KeyValue> properties;

    private String jar;

    private String mainClass;

    private java.util.List<String> args;

    /**
     * Returns the value of the Properties property for this object.
     *
     * @return The value of the Properties property for this object.
     */
    public java.util.List<KeyValue> getProperties() {
        if (properties == null) {
            properties = new java.util.ArrayList<KeyValue>();
        }
        return properties;
    }
    
    /**
     * Sets the value of the Properties property for this object.
     *
     * @param properties The new value for the Properties property for this object.
     */
    public void setProperties(java.util.Collection<KeyValue> properties) {
        java.util.List<KeyValue> propertiesCopy = new java.util.ArrayList<KeyValue>();
        if (properties != null) {
            propertiesCopy.addAll(properties);
        }
        this.properties = propertiesCopy;
    }
    
    /**
     * Sets the value of the Properties property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties The new value for the Properties property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withProperties(KeyValue... properties) {
        for (KeyValue value : properties) {
            getProperties().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Properties property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties The new value for the Properties property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withProperties(java.util.Collection<KeyValue> properties) {
        java.util.List<KeyValue> propertiesCopy = new java.util.ArrayList<KeyValue>();
        if (properties != null) {
            propertiesCopy.addAll(properties);
        }
        this.properties = propertiesCopy;

        return this;
    }
    
    /**
     * Returns the value of the Jar property for this object.
     *
     * @return The value of the Jar property for this object.
     */
    public String getJar() {
        return jar;
    }
    
    /**
     * Sets the value of the Jar property for this object.
     *
     * @param jar The new value for the Jar property for this object.
     */
    public void setJar(String jar) {
        this.jar = jar;
    }
    
    /**
     * Sets the value of the Jar property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jar The new value for the Jar property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withJar(String jar) {
        this.jar = jar;
        return this;
    }
    
    
    /**
     * Returns the value of the MainClass property for this object.
     *
     * @return The value of the MainClass property for this object.
     */
    public String getMainClass() {
        return mainClass;
    }
    
    /**
     * Sets the value of the MainClass property for this object.
     *
     * @param mainClass The new value for the MainClass property for this object.
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }
    
    /**
     * Sets the value of the MainClass property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mainClass The new value for the MainClass property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    
    
    /**
     * Returns the value of the Args property for this object.
     *
     * @return The value of the Args property for this object.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new java.util.ArrayList<String>();
        }
        return args;
    }
    
    /**
     * Sets the value of the Args property for this object.
     *
     * @param args The new value for the Args property for this object.
     */
    public void setArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;
    }
    
    /**
     * Sets the value of the Args property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The new value for the Args property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withArgs(String... args) {
        for (String value : args) {
            getArgs().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Args property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The new value for the Args property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;

        return this;
    }
    
}
    