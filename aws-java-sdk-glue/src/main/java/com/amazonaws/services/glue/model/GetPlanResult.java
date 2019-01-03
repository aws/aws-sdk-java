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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetPlan" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlanResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A Python script to perform the mapping.
     * </p>
     */
    private String pythonScript;
    /**
     * <p>
     * Scala code to perform the mapping.
     * </p>
     */
    private String scalaCode;

    /**
     * <p>
     * A Python script to perform the mapping.
     * </p>
     * 
     * @param pythonScript
     *        A Python script to perform the mapping.
     */

    public void setPythonScript(String pythonScript) {
        this.pythonScript = pythonScript;
    }

    /**
     * <p>
     * A Python script to perform the mapping.
     * </p>
     * 
     * @return A Python script to perform the mapping.
     */

    public String getPythonScript() {
        return this.pythonScript;
    }

    /**
     * <p>
     * A Python script to perform the mapping.
     * </p>
     * 
     * @param pythonScript
     *        A Python script to perform the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanResult withPythonScript(String pythonScript) {
        setPythonScript(pythonScript);
        return this;
    }

    /**
     * <p>
     * Scala code to perform the mapping.
     * </p>
     * 
     * @param scalaCode
     *        Scala code to perform the mapping.
     */

    public void setScalaCode(String scalaCode) {
        this.scalaCode = scalaCode;
    }

    /**
     * <p>
     * Scala code to perform the mapping.
     * </p>
     * 
     * @return Scala code to perform the mapping.
     */

    public String getScalaCode() {
        return this.scalaCode;
    }

    /**
     * <p>
     * Scala code to perform the mapping.
     * </p>
     * 
     * @param scalaCode
     *        Scala code to perform the mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlanResult withScalaCode(String scalaCode) {
        setScalaCode(scalaCode);
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
            sb.append("PythonScript: ").append(getPythonScript()).append(",");
        if (getScalaCode() != null)
            sb.append("ScalaCode: ").append(getScalaCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlanResult == false)
            return false;
        GetPlanResult other = (GetPlanResult) obj;
        if (other.getPythonScript() == null ^ this.getPythonScript() == null)
            return false;
        if (other.getPythonScript() != null && other.getPythonScript().equals(this.getPythonScript()) == false)
            return false;
        if (other.getScalaCode() == null ^ this.getScalaCode() == null)
            return false;
        if (other.getScalaCode() != null && other.getScalaCode().equals(this.getScalaCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPythonScript() == null) ? 0 : getPythonScript().hashCode());
        hashCode = prime * hashCode + ((getScalaCode() == null) ? 0 : getScalaCode().hashCode());
        return hashCode;
    }

    @Override
    public GetPlanResult clone() {
        try {
            return (GetPlanResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
