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
 * A job flow step consisting of a JAR file whose main function will be executed. The main function submits a job for
 * Hadoop to execute and waits for the job to finish or fail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/HadoopJarStepConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HadoopJarStepConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValue> properties;
    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     */
    private String jar;
    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class
     * in its manifest file.
     * </p>
     */
    private String mainClass;
    /**
     * <p>
     * A list of command line arguments passed to the JAR file's main function when executed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> args;

    /**
     * Default constructor for HadoopJarStepConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public HadoopJarStepConfig() {
    }

    /**
     * Constructs a new HadoopJarStepConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jar
     *        A path to a JAR file run during the step.
     */
    public HadoopJarStepConfig(String jar) {
        setJar(jar);
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * 
     * @return A list of Java properties that are set when the step runs. You can use these properties to pass key value
     *         pairs to your main function.
     */

    public java.util.List<KeyValue> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalList<KeyValue>();
        }
        return properties;
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * 
     * @param properties
     *        A list of Java properties that are set when the step runs. You can use these properties to pass key value
     *        pairs to your main function.
     */

    public void setProperties(java.util.Collection<KeyValue> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new com.amazonaws.internal.SdkInternalList<KeyValue>(properties);
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        A list of Java properties that are set when the step runs. You can use these properties to pass key value
     *        pairs to your main function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopJarStepConfig withProperties(KeyValue... properties) {
        if (this.properties == null) {
            setProperties(new com.amazonaws.internal.SdkInternalList<KeyValue>(properties.length));
        }
        for (KeyValue ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs
     * to your main function.
     * </p>
     * 
     * @param properties
     *        A list of Java properties that are set when the step runs. You can use these properties to pass key value
     *        pairs to your main function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopJarStepConfig withProperties(java.util.Collection<KeyValue> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * 
     * @param jar
     *        A path to a JAR file run during the step.
     */

    public void setJar(String jar) {
        this.jar = jar;
    }

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * 
     * @return A path to a JAR file run during the step.
     */

    public String getJar() {
        return this.jar;
    }

    /**
     * <p>
     * A path to a JAR file run during the step.
     * </p>
     * 
     * @param jar
     *        A path to a JAR file run during the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopJarStepConfig withJar(String jar) {
        setJar(jar);
        return this;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class
     * in its manifest file.
     * </p>
     * 
     * @param mainClass
     *        The name of the main class in the specified Java file. If not specified, the JAR file should specify a
     *        Main-Class in its manifest file.
     */

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class
     * in its manifest file.
     * </p>
     * 
     * @return The name of the main class in the specified Java file. If not specified, the JAR file should specify a
     *         Main-Class in its manifest file.
     */

    public String getMainClass() {
        return this.mainClass;
    }

    /**
     * <p>
     * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class
     * in its manifest file.
     * </p>
     * 
     * @param mainClass
     *        The name of the main class in the specified Java file. If not specified, the JAR file should specify a
     *        Main-Class in its manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopJarStepConfig withMainClass(String mainClass) {
        setMainClass(mainClass);
        return this;
    }

    /**
     * <p>
     * A list of command line arguments passed to the JAR file's main function when executed.
     * </p>
     * 
     * @return A list of command line arguments passed to the JAR file's main function when executed.
     */

    public java.util.List<String> getArgs() {
        if (args == null) {
            args = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return args;
    }

    /**
     * <p>
     * A list of command line arguments passed to the JAR file's main function when executed.
     * </p>
     * 
     * @param args
     *        A list of command line arguments passed to the JAR file's main function when executed.
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
     * A list of command line arguments passed to the JAR file's main function when executed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArgs(java.util.Collection)} or {@link #withArgs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param args
     *        A list of command line arguments passed to the JAR file's main function when executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopJarStepConfig withArgs(String... args) {
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
     * A list of command line arguments passed to the JAR file's main function when executed.
     * </p>
     * 
     * @param args
     *        A list of command line arguments passed to the JAR file's main function when executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HadoopJarStepConfig withArgs(java.util.Collection<String> args) {
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
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getJar() != null)
            sb.append("Jar: ").append(getJar()).append(",");
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

        if (obj instanceof HadoopJarStepConfig == false)
            return false;
        HadoopJarStepConfig other = (HadoopJarStepConfig) obj;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getJar() == null ^ this.getJar() == null)
            return false;
        if (other.getJar() != null && other.getJar().equals(this.getJar()) == false)
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

        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getJar() == null) ? 0 : getJar().hashCode());
        hashCode = prime * hashCode + ((getMainClass() == null) ? 0 : getMainClass().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public HadoopJarStepConfig clone() {
        try {
            return (HadoopJarStepConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.HadoopJarStepConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
