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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Input configuration information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/InputConfigInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputConfigInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location of the input data.&gt;
     * </p>
     */
    private EojDataSourceConfigInput dataSourceConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the previous Earth Observation job.
     * </p>
     */
    private String previousEarthObservationJobArn;
    /** <p/> */
    private RasterDataCollectionQueryInput rasterDataCollectionQuery;

    /**
     * <p>
     * The location of the input data.&gt;
     * </p>
     * 
     * @param dataSourceConfig
     *        The location of the input data.&gt;
     */

    public void setDataSourceConfig(EojDataSourceConfigInput dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    /**
     * <p>
     * The location of the input data.&gt;
     * </p>
     * 
     * @return The location of the input data.&gt;
     */

    public EojDataSourceConfigInput getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    /**
     * <p>
     * The location of the input data.&gt;
     * </p>
     * 
     * @param dataSourceConfig
     *        The location of the input data.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfigInput withDataSourceConfig(EojDataSourceConfigInput dataSourceConfig) {
        setDataSourceConfig(dataSourceConfig);
        return this;
    }

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

    public InputConfigInput withPreviousEarthObservationJobArn(String previousEarthObservationJobArn) {
        setPreviousEarthObservationJobArn(previousEarthObservationJobArn);
        return this;
    }

    /**
     * <p/>
     * 
     * @param rasterDataCollectionQuery
     */

    public void setRasterDataCollectionQuery(RasterDataCollectionQueryInput rasterDataCollectionQuery) {
        this.rasterDataCollectionQuery = rasterDataCollectionQuery;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public RasterDataCollectionQueryInput getRasterDataCollectionQuery() {
        return this.rasterDataCollectionQuery;
    }

    /**
     * <p/>
     * 
     * @param rasterDataCollectionQuery
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputConfigInput withRasterDataCollectionQuery(RasterDataCollectionQueryInput rasterDataCollectionQuery) {
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
        if (getDataSourceConfig() != null)
            sb.append("DataSourceConfig: ").append(getDataSourceConfig()).append(",");
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

        if (obj instanceof InputConfigInput == false)
            return false;
        InputConfigInput other = (InputConfigInput) obj;
        if (other.getDataSourceConfig() == null ^ this.getDataSourceConfig() == null)
            return false;
        if (other.getDataSourceConfig() != null && other.getDataSourceConfig().equals(this.getDataSourceConfig()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDataSourceConfig() == null) ? 0 : getDataSourceConfig().hashCode());
        hashCode = prime * hashCode + ((getPreviousEarthObservationJobArn() == null) ? 0 : getPreviousEarthObservationJobArn().hashCode());
        hashCode = prime * hashCode + ((getRasterDataCollectionQuery() == null) ? 0 : getRasterDataCollectionQuery().hashCode());
        return hashCode;
    }

    @Override
    public InputConfigInput clone() {
        try {
            return (InputConfigInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.InputConfigInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
