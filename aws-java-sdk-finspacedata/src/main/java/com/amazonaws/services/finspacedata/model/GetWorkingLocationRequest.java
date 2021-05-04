/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetWorkingLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkingLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the type of the working location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when working
     * with FinSpace Notebooks that run on SageMaker studio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and then use
     * the location with the changeset creation operation.
     * </p>
     * </li>
     * </ul>
     */
    private String locationType;

    /**
     * <p>
     * Specify the type of the working location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when working
     * with FinSpace Notebooks that run on SageMaker studio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and then use
     * the location with the changeset creation operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param locationType
     *        Specify the type of the working location.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when
     *        working with FinSpace Notebooks that run on SageMaker studio.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and
     *        then use the location with the changeset creation operation.
     *        </p>
     *        </li>
     * @see LocationType
     */

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * Specify the type of the working location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when working
     * with FinSpace Notebooks that run on SageMaker studio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and then use
     * the location with the changeset creation operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the type of the working location.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when
     *         working with FinSpace Notebooks that run on SageMaker studio.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and
     *         then use the location with the changeset creation operation.
     *         </p>
     *         </li>
     * @see LocationType
     */

    public String getLocationType() {
        return this.locationType;
    }

    /**
     * <p>
     * Specify the type of the working location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when working
     * with FinSpace Notebooks that run on SageMaker studio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and then use
     * the location with the changeset creation operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param locationType
     *        Specify the type of the working location.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when
     *        working with FinSpace Notebooks that run on SageMaker studio.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and
     *        then use the location with the changeset creation operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public GetWorkingLocationRequest withLocationType(String locationType) {
        setLocationType(locationType);
        return this;
    }

    /**
     * <p>
     * Specify the type of the working location.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when working
     * with FinSpace Notebooks that run on SageMaker studio.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and then use
     * the location with the changeset creation operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param locationType
     *        Specify the type of the working location.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAGEMAKER</code> - Use the Amazon S3 location as a temporary location to store data content when
     *        working with FinSpace Notebooks that run on SageMaker studio.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INGESTION</code> - Use the Amazon S3 location as a staging location to copy your data content and
     *        then use the location with the changeset creation operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationType
     */

    public GetWorkingLocationRequest withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
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
        if (getLocationType() != null)
            sb.append("LocationType: ").append(getLocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkingLocationRequest == false)
            return false;
        GetWorkingLocationRequest other = (GetWorkingLocationRequest) obj;
        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkingLocationRequest clone() {
        return (GetWorkingLocationRequest) super.clone();
    }

}
