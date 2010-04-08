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
 * 
 */
public class HadoopJarStepConfig {

    /**
     * A list of <a>KeyValue</a> instances.
     */
    private java.util.List<KeyValue> properties;

    /**
     * <p/>
     */
    private String jar;

    /**
     * The name of the main class in the specified Java file.
     */
    private String mainClass;

    /**
     * A list of arguments for the job flow's steps.
     */
    private java.util.List<String> args;

    /**
     * A list of <a>KeyValue</a> instances.
     *
     * @return A list of <a>KeyValue</a> instances.
     */
    public java.util.List<KeyValue> getProperties() {
        if (properties == null) {
            properties = new java.util.ArrayList<KeyValue>();
        }
        return properties;
    }
    
    /**
     * A list of <a>KeyValue</a> instances.
     *
     * @param properties A list of <a>KeyValue</a> instances.
     */
    public void setProperties(java.util.Collection<KeyValue> properties) {
        java.util.List<KeyValue> propertiesCopy = new java.util.ArrayList<KeyValue>();
        if (properties != null) {
            propertiesCopy.addAll(properties);
        }
        this.properties = propertiesCopy;
    }
    
    /**
     * A list of <a>KeyValue</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A list of <a>KeyValue</a> instances.
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
     * A list of <a>KeyValue</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A list of <a>KeyValue</a> instances.
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
     * <p/>
     *
     * @return <p/>
     */
    public String getJar() {
        return jar;
    }
    
    /**
     * <p/>
     *
     * @param jar <p/>
     */
    public void setJar(String jar) {
        this.jar = jar;
    }
    
    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jar <p/>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withJar(String jar) {
        this.jar = jar;
        return this;
    }
    
    
    /**
     * The name of the main class in the specified Java file.
     *
     * @return The name of the main class in the specified Java file.
     */
    public String getMainClass() {
        return mainClass;
    }
    
    /**
     * The name of the main class in the specified Java file.
     *
     * @param mainClass The name of the main class in the specified Java file.
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }
    
    /**
     * The name of the main class in the specified Java file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mainClass The name of the main class in the specified Java file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    
    
    /**
     * A list of arguments for the job flow's steps.
     *
     * @return A list of arguments for the job flow's steps.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new java.util.ArrayList<String>();
        }
        return args;
    }
    
    /**
     * A list of arguments for the job flow's steps.
     *
     * @param args A list of arguments for the job flow's steps.
     */
    public void setArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;
    }
    
    /**
     * A list of arguments for the job flow's steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args A list of arguments for the job flow's steps.
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
     * A list of arguments for the job flow's steps.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args A list of arguments for the job flow's steps.
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Properties: " + properties + ", ");
        sb.append("Jar: " + jar + ", ");
        sb.append("MainClass: " + mainClass + ", ");
        sb.append("Args: " + args + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    