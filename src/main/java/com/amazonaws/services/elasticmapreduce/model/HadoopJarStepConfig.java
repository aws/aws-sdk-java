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
 * <p>
 * A job flow step consisting of a JAR file whose main function will be
 * executed. The main function submits a job for Hadoop to execute and
 * waits for the job to finish or fail.
 * </p>
 */
public class HadoopJarStepConfig {

    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key-value pairs to your main function.
     */
    private java.util.List<KeyValue> properties;

    /**
     * A path to a JAR file run during the step.
     */
    private String jar;

    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a Main-Class in its manifest
     * file.
     */
    private String mainClass;

    /**
     * A list of command line arguments passed to the JAR file's main
     * function when executed.
     */
    private java.util.List<String> args;

    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key-value pairs to your main function.
     *
     * @return A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key-value pairs to your main function.
     */
    public java.util.List<KeyValue> getProperties() {
        if (properties == null) {
            properties = new java.util.ArrayList<KeyValue>();
        }
        return properties;
    }
    
    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key-value pairs to your main function.
     *
     * @param properties A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key-value pairs to your main function.
     */
    public void setProperties(java.util.Collection<KeyValue> properties) {
        java.util.List<KeyValue> propertiesCopy = new java.util.ArrayList<KeyValue>();
        if (properties != null) {
            propertiesCopy.addAll(properties);
        }
        this.properties = propertiesCopy;
    }
    
    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key-value pairs to your main function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key-value pairs to your main function.
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
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key-value pairs to your main function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key-value pairs to your main function.
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
     * A path to a JAR file run during the step.
     *
     * @return A path to a JAR file run during the step.
     */
    public String getJar() {
        return jar;
    }
    
    /**
     * A path to a JAR file run during the step.
     *
     * @param jar A path to a JAR file run during the step.
     */
    public void setJar(String jar) {
        this.jar = jar;
    }
    
    /**
     * A path to a JAR file run during the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jar A path to a JAR file run during the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withJar(String jar) {
        this.jar = jar;
        return this;
    }
    
    
    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a Main-Class in its manifest
     * file.
     *
     * @return The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a Main-Class in its manifest
     *         file.
     */
    public String getMainClass() {
        return mainClass;
    }
    
    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a Main-Class in its manifest
     * file.
     *
     * @param mainClass The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a Main-Class in its manifest
     *         file.
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }
    
    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a Main-Class in its manifest
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mainClass The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a Main-Class in its manifest
     *         file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public HadoopJarStepConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    
    
    /**
     * A list of command line arguments passed to the JAR file's main
     * function when executed.
     *
     * @return A list of command line arguments passed to the JAR file's main
     *         function when executed.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new java.util.ArrayList<String>();
        }
        return args;
    }
    
    /**
     * A list of command line arguments passed to the JAR file's main
     * function when executed.
     *
     * @param args A list of command line arguments passed to the JAR file's main
     *         function when executed.
     */
    public void setArgs(java.util.Collection<String> args) {
        java.util.List<String> argsCopy = new java.util.ArrayList<String>();
        if (args != null) {
            argsCopy.addAll(args);
        }
        this.args = argsCopy;
    }
    
    /**
     * A list of command line arguments passed to the JAR file's main
     * function when executed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args A list of command line arguments passed to the JAR file's main
     *         function when executed.
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
     * A list of command line arguments passed to the JAR file's main
     * function when executed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args A list of command line arguments passed to the JAR file's main
     *         function when executed.
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
        
        sb.append("Properties: " + properties + ", ");
        sb.append("Jar: " + jar + ", ");
        sb.append("MainClass: " + mainClass + ", ");
        sb.append("Args: " + args + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    