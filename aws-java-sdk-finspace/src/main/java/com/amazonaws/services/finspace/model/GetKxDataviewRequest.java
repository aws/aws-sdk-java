/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxDataview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxDataviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the database where you created the dataview.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     */
    private String dataviewName;

    /**
     * <p>
     * A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     * </p>
     * 
     * @return A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment, from where you want to retrieve the dataview details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDataviewRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the database where you created the dataview.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where you created the dataview.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database where you created the dataview.
     * </p>
     * 
     * @return The name of the database where you created the dataview.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database where you created the dataview.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where you created the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDataviewRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     * 
     * @param dataviewName
     *        A unique identifier for the dataview.
     */

    public void setDataviewName(String dataviewName) {
        this.dataviewName = dataviewName;
    }

    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     * 
     * @return A unique identifier for the dataview.
     */

    public String getDataviewName() {
        return this.dataviewName;
    }

    /**
     * <p>
     * A unique identifier for the dataview.
     * </p>
     * 
     * @param dataviewName
     *        A unique identifier for the dataview.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDataviewRequest withDataviewName(String dataviewName) {
        setDataviewName(dataviewName);
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDataviewName() != null)
            sb.append("DataviewName: ").append(getDataviewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKxDataviewRequest == false)
            return false;
        GetKxDataviewRequest other = (GetKxDataviewRequest) obj;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDataviewName() == null ^ this.getDataviewName() == null)
            return false;
        if (other.getDataviewName() != null && other.getDataviewName().equals(this.getDataviewName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDataviewName() == null) ? 0 : getDataviewName().hashCode());
        return hashCode;
    }

    @Override
    public GetKxDataviewRequest clone() {
        return (GetKxDataviewRequest) super.clone();
    }

}
