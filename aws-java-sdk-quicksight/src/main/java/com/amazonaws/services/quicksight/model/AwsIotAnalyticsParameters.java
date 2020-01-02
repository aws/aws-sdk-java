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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * AWS IoT Analytics parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AwsIotAnalyticsParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIotAnalyticsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dataset name.
     * </p>
     */
    private String dataSetName;

    /**
     * <p>
     * Dataset name.
     * </p>
     * 
     * @param dataSetName
     *        Dataset name.
     */

    public void setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
    }

    /**
     * <p>
     * Dataset name.
     * </p>
     * 
     * @return Dataset name.
     */

    public String getDataSetName() {
        return this.dataSetName;
    }

    /**
     * <p>
     * Dataset name.
     * </p>
     * 
     * @param dataSetName
     *        Dataset name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsIotAnalyticsParameters withDataSetName(String dataSetName) {
        setDataSetName(dataSetName);
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
        if (getDataSetName() != null)
            sb.append("DataSetName: ").append(getDataSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsIotAnalyticsParameters == false)
            return false;
        AwsIotAnalyticsParameters other = (AwsIotAnalyticsParameters) obj;
        if (other.getDataSetName() == null ^ this.getDataSetName() == null)
            return false;
        if (other.getDataSetName() != null && other.getDataSetName().equals(this.getDataSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetName() == null) ? 0 : getDataSetName().hashCode());
        return hashCode;
    }

    @Override
    public AwsIotAnalyticsParameters clone() {
        try {
            return (AwsIotAnalyticsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AwsIotAnalyticsParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
