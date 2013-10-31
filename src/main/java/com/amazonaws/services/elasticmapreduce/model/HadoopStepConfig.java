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
 * A cluster step consisting of a JAR file whose main function will be executed. The main function submits a job for Hadoop to execute and waits for the
 * job to finish or fail.
 * </p>
 */
public class HadoopStepConfig implements Serializable {

    /**
     * The path to the JAR file that runs during the step.
     */
    private String jar;

    /**
     * The list of Java properties that are set when the step runs. You can
     * use these properties to pass key value pairs to your main function.
     */
    private java.util.Map<String,String> properties;

    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a main class in its manifest
     * file.
     */
    private String mainClass;

    /**
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> args;

    /**
     * The path to the JAR file that runs during the step.
     *
     * @return The path to the JAR file that runs during the step.
     */
    public String getJar() {
        return jar;
    }
    
    /**
     * The path to the JAR file that runs during the step.
     *
     * @param jar The path to the JAR file that runs during the step.
     */
    public void setJar(String jar) {
        this.jar = jar;
    }
    
    /**
     * The path to the JAR file that runs during the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jar The path to the JAR file that runs during the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopStepConfig withJar(String jar) {
        this.jar = jar;
        return this;
    }

    /**
     * The list of Java properties that are set when the step runs. You can
     * use these properties to pass key value pairs to your main function.
     *
     * @return The list of Java properties that are set when the step runs. You can
     *         use these properties to pass key value pairs to your main function.
     */
    public java.util.Map<String,String> getProperties() {
        
        if (properties == null) {
            properties = new java.util.HashMap<String,String>();
        }
        return properties;
    }
    
    /**
     * The list of Java properties that are set when the step runs. You can
     * use these properties to pass key value pairs to your main function.
     *
     * @param properties The list of Java properties that are set when the step runs. You can
     *         use these properties to pass key value pairs to your main function.
     */
    public void setProperties(java.util.Map<String,String> properties) {
        this.properties = properties;
    }
    
    /**
     * The list of Java properties that are set when the step runs. You can
     * use these properties to pass key value pairs to your main function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param properties The list of Java properties that are set when the step runs. You can
     *         use these properties to pass key value pairs to your main function.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopStepConfig withProperties(java.util.Map<String,String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * The list of Java properties that are set when the step runs. You can
     * use these properties to pass key value pairs to your main function.
     * <p>
     * The method adds a new key-value pair into Properties parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Properties.
     * @param value The corresponding value of the entry to be added into Properties.
     */
	public HadoopStepConfig addPropertiesEntry(String key, String value) {
		if (null == this.properties) {
			this.properties = new java.util.HashMap<String,String>();
		}
		if (this.properties.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.properties.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Properties.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public HadoopStepConfig clearPropertiesEntries() {
		this.properties = null;
		return this;
	}
	
    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a main class in its manifest
     * file.
     *
     * @return The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a main class in its manifest
     *         file.
     */
    public String getMainClass() {
        return mainClass;
    }
    
    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a main class in its manifest
     * file.
     *
     * @param mainClass The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a main class in its manifest
     *         file.
     */
    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }
    
    /**
     * The name of the main class in the specified Java file. If not
     * specified, the JAR file should specify a main class in its manifest
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mainClass The name of the main class in the specified Java file. If not
     *         specified, the JAR file should specify a main class in its manifest
     *         file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopStepConfig withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     *
     * @return The list of command line arguments to pass to the JAR file's main
     *         function for execution.
     */
    public java.util.List<String> getArgs() {
        if (args == null) {
              args = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              args.setAutoConstruct(true);
        }
        return args;
    }
    
    /**
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     *
     * @param args The list of command line arguments to pass to the JAR file's main
     *         function for execution.
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
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The list of command line arguments to pass to the JAR file's main
     *         function for execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopStepConfig withArgs(String... args) {
        if (getArgs() == null) setArgs(new java.util.ArrayList<String>(args.length));
        for (String value : args) {
            getArgs().add(value);
        }
        return this;
    }
    
    /**
     * The list of command line arguments to pass to the JAR file's main
     * function for execution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param args The list of command line arguments to pass to the JAR file's main
     *         function for execution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HadoopStepConfig withArgs(java.util.Collection<String> args) {
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
        if (getJar() != null) sb.append("Jar: " + getJar() + ",");
        if (getProperties() != null) sb.append("Properties: " + getProperties() + ",");
        if (getMainClass() != null) sb.append("MainClass: " + getMainClass() + ",");
        if (getArgs() != null) sb.append("Args: " + getArgs() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJar() == null) ? 0 : getJar().hashCode()); 
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode()); 
        hashCode = prime * hashCode + ((getMainClass() == null) ? 0 : getMainClass().hashCode()); 
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HadoopStepConfig == false) return false;
        HadoopStepConfig other = (HadoopStepConfig)obj;
        
        if (other.getJar() == null ^ this.getJar() == null) return false;
        if (other.getJar() != null && other.getJar().equals(this.getJar()) == false) return false; 
        if (other.getProperties() == null ^ this.getProperties() == null) return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false) return false; 
        if (other.getMainClass() == null ^ this.getMainClass() == null) return false;
        if (other.getMainClass() != null && other.getMainClass().equals(this.getMainClass()) == false) return false; 
        if (other.getArgs() == null ^ this.getArgs() == null) return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false) return false; 
        return true;
    }
    
}
    