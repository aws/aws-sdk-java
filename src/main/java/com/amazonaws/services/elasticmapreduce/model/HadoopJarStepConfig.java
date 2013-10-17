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
 * A job flow step consisting of a JAR file whose main function will be executed. The main function submits a job for Hadoop to execute and waits for the
 * job to finish or fail.
 * </p>
 */
public class HadoopJarStepConfig implements Serializable {

    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue> properties;

    /**
     * A path to a JAR file run during the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String jar;

    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a Main-Class in its manifest
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String mainClass;

    /**
     * A list of command line arguments passed to the JAR file's main
     * function when executed.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> args;

    /**
     * Default constructor for a new HadoopJarStepConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public HadoopJarStepConfig() {}
    
    /**
     * Constructs a new HadoopJarStepConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jar A path to a JAR file run during the step.
     */
    public HadoopJarStepConfig(String jar) {
        setJar(jar);
    }

    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     *
     * @return A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key value pairs to your main function.
     */
    public java.util.List<KeyValue> getProperties() {
        if (properties == null) {
              properties = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue>();
              properties.setAutoConstruct(true);
        }
        return properties;
    }
    
    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     *
     * @param properties A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key value pairs to your main function.
     */
    public void setProperties(java.util.Collection<KeyValue> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue> propertiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue>(properties.size());
        propertiesCopy.addAll(properties);
        this.properties = propertiesCopy;
    }
    
    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key value pairs to your main function.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopJarStepConfig withProperties(KeyValue... properties) {
        if (getProperties() == null) setProperties(new java.util.ArrayList<KeyValue>(properties.length));
        for (KeyValue value : properties) {
            getProperties().add(value);
        }
        return this;
    }
    
    /**
     * A list of Java properties that are set when the step runs. You can use
     * these properties to pass key value pairs to your main function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties A list of Java properties that are set when the step runs. You can use
     *         these properties to pass key value pairs to your main function.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopJarStepConfig withProperties(java.util.Collection<KeyValue> properties) {
        if (properties == null) {
            this.properties = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue> propertiesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeyValue>(properties.size());
            propertiesCopy.addAll(properties);
            this.properties = propertiesCopy;
        }

        return this;
    }

    /**
     * A path to a JAR file run during the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A path to a JAR file run during the step.
     */
    public String getJar() {
        return jar;
    }
    
    /**
     * A path to a JAR file run during the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10280<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
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
              args = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              args.setAutoConstruct(true);
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
        if (args == null) {
            this.args = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
        argsCopy.addAll(args);
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
        if (getArgs() == null) setArgs(new java.util.ArrayList<String>(args.length));
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
        if (args == null) {
            this.args = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> argsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(args.size());
            argsCopy.addAll(args);
            this.args = argsCopy;
        }

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
        if (getProperties() != null) sb.append("Properties: " + getProperties() + ",");
        if (getJar() != null) sb.append("Jar: " + getJar() + ",");
        if (getMainClass() != null) sb.append("MainClass: " + getMainClass() + ",");
        if (getArgs() != null) sb.append("Args: " + getArgs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode()); 
        hashCode = prime * hashCode + ((getJar() == null) ? 0 : getJar().hashCode()); 
        hashCode = prime * hashCode + ((getMainClass() == null) ? 0 : getMainClass().hashCode()); 
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HadoopJarStepConfig == false) return false;
        HadoopJarStepConfig other = (HadoopJarStepConfig)obj;
        
        if (other.getProperties() == null ^ this.getProperties() == null) return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false) return false; 
        if (other.getJar() == null ^ this.getJar() == null) return false;
        if (other.getJar() != null && other.getJar().equals(this.getJar()) == false) return false; 
        if (other.getMainClass() == null ^ this.getMainClass() == null) return false;
        if (other.getMainClass() != null && other.getMainClass().equals(this.getMainClass()) == false) return false; 
        if (other.getArgs() == null ^ this.getArgs() == null) return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false) return false; 
        return true;
    }
    
}
    