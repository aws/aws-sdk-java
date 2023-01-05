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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configurations for the Hive job driver.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/Hive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hive implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query for the Hive job run.
     * </p>
     */
    private String query;
    /**
     * <p>
     * The query file for the Hive job run.
     * </p>
     */
    private String initQueryFile;
    /**
     * <p>
     * The parameters for the Hive job run.
     * </p>
     */
    private String parameters;

    /**
     * <p>
     * The query for the Hive job run.
     * </p>
     * 
     * @param query
     *        The query for the Hive job run.
     */

    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * <p>
     * The query for the Hive job run.
     * </p>
     * 
     * @return The query for the Hive job run.
     */

    public String getQuery() {
        return this.query;
    }

    /**
     * <p>
     * The query for the Hive job run.
     * </p>
     * 
     * @param query
     *        The query for the Hive job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hive withQuery(String query) {
        setQuery(query);
        return this;
    }

    /**
     * <p>
     * The query file for the Hive job run.
     * </p>
     * 
     * @param initQueryFile
     *        The query file for the Hive job run.
     */

    public void setInitQueryFile(String initQueryFile) {
        this.initQueryFile = initQueryFile;
    }

    /**
     * <p>
     * The query file for the Hive job run.
     * </p>
     * 
     * @return The query file for the Hive job run.
     */

    public String getInitQueryFile() {
        return this.initQueryFile;
    }

    /**
     * <p>
     * The query file for the Hive job run.
     * </p>
     * 
     * @param initQueryFile
     *        The query file for the Hive job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hive withInitQueryFile(String initQueryFile) {
        setInitQueryFile(initQueryFile);
        return this;
    }

    /**
     * <p>
     * The parameters for the Hive job run.
     * </p>
     * 
     * @param parameters
     *        The parameters for the Hive job run.
     */

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the Hive job run.
     * </p>
     * 
     * @return The parameters for the Hive job run.
     */

    public String getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * The parameters for the Hive job run.
     * </p>
     * 
     * @param parameters
     *        The parameters for the Hive job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hive withParameters(String parameters) {
        setParameters(parameters);
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
        if (getQuery() != null)
            sb.append("Query: ").append("***Sensitive Data Redacted***").append(",");
        if (getInitQueryFile() != null)
            sb.append("InitQueryFile: ").append("***Sensitive Data Redacted***").append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hive == false)
            return false;
        Hive other = (Hive) obj;
        if (other.getQuery() == null ^ this.getQuery() == null)
            return false;
        if (other.getQuery() != null && other.getQuery().equals(this.getQuery()) == false)
            return false;
        if (other.getInitQueryFile() == null ^ this.getInitQueryFile() == null)
            return false;
        if (other.getInitQueryFile() != null && other.getInitQueryFile().equals(this.getInitQueryFile()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuery() == null) ? 0 : getQuery().hashCode());
        hashCode = prime * hashCode + ((getInitQueryFile() == null) ? 0 : getInitQueryFile().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public Hive clone() {
        try {
            return (Hive) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.HiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
