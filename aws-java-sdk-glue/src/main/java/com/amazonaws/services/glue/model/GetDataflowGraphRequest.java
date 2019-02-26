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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataflowGraph" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataflowGraphRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Python script to transform.
     * </p>
     */
    private String pythonScript;

    /**
     * <p>
     * The Python script to transform.
     * </p>
     * 
     * @param pythonScript
     *        The Python script to transform.
     */

    public void setPythonScript(String pythonScript) {
        this.pythonScript = pythonScript;
    }

    /**
     * <p>
     * The Python script to transform.
     * </p>
     * 
     * @return The Python script to transform.
     */

    public String getPythonScript() {
        return this.pythonScript;
    }

    /**
     * <p>
     * The Python script to transform.
     * </p>
     * 
     * @param pythonScript
     *        The Python script to transform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataflowGraphRequest withPythonScript(String pythonScript) {
        setPythonScript(pythonScript);
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
        if (getPythonScript() != null)
            sb.append("PythonScript: ").append(getPythonScript());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataflowGraphRequest == false)
            return false;
        GetDataflowGraphRequest other = (GetDataflowGraphRequest) obj;
        if (other.getPythonScript() == null ^ this.getPythonScript() == null)
            return false;
        if (other.getPythonScript() != null && other.getPythonScript().equals(this.getPythonScript()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPythonScript() == null) ? 0 : getPythonScript().hashCode());
        return hashCode;
    }

    @Override
    public GetDataflowGraphRequest clone() {
        return (GetDataflowGraphRequest) super.clone();
    }

}
