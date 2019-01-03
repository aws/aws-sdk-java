/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A cluster step consisting of a JAR file whose main function will be executed. The main function submits a job for
 * Hadoop to execute and waits for the job to finish or fail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/HadoopStepConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HadoopStepConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     */
    private String jar;
    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> properties;
    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class
     * in its manifest file.
     * </p>
     */
    private String mainClass;
    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main function for execution.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> args;

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     * 
     * @param jar
     *        The path to the JAR file that runs during the step.
     */

    public void setJar(String jar) {
        this.jar = jar;
    }

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     * 
     * @return The path to the JAR file that runs during the step.
     */

    public String getJar() {
        return this.jar;
    }

    /**
     * <p>
     * The path to the JAR file that runs during the step.
     * </p>
     * 
     * @param jar
     *        The path to the JAR file that runs during the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopStepConfig withJar(String jar) {
        setJar(jar);
        return this;
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * 
     * @return The list of Java properties that are set when the step runs. You can use these properties to pass key
     *         value pairs to your main function.
     */

    public java.util.Map<String, String> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return properties;
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * 
     * @param properties
     *        The list of Java properties that are set when the step runs. You can use these properties to pass key
     *        value pairs to your main function.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(properties);
    }

    /**
     * <p>
     * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * 
     * @param properties
     *        The list of Java properties that are set when the step runs. You can use these properties to pass key
     *        value pairs to your main function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopStepConfig withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    public HadoopStepConfig addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopStepConfig clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class
     * in its manifest file.
     * </p>
     * 
     * @param mainClass
     *        The name of the main class in the specified Java file. If not specified, the JAR file should specify a
     *        main class in its manifest file.
     */

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class
     * in its manifest file.
     * </p>
     * 
     * @return The name of the main class in the specified Java file. If not specified, the JAR file should specify a
     *         main class in its manifest file.
     */

    public String getMainClass() {
        return this.mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class
     * in its manifest file.
     * </p>
     * 
     * @param mainClass
     *        The name of the main class in the specified Java file. If not specified, the JAR file should specify a
     *        main class in its manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopStepConfig withMainClass(String mainClass) {
        setMainClass(mainClass);
        return this;
    }

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main function for execution.
     * </p>
     * 
     * @return The list of command line arguments to pass to the JAR file's main function for execution.
     */

    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return args;
    }

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main function for execution.
     * </p>
     * 
     * @param args
     *        The list of command line arguments to pass to the JAR file's main function for execution.
     */

    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new com.amazonaws.internal.SdkInternalList<String>(args);
    }

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main function for execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        The list of command line arguments to pass to the JAR file's main function for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopStepConfig withArgs(String... args) {
        if (this.args == null) {
            setArgs(new com.amazonaws.internal.SdkInternalList<String>(args.length));
        }
        for (String ele : args) {
            this.args.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of command line arguments to pass to the JAR file's main function for execution.
     * </p>
     * 
     * @param args
     *        The list of command line arguments to pass to the JAR file's main function for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopStepConfig withArgs(java.util.Collection<String> args) {
        setArgs(args);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJar() != null)
            sb.append("Jar: ").append(getJar()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getMainClass() != null)
            sb.append("MainClass: ").append(getMainClass()).append(",");
        if (getArgs() != null)
            sb.append("Args: ").append(getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HadoopStepConfig == false)
            return false;
        HadoopStepConfig other = (HadoopStepConfig) obj;
        if (other.getJar() == null ^ this.getJar() == null)
            return false;
        if (other.getJar() != null && other.getJar().equals(this.getJar()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getMainClass() == null ^ this.getMainClass() == null)
            return false;
        if (other.getMainClass() != null && other.getMainClass().equals(this.getMainClass()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
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
    public HadoopStepConfig clone() {
        try {
            return (HadoopStepConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.HadoopStepConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
