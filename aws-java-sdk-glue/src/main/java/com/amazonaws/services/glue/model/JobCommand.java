/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies code executed when a job is run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/JobCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobCommand implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python shell
     * job, it must be <code>pythonshell</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     * </p>
     */
    private String scriptLocation;
    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * </p>
     */
    private String pythonVersion;

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python shell
     * job, it must be <code>pythonshell</code>.
     * </p>
     * 
     * @param name
     *        The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python
     *        shell job, it must be <code>pythonshell</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python shell
     * job, it must be <code>pythonshell</code>.
     * </p>
     * 
     * @return The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python
     *         shell job, it must be <code>pythonshell</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python shell
     * job, it must be <code>pythonshell</code>.
     * </p>
     * 
     * @param name
     *        The name of the job command. For an Apache Spark ETL job, this must be <code>glueetl</code>. For a Python
     *        shell job, it must be <code>pythonshell</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobCommand withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     * </p>
     * 
     * @param scriptLocation
     *        Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     */

    public void setScriptLocation(String scriptLocation) {
        this.scriptLocation = scriptLocation;
    }

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     * </p>
     * 
     * @return Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     */

    public String getScriptLocation() {
        return this.scriptLocation;
    }

    /**
     * <p>
     * Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     * </p>
     * 
     * @param scriptLocation
     *        Specifies the Amazon Simple Storage Service (Amazon S3) path to a script that executes a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobCommand withScriptLocation(String scriptLocation) {
        setScriptLocation(scriptLocation);
        return this;
    }

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * </p>
     * 
     * @param pythonVersion
     *        The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     */

    public void setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
    }

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * </p>
     * 
     * @return The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     */

    public String getPythonVersion() {
        return this.pythonVersion;
    }

    /**
     * <p>
     * The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * </p>
     * 
     * @param pythonVersion
     *        The Python version being used to execute a Python shell job. Allowed values are 2 or 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobCommand withPythonVersion(String pythonVersion) {
        setPythonVersion(pythonVersion);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getScriptLocation() != null)
            sb.append("ScriptLocation: ").append(getScriptLocation()).append(",");
        if (getPythonVersion() != null)
            sb.append("PythonVersion: ").append(getPythonVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobCommand == false)
            return false;
        JobCommand other = (JobCommand) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getScriptLocation() == null ^ this.getScriptLocation() == null)
            return false;
        if (other.getScriptLocation() != null && other.getScriptLocation().equals(this.getScriptLocation()) == false)
            return false;
        if (other.getPythonVersion() == null ^ this.getPythonVersion() == null)
            return false;
        if (other.getPythonVersion() != null && other.getPythonVersion().equals(this.getPythonVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getScriptLocation() == null) ? 0 : getScriptLocation().hashCode());
        hashCode = prime * hashCode + ((getPythonVersion() == null) ? 0 : getPythonVersion().hashCode());
        return hashCode;
    }

    @Override
    public JobCommand clone() {
        try {
            return (JobCommand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.JobCommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
