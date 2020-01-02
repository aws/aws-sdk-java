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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The training data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/TrainingDataSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data location of the training data source.
     * </p>
     */
    private String dataLocation;
    /**
     * <p>
     * The data access role ARN for the training data source.
     * </p>
     */
    private String dataAccessRoleArn;

    /**
     * <p>
     * The data location of the training data source.
     * </p>
     * 
     * @param dataLocation
     *        The data location of the training data source.
     */

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    /**
     * <p>
     * The data location of the training data source.
     * </p>
     * 
     * @return The data location of the training data source.
     */

    public String getDataLocation() {
        return this.dataLocation;
    }

    /**
     * <p>
     * The data location of the training data source.
     * </p>
     * 
     * @param dataLocation
     *        The data location of the training data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataSource withDataLocation(String dataLocation) {
        setDataLocation(dataLocation);
        return this;
    }

    /**
     * <p>
     * The data access role ARN for the training data source.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The data access role ARN for the training data source.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The data access role ARN for the training data source.
     * </p>
     * 
     * @return The data access role ARN for the training data source.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The data access role ARN for the training data source.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The data access role ARN for the training data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataSource withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
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
        if (getDataLocation() != null)
            sb.append("DataLocation: ").append(getDataLocation()).append(",");
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingDataSource == false)
            return false;
        TrainingDataSource other = (TrainingDataSource) obj;
        if (other.getDataLocation() == null ^ this.getDataLocation() == null)
            return false;
        if (other.getDataLocation() != null && other.getDataLocation().equals(this.getDataLocation()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataLocation() == null) ? 0 : getDataLocation().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public TrainingDataSource clone() {
        try {
            return (TrainingDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.TrainingDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
