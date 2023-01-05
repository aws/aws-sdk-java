/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The <code>SessionCommand</code> that runs the job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SessionCommand" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionCommand implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     */
    private String pythonVersion;

    /**
     * <p>
     * Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     * </p>
     * 
     * @param name
     *        Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     * </p>
     * 
     * @return Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     * </p>
     * 
     * @param name
     *        Specifies the name of the SessionCommand. Can be 'glueetl' or 'gluestreaming'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionCommand withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * 
     * @param pythonVersion
     *        Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     */

    public void setPythonVersion(String pythonVersion) {
        this.pythonVersion = pythonVersion;
    }

    /**
     * <p>
     * Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * 
     * @return Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     */

    public String getPythonVersion() {
        return this.pythonVersion;
    }

    /**
     * <p>
     * Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     * </p>
     * 
     * @param pythonVersion
     *        Specifies the Python version. The Python version indicates the version supported for jobs of type Spark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionCommand withPythonVersion(String pythonVersion) {
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

        if (obj instanceof SessionCommand == false)
            return false;
        SessionCommand other = (SessionCommand) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        hashCode = prime * hashCode + ((getPythonVersion() == null) ? 0 : getPythonVersion().hashCode());
        return hashCode;
    }

    @Override
    public SessionCommand clone() {
        try {
            return (SessionCommand) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SessionCommandMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
