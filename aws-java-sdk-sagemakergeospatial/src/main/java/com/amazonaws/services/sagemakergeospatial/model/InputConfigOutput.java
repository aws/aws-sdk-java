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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The InputConfig for an EarthObservationJob response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/InputConfigOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfigOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the previous Earth Observation job.
     * </p>
     */
    private String previousEarthObservationJobArn;
    /**
     * <p>
     * The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     * RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     * </p>
     */
    private RasterDataCollectionQueryOutput rasterDataCollectionQuery;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the previous Earth Observation job.
     * </p>
     * 
     * @param previousEarthObservationJobArn
     *        The Amazon Resource Name (ARN) of the previous Earth Observation job.
     */

    public void setPreviousEarthObservationJobArn(String previousEarthObservationJobArn) {
        this.previousEarthObservationJobArn = previousEarthObservationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the previous Earth Observation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the previous Earth Observation job.
     */

    public String getPreviousEarthObservationJobArn() {
        return this.previousEarthObservationJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the previous Earth Observation job.
     * </p>
     * 
     * @param previousEarthObservationJobArn
     *        The Amazon Resource Name (ARN) of the previous Earth Observation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfigOutput withPreviousEarthObservationJobArn(String previousEarthObservationJobArn) {
        setPreviousEarthObservationJobArn(previousEarthObservationJobArn);
        return this;
    }

    /**
     * <p>
     * The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     * RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     * </p>
     * 
     * @param rasterDataCollectionQuery
     *        The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     *        RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     */

    public void setRasterDataCollectionQuery(RasterDataCollectionQueryOutput rasterDataCollectionQuery) {
        this.rasterDataCollectionQuery = rasterDataCollectionQuery;
    }

    /**
     * <p>
     * The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     * RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     * </p>
     * 
     * @return The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     *         RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     */

    public RasterDataCollectionQueryOutput getRasterDataCollectionQuery() {
        return this.rasterDataCollectionQuery;
    }

    /**
     * <p>
     * The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     * RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     * </p>
     * 
     * @param rasterDataCollectionQuery
     *        The structure representing the RasterDataCollection Query consisting of the Area of Interest,
     *        RasterDataCollectionArn, RasterDataCollectionName, TimeRange, and Property Filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfigOutput withRasterDataCollectionQuery(RasterDataCollectionQueryOutput rasterDataCollectionQuery) {
        setRasterDataCollectionQuery(rasterDataCollectionQuery);
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
        if (getPreviousEarthObservationJobArn() != null)
            sb.append("PreviousEarthObservationJobArn: ").append(getPreviousEarthObservationJobArn()).append(",");
        if (getRasterDataCollectionQuery() != null)
            sb.append("RasterDataCollectionQuery: ").append(getRasterDataCollectionQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputConfigOutput == false)
            return false;
        InputConfigOutput other = (InputConfigOutput) obj;
        if (other.getPreviousEarthObservationJobArn() == null ^ this.getPreviousEarthObservationJobArn() == null)
            return false;
        if (other.getPreviousEarthObservationJobArn() != null
                && other.getPreviousEarthObservationJobArn().equals(this.getPreviousEarthObservationJobArn()) == false)
            return false;
        if (other.getRasterDataCollectionQuery() == null ^ this.getRasterDataCollectionQuery() == null)
            return false;
        if (other.getRasterDataCollectionQuery() != null && other.getRasterDataCollectionQuery().equals(this.getRasterDataCollectionQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPreviousEarthObservationJobArn() == null) ? 0 : getPreviousEarthObservationJobArn().hashCode());
        hashCode = prime * hashCode + ((getRasterDataCollectionQuery() == null) ? 0 : getRasterDataCollectionQuery().hashCode());
        return hashCode;
    }

    @Override
    public InputConfigOutput clone() {
        try {
            return (InputConfigOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.InputConfigOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
