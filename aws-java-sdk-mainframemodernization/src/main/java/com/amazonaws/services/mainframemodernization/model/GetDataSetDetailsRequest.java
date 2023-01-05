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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/GetDataSetDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSetDetailsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the application that this data set is associated with.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String dataSetName;

    /**
     * <p>
     * The unique identifier of the application that this data set is associated with.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application that this data set is associated with.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application that this data set is associated with.
     * </p>
     * 
     * @return The unique identifier of the application that this data set is associated with.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application that this data set is associated with.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application that this data set is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param dataSetName
     *        The name of the data set.
     */

    public void setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getDataSetName() {
        return this.dataSetName;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param dataSetName
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSetDetailsRequest withDataSetName(String dataSetName) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
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

        if (obj instanceof GetDataSetDetailsRequest == false)
            return false;
        GetDataSetDetailsRequest other = (GetDataSetDetailsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getDataSetName() == null) ? 0 : getDataSetName().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSetDetailsRequest clone() {
        return (GetDataSetDetailsRequest) super.clone();
    }

}
